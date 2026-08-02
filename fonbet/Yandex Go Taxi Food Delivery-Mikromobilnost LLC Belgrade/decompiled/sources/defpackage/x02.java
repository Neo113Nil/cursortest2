package defpackage;

import com.yandex.go.design.compose.slot.body.BodyAlign;
import com.yandex.go.user_profile.ui.am.u;

/* loaded from: classes14.dex */
public final /* synthetic */ class x02 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ x02(u uVar, int i) {
        this.a = i;
        this.b = uVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        u uVar = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    ydb1.a(null, null, wwg.S(965530463, true, new x02(uVar, i2), btsVar), null, null, null, null, false, btsVar, 384, 251);
                    break;
                }
            default:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    btsVar2.Y();
                    break;
                } else {
                    p9b1.c(ebp0Var, (String) uVar.e.getValue(), null, null, xya1.e(btsVar2).g.b, 0, 0, null, null, null, 0, 0, BodyAlign.Center, btsVar2, intValue2 & 14, 384, 6134);
                    break;
                }
        }
        return zy11Var;
    }
}
