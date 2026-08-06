package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class x11 {
    public static final x11 xqGvceK5x = new x11(ki1.xqGvceK5x(4278190080L), 0, 0.0f);
    public final long GWasM1elztuh;
    public final float X1lG3V04pd;
    public final long Yi7zF1RB1;

    public x11(long j, long j2, float f) {
        this.GWasM1elztuh = j;
        this.Yi7zF1RB1 = j2;
        this.X1lG3V04pd = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x11)) {
            return false;
        }
        x11 x11Var = (x11) obj;
        return yb.X1lG3V04pd(this.GWasM1elztuh, x11Var.GWasM1elztuh) && uk0.Yi7zF1RB1(this.Yi7zF1RB1, x11Var.Yi7zF1RB1) && this.X1lG3V04pd == x11Var.X1lG3V04pd;
    }

    public final int hashCode() {
        int i = yb.encWxUiV2;
        return Float.hashCode(this.X1lG3V04pd) + mr0.X1lG3V04pd(Long.hashCode(this.GWasM1elztuh) * 31, 31, this.Yi7zF1RB1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        mr0.uFEq9NpZ(this.GWasM1elztuh, sb, ", offset=");
        sb.append((Object) uk0.AvO7iQsrTN(this.Yi7zF1RB1));
        sb.append(", blurRadius=");
        return mr0.JFJ3QoxA(sb, this.X1lG3V04pd, ')');
    }
}
