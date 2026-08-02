package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class syg implements bzg {
    public final /* synthetic */ int a;
    public final /* synthetic */ czg b;
    public final /* synthetic */ String c;

    public /* synthetic */ syg(czg czgVar, String str, int i) {
        this.a = i;
        this.b = czgVar;
        this.c = str;
    }

    @Override // defpackage.bzg
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.w(this.c);
                break;
            case 1:
                this.b.u(this.c);
                break;
            default:
                this.b.A(this.c);
                break;
        }
    }
}
