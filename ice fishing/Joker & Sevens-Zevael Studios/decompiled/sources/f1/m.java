package f1;

import b0.l0;
import x1.o0;
import x1.u1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m extends y0.m implements x1.w, u1 {

    /* renamed from: u, reason: collision with root package name */
    public oc.c f2272u;

    public m(oc.c cVar) {
        this.f2272u = cVar;
    }

    @Override // x1.w
    public final v1.f0 e(o0 o0Var, v1.d0 d0Var, long j3) {
        v1.j0 e10 = d0Var.e(j3);
        return o0Var.H(e10.f7085g, e10.f7086h, bc.w.f1068g, new l0(1, e10, this));
    }

    @Override // y0.m
    public final boolean g0() {
        return false;
    }

    @Override // x1.u1
    public final boolean h() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f2272u + ')';
    }

    @Override // x1.u1
    public final void I(e2.j jVar) {
    }
}
