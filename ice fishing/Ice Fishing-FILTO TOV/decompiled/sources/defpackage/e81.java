package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class e81 {
    public static final e81 X1lG3V04pd = new e81(1.0f, 0.0f);
    public final float GWasM1elztuh;
    public final float Yi7zF1RB1;

    public e81(float f, float f2) {
        this.GWasM1elztuh = f;
        this.Yi7zF1RB1 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e81)) {
            return false;
        }
        e81 e81Var = (e81) obj;
        return this.GWasM1elztuh == e81Var.GWasM1elztuh && this.Yi7zF1RB1 == e81Var.Yi7zF1RB1;
    }

    public final int hashCode() {
        return Float.hashCode(this.Yi7zF1RB1) + (Float.hashCode(this.GWasM1elztuh) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.GWasM1elztuh);
        sb.append(", skewX=");
        return mr0.JFJ3QoxA(sb, this.Yi7zF1RB1, ')');
    }
}
