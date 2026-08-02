package com.IceFishing.LiveIceFishing;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import h.AbstractActivityC4555k;

/* loaded from: classes.dex */
public class AgeSelection extends AbstractActivityC4555k {

    /* renamed from: A, reason: collision with root package name */
    public View f5831A;

    /* renamed from: B, reason: collision with root package name */
    public View f5832B;

    /* renamed from: C, reason: collision with root package name */
    public View f5833C;

    /* renamed from: D, reason: collision with root package name */
    public AgeSelection f5834D;

    /* renamed from: E, reason: collision with root package name */
    public ImageView f5835E;

    /* renamed from: F, reason: collision with root package name */
    public ImageView f5836F;

    /* renamed from: G, reason: collision with root package name */
    public ImageView f5837G;

    /* renamed from: H, reason: collision with root package name */
    public ImageView f5838H;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5839n = false;

    /* renamed from: u, reason: collision with root package name */
    public CardView f5840u;

    /* renamed from: v, reason: collision with root package name */
    public CardView f5841v;

    /* renamed from: w, reason: collision with root package name */
    public CardView f5842w;

    /* renamed from: x, reason: collision with root package name */
    public CardView f5843x;

    /* renamed from: y, reason: collision with root package name */
    public CardView f5844y;

    /* renamed from: z, reason: collision with root package name */
    public View f5845z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(AgeSelection ageSelection, String str) {
        char c9;
        char c10 = 65535;
        ageSelection.f5845z.setVisibility(8);
        ageSelection.f5831A.setVisibility(8);
        ageSelection.f5832B.setVisibility(8);
        ageSelection.f5833C.setVisibility(8);
        ageSelection.f5835E.setImageResource(C5248R.drawable.ic_unselelct);
        ageSelection.f5836F.setImageResource(C5248R.drawable.ic_unselelct);
        ageSelection.f5837G.setImageResource(C5248R.drawable.ic_unselelct);
        ageSelection.f5838H.setImageResource(C5248R.drawable.ic_unselelct);
        ageSelection.f5839n = true;
        switch (str.hashCode()) {
            case 2718:
                if (str.equals("US")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 69808407:
                if (str.equals("INDIA")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 79100329:
                if (str.equals("SPAIN")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 2081782811:
                if (str.equals("FRANCE")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
                c10 = 0;
                break;
            case 1:
                c10 = 1;
                break;
            case 2:
                c10 = 3;
                break;
            case 3:
                c10 = 6;
                break;
        }
        if (c10 == 0) {
            ageSelection.f5845z.setVisibility(0);
            ageSelection.f5835E.setImageResource(C5248R.drawable.ic_selelct);
            return;
        }
        if (c10 == 1) {
            ageSelection.f5832B.setVisibility(0);
            ageSelection.f5837G.setImageResource(C5248R.drawable.ic_selelct);
        } else if (c10 == 3) {
            ageSelection.f5831A.setVisibility(0);
            ageSelection.f5836F.setImageResource(C5248R.drawable.ic_selelct);
        } else {
            if (c10 != 6) {
                return;
            }
            ageSelection.f5833C.setVisibility(0);
            ageSelection.f5838H.setImageResource(C5248R.drawable.ic_selelct);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0484x, androidx.activity.p, D.AbstractActivityC0283m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5248R.layout.activity_age_selection);
        this.f5845z = findViewById(C5248R.id.v_us);
        this.f5831A = findViewById(C5248R.id.v_spain);
        this.f5832B = findViewById(C5248R.id.v_india);
        this.f5833C = findViewById(C5248R.id.v_france);
        this.f5834D = this;
        this.f5840u = (CardView) findViewById(C5248R.id.card_us);
        this.f5841v = (CardView) findViewById(C5248R.id.card_spain);
        this.f5842w = (CardView) findViewById(C5248R.id.card_india);
        this.f5843x = (CardView) findViewById(C5248R.id.card_france);
        this.f5844y = (CardView) findViewById(C5248R.id.accept);
        this.f5835E = (ImageView) findViewById(C5248R.id.iv_us_select);
        this.f5836F = (ImageView) findViewById(C5248R.id.iv_spain_select);
        this.f5837G = (ImageView) findViewById(C5248R.id.iv_india_select);
        this.f5838H = (ImageView) findViewById(C5248R.id.iv_france_select);
        Y0.p.i(this.f5834D, Y0.p.f3889s, Y0.p.f3881k, Y0.p.f3862H, Y0.p.f3865L, (ViewGroup) findViewById(C5248R.id.banner_container));
        Y0.p.k(this.f5834D, Y0.p.f3891u, Y0.p.f3883m, Y0.p.f3864K, (ViewGroup) findViewById(C5248R.id.native_ad_container));
        this.f5840u.setOnClickListener(new ViewOnClickListenerC0557a(this, 0));
        this.f5841v.setOnClickListener(new ViewOnClickListenerC0557a(this, 1));
        this.f5842w.setOnClickListener(new ViewOnClickListenerC0557a(this, 2));
        this.f5843x.setOnClickListener(new ViewOnClickListenerC0557a(this, 3));
        this.f5844y.setOnClickListener(new ViewOnClickListenerC0557a(this, 4));
    }
}
