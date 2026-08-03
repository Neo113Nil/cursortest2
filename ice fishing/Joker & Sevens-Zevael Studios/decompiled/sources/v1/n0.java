package v1;

import x1.z1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n0 extends y0.m implements x1.w, z1 {

    /* renamed from: u, reason: collision with root package name */
    public o f7107u;

    /* renamed from: v, reason: collision with root package name */
    public final b0.l0 f7108v;

    public n0(o oVar) {
        this.f7107u = oVar;
        this.f7108v = new b0.l0(12, this, oVar);
    }

    @Override // x1.w
    public final f0 e(x1.o0 o0Var, d0 d0Var, long j3) {
        j0 e10 = d0Var.e(j3);
        return o0Var.R(e10.f7085g, e10.f7086h, bc.w.f1068g, this.f7108v, new c1.h(e10, 5));
    }

    @Override // x1.z1
    public final Object r() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }
}
