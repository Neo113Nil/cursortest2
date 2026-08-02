package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class bai implements zqr {
    public final /* synthetic */ int a;
    public final /* synthetic */ eai b;

    public /* synthetic */ bai(eai eaiVar, int i) {
        this.a = i;
        this.b = eaiVar;
    }

    @Override // defpackage.zqr
    public Object get() {
        switch (this.a) {
            case 0:
                return new nnk(new bai(this.b, 7));
            case 1:
            default:
                return new ffc(new bai(this.b, 1));
            case 2:
                return new qne((Object) new bai(this.b, 4), false);
        }
    }
}
