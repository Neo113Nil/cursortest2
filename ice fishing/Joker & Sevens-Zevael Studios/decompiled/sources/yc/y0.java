package yc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y0 implements z0 {

    /* renamed from: g, reason: collision with root package name */
    public final oc.c f8919g;

    public y0(oc.c cVar) {
        this.f8919g = cVar;
    }

    @Override // yc.z0
    public final void d(Throwable th) {
        this.f8919g.invoke(th);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f8919g.getClass().getSimpleName() + '@' + a0.j(this) + ']';
    }
}
