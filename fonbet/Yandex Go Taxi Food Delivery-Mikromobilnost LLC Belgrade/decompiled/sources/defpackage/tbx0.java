package defpackage;

import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryCollapseReasonV2;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryTariffUnselected;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes14.dex */
public final class tbx0 {
    public final xcv0 a;
    public final wiq0 b;

    public tbx0(xcv0 xcv0Var, wiq0 wiq0Var) {
        this.a = xcv0Var;
        this.b = wiq0Var;
    }

    public final void a(String str, mi31 mi31Var, boolean z) {
        Object obj;
        if (!z) {
            c(str, mi31Var, SummaryAnalytics$SummaryTariffUnselected.UserClick);
            return;
        }
        List list = mi31Var.a.U;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((pex0) obj).b, str)) {
                        break;
                    }
                }
            }
            pex0 pex0Var = (pex0) obj;
            if (pex0Var != null) {
                String str2 = mi31Var.b;
                qze0 qze0Var = pex0Var.m;
                String str3 = qze0Var != null ? qze0Var.a : null;
                String str4 = pex0Var.h.b;
                xcv0 xcv0Var = this.a;
                xcv0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("vertical_id", str2);
                hashMap.put("selected_tariff", str);
                if (str3 != null) {
                    hashMap.put("price", str3);
                }
                xcv0Var.a.a("Summary.Card.TariffSelected", hashMap, 1, tse0.r("eta", hashMap, str4));
            }
        }
    }

    public final void b(String str, String str2) {
        String str3;
        jn40 jn40Var;
        xcv0 xcv0Var = this.a;
        xcv0Var.g(str, str2);
        wiq0 wiq0Var = this.b;
        pex0 m = ((k) wiq0Var).m();
        Set set = (m == null || (jn40Var = m.V) == null) ? null : jn40Var.f;
        SummaryAnalytics$SummaryCollapseReasonV2 summaryAnalytics$SummaryCollapseReasonV2 = SummaryAnalytics$SummaryCollapseReasonV2.Automatic;
        String h = ((k) wiq0Var).h();
        pex0 m2 = ((k) wiq0Var).m();
        if (m2 == null || (str3 = m2.b) == null) {
            str3 = "";
        }
        xcv0Var.b(summaryAnalytics$SummaryCollapseReasonV2, h, str3, set != null ? a.J0(set) : null);
    }

    public final void c(String str, mi31 mi31Var, SummaryAnalytics$SummaryTariffUnselected summaryAnalytics$SummaryTariffUnselected) {
        List list;
        String str2;
        Object obj;
        pex0 m = ((k) this.b).m();
        if (m == null || (list = m.U) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (true) {
            str2 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((pex0) obj).b, str)) {
                    break;
                }
            }
        }
        pex0 pex0Var = (pex0) obj;
        if (pex0Var != null) {
            String str3 = mi31Var.b;
            qze0 qze0Var = pex0Var.m;
            String str4 = qze0Var != null ? qze0Var.a : null;
            String str5 = pex0Var.h.b;
            String str6 = pex0Var.G;
            if (str6 != null && !evu0.J(str6)) {
                str2 = str6;
            }
            xcv0 xcv0Var = this.a;
            xcv0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("unselected_tariff", str);
            hashMap.put("vertical_id", str3);
            if (str2 != null) {
                hashMap.put("tariff_unavailable_code", str2);
            }
            if (str4 != null) {
                hashMap.put("price", str4);
            }
            hashMap.put("eta", str5);
            hashMap.put(CRLReasonCodeExtension.REASON, summaryAnalytics$SummaryTariffUnselected.getEventValue());
            xcv0Var.a.a("Summary.Card.TariffUnselected", hashMap, 1, new HashMap());
        }
    }
}
