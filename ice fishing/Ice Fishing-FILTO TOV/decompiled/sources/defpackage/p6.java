package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class p6 {
    public final float GWasM1elztuh;

    public p6(float f) {
        this.GWasM1elztuh = f;
    }

    public final int GWasM1elztuh(int i, int i2, p50 p50Var) {
        float f = (i2 - i) / 2.0f;
        p50 p50Var2 = p50.OOA6hdeuvCS;
        float f2 = this.GWasM1elztuh;
        if (p50Var != p50Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p6) && Float.compare(this.GWasM1elztuh, ((p6) obj).GWasM1elztuh) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        return mr0.JFJ3QoxA(new StringBuilder("Horizontal(bias="), this.GWasM1elztuh, ')');
    }
}
