package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class vd0 implements defpackage.oh1 {
    public final defpackage.hn0 ZpBGe2uQfcn8;
    public final /* synthetic */ java.lang.Object fWTAfUmVKrZq;
    public final /* synthetic */ defpackage.xd0 giKS3J6vZuNy;

    public vd0(defpackage.xd0 xd0Var, java.lang.Object obj) {
        this.giKS3J6vZuNy = xd0Var;
        this.fWTAfUmVKrZq = obj;
        int[] iArr = defpackage.t90.ZpBGe2uQfcn8;
        this.ZpBGe2uQfcn8 = new defpackage.hn0();
    }

    @Override // defpackage.oh1
    public final void JhCgjQRTAOCT(int i, long j) {
        defpackage.xd0 xd0Var = this.giKS3J6vZuNy;
        defpackage.jd0 jd0Var = (defpackage.jd0) xd0Var.gUjdnLbkVAaA.QiMR8OkAhezm(this.fWTAfUmVKrZq);
        if (jd0Var == null || !jd0Var.KrtOTfE6jiS2()) {
            return;
        }
        int i2 = ((defpackage.ho0) ((defpackage.qn0) jd0Var.gUjdnLbkVAaA()).oh71FJcDz6S2).QiMR8OkAhezm;
        if (i < 0 || i >= i2) {
            defpackage.e80.JhCgjQRTAOCT("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (jd0Var.IBvW5fLsPuHy()) {
            defpackage.e80.ZpBGe2uQfcn8("Pre-measure called on node that is not placed");
        }
        defpackage.jd0 jd0Var2 = xd0Var.WDYagTQQm9ns;
        jd0Var2.ZVVdXbWmyCSK = true;
        ((defpackage.u) defpackage.md0.ZpBGe2uQfcn8(jd0Var)).IJ0hOnjhPOri((defpackage.jd0) ((defpackage.qn0) jd0Var.gUjdnLbkVAaA()).get(i), j);
        jd0Var2.ZVVdXbWmyCSK = false;
        this.ZpBGe2uQfcn8.ZpBGe2uQfcn8(i);
    }

    @Override // defpackage.oh1
    public final void ZpBGe2uQfcn8() {
        defpackage.xd0.fWTAfUmVKrZq(this.giKS3J6vZuNy, this.fWTAfUmVKrZq);
    }

    @Override // defpackage.oh1
    public final int fWTAfUmVKrZq() {
        defpackage.jd0 jd0Var = (defpackage.jd0) this.giKS3J6vZuNy.gUjdnLbkVAaA.QiMR8OkAhezm(this.fWTAfUmVKrZq);
        if (jd0Var != null) {
            return ((defpackage.ho0) ((defpackage.qn0) jd0Var.gUjdnLbkVAaA()).oh71FJcDz6S2).QiMR8OkAhezm;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [vp0] */
    /* JADX WARN: Type inference failed for: r5v10, types: [ul0] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [ul0] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [ho0] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [ho0] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.oh1
    public final void giKS3J6vZuNy(defpackage.vp0 vp0Var) {
        defpackage.qp1 qp1Var;
        defpackage.or0 or0Var;
        defpackage.jd0 jd0Var = (defpackage.jd0) this.giKS3J6vZuNy.gUjdnLbkVAaA.QiMR8OkAhezm(this.fWTAfUmVKrZq);
        defpackage.ul0 ul0Var = (jd0Var == null || (or0Var = jd0Var.IBvW5fLsPuHy) == null) ? null : or0Var.oh71FJcDz6S2;
        if (ul0Var == null || !ul0Var.s0TASMVLSWD5) {
            return;
        }
        if (!ul0Var.WDYagTQQm9ns.s0TASMVLSWD5) {
            defpackage.e80.giKS3J6vZuNy("visitSubtreeIf called on an unattached node");
        }
        defpackage.ho0 ho0Var = new defpackage.ho0(new defpackage.ul0[16]);
        defpackage.ul0 ul0Var2 = ul0Var.WDYagTQQm9ns;
        defpackage.ul0 ul0Var3 = ul0Var2.GE9mJIPrb8gP;
        if (ul0Var3 == null) {
            defpackage.la0.oh71FJcDz6S2(ho0Var, ul0Var2);
        } else {
            ho0Var.giKS3J6vZuNy(ul0Var3);
        }
        while (true) {
            int i = ho0Var.QiMR8OkAhezm;
            if (i == 0) {
                return;
            }
            defpackage.ul0 ul0Var4 = (defpackage.ul0) ho0Var.Ns0WNyEWdPsk(i - 1);
            if ((ul0Var4.P05cfTpS5W5L & 262144) != 0) {
                for (defpackage.ul0 ul0Var5 = ul0Var4; ul0Var5 != null && ul0Var5.s0TASMVLSWD5; ul0Var5 = ul0Var5.GE9mJIPrb8gP) {
                    if ((ul0Var5.QiMR8OkAhezm & 262144) != 0) {
                        ?? r6 = 0;
                        defpackage.xo xoVar = ul0Var5;
                        while (xoVar != 0) {
                            if (xoVar instanceof defpackage.rp1) {
                                defpackage.rp1 rp1Var = (defpackage.rp1) xoVar;
                                boolean equals = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(rp1Var.WmetiUbpKU9I());
                                defpackage.qp1 qp1Var2 = defpackage.qp1.oh71FJcDz6S2;
                                if (equals) {
                                    vp0Var.P05cfTpS5W5L(rp1Var);
                                    qp1Var = qp1Var2;
                                } else {
                                    qp1Var = defpackage.qp1.WDYagTQQm9ns;
                                }
                                if (qp1Var == defpackage.qp1.QiMR8OkAhezm) {
                                    return;
                                }
                                if (qp1Var == qp1Var2) {
                                    break;
                                }
                            } else if ((xoVar.QiMR8OkAhezm & 262144) != 0 && (xoVar instanceof defpackage.xo)) {
                                defpackage.ul0 ul0Var6 = xoVar.ZVVdXbWmyCSK;
                                int i2 = 0;
                                xoVar = xoVar;
                                r6 = r6;
                                while (ul0Var6 != null) {
                                    if ((ul0Var6.QiMR8OkAhezm & 262144) != 0) {
                                        i2++;
                                        r6 = r6;
                                        if (i2 == 1) {
                                            xoVar = ul0Var6;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new defpackage.ho0(new defpackage.ul0[16]);
                                            }
                                            if (xoVar != 0) {
                                                r6.giKS3J6vZuNy(xoVar);
                                                xoVar = 0;
                                            }
                                            r6.giKS3J6vZuNy(ul0Var6);
                                        }
                                    }
                                    ul0Var6 = ul0Var6.GE9mJIPrb8gP;
                                    xoVar = xoVar;
                                    r6 = r6;
                                }
                                if (i2 == 1) {
                                }
                            }
                            xoVar = defpackage.la0.P05cfTpS5W5L(r6);
                        }
                    }
                }
            }
            defpackage.la0.oh71FJcDz6S2(ho0Var, ul0Var4);
        }
    }
}
