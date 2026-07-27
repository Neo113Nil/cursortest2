package N1;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public Class f1972a;

    /* renamed from: b, reason: collision with root package name */
    public Class f1973b;

    /* renamed from: c, reason: collision with root package name */
    public Class f1974c;

    public n(Class cls, Class cls2, Class cls3) {
        this.f1972a = cls;
        this.f1973b = cls2;
        this.f1974c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f1972a.equals(nVar.f1972a) && this.f1973b.equals(nVar.f1973b) && p.b(this.f1974c, nVar.f1974c);
    }

    public final int hashCode() {
        int hashCode = (this.f1973b.hashCode() + (this.f1972a.hashCode() * 31)) * 31;
        Class cls = this.f1974c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f1972a + ", second=" + this.f1973b + '}';
    }
}
