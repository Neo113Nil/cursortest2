package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class vx11 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f711 b;
    public final /* synthetic */ f530 c;
    public final /* synthetic */ int w;

    public /* synthetic */ vx11(f711 f711Var, f530 f530Var, int i, int i2) {
        this.a = i2;
        this.b = f711Var;
        this.c = f530Var;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        f530 f530Var = this.c;
        f711 f711Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                z0s.b(f711Var, f530Var, fidVar, vng.O(i2 | 1));
                break;
            default:
                z0s.c(f711Var, f530Var, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
