package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class cn0 {
    public final long GWasM1elztuh;
    public final nn0 Yi7zF1RB1;

    public cn0() {
        long xqGvceK5x = ki1.xqGvceK5x(4284900966L);
        nn0 nn0Var = new nn0(0.0f, 0.0f, 0.0f, 0.0f);
        this.GWasM1elztuh = xqGvceK5x;
        this.Yi7zF1RB1 = nn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!cn0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        cn0 cn0Var = (cn0) obj;
        return yb.X1lG3V04pd(this.GWasM1elztuh, cn0Var.GWasM1elztuh) && o30.rQPn8YBR(this.Yi7zF1RB1, cn0Var.Yi7zF1RB1);
    }

    public final int hashCode() {
        int i = yb.encWxUiV2;
        return this.Yi7zF1RB1.hashCode() + (Long.hashCode(this.GWasM1elztuh) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        mr0.uFEq9NpZ(this.GWasM1elztuh, sb, ", drawPadding=");
        sb.append(this.Yi7zF1RB1);
        sb.append(')');
        return sb.toString();
    }
}
