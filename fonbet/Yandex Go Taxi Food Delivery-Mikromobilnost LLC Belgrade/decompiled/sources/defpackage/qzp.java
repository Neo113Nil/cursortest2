package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.loyalty.impl.common.experiments.LoyaltyProgramsStateExperiment;

/* loaded from: classes9.dex */
public final class qzp implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("loyalty_programs_state", LoyaltyProgramsStateExperiment.class, new ezp(5), ExperimentSource.FINAL_SUGGEST, false);
    }
}
