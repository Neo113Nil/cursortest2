package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class q0 {
    public final float GWasM1elztuh;
    public final float Yi7zF1RB1;

    public q0(float f, float f2) {
        this.GWasM1elztuh = f;
        this.Yi7zF1RB1 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Float.compare(this.GWasM1elztuh, q0Var.GWasM1elztuh) == 0 && Float.compare(this.Yi7zF1RB1, q0Var.Yi7zF1RB1) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.Yi7zF1RB1) + (Float.hashCode(this.GWasM1elztuh) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.GWasM1elztuh);
        sb.append(", velocityCoefficient=");
        return mr0.JFJ3QoxA(sb, this.Yi7zF1RB1, ')');
    }
}
