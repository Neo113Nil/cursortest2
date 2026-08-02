package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.payments.yb.experiments.YbInPaymentsPromotionExperiment;

/* loaded from: classes9.dex */
public final class qvp implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("payment_methods_chooser_ui", YbInPaymentsPromotionExperiment.class, new stp(7), ExperimentSource.ZONE_INFO, true);
    }
}
