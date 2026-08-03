package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final u f4801a;

    public x(u uVar) {
        this.f4801a = uVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return pc.j.a(this.f4801a, ((x) obj).f4801a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4801a.hashCode() * 31;
    }
}
