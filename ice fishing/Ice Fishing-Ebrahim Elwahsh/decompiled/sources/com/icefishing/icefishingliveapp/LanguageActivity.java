package com.icefishing.icefishingliveapp;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import h.AbstractActivityC4553l;

/* loaded from: classes2.dex */
public class LanguageActivity extends AbstractActivityC4553l {

    /* renamed from: A, reason: collision with root package name */
    public CardView f36941A;

    /* renamed from: B, reason: collision with root package name */
    public CardView f36942B;

    /* renamed from: C, reason: collision with root package name */
    public CardView f36943C;

    /* renamed from: D, reason: collision with root package name */
    public View f36944D;

    /* renamed from: E, reason: collision with root package name */
    public View f36945E;

    /* renamed from: F, reason: collision with root package name */
    public View f36946F;

    /* renamed from: G, reason: collision with root package name */
    public View f36947G;

    /* renamed from: H, reason: collision with root package name */
    public View f36948H;

    /* renamed from: I, reason: collision with root package name */
    public View f36949I;
    public View J;

    /* renamed from: K, reason: collision with root package name */
    public View f36950K;

    /* renamed from: L, reason: collision with root package name */
    public LanguageActivity f36951L;

    /* renamed from: M, reason: collision with root package name */
    public ImageView f36952M;

    /* renamed from: N, reason: collision with root package name */
    public ImageView f36953N;

    /* renamed from: O, reason: collision with root package name */
    public ImageView f36954O;

    /* renamed from: P, reason: collision with root package name */
    public ImageView f36955P;

    /* renamed from: Q, reason: collision with root package name */
    public ImageView f36956Q;

    /* renamed from: R, reason: collision with root package name */
    public ImageView f36957R;

    /* renamed from: S, reason: collision with root package name */
    public ImageView f36958S;

    /* renamed from: T, reason: collision with root package name */
    public ImageView f36959T;

    /* renamed from: n, reason: collision with root package name */
    public boolean f36960n = false;

    /* renamed from: u, reason: collision with root package name */
    public CardView f36961u;

    /* renamed from: v, reason: collision with root package name */
    public CardView f36962v;

    /* renamed from: w, reason: collision with root package name */
    public CardView f36963w;

    /* renamed from: x, reason: collision with root package name */
    public CardView f36964x;

    /* renamed from: y, reason: collision with root package name */
    public CardView f36965y;

