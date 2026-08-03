package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d0 implements e2 {

    /* renamed from: g, reason: collision with root package name */
    public final yc.y f4546g;

    public d0(yc.y yVar) {
        this.f4546g = yVar;
    }

    @Override // m0.e2
    public final void e() {
        yc.y yVar = this.f4546g;
        if (yVar instanceof h2) {
            ((h2) yVar).a();
        } else {
            yc.a0.d(yVar, new n0(1));
        }
    }

    @Override // m0.e2
    public final void h() {
        yc.y yVar = this.f4546g;
        if (yVar instanceof h2) {
            ((h2) yVar).a();
        } else {
            yc.a0.d(yVar, new n0(1));
        }
    }

    @Override // m0.e2
    public final void c() {
    }
}
