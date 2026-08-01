package com.icefishing.icefishingbigwin;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import h.AbstractActivityC4551k;

/* loaded from: classes2.dex */
public class GameCategoriesActivity extends AbstractActivityC4551k {

    /* renamed from: A, reason: collision with root package name */
    public CardView f36393A;

    /* renamed from: B, reason: collision with root package name */
    public CardView f36394B;

    /* renamed from: C, reason: collision with root package name */
    public CardView f36395C;

    /* renamed from: D, reason: collision with root package name */
    public CardView f36396D;

    /* renamed from: E, reason: collision with root package name */
    public CardView f36397E;

    /* renamed from: F, reason: collision with root package name */
    public View f36398F;

    /* renamed from: G, reason: collision with root package name */
    public View f36399G;

    /* renamed from: H, reason: collision with root package name */
    public View f36400H;

    /* renamed from: I, reason: collision with root package name */
    public View f36401I;
    public View J;

    /* renamed from: K, reason: collision with root package name */
    public View f36402K;

    /* renamed from: L, reason: collision with root package name */
    public View f36403L;

    /* renamed from: M, reason: collision with root package name */
    public View f36404M;

    /* renamed from: N, reason: collision with root package name */
    public View f36405N;

    /* renamed from: O, reason: collision with root package name */
    public View f36406O;

    /* renamed from: P, reason: collision with root package name */
    public GameCategoriesActivity f36407P;

    /* renamed from: Q, reason: collision with root package name */
    public ImageView f36408Q;

    /* renamed from: R, reason: collision with root package name */
    public ImageView f36409R;

    /* renamed from: S, reason: collision with root package name */
    public ImageView f36410S;

    /* renamed from: T, reason: collision with root package name */
    public ImageView f36411T;

    /* renamed from: U, reason: collision with root package name */
    public ImageView f36412U;

    /* renamed from: V, reason: collision with root package name */
    public ImageView f36413V;

    /* renamed from: W, reason: collision with root package name */
    public ImageView f36414W;

    /* renamed from: X, reason: collision with root package name */
    public ImageView f36415X;
    public ImageView Y;

    /* renamed from: Z, reason: collision with root package name */
    public ImageView f36416Z;

    /* renamed from: n, reason: collision with root package name */
    public boolean f36417n = false;

    /* renamed from: u, reason: collision with root package name */
    public CardView f36418u;

    /* renamed from: v, reason: collision with root package name */
    public CardView f36419v;

    /* renamed from: w, reason: collision with root package name */
    public CardView f36420w;

    /* renamed from: x, reason: collision with root package name */
    public CardView f36421x;

    /* renamed from: y, reason: collision with root package name */
    public CardView f36422y;

