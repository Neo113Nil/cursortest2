package defpackage;

/* loaded from: classes13.dex */
public final class uem implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ j18 b;

    public /* synthetic */ uem(j18 j18Var, int i) {
        this.a = i;
        this.b = j18Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        j18 j18Var = this.b;
        switch (i) {
            case 0:
                j18Var.b(null);
                break;
            case 1:
                if (j18Var.t() instanceof mf60) {
                    j18Var.resumeWith(zy11Var);
                    break;
                }
                break;
            case 2:
                j18Var.resumeWith(Boolean.FALSE);
                break;
            case 3:
                j18Var.resumeWith(Boolean.TRUE);
                break;
            case 4:
                j18Var.resumeWith(Boolean.TRUE);
                break;
            case 5:
                j18Var.resumeWith(Boolean.FALSE);
                break;
            case 6:
                j18Var.resumeWith(fao0.a);
                break;
            case 7:
                j18Var.resumeWith(eao0.a);
                break;
            case 8:
                j18Var.resumeWith(gao0.a);
                break;
            case 9:
                j18Var.resumeWith(null);
                break;
            case 10:
                j18Var.resumeWith(zyo0.a);
                break;
            case 11:
                j18Var.resumeWith(zy11Var);
                break;
            case 12:
                j18Var.resumeWith(azo0.a);
                break;
            case 13:
                j18Var.resumeWith(azo0.c);
                break;
            case 14:
                j18Var.resumeWith(azo0.b);
                break;
            case 15:
                j18Var.resumeWith(y1p0.b);
                break;
            case 16:
                j18Var.resumeWith(y1p0.a);
                break;
            default:
                j18Var.resumeWith(y1p0.c);
                break;
        }
        return zy11Var;
    }
}
