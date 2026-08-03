package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f0 implements z2 {

    /* renamed from: a, reason: collision with root package name */
    public final pc.k f4583a;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(oc.c cVar) {
        this.f4583a = (pc.k) cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [oc.c, pc.k] */
    @Override // m0.z2
    public final Object a(r1 r1Var) {
        return this.f4583a.invoke(r1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && this.f4583a.equals(((f0) obj).f4583a);
    }

    public final int hashCode() {
        return this.f4583a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f4583a + ')';
    }
}
