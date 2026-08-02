package defpackage;

import com.yandex.go.analytics.realtime.a;
import com.yandex.go.analytics.realtime.event.CreativeType;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import ru.yandex.taxi.summary.promotions.analytics.SummaryPromotionsAnalytics$SummaryState;

/* loaded from: classes10.dex */
public final class smv0 {
    public final xcv0 a;
    public final jas0 b;
    public final dei0 c;
    public final Object d = new Object();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public smv0(xcv0 xcv0Var, jas0 jas0Var, dei0 dei0Var) {
        this.a = xcv0Var;
        this.b = jas0Var;
        this.c = dei0Var;
    }

    public final void a() {
        synchronized (this.d) {
            this.e.clear();
            this.f.clear();
        }
    }

    public final void b(zkv0 zkv0Var, SummaryPromotionsAnalytics$SummaryState summaryPromotionsAnalytics$SummaryState, Boolean bool, String str) {
        String d = zkv0Var.d();
        this.a.i(zkv0Var.e(), str, d, summaryPromotionsAnalytics$SummaryState.name().toLowerCase(Locale.ROOT), bool);
        Map a = zkv0Var.a();
        if (a == null || a.isEmpty()) {
            return;
        }
        ((a) this.c).d(new iei0(CreativeType.PromoOnSummary, zkv0Var.d(), zkv0Var.a(), zkv0Var.b(), null, 34));
    }
}
