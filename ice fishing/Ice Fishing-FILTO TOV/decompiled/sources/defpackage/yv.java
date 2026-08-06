package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class yv implements dw {
    public final gz GWasM1elztuh;

    public yv(gz gzVar) {
        this.GWasM1elztuh = gzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yv) && this.GWasM1elztuh == ((yv) obj).GWasM1elztuh;
    }

    public final int hashCode() {
        return this.GWasM1elztuh.hashCode();
    }

    public final String toString() {
        return "Haptic(kind=" + this.GWasM1elztuh + ")";
    }
}
