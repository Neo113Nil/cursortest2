package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a1 implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6770a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6771b;

    public a1(Object obj, Object obj2) {
        this.f6770a = obj;
        this.f6771b = obj2;
    }

    @Override // v.z0
    public final Object a() {
        return this.f6770a;
    }

    @Override // v.z0
    public final Object c() {
        return this.f6771b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return pc.j.a(this.f6770a, z0Var.a()) && pc.j.a(this.f6771b, z0Var.c());
    }

    public final int hashCode() {
        Object obj = this.f6770a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f6771b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
