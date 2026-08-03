package yc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n0 extends p0 {

    /* renamed from: i, reason: collision with root package name */
    public final g f8878i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r0 f8879j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(r0 r0Var, long j3, g gVar) {
        super(j3);
        this.f8879j = r0Var;
        this.f8878i = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8878i.C(this.f8879j);
    }

    @Override // yc.p0
    public final String toString() {
        return super.toString() + this.f8878i;
    }
}
