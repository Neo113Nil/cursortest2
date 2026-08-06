package defpackage;

/* loaded from: classes.dex */
public final class x21 {
    public final long AARZUJiTa;
    public final long EXtogiMhuM;
    public final float F7NU4MC0GW;
    public final float IHQe1A4L2xu;
    public final long adDC3e2L;
    public final float oh6vYeIP;
    public final float r1MBDhnF;
    public final long xiZrDbcSW0;

    static {
        defpackage.c80.riuEU0zW4(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public x21(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.IHQe1A4L2xu = f;
        this.oh6vYeIP = f2;
        this.r1MBDhnF = f3;
        this.F7NU4MC0GW = f4;
        this.adDC3e2L = j;
        this.xiZrDbcSW0 = j2;
        this.AARZUJiTa = j3;
        this.EXtogiMhuM = j4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.x21)) {
            return false;
        }
        defpackage.x21 x21Var = (defpackage.x21) obj;
        return java.lang.Float.compare(this.IHQe1A4L2xu, x21Var.IHQe1A4L2xu) == 0 && java.lang.Float.compare(this.oh6vYeIP, x21Var.oh6vYeIP) == 0 && java.lang.Float.compare(this.r1MBDhnF, x21Var.r1MBDhnF) == 0 && java.lang.Float.compare(this.F7NU4MC0GW, x21Var.F7NU4MC0GW) == 0 && defpackage.x70.C0U8sNJm(this.adDC3e2L, x21Var.adDC3e2L) && defpackage.x70.C0U8sNJm(this.xiZrDbcSW0, x21Var.xiZrDbcSW0) && defpackage.x70.C0U8sNJm(this.AARZUJiTa, x21Var.AARZUJiTa) && defpackage.x70.C0U8sNJm(this.EXtogiMhuM, x21Var.EXtogiMhuM);
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.EXtogiMhuM) + defpackage.fx0.r1MBDhnF(defpackage.fx0.r1MBDhnF(defpackage.fx0.r1MBDhnF(defpackage.fx0.IHQe1A4L2xu(this.F7NU4MC0GW, defpackage.fx0.IHQe1A4L2xu(this.r1MBDhnF, defpackage.fx0.IHQe1A4L2xu(this.oh6vYeIP, java.lang.Float.hashCode(this.IHQe1A4L2xu) * 31, 31), 31), 31), 31, this.adDC3e2L), 31, this.xiZrDbcSW0), 31, this.AARZUJiTa);
    }

    public final java.lang.String toString() {
        java.lang.String str = defpackage.s21.sJNB7mCer5(this.IHQe1A4L2xu) + ", " + defpackage.s21.sJNB7mCer5(this.oh6vYeIP) + ", " + defpackage.s21.sJNB7mCer5(this.r1MBDhnF) + ", " + defpackage.s21.sJNB7mCer5(this.F7NU4MC0GW);
        long j = this.adDC3e2L;
        long j2 = this.xiZrDbcSW0;
        boolean C0U8sNJm = defpackage.x70.C0U8sNJm(j, j2);
        long j3 = this.AARZUJiTa;
        long j4 = this.EXtogiMhuM;
        if (!C0U8sNJm || !defpackage.x70.C0U8sNJm(j2, j3) || !defpackage.x70.C0U8sNJm(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((java.lang.Object) defpackage.x70.AsxAYCCkb3Hi(j)) + ", topRight=" + ((java.lang.Object) defpackage.x70.AsxAYCCkb3Hi(j2)) + ", bottomRight=" + ((java.lang.Object) defpackage.x70.AsxAYCCkb3Hi(j3)) + ", bottomLeft=" + ((java.lang.Object) defpackage.x70.AsxAYCCkb3Hi(j4)) + ')';
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i) == java.lang.Float.intBitsToFloat(i2)) {
            return "RoundRect(rect=" + str + ", radius=" + defpackage.s21.sJNB7mCer5(java.lang.Float.intBitsToFloat(i)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + defpackage.s21.sJNB7mCer5(java.lang.Float.intBitsToFloat(i)) + ", y=" + defpackage.s21.sJNB7mCer5(java.lang.Float.intBitsToFloat(i2)) + ')';
    }
}