    /* renamed from: z, reason: collision with root package name */
    public CardView f36966z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(LanguageActivity languageActivity, String str) {
        boolean z8;
        char c4 = 7;
        languageActivity.f36944D.setVisibility(8);
        languageActivity.f36945E.setVisibility(8);
        languageActivity.f36946F.setVisibility(8);
        languageActivity.f36947G.setVisibility(8);
        languageActivity.f36948H.setVisibility(8);
        languageActivity.f36949I.setVisibility(8);
        languageActivity.J.setVisibility(8);
        languageActivity.f36950K.setVisibility(8);
        languageActivity.f36952M.setImageResource(C5284R.drawable.ic_unselelct);
        languageActivity.f36953N.setImageResource(C5284R.drawable.ic_unselelct);
        languageActivity.f36954O.setImageResource(C5284R.drawable.ic_unselelct);
        languageActivity.f36955P.setImageResource(C5284R.drawable.ic_unselelct);
        languageActivity.f36956Q.setImageResource(C5284R.drawable.ic_unselelct);
        languageActivity.f36957R.setImageResource(C5284R.drawable.ic_unselelct);
        languageActivity.f36958S.setImageResource(C5284R.drawable.ic_unselelct);
        languageActivity.f36959T.setImageResource(C5284R.drawable.ic_unselelct);
        languageActivity.f36960n = true;
        switch (str.hashCode()) {
            case 2718:
                if (str.equals("US")) {
                    z8 = false;
                    break;
                }
                z8 = -1;
                break;
            case 69808407:
                if (str.equals("INDIA")) {
                    z8 = true;
                    break;
                }
                z8 = -1;
                break;
            case 69984387:
                if (str.equals("ITALY")) {
                    z8 = 2;
                    break;
                }
                z8 = -1;
                break;
            case 75532016:
                if (str.equals("OTHER")) {
                    z8 = 3;
                    break;
                }
                z8 = -1;
                break;
            case 79100329:
                if (str.equals("SPAIN")) {
                    z8 = 4;
                    break;
                }
                z8 = -1;
                break;
            case 641750931:
                if (str.equals("GERMANY")) {
                    z8 = 5;
                    break;
                }
                z8 = -1;
                break;
            case 1938625706:
                if (str.equals("ARABIA")) {
                    z8 = 6;
                    break;
                }
                z8 = -1;
                break;
            case 2081782811:
                if (str.equals("FRANCE")) {
                    z8 = 7;
                    break;
                }
                z8 = -1;
                break;
            default:
                z8 = -1;
                break;
        }
        switch (z8) {
            case false:
                c4 = 0;
                break;
            case true:
                c4 = 1;
                break;
            case true:
                c4 = 2;
                break;
            case true:
                break;
            case true:
                c4 = 3;
                break;
            case true:
                c4 = 4;
                break;
            case true:
                c4 = 5;
                break;
            case true:
                c4 = 6;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
                languageActivity.f36944D.setVisibility(0);
                languageActivity.f36952M.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case 1:
                languageActivity.f36946F.setVisibility(0);
                languageActivity.f36954O.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case 2:
                languageActivity.f36949I.setVisibility(0);
                languageActivity.f36957R.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case 3:
                languageActivity.f36945E.setVisibility(0);
                languageActivity.f36953N.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case 4:
                languageActivity.f36948H.setVisibility(0);
                languageActivity.f36956Q.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case 5:
                languageActivity.J.setVisibility(0);
                languageActivity.f36958S.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case 6:
                languageActivity.f36947G.setVisibility(0);
                languageActivity.f36955P.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case 7:
                languageActivity.f36950K.setVisibility(0);
                languageActivity.f36959T.setImageResource(C5284R.drawable.ic_selelct);
                break;
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0490x, androidx.activity.p, D.AbstractActivityC0294n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5284R.layout.activity_language);
        this.f36944D = findViewById(C5284R.id.v_us);
        this.f36945E = findViewById(C5284R.id.v_spain);
        this.f36946F = findViewById(C5284R.id.v_india);
        this.f36947G = findViewById(C5284R.id.v_france);
        this.f36948H = findViewById(C5284R.id.v_germany);
        this.f36949I = findViewById(C5284R.id.v_italy);
        this.J = findViewById(C5284R.id.v_arabia);
        this.f36950K = findViewById(C5284R.id.v_other);
        this.f36951L = this;
        this.f36961u = (CardView) findViewById(C5284R.id.card_us);
        this.f36962v = (CardView) findViewById(C5284R.id.card_spain);
        this.f36963w = (CardView) findViewById(C5284R.id.card_india);
        this.f36964x = (CardView) findViewById(C5284R.id.card_france);
        this.f36965y = (CardView) findViewById(C5284R.id.card_germany);
        this.f36966z = (CardView) findViewById(C5284R.id.card_italy);
        this.f36941A = (CardView) findViewById(C5284R.id.card_arabia);
        this.f36943C = (CardView) findViewById(C5284R.id.card_other);
        this.f36942B = (CardView) findViewById(C5284R.id.accept);
        this.f36952M = (ImageView) findViewById(C5284R.id.iv_us_select);
        this.f36953N = (ImageView) findViewById(C5284R.id.iv_spain_select);
        this.f36954O = (ImageView) findViewById(C5284R.id.iv_india_select);
        this.f36955P = (ImageView) findViewById(C5284R.id.iv_france_select);
        this.f36956Q = (ImageView) findViewById(C5284R.id.iv_germany_select);
        this.f36957R = (ImageView) findViewById(C5284R.id.iv_italy_select);
        this.f36958S = (ImageView) findViewById(C5284R.id.iv_arabia_select);
        this.f36959T = (ImageView) findViewById(C5284R.id.iv_other_select);
        k4.m.i(this.f36951L, k4.m.f38802s, k4.m.f38794k, k4.m.f38775H, k4.m.f38778L, (ViewGroup) findViewById(C5284R.id.banner_container));
        k4.m.k(this.f36951L, k4.m.f38804u, k4.m.f38796m, k4.m.f38777K, (ViewGroup) findViewById(C5284R.id.native_ad_container));
        this.f36961u.setOnClickListener(new p(this, 0));
        this.f36962v.setOnClickListener(new p(this, 1));
        this.f36963w.setOnClickListener(new p(this, 2));
        this.f36964x.setOnClickListener(new p(this, 3));
        this.f36965y.setOnClickListener(new p(this, 4));
        this.f36966z.setOnClickListener(new p(this, 5));
        this.f36941A.setOnClickListener(new p(this, 6));
        this.f36943C.setOnClickListener(new p(this, 7));
        this.f36942B.setOnClickListener(new p(this, 8));
    }
}
