package defpackage;

/* loaded from: classes15.dex */
public final class whv extends k9v {
    public final /* synthetic */ int a;
    public final /* synthetic */ j18 b;

    public /* synthetic */ whv(j18 j18Var, int i) {
        this.a = i;
        this.b = j18Var;
    }

    @Override // defpackage.k9v
    public void b() {
        switch (this.a) {
            case 1:
                this.b.resumeWith(null);
                break;
        }
    }

    @Override // defpackage.k9v
    public void c(mav mavVar) {
        switch (this.a) {
            case 0:
                j18 j18Var = this.b;
                if (j18Var.t() instanceof mf60) {
                    j18Var.resumeWith(new iyj0(mavVar));
                    break;
                }
                break;
            default:
                super.c(mavVar);
                break;
        }
    }

    @Override // defpackage.k9v
    public final void e(ad7 ad7Var) {
        int i = this.a;
        j18 j18Var = this.b;
        switch (i) {
            case 0:
                if (j18Var.t() instanceof mf60) {
                    j18Var.resumeWith(new myj0(ad7Var));
                    break;
                }
                break;
            default:
                j18Var.resumeWith(ad7Var);
                break;
        }
    }
}
