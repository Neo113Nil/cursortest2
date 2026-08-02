package defpackage;

/* loaded from: classes3.dex */
public final class dxc implements exc {
    public final bve a;

    public dxc(bve bveVar) {
        this.a = bveVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dxc) && this.a.equals(((dxc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(offer=" + this.a + ")";
    }
}
