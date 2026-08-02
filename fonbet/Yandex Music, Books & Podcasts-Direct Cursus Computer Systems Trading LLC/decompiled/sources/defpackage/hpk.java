package defpackage;

/* loaded from: classes4.dex */
public final class hpk {
    public final gpk a;
    public final iys b;
    public final Object c = btf.a(bwf.c, new d1j(11, this));

    public hpk(gpk gpkVar, iys iysVar) {
        this.a = gpkVar;
        this.b = iysVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpk)) {
            return false;
        }
        hpk hpkVar = (hpk) obj;
        return this.a == hpkVar.a && this.b.equals(hpkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackOperationWrapper(type=" + this.a + ", source=" + this.b + ")";
    }
}
