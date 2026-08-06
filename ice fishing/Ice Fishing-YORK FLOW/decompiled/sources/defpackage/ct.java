package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public interface ct extends defpackage.hp {
    static void EPEWHACkMcF1(defpackage.ld0 ld0Var, defpackage.vb vbVar, long j, long j2, float f, defpackage.dt dtVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = awu2ulftxHsa(ld0Var.WDYagTQQm9ns.JhCgjQRTAOCT(), j3);
        }
        ld0Var.WDYagTQQm9ns(vbVar, j3, j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? defpackage.yw.ZpBGe2uQfcn8 : dtVar);
    }

    static void Fu5WBEia9jBo(defpackage.ct ctVar, defpackage.w1 w1Var, long j, long j2, float f, defpackage.ga gaVar, int i, int i2) {
        ctVar.zJPqDeoF0Os1(w1Var, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, gaVar, (i2 & 512) != 0 ? 1 : i);
    }

    static /* synthetic */ void Mearx7yMn90V(defpackage.ct ctVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = awu2ulftxHsa(ctVar.JhCgjQRTAOCT(), 0L);
        }
        ctVar.xahdJg25P1Bv(j, 0L, j2, (i & 64) != 0 ? 3 : 0);
    }

    static long awu2ulftxHsa(long j, long j2) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) - java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    static /* synthetic */ void cCeDCHgnx5OL(defpackage.ct ctVar, long j, float f, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = ctVar.NkfcFfdaVTox();
        }
        ctVar.s0TASMVLSWD5(f, j, j2);
    }

    static void frSwwKIlbUhK(defpackage.ld0 ld0Var, defpackage.vb vbVar, long j, long j2, long j3, defpackage.dt dtVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        ld0Var.oh71FJcDz6S2(vbVar, j4, (i & 4) != 0 ? awu2ulftxHsa(ld0Var.WDYagTQQm9ns.JhCgjQRTAOCT(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? defpackage.yw.ZpBGe2uQfcn8 : dtVar);
    }

    static /* synthetic */ void w7APNrr0aGRc(defpackage.ct ctVar, defpackage.s2 s2Var, defpackage.vb vbVar, float f, defpackage.bh1 bh1Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        defpackage.dt dtVar = bh1Var;
        if ((i & 8) != 0) {
            dtVar = defpackage.yw.ZpBGe2uQfcn8;
        }
        ctVar.P05cfTpS5W5L(s2Var, vbVar, f2, dtVar, (i & 32) != 0 ? 3 : 0);
    }

    void EgL5gQQnyJKX(long j, long j2, long j3, float f);

    void IJ0hOnjhPOri(long j, long j2, long j3, long j4);

    default long JhCgjQRTAOCT() {
        return qjMheFZ0l9kA().Ns0WNyEWdPsk();
    }

    default long NkfcFfdaVTox() {
        return defpackage.v70.s0TASMVLSWD5(qjMheFZ0l9kA().Ns0WNyEWdPsk());
    }

    void P05cfTpS5W5L(defpackage.s2 s2Var, defpackage.vb vbVar, float f, defpackage.dt dtVar, int i);

    void PS16moFv2oLu(defpackage.s2 s2Var, long j, defpackage.dt dtVar);

    defpackage.sc0 getLayoutDirection();

    defpackage.a7 qjMheFZ0l9kA();

    void s0TASMVLSWD5(float f, long j, long j2);

    void xahdJg25P1Bv(long j, long j2, long j3, int i);

    void zJPqDeoF0Os1(defpackage.w1 w1Var, long j, long j2, long j3, float f, defpackage.ga gaVar, int i);
}
