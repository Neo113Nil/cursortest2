package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class tyg implements bzg {
    public final /* synthetic */ int a;
    public final /* synthetic */ czg b;
    public final /* synthetic */ int c;

    public /* synthetic */ tyg(czg czgVar, int i, int i2) {
        this.a = i2;
        this.b = czgVar;
        this.c = i;
    }

    @Override // defpackage.bzg
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s(this.c);
                break;
            case 1:
                this.b.t(this.c);
                break;
            default:
                this.b.z(this.c);
                break;
        }
    }
}
