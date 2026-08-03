package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q2 extends w0.x {

    /* renamed from: c, reason: collision with root package name */
    public Object f4720c;

    public q2(long j3, Object obj) {
        super(j3);
        this.f4720c = obj;
    }

    @Override // w0.x
    public final void a(w0.x xVar) {
        pc.j.c(xVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f4720c = ((q2) xVar).f4720c;
    }

    @Override // w0.x
    public final w0.x b(long j3) {
        return new q2(w0.m.k().g(), this.f4720c);
    }
}
