package Y1;

/* loaded from: classes.dex */
public final class j extends q {

    /* renamed from: a, reason: collision with root package name */
    public final h f3920a;

    public j(h hVar) {
        this.f3920a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        Object obj2 = p.f3937n;
        ((j) qVar).getClass();
        return obj2.equals(obj2) && this.f3920a.equals(((j) qVar).f3920a);
    }

    public final int hashCode() {
        return ((p.f3937n.hashCode() ^ 1000003) * 1000003) ^ this.f3920a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f3937n + ", androidClientInfo=" + this.f3920a + "}";
    }
}
