package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class nw implements rw {
    public final long GWasM1elztuh;

    public nw(long j) {
        this.GWasM1elztuh = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nw) && this.GWasM1elztuh == ((nw) obj).GWasM1elztuh;
    }

    public final int hashCode() {
        return Long.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        return "Tick(deltaMs=" + this.GWasM1elztuh + ")";
    }
}
