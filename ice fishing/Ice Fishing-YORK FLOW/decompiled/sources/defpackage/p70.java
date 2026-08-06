package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class p70 {
    public final defpackage.wg GE9mJIPrb8gP;
    public defpackage.l70 JhCgjQRTAOCT;
    public final defpackage.wg Ns0WNyEWdPsk;
    public long P05cfTpS5W5L = 9205357640488583168L;
    public defpackage.ci1 QiMR8OkAhezm;
    public defpackage.k70 WDYagTQQm9ns;
    public final defpackage.q91 ZpBGe2uQfcn8;
    public defpackage.oo1 e6mdH7fiFuta;
    public long fNwYGHIYeJcR;
    public defpackage.m70 fWTAfUmVKrZq;
    public defpackage.j70 giKS3J6vZuNy;
    public defpackage.n70 oh71FJcDz6S2;

    public p70(defpackage.q91 q91Var) {
        this.ZpBGe2uQfcn8 = q91Var;
        defpackage.wg wgVar = new defpackage.wg();
        wgVar.giKS3J6vZuNy = new defpackage.sn0();
        this.GE9mJIPrb8gP = wgVar;
        defpackage.wg wgVar2 = new defpackage.wg();
        wgVar2.giKS3J6vZuNy = new defpackage.jn0();
        this.Ns0WNyEWdPsk = wgVar2;
        this.fNwYGHIYeJcR = 0L;
    }

    public static void fWTAfUmVKrZq(defpackage.p70 p70Var, defpackage.h70 h70Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        defpackage.q91 q91Var = p70Var.ZpBGe2uQfcn8;
        defpackage.l70 l70Var = p70Var.JhCgjQRTAOCT;
        if (l70Var == null) {
            l70Var = new defpackage.l70();
            l70Var.WDYagTQQm9ns = null;
            l70Var.oh71FJcDz6S2 = Long.MAX_VALUE;
            l70Var.QiMR8OkAhezm = false;
            p70Var.JhCgjQRTAOCT = l70Var;
        }
        l70Var.WDYagTQQm9ns = h70Var;
        l70Var.oh71FJcDz6S2 = j;
        defpackage.oo1 oo1Var = p70Var.e6mdH7fiFuta;
        defpackage.fv0 fv0Var = q91Var.w7APNrr0aGRc;
        if (oo1Var == null) {
            p70Var.e6mdH7fiFuta = new defpackage.oo1(fv0Var);
        } else {
            oo1Var.ZpBGe2uQfcn8 = fv0Var;
            oo1Var.giKS3J6vZuNy = j2;
        }
        l70Var.QiMR8OkAhezm = false;
        p70Var.oh71FJcDz6S2 = l70Var;
    }

    public final defpackage.ci1 JhCgjQRTAOCT() {
        defpackage.ci1 ci1Var = this.QiMR8OkAhezm;
        if (ci1Var != null) {
            return ci1Var;
        }
        defpackage.h7.w7APNrr0aGRc("Velocity Tracker not initialized.");
        return null;
    }

    public final void WDYagTQQm9ns(defpackage.h70 h70Var, defpackage.g70 g70Var, long j) {
        defpackage.q91 q91Var = this.ZpBGe2uQfcn8;
        long fWTAfUmVKrZq = defpackage.la0.blKFvluuDQOf(q91Var).fWTAfUmVKrZq(0L);
        if (!defpackage.ws0.giKS3J6vZuNy(this.P05cfTpS5W5L, 9205357640488583168L) && !defpackage.ws0.giKS3J6vZuNy(fWTAfUmVKrZq, this.P05cfTpS5W5L)) {
            this.fNwYGHIYeJcR = defpackage.ws0.WDYagTQQm9ns(this.fNwYGHIYeJcR, defpackage.ws0.JhCgjQRTAOCT(fWTAfUmVKrZq, this.P05cfTpS5W5L));
        }
        this.P05cfTpS5W5L = fWTAfUmVKrZq;
        defpackage.fv0 fv0Var = q91Var.w7APNrr0aGRc;
        fv0Var.getClass();
        if (java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (fv0Var == defpackage.fv0.WDYagTQQm9ns ? j & 4294967295L : j >> 32))) > 2.0f) {
            defpackage.q70.QiMR8OkAhezm(JhCgjQRTAOCT(), h70Var, q91Var.w7APNrr0aGRc, g70Var, this.GE9mJIPrb8gP, this.fNwYGHIYeJcR);
            defpackage.wg wgVar = this.Ns0WNyEWdPsk;
            defpackage.jn0 jn0Var = (defpackage.jn0) wgVar.giKS3J6vZuNy;
            int i = jn0Var.giKS3J6vZuNy;
            if (i == 3) {
                int i2 = wgVar.ZpBGe2uQfcn8;
                wgVar.ZpBGe2uQfcn8 = i2 + 1;
                if (i2 < 0 || i2 >= i) {
                    defpackage.h7.WmetiUbpKU9I("Index must be between 0 and size");
                    return;
                } else {
                    long[] jArr = jn0Var.ZpBGe2uQfcn8;
                    long j2 = jArr[i2];
                    jArr[i2] = j;
                }
            } else {
                jn0Var.ZpBGe2uQfcn8(j);
            }
            if (wgVar.ZpBGe2uQfcn8 == 3) {
                wgVar.ZpBGe2uQfcn8 = 0;
            }
            long[] jArr2 = jn0Var.ZpBGe2uQfcn8;
            int i3 = jn0Var.giKS3J6vZuNy;
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                f2 += java.lang.Float.intBitsToFloat((int) (jArr2[i4] >> 32));
            }
            int i5 = jn0Var.giKS3J6vZuNy;
            float f3 = f2 / i5;
            long[] jArr3 = jn0Var.ZpBGe2uQfcn8;
            for (int i6 = 0; i6 < i5; i6++) {
                f += java.lang.Float.intBitsToFloat((int) (jArr3[i6] & 4294967295L));
            }
            q91Var.YjS0G3zEDWNX(new defpackage.cs((java.lang.Float.floatToRawIntBits(f3) << 32) | (java.lang.Float.floatToRawIntBits(f / jn0Var.giKS3J6vZuNy) & 4294967295L), true));
        }
    }

    public final void ZpBGe2uQfcn8() {
        defpackage.j70 j70Var = this.giKS3J6vZuNy;
        defpackage.i70 i70Var = defpackage.i70.QiMR8OkAhezm;
        if (j70Var == null) {
            j70Var = new defpackage.j70();
            j70Var.WDYagTQQm9ns = i70Var;
            j70Var.oh71FJcDz6S2 = false;
            this.giKS3J6vZuNy = j70Var;
        }
        j70Var.WDYagTQQm9ns = i70Var;
        j70Var.oh71FJcDz6S2 = false;
        this.oh71FJcDz6S2 = j70Var;
    }

    public final void giKS3J6vZuNy(defpackage.h70 h70Var, long j, defpackage.oo1 oo1Var) {
        defpackage.k70 k70Var = this.WDYagTQQm9ns;
        if (k70Var == null) {
            k70Var = new defpackage.k70();
            k70Var.WDYagTQQm9ns = null;
            k70Var.oh71FJcDz6S2 = Long.MAX_VALUE;
            this.WDYagTQQm9ns = k70Var;
        }
        k70Var.WDYagTQQm9ns = h70Var;
        k70Var.oh71FJcDz6S2 = j;
        oo1Var.giKS3J6vZuNy = 0L;
        this.oh71FJcDz6S2 = k70Var;
    }

    public final void oh71FJcDz6S2(defpackage.h70 h70Var, defpackage.h70 h70Var2, defpackage.g70 g70Var, long j) {
        if (this.QiMR8OkAhezm == null) {
            this.QiMR8OkAhezm = new defpackage.ci1(7);
        }
        this.fNwYGHIYeJcR = 0L;
        defpackage.ci1 JhCgjQRTAOCT = JhCgjQRTAOCT();
        defpackage.q91 q91Var = this.ZpBGe2uQfcn8;
        defpackage.q70.QiMR8OkAhezm(JhCgjQRTAOCT, h70Var, q91Var.w7APNrr0aGRc, g70Var, this.GE9mJIPrb8gP, this.fNwYGHIYeJcR);
        long JhCgjQRTAOCT2 = defpackage.ws0.JhCgjQRTAOCT(defpackage.q70.IBvW5fLsPuHy(h70Var2, q91Var.w7APNrr0aGRc, g70Var), j);
        q91Var.maCixPsq4ml2.getClass();
        this.P05cfTpS5W5L = defpackage.la0.blKFvluuDQOf(q91Var).fWTAfUmVKrZq(0L);
        q91Var.YjS0G3zEDWNX(new defpackage.ds(JhCgjQRTAOCT2));
        defpackage.wg wgVar = this.Ns0WNyEWdPsk;
        wgVar.ZpBGe2uQfcn8 = 0;
        ((defpackage.jn0) wgVar.giKS3J6vZuNy).giKS3J6vZuNy = 0;
    }
}
