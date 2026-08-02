package defpackage;

/* loaded from: classes5.dex */
public final class r4c extends lej {
    public boolean b;
    public final sgr c;
    public final no4 d;
    public final qo4[] e;

    public r4c(sgr sgrVar, no4 no4Var, qo4[] qo4VarArr) {
        o2g.J("error must not be OK", !sgrVar.g());
        this.c = sgrVar;
        this.d = no4Var;
        this.e = qo4VarArr;
    }

    @Override // defpackage.lej, defpackage.mo4
    public final void v0(oo4 oo4Var) {
        o2g.U("already started", !this.b);
        this.b = true;
        qo4[] qo4VarArr = this.e;
        int length = qo4VarArr.length;
        int i = 0;
        while (true) {
            sgr sgrVar = this.c;
            if (i >= length) {
                oo4Var.n(sgrVar, this.d, new s2i());
                return;
            } else {
                qo4VarArr[i].m(sgrVar);
                i++;
            }
        }
    }

    @Override // defpackage.lej, defpackage.mo4
    public final void y0(joe joeVar) {
        joeVar.f(this.c, "error");
        joeVar.f(this.d, "progress");
    }
}
