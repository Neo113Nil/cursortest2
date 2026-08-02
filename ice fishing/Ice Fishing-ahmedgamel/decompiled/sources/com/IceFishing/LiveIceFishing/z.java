package com.IceFishing.LiveIceFishing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class z extends G0.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6438a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6439b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainActivity f6440c;

    public z(MainActivity mainActivity, ArrayList arrayList) {
        this.f6440c = mainActivity;
        this.f6438a = mainActivity.getApplicationContext();
        this.f6439b = arrayList;
    }

    @Override // G0.a
    public final void a(ViewPager viewPager, Object obj) {
        viewPager.removeView((View) obj);
    }

    @Override // G0.a
    public final int b() {
        return this.f6439b.size();
    }

    @Override // G0.a
    public final View c(ViewPager viewPager, int i) {
        View inflate = LayoutInflater.from(this.f6438a).inflate(C5248R.layout.slider_cus, (ViewGroup) viewPager, false);
        ImageView imageView = (ImageView) inflate.findViewById(C5248R.id.imageview1);
        CardView cardView = (CardView) inflate.findViewById(C5248R.id.linear3);
        TextView textView = (TextView) inflate.findViewById(C5248R.id.title1);
        MainActivity mainActivity = this.f6440c;
        if (i == 0) {
            ((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/UCS62KJ8c/wall.png", com.bumptech.glide.c.c(mainActivity.getApplicationContext()))).E(imageView);
            textView.setText("Blocks Adventure Jungle Saga");
            cardView.setOnClickListener(new y(this, 0));
        }
        if (i == 1) {
            ((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/yVywAGBQ6/wall.png", com.bumptech.glide.c.c(mainActivity.getApplicationContext()))).E(imageView);
            textView.setText("Bubble Shooter Classic");
            cardView.setOnClickListener(new y(this, 1));
        }
        if (i == 2) {
            ((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/pGF1Q7l1s/wall.png", com.bumptech.glide.c.c(mainActivity.getApplicationContext()))).E(imageView);
            textView.setText("Mahjong At Home: Aloha Edition");
            cardView.setOnClickListener(new y(this, 2));
        }
        if (i == 3) {
            ((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/lzFg1zsV5/wall.png", com.bumptech.glide.c.c(mainActivity.getApplicationContext()))).E(imageView);
            textView.setText("Ellie Summer Spa Beauty Salon");
            cardView.setOnClickListener(new y(this, 3));
        }
        if (i == 4) {
            ((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/NzI2gCZFn/wall.png", com.bumptech.glide.c.c(mainActivity.getApplicationContext()))).E(imageView);
            textView.setText("Ellie Bachelorette Party");
            cardView.setOnClickListener(new y(this, 4));
        }
        if (i == 5) {
            ((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/B1fSpMkP51m/wall.png", com.bumptech.glide.c.c(mainActivity.getApplicationContext()))).E(imageView);
            textView.setText("Bottle Shoot");
            cardView.setOnClickListener(new y(this, 5));
        }
        viewPager.addView(inflate);
        return inflate;
    }

    @Override // G0.a
    public final boolean d(View view, Object obj) {
        return view == obj;
    }
}
