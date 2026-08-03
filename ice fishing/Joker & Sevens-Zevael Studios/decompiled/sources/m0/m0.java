package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m0 implements z2 {

    /* renamed from: a, reason: collision with root package name */
    public final l1 f4653a;

    public m0(l1 l1Var) {
        this.f4653a = l1Var;
    }

    @Override // m0.z2
    public final Object a(r1 r1Var) {
        return this.f4653a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && this.f4653a.equals(((m0) obj).f4653a);
    }

    public final int hashCode() {
        return this.f4653a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f4653a + ')';
    }
}
