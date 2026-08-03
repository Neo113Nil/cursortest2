package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final x4.s f7017a;

    /* renamed from: b, reason: collision with root package name */
    public final m0.l1 f7018b = m0.z.s(null);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1 f7019c;

    public y0(e1 e1Var, x4.s sVar, String str) {
        this.f7019c = e1Var;
        this.f7017a = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final x0 a(oc.c cVar, oc.c cVar2) {
        m0.l1 l1Var = this.f7018b;
        x0 x0Var = (x0) l1Var.getValue();
        e1 e1Var = this.f7019c;
        if (x0Var == null) {
            Object invoke = cVar2.invoke(e1Var.c());
            Object invoke2 = cVar2.invoke(e1Var.c());
            x4.s sVar = this.f7017a;
            n nVar = (n) ((oc.c) sVar.f8356h).invoke(invoke2);
            nVar.d();
            b1 b1Var = new b1(e1Var, invoke, nVar, sVar);
            x0Var = new x0(this, b1Var, cVar, cVar2);
            l1Var.setValue(x0Var);
            e1Var.f6831i.add(b1Var);
        }
        x0Var.f7015i = (pc.k) cVar2;
        x0Var.f7014h = cVar;
        x0Var.a(e1Var.f());
        return x0Var;
    }
}
