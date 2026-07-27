package Y1;

/* loaded from: classes.dex */
public final class j extends q {

    /* renamed from: a, reason: collision with root package name */
    public final h f3933a;

    public j(h hVar) {
        this.f3933a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        Object obj2 = p.f3950n;
        ((j) qVar).getClass();
        return obj2.equals(obj2) && this.f3933a.equals(((j) qVar).f3933a);
    }

    public final int hashCode() {
        return ((p.f3950n.hashCode() ^ 1000003) * 1000003) ^ this.f3933a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f3950n + ", androidClientInfo=" + this.f3933a + "}";
    }
}
