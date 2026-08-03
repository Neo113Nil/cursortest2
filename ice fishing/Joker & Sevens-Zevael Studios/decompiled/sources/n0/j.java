package n0;

import m0.m2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final j f5009c = new j(0, 2, 1);

    @Override // n0.i0
    public final void a(k0 k0Var, m0.c cVar, m2 m2Var, x4.q qVar, j0 j0Var) {
        int i10;
        u0.f fVar = (u0.f) k0Var.b(0);
        int c3 = m2Var.c((m0.a) k0Var.b(1));
        if (m2Var.f4677t >= c3) {
            m0.t.c("Check failed");
        }
        x4.f.R(m2Var, cVar, c3);
        int i11 = m2Var.f4677t;
        int i12 = m2Var.f4679v;
        while (i12 >= 0 && !m2Var.x(i12)) {
            i12 = m2Var.D(m2Var.f4659b, i12);
        }
        int i13 = i12 + 1;
        int i14 = 0;
        while (i13 < i11) {
            if (m2Var.u(i11, i13)) {
                if (m2Var.x(i13)) {
                    i14 = 0;
                }
                i13++;
            } else {
                i14 += m2Var.x(i13) ? 1 : m2Var.f4659b[(m2Var.r(i13) * 5) + 1] & 67108863;
                i13 += m2Var.t(i13);
            }
        }
        while (true) {
            i10 = m2Var.f4677t;
            if (i10 >= c3) {
                break;
            }
            if (m2Var.u(c3, i10)) {
                int i15 = m2Var.f4677t;
                if (i15 < m2Var.f4678u && (m2Var.f4659b[(m2Var.r(i15) * 5) + 1] & 1073741824) != 0) {
                    cVar.d(m2Var.C(m2Var.f4677t));
                    i14 = 0;
                }
                m2Var.O();
            } else {
                i14 += m2Var.K();
            }
        }
        if (i10 != c3) {
            m0.t.c("Check failed");
        }
        fVar.f6671a = i14;
    }
}
