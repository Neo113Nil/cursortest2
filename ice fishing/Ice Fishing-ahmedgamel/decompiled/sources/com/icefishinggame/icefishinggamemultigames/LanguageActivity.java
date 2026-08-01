package com.icefishinggame.icefishinggamemultigames;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import h.AbstractActivityC4551k;

/* loaded from: classes2.dex */
public class LanguageActivity extends AbstractActivityC4551k {

    /* renamed from: A, reason: collision with root package name */
    public CardView f36780A;

    /* renamed from: B, reason: collision with root package name */
    public CardView f36781B;

    /* renamed from: C, reason: collision with root package name */
    public CardView f36782C;

    /* renamed from: D, reason: collision with root package name */
    public View f36783D;

    /* renamed from: E, reason: collision with root package name */
    public View f36784E;

    /* renamed from: F, reason: collision with root package name */
    public View f36785F;

    /* renamed from: G, reason: collision with root package name */
    public View f36786G;

    /* renamed from: H, reason: collision with root package name */
    public View f36787H;

    /* renamed from: I, reason: collision with root package name */
    public View f36788I;
    public View J;

    /* renamed from: K, reason: collision with root package name */
    public View f36789K;

    /* renamed from: L, reason: collision with root package name */
    public LanguageActivity f36790L;

    /* renamed from: M, reason: collision with root package name */
    public ImageView f36791M;

    /* renamed from: N, reason: collision with root package name */
    public ImageView f36792N;

    /* renamed from: O, reason: collision with root package name */
    public ImageView f36793O;

    /* renamed from: P, reason: collision with root package name */
    public ImageView f36794P;

    /* renamed from: Q, reason: collision with root package name */
    public ImageView f36795Q;

    /* renamed from: R, reason: collision with root package name */
    public ImageView f36796R;

    /* renamed from: S, reason: collision with root package name */
    public ImageView f36797S;

    /* renamed from: T, reason: collision with root package name */
    public ImageView f36798T;

    /* renamed from: n, reason: collision with root package name */
    public boolean f36799n = false;

    /* renamed from: u, reason: collision with root package name */
    public CardView f36800u;

    /* renamed from: v, reason: collision with root package name */
    public CardView f36801v;

    /* renamed from: w, reason: collision with root package name */
    public CardView f36802w;

    /* renamed from: x, reason: collision with root package name */
    public CardView f36803x;

    /* renamed from: y, reason: collision with root package name */
    public CardView f36804y;

    /* renamed from: z, reason: collision with root package name */
    public CardView f36805z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(LanguageActivity languageActivity, String str) {
        boolean z3;
        char c9 = 7;
        languageActivity.f36783D.setVisibility(8);
        languageActivity.f36784E.setVisibility(8);
        languageActivity.f36785F.setVisibility(8);
        languageActivity.f36786G.setVisibility(8);
        languageActivity.f36787H.setVisibility(8);
        languageActivity.f36788I.setVisibility(8);
        languageActivity.J.setVisibility(8);
        languageActivity.f36789K.setVisibility(8);
        languageActivity.f36791M.setImageResource(C5275R.drawable.ic_unselelct);
        languageActivity.f36792N.setImageResource(C5275R.drawable.ic_unselelct);
        languageActivity.f36793O.setImageResource(C5275R.drawable.ic_unselelct);
        languageActivity.f36794P.setImageResource(C5275R.drawable.ic_unselelct);
        languageActivity.f36795Q.setImageResource(C5275R.drawable.ic_unselelct);
        languageActivity.f36796R.setImageResource(C5275R.drawable.ic_unselelct);
        languageActivity.f36797S.setImageResource(C5275R.drawable.ic_unselelct);
        languageActivity.f36798T.setImageResource(C5275R.drawable.ic_unselelct);
        languageActivity.f36799n = true;
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
                languageActivity.f36783D.setVisibility(0);
                languageActivity.f36791M.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case 1:
                languageActivity.f36785F.setVisibility(0);
                languageActivity.f36793O.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case 2:
                languageActivity.f36788I.setVisibility(0);
                languageActivity.f36796R.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case 3:
                languageActivity.f36784E.setVisibility(0);
                languageActivity.f36792N.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case 4:
                languageActivity.f36787H.setVisibility(0);
                languageActivity.f36795Q.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case 5:
                languageActivity.J.setVisibility(0);
                languageActivity.f36797S.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case 6:
                languageActivity.f36786G.setVisibility(0);
                languageActivity.f36794P.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case 7:
                languageActivity.f36789K.setVisibility(0);
                languageActivity.f36798T.setImageResource(C5275R.drawable.ic_selelct);
                break;
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0480x, androidx.activity.p, D.AbstractActivityC0295n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5275R.layout.activity_language);
        this.f36783D = findViewById(C5275R.id.v_us);
        this.f36784E = findViewById(C5275R.id.v_spain);
        this.f36785F = findViewById(C5275R.id.v_india);
        this.f36786G = findViewById(C5275R.id.v_france);
        this.f36787H = findViewById(C5275R.id.v_germany);
        this.f36788I = findViewById(C5275R.id.v_italy);
        this.J = findViewById(C5275R.id.v_arabia);
        this.f36789K = findViewById(C5275R.id.v_other);
        this.f36790L = this;
        this.f36800u = (CardView) findViewById(C5275R.id.card_us);
        this.f36801v = (CardView) findViewById(C5275R.id.card_spain);
        this.f36802w = (CardView) findViewById(C5275R.id.card_india);
        this.f36803x = (CardView) findViewById(C5275R.id.card_france);
        this.f36804y = (CardView) findViewById(C5275R.id.card_germany);
        this.f36805z = (CardView) findViewById(C5275R.id.card_italy);
        this.f36780A = (CardView) findViewById(C5275R.id.card_arabia);
        this.f36782C = (CardView) findViewById(C5275R.id.card_other);
        this.f36781B = (CardView) findViewById(C5275R.id.accept);
        this.f36791M = (ImageView) findViewById(C5275R.id.iv_us_select);
        this.f36792N = (ImageView) findViewById(C5275R.id.iv_spain_select);
        this.f36793O = (ImageView) findViewById(C5275R.id.iv_india_select);
        this.f36794P = (ImageView) findViewById(C5275R.id.iv_france_select);
        this.f36795Q = (ImageView) findViewById(C5275R.id.iv_germany_select);
        this.f36796R = (ImageView) findViewById(C5275R.id.iv_italy_select);
        this.f36797S = (ImageView) findViewById(C5275R.id.iv_arabia_select);
        this.f36798T = (ImageView) findViewById(C5275R.id.iv_other_select);
        o4.m.i(this.f36790L, o4.m.f39626s, o4.m.f39618k, o4.m.f39599H, o4.m.f39602L, (ViewGroup) findViewById(C5275R.id.banner_container));
        o4.m.k(this.f36790L, o4.m.f39628u, o4.m.f39620m, o4.m.f39601K, (ViewGroup) findViewById(C5275R.id.native_ad_container));
        this.f36800u.setOnClickListener(new q(this, 0));
        this.f36801v.setOnClickListener(new q(this, 1));
        this.f36802w.setOnClickListener(new q(this, 2));
        this.f36803x.setOnClickListener(new q(this, 3));
        this.f36804y.setOnClickListener(new q(this, 4));
        this.f36805z.setOnClickListener(new q(this, 5));
        this.f36780A.setOnClickListener(new q(this, 6));
        this.f36782C.setOnClickListener(new q(this, 7));
        this.f36781B.setOnClickListener(new q(this, 8));
    }
}
