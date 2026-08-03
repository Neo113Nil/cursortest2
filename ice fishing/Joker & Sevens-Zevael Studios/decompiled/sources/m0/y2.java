package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y2 implements z2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4837a;

    public y2(Object obj) {
        this.f4837a = obj;
    }

    @Override // m0.z2
    public final Object a(r1 r1Var) {
        return this.f4837a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y2) && pc.j.a(this.f4837a, ((y2) obj).f4837a);
    }

    public final int hashCode() {
        Object obj = this.f4837a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f4837a + ')';
    }
}
