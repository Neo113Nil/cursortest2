package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class fa1 {
    public final double AvO7iQsrTN;
    public final double EljAMC1QTz;
    public final double GWasM1elztuh;
    public final double OOA6hdeuvCS;
    public final double X1lG3V04pd;
    public final double Yi7zF1RB1;
    public final double xqGvceK5x;

    public fa1(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.GWasM1elztuh = d;
        this.Yi7zF1RB1 = d2;
        this.X1lG3V04pd = d3;
        this.xqGvceK5x = d4;
        this.OOA6hdeuvCS = d5;
        this.EljAMC1QTz = d6;
        this.AvO7iQsrTN = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            o4.mE4lRynR("Parameters cannot be NaN");
            throw null;
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            o4.mE4lRynR("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            o4.mE4lRynR("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            o4.mE4lRynR("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d4 < 0.0d) {
            o4.mE4lRynR("The transfer function must be increasing");
            throw null;
        }
        if (d2 < 0.0d || d < 0.0d) {
            o4.mE4lRynR("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa1)) {
            return false;
        }
        fa1 fa1Var = (fa1) obj;
        return Double.compare(this.GWasM1elztuh, fa1Var.GWasM1elztuh) == 0 && Double.compare(this.Yi7zF1RB1, fa1Var.Yi7zF1RB1) == 0 && Double.compare(this.X1lG3V04pd, fa1Var.X1lG3V04pd) == 0 && Double.compare(this.xqGvceK5x, fa1Var.xqGvceK5x) == 0 && Double.compare(this.OOA6hdeuvCS, fa1Var.OOA6hdeuvCS) == 0 && Double.compare(this.EljAMC1QTz, fa1Var.EljAMC1QTz) == 0 && Double.compare(this.AvO7iQsrTN, fa1Var.AvO7iQsrTN) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.AvO7iQsrTN) + ((Double.hashCode(this.EljAMC1QTz) + ((Double.hashCode(this.OOA6hdeuvCS) + ((Double.hashCode(this.xqGvceK5x) + ((Double.hashCode(this.X1lG3V04pd) + ((Double.hashCode(this.Yi7zF1RB1) + (Double.hashCode(this.GWasM1elztuh) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.GWasM1elztuh + ", a=" + this.Yi7zF1RB1 + ", b=" + this.X1lG3V04pd + ", c=" + this.xqGvceK5x + ", d=" + this.OOA6hdeuvCS + ", e=" + this.EljAMC1QTz + ", f=" + this.AvO7iQsrTN + ')';
    }

    public /* synthetic */ fa1(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
