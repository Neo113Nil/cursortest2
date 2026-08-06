package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class yo1 {
    public final double JhCgjQRTAOCT;
    public final double QiMR8OkAhezm;
    public final double WDYagTQQm9ns;
    public final double ZpBGe2uQfcn8;
    public final double fWTAfUmVKrZq;
    public final double giKS3J6vZuNy;
    public final double oh71FJcDz6S2;

    public yo1(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.ZpBGe2uQfcn8 = d;
        this.giKS3J6vZuNy = d2;
        this.fWTAfUmVKrZq = d3;
        this.JhCgjQRTAOCT = d4;
        this.WDYagTQQm9ns = d5;
        this.oh71FJcDz6S2 = d6;
        this.QiMR8OkAhezm = d7;
        if (java.lang.Double.isNaN(d2) || java.lang.Double.isNaN(d3) || java.lang.Double.isNaN(d4) || java.lang.Double.isNaN(d5) || java.lang.Double.isNaN(d6) || java.lang.Double.isNaN(d7) || java.lang.Double.isNaN(d)) {
            defpackage.h7.w7APNrr0aGRc("Parameters cannot be NaN");
            throw null;
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new java.lang.IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            defpackage.h7.w7APNrr0aGRc("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            defpackage.h7.w7APNrr0aGRc("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            defpackage.h7.w7APNrr0aGRc("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d4 < 0.0d) {
            defpackage.h7.w7APNrr0aGRc("The transfer function must be increasing");
            throw null;
        }
        if (d2 < 0.0d || d < 0.0d) {
            defpackage.h7.w7APNrr0aGRc("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.yo1)) {
            return false;
        }
        defpackage.yo1 yo1Var = (defpackage.yo1) obj;
        return java.lang.Double.compare(this.ZpBGe2uQfcn8, yo1Var.ZpBGe2uQfcn8) == 0 && java.lang.Double.compare(this.giKS3J6vZuNy, yo1Var.giKS3J6vZuNy) == 0 && java.lang.Double.compare(this.fWTAfUmVKrZq, yo1Var.fWTAfUmVKrZq) == 0 && java.lang.Double.compare(this.JhCgjQRTAOCT, yo1Var.JhCgjQRTAOCT) == 0 && java.lang.Double.compare(this.WDYagTQQm9ns, yo1Var.WDYagTQQm9ns) == 0 && java.lang.Double.compare(this.oh71FJcDz6S2, yo1Var.oh71FJcDz6S2) == 0 && java.lang.Double.compare(this.QiMR8OkAhezm, yo1Var.QiMR8OkAhezm) == 0;
    }

    public final int hashCode() {
        return java.lang.Double.hashCode(this.QiMR8OkAhezm) + ((java.lang.Double.hashCode(this.oh71FJcDz6S2) + ((java.lang.Double.hashCode(this.WDYagTQQm9ns) + ((java.lang.Double.hashCode(this.JhCgjQRTAOCT) + ((java.lang.Double.hashCode(this.fWTAfUmVKrZq) + ((java.lang.Double.hashCode(this.giKS3J6vZuNy) + (java.lang.Double.hashCode(this.ZpBGe2uQfcn8) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "TransferParameters(gamma=" + this.ZpBGe2uQfcn8 + ", a=" + this.giKS3J6vZuNy + ", b=" + this.fWTAfUmVKrZq + ", c=" + this.JhCgjQRTAOCT + ", d=" + this.WDYagTQQm9ns + ", e=" + this.oh71FJcDz6S2 + ", f=" + this.QiMR8OkAhezm + ')';
    }

    public /* synthetic */ yo1(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
