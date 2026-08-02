package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.taxi.experiments.OverrideInactiveTariffsExperiment;

/* loaded from: classes9.dex */
public final class yeq implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("override_inactive_tariffs", OverrideInactiveTariffsExperiment.class, new qdq(17), ExperimentSource.ZONE_INFO, false);
    }
}
