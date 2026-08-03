package yc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l1 extends r1 {

    /* renamed from: j, reason: collision with root package name */
    public final fc.d f8876j;

    public l1(fc.i iVar, oc.e eVar) {
        super(iVar, false);
        this.f8876j = bc.a0.h(this, this, eVar);
    }

    @Override // yc.k1
    public final void Y() {
        try {
            dd.a.g(bc.a0.w(this.f8876j), ac.o.f277a);
        } catch (Throwable th) {
            resumeWith(v6.a.s(th));
            throw th;
        }
    }
}
