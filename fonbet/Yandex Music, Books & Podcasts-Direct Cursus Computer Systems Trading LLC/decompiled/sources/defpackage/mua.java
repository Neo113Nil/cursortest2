package defpackage;

/* loaded from: classes4.dex */
public final class mua implements heg {
    public final do7 a;
    public nua b = nua.a;

    public mua(do7 do7Var) {
        this.a = do7Var;
    }

    @Override // defpackage.heg
    public final boolean b(ndl ndlVar) {
        return false;
    }

    @Override // defpackage.heg
    public final void c(geg gegVar, yvs yvsVar, zsb[] zsbVarArr) {
        yvsVar.getClass();
        zsbVarArr.getClass();
        this.a.c(gegVar, yvsVar, zsbVarArr);
    }

    @Override // defpackage.heg
    public final zi7 d() {
        zi7 zi7Var = this.a.a;
        zi7Var.getClass();
        return zi7Var;
    }

    @Override // defpackage.heg
    public final boolean f(sis sisVar, uvh uvhVar, long j) {
        sisVar.getClass();
        uvhVar.getClass();
        return this.a.f(sisVar, uvhVar, j);
    }

    @Override // defpackage.heg
    public final long g(ndl ndlVar) {
        return this.a.g;
    }

    @Override // defpackage.heg
    public final void h(ndl ndlVar) {
        this.a.h(ndlVar);
    }

    @Override // defpackage.heg
    public final void i(ndl ndlVar) {
        this.a.i(ndlVar);
    }

    @Override // defpackage.heg
    public final void j(ndl ndlVar) {
        this.a.j(ndlVar);
    }

    @Override // defpackage.heg
    public final boolean k(geg gegVar) {
        int ordinal = this.b.ordinal();
        do7 do7Var = this.a;
        if (ordinal == 0) {
            return do7Var.k(gegVar);
        }
        if (ordinal == 1) {
            return gegVar.c < ((long) 10000) * 1000 && do7Var.k(gegVar);
        }
        b6e.s();
        return false;
    }

    @Override // defpackage.heg
    public final boolean l(geg gegVar) {
        return this.a.l(gegVar);
    }
}
