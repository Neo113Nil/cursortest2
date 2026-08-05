package com.kolosta.rejin.jilosa.presentation.ui;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.kolosta.rejin.jilosa.R;
import com.kolosta.rejin.jilosa.presentation.ui.MainActivity;
import defpackage.CIYkyd1d;
import defpackage.CLDQNpCn;
import defpackage.T8ZRPPeH;
import defpackage.VZZbw3BB;
import defpackage.a1;
import defpackage.bu;
import defpackage.db0;
import defpackage.ej0;
import defpackage.f4UNdked;
import defpackage.fn;
import defpackage.g9;
import defpackage.ga;
import defpackage.go;
import defpackage.hg0;
import defpackage.km;
import defpackage.kn;
import defpackage.le0;
import defpackage.li;
import defpackage.m20;
import defpackage.mcXgUFR8;
import defpackage.me;
import defpackage.mt;
import defpackage.n50;
import defpackage.ne;
import defpackage.ni;
import defpackage.oe;
import defpackage.oq;
import defpackage.pe;
import defpackage.q65VbST0;
import defpackage.qe;
import defpackage.rAaHqhFJ;
import defpackage.rg0;
import defpackage.rq;
import defpackage.sb;
import defpackage.sq;
import defpackage.t50;
import defpackage.uu;
import defpackage.uv;
import defpackage.vl;
import defpackage.wi;
import defpackage.wm;
import defpackage.y30;
import defpackage.zf0;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class MainActivity extends f4UNdked implements vl {
    public static final /* synthetic */ int eIA6dogk = 0;
    public volatile CIYkyd1d DK9slbsy;
    public VZZbw3BB Mq3SeTnW;
    public int SgZGMMPL;
    public boolean U0LaHZX7;
    public uu euDDoUNr;
    public final kn i7xS8jrb;
    public final Object lwWCatUu;
    public final Set ytu5o6f4;

    public MainActivity() {
        ((mcXgUFR8) this.P7K7Inc8.NCTxEWno).eIA6dogk("androidx:appcompat", new q65VbST0(this));
        int i = 0;
        eVhOlqcC(new CLDQNpCn(this, i));
        this.lwWCatUu = new Object();
        this.U0LaHZX7 = false;
        int i2 = 1;
        eVhOlqcC(new CLDQNpCn(this, i2));
        this.i7xS8jrb = new kn(m20.qoPGr6Ce(sq.class), new oq(this, i2), new oq(this, i), new oq(this, 2));
        this.ytu5o6f4 = a1.Wi7iiXC4(new Integer[]{Integer.valueOf(R.id.fragment_sauce_bench), Integer.valueOf(R.id.fragment_pair_shelf), Integer.valueOf(R.id.fragment_sort_sprint), Integer.valueOf(R.id.fragment_taste_ledger)});
    }

    public final void Ey6iv0m0(boolean z) {
        VZZbw3BB vZZbw3BB = this.Mq3SeTnW;
        if (vZZbw3BB == null) {
            fn.ytu5o6f4("binding");
            throw null;
        }
        BottomNavigationView bottomNavigationView = (BottomNavigationView) vZZbw3BB.qoPGr6Ce;
        bottomNavigationView.setPadding(bottomNavigationView.getPaddingLeft(), bottomNavigationView.getPaddingTop(), bottomNavigationView.getPaddingRight(), z ? this.SgZGMMPL : 0);
        VZZbw3BB vZZbw3BB2 = this.Mq3SeTnW;
        if (vZZbw3BB2 == null) {
            fn.ytu5o6f4("binding");
            throw null;
        }
        FragmentContainerView fragmentContainerView = (FragmentContainerView) vZZbw3BB2.MdtA4re8;
        fragmentContainerView.setPadding(fragmentContainerView.getPaddingLeft(), fragmentContainerView.getPaddingTop(), fragmentContainerView.getPaddingRight(), z ? 0 : this.SgZGMMPL);
    }

    public final CIYkyd1d I5GHvsYW() {
        if (this.DK9slbsy == null) {
            synchronized (this.lwWCatUu) {
                try {
                    if (this.DK9slbsy == null) {
                        this.DK9slbsy = new CIYkyd1d(this);
                    }
                } finally {
                }
            }
        }
        return this.DK9slbsy;
    }

    @Override // defpackage.ul
    public final Object NCTxEWno() {
        return I5GHvsYW().NCTxEWno();
    }

    public final void RXQxj5Oe(Bundle bundle) {
        super.onCreate(bundle);
        CIYkyd1d I5GHvsYW = I5GHvsYW();
        T8ZRPPeH t8ZRPPeH = I5GHvsYW.VgvYg0wo;
        y30 y30Var = ((rAaHqhFJ) T8ZRPPeH.qoPGr6Ce(t8ZRPPeH.NCTxEWno, t8ZRPPeH.MdtA4re8).lwWCatUu(m20.qoPGr6Ce(rAaHqhFJ.class))).MdtA4re8;
        I5GHvsYW.P7K7Inc8 = y30Var;
        if (((mt) y30Var.NCTxEWno) == null) {
            mt VgvYg0wo = I5GHvsYW.wxUZMvaN.VgvYg0wo();
            ej0.P7K7Inc8(y30Var.qoPGr6Ce, "setExtras should only be called for an Activity that extends ComponentActivity", new Object[0]);
            y30Var.NCTxEWno = VgvYg0wo;
        }
    }

    @Override // defpackage.f4UNdked, defpackage.n7, defpackage.m7, android.app.Activity
    public final void onCreate(Bundle bundle) {
        db0 db0Var = new db0();
        db0 db0Var2 = new db0();
        int i = me.qoPGr6Ce;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.getResources().getClass();
        decorView.getResources().getClass();
        int i2 = Build.VERSION.SDK_INT;
        qe peVar = i2 >= 29 ? new pe() : i2 >= 26 ? new oe() : new ne();
        Window window = getWindow();
        window.getClass();
        peVar.qoPGr6Ce(db0Var, db0Var2, window, decorView, false, false);
        RXQxj5Oe(bundle);
        g9 g9Var = null;
        int i3 = 0;
        View inflate = getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
        int i4 = R.id.bottom_nav;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) n50.qoPGr6Ce(inflate, R.id.bottom_nav);
        if (bottomNavigationView != null) {
            i4 = R.id.bottom_nav_divider;
            View qoPGr6Ce = n50.qoPGr6Ce(inflate, R.id.bottom_nav_divider);
            if (qoPGr6Ce != null) {
                i4 = R.id.fragment_conainer;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) n50.qoPGr6Ce(inflate, R.id.fragment_conainer);
                if (fragmentContainerView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    this.Mq3SeTnW = new VZZbw3BB(bottomNavigationView, qoPGr6Ce, fragmentContainerView, constraintLayout);
                    setContentView(constraintLayout);
                    VZZbw3BB vZZbw3BB = this.Mq3SeTnW;
                    if (vZZbw3BB == null) {
                        fn.ytu5o6f4("binding");
                        throw null;
                    }
                    ((ConstraintLayout) vZZbw3BB.wxUZMvaN).setBackgroundColor(-1);
                    VZZbw3BB vZZbw3BB2 = this.Mq3SeTnW;
                    if (vZZbw3BB2 == null) {
                        fn.ytu5o6f4("binding");
                        throw null;
                    }
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) vZZbw3BB2.wxUZMvaN;
                    wm wmVar = new wm(this);
                    WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                    zf0.MdtA4re8(constraintLayout2, wmVar);
                    li lwWCatUu = ((ni) this.Ey6iv0m0.MdtA4re8).KlHjfFWx.lwWCatUu(R.id.fragment_conainer);
                    lwWCatUu.getClass();
                    uu zCflySGU = ((NavHostFragment) lwWCatUu).zCflySGU();
                    this.euDDoUNr = zCflySGU;
                    VZZbw3BB vZZbw3BB3 = this.Mq3SeTnW;
                    if (vZZbw3BB3 == null) {
                        fn.ytu5o6f4("binding");
                        throw null;
                    }
                    BottomNavigationView bottomNavigationView2 = (BottomNavigationView) vZZbw3BB3.qoPGr6Ce;
                    if (zCflySGU == null) {
                        fn.ytu5o6f4("navController");
                        throw null;
                    }
                    bottomNavigationView2.setOnItemSelectedListener(new wm(zCflySGU));
                    zCflySGU.qoPGr6Ce(new uv(new WeakReference(bottomNavigationView2), zCflySGU));
                    uu uuVar = this.euDDoUNr;
                    if (uuVar == null) {
                        fn.ytu5o6f4("navController");
                        throw null;
                    }
                    uuVar.qoPGr6Ce(new bu() { // from class: nq
                        @Override // defpackage.bu
                        public final void qoPGr6Ce(uu uuVar2, pu puVar) {
                            int i5 = MainActivity.eIA6dogk;
                            puVar.getClass();
                            MainActivity mainActivity = MainActivity.this;
                            boolean contains = mainActivity.ytu5o6f4.contains(Integer.valueOf(puVar.MdtA4re8.qoPGr6Ce));
                            VZZbw3BB vZZbw3BB4 = mainActivity.Mq3SeTnW;
                            if (vZZbw3BB4 == null) {
                                fn.ytu5o6f4("binding");
                                throw null;
                            }
                            ((BottomNavigationView) vZZbw3BB4.qoPGr6Ce).setVisibility(contains ? 0 : 8);
                            VZZbw3BB vZZbw3BB5 = mainActivity.Mq3SeTnW;
                            if (vZZbw3BB5 == null) {
                                fn.ytu5o6f4("binding");
                                throw null;
                            }
                            ((View) vZZbw3BB5.NCTxEWno).setVisibility(contains ? 0 : 8);
                            mainActivity.Ey6iv0m0(contains);
                        }
                    });
                    k3x7lurq().qoPGr6Ce(this, new wi(this));
                    sq sqVar = (sq) this.i7xS8jrb.getValue();
                    fn.Ey6iv0m0(le0.FySoLYna(sqVar), null, new rq(sqVar, g9Var, i3), 3);
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // defpackage.f4UNdked, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        y30 y30Var = I5GHvsYW().P7K7Inc8;
        if (y30Var != null) {
            y30Var.NCTxEWno = null;
        }
    }

    @Override // defpackage.n7, defpackage.gm
    public final rg0 wxUZMvaN() {
        t50 t50Var = this.Qr9iLBAD;
        if (t50Var == null) {
            t50Var = new t50(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            this.Qr9iLBAD = t50Var;
        }
        mcXgUFR8 qoPGr6Ce = ((ga) ((sb) fn.ow5vqvCr(this, sb.class))).qoPGr6Ce();
        return new km((go) qoPGr6Ce.MdtA4re8, t50Var, (mcXgUFR8) qoPGr6Ce.wxUZMvaN);
    }
}
