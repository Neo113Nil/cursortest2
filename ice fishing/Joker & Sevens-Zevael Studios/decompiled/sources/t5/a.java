package t5;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final e8.e f6523a;

    /* renamed from: b, reason: collision with root package name */
    public final b f6524b;

    public a(e8.e eVar, b bVar) {
        this.f6523a = eVar;
        this.f6524b = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        b bVar = aVar.f6524b;
        if (!this.f6523a.equals(aVar.f6523a)) {
            return false;
        }
        Object obj2 = d.f6527g;
        return obj2.equals(obj2) && this.f6524b.equals(bVar);
    }

    public final int hashCode() {
        return this.f6524b.hashCode() ^ (((((1000003 * 1000003) ^ this.f6523a.hashCode()) * 1000003) ^ d.f6527g.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f6523a + ", priority=" + d.f6527g + ", productData=" + this.f6524b + "}";
    }
}
