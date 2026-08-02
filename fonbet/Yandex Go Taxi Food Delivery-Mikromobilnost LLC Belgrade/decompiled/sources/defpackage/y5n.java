package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class y5n implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ b6n c;

    public /* synthetic */ y5n(b6n b6nVar, tls tlsVar) {
        this.a = 2;
        this.c = b6nVar;
        this.b = tlsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.b;
        b6n b6nVar = this.c;
        switch (i) {
            case 0:
                tlsVar.invoke(b6nVar.j);
                break;
            case 1:
                tlsVar.invoke(b6nVar.j);
                break;
            default:
                gv90 gv90Var = b6nVar.f;
                if (gv90Var != null) {
                    tlsVar.invoke(gv90Var);
                    break;
                }
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ y5n(tls tlsVar, b6n b6nVar, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = b6nVar;
    }
}
