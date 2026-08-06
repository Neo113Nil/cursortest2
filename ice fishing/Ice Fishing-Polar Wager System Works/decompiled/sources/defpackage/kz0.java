package defpackage;

/* loaded from: classes.dex */
public final class kz0 {
    public static final defpackage.kz0 adDC3e2L = new defpackage.kz0(0.0f, 0.0f, 0.0f, 0.0f);
    public final float F7NU4MC0GW;
    public final float IHQe1A4L2xu;
    public final float oh6vYeIP;
    public final float r1MBDhnF;

    public kz0(float f, float f2, float f3, float f4) {
        this.IHQe1A4L2xu = f;
        this.oh6vYeIP = f2;
        this.r1MBDhnF = f3;
        this.F7NU4MC0GW = f4;
    }

    public final defpackage.kz0 F7NU4MC0GW(float f, float f2) {
        return new defpackage.kz0(this.IHQe1A4L2xu + f, this.oh6vYeIP + f2, this.r1MBDhnF + f, this.F7NU4MC0GW + f2);
    }

    public final long IHQe1A4L2xu() {
        float f = this.r1MBDhnF;
        float f2 = this.IHQe1A4L2xu;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.F7NU4MC0GW;
        float f5 = this.oh6vYeIP;
        return (java.lang.Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f3) << 32);
    }

    public final defpackage.kz0 adDC3e2L(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new defpackage.kz0(java.lang.Float.intBitsToFloat(i) + this.IHQe1A4L2xu, java.lang.Float.intBitsToFloat(i2) + this.oh6vYeIP, java.lang.Float.intBitsToFloat(i) + this.r1MBDhnF, java.lang.Float.intBitsToFloat(i2) + this.F7NU4MC0GW);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.kz0)) {
            return false;
        }
        defpackage.kz0 kz0Var = (defpackage.kz0) obj;
        return java.lang.Float.compare(this.IHQe1A4L2xu, kz0Var.IHQe1A4L2xu) == 0 && java.lang.Float.compare(this.oh6vYeIP, kz0Var.oh6vYeIP) == 0 && java.lang.Float.compare(this.r1MBDhnF, kz0Var.r1MBDhnF) == 0 && java.lang.Float.compare(this.F7NU4MC0GW, kz0Var.F7NU4MC0GW) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.F7NU4MC0GW) + defpackage.fx0.IHQe1A4L2xu(this.r1MBDhnF, defpackage.fx0.IHQe1A4L2xu(this.oh6vYeIP, java.lang.Float.hashCode(this.IHQe1A4L2xu) * 31, 31), 31);
    }

    public final long oh6vYeIP() {
        float f = this.r1MBDhnF - this.IHQe1A4L2xu;
        float f2 = this.F7NU4MC0GW - this.oh6vYeIP;
        return (java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32);
    }

    public final defpackage.kz0 r1MBDhnF(defpackage.kz0 kz0Var) {
        return new defpackage.kz0(java.lang.Math.max(this.IHQe1A4L2xu, kz0Var.IHQe1A4L2xu), java.lang.Math.max(this.oh6vYeIP, kz0Var.oh6vYeIP), java.lang.Math.min(this.r1MBDhnF, kz0Var.r1MBDhnF), java.lang.Math.min(this.F7NU4MC0GW, kz0Var.F7NU4MC0GW));
    }

    public final java.lang.String toString() {
        return "Rect.fromLTRB(" + defpackage.s21.sJNB7mCer5(this.IHQe1A4L2xu) + ", " + defpackage.s21.sJNB7mCer5(this.oh6vYeIP) + ", " + defpackage.s21.sJNB7mCer5(this.r1MBDhnF) + ", " + defpackage.s21.sJNB7mCer5(this.F7NU4MC0GW) + ')';
    }
}
