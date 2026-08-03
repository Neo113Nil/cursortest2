package n0;

import m0.m2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final f f5000c = new f(0, 2, 1);

    @Override // n0.i0
    public final void a(k0 k0Var, m0.c cVar, m2 m2Var, x4.q qVar, j0 j0Var) {
        u0.f fVar = (u0.f) k0Var.b(1);
        int i10 = fVar != null ? fVar.f6671a : 0;
        a aVar = (a) k0Var.b(0);
        if (i10 > 0) {
            cVar = new l6.m(cVar, i10);
        }
        aVar.J(cVar, m2Var, qVar, j0Var != null ? new x4.l(6, j0Var, m2Var) : null);
    }
}
