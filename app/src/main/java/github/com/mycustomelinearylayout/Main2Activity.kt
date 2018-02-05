package github.com.mycustomelinearylayout

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import github.com.mycustomelinearylayout.linear.LinearLayoutDemoActivity
import github.com.mycustomelinearylayout.linear.MyLinearLayoutDemoActivity

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        findViewById(R.id.sys).setOnClickListener { startActivity(Intent(applicationContext, LinearLayoutDemoActivity::class.java)) }
        findViewById(R.id.my).setOnClickListener {
            startActivity(Intent(applicationContext, MyLinearLayoutDemoActivity::class.java))
        }
    }
}
