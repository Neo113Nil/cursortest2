package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class cn1 {
    public final defpackage.bn1 ZpBGe2uQfcn8;
    public defpackage.rc0 fWTAfUmVKrZq;
    public defpackage.rc0 giKS3J6vZuNy = null;

    public cn1(defpackage.bn1 bn1Var, defpackage.rc0 rc0Var) {
        this.ZpBGe2uQfcn8 = bn1Var;
        this.fWTAfUmVKrZq = rc0Var;
    }

    public final long JhCgjQRTAOCT(long j) {
        defpackage.rc0 rc0Var;
        defpackage.rc0 rc0Var2 = this.giKS3J6vZuNy;
        if (rc0Var2 != null) {
            if (!rc0Var2.blKFvluuDQOf()) {
                rc0Var2 = null;
            }
            if (rc0Var2 != null && (rc0Var = this.fWTAfUmVKrZq) != null) {
                defpackage.rc0 rc0Var3 = rc0Var.blKFvluuDQOf() ? rc0Var : null;
                if (rc0Var3 != null) {
                    return rc0Var2.BHfvd2J71qpO(rc0Var3, j);
                }
            }
        }
        return j;
    }

    public final long WDYagTQQm9ns(long j) {
        defpackage.rc0 rc0Var;
        defpackage.rc0 rc0Var2 = this.giKS3J6vZuNy;
        if (rc0Var2 != null) {
            if (!rc0Var2.blKFvluuDQOf()) {
                rc0Var2 = null;
            }
            if (rc0Var2 != null && (rc0Var = this.fWTAfUmVKrZq) != null) {
                defpackage.rc0 rc0Var3 = rc0Var.blKFvluuDQOf() ? rc0Var : null;
                if (rc0Var3 != null) {
                    return rc0Var3.BHfvd2J71qpO(rc0Var2, j);
                }
            }
        }
        return j;
    }

    public final long ZpBGe2uQfcn8(long j) {
        defpackage.s31 s31Var;
        defpackage.rc0 rc0Var = this.giKS3J6vZuNy;
        defpackage.s31 s31Var2 = defpackage.s31.WDYagTQQm9ns;
        if (rc0Var != null) {
            if (rc0Var.blKFvluuDQOf()) {
                defpackage.rc0 rc0Var2 = this.fWTAfUmVKrZq;
                s31Var = rc0Var2 != null ? rc0Var2.hH0RRJrNssvh(rc0Var, true) : null;
            } else {
                s31Var = s31Var2;
            }
            if (s31Var != null) {
                s31Var2 = s31Var;
            }
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = java.lang.Float.intBitsToFloat(i);
        float f = s31Var2.ZpBGe2uQfcn8;
        if (intBitsToFloat >= f) {
            float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i);
            f = s31Var2.fWTAfUmVKrZq;
            if (intBitsToFloat2 <= f) {
                f = java.lang.Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat(i2);
        float f2 = s31Var2.giKS3J6vZuNy;
        if (intBitsToFloat3 >= f2) {
            float intBitsToFloat4 = java.lang.Float.intBitsToFloat(i2);
            f2 = s31Var2.JhCgjQRTAOCT;
            if (intBitsToFloat4 <= f2) {
                f2 = java.lang.Float.intBitsToFloat(i2);
            }
        }
        return (java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public final boolean fWTAfUmVKrZq(long j) {
        long JhCgjQRTAOCT = JhCgjQRTAOCT(ZpBGe2uQfcn8(j));
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (4294967295L & JhCgjQRTAOCT));
        defpackage.bn1 bn1Var = this.ZpBGe2uQfcn8;
        int WDYagTQQm9ns = bn1Var.giKS3J6vZuNy.WDYagTQQm9ns(intBitsToFloat);
        int i = (int) (JhCgjQRTAOCT >> 32);
        return java.lang.Float.intBitsToFloat(i) >= bn1Var.JhCgjQRTAOCT(WDYagTQQm9ns) && java.lang.Float.intBitsToFloat(i) <= bn1Var.WDYagTQQm9ns(WDYagTQQm9ns);
    }

    public final int giKS3J6vZuNy(long j, boolean z) {
        if (z) {
            j = ZpBGe2uQfcn8(j);
        }
        return this.ZpBGe2uQfcn8.giKS3J6vZuNy.QiMR8OkAhezm(JhCgjQRTAOCT(j));
    }
}
