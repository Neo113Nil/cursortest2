package R3;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Class f2752a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f2753b;

    public r(Class cls, Class cls2) {
        this.f2752a = cls;
        this.f2753b = cls2;
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
        if (this.f2753b.equals(rVar.f2753b)) {
            return this.f2752a.equals(rVar.f2752a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2752a.hashCode() + (this.f2753b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f2753b;
        Class cls2 = this.f2752a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
