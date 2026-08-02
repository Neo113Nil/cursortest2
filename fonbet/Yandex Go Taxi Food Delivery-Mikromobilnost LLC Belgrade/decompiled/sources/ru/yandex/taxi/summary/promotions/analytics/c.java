package ru.yandex.taxi.summary.promotions.analytics;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.gas0;
import defpackage.has0;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.is60;
import defpackage.j63;
import defpackage.jas0;
import defpackage.pex0;
import defpackage.smv0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.wiq0;
import defpackage.zkv0;
import java.util.Locale;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;

/* loaded from: classes6.dex */
public final class c {
    public final smv0 a;
    public final SummaryStateTracker b;
    public final wiq0 c;
    public final jas0 d;
    public final tt2 e;
    public final i3y f = kotlin.a.a(new gas0(0, this));
    public final hbp0 g = new hbp0(new ShownSummaryPromotionsLogger$delegate$1(this, c.class, "loggerDispatcher", "getLoggerDispatcher()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, 0 == true ? 1 : 0, 6);
    public final j63 h = new j63(0);

    /* JADX WARN: Multi-variable type inference failed */
    public c(smv0 smv0Var, SummaryStateTracker summaryStateTracker, wiq0 wiq0Var, jas0 jas0Var, tt2 tt2Var) {
        this.a = smv0Var;
        this.b = summaryStateTracker;
        this.c = wiq0Var;
        this.d = jas0Var;
        this.e = tt2Var;
    }

    public final void a() {
        hbp0 hbp0Var = this.g;
        hbp0Var.a();
        tje.N(hbp0Var.c(), null, null, new ShownSummaryPromotionsLogger$attach$1(this, null), 3);
    }

    public final void b(has0 has0Var) {
        is60 is60Var;
        zkv0 zkv0Var = has0Var.a;
        SummaryPromotionsAnalytics$SummaryState summaryPromotionsAnalytics$SummaryState = has0Var.b;
        Boolean bool = has0Var.c;
        pex0 m = ((k) this.c).m();
        String a = (m == null || (is60Var = m.J0.b) == null) ? null : is60Var.a();
        smv0 smv0Var = this.a;
        if (!smv0Var.b.b.contains(zkv0Var.a)) {
            smv0Var.a.h(zkv0Var.b, a, zkv0Var.a, summaryPromotionsAnalytics$SummaryState.name().toLowerCase(Locale.ROOT), bool);
        }
        this.d.b(zkv0Var.a);
    }

    public final void c(zkv0 zkv0Var, SummaryPromotionsAnalytics$SummaryState summaryPromotionsAnalytics$SummaryState) {
        tje.N(this.g.c(), null, null, new ShownSummaryPromotionsLogger$promoShown$1(this, zkv0Var, summaryPromotionsAnalytics$SummaryState, null), 3);
    }
}
