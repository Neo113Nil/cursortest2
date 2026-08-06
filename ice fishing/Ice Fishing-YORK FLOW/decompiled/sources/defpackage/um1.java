package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class um1 implements defpackage.rz0 {
    public final defpackage.be0 GE9mJIPrb8gP;
    public boolean JhCgjQRTAOCT;
    public android.graphics.Rect Ns0WNyEWdPsk;
    public defpackage.o60 P05cfTpS5W5L;
    public defpackage.nm1 QiMR8OkAhezm;
    public defpackage.y10 WDYagTQQm9ns;
    public final android.view.View ZpBGe2uQfcn8;
    public final java.util.ArrayList e6mdH7fiFuta;
    public final defpackage.cn fNwYGHIYeJcR;
    public final defpackage.vm1 fWTAfUmVKrZq;
    public defpackage.gUjdnLbkVAaA gUjdnLbkVAaA;
    public final defpackage.a7 giKS3J6vZuNy;
    public final defpackage.ho0 h3m55N1URyyK;
    public defpackage.y10 oh71FJcDz6S2;

    public um1(android.view.View view, defpackage.u uVar) {
        defpackage.a7 a7Var = new defpackage.a7(view);
        defpackage.vm1 vm1Var = new defpackage.vm1(android.view.Choreographer.getInstance());
        this.ZpBGe2uQfcn8 = view;
        this.giKS3J6vZuNy = a7Var;
        this.fWTAfUmVKrZq = vm1Var;
        this.WDYagTQQm9ns = defpackage.qv0.XntWc4eZSQ8j;
        this.oh71FJcDz6S2 = defpackage.qv0.WmetiUbpKU9I;
        this.QiMR8OkAhezm = new defpackage.nm1("", defpackage.in1.giKS3J6vZuNy, 4);
        this.P05cfTpS5W5L = defpackage.o60.oh71FJcDz6S2;
        this.e6mdH7fiFuta = new java.util.ArrayList();
        this.GE9mJIPrb8gP = defpackage.t80.oCu53ZX2v4Ju(defpackage.yf0.oh71FJcDz6S2, new defpackage.w2(14, this));
        this.fNwYGHIYeJcR = new defpackage.cn(uVar, a7Var);
        this.h3m55N1URyyK = new defpackage.ho0(new defpackage.tm1[16]);
    }

    @Override // defpackage.rz0
    public final void JhCgjQRTAOCT(defpackage.nm1 nm1Var, defpackage.nm1 nm1Var2) {
        boolean z = (defpackage.in1.giKS3J6vZuNy(this.QiMR8OkAhezm.giKS3J6vZuNy, nm1Var2.giKS3J6vZuNy) && defpackage.ma0.QiMR8OkAhezm(this.QiMR8OkAhezm.fWTAfUmVKrZq, nm1Var2.fWTAfUmVKrZq)) ? false : true;
        this.QiMR8OkAhezm = nm1Var2;
        int size = this.e6mdH7fiFuta.size();
        for (int i = 0; i < size; i++) {
            defpackage.o31 o31Var = (defpackage.o31) ((java.lang.ref.WeakReference) this.e6mdH7fiFuta.get(i)).get();
            if (o31Var != null) {
                o31Var.JhCgjQRTAOCT = nm1Var2;
            }
        }
        defpackage.cn cnVar = this.fNwYGHIYeJcR;
        synchronized (cnVar.fWTAfUmVKrZq) {
            cnVar.GE9mJIPrb8gP = null;
            cnVar.fNwYGHIYeJcR = null;
            cnVar.Ns0WNyEWdPsk = null;
            cnVar.h3m55N1URyyK = defpackage.n.ZVVdXbWmyCSK;
            cnVar.gUjdnLbkVAaA = null;
            cnVar.T1fB7bDYiVJQ = null;
        }
        if (defpackage.ma0.QiMR8OkAhezm(nm1Var, nm1Var2)) {
            if (z) {
                defpackage.a7 a7Var = this.giKS3J6vZuNy;
                int oh71FJcDz6S2 = defpackage.in1.oh71FJcDz6S2(nm1Var2.giKS3J6vZuNy);
                int WDYagTQQm9ns = defpackage.in1.WDYagTQQm9ns(nm1Var2.giKS3J6vZuNy);
                defpackage.in1 in1Var = this.QiMR8OkAhezm.fWTAfUmVKrZq;
                int oh71FJcDz6S22 = in1Var != null ? defpackage.in1.oh71FJcDz6S2(in1Var.ZpBGe2uQfcn8) : -1;
                defpackage.in1 in1Var2 = this.QiMR8OkAhezm.fWTAfUmVKrZq;
                ((android.view.inputmethod.InputMethodManager) ((defpackage.be0) a7Var.fWTAfUmVKrZq).getValue()).updateSelection((android.view.View) a7Var.giKS3J6vZuNy, oh71FJcDz6S2, WDYagTQQm9ns, oh71FJcDz6S22, in1Var2 != null ? defpackage.in1.WDYagTQQm9ns(in1Var2.ZpBGe2uQfcn8) : -1);
                return;
            }
            return;
        }
        if (nm1Var != null && (!defpackage.ma0.QiMR8OkAhezm(nm1Var.ZpBGe2uQfcn8.oh71FJcDz6S2, nm1Var2.ZpBGe2uQfcn8.oh71FJcDz6S2) || (defpackage.in1.giKS3J6vZuNy(nm1Var.giKS3J6vZuNy, nm1Var2.giKS3J6vZuNy) && !defpackage.ma0.QiMR8OkAhezm(nm1Var.fWTAfUmVKrZq, nm1Var2.fWTAfUmVKrZq)))) {
            defpackage.a7 a7Var2 = this.giKS3J6vZuNy;
            ((android.view.inputmethod.InputMethodManager) ((defpackage.be0) a7Var2.fWTAfUmVKrZq).getValue()).restartInput((android.view.View) a7Var2.giKS3J6vZuNy);
            return;
        }
        int size2 = this.e6mdH7fiFuta.size();
        for (int i2 = 0; i2 < size2; i2++) {
            defpackage.o31 o31Var2 = (defpackage.o31) ((java.lang.ref.WeakReference) this.e6mdH7fiFuta.get(i2)).get();
            if (o31Var2 != null) {
                defpackage.nm1 nm1Var3 = this.QiMR8OkAhezm;
                defpackage.a7 a7Var3 = this.giKS3J6vZuNy;
                if (o31Var2.P05cfTpS5W5L) {
                    o31Var2.JhCgjQRTAOCT = nm1Var3;
                    if (o31Var2.oh71FJcDz6S2) {
                        ((android.view.inputmethod.InputMethodManager) ((defpackage.be0) a7Var3.fWTAfUmVKrZq).getValue()).updateExtractedText((android.view.View) a7Var3.giKS3J6vZuNy, o31Var2.WDYagTQQm9ns, defpackage.t80.Wc0TdmRSwbbi(nm1Var3));
                    }
                    defpackage.in1 in1Var3 = nm1Var3.fWTAfUmVKrZq;
                    long j = nm1Var3.giKS3J6vZuNy;
                    int oh71FJcDz6S23 = in1Var3 != null ? defpackage.in1.oh71FJcDz6S2(in1Var3.ZpBGe2uQfcn8) : -1;
                    defpackage.in1 in1Var4 = nm1Var3.fWTAfUmVKrZq;
                    ((android.view.inputmethod.InputMethodManager) ((defpackage.be0) a7Var3.fWTAfUmVKrZq).getValue()).updateSelection((android.view.View) a7Var3.giKS3J6vZuNy, defpackage.in1.oh71FJcDz6S2(j), defpackage.in1.WDYagTQQm9ns(j), oh71FJcDz6S23, in1Var4 != null ? defpackage.in1.WDYagTQQm9ns(in1Var4.ZpBGe2uQfcn8) : -1);
                }
            }
        }
    }

    @Override // defpackage.rz0
    public final void P05cfTpS5W5L(defpackage.s31 s31Var) {
        android.graphics.Rect rect;
        this.Ns0WNyEWdPsk = new android.graphics.Rect(defpackage.ok0.CZa7MwI9IzLd(s31Var.ZpBGe2uQfcn8), defpackage.ok0.CZa7MwI9IzLd(s31Var.giKS3J6vZuNy), defpackage.ok0.CZa7MwI9IzLd(s31Var.fWTAfUmVKrZq), defpackage.ok0.CZa7MwI9IzLd(s31Var.JhCgjQRTAOCT));
        if (!this.e6mdH7fiFuta.isEmpty() || (rect = this.Ns0WNyEWdPsk) == null) {
            return;
        }
        this.ZpBGe2uQfcn8.requestRectangleOnScreen(new android.graphics.Rect(rect));
    }

    @Override // defpackage.rz0
    public final void QiMR8OkAhezm() {
        this.JhCgjQRTAOCT = false;
        this.WDYagTQQm9ns = defpackage.qv0.s0TASMVLSWD5;
        this.oh71FJcDz6S2 = defpackage.qv0.BHfvd2J71qpO;
        this.Ns0WNyEWdPsk = null;
        e6mdH7fiFuta(defpackage.tm1.oh71FJcDz6S2);
    }

    @Override // defpackage.rz0
    public final void WDYagTQQm9ns() {
        e6mdH7fiFuta(defpackage.tm1.QiMR8OkAhezm);
    }

    @Override // defpackage.rz0
    public final void ZpBGe2uQfcn8(defpackage.nm1 nm1Var, defpackage.zs0 zs0Var, defpackage.bn1 bn1Var, defpackage.ub ubVar, defpackage.s31 s31Var, defpackage.s31 s31Var2) {
        defpackage.cn cnVar = this.fNwYGHIYeJcR;
        synchronized (cnVar.fWTAfUmVKrZq) {
            try {
                cnVar.GE9mJIPrb8gP = nm1Var;
                cnVar.fNwYGHIYeJcR = zs0Var;
                cnVar.Ns0WNyEWdPsk = bn1Var;
                cnVar.h3m55N1URyyK = ubVar;
                cnVar.gUjdnLbkVAaA = s31Var;
                cnVar.T1fB7bDYiVJQ = s31Var2;
                if (!cnVar.WDYagTQQm9ns) {
                    if (cnVar.JhCgjQRTAOCT) {
                    }
                }
                cnVar.ZpBGe2uQfcn8();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void e6mdH7fiFuta(defpackage.tm1 tm1Var) {
        this.h3m55N1URyyK.giKS3J6vZuNy(tm1Var);
        if (this.gUjdnLbkVAaA == null) {
            defpackage.gUjdnLbkVAaA gujdnlbkvaaa = new defpackage.gUjdnLbkVAaA(12, this);
            this.fWTAfUmVKrZq.execute(gujdnlbkvaaa);
            this.gUjdnLbkVAaA = gujdnlbkvaaa;
        }
    }

    @Override // defpackage.rz0
    public final void fWTAfUmVKrZq() {
        e6mdH7fiFuta(defpackage.tm1.WDYagTQQm9ns);
    }

    @Override // defpackage.rz0
    public final void giKS3J6vZuNy(defpackage.nm1 nm1Var, defpackage.o60 o60Var, defpackage.eSwlWMUpitz8 eswlwmupitz8, defpackage.ql qlVar) {
        this.JhCgjQRTAOCT = true;
        this.QiMR8OkAhezm = nm1Var;
        this.P05cfTpS5W5L = o60Var;
        this.WDYagTQQm9ns = eswlwmupitz8;
        this.oh71FJcDz6S2 = qlVar;
        e6mdH7fiFuta(defpackage.tm1.WDYagTQQm9ns);
    }

    @Override // defpackage.rz0
    public final void oh71FJcDz6S2() {
        e6mdH7fiFuta(defpackage.tm1.P05cfTpS5W5L);
    }
}
