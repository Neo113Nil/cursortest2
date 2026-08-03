package w0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u extends x {

    /* renamed from: c, reason: collision with root package name */
    public q0.c f7616c;

    /* renamed from: d, reason: collision with root package name */
    public int f7617d;

    /* renamed from: e, reason: collision with root package name */
    public int f7618e;

    public u(long j3, q0.c cVar) {
        super(j3);
        this.f7616c = cVar;
    }

    @Override // w0.x
    public final void a(x xVar) {
        synchronized (r.f7593a) {
            pc.j.c(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.f7616c = ((u) xVar).f7616c;
            this.f7617d = ((u) xVar).f7617d;
            this.f7618e = ((u) xVar).f7618e;
        }
    }

    @Override // w0.x
    public final x b(long j3) {
        return new u(j3, this.f7616c);
    }
}
