package j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z extends y0.m implements x1.k, x1.w {
    @Override // x1.w
    public final v1.f0 e(x1.o0 o0Var, v1.d0 d0Var, long j3) {
        float f10 = ((s2.f) x1.f.i(this, v.f3485a)).f6387g;
        float f11 = 0;
        if (f10 < f11) {
            f10 = f11;
        }
        v1.j0 e10 = d0Var.e(j3);
        boolean z10 = this.f8456t && !Float.isNaN(f10) && Float.compare(f10, f11) > 0;
        int D = Float.isNaN(f10) ? 0 : o0Var.D(f10);
        int max = z10 ? Math.max(e10.f7085g, D) : e10.f7085g;
        int max2 = z10 ? Math.max(e10.f7086h, D) : e10.f7086h;
        return o0Var.H(max, max2, bc.w.f1068g, new y(max, e10, max2));
    }
}
