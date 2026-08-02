package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.DashboardEvents$DashboardErrorStateType;
import com.ybsdk.feature.dashboard.internal.data.c;
import java.util.LinkedHashMap;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zlg {
    public final mmg a;
    public final AppAnalyticsReporter b;
    public final awa0 c;
    public final boolean d;
    public zva0 e;
    public final String f;

    public zlg(mmg mmgVar, c cVar, dlg dlgVar, AppAnalyticsReporter appAnalyticsReporter, awa0 awa0Var) {
        this.a = mmgVar;
        this.b = appAnalyticsReporter;
        this.c = awa0Var;
        this.d = cVar.b.j(c.a(mmgVar.getProductId())) != null;
        this.f = ((j0g) dlgVar).s().a.contains(mmgVar.getProductId()) ? "CacheEnabled" : "CacheDisabled";
    }

    public static String b(mmg mmgVar, String str, String str2) {
        if (mmgVar instanceof lmg) {
            return a.X(j73.A(new String[]{str, ((lmg) mmgVar).a, str2}), Extension.DOT_CHAR, null, null, null, 62);
        }
        if (mmgVar instanceof kmg) {
            return a.X(j73.A(new String[]{str, ((kmg) mmgVar).a, str2}), Extension.DOT_CHAR, null, null, null, 62);
        }
        w511.b();
        return null;
    }

    public static String e(mmg mmgVar) {
        if (mmgVar instanceof lmg) {
            return null;
        }
        if (mmgVar instanceof kmg) {
            return ((kmg) mmgVar).a;
        }
        w511.b();
        return null;
    }

    public static String f(mmg mmgVar) {
        if (mmgVar instanceof lmg) {
            return ((lmg) mmgVar).a;
        }
        if (mmgVar instanceof kmg) {
            return "external_member";
        }
        w511.b();
        return null;
    }

    public final void a() {
        zva0 zva0Var = this.e;
        if (zva0Var != null) {
            zva0Var.a();
        }
        this.e = null;
    }

    public final void c(DashboardEvents$DashboardErrorStateType dashboardEvents$DashboardErrorStateType) {
        em3 em3Var = this.b.s;
        LinkedHashMap w = g8e.w(2, "product_id", this.a.getProductId());
        w.put("type", dashboardEvents$DashboardErrorStateType.getOriginalValue());
        em3Var.a.a("dashboard.error_state", w);
    }

    public final void d() {
        em3 em3Var = this.b.s;
        mmg mmgVar = this.a;
        String f = f(mmgVar);
        String e = e(mmgVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        if (e != null) {
            linkedHashMap.put("member_id", e);
        }
        linkedHashMap.put("product_id", f);
        em3Var.a.a("dashboard.initiated", linkedHashMap);
    }
}
