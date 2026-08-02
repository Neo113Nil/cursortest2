package defpackage;

import androidx.compose.foundation.layout.IntrinsicSize;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.slot.SlotSize;

/* loaded from: classes12.dex */
public final /* synthetic */ class vxb implements zls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ yxb b;
    public final /* synthetic */ tls c;

    public /* synthetic */ vxb(yxb yxbVar, tls tlsVar) {
        this.b = yxbVar;
        this.c = tlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        yxb yxbVar = this.b;
        switch (i) {
            case 0:
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                int i2 = 2;
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 19) != 18)) {
                    btsVar.Y();
                    break;
                } else {
                    boolean k = btsVar.k(tlsVar);
                    Object Q = btsVar.Q();
                    if (k || Q == did.a) {
                        Q = new fv9(24, tlsVar);
                        btsVar.o0(Q);
                    }
                    d17.c(fj91.d(an91.o(c530.a, 8.0f, 0.0f, ibp0Var.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), IntrinsicSize.Min), true, ButtonSize.XS, ButtonStyle.Minor, ButtonForm.Circle, (sls) Q, wwg.S(-605634019, true, new uxb(yxbVar, i2), btsVar), btsVar, 1573248, 0);
                    break;
                }
            default:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    rab1.b(ljs0.e(c530.a, 48.0f), null, null, null, null, wwg.S(1157736254, true, new i9a(19, yxbVar, tlsVar), btsVar2), null, btsVar2, 196614, 94);
                    rab1.b(null, wwg.S(1575217969, true, new sg0(6, tlsVar), btsVar2), null, null, null, wwg.S(-2397387, true, new sg0(7, tlsVar), btsVar2), null, btsVar2, 196656, 93);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ vxb(tls tlsVar, yxb yxbVar) {
        this.c = tlsVar;
        this.b = yxbVar;
    }
}
