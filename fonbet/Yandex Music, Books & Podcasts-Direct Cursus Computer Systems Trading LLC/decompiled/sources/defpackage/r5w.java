package defpackage;

/* loaded from: classes.dex */
public final class r5w extends xci implements epf {
    public k48 o;
    public boolean p;
    public uif q;

    @Override // defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        k48 k48Var = this.o;
        k48 k48Var2 = k48.a;
        int k = k48Var != k48Var2 ? 0 : ga6.k(j);
        k48 k48Var3 = this.o;
        k48 k48Var4 = k48.b;
        ksk M = ffhVar.M(ia6.a(k, (this.o == k48Var2 || !this.p) ? ga6.i(j) : Integer.MAX_VALUE, k48Var3 == k48Var4 ? ga6.j(j) : 0, (this.o == k48Var4 || !this.p) ? ga6.h(j) : Integer.MAX_VALUE));
        int d = yhn.d(M.a, ga6.k(j), ga6.i(j));
        int d2 = yhn.d(M.b, ga6.j(j), ga6.h(j));
        return mfh.m0(mfhVar, d, d2, new mho(this, d, M, d2, mfhVar));
    }
}
