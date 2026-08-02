package com.icefishingapp.icefishing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class y extends G0.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f36947a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f36948b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainActivity f36949c;

    public y(MainActivity mainActivity, ArrayList arrayList) {
        this.f36949c = mainActivity;
        this.f36947a = mainActivity.getApplicationContext();
        this.f36948b = arrayList;
    }

    @Override // G0.a
    public final void a(ViewPager viewPager, Object obj) {
        viewPager.removeView((View) obj);
    }

    @Override // G0.a
    public final int b() {
        return this.f36948b.size();
    }

    @Override // G0.a
    public final View c(ViewPager viewPager, int i) {
        View inflate = LayoutInflater.from(this.f36947a).inflate(C5275R.layout.slider_cus, (ViewGroup) viewPager, false);
        ImageView imageView = (ImageView) inflate.findViewById(C5275R.id.imageview1);
        CardView cardView = (CardView) inflate.findViewById(C5275R.id.linear3);
        TextView textView = (TextView) inflate.findViewById(C5275R.id.title1);
        MainActivity mainActivity = this.f36949c;
        if (i == 0) {
            ((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/UCS62KJ8c/wall.png", com.bumptech.glide.c.c(mainActivity.getApplicationContext()))).E(imageView);
            textView.setText("Blocks Adventure Jungle Saga");
            cardView.setOnClickListener(new x(this, 0));
        }
        if (i == 1) {
            ((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/yVywAGBQ6/wall.png", com.bumptech.glide.c.c(mainActivity.getApplicationContext()))).E(imageView);
            textView.setText("Bubble Shooter Classic");
            cardView.setOnClickListener(new x(this, 1));
        }
        if (i == 2) {
            ((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/pGF1Q7l1s/wall.png", com.bumptech.glide.c.c(mainActivity.getApplicationContext()))).E(imageView);
            textView.setText("Mahjong At Home: Aloha Edition");
            cardView.setOnClickListener(new x(this, 2));
        }
        if (i == 3) {
            ((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/lzFg1zsV5/wall.png", com.bumptech.glide.c.c(mainActivity.getApplicationContext()))).E(imageView);
            textView.setText("Ellie Summer Spa Beauty Salon");
            cardView.setOnClickListener(new x(this, 3));
        }
        if (i == 4) {
            ((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/NzI2gCZFn/wall.png", com.bumptech.glide.c.c(mainActivity.getApplicationContext()))).E(imageView);
            textView.setText("Ellie Bachelorette Party");
            cardView.setOnClickListener(new x(this, 4));
        }
        if (i == 5) {
            ((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/B1fSpMkP51m/wall.png", com.bumptech.glide.c.c(mainActivity.getApplicationContext()))).E(imageView);
            textView.setText("Bottle Shoot");
            cardView.setOnClickListener(new x(this, 5));
        }
        viewPager.addView(inflate);
        return inflate;
    }

    @Override // G0.a
    public final boolean d(View view, Object obj) {
        return view == obj;
    }
}
