package defpackage;

import com.yandex.go.chargers.order.data.ChargersActiveOrdersApi;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes11.dex */
public abstract class xhb1 {
    public static final void a(String str, String str2, String str3, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2082053858);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(str3) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(slsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            ydb1.a(q791.b(an91.o(c530.a, 12.0f, 0.0f, 64.0f, 0.0f, 10), null, null, false, null, new awk0(0), slsVar, 12), wwg.S(182305352, true, new le(str2, 27), btsVar), wwg.S(-1139802387, true, new i0(str, str3, 3), btsVar), null, null, null, null, false, btsVar, 432, 248);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(str, str2, str3, slsVar, i, 6);
        }
    }

    public static ChargersActiveOrdersApi b(on2 on2Var) {
        on2Var.getClass();
        return (ChargersActiveOrdersApi) on2Var.a(GoApiName.TaxiV4, ChargersActiveOrdersApi.class);
    }

    public static void c(on2 on2Var) {
        on2Var.getClass();
        if (on2Var.a(GoApiName.TaxiV4, ipa.class) == null) {
            return;
        }
        ny61.u();
    }

    public static final boolean d(int i, int i2) {
        return i == i2;
    }
}
