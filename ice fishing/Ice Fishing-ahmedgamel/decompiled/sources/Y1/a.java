package Y1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final m4.e f3900a;

    /* renamed from: b, reason: collision with root package name */
    public final b f3901b;

    public a(m4.e eVar, b bVar) {
        this.f3900a = eVar;
        this.f3901b = bVar;
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
        if (!this.f3900a.equals(aVar.f3900a)) {
            return false;
        }
        Object obj2 = d.f3904n;
        if (obj2.equals(obj2)) {
            return this.f3901b.equals(aVar.f3901b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3901b.hashCode() ^ (((((1000003 * 1000003) ^ this.f3900a.hashCode()) * 1000003) ^ d.f3904n.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f3900a + ", priority=" + d.f3904n + ", productData=" + this.f3901b + "}";
    }
}
