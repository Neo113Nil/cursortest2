package defpackage;

/* loaded from: classes.dex */
public final class bi1 {
    public final double AARZUJiTa;
    public final double F7NU4MC0GW;
    public final double IHQe1A4L2xu;
    public final double adDC3e2L;
    public final double oh6vYeIP;
    public final double r1MBDhnF;
    public final double xiZrDbcSW0;

    public bi1(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.IHQe1A4L2xu = d;
        this.oh6vYeIP = d2;
        this.r1MBDhnF = d3;
        this.F7NU4MC0GW = d4;
        this.adDC3e2L = d5;
        this.xiZrDbcSW0 = d6;
        this.AARZUJiTa = d7;
        if (java.lang.Double.isNaN(d2) || java.lang.Double.isNaN(d3) || java.lang.Double.isNaN(d4) || java.lang.Double.isNaN(d5) || java.lang.Double.isNaN(d6) || java.lang.Double.isNaN(d7) || java.lang.Double.isNaN(d)) {
            defpackage.db.fnWB2E7cs("Parameters cannot be NaN");
            throw null;
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new java.lang.IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            defpackage.db.fnWB2E7cs("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            defpackage.db.fnWB2E7cs("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            defpackage.db.fnWB2E7cs("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d4 < 0.0d) {
            defpackage.db.fnWB2E7cs("The transfer function must be increasing");
            throw null;
        }
        if (d2 < 0.0d || d < 0.0d) {
            defpackage.db.fnWB2E7cs("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bi1)) {
            return false;
        }
        defpackage.bi1 bi1Var = (defpackage.bi1) obj;
        return java.lang.Double.compare(this.IHQe1A4L2xu, bi1Var.IHQe1A4L2xu) == 0 && java.lang.Double.compare(this.oh6vYeIP, bi1Var.oh6vYeIP) == 0 && java.lang.Double.compare(this.r1MBDhnF, bi1Var.r1MBDhnF) == 0 && java.lang.Double.compare(this.F7NU4MC0GW, bi1Var.F7NU4MC0GW) == 0 && java.lang.Double.compare(this.adDC3e2L, bi1Var.adDC3e2L) == 0 && java.lang.Double.compare(this.xiZrDbcSW0, bi1Var.xiZrDbcSW0) == 0 && java.lang.Double.compare(this.AARZUJiTa, bi1Var.AARZUJiTa) == 0;
    }

    public final int hashCode() {
        return java.lang.Double.hashCode(this.AARZUJiTa) + ((java.lang.Double.hashCode(this.xiZrDbcSW0) + ((java.lang.Double.hashCode(this.adDC3e2L) + ((java.lang.Double.hashCode(this.F7NU4MC0GW) + ((java.lang.Double.hashCode(this.r1MBDhnF) + ((java.lang.Double.hashCode(this.oh6vYeIP) + (java.lang.Double.hashCode(this.IHQe1A4L2xu) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "TransferParameters(gamma=" + this.IHQe1A4L2xu + ", a=" + this.oh6vYeIP + ", b=" + this.r1MBDhnF + ", c=" + this.F7NU4MC0GW + ", d=" + this.adDC3e2L + ", e=" + this.xiZrDbcSW0 + ", f=" + this.AARZUJiTa + ')';
    }

    public /* synthetic */ bi1(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
