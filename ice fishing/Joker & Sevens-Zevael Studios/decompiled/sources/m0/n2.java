package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n2 extends w0.x {

    /* renamed from: c, reason: collision with root package name */
    public float f4687c;

    public n2(long j3, float f10) {
        super(j3);
        this.f4687c = f10;
    }

    @Override // w0.x
    public final void a(w0.x xVar) {
        pc.j.c(xVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f4687c = ((n2) xVar).f4687c;
    }

    @Override // w0.x
    public final w0.x b(long j3) {
        return new n2(j3, this.f4687c);
    }
}
