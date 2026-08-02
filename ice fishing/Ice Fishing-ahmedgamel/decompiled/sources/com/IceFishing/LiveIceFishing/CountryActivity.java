package com.IceFishing.LiveIceFishing;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import h.AbstractActivityC4555k;

/* loaded from: classes.dex */
public class CountryActivity extends AbstractActivityC4555k {

    /* renamed from: A, reason: collision with root package name */
    public CardView f5849A;

    /* renamed from: B, reason: collision with root package name */
    public CardView f5850B;

    /* renamed from: C, reason: collision with root package name */
    public CardView f5851C;

    /* renamed from: D, reason: collision with root package name */
    public View f5852D;

    /* renamed from: E, reason: collision with root package name */
    public View f5853E;

    /* renamed from: F, reason: collision with root package name */
    public View f5854F;

    /* renamed from: G, reason: collision with root package name */
    public View f5855G;

    /* renamed from: H, reason: collision with root package name */
    public View f5856H;

    /* renamed from: I, reason: collision with root package name */
    public View f5857I;
    public View J;

    /* renamed from: K, reason: collision with root package name */
    public View f5858K;

    /* renamed from: L, reason: collision with root package name */
    public CountryActivity f5859L;

    /* renamed from: M, reason: collision with root package name */
    public ImageView f5860M;

    /* renamed from: N, reason: collision with root package name */
    public ImageView f5861N;

    /* renamed from: O, reason: collision with root package name */
    public ImageView f5862O;

    /* renamed from: P, reason: collision with root package name */
    public ImageView f5863P;

    /* renamed from: Q, reason: collision with root package name */
    public ImageView f5864Q;

    /* renamed from: R, reason: collision with root package name */
    public ImageView f5865R;

    /* renamed from: S, reason: collision with root package name */
    public ImageView f5866S;

    /* renamed from: T, reason: collision with root package name */
    public ImageView f5867T;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5868n = false;

    /* renamed from: u, reason: collision with root package name */
    public CardView f5869u;

    /* renamed from: v, reason: collision with root package name */
    public CardView f5870v;

    /* renamed from: w, reason: collision with root package name */
    public CardView f5871w;

    /* renamed from: x, reason: collision with root package name */
    public CardView f5872x;

    /* renamed from: y, reason: collision with root package name */
    public CardView f5873y;

