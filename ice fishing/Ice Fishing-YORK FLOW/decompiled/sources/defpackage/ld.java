package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ld implements defpackage.ct {
    public defpackage.j2 P05cfTpS5W5L;
    public defpackage.j2 QiMR8OkAhezm;
    public final defpackage.kd WDYagTQQm9ns;
    public final defpackage.a7 oh71FJcDz6S2;

    public ld() {
        defpackage.kp kpVar = defpackage.jr0.giKS3J6vZuNy;
        defpackage.kd kdVar = new defpackage.kd();
        kdVar.ZpBGe2uQfcn8 = kpVar;
        kdVar.giKS3J6vZuNy = defpackage.sc0.WDYagTQQm9ns;
        kdVar.fWTAfUmVKrZq = defpackage.wu.ZpBGe2uQfcn8;
        kdVar.JhCgjQRTAOCT = 0L;
        this.WDYagTQQm9ns = kdVar;
        this.oh71FJcDz6S2 = new defpackage.a7(this);
    }

    public static defpackage.j2 ZpBGe2uQfcn8(defpackage.ld ldVar, long j, defpackage.dt dtVar, int i) {
        defpackage.j2 oh71FJcDz6S2 = ldVar.oh71FJcDz6S2(dtVar);
        android.graphics.Paint paint = (android.graphics.Paint) oh71FJcDz6S2.giKS3J6vZuNy;
        if (!defpackage.pf.fWTAfUmVKrZq(defpackage.ok0.JhCgjQRTAOCT(paint.getColor()), j)) {
            oh71FJcDz6S2.WDYagTQQm9ns(j);
        }
        if (((android.graphics.Shader) oh71FJcDz6S2.fWTAfUmVKrZq) != null) {
            oh71FJcDz6S2.P05cfTpS5W5L(null);
        }
        if (!defpackage.ma0.QiMR8OkAhezm((defpackage.ga) oh71FJcDz6S2.JhCgjQRTAOCT, null)) {
            oh71FJcDz6S2.oh71FJcDz6S2(null);
        }
        if (oh71FJcDz6S2.ZpBGe2uQfcn8 != i) {
            oh71FJcDz6S2.JhCgjQRTAOCT(i);
        }
        if (paint.isFilterBitmap()) {
            return oh71FJcDz6S2;
        }
        oh71FJcDz6S2.QiMR8OkAhezm(1);
        return oh71FJcDz6S2;
    }

    @Override // defpackage.ct
    public final void EgL5gQQnyJKX(long j, long j2, long j3, float f) {
        defpackage.id idVar = this.WDYagTQQm9ns.fWTAfUmVKrZq;
        defpackage.j2 j2Var = this.P05cfTpS5W5L;
        if (j2Var == null) {
            j2Var = defpackage.jr0.QiMR8OkAhezm();
            j2Var.fNwYGHIYeJcR(1);
            this.P05cfTpS5W5L = j2Var;
        }
        android.graphics.Paint paint = (android.graphics.Paint) j2Var.giKS3J6vZuNy;
        if (!defpackage.pf.fWTAfUmVKrZq(defpackage.ok0.JhCgjQRTAOCT(paint.getColor()), j)) {
            j2Var.WDYagTQQm9ns(j);
        }
        if (((android.graphics.Shader) j2Var.fWTAfUmVKrZq) != null) {
            j2Var.P05cfTpS5W5L(null);
        }
        if (!defpackage.ma0.QiMR8OkAhezm((defpackage.ga) j2Var.JhCgjQRTAOCT, null)) {
            j2Var.oh71FJcDz6S2(null);
        }
        if (j2Var.ZpBGe2uQfcn8 != 3) {
            j2Var.JhCgjQRTAOCT(3);
        }
        if (paint.getStrokeWidth() != f) {
            j2Var.Ns0WNyEWdPsk(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (j2Var.ZpBGe2uQfcn8() != 1) {
            j2Var.e6mdH7fiFuta(1);
        }
        if (j2Var.giKS3J6vZuNy() != 0) {
            j2Var.GE9mJIPrb8gP(0);
        }
        if (!paint.isFilterBitmap()) {
            j2Var.QiMR8OkAhezm(1);
        }
        idVar.h3m55N1URyyK(j2, j3, j2Var);
    }

    @Override // defpackage.ct
    public final void IJ0hOnjhPOri(long j, long j2, long j3, long j4) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.WDYagTQQm9ns.fWTAfUmVKrZq.GE9mJIPrb8gP(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat((int) (j3 >> 32)) + java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L)) + java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat((int) (j4 >> 32)), java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)), ZpBGe2uQfcn8(this, j, defpackage.yw.ZpBGe2uQfcn8, 3));
    }

    @Override // defpackage.ct
    public final void P05cfTpS5W5L(defpackage.s2 s2Var, defpackage.vb vbVar, float f, defpackage.dt dtVar, int i) {
        this.WDYagTQQm9ns.fWTAfUmVKrZq.QiMR8OkAhezm(s2Var, fWTAfUmVKrZq(vbVar, dtVar, f, null, i, 1));
    }

    @Override // defpackage.ct
    public final void PS16moFv2oLu(defpackage.s2 s2Var, long j, defpackage.dt dtVar) {
        this.WDYagTQQm9ns.fWTAfUmVKrZq.QiMR8OkAhezm(s2Var, ZpBGe2uQfcn8(this, j, dtVar, 3));
    }

    public final void WDYagTQQm9ns(defpackage.w1 w1Var, defpackage.ga gaVar) {
        this.WDYagTQQm9ns.fWTAfUmVKrZq.ZpBGe2uQfcn8(w1Var, fWTAfUmVKrZq(null, defpackage.yw.ZpBGe2uQfcn8, 1.0f, gaVar, 3, 1));
    }

    public final defpackage.j2 fWTAfUmVKrZq(defpackage.vb vbVar, defpackage.dt dtVar, float f, defpackage.ga gaVar, int i, int i2) {
        defpackage.j2 oh71FJcDz6S2 = oh71FJcDz6S2(dtVar);
        android.graphics.Paint paint = (android.graphics.Paint) oh71FJcDz6S2.giKS3J6vZuNy;
        if (vbVar != null) {
            vbVar.ZpBGe2uQfcn8(f, JhCgjQRTAOCT(), oh71FJcDz6S2);
        } else {
            if (((android.graphics.Shader) oh71FJcDz6S2.fWTAfUmVKrZq) != null) {
                oh71FJcDz6S2.P05cfTpS5W5L(null);
            }
            long JhCgjQRTAOCT = defpackage.ok0.JhCgjQRTAOCT(paint.getColor());
            long j = defpackage.pf.giKS3J6vZuNy;
            if (!defpackage.pf.fWTAfUmVKrZq(JhCgjQRTAOCT, j)) {
                oh71FJcDz6S2.WDYagTQQm9ns(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                oh71FJcDz6S2.fWTAfUmVKrZq(f);
            }
        }
        if (!defpackage.ma0.QiMR8OkAhezm((defpackage.ga) oh71FJcDz6S2.JhCgjQRTAOCT, gaVar)) {
            oh71FJcDz6S2.oh71FJcDz6S2(gaVar);
        }
        if (oh71FJcDz6S2.ZpBGe2uQfcn8 != i) {
            oh71FJcDz6S2.JhCgjQRTAOCT(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return oh71FJcDz6S2;
        }
        oh71FJcDz6S2.QiMR8OkAhezm(i2);
        return oh71FJcDz6S2;
    }

    @Override // defpackage.ct
    public final defpackage.sc0 getLayoutDirection() {
        return this.WDYagTQQm9ns.giKS3J6vZuNy;
    }

    @Override // defpackage.hp
    public final float giKS3J6vZuNy() {
        return this.WDYagTQQm9ns.ZpBGe2uQfcn8.giKS3J6vZuNy();
    }

    @Override // defpackage.hp
    public final float h3m55N1URyyK() {
        return this.WDYagTQQm9ns.ZpBGe2uQfcn8.h3m55N1URyyK();
    }

    public final defpackage.j2 oh71FJcDz6S2(defpackage.dt dtVar) {
        if (defpackage.ma0.QiMR8OkAhezm(dtVar, defpackage.yw.ZpBGe2uQfcn8)) {
            defpackage.j2 j2Var = this.QiMR8OkAhezm;
            if (j2Var != null) {
                return j2Var;
            }
            defpackage.j2 QiMR8OkAhezm = defpackage.jr0.QiMR8OkAhezm();
            QiMR8OkAhezm.fNwYGHIYeJcR(0);
            this.QiMR8OkAhezm = QiMR8OkAhezm;
            return QiMR8OkAhezm;
        }
        if (!(dtVar instanceof defpackage.bh1)) {
            defpackage.h7.T1fB7bDYiVJQ();
            return null;
        }
        defpackage.j2 j2Var2 = this.P05cfTpS5W5L;
        if (j2Var2 == null) {
            j2Var2 = defpackage.jr0.QiMR8OkAhezm();
            j2Var2.fNwYGHIYeJcR(1);
            this.P05cfTpS5W5L = j2Var2;
        }
        android.graphics.Paint paint = (android.graphics.Paint) j2Var2.giKS3J6vZuNy;
        float strokeWidth = paint.getStrokeWidth();
        defpackage.bh1 bh1Var = (defpackage.bh1) dtVar;
        float f = bh1Var.ZpBGe2uQfcn8;
        if (strokeWidth != f) {
            j2Var2.Ns0WNyEWdPsk(f);
        }
        int ZpBGe2uQfcn8 = j2Var2.ZpBGe2uQfcn8();
        int i = bh1Var.fWTAfUmVKrZq;
        if (ZpBGe2uQfcn8 != i) {
            j2Var2.e6mdH7fiFuta(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = bh1Var.giKS3J6vZuNy;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int giKS3J6vZuNy = j2Var2.giKS3J6vZuNy();
        int i2 = bh1Var.JhCgjQRTAOCT;
        if (giKS3J6vZuNy == i2) {
            return j2Var2;
        }
        j2Var2.GE9mJIPrb8gP(i2);
        return j2Var2;
    }

    @Override // defpackage.ct
    public final defpackage.a7 qjMheFZ0l9kA() {
        return this.oh71FJcDz6S2;
    }

    @Override // defpackage.ct
    public final void s0TASMVLSWD5(float f, long j, long j2) {
        this.WDYagTQQm9ns.fWTAfUmVKrZq.fWTAfUmVKrZq(f, j2, ZpBGe2uQfcn8(this, j, defpackage.yw.ZpBGe2uQfcn8, 3));
    }

    @Override // defpackage.ct
    public final void xahdJg25P1Bv(long j, long j2, long j3, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.WDYagTQQm9ns.fWTAfUmVKrZq.XntWc4eZSQ8j(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat((int) (j3 >> 32)) + java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L)) + java.lang.Float.intBitsToFloat(i3), ZpBGe2uQfcn8(this, j, defpackage.yw.ZpBGe2uQfcn8, i));
    }

    @Override // defpackage.ct
    public final void zJPqDeoF0Os1(defpackage.w1 w1Var, long j, long j2, long j3, float f, defpackage.ga gaVar, int i) {
        this.WDYagTQQm9ns.fWTAfUmVKrZq.JhCgjQRTAOCT(w1Var, j, j2, j3, fWTAfUmVKrZq(null, defpackage.yw.ZpBGe2uQfcn8, f, gaVar, 3, i));
    }
}
