package yc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g1 extends g {

    /* renamed from: o, reason: collision with root package name */
    public final m f8851o;

    public g1(fc.d dVar, m mVar) {
        super(1, dVar);
        this.f8851o = mVar;
    }

    @Override // yc.g
    public final Throwable o(k1 k1Var) {
        Throwable c3;
        Object M = this.f8851o.M();
        return (!(M instanceof i1) || (c3 = ((i1) M).c()) == null) ? M instanceof p ? ((p) M).f8889a : k1Var.m() : c3;
    }

    @Override // yc.g
    public final String x() {
        return "AwaitContinuation";
    }
}
