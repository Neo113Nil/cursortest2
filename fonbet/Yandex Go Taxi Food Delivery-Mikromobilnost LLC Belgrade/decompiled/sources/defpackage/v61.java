package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class v61 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ hts0 b;

    public /* synthetic */ v61(hts0 hts0Var, int i) {
        this.a = 4;
        this.b = hts0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        hts0 hts0Var = this.b;
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
                    beb1.d(hts0Var, btsVar, 0);
                    break;
                }
            case 1:
                int intValue2 = num.intValue();
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    beb1.d(hts0Var, btsVar2, 0);
                    break;
                }
            case 2:
                int intValue3 = num.intValue();
                bts btsVar3 = (bts) fidVar;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    beb1.d(hts0Var, btsVar3, 0);
                    break;
                }
            case 3:
                int intValue4 = num.intValue();
                bts btsVar4 = (bts) fidVar;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    btsVar4.Y();
                    break;
                } else {
                    beb1.d(hts0Var, btsVar4, 0);
                    break;
                }
            case 4:
                num.getClass();
                beb1.d(hts0Var, fidVar, vng.O(1));
                break;
            default:
                int intValue5 = num.intValue();
                bts btsVar5 = (bts) fidVar;
                if (!btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    btsVar5.Y();
                    break;
                } else {
                    beb1.d(hts0Var, btsVar5, 0);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ v61(hts0 hts0Var, int i, byte b) {
        this.a = i;
        this.b = hts0Var;
    }
}
