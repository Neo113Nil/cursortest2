package defpackage;

/* loaded from: classes5.dex */
public final class m5a extends h4a {
    public final r7b n;

    public m5a(r7b r7bVar) {
        this.n = r7bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m5a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.n.equals(((m5a) obj).n);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "PortionStarted(context=" + this.n + ", query=null, portionParams=null)";
    }
}
