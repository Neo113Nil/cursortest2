package com.corsair.ledger;

/* loaded from: classes.dex */
public final class MainActivity extends defpackage.nf implements defpackage.a20 {
    public static final /* synthetic */ int nBH8hAHy = 0;
    public volatile defpackage.XkvoyZRg NHJTzaLwkd;
    public defpackage.b10 UsuH8pd5P;
    public final java.lang.Object QQUzIjv3iOC5 = new java.lang.Object();
    public boolean C0U8sNJm = false;

    public MainActivity() {
        defpackage.y30 y30Var = new defpackage.y30(this);
        defpackage.cj cjVar = this.xiZrDbcSW0;
        cjVar.getClass();
        defpackage.nf nfVar = cjVar.oh6vYeIP;
        if (nfVar != null) {
            y30Var.IHQe1A4L2xu(nfVar);
        }
        cjVar.IHQe1A4L2xu.add(y30Var);
    }

    @Override // defpackage.a20
    public final java.lang.Object F7NU4MC0GW() {
        return ez2rX8ReCYw().F7NU4MC0GW();
    }

    public final void JlrlGoKF(android.os.Bundle bundle) {
        super.onCreate(bundle);
        defpackage.XkvoyZRg ez2rX8ReCYw = ez2rX8ReCYw();
        defpackage.MFAZMTmYMf3 mFAZMTmYMf3 = ez2rX8ReCYw.EXtogiMhuM;
        com.corsair.ledger.MainActivity mainActivity = mFAZMTmYMf3.adDC3e2L;
        defpackage.QuX7t5UZl9 quX7t5UZl9 = new defpackage.QuX7t5UZl9(0, mFAZMTmYMf3.xiZrDbcSW0);
        defpackage.bn1 AARZUJiTa = mainActivity.AARZUJiTa();
        defpackage.fk QQUzIjv3iOC5 = defpackage.x80.QQUzIjv3iOC5(mainActivity);
        QQUzIjv3iOC5.getClass();
        defpackage.y yVar = new defpackage.y(AARZUJiTa, quX7t5UZl9, QQUzIjv3iOC5);
        defpackage.xc IHQe1A4L2xu = defpackage.sz0.IHQe1A4L2xu(defpackage.GhHh9OOt4I.class);
        java.lang.String oh6vYeIP = IHQe1A4L2xu.oh6vYeIP();
        if (oh6vYeIP == null) {
            defpackage.db.fnWB2E7cs("Local and anonymous classes can not be ViewModels");
            return;
        }
        defpackage.t21 t21Var = ((defpackage.GhHh9OOt4I) yVar.DFo87pBq1E5(IHQe1A4L2xu, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(oh6vYeIP))).r1MBDhnF;
        ez2rX8ReCYw.riuEU0zW4 = t21Var;
        if (((defpackage.uk0) t21Var.oh6vYeIP) == null) {
            defpackage.uk0 xiZrDbcSW0 = ez2rX8ReCYw.AARZUJiTa.xiZrDbcSW0();
            if (t21Var.IHQe1A4L2xu) {
                t21Var.oh6vYeIP = xiZrDbcSW0;
            } else {
                defpackage.db.AARZUJiTa("setExtras should only be called for an Activity that extends ComponentActivity");
            }
        }
    }

    @Override // defpackage.h30
    public final defpackage.zm1 adDC3e2L() {
        defpackage.zm1 zm1Var = (defpackage.zm1) this.PAEGRtP0bX.getValue();
        defpackage.tk tkVar = (defpackage.tk) ((defpackage.hn) defpackage.w70.PAEGRtP0bX(this, defpackage.hn.class));
        defpackage.fb0 IHQe1A4L2xu = tkVar.IHQe1A4L2xu();
        defpackage.F7NU4MC0GW f7nu4mc0gw = new defpackage.F7NU4MC0GW(6, tkVar.IHQe1A4L2xu, tkVar.oh6vYeIP);
        zm1Var.getClass();
        return new defpackage.w30(IHQe1A4L2xu, zm1Var, f7nu4mc0gw);
    }

