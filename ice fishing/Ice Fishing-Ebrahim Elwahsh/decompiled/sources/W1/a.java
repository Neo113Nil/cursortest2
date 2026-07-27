package W1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final g4.e f3415a;

    /* renamed from: b, reason: collision with root package name */
    public final b f3416b;

    public a(g4.e eVar, b bVar) {
        this.f3415a = eVar;
        this.f3416b = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        if (!this.f3415a.equals(aVar.f3415a)) {
            return false;
        }
        Object obj2 = d.f3419n;
        if (obj2.equals(obj2)) {
            return this.f3416b.equals(aVar.f3416b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3416b.hashCode() ^ (((((1000003 * 1000003) ^ this.f3415a.hashCode()) * 1000003) ^ d.f3419n.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f3415a + ", priority=" + d.f3419n + ", productData=" + this.f3416b + "}";
    }
}
