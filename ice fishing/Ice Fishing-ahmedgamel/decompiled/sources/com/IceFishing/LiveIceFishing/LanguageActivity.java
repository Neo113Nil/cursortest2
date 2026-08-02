package com.IceFishing.LiveIceFishing;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import h.AbstractActivityC4555k;

/* loaded from: classes.dex */
public class LanguageActivity extends AbstractActivityC4555k {

    /* renamed from: A, reason: collision with root package name */
    public CardView f6270A;

    /* renamed from: B, reason: collision with root package name */
    public CardView f6271B;

    /* renamed from: C, reason: collision with root package name */
    public CardView f6272C;

    /* renamed from: D, reason: collision with root package name */
    public View f6273D;

    /* renamed from: E, reason: collision with root package name */
    public View f6274E;

    /* renamed from: F, reason: collision with root package name */
    public View f6275F;

    /* renamed from: G, reason: collision with root package name */
    public View f6276G;

    /* renamed from: H, reason: collision with root package name */
    public View f6277H;

    /* renamed from: I, reason: collision with root package name */
    public View f6278I;
    public View J;

    /* renamed from: K, reason: collision with root package name */
    public View f6279K;

    /* renamed from: L, reason: collision with root package name */
    public LanguageActivity f6280L;

    /* renamed from: M, reason: collision with root package name */
    public ImageView f6281M;

    /* renamed from: N, reason: collision with root package name */
    public ImageView f6282N;

    /* renamed from: O, reason: collision with root package name */
    public ImageView f6283O;

    /* renamed from: P, reason: collision with root package name */
    public ImageView f6284P;

    /* renamed from: Q, reason: collision with root package name */
    public ImageView f6285Q;

    /* renamed from: R, reason: collision with root package name */
    public ImageView f6286R;

    /* renamed from: S, reason: collision with root package name */
    public ImageView f6287S;

    /* renamed from: T, reason: collision with root package name */
    public ImageView f6288T;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6289n = false;

    /* renamed from: u, reason: collision with root package name */
    public CardView f6290u;

    /* renamed from: v, reason: collision with root package name */
    public CardView f6291v;

    /* renamed from: w, reason: collision with root package name */
    public CardView f6292w;

    /* renamed from: x, reason: collision with root package name */
    public CardView f6293x;

    /* renamed from: y, reason: collision with root package name */
    public CardView f6294y;

    /* renamed from: z, reason: collision with root package name */
    public CardView f6295z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(LanguageActivity languageActivity, String str) {
        boolean z6;
        char c9 = 7;
        languageActivity.f6273D.setVisibility(8);
        languageActivity.f6274E.setVisibility(8);
        languageActivity.f6275F.setVisibility(8);
        languageActivity.f6276G.setVisibility(8);
        languageActivity.f6277H.setVisibility(8);
        languageActivity.f6278I.setVisibility(8);
        languageActivity.J.setVisibility(8);
        languageActivity.f6279K.setVisibility(8);
        languageActivity.f6281M.setImageResource(C5248R.drawable.ic_unselelct);
        languageActivity.f6282N.setImageResource(C5248R.drawable.ic_unselelct);
        languageActivity.f6283O.setImageResource(C5248R.drawable.ic_unselelct);
        languageActivity.f6284P.setImageResource(C5248R.drawable.ic_unselelct);
        languageActivity.f6285Q.setImageResource(C5248R.drawable.ic_unselelct);
        languageActivity.f6286R.setImageResource(C5248R.drawable.ic_unselelct);
        languageActivity.f6287S.setImageResource(C5248R.drawable.ic_unselelct);
        languageActivity.f6288T.setImageResource(C5248R.drawable.ic_unselelct);
        languageActivity.f6289n = true;
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
                languageActivity.f6273D.setVisibility(0);
                languageActivity.f6281M.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case 1:
                languageActivity.f6275F.setVisibility(0);
                languageActivity.f6283O.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case 2:
                languageActivity.f6278I.setVisibility(0);
                languageActivity.f6286R.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case 3:
                languageActivity.f6274E.setVisibility(0);
                languageActivity.f6282N.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case 4:
                languageActivity.f6277H.setVisibility(0);
                languageActivity.f6285Q.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case 5:
                languageActivity.J.setVisibility(0);
                languageActivity.f6287S.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case 6:
                languageActivity.f6276G.setVisibility(0);
                languageActivity.f6284P.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case 7:
                languageActivity.f6279K.setVisibility(0);
                languageActivity.f6288T.setImageResource(C5248R.drawable.ic_selelct);
                break;
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0484x, androidx.activity.p, D.AbstractActivityC0283m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5248R.layout.activity_language);
        this.f6273D = findViewById(C5248R.id.v_us);
        this.f6274E = findViewById(C5248R.id.v_spain);
        this.f6275F = findViewById(C5248R.id.v_india);
        this.f6276G = findViewById(C5248R.id.v_france);
        this.f6277H = findViewById(C5248R.id.v_germany);
        this.f6278I = findViewById(C5248R.id.v_italy);
        this.J = findViewById(C5248R.id.v_arabia);
        this.f6279K = findViewById(C5248R.id.v_other);
        this.f6280L = this;
        this.f6290u = (CardView) findViewById(C5248R.id.card_us);
        this.f6291v = (CardView) findViewById(C5248R.id.card_spain);
        this.f6292w = (CardView) findViewById(C5248R.id.card_india);
        this.f6293x = (CardView) findViewById(C5248R.id.card_france);
        this.f6294y = (CardView) findViewById(C5248R.id.card_germany);
        this.f6295z = (CardView) findViewById(C5248R.id.card_italy);
        this.f6270A = (CardView) findViewById(C5248R.id.card_arabia);
        this.f6272C = (CardView) findViewById(C5248R.id.card_other);
        this.f6271B = (CardView) findViewById(C5248R.id.accept);
        this.f6281M = (ImageView) findViewById(C5248R.id.iv_us_select);
        this.f6282N = (ImageView) findViewById(C5248R.id.iv_spain_select);
        this.f6283O = (ImageView) findViewById(C5248R.id.iv_india_select);
        this.f6284P = (ImageView) findViewById(C5248R.id.iv_france_select);
        this.f6285Q = (ImageView) findViewById(C5248R.id.iv_germany_select);
        this.f6286R = (ImageView) findViewById(C5248R.id.iv_italy_select);
        this.f6287S = (ImageView) findViewById(C5248R.id.iv_arabia_select);
        this.f6288T = (ImageView) findViewById(C5248R.id.iv_other_select);
        Y0.p.i(this.f6280L, Y0.p.f3889s, Y0.p.f3881k, Y0.p.f3862H, Y0.p.f3865L, (ViewGroup) findViewById(C5248R.id.banner_container));
        Y0.p.k(this.f6280L, Y0.p.f3891u, Y0.p.f3883m, Y0.p.f3864K, (ViewGroup) findViewById(C5248R.id.native_ad_container));
        this.f6290u.setOnClickListener(new q(this, 0));
        this.f6291v.setOnClickListener(new q(this, 1));
        this.f6292w.setOnClickListener(new q(this, 2));
        this.f6293x.setOnClickListener(new q(this, 3));
        this.f6294y.setOnClickListener(new q(this, 4));
        this.f6295z.setOnClickListener(new q(this, 5));
        this.f6270A.setOnClickListener(new q(this, 6));
        this.f6272C.setOnClickListener(new q(this, 7));
        this.f6271B.setOnClickListener(new q(this, 8));
    }
}
