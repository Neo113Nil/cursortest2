package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.tipssuggest.experiment.TipsSuggestModalExperiment;
import com.yandex.go.tips.data.model.TipsValue;

/* loaded from: classes14.dex */
public final class ufz0 {
    public final vfz0 a;
    public final ohz0 b;
    public final rgz0 c;

    static {
        kgx[] kgxVarArr = vfz0.b;
    }

    public ufz0(vfz0 vfz0Var, ohz0 ohz0Var, rgz0 rgz0Var) {
        this.a = vfz0Var;
        this.b = ohz0Var;
        this.c = rgz0Var;
    }

    public final boolean a(TaxiOrder taxiOrder) {
        if (((fga0) this.c).s() <= TipsValue.ZERO_PERCENT.getValue()) {
            this.b.getClass();
            TipsSuggestModalExperiment a = ohz0.a(taxiOrder);
            boolean z = a.b;
            int i = a.f;
            if (z) {
                if (i == 0) {
                    return true;
                }
                vfz0 vfz0Var = this.a;
                int intValue = ((Number) vfz0Var.a.getValue(vfz0Var, vfz0.b[0])).intValue();
                if (intValue == -1 || intValue >= i) {
                    return true;
                }
            }
        }
        return false;
    }
}
