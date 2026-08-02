package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class x81 extends bnc implements ayd {
    public final /* synthetic */ byd d;
    public final s63 e;
    public final u51 f;
    public final rmb g;
    public final le3 h;
    public final a91 i;
    public final f81 j;
    public final xdr k;
    public final xdr l;
    public final xdr m;
    public final xdr n;
    public final xdr o;

    public x81(s63 s63Var, u51 u51Var, rmb rmbVar, arf arfVar, le3 le3Var, a91 a91Var) {
        u51Var.getClass();
        arfVar.getClass();
        a91Var.getClass();
        drf drfVar = s63Var.a;
        wfm wfmVar = (wfm) drfVar;
        wfmVar.getClass();
        this.d = new byd(wfmVar, arfVar);
        this.e = s63Var;
        this.f = u51Var;
        this.g = rmbVar;
        this.h = le3Var;
        this.i = a91Var;
        f81 f81Var = (f81) drfVar;
        this.j = f81Var;
        this.k = ydr.a(y81.c);
        this.l = ydr.a(e91.c);
        this.m = ydr.a(new b73(f81Var));
        this.n = ydr.a(p81.a);
        this.o = ydr.a(new b91(true));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.j;
    }

    @Override // defpackage.ayd
    public final void b(boolean z) {
        this.d.b(z);
    }

    @Override // defpackage.ufg
    public final pjc f(mm6 mm6Var, boolean z) {
        mm6Var.getClass();
        String str = this.f.a;
        a91 a91Var = this.i;
        a91Var.getClass();
        str.getClass();
        b71 b71Var = a91Var.a;
        b71Var.getClass();
        jyr jyrVar = b71Var.a;
        e15 e15Var = (e15) jyrVar.getValue();
        pjc b0 = zsd.b0(new c05(e15Var.h("track_mview"), e15Var, str, 2));
        e15 e15Var2 = (e15) jyrVar.getValue();
        Continuation continuation = null;
        int i = 10;
        u21 u21Var = new u21(i, b0, new c05(e15Var2.h("album_mview"), e15Var2, str, 0), new a71(3, null));
        xdr xdrVar = this.k;
        ox6.B(u21Var, mm6Var, xdrVar);
        x97.y(mm6Var, null, null, new z11(this, z, continuation, 1), 3);
        u21 u21Var2 = new u21(10, xdrVar, this.l, new t81(3, 0, continuation));
        tqn tqnVar = new tqn();
        int i2 = 10;
        ox6.B(new cz(zsd.X(new u21(i2, u21Var2, new bca(this.m, 18), s81.a), 50L), this, 2), mm6Var, new gl(4, tqnVar, this));
        return new v81(new ub7(12, new ub7(11, new ub7(12, this.n, new w81(this, continuation, 0)), ern.a(o81.class)), new w81(this, continuation, 1)), 0);
    }
}
