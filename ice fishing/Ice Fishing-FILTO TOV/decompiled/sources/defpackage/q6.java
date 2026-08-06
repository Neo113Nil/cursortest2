package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class q6 {
    public final float GWasM1elztuh;

    public q6(float f) {
        this.GWasM1elztuh = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q6) && Float.compare(this.GWasM1elztuh, ((q6) obj).GWasM1elztuh) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        return mr0.JFJ3QoxA(new StringBuilder("Vertical(bias="), this.GWasM1elztuh, ')');
    }
}
