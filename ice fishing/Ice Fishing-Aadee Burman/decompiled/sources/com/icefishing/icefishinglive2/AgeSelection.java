package com.icefishing.icefishinglive2;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import h.AbstractActivityC4551k;
import o4.C4799l;

/* loaded from: classes2.dex */
public class AgeSelection extends AbstractActivityC4551k {

    /* renamed from: A, reason: collision with root package name */
    public View f36338A;

    /* renamed from: B, reason: collision with root package name */
    public View f36339B;

    /* renamed from: C, reason: collision with root package name */
    public View f36340C;

    /* renamed from: D, reason: collision with root package name */
    public AgeSelection f36341D;

    /* renamed from: E, reason: collision with root package name */
    public ImageView f36342E;

    /* renamed from: F, reason: collision with root package name */
    public ImageView f36343F;

    /* renamed from: G, reason: collision with root package name */
    public ImageView f36344G;

    /* renamed from: H, reason: collision with root package name */
    public ImageView f36345H;

    /* renamed from: n, reason: collision with root package name */
    public boolean f36346n = false;

    /* renamed from: u, reason: collision with root package name */
    public CardView f36347u;

    /* renamed from: v, reason: collision with root package name */
    public CardView f36348v;

    /* renamed from: w, reason: collision with root package name */
    public CardView f36349w;

    /* renamed from: x, reason: collision with root package name */
    public CardView f36350x;

    /* renamed from: y, reason: collision with root package name */
    public CardView f36351y;

    /* renamed from: z, reason: collision with root package name */
    public View f36352z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(AgeSelection ageSelection, String str) {
        char c9;
        char c10 = 65535;
        ageSelection.f36352z.setVisibility(8);
        ageSelection.f36338A.setVisibility(8);
        ageSelection.f36339B.setVisibility(8);
        ageSelection.f36340C.setVisibility(8);
        ageSelection.f36342E.setImageResource(C5275R.drawable.ic_unselelct);
        ageSelection.f36343F.setImageResource(C5275R.drawable.ic_unselelct);
        ageSelection.f36344G.setImageResource(C5275R.drawable.ic_unselelct);
        ageSelection.f36345H.setImageResource(C5275R.drawable.ic_unselelct);
        ageSelection.f36346n = true;
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
            ageSelection.f36352z.setVisibility(0);
            ageSelection.f36342E.setImageResource(C5275R.drawable.ic_selelct);
            return;
        }
        if (c10 == 1) {
            ageSelection.f36339B.setVisibility(0);
            ageSelection.f36344G.setImageResource(C5275R.drawable.ic_selelct);
        } else if (c10 == 3) {
            ageSelection.f36338A.setVisibility(0);
            ageSelection.f36343F.setImageResource(C5275R.drawable.ic_selelct);
        } else {
            if (c10 != 6) {
                return;
            }
            ageSelection.f36340C.setVisibility(0);
            ageSelection.f36345H.setImageResource(C5275R.drawable.ic_selelct);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0480x, androidx.activity.p, D.AbstractActivityC0295n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5275R.layout.activity_age_selection);
        this.f36352z = findViewById(C5275R.id.v_us);
        this.f36338A = findViewById(C5275R.id.v_spain);
        this.f36339B = findViewById(C5275R.id.v_india);
        this.f36340C = findViewById(C5275R.id.v_france);
        this.f36341D = this;
        this.f36347u = (CardView) findViewById(C5275R.id.card_us);
        this.f36348v = (CardView) findViewById(C5275R.id.card_spain);
        this.f36349w = (CardView) findViewById(C5275R.id.card_india);
        this.f36350x = (CardView) findViewById(C5275R.id.card_france);
        this.f36351y = (CardView) findViewById(C5275R.id.accept);
        this.f36342E = (ImageView) findViewById(C5275R.id.iv_us_select);
        this.f36343F = (ImageView) findViewById(C5275R.id.iv_spain_select);
        this.f36344G = (ImageView) findViewById(C5275R.id.iv_india_select);
        this.f36345H = (ImageView) findViewById(C5275R.id.iv_france_select);
        C4799l.i(this.f36341D, C4799l.f39623s, C4799l.f39615k, C4799l.f39596H, C4799l.f39599L, (ViewGroup) findViewById(C5275R.id.banner_container));
        C4799l.k(this.f36341D, C4799l.f39625u, C4799l.f39617m, C4799l.f39598K, (ViewGroup) findViewById(C5275R.id.native_ad_container));
        this.f36347u.setOnClickListener(new ViewOnClickListenerC4399a(this, 0));
        this.f36348v.setOnClickListener(new ViewOnClickListenerC4399a(this, 1));
        this.f36349w.setOnClickListener(new ViewOnClickListenerC4399a(this, 2));
        this.f36350x.setOnClickListener(new ViewOnClickListenerC4399a(this, 3));
        this.f36351y.setOnClickListener(new ViewOnClickListenerC4399a(this, 4));
    }
}
