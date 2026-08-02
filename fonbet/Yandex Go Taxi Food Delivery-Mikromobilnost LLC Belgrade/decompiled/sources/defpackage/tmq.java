package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.xiva.experiments.XivaEnabledExperiment;

/* loaded from: classes9.dex */
public final class tmq implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("xiva_ws", XivaEnabledExperiment.class, new xiq(25), ExperimentSource.ZONE_INFO, true);
    }
}
