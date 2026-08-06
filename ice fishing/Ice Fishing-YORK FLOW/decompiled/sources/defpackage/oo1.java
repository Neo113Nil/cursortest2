package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class oo1 {
    public defpackage.fv0 ZpBGe2uQfcn8;
    public long giKS3J6vZuNy;

    public oo1(long j, defpackage.fv0 fv0Var) {
        this.ZpBGe2uQfcn8 = fv0Var;
        this.giKS3J6vZuNy = j;
    }

    public final long ZpBGe2uQfcn8(long j, float f, boolean z) {
        long WDYagTQQm9ns;
        long j2 = this.giKS3J6vZuNy;
        if (z) {
            WDYagTQQm9ns = defpackage.ws0.WDYagTQQm9ns(j2, j);
            this.giKS3J6vZuNy = WDYagTQQm9ns;
        } else {
            WDYagTQQm9ns = defpackage.ws0.WDYagTQQm9ns(j2, j);
        }
        if ((this.ZpBGe2uQfcn8 == null ? defpackage.ws0.fWTAfUmVKrZq(WDYagTQQm9ns) : java.lang.Math.abs(giKS3J6vZuNy(WDYagTQQm9ns))) < f) {
            return 9205357640488583168L;
        }
        defpackage.fv0 fv0Var = this.ZpBGe2uQfcn8;
        long j3 = this.giKS3J6vZuNy;
        if (fv0Var == null) {
            float fWTAfUmVKrZq = defpackage.ws0.fWTAfUmVKrZq(j3);
            return defpackage.ws0.JhCgjQRTAOCT(this.giKS3J6vZuNy, defpackage.ws0.oh71FJcDz6S2((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j3 >> 32)) / fWTAfUmVKrZq) << 32) | (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L)) / fWTAfUmVKrZq) & 4294967295L), f));
        }
        float giKS3J6vZuNy = giKS3J6vZuNy(j3) - (java.lang.Math.signum(giKS3J6vZuNy(this.giKS3J6vZuNy)) * f);
        long j4 = this.giKS3J6vZuNy;
        defpackage.fv0 fv0Var2 = this.ZpBGe2uQfcn8;
        defpackage.fv0 fv0Var3 = defpackage.fv0.oh71FJcDz6S2;
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (fv0Var2 == fv0Var3 ? j4 & 4294967295L : j4 >> 32));
        if (this.ZpBGe2uQfcn8 == fv0Var3) {
            return (java.lang.Float.floatToRawIntBits(giKS3J6vZuNy) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        }
        return (java.lang.Float.floatToRawIntBits(giKS3J6vZuNy) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final float giKS3J6vZuNy(long j) {
        return java.lang.Float.intBitsToFloat((int) (this.ZpBGe2uQfcn8 == defpackage.fv0.oh71FJcDz6S2 ? j >> 32 : j & 4294967295L));
    }

    public /* synthetic */ oo1(defpackage.fv0 fv0Var) {
        this(0L, fv0Var);
    }
}
