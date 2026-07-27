package com.icefishing.icefishingliveapp;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import h.AbstractActivityC4553l;

/* loaded from: classes2.dex */
public class GameCategoriesActivity extends AbstractActivityC4553l {

    /* renamed from: A, reason: collision with root package name */
    public CardView f36557A;

    /* renamed from: B, reason: collision with root package name */
    public CardView f36558B;

    /* renamed from: C, reason: collision with root package name */
    public CardView f36559C;

    /* renamed from: D, reason: collision with root package name */
    public CardView f36560D;

    /* renamed from: E, reason: collision with root package name */
    public CardView f36561E;

    /* renamed from: F, reason: collision with root package name */
    public View f36562F;

    /* renamed from: G, reason: collision with root package name */
    public View f36563G;

    /* renamed from: H, reason: collision with root package name */
    public View f36564H;

    /* renamed from: I, reason: collision with root package name */
    public View f36565I;
    public View J;

    /* renamed from: K, reason: collision with root package name */
    public View f36566K;

    /* renamed from: L, reason: collision with root package name */
    public View f36567L;

    /* renamed from: M, reason: collision with root package name */
    public View f36568M;

    /* renamed from: N, reason: collision with root package name */
    public View f36569N;

    /* renamed from: O, reason: collision with root package name */
    public View f36570O;

    /* renamed from: P, reason: collision with root package name */
    public GameCategoriesActivity f36571P;

    /* renamed from: Q, reason: collision with root package name */
    public ImageView f36572Q;

    /* renamed from: R, reason: collision with root package name */
    public ImageView f36573R;

    /* renamed from: S, reason: collision with root package name */
    public ImageView f36574S;

    /* renamed from: T, reason: collision with root package name */
    public ImageView f36575T;

    /* renamed from: U, reason: collision with root package name */
    public ImageView f36576U;

    /* renamed from: V, reason: collision with root package name */
    public ImageView f36577V;

    /* renamed from: W, reason: collision with root package name */
    public ImageView f36578W;

    /* renamed from: X, reason: collision with root package name */
    public ImageView f36579X;
    public ImageView Y;

    /* renamed from: Z, reason: collision with root package name */
    public ImageView f36580Z;

    /* renamed from: n, reason: collision with root package name */
    public boolean f36581n = false;

    /* renamed from: u, reason: collision with root package name */
    public CardView f36582u;

    /* renamed from: v, reason: collision with root package name */
    public CardView f36583v;

    /* renamed from: w, reason: collision with root package name */
    public CardView f36584w;

    /* renamed from: x, reason: collision with root package name */
    public CardView f36585x;

    /* renamed from: y, reason: collision with root package name */
    public CardView f36586y;

