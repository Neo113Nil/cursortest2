package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class o4 implements p9, an, oo, l21 {
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ o4(int i) {
        this.OOA6hdeuvCS = i;
    }

    public static /* synthetic */ void AvO7iQsrTN(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void E7jCp8Ls() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void EljAMC1QTz(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void JFJ3QoxA(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void Mjvvu5DE(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void OOA6hdeuvCS(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void WIEu4Ya2g8(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void XnEVoBF0td1l(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void YmKjaVtbfp5Z() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void encWxUiV2(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void iwATDS1i01k(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void jivtDDk9H(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void mE4lRynR(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void mOu10nynGul(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void rQPn8YBR(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void uFEq9NpZ(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void xqGvceK5x() {
        throw new vc();
    }

    @Override // defpackage.l21
    public boolean GWasM1elztuh() {
        return false;
    }

    @Override // defpackage.an
    public double X1lG3V04pd(double d) {
        switch (this.OOA6hdeuvCS) {
            case 4:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 5:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                float[] fArr = jc.GWasM1elztuh;
                return jc.Yi7zF1RB1(jc.X1lG3V04pd, d);
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                float[] fArr2 = jc.GWasM1elztuh;
                return jc.GWasM1elztuh(jc.X1lG3V04pd, d);
            case 8:
                float[] fArr3 = jc.GWasM1elztuh;
                return jc.xqGvceK5x(jc.xqGvceK5x, d);
            case 9:
                float[] fArr4 = jc.GWasM1elztuh;
                return jc.X1lG3V04pd(jc.xqGvceK5x, d);
            default:
                return d;
        }
    }

    @Override // defpackage.p9
    public void cancel() {
    }

    @Override // defpackage.oo
    public float Yi7zF1RB1(float f) {
        return f;
    }
}
