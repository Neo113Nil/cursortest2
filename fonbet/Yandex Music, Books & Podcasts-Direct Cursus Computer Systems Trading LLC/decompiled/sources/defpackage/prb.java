package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class prb implements zcg, ycg {
    public final /* synthetic */ int a;
    public final /* synthetic */ xrb b;

    public /* synthetic */ prb(xrb xrbVar, int i) {
        this.a = i;
        this.b = xrbVar;
    }

    @Override // defpackage.zcg
    public void c(Object obj, xgc xgcVar) {
        ((f8l) obj).N(this.b.f, new e8l(xgcVar));
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        f8l f8lVar = (f8l) obj;
        switch (this.a) {
            case 3:
                f8lVar.V(this.b.N);
                break;
            default:
                f8lVar.v(this.b.P);
                break;
        }
    }
}
