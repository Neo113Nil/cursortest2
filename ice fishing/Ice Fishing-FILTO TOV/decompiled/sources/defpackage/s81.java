package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class s81 {
    public final long GWasM1elztuh;
    public final long Yi7zF1RB1;

    public s81(long j, long j2) {
        this.GWasM1elztuh = j;
        this.Yi7zF1RB1 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s81)) {
            return false;
        }
        s81 s81Var = (s81) obj;
        return yb.X1lG3V04pd(this.GWasM1elztuh, s81Var.GWasM1elztuh) && yb.X1lG3V04pd(this.Yi7zF1RB1, s81Var.Yi7zF1RB1);
    }

    public final int hashCode() {
        int i = yb.encWxUiV2;
        return Long.hashCode(this.Yi7zF1RB1) + (Long.hashCode(this.GWasM1elztuh) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        mr0.uFEq9NpZ(this.GWasM1elztuh, sb, ", selectionBackgroundColor=");
        sb.append((Object) yb.mOu10nynGul(this.Yi7zF1RB1));
        sb.append(')');
        return sb.toString();
    }
}
