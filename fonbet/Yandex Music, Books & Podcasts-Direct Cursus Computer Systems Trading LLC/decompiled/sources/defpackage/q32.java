package defpackage;

/* loaded from: classes3.dex */
public final class q32 {
    public final t32 a;
    public final d32 b;
    public final a32 c;
    public final xdr d;
    public final xdr e;
    public final fkn f;

    public q32(t32 t32Var, d32 d32Var, a32 a32Var, mm6 mm6Var) {
        t32Var.getClass();
        d32Var.getClass();
        a32Var.getClass();
        mm6Var.getClass();
        this.a = t32Var;
        this.b = d32Var;
        this.c = a32Var;
        xdr xdrVar = t32Var.n;
        this.d = xdrVar;
        this.e = t32Var.o;
        this.f = lg3.u0(new fs(4, new ez(xdrVar, 15)), mm6Var, Boolean.FALSE);
    }

    public final void a(boolean z) {
        a32 a32Var = this.c;
        if (z) {
            ((tnb) a32Var.c.getValue()).i(sjb.Ok);
        } else {
            ((tnb) a32Var.c.getValue()).i(sjb.Cancel);
        }
        t32 t32Var = this.a;
        t32Var.G(false);
        x97.y(t32Var.p, null, null, new s32(t32Var, z, null), 3);
    }
}
