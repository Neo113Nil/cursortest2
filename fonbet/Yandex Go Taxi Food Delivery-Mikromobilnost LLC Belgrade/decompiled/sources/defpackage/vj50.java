package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class vj50 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ e47 b;

    public /* synthetic */ vj50(e47 e47Var, int i) {
        this.a = i;
        this.b = e47Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        e47 e47Var = this.b;
        switch (i) {
            case 0:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 19) != 18)) {
                    btsVar.Y();
                    break;
                } else {
                    p9b1.c(ebp0Var, e47Var.a, null, null, xya1.e(btsVar).g.b, 0, 0, null, null, null, 0, 0, null, btsVar, intValue & 14, 0, 8182);
                    break;
                }
            case 1:
                ebp0 ebp0Var2 = (ebp0) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ebp0Var2) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    btsVar2.Y();
                    break;
                } else {
                    p9b1.c(ebp0Var2, e47Var.a, null, null, xya1.e(btsVar2).g.b, 0, 0, null, null, null, 0, 0, null, btsVar2, intValue2 & 14, 0, 8182);
                    break;
                }
            default:
                ebp0 ebp0Var3 = (ebp0) obj;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((bts) fidVar3).k(ebp0Var3) ? 4 : 2;
                }
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                    btsVar3.Y();
                    break;
                } else {
                    p9b1.c(ebp0Var3, e47Var.a, null, null, xya1.e(btsVar3).g.b, 0, 0, null, null, null, 0, 0, null, btsVar3, intValue3 & 14, 0, 8182);
                    break;
                }
        }
        return zy11Var;
    }
}
