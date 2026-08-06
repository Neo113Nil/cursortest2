package defpackage;

/* loaded from: classes.dex */
public final class gh1 {
    public defpackage.ks0 IHQe1A4L2xu;
    public long oh6vYeIP = 0;

    public gh1(defpackage.ks0 ks0Var) {
        this.IHQe1A4L2xu = ks0Var;
    }

    public final long IHQe1A4L2xu(long j, long j2, float f) {
        long adDC3e2L = defpackage.gq0.adDC3e2L(this.oh6vYeIP, defpackage.gq0.F7NU4MC0GW(j, j2));
        this.oh6vYeIP = adDC3e2L;
        if ((this.IHQe1A4L2xu == null ? defpackage.gq0.r1MBDhnF(adDC3e2L) : java.lang.Math.abs(oh6vYeIP(adDC3e2L))) < f) {
            return 9205357640488583168L;
        }
        defpackage.ks0 ks0Var = this.IHQe1A4L2xu;
        long j3 = this.oh6vYeIP;
        if (ks0Var == null) {
            float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j3 >> 32)) / defpackage.gq0.r1MBDhnF(j3);
            return defpackage.gq0.F7NU4MC0GW(this.oh6vYeIP, defpackage.gq0.xiZrDbcSW0((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L)) / r5) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32), f));
        }
        float oh6vYeIP = oh6vYeIP(j3) - (java.lang.Math.signum(oh6vYeIP(this.oh6vYeIP)) * f);
        long j4 = this.oh6vYeIP;
        defpackage.ks0 ks0Var2 = this.IHQe1A4L2xu;
        defpackage.ks0 ks0Var3 = defpackage.ks0.xiZrDbcSW0;
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (ks0Var2 == ks0Var3 ? j4 & 4294967295L : j4 >> 32));
        if (this.IHQe1A4L2xu == ks0Var3) {
            return (java.lang.Float.floatToRawIntBits(oh6vYeIP) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        }
        return (java.lang.Float.floatToRawIntBits(oh6vYeIP) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) << 32);
    }

    public final float oh6vYeIP(long j) {
        return java.lang.Float.intBitsToFloat((int) (this.IHQe1A4L2xu == defpackage.ks0.xiZrDbcSW0 ? j >> 32 : j & 4294967295L));
    }
}
