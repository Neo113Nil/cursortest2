package defpackage;

import com.yandex.go.chargers.push.data.ChargersLowBatteryPushExperiment;
import com.yandex.go.experiments.api.ExperimentSource;

/* loaded from: classes9.dex */
public final class wqp implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("chargers_client_low_battery_push", ChargersLowBatteryPushExperiment.class, new spp(13), ExperimentSource.PRODUCTS, true);
    }
}
