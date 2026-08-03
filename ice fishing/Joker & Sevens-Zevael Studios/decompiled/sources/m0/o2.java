package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o2 extends w0.x {

    /* renamed from: c, reason: collision with root package name */
    public int f4696c;

    public o2(int i10, long j3) {
        super(j3);
        this.f4696c = i10;
    }

    @Override // w0.x
    public final void a(w0.x xVar) {
        pc.j.c(xVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f4696c = ((o2) xVar).f4696c;
    }

    @Override // w0.x
    public final w0.x b(long j3) {
        return new o2(this.f4696c, j3);
    }
}
