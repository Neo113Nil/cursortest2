package n0;

import m0.f2;
import m0.m2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e f4998c = new e(0, 2, 1);

    @Override // n0.i0
    public final void a(k0 k0Var, m0.c cVar, m2 m2Var, x4.q qVar, j0 j0Var) {
        m0.a aVar = (m0.a) k0Var.b(0);
        Object b2 = k0Var.b(1);
        if (b2 instanceof f2) {
            f2 f2Var = (f2) b2;
            ((o0.e) qVar.f8346e).b(f2Var);
            ((s.h0) qVar.f8345d).a(f2Var);
        }
        if (m2Var.f4671n != 0) {
            m0.t.c("Can only append a slot if not current inserting");
        }
        int i10 = m2Var.f4666i;
        int i11 = m2Var.f4667j;
        int c3 = m2Var.c(aVar);
        int g8 = m2Var.g(m2Var.f4659b, m2Var.r(c3 + 1));
        m2Var.f4666i = g8;
        m2Var.f4667j = g8;
        m2Var.w(1, c3);
        if (i10 >= g8) {
            i10++;
            i11++;
        }
        m2Var.f4660c[g8] = b2;
        m2Var.f4666i = i10;
        m2Var.f4667j = i11;
    }
}
