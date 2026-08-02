package defpackage;

import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.experiments.UiExperimentsListener;
import com.yandex.runtime.config.UIExperiment;
import java.util.List;

/* loaded from: classes15.dex */
public final class zs11 extends k45 implements UiExperimentsListener {
    @Override // com.yandex.mapkit.experiments.UiExperimentsListener
    public final void onExperimentsUpdated() {
        List<UIExperiment> experiments = MapKitFactory.getInstance().getMapsUiExperimentsProvider().getExperiments();
        ea20 ea20Var = this.a;
        if (ea20Var != null) {
            ea20Var.a("onParametersUpdated", experiments, null);
        }
    }

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        if (!jl40.l(x920Var.a, "init")) {
            ((ba20) da20Var).notImplemented();
            return;
        }
        List<UIExperiment> experiments = MapKitFactory.getInstance().getMapsUiExperimentsProvider().getExperiments();
        MapKitFactory.getInstance().getMapsUiExperimentsProvider().subscribe(this);
        ((ba20) da20Var).success(experiments);
    }
}
