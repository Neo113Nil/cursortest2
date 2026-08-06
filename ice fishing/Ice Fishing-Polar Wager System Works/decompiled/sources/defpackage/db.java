package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class db implements defpackage.eb, defpackage.sq, defpackage.ds, defpackage.r91 {
    public final /* synthetic */ int adDC3e2L;

    public static /* synthetic */ void AARZUJiTa(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static /* synthetic */ void DFo87pBq1E5() {
        throw new java.util.NoSuchElementException();
    }

    public static /* synthetic */ void EXtogiMhuM(java.lang.String str, long j, java.lang.Object obj) {
        throw new java.lang.IllegalArgumentException((str + j + obj).toString());
    }

    public static /* synthetic */ void EgCjBq0SZwJ(java.lang.Object obj, java.lang.String str) {
        throw new java.lang.IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void F7NU4MC0GW() {
        throw new defpackage.cf();
    }

    public static /* synthetic */ void G3OKOH3wZRC(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        throw new java.lang.IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void JlrlGoKF(java.lang.String str, java.lang.Object obj, java.lang.Throwable th) {
        throw new java.lang.RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void QoRHpC4k(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void SH1y5HwkJhh(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        throw new java.lang.IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void SyNS6RMn(java.lang.Object obj, java.lang.String str) {
        throw new java.lang.IllegalStateException(str + obj);
    }

    public static /* synthetic */ void adDC3e2L(java.lang.Object obj) {
        throw new java.lang.IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void cnag84Bm(java.lang.String str) {
        throw new java.lang.IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void ez2rX8ReCYw(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        throw new java.lang.IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void fnWB2E7cs(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static /* synthetic */ void kNAkVymC(java.lang.Object obj, java.lang.String str) {
        throw new java.lang.IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void kd6TUFXn() {
        throw new java.lang.ClassCastException();
    }

    public static /* synthetic */ void riuEU0zW4(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void xiZrDbcSW0(java.lang.Object obj, java.lang.String str) {
        throw new java.lang.IllegalStateException((str + obj).toString());
    }

    @Override // defpackage.r91
    public boolean IHQe1A4L2xu() {
        return false;
    }

    @Override // defpackage.eb
    public void cancel() {
    }

    @Override // defpackage.ds
    public float oh6vYeIP(float f) {
        return f;
    }

    @Override // defpackage.sq
    public double r1MBDhnF(double d) {
        switch (this.adDC3e2L) {
            case 1:
                double d2 = d < 0.0d ? -d : d;
                return java.lang.Math.copySign(d2 >= 0.0031308049535603718d ? (java.lang.Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                double d3 = d < 0.0d ? -d : d;
                return java.lang.Math.copySign(d3 >= 0.04045d ? java.lang.Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                float[] fArr = defpackage.le.IHQe1A4L2xu;
                return defpackage.le.oh6vYeIP(defpackage.le.r1MBDhnF, d);
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                float[] fArr2 = defpackage.le.IHQe1A4L2xu;
                return defpackage.le.IHQe1A4L2xu(defpackage.le.r1MBDhnF, d);
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                float[] fArr3 = defpackage.le.IHQe1A4L2xu;
                return defpackage.le.F7NU4MC0GW(defpackage.le.F7NU4MC0GW, d);
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                float[] fArr4 = defpackage.le.IHQe1A4L2xu;
                return defpackage.le.r1MBDhnF(defpackage.le.F7NU4MC0GW, d);
            default:
                return d;
        }
    }
}
