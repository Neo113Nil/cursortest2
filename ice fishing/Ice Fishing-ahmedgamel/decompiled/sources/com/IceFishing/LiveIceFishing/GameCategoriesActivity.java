package com.IceFishing.LiveIceFishing;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import h.AbstractActivityC4555k;

/* loaded from: classes.dex */
public class GameCategoriesActivity extends AbstractActivityC4555k {

    /* renamed from: A, reason: collision with root package name */
    public CardView f5887A;

    /* renamed from: B, reason: collision with root package name */
    public CardView f5888B;

    /* renamed from: C, reason: collision with root package name */
    public CardView f5889C;

    /* renamed from: D, reason: collision with root package name */
    public CardView f5890D;

    /* renamed from: E, reason: collision with root package name */
    public CardView f5891E;

    /* renamed from: F, reason: collision with root package name */
    public View f5892F;

    /* renamed from: G, reason: collision with root package name */
    public View f5893G;

    /* renamed from: H, reason: collision with root package name */
    public View f5894H;

    /* renamed from: I, reason: collision with root package name */
    public View f5895I;
    public View J;

    /* renamed from: K, reason: collision with root package name */
    public View f5896K;

    /* renamed from: L, reason: collision with root package name */
    public View f5897L;

    /* renamed from: M, reason: collision with root package name */
    public View f5898M;

    /* renamed from: N, reason: collision with root package name */
    public View f5899N;

    /* renamed from: O, reason: collision with root package name */
    public View f5900O;

    /* renamed from: P, reason: collision with root package name */
    public GameCategoriesActivity f5901P;

    /* renamed from: Q, reason: collision with root package name */
    public ImageView f5902Q;

    /* renamed from: R, reason: collision with root package name */
    public ImageView f5903R;

    /* renamed from: S, reason: collision with root package name */
    public ImageView f5904S;

    /* renamed from: T, reason: collision with root package name */
    public ImageView f5905T;

    /* renamed from: U, reason: collision with root package name */
    public ImageView f5906U;

    /* renamed from: V, reason: collision with root package name */
    public ImageView f5907V;

    /* renamed from: W, reason: collision with root package name */
    public ImageView f5908W;

    /* renamed from: X, reason: collision with root package name */
    public ImageView f5909X;
    public ImageView Y;

    /* renamed from: Z, reason: collision with root package name */
    public ImageView f5910Z;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5911n = false;

    /* renamed from: u, reason: collision with root package name */
    public CardView f5912u;

    /* renamed from: v, reason: collision with root package name */
    public CardView f5913v;

    /* renamed from: w, reason: collision with root package name */
    public CardView f5914w;

    /* renamed from: x, reason: collision with root package name */
    public CardView f5915x;

    /* renamed from: y, reason: collision with root package name */
    public CardView f5916y;

