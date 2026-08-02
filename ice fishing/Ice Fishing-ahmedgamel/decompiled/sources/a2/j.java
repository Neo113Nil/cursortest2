package a2;

/* loaded from: classes.dex */
public final class j extends q {

    /* renamed from: a, reason: collision with root package name */
    public final h f4273a;

    public j(h hVar) {
        this.f4273a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        Object obj2 = p.f4290n;
        ((j) qVar).getClass();
        return obj2.equals(obj2) && this.f4273a.equals(((j) qVar).f4273a);
    }

    public final int hashCode() {
        return ((p.f4290n.hashCode() ^ 1000003) * 1000003) ^ this.f4273a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f4290n + ", androidClientInfo=" + this.f4273a + "}";
    }
}
