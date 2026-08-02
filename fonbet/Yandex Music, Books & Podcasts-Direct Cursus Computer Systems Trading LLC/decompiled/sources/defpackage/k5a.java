package defpackage;

/* loaded from: classes5.dex */
public final class k5a extends h4a {
    public final r7b n;
    public final Throwable o;

    public k5a(r7b r7bVar, Throwable th) {
        this.n = r7bVar;
        this.o = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k5a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        k5a k5aVar = (k5a) obj;
        return this.n.equals(k5aVar.n) && this.o.equals(k5aVar.o);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "PortionFailed(context=" + this.n + ", query=null, portionParams=null, error=" + this.o + ")";
    }
}