    /* renamed from: z, reason: collision with root package name */
    public CardView f5917z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(GameCategoriesActivity gameCategoriesActivity, String str) {
        boolean z6;
        char c9 = '\t';
        gameCategoriesActivity.f5892F.setVisibility(8);
        gameCategoriesActivity.f5893G.setVisibility(8);
        gameCategoriesActivity.f5894H.setVisibility(8);
        gameCategoriesActivity.f5895I.setVisibility(8);
        gameCategoriesActivity.J.setVisibility(8);
        gameCategoriesActivity.f5896K.setVisibility(8);
        gameCategoriesActivity.f5897L.setVisibility(8);
        gameCategoriesActivity.f5898M.setVisibility(8);
        gameCategoriesActivity.f5899N.setVisibility(8);
        gameCategoriesActivity.f5900O.setVisibility(8);
        gameCategoriesActivity.f5902Q.setImageResource(C5248R.drawable.ic_unselelct);
        gameCategoriesActivity.f5903R.setImageResource(C5248R.drawable.ic_unselelct);
        gameCategoriesActivity.f5904S.setImageResource(C5248R.drawable.ic_unselelct);
        gameCategoriesActivity.f5905T.setImageResource(C5248R.drawable.ic_unselelct);
        gameCategoriesActivity.f5906U.setImageResource(C5248R.drawable.ic_unselelct);
        gameCategoriesActivity.f5907V.setImageResource(C5248R.drawable.ic_unselelct);
        gameCategoriesActivity.f5908W.setImageResource(C5248R.drawable.ic_unselelct);
        gameCategoriesActivity.f5909X.setImageResource(C5248R.drawable.ic_unselelct);
        gameCategoriesActivity.Y.setImageResource(C5248R.drawable.ic_unselelct);
        gameCategoriesActivity.f5910Z.setImageResource(C5248R.drawable.ic_unselelct);
        gameCategoriesActivity.f5911n = true;
        switch (str.hashCode()) {
            case -1211515478:
                if (str.equals("horror")) {
                    z6 = false;
                    break;
                }
                z6 = -1;
                break;
            case -287675339:
                if (str.equals("lifestyle")) {
                    z6 = true;
                    break;
                }
                z6 = -1;
                break;
            case 2718:
                if (str.equals("US")) {
                    z6 = 2;
                    break;
                }
                z6 = -1;
                break;
            case 69808407:
                if (str.equals("INDIA")) {
                    z6 = 3;
                    break;
                }
                z6 = -1;
                break;
            case 69984387:
                if (str.equals("ITALY")) {
                    z6 = 4;
                    break;
                }
                z6 = -1;
                break;
            case 79100329:
                if (str.equals("SPAIN")) {
                    z6 = 5;
                    break;
                }
                z6 = -1;
                break;
            case 106642994:
                if (str.equals("photo")) {
                    z6 = 6;
                    break;
                }
                z6 = -1;
                break;
            case 641750931:
                if (str.equals("GERMANY")) {
                    z6 = 7;
                    break;
                }
                z6 = -1;
                break;
            case 1938625706:
                if (str.equals("ARABIA")) {
                    z6 = 8;
                    break;
                }
                z6 = -1;
                break;
            case 2081782811:
                if (str.equals("FRANCE")) {
                    z6 = 9;
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
                gameCategoriesActivity.f5892F.setVisibility(0);
                gameCategoriesActivity.f5902Q.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case 1:
                gameCategoriesActivity.f5894H.setVisibility(0);
                gameCategoriesActivity.f5904S.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case 2:
                gameCategoriesActivity.f5896K.setVisibility(0);
                gameCategoriesActivity.f5907V.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case 3:
                gameCategoriesActivity.f5893G.setVisibility(0);
                gameCategoriesActivity.f5903R.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case 4:
                gameCategoriesActivity.J.setVisibility(0);
                gameCategoriesActivity.f5906U.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case 5:
                gameCategoriesActivity.f5897L.setVisibility(0);
                gameCategoriesActivity.f5908W.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case 6:
                gameCategoriesActivity.f5895I.setVisibility(0);
                gameCategoriesActivity.f5905T.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case 7:
                gameCategoriesActivity.f5898M.setVisibility(0);
                gameCategoriesActivity.f5909X.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case '\b':
                gameCategoriesActivity.f5899N.setVisibility(0);
                gameCategoriesActivity.Y.setImageResource(C5248R.drawable.ic_selelct);
                break;
            case '\t':
                gameCategoriesActivity.f5900O.setVisibility(0);
                gameCategoriesActivity.f5910Z.setImageResource(C5248R.drawable.ic_selelct);
                break;
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0484x, androidx.activity.p, D.AbstractActivityC0283m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5248R.layout.activity_game_categories);
        this.f5892F = findViewById(C5248R.id.v_us);
        this.f5893G = findViewById(C5248R.id.v_spain);
        this.f5894H = findViewById(C5248R.id.v_india);
        this.f5895I = findViewById(C5248R.id.v_france);
        this.J = findViewById(C5248R.id.v_germany);
        this.f5896K = findViewById(C5248R.id.v_italy);
        this.f5897L = findViewById(C5248R.id.v_arabia);
        this.f5898M = findViewById(C5248R.id.v_lifestyle);
        this.f5899N = findViewById(C5248R.id.v_photo);
        this.f5900O = findViewById(C5248R.id.v_horror);
        this.f5901P = this;
        this.f5912u = (CardView) findViewById(C5248R.id.card_us);
        this.f5913v = (CardView) findViewById(C5248R.id.card_spain);
        this.f5914w = (CardView) findViewById(C5248R.id.card_india);
        this.f5915x = (CardView) findViewById(C5248R.id.card_france);
        this.f5916y = (CardView) findViewById(C5248R.id.card_germany);
        this.f5917z = (CardView) findViewById(C5248R.id.card_italy);
        this.f5887A = (CardView) findViewById(C5248R.id.card_arabia);
        this.f5889C = (CardView) findViewById(C5248R.id.lifestyle);
        this.f5890D = (CardView) findViewById(C5248R.id.photo);
        this.f5891E = (CardView) findViewById(C5248R.id.horror);
        this.f5888B = (CardView) findViewById(C5248R.id.accept);
        this.f5902Q = (ImageView) findViewById(C5248R.id.iv_us_select);
        this.f5903R = (ImageView) findViewById(C5248R.id.iv_spain_select);
        this.f5904S = (ImageView) findViewById(C5248R.id.iv_india_select);
        this.f5905T = (ImageView) findViewById(C5248R.id.iv_france_select);
        this.f5906U = (ImageView) findViewById(C5248R.id.iv_germany_select);
        this.f5907V = (ImageView) findViewById(C5248R.id.iv_italy_select);
        this.f5908W = (ImageView) findViewById(C5248R.id.iv_arabia_select);
        this.f5909X = (ImageView) findViewById(C5248R.id.iv_lifestyle_select);
        this.Y = (ImageView) findViewById(C5248R.id.iv_photo_select);
        this.f5910Z = (ImageView) findViewById(C5248R.id.iv_horror_select);
        Y0.p.i(this.f5901P, Y0.p.f3889s, Y0.p.f3881k, Y0.p.f3862H, Y0.p.f3865L, (ViewGroup) findViewById(C5248R.id.banner_container));
        Y0.p.k(this.f5901P, Y0.p.f3891u, Y0.p.f3883m, Y0.p.f3864K, (ViewGroup) findViewById(C5248R.id.native_ad_container));
        this.f5912u.setOnClickListener(new ViewOnClickListenerC0559c(this, 2));
        this.f5913v.setOnClickListener(new ViewOnClickListenerC0559c(this, 3));
        this.f5914w.setOnClickListener(new ViewOnClickListenerC0559c(this, 4));
        this.f5915x.setOnClickListener(new ViewOnClickListenerC0559c(this, 5));
        this.f5916y.setOnClickListener(new ViewOnClickListenerC0559c(this, 6));
        this.f5917z.setOnClickListener(new ViewOnClickListenerC0559c(this, 7));
        this.f5887A.setOnClickListener(new ViewOnClickListenerC0559c(this, 8));
        this.f5889C.setOnClickListener(new ViewOnClickListenerC0559c(this, 9));
        this.f5890D.setOnClickListener(new ViewOnClickListenerC0559c(this, 10));
        this.f5891E.setOnClickListener(new ViewOnClickListenerC0559c(this, 0));
        this.f5888B.setOnClickListener(new ViewOnClickListenerC0559c(this, 1));
    }
}
