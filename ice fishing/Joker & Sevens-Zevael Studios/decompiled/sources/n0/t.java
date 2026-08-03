package n0;

import m0.j2;
import m0.m2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final t f5033c = new t(0, 3, 1);

    @Override // n0.i0
    public final void a(k0 k0Var, m0.c cVar, m2 m2Var, x4.q qVar, j0 j0Var) {
        x4.l lVar;
        j2 j2Var = (j2) k0Var.b(1);
        m0.a aVar = (m0.a) k0Var.b(0);
        c cVar2 = (c) k0Var.b(2);
        m2 d10 = j2Var.d();
        if (j0Var != null) {
            try {
                lVar = new x4.l(6, j0Var, m2Var);
            } catch (Throwable th) {
                d10.e(false);
                throw th;
            }
        } else {
            lVar = null;
        }
        if (!cVar2.f4994e.L()) {
            m0.t.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        cVar2.f4993d.K(cVar, d10, qVar, lVar);
        d10.e(true);
        m2Var.d();
        aVar.getClass();
        m2Var.z(j2Var, j2Var.a(aVar));
        m2Var.k();
    }
}
