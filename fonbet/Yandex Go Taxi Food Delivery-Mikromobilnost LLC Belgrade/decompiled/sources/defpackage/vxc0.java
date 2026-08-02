package defpackage;

/* loaded from: classes10.dex */
public final class vxc0 {
    public final hfr a;

    static {
        new uxc0().c();
        tw21.Q(0);
    }

    public vxc0(hfr hfrVar) {
        this.a = hfrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vxc0) {
            return this.a.equals(((vxc0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
