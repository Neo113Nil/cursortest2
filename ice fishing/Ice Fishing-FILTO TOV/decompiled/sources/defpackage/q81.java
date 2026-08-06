package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class q81 {
    public static final q81 X1lG3V04pd = new q81(2, false);
    public static final q81 xqGvceK5x = new q81(1, true);
    public final int GWasM1elztuh;
    public final boolean Yi7zF1RB1;

    public q81(int i, boolean z) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q81)) {
            return false;
        }
        q81 q81Var = (q81) obj;
        return this.GWasM1elztuh == q81Var.GWasM1elztuh && this.Yi7zF1RB1 == q81Var.Yi7zF1RB1;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.Yi7zF1RB1) + (Integer.hashCode(this.GWasM1elztuh) * 31);
    }

    public final String toString() {
        return equals(X1lG3V04pd) ? "TextMotion.Static" : equals(xqGvceK5x) ? "TextMotion.Animated" : "Invalid";
    }
}
