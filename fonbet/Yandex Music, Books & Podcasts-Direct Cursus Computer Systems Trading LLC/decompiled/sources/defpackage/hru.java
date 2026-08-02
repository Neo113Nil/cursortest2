package defpackage;

/* loaded from: classes4.dex */
public final class hru implements iru {
    public final hsu a;

    public hru(hsu hsuVar) {
        this.a = hsuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hru) && this.a.equals(((hru) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenWaveActionsBottomSheet(wave=" + this.a + ")";
    }
}
