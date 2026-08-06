package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class lm1 extends defpackage.ul0 implements defpackage.mj, defpackage.ad0 {
    public final defpackage.pn1 BHfvd2J71qpO;
    public defpackage.er1 ZVVdXbWmyCSK;
    public defpackage.jm1 w7APNrr0aGRc;

    public lm1(defpackage.pn1 pn1Var) {
        this.BHfvd2J71qpO = pn1Var;
    }

    @Override // defpackage.ul0
    public final boolean RIHPIrzkudeW() {
        return false;
    }

    @Override // defpackage.ad0
    public final defpackage.wk0 WDYagTQQm9ns(defpackage.xk0 xk0Var, defpackage.qk0 qk0Var, long j) {
        long ZpBGe2uQfcn8;
        defpackage.jm1 jm1Var = this.w7APNrr0aGRc;
        if (jm1Var == null) {
            defpackage.h80.giKS3J6vZuNy("Min size state is not set.");
            defpackage.h7.JhCgjQRTAOCT();
            return null;
        }
        defpackage.pw0 pw0Var = jm1Var.oh71FJcDz6S2;
        defpackage.er1 er1Var = this.ZVVdXbWmyCSK;
        if (er1Var == null) {
            defpackage.h80.giKS3J6vZuNy("Font resolution state is not set.");
            defpackage.h7.JhCgjQRTAOCT();
            return null;
        }
        java.lang.Object value = er1Var.getValue();
        if (!defpackage.ma0.QiMR8OkAhezm(value, jm1Var.WDYagTQQm9ns)) {
            jm1Var.WDYagTQQm9ns = value;
            pw0Var.setValue(java.lang.Boolean.TRUE);
        }
        if (((java.lang.Boolean) pw0Var.getValue()).booleanValue()) {
            ZpBGe2uQfcn8 = defpackage.yk1.ZpBGe2uQfcn8(jm1Var.JhCgjQRTAOCT, jm1Var.giKS3J6vZuNy, jm1Var.fWTAfUmVKrZq, defpackage.yk1.ZpBGe2uQfcn8, 1);
            jm1Var.QiMR8OkAhezm = ZpBGe2uQfcn8;
            pw0Var.setValue(java.lang.Boolean.FALSE);
        }
        long j2 = jm1Var.QiMR8OkAhezm;
        defpackage.ry0 WDYagTQQm9ns = qk0Var.WDYagTQQm9ns(defpackage.nk.WDYagTQQm9ns(j, defpackage.nk.giKS3J6vZuNy((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return xk0Var.hwoZxnIesQBZ(WDYagTQQm9ns.WDYagTQQm9ns, WDYagTQQm9ns.oh71FJcDz6S2, defpackage.bv.WDYagTQQm9ns, new defpackage.a8(WDYagTQQm9ns, 8));
    }

    public final void YZh1E3mnTFwf(defpackage.pn1 pn1Var, defpackage.uz uzVar) {
        defpackage.pf1 pf1Var = pn1Var.ZpBGe2uQfcn8;
        defpackage.vz vzVar = pf1Var.oh71FJcDz6S2;
        defpackage.w00 w00Var = pf1Var.fWTAfUmVKrZq;
        if (w00Var == null) {
            w00Var = defpackage.w00.e6mdH7fiFuta;
        }
        defpackage.s00 s00Var = pf1Var.JhCgjQRTAOCT;
        int i = s00Var != null ? s00Var.ZpBGe2uQfcn8 : 0;
        defpackage.t00 t00Var = pf1Var.WDYagTQQm9ns;
        this.ZVVdXbWmyCSK = ((defpackage.wz) uzVar).giKS3J6vZuNy(vzVar, w00Var, i, t00Var != null ? t00Var.ZpBGe2uQfcn8 : 65535);
        defpackage.n70.maCixPsq4ml2(this);
    }

    @Override // defpackage.ul0
    public final void ZEXjjCYihNTt() {
        defpackage.pn1 KrtOTfE6jiS2 = defpackage.t80.KrtOTfE6jiS2(this.BHfvd2J71qpO, defpackage.la0.UmgHb6n58gfG(this).UmgHb6n58gfG);
        defpackage.uz uzVar = (defpackage.uz) defpackage.nq1.blKFvluuDQOf(this, defpackage.rj.Ns0WNyEWdPsk);
        YZh1E3mnTFwf(KrtOTfE6jiS2, uzVar);
        defpackage.sc0 sc0Var = defpackage.la0.UmgHb6n58gfG(this).UmgHb6n58gfG;
        defpackage.hp hpVar = defpackage.la0.UmgHb6n58gfG(this).blKFvluuDQOf;
        defpackage.er1 er1Var = this.ZVVdXbWmyCSK;
        if (er1Var != null) {
            this.w7APNrr0aGRc = new defpackage.jm1(sc0Var, hpVar, uzVar, KrtOTfE6jiS2, er1Var.getValue());
        } else {
            defpackage.h80.giKS3J6vZuNy("Font resolution state is not set.");
            defpackage.h7.JhCgjQRTAOCT();
        }
    }

    @Override // defpackage.wo
    public final void ZpBGe2uQfcn8() {
        defpackage.jm1 jm1Var = this.w7APNrr0aGRc;
        if (jm1Var != null) {
            defpackage.jm1.ZpBGe2uQfcn8(jm1Var, null, defpackage.la0.UmgHb6n58gfG(this).blKFvluuDQOf, null, 29);
        }
        defpackage.n70.maCixPsq4ml2(this);
    }

    @Override // defpackage.ul0
    public final void awuGf4qH8HFd() {
        this.ZVVdXbWmyCSK = null;
        this.w7APNrr0aGRc = null;
    }

    @Override // defpackage.wo
    public final void cSrsis27vXSh() {
        defpackage.jm1 jm1Var = this.w7APNrr0aGRc;
        if (jm1Var != null) {
            defpackage.jm1.ZpBGe2uQfcn8(jm1Var, defpackage.la0.UmgHb6n58gfG(this).UmgHb6n58gfG, null, null, 30);
        }
        defpackage.n70.maCixPsq4ml2(this);
    }
}
