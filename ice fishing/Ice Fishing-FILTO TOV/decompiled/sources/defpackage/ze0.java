package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ze0 {
    public final long GWasM1elztuh;
    public final boolean X1lG3V04pd;
    public final long Yi7zF1RB1;

    public ze0(long j, long j2, boolean z) {
        this.GWasM1elztuh = j;
        this.Yi7zF1RB1 = j2;
        this.X1lG3V04pd = z;
    }

    public final ze0 GWasM1elztuh(ze0 ze0Var) {
        return new ze0(uk0.OOA6hdeuvCS(this.GWasM1elztuh, ze0Var.GWasM1elztuh), Math.max(this.Yi7zF1RB1, ze0Var.Yi7zF1RB1), this.X1lG3V04pd);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze0)) {
            return false;
        }
        ze0 ze0Var = (ze0) obj;
        return uk0.Yi7zF1RB1(this.GWasM1elztuh, ze0Var.GWasM1elztuh) && this.Yi7zF1RB1 == ze0Var.Yi7zF1RB1 && this.X1lG3V04pd == ze0Var.X1lG3V04pd;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.X1lG3V04pd) + mr0.X1lG3V04pd(Long.hashCode(this.GWasM1elztuh) * 31, 31, this.Yi7zF1RB1);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) uk0.AvO7iQsrTN(this.GWasM1elztuh)) + ", timeMillis=" + this.Yi7zF1RB1 + ", shouldApplyImmediately=" + this.X1lG3V04pd + ')';
    }
}
