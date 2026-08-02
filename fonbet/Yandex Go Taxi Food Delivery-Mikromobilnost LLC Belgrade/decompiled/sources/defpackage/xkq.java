package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.OrderDetailsSectionTitlesExperiment;

/* loaded from: classes4.dex */
public final class xkq implements v7p {
    public static xkq a() {
        return wkq.a;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("order_details_section_titles", OrderDetailsSectionTitlesExperiment.class, new thp(20), ExperimentSource.TOTW, false);
    }
}
