package defpackage;

/* loaded from: classes9.dex */
public final /* synthetic */ class we71 implements k871 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n181 b;

    public /* synthetic */ we71(n181 n181Var, int i) {
        this.a = i;
        this.b = n181Var;
    }

    @Override // defpackage.k871
    public final Boolean get() {
        boolean l0;
        int i = this.a;
        n181 n181Var = this.b;
        switch (i) {
            case 0:
                l0 = n181Var.l0();
                break;
            default:
                l0 = n181Var.m();
                break;
        }
        return Boolean.valueOf(l0);
    }
}
