package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class yvc implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ f530 c;
    public final /* synthetic */ sls w;

    public /* synthetic */ yvc(float f, f530 f530Var, sls slsVar, int i, int i2) {
        this.a = i2;
        this.b = f;
        this.c = f530Var;
        this.w = slsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        sls slsVar = this.w;
        f530 f530Var = this.c;
        float f = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                uob1.a(f, f530Var, slsVar, fidVar, vng.O(1));
                break;
            default:
                vob1.a(f, f530Var, slsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
