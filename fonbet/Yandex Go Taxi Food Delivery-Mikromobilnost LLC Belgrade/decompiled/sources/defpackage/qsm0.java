package defpackage;

import com.yandex.go.design.compose.slot.SlotSize;

/* loaded from: classes11.dex */
public final /* synthetic */ class qsm0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ zsm0 b;

    public /* synthetic */ qsm0(zsm0 zsm0Var, int i) {
        this.a = i;
        this.b = zsm0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        zsm0 zsm0Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    o3b1.b(zsm0Var.a, an91.o(c530.a, 8.0f, 0.0f, 0.0f, 0.0f, 14), zsm0Var.b, btsVar, 432);
                    break;
                }
            case 1:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    ydb1.a(null, null, wwg.S(2117134655, true, new qsm0(zsm0Var, r2), btsVar2), null, null, null, SlotSize.XS, false, btsVar2, 1573248, 187);
                    break;
                }
            case 2:
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    btsVar3.Y();
                    break;
                } else {
                    qgy.b(zsm0Var.f, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar3, 0, 0, 16382);
                    break;
                }
            default:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((bts) fidVar4).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                    btsVar4.Y();
                    break;
                } else {
                    m9b1.b(ebp0Var, zsm0Var.d, null, null, null, 0, 0, zsm0Var.e, null, null, 0, 0, null, btsVar4, intValue4 & 14, 0, 32638);
                    break;
                }
        }
        return zy11Var;
    }
}
