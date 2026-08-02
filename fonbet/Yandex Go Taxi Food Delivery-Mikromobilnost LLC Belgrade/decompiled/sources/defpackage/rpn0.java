package defpackage;

/* loaded from: classes13.dex */
public final /* synthetic */ class rpn0 implements sls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ rqn0 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ rpn0(tls tlsVar, rqn0 rqn0Var) {
        this.c = tlsVar;
        this.b = rqn0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        rqn0 rqn0Var = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(new bqn0(rqn0Var.e.b, false));
                break;
            default:
                if (!rqn0Var.g) {
                    tlsVar.invoke(zpn0.a);
                    break;
                } else {
                    tlsVar.invoke(ypn0.a);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ rpn0(rqn0 rqn0Var, tls tlsVar) {
        this.b = rqn0Var;
        this.c = tlsVar;
    }
}
