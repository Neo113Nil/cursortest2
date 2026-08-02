package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes13.dex */
public final class spn0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ rqn0 b;

    public /* synthetic */ spn0(rqn0 rqn0Var, int i) {
        this.a = i;
        this.b = rqn0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        rqn0 rqn0Var = this.b;
        switch (i) {
            case 0:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 19) != 18)) {
                    btsVar.Y();
                    break;
                } else {
                    p9b1.c(ebp0Var, rqn0Var.b, null, null, xya1.d(btsVar).b.d, 0, 0, null, null, null, 0, 0, null, btsVar, intValue & 14, 0, 8182);
                    break;
                }
            default:
                ebp0 ebp0Var2 = (ebp0) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ebp0Var2) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    btsVar2.Y();
                    break;
                } else {
                    p9b1.c(ebp0Var2, rqn0Var.b, c530.a, tp2.a, xya1.e(btsVar2).e.d, 2, Integer.MAX_VALUE, "", AppColor$Palette.TextMinor, xya1.e(btsVar2).h.a, 2, Integer.MAX_VALUE, null, btsVar2, intValue2 & 14, 0, 0);
                    break;
                }
        }
        return zy11Var;
    }
}
