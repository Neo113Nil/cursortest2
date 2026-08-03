package v;

import m0.w2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x0 implements w2 {

    /* renamed from: g, reason: collision with root package name */
    public final b1 f7013g;

    /* renamed from: h, reason: collision with root package name */
    public oc.c f7014h;

    /* renamed from: i, reason: collision with root package name */
    public pc.k f7015i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y0 f7016j;

    /* JADX WARN: Multi-variable type inference failed */
    public x0(y0 y0Var, b1 b1Var, oc.c cVar, oc.c cVar2) {
        this.f7016j = y0Var;
        this.f7013g = b1Var;
        this.f7014h = cVar;
        this.f7015i = (pc.k) cVar2;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [oc.c, pc.k] */
    /* JADX WARN: Type inference failed for: r4v0, types: [oc.c, pc.k] */
    public final void a(z0 z0Var) {
        b1 b1Var = this.f7013g;
        m0.l1 l1Var = b1Var.f6781k;
        m0.l1 l1Var2 = b1Var.f6778h;
        m0.l1 l1Var3 = b1Var.f6784n;
        Object invoke = this.f7015i.invoke(z0Var.c());
        if (this.f7016j.f7019c.g()) {
            b1Var.f(this.f7015i.invoke(z0Var.a()), invoke, (x) this.f7014h.invoke(z0Var));
            return;
        }
        x xVar = (x) this.f7014h.invoke(z0Var);
        if (b1Var.f6783m && pc.j.a(invoke, null)) {
            return;
        }
        if (pc.j.a(l1Var2.getValue(), invoke) && b1Var.b() == -1.0f) {
            return;
        }
        l1Var2.setValue(invoke);
        b1Var.f6779i.setValue(xVar);
        b1Var.e(b1Var.b() == -3.0f ? invoke : l1Var3.getValue(), !((Boolean) l1Var.getValue()).booleanValue());
        l1Var.setValue(Boolean.valueOf(b1Var.b() == -3.0f));
        if (b1Var.b() >= 0.0f) {
            l1Var3.setValue(b1Var.a().b((long) (b1Var.b() * b1Var.a().c())));
        } else if (b1Var.b() == -3.0f) {
            l1Var3.setValue(invoke);
        }
        b1Var.f6783m = false;
        b1Var.f6782l.g(-1.0f);
    }

    @Override // m0.w2
    public final Object getValue() {
        a(this.f7016j.f7019c.f());
        return this.f7013g.f6784n.getValue();
    }
}
