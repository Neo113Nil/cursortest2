package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p2 extends w0.x {

    /* renamed from: c, reason: collision with root package name */
    public long f4710c;

    public p2(long j3, long j6) {
        super(j3);
        this.f4710c = j6;
    }

    @Override // w0.x
    public final void a(w0.x xVar) {
        pc.j.c(xVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f4710c = ((p2) xVar).f4710c;
    }

    @Override // w0.x
    public final w0.x b(long j3) {
        return new p2(j3, this.f4710c);
    }
}
