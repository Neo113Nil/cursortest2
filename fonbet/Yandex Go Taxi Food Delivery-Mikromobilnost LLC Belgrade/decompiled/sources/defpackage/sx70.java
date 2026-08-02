package defpackage;

import com.yandex.go.taxi.order.models.api.response.typed_experiments.OrderDetailsSectionTitlesExperiment;

/* loaded from: classes14.dex */
public final class sx70 extends ad5 {
    public final x770 x;
    public final xl10 y;

    public sx70(x770 x770Var, xl10 xl10Var) {
        super(nx70.class);
        this.x = x770Var;
        this.y = xl10Var;
    }

    public final String Kg(String str) {
        OrderDetailsSectionTitlesExperiment orderDetailsSectionTitlesExperiment = (OrderDetailsSectionTitlesExperiment) this.y.a;
        if (orderDetailsSectionTitlesExperiment.b) {
            return (String) orderDetailsSectionTitlesExperiment.c.get(str);
        }
        return null;
    }
}
