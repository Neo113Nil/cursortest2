package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class r6 {
    public final float GWasM1elztuh;
    public final float Yi7zF1RB1;

    public r6(float f, float f2) {
        this.GWasM1elztuh = f;
        this.Yi7zF1RB1 = f2;
    }

    public final long GWasM1elztuh(long j, long j2, p50 p50Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        p50 p50Var2 = p50.OOA6hdeuvCS;
        float f3 = this.GWasM1elztuh;
        if (p50Var != p50Var2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.Yi7zF1RB1) * f2;
        int round = Math.round((f3 + 1.0f) * f);
        return (Math.round(f4) & 4294967295L) | (round << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6)) {
            return false;
        }
        r6 r6Var = (r6) obj;
        return Float.compare(this.GWasM1elztuh, r6Var.GWasM1elztuh) == 0 && Float.compare(this.Yi7zF1RB1, r6Var.Yi7zF1RB1) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.Yi7zF1RB1) + (Float.hashCode(this.GWasM1elztuh) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.GWasM1elztuh);
        sb.append(", verticalBias=");
        return mr0.JFJ3QoxA(sb, this.Yi7zF1RB1, ')');
    }
}
