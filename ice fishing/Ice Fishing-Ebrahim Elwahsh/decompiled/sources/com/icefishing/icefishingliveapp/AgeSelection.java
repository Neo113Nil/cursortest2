package com.icefishing.icefishingliveapp;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import h.AbstractActivityC4553l;

/* loaded from: classes2.dex */
public class AgeSelection extends AbstractActivityC4553l {

    /* renamed from: A, reason: collision with root package name */
    public View f36500A;

    /* renamed from: B, reason: collision with root package name */
    public View f36501B;

    /* renamed from: C, reason: collision with root package name */
    public View f36502C;

    /* renamed from: D, reason: collision with root package name */
    public AgeSelection f36503D;

    /* renamed from: E, reason: collision with root package name */
    public ImageView f36504E;

    /* renamed from: F, reason: collision with root package name */
    public ImageView f36505F;

    /* renamed from: G, reason: collision with root package name */
    public ImageView f36506G;

    /* renamed from: H, reason: collision with root package name */
    public ImageView f36507H;

    /* renamed from: n, reason: collision with root package name */
    public boolean f36508n = false;

    /* renamed from: u, reason: collision with root package name */
    public CardView f36509u;

    /* renamed from: v, reason: collision with root package name */
    public CardView f36510v;

    /* renamed from: w, reason: collision with root package name */
    public CardView f36511w;

    /* renamed from: x, reason: collision with root package name */
    public CardView f36512x;

    /* renamed from: y, reason: collision with root package name */
    public CardView f36513y;

    /* renamed from: z, reason: collision with root package name */
    public View f36514z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(AgeSelection ageSelection, String str) {
        char c4;
        char c9 = 65535;
        ageSelection.f36514z.setVisibility(8);
        ageSelection.f36500A.setVisibility(8);
        ageSelection.f36501B.setVisibility(8);
        ageSelection.f36502C.setVisibility(8);
        ageSelection.f36504E.setImageResource(C5284R.drawable.ic_unselelct);
        ageSelection.f36505F.setImageResource(C5284R.drawable.ic_unselelct);
        ageSelection.f36506G.setImageResource(C5284R.drawable.ic_unselelct);
        ageSelection.f36507H.setImageResource(C5284R.drawable.ic_unselelct);
        ageSelection.f36508n = true;
        switch (str.hashCode()) {
            case 2718:
                if (str.equals("US")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 69808407:
                if (str.equals("INDIA")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 79100329:
                if (str.equals("SPAIN")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 2081782811:
                if (str.equals("FRANCE")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
                c9 = 0;
                break;
            case 1:
                c9 = 1;
                break;
            case 2:
                c9 = 3;
                break;
            case 3:
                c9 = 6;
                break;
        }
        if (c9 == 0) {
            ageSelection.f36514z.setVisibility(0);
            ageSelection.f36504E.setImageResource(C5284R.drawable.ic_selelct);
            return;
        }
        if (c9 == 1) {
            ageSelection.f36501B.setVisibility(0);
            ageSelection.f36506G.setImageResource(C5284R.drawable.ic_selelct);
        } else if (c9 == 3) {
            ageSelection.f36500A.setVisibility(0);
            ageSelection.f36505F.setImageResource(C5284R.drawable.ic_selelct);
        } else {
            if (c9 != 6) {
                return;
            }
            ageSelection.f36502C.setVisibility(0);
            ageSelection.f36507H.setImageResource(C5284R.drawable.ic_selelct);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0490x, androidx.activity.p, D.AbstractActivityC0294n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5284R.layout.activity_age_selection);
        this.f36514z = findViewById(C5284R.id.v_us);
        this.f36500A = findViewById(C5284R.id.v_spain);
        this.f36501B = findViewById(C5284R.id.v_india);
        this.f36502C = findViewById(C5284R.id.v_france);
        this.f36503D = this;
        this.f36509u = (CardView) findViewById(C5284R.id.card_us);
        this.f36510v = (CardView) findViewById(C5284R.id.card_spain);
        this.f36511w = (CardView) findViewById(C5284R.id.card_india);
        this.f36512x = (CardView) findViewById(C5284R.id.card_france);
        this.f36513y = (CardView) findViewById(C5284R.id.accept);
        this.f36504E = (ImageView) findViewById(C5284R.id.iv_us_select);
        this.f36505F = (ImageView) findViewById(C5284R.id.iv_spain_select);
        this.f36506G = (ImageView) findViewById(C5284R.id.iv_india_select);
        this.f36507H = (ImageView) findViewById(C5284R.id.iv_france_select);
        k4.m.i(this.f36503D, k4.m.f38802s, k4.m.f38794k, k4.m.f38775H, k4.m.f38778L, (ViewGroup) findViewById(C5284R.id.banner_container));
        k4.m.k(this.f36503D, k4.m.f38804u, k4.m.f38796m, k4.m.f38777K, (ViewGroup) findViewById(C5284R.id.native_ad_container));
        this.f36509u.setOnClickListener(new ViewOnClickListenerC4412a(this, 0));
        this.f36510v.setOnClickListener(new ViewOnClickListenerC4412a(this, 1));
        this.f36511w.setOnClickListener(new ViewOnClickListenerC4412a(this, 2));
        this.f36512x.setOnClickListener(new ViewOnClickListenerC4412a(this, 3));
        this.f36513y.setOnClickListener(new ViewOnClickListenerC4412a(this, 4));
    }
}
