package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.taxi.order.chat.experiments.RideWebMessengerEnabledExperiment;

/* loaded from: classes9.dex */
public final class uiq implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("ride_web_messenger", RideWebMessengerEnabledExperiment.class, new iiq(5), ExperimentSource.LAUNCH, true);
    }
}
