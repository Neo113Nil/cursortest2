package l7;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Class f4251a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f4252b;

    public r(Class cls, Class cls2) {
        this.f4251a = cls;
        this.f4252b = cls2;
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
        if (this.f4252b.equals(rVar.f4252b)) {
            return this.f4251a.equals(rVar.f4251a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4251a.hashCode() + (this.f4252b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f4252b;
        Class cls2 = this.f4251a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
