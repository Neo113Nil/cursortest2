package j0;

import m0.v1;
import m0.x1;
import m0.y0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class x {
    static {
        new y0(k.f3391m);
    }

    public static final void a(j jVar, k0 k0Var, s0 s0Var, u0.d dVar, m0.r rVar, int i10) {
        int i11;
        k0 k0Var2;
        rVar.Z(-2127166334);
        if ((i10 & 6) == 0) {
            i11 = (rVar.f(jVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= rVar.f(s0Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= rVar.h(dVar) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && rVar.B()) {
            rVar.S();
            k0Var2 = k0Var;
        } else {
            rVar.U();
            if ((i10 & 1) == 0 || rVar.z()) {
                k0Var2 = (k0) rVar.j(l0.f3406a);
            } else {
                rVar.S();
                k0Var2 = k0Var;
            }
            rVar.r();
            w.i0 a6 = h0.a(0.0f, rVar, 0, 7);
            long j3 = jVar.f3355a;
            boolean e10 = rVar.e(j3);
            Object M = rVar.M();
            if (e10 || M == m0.l.f4646a) {
                M = new g0.c(j3, f1.q.b(j3, 0.4f));
                rVar.i0(M);
            }
            m0.z.b(new v1[]{l.f3404a.a(jVar), androidx.compose.foundation.c.f511a.a(a6), i0.s.f2994a.a(m.f3407a), l0.f3406a.a(k0Var2), g0.d.f2417a.a((g0.c) M), t0.f3483a.a(s0Var)}, u0.e.e(-1066563262, new a1.f(6, s0Var, dVar), rVar), rVar, 56);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new w(jVar, k0Var2, s0Var, dVar, i10, 0);
        }
    }
}
