package N1;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public Class f1928a;

    /* renamed from: b, reason: collision with root package name */
    public Class f1929b;

    /* renamed from: c, reason: collision with root package name */
    public Class f1930c;

    public n(Class cls, Class cls2, Class cls3) {
        this.f1928a = cls;
        this.f1929b = cls2;
        this.f1930c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f1928a.equals(nVar.f1928a) && this.f1929b.equals(nVar.f1929b) && p.b(this.f1930c, nVar.f1930c);
    }

    public final int hashCode() {
        int hashCode = (this.f1929b.hashCode() + (this.f1928a.hashCode() * 31)) * 31;
        Class cls = this.f1930c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f1928a + ", second=" + this.f1929b + '}';
    }
}
