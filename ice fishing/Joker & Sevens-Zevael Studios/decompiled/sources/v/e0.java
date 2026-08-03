package v;

import m0.x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final o0.e f6819a = new o0.e(new c0[16]);

    /* renamed from: b, reason: collision with root package name */
    public final m0.l1 f6820b = m0.z.s(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    public long f6821c = Long.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final m0.l1 f6822d = m0.z.s(Boolean.TRUE);

    public final void a(int i10, m0.r rVar) {
        rVar.Z(-318043801);
        if ((((rVar.h(this) ? 4 : 2) | i10) & 3) == 2 && rVar.B()) {
            rVar.S();
        } else {
            Object M = rVar.M();
            m0.z0 z0Var = m0.l.f4646a;
            if (M == z0Var) {
                M = m0.z.s(null);
                rVar.i0(M);
            }
            m0.d1 d1Var = (m0.d1) M;
            if (((Boolean) this.f6822d.getValue()).booleanValue() || ((Boolean) this.f6820b.getValue()).booleanValue()) {
                rVar.X(1719915818);
                boolean h10 = rVar.h(this);
                Object M2 = rVar.M();
                if (h10 || M2 == z0Var) {
                    M2 = new bd.o(d1Var, this, null);
                    rVar.i0(M2);
                }
                m0.z.f(this, rVar, (oc.e) M2);
                rVar.q(false);
            } else {
                rVar.X(1721436120);
                rVar.q(false);
            }
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new a1.g(i10, 4, this);
        }
    }
}
