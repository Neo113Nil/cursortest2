package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class wu0 extends defpackage.bv0 {
    public static final defpackage.wu0 fWTAfUmVKrZq = new defpackage.wu0(1, 0, 2);

    @Override // defpackage.bv0
    public final void ZpBGe2uQfcn8(defpackage.z20 z20Var, defpackage.e7 e7Var, defpackage.je1 je1Var, defpackage.i41 i41Var, defpackage.cv0 cv0Var) {
        int fWTAfUmVKrZq2 = z20Var.fWTAfUmVKrZq(0);
        int i = je1Var.maCixPsq4ml2;
        int w6IV1lieBIux = je1Var.w6IV1lieBIux(je1Var.giKS3J6vZuNy, je1Var.s0TASMVLSWD5(i));
        int QiMR8OkAhezm = je1Var.QiMR8OkAhezm(je1Var.giKS3J6vZuNy, je1Var.s0TASMVLSWD5(i + 1));
        for (int max = java.lang.Math.max(w6IV1lieBIux, QiMR8OkAhezm - fWTAfUmVKrZq2); max < QiMR8OkAhezm; max++) {
            java.lang.Object obj = je1Var.fWTAfUmVKrZq[je1Var.P05cfTpS5W5L(max)];
            if (obj instanceof defpackage.j30) {
                i41Var.WDYagTQQm9ns((defpackage.j30) obj);
            } else if (obj instanceof defpackage.f31) {
                ((defpackage.f31) obj).fWTAfUmVKrZq();
            }
        }
        if (fWTAfUmVKrZq2 <= 0) {
            defpackage.ej.ZpBGe2uQfcn8("Check failed");
        }
        int i2 = je1Var.maCixPsq4ml2;
        int w6IV1lieBIux2 = je1Var.w6IV1lieBIux(je1Var.giKS3J6vZuNy, je1Var.s0TASMVLSWD5(i2));
        int QiMR8OkAhezm2 = je1Var.QiMR8OkAhezm(je1Var.giKS3J6vZuNy, je1Var.s0TASMVLSWD5(i2 + 1)) - fWTAfUmVKrZq2;
        if (QiMR8OkAhezm2 < w6IV1lieBIux2) {
            defpackage.ej.ZpBGe2uQfcn8("Check failed");
        }
        je1Var.BXaznwstz2U0(QiMR8OkAhezm2, fWTAfUmVKrZq2, i2);
        int i3 = je1Var.e6mdH7fiFuta;
        if (i3 >= w6IV1lieBIux2) {
            je1Var.e6mdH7fiFuta = i3 - fWTAfUmVKrZq2;
        }
    }
}
