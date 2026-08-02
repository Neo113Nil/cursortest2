package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import ru.yandex.taxi.main.map.autoupdatelocationthrottle.AutoUpdateUserLocationStrategyExperiment;

/* loaded from: classes9.dex */
public final class szp implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("auto_update_user_location_strategy", AutoUpdateUserLocationStrategyExperiment.class, new ezp(7), ExperimentSource.ZONE_INFO, true);
    }
}
