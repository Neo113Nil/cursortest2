package defpackage;

/* loaded from: classes3.dex */
public final class hy5 implements gy5 {
    public final rmb a;
    public final jzi b;
    public final xdr c;

    public hy5(jy5 jy5Var, rmb rmbVar, jzi jziVar) {
        this.a = rmbVar;
        this.b = jziVar;
        this.c = jy5Var.h;
    }

    @Override // defpackage.gy5
    public final void a(String str, boolean z) {
        str.getClass();
        weo.H(this.a, ((ry5) this.c.getValue()).a(), z, str, null);
    }

    @Override // defpackage.gy5
    public final void b() {
        String str;
        xdr xdrVar = this.c;
        Object value = xdrVar.getValue();
        qy5 qy5Var = value instanceof qy5 ? (qy5) value : null;
        if (qy5Var == null || (str = qy5Var.a.e) == null) {
            return;
        }
        rmb.k(this.a, str, ((ry5) xdrVar.getValue()).a(), null, 4);
        w1g.z(((qnq) this.b.a).b, str);
    }

    @Override // defpackage.gy5
    public final xdr getState() {
        return this.c;
    }
}