    /* renamed from: z, reason: collision with root package name */
    public CardView f5874z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(CountryActivity countryActivity, String str) {
        boolean z6;
        char c9 = 7;
        countryActivity.f5852D.setVisibility(8);
        countryActivity.f5853E.setVisibility(8);
        countryActivity.f5854F.setVisibility(8);
        countryActivity.f5855G.setVisibility(8);
        countryActivity.f5856H.setVisibility(8);
        countryActivity.f5857I.setVisibility(8);
        countryActivity.J.setVisibility(8);
        countryActivity.f5858K.setVisibility(8);
        countryActivity.f5860M.setImageResource(C5248R.drawable.ic_unselelct);
        countryActivity.f5861N.setImageResource(C5248R.drawable.ic_unselelct);
        countryActivity.f5862O.setImageResource(C5248R.drawable.ic_unselelct);
        countryActivity.f5863P.setImageResource(C5248R.drawable.ic_unselelct);
        countryActivity.f5864Q.setImageResource(C5248R.drawable.ic_unselelct);
        countryActivity.f5865R.setImageResource(C5248R.drawable.ic_unselelct);
        countryActivity.f5866S.setImageResource(C5248R.drawable.ic_unselelct);
        countryActivity.f5867T.setImageResource(C5248R.drawable.ic_unselelct);
        countryActivity.f5868n = true;
        switch (str.hashCode()) {
            case 2718:
                if (str.equals("US")) {
                    z6 = false;
                    break;
                }
                z6 = -1;
                break;
            case 69808407:
                if (str.equals("INDIA")) {
                    z6 = true;
                    break;
                }
                z6 = -1;
                break;
            case 69984387:
                if (str.equals("ITALY")) {
                    z6 = 2;
                    break;
                }
                z6 = -1;
                break;
            case 75532016:
                if (str.equals("OTHER")) {
                    z6 = 3;
                    break;
                }
                z6 = -1;
                break;
            case 79100329:
                if (str.equals("SPAIN")) {
                    z6 = 4;
                    break;
                }
                z6 = -1;
                break;
            case 641750931:
                if (str.equals("GERMANY")) {
                    z6 = 5;
                    break;
                }
                z6 = -1;
                break;
            case 1938625706:
                if (str.equals("ARABIA")) {
                    z6 = 6;
                    break;
                }
                z6 = -1;
                break;
            case 2081782811:
                if (str.equals("FRANCE")) {
                    z6 = 7;
                    break;
                }
                z6 = -1;
                break;
            default:
                z6 = -1;
                break;
        }
        switch (z6) {
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
                countryActivity.f5852D.setVisibility(0);
                countryActivity.f5860M.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case 1:
                countryActivity.f5854F.setVisibility(0);
                countryActivity.f5862O.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case 2:
                countryActivity.f5857I.setVisibility(0);
                countryActivity.f5865R.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case 3:
                countryActivity.f5853E.setVisibility(0);
                countryActivity.f5861N.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case 4:
                countryActivity.f5856H.setVisibility(0);
                countryActivity.f5864Q.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case 5:
                countryActivity.J.setVisibility(0);
                countryActivity.f5866S.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case 6:
                countryActivity.f5855G.setVisibility(0);
                countryActivity.f5863P.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case 7:
                countryActivity.f5858K.setVisibility(0);
                countryActivity.f5867T.setImageResource(C5248R.drawable.ic_selelct);
                break;
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0484x, androidx.activity.p, D.AbstractActivityC0283m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5248R.layout.activity_country);
        this.f5852D = findViewById(C5248R.id.v_us);
        this.f5853E = findViewById(C5248R.id.v_spain);
        this.f5854F = findViewById(C5248R.id.v_india);
        this.f5855G = findViewById(C5248R.id.v_france);
        this.f5856H = findViewById(C5248R.id.v_germany);
        this.f5857I = findViewById(C5248R.id.v_italy);
        this.J = findViewById(C5248R.id.v_arabia);
        this.f5858K = findViewById(C5248R.id.v_other);
        this.f5859L = this;
        this.f5869u = (CardView) findViewById(C5248R.id.card_us);
        this.f5870v = (CardView) findViewById(C5248R.id.card_spain);
        this.f5871w = (CardView) findViewById(C5248R.id.card_india);
        this.f5872x = (CardView) findViewById(C5248R.id.card_france);
        this.f5873y = (CardView) findViewById(C5248R.id.card_germany);
        this.f5874z = (CardView) findViewById(C5248R.id.card_italy);
        this.f5849A = (CardView) findViewById(C5248R.id.card_arabia);
        this.f5851C = (CardView) findViewById(C5248R.id.card_other);
        this.f5850B = (CardView) findViewById(C5248R.id.accept);
        this.f5860M = (ImageView) findViewById(C5248R.id.iv_us_select);
        this.f5861N = (ImageView) findViewById(C5248R.id.iv_spain_select);
        this.f5862O = (ImageView) findViewById(C5248R.id.iv_india_select);
        this.f5863P = (ImageView) findViewById(C5248R.id.iv_france_select);
        this.f5864Q = (ImageView) findViewById(C5248R.id.iv_germany_select);
        this.f5865R = (ImageView) findViewById(C5248R.id.iv_italy_select);
        this.f5866S = (ImageView) findViewById(C5248R.id.iv_arabia_select);
        this.f5867T = (ImageView) findViewById(C5248R.id.iv_other_select);
        Y0.p.i(this.f5859L, Y0.p.f3889s, Y0.p.f3881k, Y0.p.f3862H, Y0.p.f3865L, (ViewGroup) findViewById(C5248R.id.banner_container));
        Y0.p.k(this.f5859L, Y0.p.f3891u, Y0.p.f3883m, Y0.p.f3864K, (ViewGroup) findViewById(C5248R.id.native_ad_container));
        this.f5869u.setOnClickListener(new ViewOnClickListenerC0558b(this, 0));
        this.f5870v.setOnClickListener(new ViewOnClickListenerC0558b(this, 1));
        this.f5871w.setOnClickListener(new ViewOnClickListenerC0558b(this, 2));
        this.f5872x.setOnClickListener(new ViewOnClickListenerC0558b(this, 3));
        this.f5873y.setOnClickListener(new ViewOnClickListenerC0558b(this, 4));
        this.f5874z.setOnClickListener(new ViewOnClickListenerC0558b(this, 5));
        this.f5849A.setOnClickListener(new ViewOnClickListenerC0558b(this, 6));
        this.f5851C.setOnClickListener(new ViewOnClickListenerC0558b(this, 7));
        this.f5850B.setOnClickListener(new ViewOnClickListenerC0558b(this, 8));
    }
}
