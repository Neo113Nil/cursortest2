package defpackage;

import java.util.Locale;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes13.dex */
public final class r670 {
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static kq a(String str, String str2, String str3, String str4, String str5, String str6) {
        ti80 ti80Var;
        ti80 qi80Var;
        lg80 lg80Var;
        lg80 lg80Var2 = null;
        if (str2 != null && l9e.f(str2) && str != null && !evu0.J(str)) {
            qi80Var = new si80(str2, str, str3);
        } else if (str2 != null && l9e.f(str2)) {
            qi80Var = new ri80(str2, str3);
        } else {
            if (str == null || evu0.J(str)) {
                ti80Var = null;
                if (ti80Var != null) {
                    return null;
                }
                if (str4 != null) {
                    String lowerCase = str4.toLowerCase(Locale.ROOT);
                    if (lowerCase.equals("navigator")) {
                        lg80Var = eg80.b;
                    } else if (lowerCase.equals("navigator_gas_stations")) {
                        lg80Var = fg80.b;
                    } else if (lowerCase.equals("discovery")) {
                        lg80Var = cg80.b;
                    } else if (lowerCase.equals(TariffOrderFlow.ORDER_FLOW_TAXI_KEY)) {
                        lg80Var = kg80.b;
                    } else if (lowerCase.equals("advert")) {
                        lg80Var = ag80.b;
                    } else if (lowerCase.equals("ride_geosearch")) {
                        lg80Var = hg80.b;
                    } else {
                        lg80Var2 = new bg80(lowerCase);
                    }
                    lg80Var2 = lg80Var;
                }
                return new kq(ti80Var, lg80Var2, str5, str6, false, 48);
            }
            qi80Var = new qi80(str, str3);
        }
        ti80Var = qi80Var;
        if (ti80Var != null) {
        }
    }
}
