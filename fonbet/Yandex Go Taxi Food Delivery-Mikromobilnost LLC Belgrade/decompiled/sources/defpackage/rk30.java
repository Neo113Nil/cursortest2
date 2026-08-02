package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class rk30 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ nl30 b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ int w;

    public /* synthetic */ rk30(nl30 nl30Var, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = nl30Var;
        this.c = tlsVar;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        tls tlsVar = this.c;
        nl30 nl30Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                pob1.c(nl30Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            default:
                rob1.a(nl30Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
