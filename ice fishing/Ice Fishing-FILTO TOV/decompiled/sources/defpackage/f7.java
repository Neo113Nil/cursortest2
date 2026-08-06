package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class f7 {
    public final t41 GWasM1elztuh;

    public f7(t41 t41Var) {
        this.GWasM1elztuh = t41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f7) {
            return cn.Yi7zF1RB1(1.0f, 1.0f) && this.GWasM1elztuh.equals(((f7) obj).GWasM1elztuh);
        }
        return false;
    }

    public final int hashCode() {
        return this.GWasM1elztuh.hashCode() + (Float.hashCode(1.0f) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) cn.X1lG3V04pd(1.0f)) + ", brush=" + this.GWasM1elztuh + ')';
    }
}
