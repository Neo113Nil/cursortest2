package com.icefishinggame.icefishinggamemultigames;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ScrollView;
import android.widget.TextView;
import com.anythink.expressad.foundation.d.d;

/* loaded from: classes2.dex */
public final class v implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36942n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ MainActivity f36943u;

    public /* synthetic */ v(MainActivity mainActivity, int i) {
        this.f36942n = i;
        this.f36943u = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36942n) {
            case 0:
                MainActivity mainActivity = this.f36943u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity.getApplicationContext(), C5275R.anim.button_push));
                try {
                    mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + mainActivity.getPackageName())));
                } catch (ActivityNotFoundException unused) {
                    mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + mainActivity.getPackageName())));
                }
                mainActivity.f36855X0.c();
                break;
            case 1:
                MainActivity mainActivity2 = this.f36943u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity2.getApplicationContext(), C5275R.anim.button_push));
                mainActivity2.f36830L = new Intent(mainActivity2.getApplicationContext(), (Class<?>) PlaygamesActivity.class);
                mainActivity2.f36830L.putExtra(d.c.f18635e, "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiWkn20kBu3bWIoejHYz4sGjoyDvsZNePmBYt9zlR2h-Zt8autmBuhiOVqnzJ2q-GTziq4owdt0wt7o3MRxVAOw1IcYyLvcyH0GfvqH0BsdSJY7Gmh_BvwXLXs71rbb7uLct8WPlZqYLowF6A_Bbrn6lCWtIPTFDUd7bWNAeCz8mW46KRmRJVAg3V7-51oM/s320/Screenshot_14.png");
                mainActivity2.f36830L.putExtra(com.anythink.basead.exoplayer.k.o.f8446c, "Basket Ball");
                mainActivity2.f36830L.putExtra("url", "https://u.djsofficial.com/zcode/basket.php");
                mainActivity2.f36830L.putExtra("des", "In this sports skill game, you can see the trajectory of each shot. Aim for the center of the hoop.");
                MainActivity.e(mainActivity2, mainActivity2.f36830L);
                break;
            case 2:
                MainActivity mainActivity3 = this.f36943u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity3.getApplicationContext(), C5275R.anim.button_push));
                mainActivity3.f36830L = new Intent(mainActivity3.getApplicationContext(), (Class<?>) PlaygamesActivity.class);
                mainActivity3.f36830L.putExtra(d.c.f18635e, "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgz6u_keAbU1ARZoaZsnuVQ76eORUpwChcazd6vmvS6iLAMF1i-V8y7zWKyq3TcbwSw_qRrVzH80OREfZZ_5uBM5r4UR5x2F_9TpalbrhHrDh-POtQLd0O2qC8oIFMiKzW5UKPHwKd_kS1WzMIKMPG04e7Bj88IsQ3IWgu-4M-oZOgNti0xMR1yx6Fx51Cr/s320/Screenshot_6.png");
                mainActivity3.f36830L.putExtra(com.anythink.basead.exoplayer.k.o.f8446c, "Fruit Slash");
                mainActivity3.f36830L.putExtra("url", "https://u.djsofficial.com/zcode/fruit.php");
                mainActivity3.f36830L.putExtra("des", "Swipe the screen to chop fruits but don't hit the bombs! So unsheathe your sword and get ready to play the most fun fruit slice game online.");
                MainActivity.e(mainActivity3, mainActivity3.f36830L);
                break;
            case 3:
                MainActivity mainActivity4 = this.f36943u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity4.getApplicationContext(), C5275R.anim.button_push));
                mainActivity4.f36830L = new Intent(mainActivity4.getApplicationContext(), (Class<?>) PlaygamesActivity.class);
                mainActivity4.f36830L.putExtra(d.c.f18635e, "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhCCUkqT5_VqTwk1yuIAVcdHQczbUjpUg3yKmZTpN_s43aF0zK3Na6gzbG2iTgY0tYQ_NAiGspyhyd2PXs11V9s9ja9eUkAI6LGwHiyj3hxFz_-IKCfa2TCrl99YsFi0RUwnVgIJxsqZEfO1Iyaj0dx5QNqhRY5ZPvOKfsM--dpE8Td3hvA5axdznj-M2Ld/s320/Screenshot_7.png");
                mainActivity4.f36830L.putExtra(com.anythink.basead.exoplayer.k.o.f8446c, "Box Tower");
                mainActivity4.f36830L.putExtra("url", "https://u.djsofficial.com/zcode/box.php");
                mainActivity4.f36830L.putExtra("des", "Clear rows and columns before the numbers get to 0. Keep an eye on the progress bar to unlock special power ups!");
                MainActivity.e(mainActivity4, mainActivity4.f36830L);
                break;
            case 4:
                MainActivity mainActivity5 = this.f36943u;
                MainActivity mainActivity6 = mainActivity5.f36832M;
                String str = mainActivity5.f36858Z0;
                AlertDialog.Builder builder = new AlertDialog.Builder(mainActivity6);
                builder.setTitle("Introduction about Ice Fishing");
                ScrollView scrollView = new ScrollView(mainActivity6);
                TextView textView = new TextView(mainActivity6);
                textView.setText(str);
                textView.setPadding(40, 40, 40, 40);
                textView.setTextSize(14.0f);
                scrollView.addView(textView);
                builder.setView(scrollView);
                builder.setPositiveButton("OK", new t());
                builder.create().show();
                break;
            case 5:
                MainActivity mainActivity7 = this.f36943u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity7.getApplicationContext(), C5275R.anim.button_push));
                Intent intent = new Intent(mainActivity7.f36832M, (Class<?>) GzopActiongamesActivity.class);
                mainActivity7.f36830L = intent;
                MainActivity.e(mainActivity7, intent);
                mainActivity7.f36855X0.c();
                break;
            default:
                MainActivity mainActivity8 = this.f36943u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity8.getApplicationContext(), C5275R.anim.button_push));
                Intent intent2 = new Intent(mainActivity8.f36832M, (Class<?>) GzopAdventuregamesActivity.class);
                mainActivity8.f36830L = intent2;
                MainActivity.e(mainActivity8, intent2);
                mainActivity8.f36855X0.c();
                break;
        }
    }
}