    /* renamed from: z, reason: collision with root package name */
    public CardView f36423z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(GameCategoriesActivity gameCategoriesActivity, String str) {
        boolean z3;
        char c9 = '\t';
        gameCategoriesActivity.f36398F.setVisibility(8);
        gameCategoriesActivity.f36399G.setVisibility(8);
        gameCategoriesActivity.f36400H.setVisibility(8);
        gameCategoriesActivity.f36401I.setVisibility(8);
        gameCategoriesActivity.J.setVisibility(8);
        gameCategoriesActivity.f36402K.setVisibility(8);
        gameCategoriesActivity.f36403L.setVisibility(8);
        gameCategoriesActivity.f36404M.setVisibility(8);
        gameCategoriesActivity.f36405N.setVisibility(8);
        gameCategoriesActivity.f36406O.setVisibility(8);
        gameCategoriesActivity.f36408Q.setImageResource(C5275R.drawable.ic_unselelct);
        gameCategoriesActivity.f36409R.setImageResource(C5275R.drawable.ic_unselelct);
        gameCategoriesActivity.f36410S.setImageResource(C5275R.drawable.ic_unselelct);
        gameCategoriesActivity.f36411T.setImageResource(C5275R.drawable.ic_unselelct);
        gameCategoriesActivity.f36412U.setImageResource(C5275R.drawable.ic_unselelct);
        gameCategoriesActivity.f36413V.setImageResource(C5275R.drawable.ic_unselelct);
        gameCategoriesActivity.f36414W.setImageResource(C5275R.drawable.ic_unselelct);
        gameCategoriesActivity.f36415X.setImageResource(C5275R.drawable.ic_unselelct);
        gameCategoriesActivity.Y.setImageResource(C5275R.drawable.ic_unselelct);
        gameCategoriesActivity.f36416Z.setImageResource(C5275R.drawable.ic_unselelct);
        gameCategoriesActivity.f36417n = true;
        switch (str.hashCode()) {
            case -1211515478:
                if (str.equals("horror")) {
                    z3 = false;
                    break;
                }
                z3 = -1;
                break;
            case -287675339:
                if (str.equals("lifestyle")) {
                    z3 = true;
                    break;
                }
                z3 = -1;
                break;
            case 2718:
                if (str.equals("US")) {
                    z3 = 2;
                    break;
                }
                z3 = -1;
                break;
            case 69808407:
                if (str.equals("INDIA")) {
                    z3 = 3;
                    break;
                }
                z3 = -1;
                break;
            case 69984387:
                if (str.equals("ITALY")) {
                    z3 = 4;
                    break;
                }
                z3 = -1;
                break;
            case 79100329:
                if (str.equals("SPAIN")) {
                    z3 = 5;
                    break;
                }
                z3 = -1;
                break;
            case 106642994:
                if (str.equals("photo")) {
                    z3 = 6;
                    break;
                }
                z3 = -1;
                break;
            case 641750931:
                if (str.equals("GERMANY")) {
                    z3 = 7;
                    break;
                }
                z3 = -1;
                break;
            case 1938625706:
                if (str.equals("ARABIA")) {
                    z3 = 8;
                    break;
                }
                z3 = -1;
                break;
            case 2081782811:
                if (str.equals("FRANCE")) {
                    z3 = 9;
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
                break;
            case true:
                c9 = 7;
                break;
            case true:
                c9 = 0;
                break;
            case true:
                c9 = 1;
                break;
            case true:
                c9 = 2;
                break;
            case true:
                c9 = 3;
                break;
            case true:
                c9 = '\b';
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
                gameCategoriesActivity.f36398F.setVisibility(0);
                gameCategoriesActivity.f36408Q.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case 1:
                gameCategoriesActivity.f36400H.setVisibility(0);
                gameCategoriesActivity.f36410S.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case 2:
                gameCategoriesActivity.f36402K.setVisibility(0);
                gameCategoriesActivity.f36413V.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case 3:
                gameCategoriesActivity.f36399G.setVisibility(0);
                gameCategoriesActivity.f36409R.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case 4:
                gameCategoriesActivity.J.setVisibility(0);
                gameCategoriesActivity.f36412U.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case 5:
                gameCategoriesActivity.f36403L.setVisibility(0);
                gameCategoriesActivity.f36414W.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case 6:
                gameCategoriesActivity.f36401I.setVisibility(0);
                gameCategoriesActivity.f36411T.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case 7:
                gameCategoriesActivity.f36404M.setVisibility(0);
                gameCategoriesActivity.f36415X.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case '\b':
                gameCategoriesActivity.f36405N.setVisibility(0);
                gameCategoriesActivity.Y.setImageResource(C5275R.drawable.ic_selelct);
                break;
            case '\t':
                gameCategoriesActivity.f36406O.setVisibility(0);
                gameCategoriesActivity.f36416Z.setImageResource(C5275R.drawable.ic_selelct);
                break;
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0480x, androidx.activity.p, D.AbstractActivityC0295n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5275R.layout.activity_game_categories);
        this.f36398F = findViewById(C5275R.id.v_us);
        this.f36399G = findViewById(C5275R.id.v_spain);
        this.f36400H = findViewById(C5275R.id.v_india);
        this.f36401I = findViewById(C5275R.id.v_france);
        this.J = findViewById(C5275R.id.v_germany);
        this.f36402K = findViewById(C5275R.id.v_italy);
        this.f36403L = findViewById(C5275R.id.v_arabia);
        this.f36404M = findViewById(C5275R.id.v_lifestyle);
        this.f36405N = findViewById(C5275R.id.v_photo);
        this.f36406O = findViewById(C5275R.id.v_horror);
        this.f36407P = this;
        this.f36418u = (CardView) findViewById(C5275R.id.card_us);
        this.f36419v = (CardView) findViewById(C5275R.id.card_spain);
        this.f36420w = (CardView) findViewById(C5275R.id.card_india);
        this.f36421x = (CardView) findViewById(C5275R.id.card_france);
        this.f36422y = (CardView) findViewById(C5275R.id.card_germany);
        this.f36423z = (CardView) findViewById(C5275R.id.card_italy);
        this.f36393A = (CardView) findViewById(C5275R.id.card_arabia);
        this.f36395C = (CardView) findViewById(C5275R.id.lifestyle);
        this.f36396D = (CardView) findViewById(C5275R.id.photo);
        this.f36397E = (CardView) findViewById(C5275R.id.horror);
        this.f36394B = (CardView) findViewById(C5275R.id.accept);
        this.f36408Q = (ImageView) findViewById(C5275R.id.iv_us_select);
        this.f36409R = (ImageView) findViewById(C5275R.id.iv_spain_select);
        this.f36410S = (ImageView) findViewById(C5275R.id.iv_india_select);
        this.f36411T = (ImageView) findViewById(C5275R.id.iv_france_select);
        this.f36412U = (ImageView) findViewById(C5275R.id.iv_germany_select);
        this.f36413V = (ImageView) findViewById(C5275R.id.iv_italy_select);
        this.f36414W = (ImageView) findViewById(C5275R.id.iv_arabia_select);
        this.f36415X = (ImageView) findViewById(C5275R.id.iv_lifestyle_select);
        this.Y = (ImageView) findViewById(C5275R.id.iv_photo_select);
        this.f36416Z = (ImageView) findViewById(C5275R.id.iv_horror_select);
        o4.m.i(this.f36407P, o4.m.f39626s, o4.m.f39618k, o4.m.f39599H, o4.m.f39602L, (ViewGroup) findViewById(C5275R.id.banner_container));
        o4.m.k(this.f36407P, o4.m.f39628u, o4.m.f39620m, o4.m.f39601K, (ViewGroup) findViewById(C5275R.id.native_ad_container));
        this.f36418u.setOnClickListener(new ViewOnClickListenerC4401c(this, 2));
        this.f36419v.setOnClickListener(new ViewOnClickListenerC4401c(this, 3));
        this.f36420w.setOnClickListener(new ViewOnClickListenerC4401c(this, 4));
        this.f36421x.setOnClickListener(new ViewOnClickListenerC4401c(this, 5));
        this.f36422y.setOnClickListener(new ViewOnClickListenerC4401c(this, 6));
        this.f36423z.setOnClickListener(new ViewOnClickListenerC4401c(this, 7));
        this.f36393A.setOnClickListener(new ViewOnClickListenerC4401c(this, 8));
        this.f36395C.setOnClickListener(new ViewOnClickListenerC4401c(this, 9));
        this.f36396D.setOnClickListener(new ViewOnClickListenerC4401c(this, 10));
        this.f36397E.setOnClickListener(new ViewOnClickListenerC4401c(this, 0));
        this.f36394B.setOnClickListener(new ViewOnClickListenerC4401c(this, 1));
    }
}
