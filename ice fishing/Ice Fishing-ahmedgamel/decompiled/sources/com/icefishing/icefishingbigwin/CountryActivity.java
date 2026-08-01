package com.icefishing.icefishingbigwin;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import h.AbstractActivityC4551k;

/* loaded from: classes2.dex */
public class CountryActivity extends AbstractActivityC4551k {

    /* renamed from: A, reason: collision with root package name */
    public CardView f36355A;

    /* renamed from: B, reason: collision with root package name */
    public CardView f36356B;

    /* renamed from: C, reason: collision with root package name */
    public CardView f36357C;

    /* renamed from: D, reason: collision with root package name */
    public View f36358D;

    /* renamed from: E, reason: collision with root package name */
    public View f36359E;

    /* renamed from: F, reason: collision with root package name */
    public View f36360F;

    /* renamed from: G, reason: collision with root package name */
    public View f36361G;

    /* renamed from: H, reason: collision with root package name */
    public View f36362H;

    /* renamed from: I, reason: collision with root package name */
    public View f36363I;
    public View J;

    /* renamed from: K, reason: collision with root package name */
    public View f36364K;

    /* renamed from: L, reason: collision with root package name */
    public CountryActivity f36365L;

    /* renamed from: M, reason: collision with root package name */
    public ImageView f36366M;

    /* renamed from: N, reason: collision with root package name */
    public ImageView f36367N;

    /* renamed from: O, reason: collision with root package name */
    public ImageView f36368O;

    /* renamed from: P, reason: collision with root package name */
    public ImageView f36369P;

    /* renamed from: Q, reason: collision with root package name */
    public ImageView f36370Q;

    /* renamed from: R, reason: collision with root package name */
    public ImageView f36371R;

    /* renamed from: S, reason: collision with root package name */
    public ImageView f36372S;

    /* renamed from: T, reason: collision with root package name */
    public ImageView f36373T;

    /* renamed from: n, reason: collision with root package name */
    public boolean f36374n = false;

    /* renamed from: u, reason: collision with root package name */
    public CardView f36375u;

    /* renamed from: v, reason: collision with root package name */
    public CardView f36376v;

    /* renamed from: w, reason: collision with root package name */
    public CardView f36377w;

    /* renamed from: x, reason: collision with root package name */
    public CardView f36378x;

    /* renamed from: y, reason: collision with root package name */
    public CardView f36379y;

