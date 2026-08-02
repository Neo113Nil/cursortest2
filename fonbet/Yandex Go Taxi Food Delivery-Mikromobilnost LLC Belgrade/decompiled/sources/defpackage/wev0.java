package defpackage;

import com.yandex.go.taxi.summary.models.SummaryVerticalHeaderExperiment;
import com.yandex.go.zone.dto.objects.VerticalMode;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

/* loaded from: classes14.dex */
public final class wev0 {
    public final brv0 a;
    public final dmq0 b;
    public final ucv0 c;
    public final qqo d;

    public wev0(brv0 brv0Var, dmq0 dmq0Var, ucv0 ucv0Var, rqo rqoVar) {
        this.a = brv0Var;
        this.b = dmq0Var;
        this.c = ucv0Var;
        this.d = ((jbh) rqoVar).a(SimpleBooleanExperiment.SUMMARY_TARIFF_CARD_HORIZONTAL_SWIPE_DISABLED);
    }

    public final vev0 a() {
        q81 a = this.c.a();
        SummaryVerticalHeaderExperiment summaryVerticalHeaderExperiment = (SummaryVerticalHeaderExperiment) this.a.b.getValue();
        VerticalMode a2 = this.b.a();
        boolean booleanValue = ((Boolean) this.d.b()).booleanValue();
        return summaryVerticalHeaderExperiment.b ? new vev0(a, false, new u8u(d6z.Y(summaryVerticalHeaderExperiment, summaryVerticalHeaderExperiment.d), d6z.Y(summaryVerticalHeaderExperiment, summaryVerticalHeaderExperiment.e), summaryVerticalHeaderExperiment.g, d6z.Y(summaryVerticalHeaderExperiment, summaryVerticalHeaderExperiment.f)), a2, booleanValue) : new vev0(a, true, msb1.I, a2, booleanValue);
    }
}
