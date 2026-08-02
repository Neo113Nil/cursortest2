package defpackage;

/* loaded from: classes14.dex */
public final /* synthetic */ class zik0 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ bjk0 b;

    public /* synthetic */ zik0(bjk0 bjk0Var) {
        this.b = bjk0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        bjk0 bjk0Var = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    bjk0Var.c(btsVar, 0);
                    break;
                }
            default:
                num.getClass();
                bjk0Var.c(fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ zik0(bjk0 bjk0Var, int i) {
        this.b = bjk0Var;
    }
}
