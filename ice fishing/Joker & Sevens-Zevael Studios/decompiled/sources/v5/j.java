package v5;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j extends q {

    /* renamed from: a, reason: collision with root package name */
    public final h f7275a;

    public j(h hVar) {
        this.f7275a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        Object obj2 = p.f7292g;
        if (obj2.equals(obj2)) {
            return this.f7275a.equals(((j) qVar).f7275a);
        }
        return false;
    }

    public final int hashCode() {
        return ((p.f7292g.hashCode() ^ 1000003) * 1000003) ^ this.f7275a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f7292g + ", androidClientInfo=" + this.f7275a + "}";
    }
}
