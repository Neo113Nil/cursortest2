package com.IceFishing.LiveIceFishing;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import h.AbstractActivityC4555k;

/* loaded from: classes.dex */
public class GenderActivity extends AbstractActivityC4555k {

    /* renamed from: A, reason: collision with root package name */
    public ImageView f5918A;

    /* renamed from: B, reason: collision with root package name */
    public ImageView f5919B;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5920n = false;

    /* renamed from: u, reason: collision with root package name */
    public GenderActivity f5921u = this;

    /* renamed from: v, reason: collision with root package name */
    public CardView f5922v;

    /* renamed from: w, reason: collision with root package name */
    public CardView f5923w;

    /* renamed from: x, reason: collision with root package name */
    public CardView f5924x;

    /* renamed from: y, reason: collision with root package name */
    public View f5925y;

    /* renamed from: z, reason: collision with root package name */
    public View f5926z;

    public static void e(GenderActivity genderActivity, String str) {
        genderActivity.f5925y.setVisibility(8);
        genderActivity.f5926z.setVisibility(8);
        genderActivity.f5918A.setImageResource(C5248R.drawable.ic_unselelct);
        genderActivity.f5919B.setImageResource(C5248R.drawable.ic_unselelct);
        genderActivity.f5920n = true;
        char c9 = !str.equals("US") ? !str.equals("SPAIN") ? (char) 65535 : (char) 1 : (char) 0;
        if (c9 == 0) {
            genderActivity.f5925y.setVisibility(0);
            genderActivity.f5918A.setImageResource(C5248R.drawable.ic_selelct);
        } else {
            if (c9 != 1) {
                return;
            }
            genderActivity.f5926z.setVisibility(0);
            genderActivity.f5919B.setImageResource(C5248R.drawable.ic_selelct);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0484x, androidx.activity.p, D.AbstractActivityC0283m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5248R.layout.activity_gender);
        Y0.p.i(this.f5921u, Y0.p.f3889s, Y0.p.f3881k, Y0.p.f3862H, Y0.p.f3865L, (ViewGroup) findViewById(C5248R.id.banner_container));
        Y0.p.k(this.f5921u, Y0.p.f3891u, Y0.p.f3883m, Y0.p.f3864K, (ViewGroup) findViewById(C5248R.id.native_ad_container));
        this.f5925y = findViewById(C5248R.id.v_us);
        this.f5926z = findViewById(C5248R.id.v_spain);
        this.f5921u = this;
        this.f5923w = (CardView) findViewById(C5248R.id.card_us);
        this.f5924x = (CardView) findViewById(C5248R.id.card_spain);
        this.f5922v = (CardView) findViewById(C5248R.id.accept);
        this.f5918A = (ImageView) findViewById(C5248R.id.iv_us_select);
        this.f5919B = (ImageView) findViewById(C5248R.id.iv_spain_select);
        this.f5923w.setOnClickListener(new ViewOnClickListenerC0560d(this, 0));
        this.f5924x.setOnClickListener(new ViewOnClickListenerC0560d(this, 1));
        this.f5922v.setOnClickListener(new ViewOnClickListenerC0560d(this, 2));
    }
}
