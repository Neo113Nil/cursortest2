package pc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f5677a;

    public m(Class cls) {
        this.f5677a = cls;
    }

    @Override // pc.d
    public final Class a() {
        return this.f5677a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return j.a(this.f5677a, ((m) obj).f5677a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5677a.hashCode();
    }

    public final String toString() {
        return this.f5677a.toString() + " (Kotlin reflection is not available)";
    }
}
