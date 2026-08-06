package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class b91 {
    public final long GWasM1elztuh;

    public static final boolean GWasM1elztuh(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b91) {
            return this.GWasM1elztuh == ((b91) obj).GWasM1elztuh;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        long j = this.GWasM1elztuh;
        return GWasM1elztuh(j, 0L) ? "Unspecified" : GWasM1elztuh(j, 4294967296L) ? "Sp" : GWasM1elztuh(j, 8589934592L) ? "Em" : "Invalid";
    }
}