    /* renamed from: z, reason: collision with root package name */
    public CardView f36587z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(GameCategoriesActivity gameCategoriesActivity, String str) {
        boolean z8;
        char c4 = '\t';
        gameCategoriesActivity.f36562F.setVisibility(8);
        gameCategoriesActivity.f36563G.setVisibility(8);
        gameCategoriesActivity.f36564H.setVisibility(8);
        gameCategoriesActivity.f36565I.setVisibility(8);
        gameCategoriesActivity.J.setVisibility(8);
        gameCategoriesActivity.f36566K.setVisibility(8);
        gameCategoriesActivity.f36567L.setVisibility(8);
        gameCategoriesActivity.f36568M.setVisibility(8);
        gameCategoriesActivity.f36569N.setVisibility(8);
        gameCategoriesActivity.f36570O.setVisibility(8);
        gameCategoriesActivity.f36572Q.setImageResource(C5284R.drawable.ic_unselelct);
        gameCategoriesActivity.f36573R.setImageResource(C5284R.drawable.ic_unselelct);
        gameCategoriesActivity.f36574S.setImageResource(C5284R.drawable.ic_unselelct);
        gameCategoriesActivity.f36575T.setImageResource(C5284R.drawable.ic_unselelct);
        gameCategoriesActivity.f36576U.setImageResource(C5284R.drawable.ic_unselelct);
        gameCategoriesActivity.f36577V.setImageResource(C5284R.drawable.ic_unselelct);
        gameCategoriesActivity.f36578W.setImageResource(C5284R.drawable.ic_unselelct);
        gameCategoriesActivity.f36579X.setImageResource(C5284R.drawable.ic_unselelct);
        gameCategoriesActivity.Y.setImageResource(C5284R.drawable.ic_unselelct);
        gameCategoriesActivity.f36580Z.setImageResource(C5284R.drawable.ic_unselelct);
        gameCategoriesActivity.f36581n = true;
        switch (str.hashCode()) {
            case -1211515478:
                if (str.equals("horror")) {
                    z8 = false;
                    break;
                }
                z8 = -1;
                break;
            case -287675339:
                if (str.equals("lifestyle")) {
                    z8 = true;
                    break;
                }
                z8 = -1;
                break;
            case 2718:
                if (str.equals("US")) {
                    z8 = 2;
                    break;
                }
                z8 = -1;
                break;
            case 69808407:
                if (str.equals("INDIA")) {
                    z8 = 3;
                    break;
                }
                z8 = -1;
                break;
            case 69984387:
                if (str.equals("ITALY")) {
                    z8 = 4;
                    break;
                }
                z8 = -1;
                break;
            case 79100329:
                if (str.equals("SPAIN")) {
                    z8 = 5;
                    break;
                }
                z8 = -1;
                break;
            case 106642994:
                if (str.equals("photo")) {
                    z8 = 6;
                    break;
                }
                z8 = -1;
                break;
            case 641750931:
                if (str.equals("GERMANY")) {
                    z8 = 7;
                    break;
                }
                z8 = -1;
                break;
            case 1938625706:
                if (str.equals("ARABIA")) {
                    z8 = 8;
                    break;
                }
                z8 = -1;
                break;
            case 2081782811:
                if (str.equals("FRANCE")) {
                    z8 = 9;
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
                break;
            case true:
                c4 = 7;
                break;
            case true:
                c4 = 0;
                break;
            case true:
                c4 = 1;
                break;
            case true:
                c4 = 2;
                break;
            case true:
                c4 = 3;
                break;
            case true:
                c4 = '\b';
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
                gameCategoriesActivity.f36562F.setVisibility(0);
                gameCategoriesActivity.f36572Q.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case 1:
                gameCategoriesActivity.f36564H.setVisibility(0);
                gameCategoriesActivity.f36574S.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case 2:
                gameCategoriesActivity.f36566K.setVisibility(0);
                gameCategoriesActivity.f36577V.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case 3:
                gameCategoriesActivity.f36563G.setVisibility(0);
                gameCategoriesActivity.f36573R.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case 4:
                gameCategoriesActivity.J.setVisibility(0);
                gameCategoriesActivity.f36576U.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case 5:
                gameCategoriesActivity.f36567L.setVisibility(0);
                gameCategoriesActivity.f36578W.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case 6:
                gameCategoriesActivity.f36565I.setVisibility(0);
                gameCategoriesActivity.f36575T.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case 7:
                gameCategoriesActivity.f36568M.setVisibility(0);
                gameCategoriesActivity.f36579X.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case '\b':
                gameCategoriesActivity.f36569N.setVisibility(0);
                gameCategoriesActivity.Y.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case '\t':
                gameCategoriesActivity.f36570O.setVisibility(0);
                gameCategoriesActivity.f36580Z.setImageResource(C5284R.drawable.ic_selelct);
                break;
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0490x, androidx.activity.p, D.AbstractActivityC0294n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5284R.layout.activity_game_categories);
        this.f36562F = findViewById(C5284R.id.v_us);
        this.f36563G = findViewById(C5284R.id.v_spain);
        this.f36564H = findViewById(C5284R.id.v_india);
        this.f36565I = findViewById(C5284R.id.v_france);
        this.J = findViewById(C5284R.id.v_germany);
        this.f36566K = findViewById(C5284R.id.v_italy);
        this.f36567L = findViewById(C5284R.id.v_arabia);
        this.f36568M = findViewById(C5284R.id.v_lifestyle);
        this.f36569N = findViewById(C5284R.id.v_photo);
        this.f36570O = findViewById(C5284R.id.v_horror);
        this.f36571P = this;
        this.f36582u = (CardView) findViewById(C5284R.id.card_us);
        this.f36583v = (CardView) findViewById(C5284R.id.card_spain);
        this.f36584w = (CardView) findViewById(C5284R.id.card_india);
        this.f36585x = (CardView) findViewById(C5284R.id.card_france);
        this.f36586y = (CardView) findViewById(C5284R.id.card_germany);
        this.f36587z = (CardView) findViewById(C5284R.id.card_italy);
        this.f36557A = (CardView) findViewById(C5284R.id.card_arabia);
        this.f36559C = (CardView) findViewById(C5284R.id.lifestyle);
        this.f36560D = (CardView) findViewById(C5284R.id.photo);
        this.f36561E = (CardView) findViewById(C5284R.id.horror);
        this.f36558B = (CardView) findViewById(C5284R.id.accept);
        this.f36572Q = (ImageView) findViewById(C5284R.id.iv_us_select);
        this.f36573R = (ImageView) findViewById(C5284R.id.iv_spain_select);
        this.f36574S = (ImageView) findViewById(C5284R.id.iv_india_select);
        this.f36575T = (ImageView) findViewById(C5284R.id.iv_france_select);
        this.f36576U = (ImageView) findViewById(C5284R.id.iv_germany_select);
        this.f36577V = (ImageView) findViewById(C5284R.id.iv_italy_select);
        this.f36578W = (ImageView) findViewById(C5284R.id.iv_arabia_select);
        this.f36579X = (ImageView) findViewById(C5284R.id.iv_lifestyle_select);
        this.Y = (ImageView) findViewById(C5284R.id.iv_photo_select);
        this.f36580Z = (ImageView) findViewById(C5284R.id.iv_horror_select);
        k4.m.i(this.f36571P, k4.m.f38802s, k4.m.f38794k, k4.m.f38775H, k4.m.f38778L, (ViewGroup) findViewById(C5284R.id.banner_container));
        k4.m.k(this.f36571P, k4.m.f38804u, k4.m.f38796m, k4.m.f38777K, (ViewGroup) findViewById(C5284R.id.native_ad_container));
        this.f36582u.setOnClickListener(new ViewOnClickListenerC4414c(this, 2));
        this.f36583v.setOnClickListener(new ViewOnClickListenerC4414c(this, 3));
        this.f36584w.setOnClickListener(new ViewOnClickListenerC4414c(this, 4));
        this.f36585x.setOnClickListener(new ViewOnClickListenerC4414c(this, 5));
        this.f36586y.setOnClickListener(new ViewOnClickListenerC4414c(this, 6));
        this.f36587z.setOnClickListener(new ViewOnClickListenerC4414c(this, 7));
        this.f36557A.setOnClickListener(new ViewOnClickListenerC4414c(this, 8));
        this.f36559C.setOnClickListener(new ViewOnClickListenerC4414c(this, 9));
        this.f36560D.setOnClickListener(new ViewOnClickListenerC4414c(this, 10));
        this.f36561E.setOnClickListener(new ViewOnClickListenerC4414c(this, 0));
        this.f36558B.setOnClickListener(new ViewOnClickListenerC4414c(this, 1));
    }
}
