package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6851a = 0;

    static {
        bc.a0.x(f1.f6839g);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [oc.c, pc.k] */
    /* JADX WARN: Type inference failed for: r5v5, types: [oc.c, pc.k] */
    public static final y0 a(e1 e1Var, x4.s sVar, String str, m0.r rVar, int i10, int i11) {
        x0 x0Var;
        if ((i11 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean f10 = rVar.f(e1Var);
        Object M = rVar.M();
        Object obj = m0.l.f4646a;
        if (f10 || M == obj) {
            M = new y0(e1Var, sVar, str);
            rVar.i0(M);
        }
        y0 y0Var = (y0) M;
        boolean f11 = rVar.f(e1Var) | rVar.h(y0Var);
        Object M2 = rVar.M();
        if (f11 || M2 == obj) {
            M2 = new b0.l0(11, e1Var, y0Var);
            rVar.i0(M2);
        }
        m0.z.d(y0Var, (oc.c) M2, rVar);
        if (e1Var.g() && (x0Var = (x0) y0Var.f7018b.getValue()) != null) {
            e1 e1Var2 = y0Var.f7019c;
            x0Var.f7013g.f(x0Var.f7015i.invoke(e1Var2.f().a()), x0Var.f7015i.invoke(e1Var2.f().c()), (x) x0Var.f7014h.invoke(e1Var2.f()));
        }
        return y0Var;
    }
}
