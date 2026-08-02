package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class su8 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ vu8 b;

    public /* synthetic */ su8(vu8 vu8Var, int i) {
        this.a = i;
        this.b = vu8Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        vu8 vu8Var = this.b;
        switch (i) {
            case 0:
                return new tu8(vu8Var, 0);
            default:
                vu8Var.r(new sd8(29));
                return zy11.a;
        }
    }
}
