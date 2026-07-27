package W1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final k4.e f3403a;

    /* renamed from: b, reason: collision with root package name */
    public final b f3404b;

    public a(k4.e eVar, b bVar) {
        this.f3403a = eVar;
        this.f3404b = bVar;
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
        if (!this.f3403a.equals(aVar.f3403a)) {
            return false;
        }
        Object obj2 = d.f3407n;
        if (obj2.equals(obj2)) {
            return this.f3404b.equals(aVar.f3404b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3404b.hashCode() ^ (((((1000003 * 1000003) ^ this.f3403a.hashCode()) * 1000003) ^ d.f3407n.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f3403a + ", priority=" + d.f3407n + ", productData=" + this.f3404b + "}";
    }
}
