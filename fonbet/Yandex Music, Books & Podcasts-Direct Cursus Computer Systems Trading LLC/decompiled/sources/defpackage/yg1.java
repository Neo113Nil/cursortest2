package defpackage;

/* loaded from: classes3.dex */
public final class yg1 extends xmm {
    public final u51 d;
    public final rmb e;
    public final ah1 f;
    public final jyr g;
    public final pg1 h;
    public final xdr i;

    public yg1(s63 s63Var, u51 u51Var, rmb rmbVar, ah1 ah1Var, jyr jyrVar) {
        u51Var.getClass();
        ah1Var.getClass();
        this.d = u51Var;
        this.e = rmbVar;
        this.f = ah1Var;
        this.g = jyrVar;
        this.h = (pg1) s63Var.a;
        this.i = ydr.a(new bh1(true));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.h;
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.i.getValue() instanceof ch1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        xg1 xg1Var;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof xg1) {
            xg1Var = (xg1) cg6Var;
            int i2 = xg1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xg1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = xg1Var.j;
                nm6 nm6Var = nm6.a;
                i = xg1Var.l;
                pg1 pg1Var = this.h;
                xdr xdrVar = this.i;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        bh1 bh1Var = new bh1(true);
                        xdrVar.getClass();
                        xdrVar.m(null, bh1Var);
                    }
                    String str = this.d.a;
                    xg1Var.l = 1;
                    obj = this.f.a(pg1Var, z, xg1Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    bh1 bh1Var2 = new bh1(false);
                    xdrVar.getClass();
                    xdrVar.m(null, bh1Var2);
                    ((pj6) rj6Var).a();
                    return new c73(pg1Var);
                }
                eh1 eh1Var = (eh1) this.g.getValue();
                qg1 qg1Var = (qg1) ((qj6) rj6Var).a;
                eh1Var.getClass();
                qg1Var.getClass();
                og1 og1Var = qg1Var.a;
                lt ltVar = og1Var.b;
                ch1 ch1Var = new ch1(ltVar, eh1Var.a.a(ltVar, og1Var.c, false));
                xdrVar.getClass();
                xdrVar.m(null, ch1Var);
                p43 p43Var = qg1Var.b;
                this.e.g(1, p43Var != null ? p43Var.a : null);
                return new d73(pg1Var);
            }
        }
        xg1Var = new xg1(this, cg6Var);
        Object obj2 = xg1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = xg1Var.l;
        pg1 pg1Var2 = this.h;
        xdr xdrVar2 = this.i;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
