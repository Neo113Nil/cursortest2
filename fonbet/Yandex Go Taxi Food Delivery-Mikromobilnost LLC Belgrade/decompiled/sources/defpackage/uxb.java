package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes13.dex */
public final /* synthetic */ class uxb implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ yxb b;

    public /* synthetic */ uxb(yxb yxbVar, int i) {
        this.a = i;
        this.b = yxbVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        yxb yxbVar = this.b;
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
                    p9b1.c(ebp0Var, yxbVar.c, c530.a, AppColor$Palette.TextMinor, xya1.e(btsVar).h.a, 2, Integer.MAX_VALUE, yxbVar.b, tp2.a, xya1.e(btsVar).g.a, 2, Integer.MAX_VALUE, null, btsVar, intValue & 14, 0, 0);
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
                    jeb1.f(yxbVar.d, an91.m(c530Var, 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 2, false, 1, 0, null, xya1.e(btsVar2).g.b, btsVar2, 805306416, 48, 13820);
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
                    jeb1.f(yxbVar.e, an91.m(c530Var, 14.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar3).h.a, btsVar3, 48, 0, 16380);
                    break;
                }
        }
        return zy11Var;
    }
}
