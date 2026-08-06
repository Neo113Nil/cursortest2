package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class wz implements defpackage.uz {
    public final defpackage.b00 JhCgjQRTAOCT;
    public final defpackage.k0 WDYagTQQm9ns;
    public final defpackage.r1 ZpBGe2uQfcn8;
    public final defpackage.pd1 fWTAfUmVKrZq;
    public final defpackage.s1 giKS3J6vZuNy;
    public final defpackage.fNwYGHIYeJcR oh71FJcDz6S2;

    public wz(defpackage.r1 r1Var, defpackage.s1 s1Var) {
        defpackage.pd1 pd1Var = defpackage.xz.ZpBGe2uQfcn8;
        defpackage.b00 b00Var = new defpackage.b00(defpackage.xz.giKS3J6vZuNy);
        defpackage.k0 k0Var = new defpackage.k0(18, (byte) 0);
        this.ZpBGe2uQfcn8 = r1Var;
        this.giKS3J6vZuNy = s1Var;
        this.fWTAfUmVKrZq = pd1Var;
        this.JhCgjQRTAOCT = b00Var;
        this.WDYagTQQm9ns = k0Var;
        this.oh71FJcDz6S2 = new defpackage.fNwYGHIYeJcR(10, this);
    }

    public final defpackage.er1 ZpBGe2uQfcn8(defpackage.br1 br1Var) {
        defpackage.pd1 pd1Var = this.fWTAfUmVKrZq;
        defpackage.fWTAfUmVKrZq fwtafumvkrzq = new defpackage.fWTAfUmVKrZq(13, this, br1Var);
        synchronized (((defpackage.l21) pd1Var.giKS3J6vZuNy)) {
            defpackage.er1 er1Var = (defpackage.er1) ((defpackage.rj0) pd1Var.fWTAfUmVKrZq).fWTAfUmVKrZq(br1Var);
            if (er1Var != null) {
                if (er1Var.fWTAfUmVKrZq()) {
                    return er1Var;
                }
            }
            try {
                defpackage.er1 er1Var2 = (defpackage.er1) fwtafumvkrzq.P05cfTpS5W5L(new defpackage.m91(11, pd1Var, br1Var));
                synchronized (((defpackage.l21) pd1Var.giKS3J6vZuNy)) {
                    if (((defpackage.rj0) pd1Var.fWTAfUmVKrZq).fWTAfUmVKrZq(br1Var) == null && er1Var2.fWTAfUmVKrZq()) {
                        ((defpackage.rj0) pd1Var.fWTAfUmVKrZq).JhCgjQRTAOCT(br1Var, er1Var2);
                    }
                }
                return er1Var2;
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalStateException("Could not load font", e);
            }
        }
    }

    public final defpackage.er1 giKS3J6vZuNy(defpackage.vz vzVar, defpackage.w00 w00Var, int i, int i2) {
        defpackage.s1 s1Var = this.giKS3J6vZuNy;
        s1Var.getClass();
        int i3 = s1Var.WDYagTQQm9ns;
        defpackage.w00 w00Var2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? w00Var : new defpackage.w00(defpackage.j80.T1fB7bDYiVJQ(w00Var.WDYagTQQm9ns + i3, 1, 1000));
        this.ZpBGe2uQfcn8.getClass();
        return ZpBGe2uQfcn8(new defpackage.br1(vzVar, w00Var2, i, i2, null));
    }
}
