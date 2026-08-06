package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class nu {
    public final int GWasM1elztuh;

    public final boolean equals(Object obj) {
        if (obj instanceof nu) {
            return this.GWasM1elztuh == ((nu) obj).GWasM1elztuh;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        int i = this.GWasM1elztuh;
        return i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? "All" : "Invalid";
    }
}
