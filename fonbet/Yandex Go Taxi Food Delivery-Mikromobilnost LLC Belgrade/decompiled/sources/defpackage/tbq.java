package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.settings.email.EmailRequireExperiment;

/* loaded from: classes9.dex */
public final class tbq implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("required_email_for_order", EmailRequireExperiment.class, new laq(8), ExperimentSource.ZONE_INFO, false);
    }
}
