package defpackage;

/* loaded from: classes13.dex */
public final /* synthetic */ class x0p0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ m1p0 c;

    public /* synthetic */ x0p0(tls tlsVar, m1p0 m1p0Var, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = m1p0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        m1p0 m1p0Var = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(new g1p0(m1p0Var.a));
                break;
            default:
                tlsVar.invoke(new h1p0(m1p0Var.a));
                break;
        }
        return zy11Var;
    }
}
