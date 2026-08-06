package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class x71 {
    public final int GWasM1elztuh;

    public static String GWasM1elztuh(int i) {
        return i == 1 ? "Left" : i == 2 ? "Right" : i == 3 ? "Center" : i == 4 ? "Justify" : i == 5 ? "Start" : i == 6 ? "End" : i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x71) {
            return this.GWasM1elztuh == ((x71) obj).GWasM1elztuh;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        return GWasM1elztuh(this.GWasM1elztuh);
    }
}