    /* renamed from: z, reason: collision with root package name */
    public CardView f36380z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(CountryActivity countryActivity, String str) {
        boolean z3;
        char c9 = 7;
        countryActivity.f36358D.setVisibility(8);
        countryActivity.f36359E.setVisibility(8);
        countryActivity.f36360F.setVisibility(8);
        countryActivity.f36361G.setVisibility(8);
        countryActivity.f36362H.setVisibility(8);
        countryActivity.f36363I.setVisibility(8);
        countryActivity.J.setVisibility(8);
        countryActivity.f36364K.setVisibility(8);
        countryActivity.f36366M.setImageResource(C5275R.drawable.ic_unselelct);
        countryActivity.f36367N.setImageResource(C5275R.drawable.ic_unselelct);
        countryActivity.f36368O.setImageResource(C5275R.drawable.ic_unselelct);
        countryActivity.f36369P.setImageResource(C5275R.drawable.ic_unselelct);
        countryActivity.f36370Q.setImageResource(C5275R.drawable.ic_unselelct);
        countryActivity.f36371R.setImageResource(C5275R.drawable.ic_unselelct);
        countryActivity.f36372S.setImageResource(C5275R.drawable.ic_unselelct);
        countryActivity.f36373T.setImageResource(C5275R.drawable.ic_unselelct);
        countryActivity.f36374n = true;
        switch (str.hashCode()) {
            case 2718:
                if (str.equals("US")) {
                    z3 = false;
                    break;
                }
                z3 = -1;
                break;
            case 69808407:
                if (str.equals("INDIA")) {
                    z3 = true;
                    break;
                }
                z3 = -1;
                break;
            case 69984387:
                if (str.equals("ITALY")) {
                    z3 = 2;
                    break;
                }
                z3 = -1;
                break;
            case 75532016:
                if (str.equals("OTHER")) {
                    z3 = 3;
                    break;
                }
                z3 = -1;
                break;
            case 79100329:
                if (str.equals("SPAIN")) {
                    z3 = 4;
                    break;
                }
                z3 = -1;
                break;
            case 641750931:
                if (str.equals("GERMANY")) {
                    z3 = 5;
                    break;
                }
                z3 = -1;
                break;
            case 1938625706:
                if (str.equals("ARABIA")) {
                    z3 = 6;
                    break;
                }
                z3 = -1;
                break;
            case 2081782811:
                if (str.equals("FRANCE")) {
                    z3 = 7;
                    break;
                }
                z3 = -1;
                break;
            default:
                z3 = -1;
                break;
        }
        switch (z3) {
            case false:
                c9 = 0;
                break;
            case true:
                c9 = 1;
                break;
            case true:
                c9 = 2;
                break;
            case true:
                break;
            case true:
                c9 = 3;
                break;
            case true:
                c9 = 4;
                break;
            case true:
                c9 = 5;
                break;
            case true:
                c9 = 6;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
                countryActivity.f36358D.setVisibility(0);
                countryActivity.f36366M.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case 1:
                countryActivity.f36360F.setVisibility(0);
                countryActivity.f36368O.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case 2:
                countryActivity.f36363I.setVisibility(0);
                countryActivity.f36371R.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case 3:
                countryActivity.f36359E.setVisibility(0);
                countryActivity.f36367N.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case 4:
                countryActivity.f36362H.setVisibility(0);
                countryActivity.f36370Q.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case 5:
                countryActivity.J.setVisibility(0);
                countryActivity.f36372S.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case 6:
                countryActivity.f36361G.setVisibility(0);
                countryActivity.f36369P.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case 7:
                countryActivity.f36364K.setVisibility(0);
                countryActivity.f36373T.setImageResource(C5275R.drawable.ic_selelct);
                break;
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0480x, androidx.activity.p, D.AbstractActivityC0295n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5275R.layout.activity_country);
        this.f36358D = findViewById(C5275R.id.v_us);
        this.f36359E = findViewById(C5275R.id.v_spain);
        this.f36360F = findViewById(C5275R.id.v_india);
        this.f36361G = findViewById(C5275R.id.v_france);
        this.f36362H = findViewById(C5275R.id.v_germany);
        this.f36363I = findViewById(C5275R.id.v_italy);
        this.J = findViewById(C5275R.id.v_arabia);
        this.f36364K = findViewById(C5275R.id.v_other);
        this.f36365L = this;
        this.f36375u = (CardView) findViewById(C5275R.id.card_us);
        this.f36376v = (CardView) findViewById(C5275R.id.card_spain);
        this.f36377w = (CardView) findViewById(C5275R.id.card_india);
        this.f36378x = (CardView) findViewById(C5275R.id.card_france);
        this.f36379y = (CardView) findViewById(C5275R.id.card_germany);
        this.f36380z = (CardView) findViewById(C5275R.id.card_italy);
        this.f36355A = (CardView) findViewById(C5275R.id.card_arabia);
        this.f36357C = (CardView) findViewById(C5275R.id.card_other);
        this.f36356B = (CardView) findViewById(C5275R.id.accept);
        this.f36366M = (ImageView) findViewById(C5275R.id.iv_us_select);
        this.f36367N = (ImageView) findViewById(C5275R.id.iv_spain_select);
        this.f36368O = (ImageView) findViewById(C5275R.id.iv_india_select);
        this.f36369P = (ImageView) findViewById(C5275R.id.iv_france_select);
        this.f36370Q = (ImageView) findViewById(C5275R.id.iv_germany_select);
        this.f36371R = (ImageView) findViewById(C5275R.id.iv_italy_select);
        this.f36372S = (ImageView) findViewById(C5275R.id.iv_arabia_select);
        this.f36373T = (ImageView) findViewById(C5275R.id.iv_other_select);
        o4.m.i(this.f36365L, o4.m.f39626s, o4.m.f39618k, o4.m.f39599H, o4.m.f39602L, (ViewGroup) findViewById(C5275R.id.banner_container));
        o4.m.k(this.f36365L, o4.m.f39628u, o4.m.f39620m, o4.m.f39601K, (ViewGroup) findViewById(C5275R.id.native_ad_container));
        this.f36375u.setOnClickListener(new ViewOnClickListenerC4400b(this, 0));
        this.f36376v.setOnClickListener(new ViewOnClickListenerC4400b(this, 1));
        this.f36377w.setOnClickListener(new ViewOnClickListenerC4400b(this, 2));
        this.f36378x.setOnClickListener(new ViewOnClickListenerC4400b(this, 3));
        this.f36379y.setOnClickListener(new ViewOnClickListenerC4400b(this, 4));
        this.f36380z.setOnClickListener(new ViewOnClickListenerC4400b(this, 5));
        this.f36355A.setOnClickListener(new ViewOnClickListenerC4400b(this, 6));
        this.f36357C.setOnClickListener(new ViewOnClickListenerC4400b(this, 7));
        this.f36356B.setOnClickListener(new ViewOnClickListenerC4400b(this, 8));
    }
}
