package defpackage;

import java.util.LinkedHashMap;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.screen_paid_insurance.ui.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class s990 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ dt20 b;
    public final /* synthetic */ x990 c;
    public final /* synthetic */ q990 w;

    public /* synthetic */ s990(x990 x990Var, q990 q990Var, dt20 dt20Var) {
        this.a = 2;
        this.c = x990Var;
        this.w = q990Var;
        this.b = dt20Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        dt20 dt20Var = this.b;
        q990 q990Var = this.w;
        x990 x990Var = this.c;
        int i2 = 1;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    sb2.c(new vvf0[]{nnm.f((hwy0) dt20Var.c, btsVar, qti.e), ua3.a.a((dci) dt20Var.w)}, wwg.S(-918790715, true, new s990(dt20Var, x990Var, q990Var, i2), btsVar), btsVar, 56);
                    break;
                }
            case 1:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    qti.c(((hwy0) dt20Var.c).c(btsVar2), null, false, wwg.S(-1585836610, true, new s990(x990Var, q990Var, dt20Var), btsVar2), btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 6);
                    break;
                }
            default:
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(1 & intValue3, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    a.d(x990Var, q990Var, btsVar3, 0);
                    ((m8h) dt20Var.x).a.a.o("PaidInsuranceInfo.Shown", null, new LinkedHashMap());
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ s990(dt20 dt20Var, x990 x990Var, q990 q990Var, int i) {
        this.a = i;
        this.b = dt20Var;
        this.c = x990Var;
        this.w = q990Var;
    }
}
