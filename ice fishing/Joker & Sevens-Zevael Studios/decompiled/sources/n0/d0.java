package n0;

import m0.f2;
import m0.m2;
import m0.x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d0 extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f4997c = new d0(1, 0, 2);

    @Override // n0.i0
    public final void a(k0 k0Var, m0.c cVar, m2 m2Var, x4.q qVar, j0 j0Var) {
        int a6 = k0Var.a(0);
        int i10 = m2Var.f4679v;
        int M = m2Var.M(m2Var.f4659b, m2Var.r(i10));
        int g8 = m2Var.g(m2Var.f4659b, m2Var.r(i10 + 1));
        for (int max = Math.max(M, g8 - a6); max < g8; max++) {
            Object obj = m2Var.f4660c[m2Var.h(max)];
            if (obj instanceof f2) {
                qVar.d((f2) obj);
            } else if (obj instanceof x1) {
                ((x1) obj).d();
            }
        }
        if (a6 <= 0) {
            m0.t.c("Check failed");
        }
        int i11 = m2Var.f4679v;
        int M2 = m2Var.M(m2Var.f4659b, m2Var.r(i11));
        int g10 = m2Var.g(m2Var.f4659b, m2Var.r(i11 + 1)) - a6;
        if (g10 < M2) {
            m0.t.c("Check failed");
        }
        m2Var.I(g10, a6, i11);
        int i12 = m2Var.f4666i;
        if (i12 >= M2) {
            m2Var.f4666i = i12 - a6;
        }
    }
}
