package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.settings.hidephoneinfo.experiments.InAppOnlySettingsToggleExperiment;

/* loaded from: classes9.dex */
public final class vbq implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("inapp_only_settings_toggle", InAppOnlySettingsToggleExperiment.class, new laq(7), ExperimentSource.LAUNCH, false);
    }
}
