package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class h7 implements defpackage.fd, defpackage.kr, defpackage.ot, defpackage.td1 {
    public final /* synthetic */ int WDYagTQQm9ns;

    public /* synthetic */ h7(int i) {
        this.WDYagTQQm9ns = i;
    }

    public static /* synthetic */ void BHfvd2J71qpO() {
        throw new java.util.NoSuchElementException();
    }

    public static /* synthetic */ void GE9mJIPrb8gP(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        throw new java.lang.IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void JhCgjQRTAOCT() {
        throw new defpackage.vg();
    }

    public static /* synthetic */ void Ns0WNyEWdPsk(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        throw new java.lang.IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void P05cfTpS5W5L(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static /* synthetic */ void QiMR8OkAhezm(java.lang.Object obj, java.lang.String str) {
        throw new java.lang.IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void T1fB7bDYiVJQ() {
        throw new defpackage.vg();
    }

    public static /* synthetic */ void WDYagTQQm9ns(java.lang.Object obj) {
        throw new java.lang.IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void WmetiUbpKU9I(java.lang.String str) {
        throw new java.lang.IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void XntWc4eZSQ8j(java.lang.Object obj, java.lang.String str) {
        throw new java.lang.IllegalStateException(str + obj);
    }

    public static /* synthetic */ void ZVVdXbWmyCSK(java.lang.Object obj, java.lang.String str) {
        throw new java.lang.IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void e6mdH7fiFuta(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void fNwYGHIYeJcR(java.lang.String str, java.lang.Object obj, java.lang.Throwable th) {
        throw new java.lang.RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void gUjdnLbkVAaA(java.lang.StringBuilder sb, java.lang.Object obj, java.lang.Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void h3m55N1URyyK(java.lang.StringBuilder sb, int i) {
        sb.append(i);
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void maCixPsq4ml2(java.lang.Object obj, java.lang.String str) {
        throw new java.lang.IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void oh71FJcDz6S2(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void s0TASMVLSWD5(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        throw new java.lang.IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void w7APNrr0aGRc(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    @Override // defpackage.td1
    public boolean ZpBGe2uQfcn8() {
        return false;
    }

    @Override // defpackage.kr
    public double fWTAfUmVKrZq(double d) {
        switch (this.WDYagTQQm9ns) {
            case 3:
                double d2 = d < 0.0d ? -d : d;
                return java.lang.Math.copySign(d2 >= 0.0031308049535603718d ? (java.lang.Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 4:
                double d3 = d < 0.0d ? -d : d;
                return java.lang.Math.copySign(d3 >= 0.04045d ? java.lang.Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 5:
                float[] fArr = defpackage.ag.ZpBGe2uQfcn8;
                return defpackage.ag.giKS3J6vZuNy(defpackage.ag.fWTAfUmVKrZq, d);
            case 6:
                float[] fArr2 = defpackage.ag.ZpBGe2uQfcn8;
                return defpackage.ag.ZpBGe2uQfcn8(defpackage.ag.fWTAfUmVKrZq, d);
            case 7:
                float[] fArr3 = defpackage.ag.ZpBGe2uQfcn8;
                return defpackage.ag.JhCgjQRTAOCT(defpackage.ag.JhCgjQRTAOCT, d);
            case 8:
                float[] fArr4 = defpackage.ag.ZpBGe2uQfcn8;
                return defpackage.ag.fWTAfUmVKrZq(defpackage.ag.JhCgjQRTAOCT, d);
            default:
                return d;
        }
    }

    @Override // defpackage.fd
    public void cancel() {
    }

    @Override // defpackage.ot
    public float giKS3J6vZuNy(float f) {
        return f;
    }
}
