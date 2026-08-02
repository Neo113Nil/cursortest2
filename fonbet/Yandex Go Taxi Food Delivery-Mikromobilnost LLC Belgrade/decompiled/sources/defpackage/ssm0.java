package defpackage;

import com.yandex.go.design.compose.slot.SlotSize;

/* loaded from: classes11.dex */
public final /* synthetic */ class ssm0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ atm0 b;

    public /* synthetic */ ssm0(atm0 atm0Var, int i) {
        this.a = i;
        this.b = atm0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        atm0 atm0Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    qgy.b(atm0Var.a, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar, 0, 0, 16382);
                    break;
                }
            case 1:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else if (atm0Var.b == null) {
                    btsVar2.e0(-340204038);
                    btsVar2.t(false);
                    break;
                } else {
                    btsVar2.e0(-340366447);
                    ydb1.a(null, null, wwg.S(-1605830444, true, new ssm0(atm0Var, 2), btsVar2), null, null, null, SlotSize.XS, false, btsVar2, 1573248, 187);
                    btsVar2.t(false);
                    break;
                }
            default:
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    btsVar3.Y();
                    break;
                } else {
                    qgy.b(atm0Var.b, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar3, 0, 0, 16382);
                    break;
                }
        }
        return zy11Var;
    }
}
