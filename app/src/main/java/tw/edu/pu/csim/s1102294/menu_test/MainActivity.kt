package tw.edu.pu.csim.s1102294.menu_test

import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnShowMenu = findViewById<Button>(R.id.btn_show_menu)
        val imageView = findViewById<ImageView>(R.id.imageView)

        btnShowMenu.setOnClickListener {
            val popup = PopupMenu(this@MainActivity, btnShowMenu)
            popup.menuInflater.inflate(R.menu.menu_pop, popup.menu)
            popup.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.lpig -> {
                        Toast.makeText(this@MainActivity, "你點了!!!~", Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.bpig -> {
                        Toast.makeText(this@MainActivity, "你點了...~", Toast.LENGTH_SHORT).show()
                        true
                    }
                    else -> false
                }
            }
            popup.show()
        }
        imageView.setOnClickListener {
            val popup = PopupMenu(this@MainActivity, btnShowMenu)
            popup.menuInflater.inflate(R.menu.menu_pop, popup.menu)
            popup.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.lpig -> {
                        Toast.makeText(this@MainActivity, "你點了!!!~", Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.bpig -> {
                        Toast.makeText(this@MainActivity, "你點了...~", Toast.LENGTH_SHORT).show()
                        true
                    }
                    else -> false
                }
            }
            popup.show()
        }
    }
}