package com.icefishing.icefishingbigwin;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import h.AbstractActivityC4551k;

/* loaded from: classes2.dex */
public class GenderActivity extends AbstractActivityC4551k {

    /* renamed from: A, reason: collision with root package name */
    public ImageView f36424A;

    /* renamed from: B, reason: collision with root package name */
    public ImageView f36425B;

    /* renamed from: n, reason: collision with root package name */
    public boolean f36426n = false;

    /* renamed from: u, reason: collision with root package name */
    public GenderActivity f36427u = this;

    /* renamed from: v, reason: collision with root package name */
    public CardView f36428v;

    /* renamed from: w, reason: collision with root package name */
    public CardView f36429w;

    /* renamed from: x, reason: collision with root package name */
    public CardView f36430x;

    /* renamed from: y, reason: collision with root package name */
    public View f36431y;

    /* renamed from: z, reason: collision with root package name */
    public View f36432z;

    public static void e(GenderActivity genderActivity, String str) {
        genderActivity.f36431y.setVisibility(8);
        genderActivity.f36432z.setVisibility(8);
        genderActivity.f36424A.setImageResource(C5275R.drawable.ic_unselelct);
        genderActivity.f36425B.setImageResource(C5275R.drawable.ic_unselelct);
        genderActivity.f36426n = true;
        char c9 = !str.equals("US") ? !str.equals("SPAIN") ? (char) 65535 : (char) 1 : (char) 0;
        if (c9 == 0) {
            genderActivity.f36431y.setVisibility(0);
            genderActivity.f36424A.setImageResource(C5275R.drawable.ic_selelct);
        } else {
            if (c9 != 1) {
                return;
            }
            genderActivity.f36432z.setVisibility(0);
            genderActivity.f36425B.setImageResource(C5275R.drawable.ic_selelct);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0480x, androidx.activity.p, D.AbstractActivityC0295n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5275R.layout.activity_gender);
        o4.m.i(this.f36427u, o4.m.f39626s, o4.m.f39618k, o4.m.f39599H, o4.m.f39602L, (ViewGroup) findViewById(C5275R.id.banner_container));
        o4.m.k(this.f36427u, o4.m.f39628u, o4.m.f39620m, o4.m.f39601K, (ViewGroup) findViewById(C5275R.id.native_ad_container));
        this.f36431y = findViewById(C5275R.id.v_us);
        this.f36432z = findViewById(C5275R.id.v_spain);
        this.f36427u = this;
        this.f36429w = (CardView) findViewById(C5275R.id.card_us);
        this.f36430x = (CardView) findViewById(C5275R.id.card_spain);
        this.f36428v = (CardView) findViewById(C5275R.id.accept);
        this.f36424A = (ImageView) findViewById(C5275R.id.iv_us_select);
        this.f36425B = (ImageView) findViewById(C5275R.id.iv_spain_select);
        this.f36429w.setOnClickListener(new ViewOnClickListenerC4402d(this, 0));
        this.f36430x.setOnClickListener(new ViewOnClickListenerC4402d(this, 1));
        this.f36428v.setOnClickListener(new ViewOnClickListenerC4402d(this, 2));
    }
}
