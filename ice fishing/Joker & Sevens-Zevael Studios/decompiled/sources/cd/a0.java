package cd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a0 implements fc.d, hc.d {

    /* renamed from: g, reason: collision with root package name */
    public final fc.d f1335g;

    /* renamed from: h, reason: collision with root package name */
    public final fc.i f1336h;

    public a0(fc.d dVar, fc.i iVar) {
        this.f1335g = dVar;
        this.f1336h = iVar;
    }

    @Override // hc.d
    public final hc.d getCallerFrame() {
        fc.d dVar = this.f1335g;
        if (dVar instanceof hc.d) {
            return (hc.d) dVar;
        }
        return null;
    }

    @Override // fc.d
    public final fc.i getContext() {
        return this.f1336h;
    }

    @Override // fc.d
    public final void resumeWith(Object obj) {
        this.f1335g.resumeWith(obj);
    }
}
