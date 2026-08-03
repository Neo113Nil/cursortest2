package j0;

import m0.v1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0.e0 f3431a = new m0.e0(k.f3395q);

    public static final void a(y0.n nVar, f1.g0 g0Var, long j3, long j6, float f10, u0.d dVar, m0.r rVar, int i10, int i11) {
        if ((i11 & 2) != 0) {
            g0Var = f1.d0.f2219a;
        }
        f1.g0 g0Var2 = g0Var;
        if ((i11 & 4) != 0) {
            j3 = ((j) rVar.j(l.f3404a)).f3370p;
        }
        long j10 = j3;
        long b2 = (i11 & 8) != 0 ? l.b(j10, rVar) : j6;
        float f11 = 0;
        float f12 = (i11 & 32) != 0 ? 0 : f10;
        m0.e0 e0Var = f3431a;
        float f13 = ((s2.f) rVar.j(e0Var)).f6387g + f11;
        m0.z.b(new v1[]{n.f3409a.a(new f1.q(b2)), e0Var.a(new s2.f(f13))}, u0.e.e(-70914509, new n0(nVar, g0Var2, j10, f13, f12, dVar), rVar), rVar, 56);
    }

    public static final y0.n b(y0.n nVar, f1.g0 g0Var, long j3, float f10) {
        y0.k kVar = y0.k.f8442a;
        return x4.f.B(androidx.compose.foundation.a.a(nVar.d(f10 > 0.0f ? androidx.compose.ui.graphics.a.b(kVar, f10, g0Var, 124895) : kVar).d(kVar), j3, g0Var), g0Var);
    }

    public static final long c(long j3, float f10, m0.r rVar) {
        j jVar = (j) rVar.j(l.f3404a);
        boolean booleanValue = ((Boolean) rVar.j(l.f3405b)).booleanValue();
        long j6 = jVar.f3370p;
        if (!f1.q.c(j3, j6) || !booleanValue) {
            return j3;
        }
        if (s2.f.a(f10, 0)) {
            return j6;
        }
        return f1.d0.h(f1.q.b(jVar.f3374t, ((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f), j6);
    }
}
