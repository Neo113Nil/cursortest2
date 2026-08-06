package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class dt1 extends defpackage.yv0 {
    public defpackage.ga GE9mJIPrb8gP;
    public final defpackage.pw0 P05cfTpS5W5L;
    public final defpackage.ys1 QiMR8OkAhezm;
    public float e6mdH7fiFuta;
    public final defpackage.pw0 WDYagTQQm9ns = defpackage.w60.hH0RRJrNssvh(new defpackage.ae1(0));
    public final defpackage.pw0 oh71FJcDz6S2 = defpackage.w60.hH0RRJrNssvh(java.lang.Boolean.FALSE);

    public dt1(defpackage.l40 l40Var) {
        defpackage.ys1 ys1Var = new defpackage.ys1(l40Var);
        ys1Var.oh71FJcDz6S2 = new defpackage.w2(15, this);
        this.QiMR8OkAhezm = ys1Var;
        this.P05cfTpS5W5L = new defpackage.pw0(defpackage.gs1.ZpBGe2uQfcn8, defpackage.jVUAPb5NnIYW.z16KqenTjq8o);
        this.e6mdH7fiFuta = 1.0f;
    }

    @Override // defpackage.yv0
    public final long JhCgjQRTAOCT() {
        return ((defpackage.ae1) this.WDYagTQQm9ns.getValue()).ZpBGe2uQfcn8;
    }

    @Override // defpackage.yv0
    public final void WDYagTQQm9ns(defpackage.ld0 ld0Var) {
        defpackage.ld ldVar = ld0Var.WDYagTQQm9ns;
        defpackage.ga gaVar = this.GE9mJIPrb8gP;
        defpackage.ys1 ys1Var = this.QiMR8OkAhezm;
        if (gaVar == null) {
            gaVar = (defpackage.ga) ys1Var.QiMR8OkAhezm.getValue();
        }
        if (((java.lang.Boolean) this.oh71FJcDz6S2.getValue()).booleanValue() && ld0Var.getLayoutDirection() == defpackage.sc0.oh71FJcDz6S2) {
            long NkfcFfdaVTox = ldVar.NkfcFfdaVTox();
            defpackage.a7 a7Var = ldVar.oh71FJcDz6S2;
            long Ns0WNyEWdPsk = a7Var.Ns0WNyEWdPsk();
            a7Var.oh71FJcDz6S2().fNwYGHIYeJcR();
            try {
                ((defpackage.k0) a7Var.giKS3J6vZuNy).IJ0hOnjhPOri(-1.0f, 1.0f, NkfcFfdaVTox);
                ys1Var.WDYagTQQm9ns(ld0Var, this.e6mdH7fiFuta, gaVar);
            } finally {
                a7Var.oh71FJcDz6S2().e6mdH7fiFuta();
                a7Var.IJ0hOnjhPOri(Ns0WNyEWdPsk);
            }
        } else {
            ys1Var.WDYagTQQm9ns(ld0Var, this.e6mdH7fiFuta, gaVar);
        }
        this.P05cfTpS5W5L.getValue();
    }

    @Override // defpackage.yv0
    public final void ZpBGe2uQfcn8(float f) {
        this.e6mdH7fiFuta = f;
    }

    @Override // defpackage.yv0
    public final void giKS3J6vZuNy(defpackage.ga gaVar) {
        this.GE9mJIPrb8gP = gaVar;
    }
}
