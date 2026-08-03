package dd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class t extends yc.a implements hc.d {

    /* renamed from: j, reason: collision with root package name */
    public final fc.d f1882j;

    public t(fc.d dVar, fc.i iVar) {
        super(iVar, true);
        this.f1882j = dVar;
    }

    @Override // yc.k1
    public final boolean R() {
        return true;
    }

    @Override // hc.d
    public final hc.d getCallerFrame() {
        fc.d dVar = this.f1882j;
        if (dVar instanceof hc.d) {
            return (hc.d) dVar;
        }
        return null;
    }

    @Override // yc.k1
    public void x(Object obj) {
        a.g(bc.a0.w(this.f1882j), yc.a0.s(obj));
    }

    @Override // yc.k1
    public void z(Object obj) {
        this.f1882j.resumeWith(yc.a0.s(obj));
    }
}
