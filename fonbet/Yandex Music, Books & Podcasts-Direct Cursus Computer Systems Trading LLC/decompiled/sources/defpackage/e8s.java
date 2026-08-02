package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class e8s extends bfu {
    public static final long F;
    public rar A;
    public rar B;
    public rar C;
    public final fkn D;
    public final jyr E;
    public final String k;
    public final sv8 l;
    public final l7s m;
    public final y6s n;
    public final lik o;
    public final c3n p;
    public final z66 q;
    public final wrt r;
    public final oy2 s;
    public final lge t;
    public final xdr u;
    public final xdr v;
    public final j0q w;
    public boolean x;
    public mkj y;
    public String z;

    static {
        msa msaVar = nsa.b;
        F = yd5.M(20, ssa.SECONDS);
    }

    public e8s(String str, sv8 sv8Var, l7s l7sVar, y6s y6sVar, lik likVar, c3n c3nVar, by7 by7Var) {
        y6sVar.getClass();
        likVar.getClass();
        this.k = str;
        this.l = sv8Var;
        this.m = l7sVar;
        this.n = y6sVar;
        this.o = likVar;
        this.p = c3nVar;
        l18 l18Var = l18.b;
        bdt I = hag.I(z66.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.q = (z66) qdcVar.C(I);
        bdt I2 = hag.I(wrt.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        this.r = (wrt) qdcVar2.C(I2);
        bdt I3 = hag.I(oy2.class);
        qdc qdcVar3 = l18Var.a;
        qdcVar3.getClass();
        this.s = (oy2) qdcVar3.C(I3);
        bdt I4 = hag.I(lge.class);
        qdc qdcVar4 = l18Var.a;
        qdcVar4.getClass();
        lge lgeVar = (lge) qdcVar4.C(I4);
        this.t = lgeVar;
        this.u = ydr.a(yik.a);
        Continuation continuation = null;
        xdr a = ydr.a(null);
        this.v = a;
        this.w = new j0q();
        this.D = lg3.u0(new u21(10, a, by7Var, new laq(3, 3, continuation)), ot0.F(this), pd6.a);
        this.E = btf.b(new eyq(29, this));
        x97.y(ot0.F(this), null, null, new b8s(this, continuation, 2), 3);
        ox6.B(lgeVar.j, ot0.F(this), new c8s(this, 0));
        x97.y(ot0.F(this), null, null, new b8s(this, continuation, 0), 3);
    }

    public final void G() {
        rar rarVar = this.A;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.A = ox6.B(this.q.c(), ot0.F(this), new c8s(this, 1));
    }
}
