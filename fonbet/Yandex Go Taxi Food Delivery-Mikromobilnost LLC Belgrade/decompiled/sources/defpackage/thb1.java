package defpackage;

import com.yandex.go.chargers.dvizh_subscription.data.ChargersDvizhSubscriptionUrlApi;
import java.util.Collection;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes4.dex */
public abstract class thb1 {
    public static final boolean a(kq90 kq90Var) {
        if (!(kq90Var instanceof d3q0)) {
            return false;
        }
        w2q0 w2q0Var = ((d3q0) kq90Var).a;
        return (w2q0Var instanceof u2q0) && jl40.l(((u2q0) w2q0Var).c, "async_data_placeholder");
    }

    public static final boolean b(kq90 kq90Var) {
        if (!(kq90Var instanceof d3q0)) {
            return false;
        }
        w2q0 w2q0Var = ((d3q0) kq90Var).a;
        return (w2q0Var instanceof q2q0) && jl40.l(((q2q0) w2q0Var).c, "feed");
    }

    public static final boolean c(g0m g0mVar) {
        if (!(g0mVar.b instanceof j0m)) {
            return false;
        }
        Map map = g0mVar.a.c;
        Object obj = map != null ? map.get("trigger-reasons") : null;
        Collection collection = obj instanceof Collection ? (Collection) obj : null;
        return collection != null && collection.contains("start_app");
    }

    public static final String d(kq90 kq90Var) {
        if (!(kq90Var instanceof d3q0)) {
            return kq90Var.getClass().getSimpleName();
        }
        w2q0 w2q0Var = ((d3q0) kq90Var).a;
        if (jl40.l(w2q0Var, r2q0.INSTANCE)) {
            return "reload";
        }
        if (jl40.l(w2q0Var, v2q0.INSTANCE)) {
            return "update";
        }
        if (w2q0Var instanceof n2q0) {
            return "continue";
        }
        if (w2q0Var instanceof q2q0) {
            return oyr.p("merge(sectionId=", ((q2q0) w2q0Var).c, Extension.C_BRAKE);
        }
        if (w2q0Var instanceof u2q0) {
            return oyr.p("replace(targetId=", ((u2q0) w2q0Var).c, Extension.C_BRAKE);
        }
        w511.b();
        return null;
    }

    public static ChargersDvizhSubscriptionUrlApi e(on2 on2Var) {
        on2Var.getClass();
        return (ChargersDvizhSubscriptionUrlApi) on2Var.a(GoApiName.TaxiV4, ChargersDvizhSubscriptionUrlApi.class);
    }

    public static final boolean f(String str) {
        return str == null || str.length() == 0;
    }
}
