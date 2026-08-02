package defpackage;

/* loaded from: classes3.dex */
public final class tr1 extends imp {
    public final /* synthetic */ int o;
    public final /* synthetic */ dt1 p;

    public /* synthetic */ tr1(dt1 dt1Var, int i) {
        this.o = i;
        this.p = dt1Var;
    }

    @Override // defpackage.imp, defpackage.u97
    public final void Q(aa7 aa7Var, om3 om3Var) {
        switch (this.o) {
            case 0:
                om3Var.n();
                ((nr1) this.p).h.close();
                break;
            default:
                om3Var.n();
                om3Var.n();
                dt1 dt1Var = this.p;
                dt1Var.d(null);
                dt1Var.close();
                break;
        }
    }
}
