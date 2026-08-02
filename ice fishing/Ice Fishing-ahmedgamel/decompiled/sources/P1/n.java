package P1;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public Class f2372a;

    /* renamed from: b, reason: collision with root package name */
    public Class f2373b;

    /* renamed from: c, reason: collision with root package name */
    public Class f2374c;

    public n(Class cls, Class cls2, Class cls3) {
        this.f2372a = cls;
        this.f2373b = cls2;
        this.f2374c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f2372a.equals(nVar.f2372a) && this.f2373b.equals(nVar.f2373b) && p.b(this.f2374c, nVar.f2374c);
    }

    public final int hashCode() {
        int hashCode = (this.f2373b.hashCode() + (this.f2372a.hashCode() * 31)) * 31;
        Class cls = this.f2374c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f2372a + ", second=" + this.f2373b + '}';
    }
}
