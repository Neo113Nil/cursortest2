package f1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z extends b0 {

    /* renamed from: a, reason: collision with root package name */
    public final e1.c f2292a;

    public z(e1.c cVar) {
        this.f2292a = cVar;
    }

    @Override // f1.b0
    public final e1.c a() {
        return this.f2292a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return pc.j.a(this.f2292a, ((z) obj).f2292a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2292a.hashCode();
    }
}
