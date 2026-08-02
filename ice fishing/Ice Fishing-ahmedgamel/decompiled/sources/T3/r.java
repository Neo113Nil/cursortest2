package T3;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Class f3207a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f3208b;

    public r(Class cls, Class cls2) {
        this.f3207a = cls;
        this.f3208b = cls2;
    }

    public static r a(Class cls) {
        return new r(q.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f3208b.equals(rVar.f3208b)) {
            return this.f3207a.equals(rVar.f3207a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3207a.hashCode() + (this.f3208b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f3208b;
        Class cls2 = this.f3207a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
