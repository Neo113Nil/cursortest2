package defpackage;

/* loaded from: classes14.dex */
public final /* synthetic */ class ssm implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ sls c;

    public /* synthetic */ ssm(sls slsVar, tls tlsVar) {
        this.a = 0;
        this.c = slsVar;
        this.b = tlsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        sls slsVar = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                if (slsVar != null) {
                    slsVar.invoke();
                }
                tlsVar.invoke("");
                break;
            case 1:
                tlsVar.invoke(qt30.a);
                slsVar.invoke();
                break;
            case 2:
                tlsVar.invoke(new n0s(slsVar));
                break;
            case 3:
                tlsVar.invoke(new o0s(slsVar));
                break;
            default:
                tlsVar.invoke(slsVar);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ ssm(tls tlsVar, sls slsVar, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = slsVar;
    }
}
