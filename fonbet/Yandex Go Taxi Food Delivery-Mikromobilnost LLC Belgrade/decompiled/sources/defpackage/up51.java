package defpackage;

import com.yandex.plus.pay.ui.yb.api.PlusPayYbCardScenario;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class up51 {
    public final jnd0 a;
    public final eu90 b;

    public up51(jnd0 jnd0Var, eu90 eu90Var) {
        this.a = jnd0Var;
        this.b = eu90Var;
    }

    public static PayUIEvgenAnalytics$YbCardActionScenario a(PlusPayYbCardScenario plusPayYbCardScenario) {
        int i = tp51.a[plusPayYbCardScenario.ordinal()];
        if (i == 1) {
            return PayUIEvgenAnalytics$YbCardActionScenario.Opening;
        }
        if (i == 2) {
            return PayUIEvgenAnalytics$YbCardActionScenario.Topup;
        }
        w511.b();
        return null;
    }

    public final void b(String str, PlusPayYbCardScenario plusPayYbCardScenario, String str2) {
        String d = dio.d(this.a.a.a().a);
        PayUIEvgenAnalytics$YbCardActionScenario a = a(plusPayYbCardScenario);
        if (str2 == null) {
            str2 = "no_value";
        }
        eu90 eu90Var = this.b;
        LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "url", str);
        t.put("action_scenario", a.getEventValue());
        t.put("payment_method_id", str2);
        t.put("_meta", eu90.c(new HashMap()));
        eu90Var.f("OpeningYbCard.Result.Success", t);
    }
}
