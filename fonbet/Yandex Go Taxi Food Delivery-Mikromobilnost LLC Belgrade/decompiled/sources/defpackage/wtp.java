package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.payments.shared.business.BusinessAccountFlowExperiment;

/* loaded from: classes9.dex */
public final class wtp implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("business_account_flow", BusinessAccountFlowExperiment.class, new stp(9), ExperimentSource.ZONE_INFO, false);
    }
}
