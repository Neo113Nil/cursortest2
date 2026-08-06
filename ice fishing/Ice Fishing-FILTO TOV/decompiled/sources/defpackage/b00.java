package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class b00 {
    public final long GWasM1elztuh;
    public final long X1lG3V04pd;
    public final long Yi7zF1RB1;
    public final long xqGvceK5x;

    public b00(long j, long j2, long j3, long j4) {
        this.GWasM1elztuh = j;
        this.Yi7zF1RB1 = j2;
        this.X1lG3V04pd = j3;
        this.xqGvceK5x = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b00)) {
            return false;
        }
        b00 b00Var = (b00) obj;
        return yb.X1lG3V04pd(this.GWasM1elztuh, b00Var.GWasM1elztuh) && yb.X1lG3V04pd(this.Yi7zF1RB1, b00Var.Yi7zF1RB1) && yb.X1lG3V04pd(this.X1lG3V04pd, b00Var.X1lG3V04pd) && yb.X1lG3V04pd(this.xqGvceK5x, b00Var.xqGvceK5x);
    }

    public final int hashCode() {
        int i = yb.encWxUiV2;
        return Long.hashCode(this.xqGvceK5x) + mr0.X1lG3V04pd(mr0.X1lG3V04pd(Long.hashCode(this.GWasM1elztuh) * 31, 31, this.Yi7zF1RB1), 31, this.X1lG3V04pd);
    }
}
