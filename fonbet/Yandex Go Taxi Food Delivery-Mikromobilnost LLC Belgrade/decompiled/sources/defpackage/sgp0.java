package defpackage;

/* loaded from: classes14.dex */
public final /* synthetic */ class sgp0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ sgp0(wg6 wg6Var, int i, int i2) {
        this.a = i2;
        this.b = wg6Var;
        this.c = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        int i2 = this.c;
        wg6 wg6Var = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(((dtr0) wg6Var.g.getValue()).a == i2);
            default:
                return Float.valueOf(1.0f - y6i0.c(Math.abs(rfb1.f(wg6Var) - i2), 0.0f, 1.0f));
        }
    }
}
