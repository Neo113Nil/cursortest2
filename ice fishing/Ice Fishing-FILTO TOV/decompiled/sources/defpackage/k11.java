package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class k11 implements l11 {
    public final boolean GWasM1elztuh;

    public k11(boolean z) {
        this.GWasM1elztuh = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k11) && this.GWasM1elztuh == ((k11) obj).GWasM1elztuh;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        return "TimerToggled(visible=" + this.GWasM1elztuh + ")";
    }
}
