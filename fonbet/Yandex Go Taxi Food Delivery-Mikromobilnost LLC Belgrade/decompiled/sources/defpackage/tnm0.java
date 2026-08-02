package defpackage;

import com.yandex.go.copter.experiment.CopterOrderFlowExperiment;
import defpackage.z190;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.tariffs.model.TariffSource;

/* loaded from: classes6.dex */
public final class tnm0 implements xi70 {
    public final zuj0 a;
    public final ynm0 b;
    public final poe c;
    public final j290 d;

    public tnm0(zuj0 zuj0Var, ynm0 ynm0Var, poe poeVar, j290 j290Var) {
        this.a = zuj0Var;
        this.b = ynm0Var;
        this.c = poeVar;
        this.d = j290Var;
    }

    @Override // defpackage.xi70
    public final Object a(vi70 vi70Var, Continuation continuation) {
        return c(vi70Var.a.a, vi70Var.b);
    }

    @Override // defpackage.xi70
    public final String b() {
        return "ScheduledOrderButtonInteractor";
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
    
        if (r8.length() > 0) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wi70 c(pex0 pex0Var, bj70 bj70Var) {
        List list;
        Object obj;
        rbh rbhVar;
        Object obj2;
        String str;
        String Y;
        if (!this.b.c(pex0Var)) {
            return null;
        }
        String str2 = pex0Var.b;
        TariffSource tariffSource = pex0Var.a;
        z190 z190Var = (z190) ((en11) this.d.a.getValue()).b();
        if (z190Var.b && (list = z190Var.d) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((z190.a) obj).a.a.contains(str2)) {
                    break;
                }
            }
            z190.a aVar = (z190.a) obj;
            if (aVar != null) {
                String Y2 = d6z.Y(z190Var, aVar.b);
                String str3 = aVar.c;
                rbhVar = new rbh(Y2, str3 != null ? d6z.Y(z190Var, str3) : null, 5);
                if (rbhVar == null) {
                    String str4 = rbhVar.b;
                    String str5 = rbhVar.c;
                    if (str5 == null) {
                        str5 = "";
                    }
                    return hay.g(str4, str5, bj70Var, tariffSource == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS, 8);
                }
                String h = ((avj0) this.a).h(kyh0.summary_due_title);
                TariffOrderFlow tariffOrderFlow = pex0Var.u0;
                qoe qoeVar = (qoe) this.c;
                qoeVar.getClass();
                if (tariffOrderFlow == TariffOrderFlow.COPTER_FLOW || tariffOrderFlow == TariffOrderFlow.COPTER_CITY_TOUR_FLOW) {
                    String str6 = pex0Var.b;
                    CopterOrderFlowExperiment a = qoeVar.a.a();
                    if (a.b) {
                        Iterator it2 = a.e.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            if (jl40.l(((CopterOrderFlowExperiment.RoutePointSettings) obj2).a, str6)) {
                                break;
                            }
                        }
                        CopterOrderFlowExperiment.RoutePointSettings routePointSettings = (CopterOrderFlowExperiment.RoutePointSettings) obj2;
                        if (routePointSettings != null && (str = routePointSettings.f) != null) {
                            Y = d6z.Y(a, str);
                        }
                    }
                    Y = null;
                    if (Y != null) {
                        h = Y;
                    }
                }
                return hay.g(h, null, bj70Var, tariffSource == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS, 10);
            }
        }
        rbhVar = null;
        if (rbhVar == null) {
        }
    }
}
