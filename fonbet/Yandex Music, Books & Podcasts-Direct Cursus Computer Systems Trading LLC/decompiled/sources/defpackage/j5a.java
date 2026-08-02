package defpackage;

/* loaded from: classes5.dex */
public final class j5a extends h4a {
    public final r7b n;

    public j5a(r7b r7bVar) {
        this.n = r7bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!j5a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.n.equals(((j5a) obj).n);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "PortionCancelled(context=" + this.n + ", query=null, portionParams=null)";
    }
}
