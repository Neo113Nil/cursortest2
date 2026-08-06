package defpackage;

/* loaded from: classes.dex */
public final class e8 {
    public final float IHQe1A4L2xu;
    public final float oh6vYeIP;

    public e8(float f, float f2) {
        this.IHQe1A4L2xu = f;
        this.oh6vYeIP = f2;
    }

    public final long IHQe1A4L2xu(long j, long j2, defpackage.w90 w90Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        defpackage.w90 w90Var2 = defpackage.w90.adDC3e2L;
        float f3 = this.IHQe1A4L2xu;
        if (w90Var != w90Var2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.oh6vYeIP) * f2;
        int round = java.lang.Math.round((f3 + 1.0f) * f);
        return (java.lang.Math.round(f4) & 4294967295L) | (round << 32);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.e8)) {
            return false;
        }
        defpackage.e8 e8Var = (defpackage.e8) obj;
        return java.lang.Float.compare(this.IHQe1A4L2xu, e8Var.IHQe1A4L2xu) == 0 && java.lang.Float.compare(this.oh6vYeIP, e8Var.oh6vYeIP) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.oh6vYeIP) + (java.lang.Float.hashCode(this.IHQe1A4L2xu) * 31);
    }

    public final java.lang.String toString() {
        return "BiasAlignment(horizontalBias=" + this.IHQe1A4L2xu + ", verticalBias=" + this.oh6vYeIP + ')';
    }
}
