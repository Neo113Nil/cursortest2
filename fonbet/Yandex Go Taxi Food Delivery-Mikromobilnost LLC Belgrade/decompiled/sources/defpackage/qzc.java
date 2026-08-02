package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import java.util.List;
import java.util.Locale;
import ru.yandex.taxi.order.OrderAnalyticsReporter$CompleteButtonActionName;
import ru.yandex.taxi.order.f;

/* loaded from: classes14.dex */
public final class qzc {
    public final ysg a;
    public final y180 b;
    public final g2y0 c;
    public final ufz0 d;
    public final ci70 e;
    public final d2y0 f;

    public qzc(ysg ysgVar, y180 y180Var, g2y0 g2y0Var, ufz0 ufz0Var, ci70 ci70Var, d2y0 d2y0Var) {
        this.a = ysgVar;
        this.b = y180Var;
        this.c = g2y0Var;
        this.d = ufz0Var;
        this.e = ci70Var;
        this.f = d2y0Var;
    }

    public final void a(o2y0 o2y0Var, OrderAnalyticsReporter$CompleteButtonActionName orderAnalyticsReporter$CompleteButtonActionName) {
        String str;
        TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType taxiOrderTipsValueType;
        String str2;
        TaxiOrder b = o2y0Var.b();
        TaxiOrderSelectedTipsChoiceState taxiOrderSelectedTipsChoiceState = b.y().d;
        if (taxiOrderSelectedTipsChoiceState == null || (str = taxiOrderSelectedTipsChoiceState.c) == null) {
            str = "";
        }
        String str3 = b.a;
        Float j = avu0.j(str);
        if (j != null && j.floatValue() != 0.0f) {
            vfz0 vfz0Var = this.d.a;
            qdx qdxVar = vfz0Var.a;
            kgx[] kgxVarArr = vfz0.b;
            int intValue = ((Number) qdxVar.getValue(vfz0Var, kgxVarArr[0])).intValue();
            qdx qdxVar2 = vfz0Var.a;
            if (intValue == -1) {
                qdxVar2.setValue(vfz0Var, kgxVarArr[0], 1);
            } else {
                qdxVar2.setValue(vfz0Var, kgxVarArr[0], Integer.valueOf(intValue + 1));
            }
        }
        ci70 ci70Var = this.e;
        int s = b.s();
        TaxiOrderSelectedTipsChoiceState taxiOrderSelectedTipsChoiceState2 = b.y().d;
        String str4 = (taxiOrderSelectedTipsChoiceState2 == null || (str2 = taxiOrderSelectedTipsChoiceState2.c) == null) ? "" : str2;
        TaxiOrderSelectedTipsChoiceState taxiOrderSelectedTipsChoiceState3 = b.y().d;
        if (taxiOrderSelectedTipsChoiceState3 == null || (taxiOrderTipsValueType = taxiOrderSelectedTipsChoiceState3.b) == null) {
            taxiOrderTipsValueType = TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.PERCENT;
        }
        List b2 = b.l.getW().getG().getB();
        kyc kycVar = ci70Var.n;
        String name = orderAnalyticsReporter$CompleteButtonActionName.name();
        Locale locale = Locale.US;
        kycVar.a(name.toLowerCase(locale), Integer.valueOf(s), b2.toString(), taxiOrderTipsValueType.name().toLowerCase(locale), str4);
        this.a.i(str3);
        this.b.b(str3);
        int s2 = b.s();
        if ((s2 < 4 || s2 > 5) && !uga1.e(s2)) {
            ((f) this.c.a).i0(o2y0Var, uga1.c(s2));
        } else {
            ((f) this.f.a).a0(o2y0Var);
        }
    }
}
