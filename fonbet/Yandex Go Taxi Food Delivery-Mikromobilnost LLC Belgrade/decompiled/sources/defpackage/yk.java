package defpackage;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.chargers.data.model.ChargersExperiment;
import com.yandex.go.chargers.push.data.ChargersLowBatteryPushExperiment;
import com.yandex.go.external_service.preloader.SuperAppConfigEatsKitStaticExperiment;
import com.yandex.go.zone.model.Zone;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Triple;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.banners.model.c;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes8.dex */
public final /* synthetic */ class yk implements wls {
    public final /* synthetic */ int a;

    public /* synthetic */ yk(int i) {
        this.a = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                rl rlVar = (rl) obj;
                xk xkVar = (xk) obj2;
                if (xkVar instanceof vk) {
                    rlVar.h(((vk) xkVar).a());
                } else {
                    if (!xkVar.equals(wk.a)) {
                        w511.b();
                        return null;
                    }
                    rlVar.e();
                }
                return zy11Var;
            case 1:
                Promotion promotion = (Promotion) obj;
                Promotion promotion2 = (Promotion) obj2;
                int a = c.a(promotion) - c.a(promotion2);
                if (a == 0) {
                    a = promotion2.getE() - promotion.getE();
                }
                return Integer.valueOf(a);
            case 2:
                return obj2;
            case 3:
                Triple triple = (Triple) obj;
                Triple triple2 = (Triple) obj2;
                if (((ChargersLowBatteryPushExperiment) triple.f()).h() == ((ChargersLowBatteryPushExperiment) triple2.f()).h() && ((ChargersExperiment) triple.g()).getB() == ((ChargersExperiment) triple2.g()).getB() && ((Boolean) triple.h()).booleanValue() == ((Boolean) triple2.h()).booleanValue()) {
                    r5 = true;
                }
                return Boolean.valueOf(r5);
            case 4:
                String str = (String) obj;
                dse dseVar = (dse) obj2;
                if (str.length() == 0) {
                    return dseVar.toString();
                }
                return str + Extension.FIX_SPACE + dseVar;
            case 5:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                z5d z5dVar = z5d.a;
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                }
                return zy11Var;
            case 6:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                z5d z5dVar2 = z5d.a;
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                }
                return zy11Var;
            case 7:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 8:
                Throwable th = (Throwable) obj2;
                fyc fycVar = ((es10) obj).b;
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                fycVar.j0(th);
                return zy11Var;
            case 9:
                dvx dvxVar = (dvx) obj;
                dvx dvxVar2 = (dvx) obj2;
                if (jl40.l(dvxVar, dvxVar2) && dvxVar.a() == dvxVar2.a()) {
                    r5 = true;
                }
                return Boolean.valueOf(r5);
            case 10:
                return Boolean.valueOf(obj == obj2);
            case 11:
                return Boolean.valueOf(jl40.l(obj, obj2));
            case 12:
                return Boolean.valueOf(((SuperAppConfigEatsKitStaticExperiment) obj).b == ((SuperAppConfigEatsKitStaticExperiment) obj2).b);
            case 13:
                return Boolean.valueOf(jl40.l(((eg20) obj).getId(), ((eg20) obj2).getId()));
            case 14:
                return Boolean.valueOf(((eg20) obj).equals((eg20) obj2));
            case 15:
                t4j0 t4j0Var = (t4j0) obj;
                t4j0Var.c.g("Authorization", "OAuth ".concat((String) obj2));
                return t4j0Var;
            case 16:
                return zy11Var;
            case 17:
                fnx0 fnx0Var = (fnx0) obj;
                fnx0 fnx0Var2 = (fnx0) obj2;
                if (fnx0Var.b(fnx0Var2) && fnx0Var.c.u0 == fnx0Var2.c.u0) {
                    r5 = true;
                }
                return Boolean.valueOf(r5);
            case 18:
                return Boolean.valueOf(((fnx0) obj).b((fnx0) obj2));
            case 19:
                t4j0 t4j0Var2 = (t4j0) obj;
                String str2 = (String) obj2;
                t4j0Var2.d("Authorization", "OAuth ".concat(str2));
                t4j0Var2.c.g("X-OAuth-Token", str2);
                return t4j0Var2;
            case 20:
                cae0 cae0Var = (cae0) obj;
                cae0 cae0Var2 = (cae0) obj2;
                int i2 = cae0Var.f().a - cae0Var2.f().a;
                if (i2 == 0 && (i2 = cae0Var.e().getPriority() - cae0Var2.e().getPriority()) == 0) {
                    i2 = cae0Var2.a() - cae0Var.a();
                }
                return Integer.valueOf(i2);
            case 21:
                kj kjVar = (kj) obj;
                kj kjVar2 = (kj) obj2;
                return Boolean.valueOf(jl40.l(kjVar != null ? Long.valueOf(kjVar.a) : null, kjVar2 != null ? Long.valueOf(kjVar2.a) : null));
            case 22:
                Promotion promotion3 = (Promotion) obj;
                Promotion promotion4 = (Promotion) obj2;
                int a2 = c.a(promotion3) - c.a(promotion4);
                if (a2 == 0) {
                    a2 = promotion4.getE() - promotion3.getE();
                }
                return Integer.valueOf(a2);
            case 23:
                kj kjVar3 = (kj) obj;
                kj kjVar4 = (kj) obj2;
                return Boolean.valueOf(jl40.l(kjVar3 != null ? Long.valueOf(kjVar3.a) : null, kjVar4 != null ? Long.valueOf(kjVar4.a) : null));
            case 24:
                ce61 ce61Var = (ce61) obj;
                ce61 ce61Var2 = (ce61) obj2;
                if (ce61Var.a.i(ce61Var2.a) && ce61Var.b == ce61Var2.b) {
                    r5 = true;
                }
                return Boolean.valueOf(r5);
            case 25:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list.size() == list2.size() && list2.containsAll(list)) {
                    r5 = true;
                }
                return Boolean.valueOf(r5);
            case 26:
                d0l0 d0l0Var = (d0l0) obj;
                d0l0 d0l0Var2 = (d0l0) obj2;
                if (gtq0.G(d0l0Var.a(), d0l0Var2.a())) {
                    ZoneAddress zoneAddress = d0l0Var.a;
                    Zone zone = zoneAddress != null ? zoneAddress.b : null;
                    ZoneAddress zoneAddress2 = d0l0Var2.a;
                    if (jl40.l(zone, zoneAddress2 != null ? zoneAddress2.b : null)) {
                        r5 = true;
                    }
                }
                return Boolean.valueOf(r5);
            case 27:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 28:
                return obj2;
            default:
                kk2 kk2Var = (kk2) obj2;
                return scc.c(kk2Var.b, t2m0.a(kk2Var.a, t2m0.a, (g1m0) obj));
        }
    }
}
