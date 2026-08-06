package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class nf1 {
    public final float GWasM1elztuh;
    public final float Yi7zF1RB1;

    public nf1(float f, float f2) {
        this.GWasM1elztuh = f;
        this.Yi7zF1RB1 = f2;
    }

    public final float[] GWasM1elztuh() {
        float f = this.GWasM1elztuh;
        float f2 = this.Yi7zF1RB1;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf1)) {
            return false;
        }
        nf1 nf1Var = (nf1) obj;
        return Float.compare(this.GWasM1elztuh, nf1Var.GWasM1elztuh) == 0 && Float.compare(this.Yi7zF1RB1, nf1Var.Yi7zF1RB1) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.Yi7zF1RB1) + (Float.hashCode(this.GWasM1elztuh) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.GWasM1elztuh);
        sb.append(", y=");
        return mr0.JFJ3QoxA(sb, this.Yi7zF1RB1, ')');
    }
}
