package u;

import m0.z0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends pc.k implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w0.q f6580g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6581h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f6582i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u0.d f6583j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(w0.q qVar, Object obj, m mVar, u0.d dVar) {
        super(3);
        this.f6580g = qVar;
        this.f6581h = obj;
        this.f6582i = mVar;
        this.f6583j = dVar;
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        r rVar = (r) obj;
        m0.r rVar2 = (m0.r) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? rVar2.f(rVar) : rVar2.h(rVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && rVar2.B()) {
            rVar2.S();
        } else {
            w0.q qVar = this.f6580g;
            boolean f10 = rVar2.f(qVar);
            Object obj4 = this.f6581h;
            boolean h10 = f10 | rVar2.h(obj4);
            m mVar = this.f6582i;
            boolean h11 = h10 | rVar2.h(mVar);
            Object M = rVar2.M();
            z0 z0Var = m0.l.f4646a;
            if (h11 || M == z0Var) {
                M = new a0.r(qVar, obj4, mVar, 3);
                rVar2.i0(M);
            }
            m0.z.d(rVar, (oc.c) M, rVar2);
            s.g0 g0Var = mVar.f6619c;
            pc.j.c(rVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
            g0Var.m(obj4, ((s) rVar).f6639b);
            Object M2 = rVar2.M();
            if (M2 == z0Var) {
                M2 = new i(rVar);
                rVar2.i0(M2);
            }
            this.f6583j.d((i) M2, obj4, rVar2, 0);
        }
        return ac.o.f277a;
    }
}
