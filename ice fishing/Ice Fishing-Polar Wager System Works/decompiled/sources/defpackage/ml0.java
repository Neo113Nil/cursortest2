package defpackage;

/* loaded from: classes.dex */
public final class ml0 {
    public float IHQe1A4L2xu = 0.0f;
    public float oh6vYeIP = 0.0f;
    public float r1MBDhnF = 0.0f;
    public float F7NU4MC0GW = 0.0f;

    public final void IHQe1A4L2xu(float f, float f2, float f3, float f4) {
        this.IHQe1A4L2xu = java.lang.Math.max(f, this.IHQe1A4L2xu);
        this.oh6vYeIP = java.lang.Math.max(f2, this.oh6vYeIP);
        this.r1MBDhnF = java.lang.Math.min(f3, this.r1MBDhnF);
        this.F7NU4MC0GW = java.lang.Math.min(f4, this.F7NU4MC0GW);
    }

    public final boolean oh6vYeIP() {
        return (this.IHQe1A4L2xu >= this.r1MBDhnF) | (this.oh6vYeIP >= this.F7NU4MC0GW);
    }

    public final void r1MBDhnF(long j) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        this.IHQe1A4L2xu += intBitsToFloat;
        this.oh6vYeIP += intBitsToFloat2;
        this.r1MBDhnF += intBitsToFloat;
        this.F7NU4MC0GW += intBitsToFloat2;
    }

    public final java.lang.String toString() {
        return "MutableRect(" + defpackage.s21.sJNB7mCer5(this.IHQe1A4L2xu) + ", " + defpackage.s21.sJNB7mCer5(this.oh6vYeIP) + ", " + defpackage.s21.sJNB7mCer5(this.r1MBDhnF) + ", " + defpackage.s21.sJNB7mCer5(this.F7NU4MC0GW) + ')';
    }
}
