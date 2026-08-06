package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class dr {
    public final db1 GWasM1elztuh;

    public dr(db1 db1Var) {
        this.GWasM1elztuh = db1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dr) {
            return Float.compare(0.0f, 0.0f) == 0 && this.GWasM1elztuh.equals(((dr) obj).GWasM1elztuh);
        }
        return false;
    }

    public final int hashCode() {
        return this.GWasM1elztuh.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.GWasM1elztuh + ')';
    }
}