    public final defpackage.XkvoyZRg ez2rX8ReCYw() {
        if (this.NHJTzaLwkd == null) {
            synchronized (this.QQUzIjv3iOC5) {
                try {
                    if (this.NHJTzaLwkd == null) {
                        this.NHJTzaLwkd = new defpackage.XkvoyZRg(this);
                    }
                } finally {
                }
            }
        }
        return this.NHJTzaLwkd;
    }

    @Override // defpackage.nf, defpackage.mf, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        JlrlGoKF(bundle);
        int i = 8;
        int i2 = 0;
        defpackage.me1 me1Var = new defpackage.me1(0, 0, new defpackage.r41(i));
        defpackage.me1 me1Var2 = new defpackage.me1(defpackage.is.IHQe1A4L2xu, defpackage.is.oh6vYeIP, new defpackage.r41(i));
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        defpackage.ps psVar = defpackage.is.r1MBDhnF;
        if (psVar == null) {
            int i3 = android.os.Build.VERSION.SDK_INT;
            psVar = i3 >= 35 ? new defpackage.os() : i3 >= 30 ? new defpackage.ns() : i3 >= 29 ? new defpackage.ms() : i3 >= 28 ? new defpackage.ls() : i3 >= 26 ? new defpackage.ks() : new defpackage.js();
            defpackage.is.r1MBDhnF = psVar;
        }
        defpackage.ps psVar2 = psVar;
        defpackage.z7 z7Var = new defpackage.z7(psVar2, me1Var, me1Var2, this, decorView, 1);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) decorView;
        int i4 = 0;
        while (true) {
            if (i4 >= viewGroup.getChildCount()) {
                defpackage.hs hsVar = new defpackage.hs(z7Var, viewGroup.getContext());
                hsVar.setTag(psVar2);
                hsVar.setVisibility(8);
                hsVar.setWillNotDraw(true);
                viewGroup.addView(hsVar);
                break;
            }
            int i5 = i4 + 1;
            android.view.View childAt = viewGroup.getChildAt(i4);
            if (childAt == null) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof defpackage.ps) {
                break;
            } else {
                i4 = i5;
            }
        }
        z7Var.run();
        android.view.Window window = getWindow();
        window.getClass();
        psVar2.IHQe1A4L2xu(window);
        defpackage.sf sfVar = new defpackage.sf(1749716475, new defpackage.hg0(this, i2), true);
        android.view.ViewGroup.LayoutParams layoutParams = defpackage.of.IHQe1A4L2xu;
        android.view.View childAt2 = ((android.view.ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        defpackage.wg wgVar = childAt2 instanceof defpackage.wg ? (defpackage.wg) childAt2 : null;
        if (wgVar != null) {
            wgVar.setParentCompositionContext(null);
            wgVar.setContent(sfVar);
            return;
        }
        defpackage.wg wgVar2 = new defpackage.wg(this);
        wgVar2.setParentCompositionContext(null);
        wgVar2.setContent(sfVar);
        android.view.View decorView2 = getWindow().getDecorView();
        if (defpackage.a70.SyNS6RMn(decorView2) == null) {
            decorView2.setTag(com.combinations.spin.balbi.R.id.view_tree_lifecycle_owner, this);
        }
        if (defpackage.j70.kd6TUFXn(decorView2) == null) {
            decorView2.setTag(com.combinations.spin.balbi.R.id.view_tree_view_model_store_owner, this);
        }
        if (defpackage.f70.DFo87pBq1E5(decorView2) == null) {
            decorView2.setTag(com.combinations.spin.balbi.R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(wgVar2, defpackage.of.IHQe1A4L2xu);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        defpackage.t21 t21Var = ez2rX8ReCYw().riuEU0zW4;
        if (t21Var != null) {
            t21Var.oh6vYeIP = null;
        }
    }
}
