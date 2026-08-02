package defpackage;

/* loaded from: classes4.dex */
public final class lnd {
    public final ind a;
    public final gp2 b;
    public final pxf c;
    public final dnd d;
    public ond e;

    public lnd(ind indVar, gp2 gp2Var, pxf pxfVar, dnd dndVar) {
        pxfVar.getClass();
        dndVar.getClass();
        this.a = indVar;
        this.b = gp2Var;
        this.c = pxfVar;
        this.d = dndVar;
    }

    public final s8 a(wwj wwjVar) {
        if (this.b == null) {
            return nif.c(new p1c(q1c.b, r1c.a, null, null, "No GooglePay handler"));
        }
        op2 op2Var = (op2) gp2.b.get();
        if (op2Var == null) {
            xq0.q("GooglePay called after activity finish");
            return null;
        }
        gp2.c = this;
        ond ondVar = new ond(op2Var, this.a, this.c, this.d);
        this.e = ondVar;
        return nif.b(nif.a, new yl0(5, ondVar, wwjVar));
    }
}
