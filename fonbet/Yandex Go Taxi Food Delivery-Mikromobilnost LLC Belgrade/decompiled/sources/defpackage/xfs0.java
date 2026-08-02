package defpackage;

import com.yandex.go.navigator.settings.debug_panel.domain.b;
import com.yandex.go.walking.navigation.impl.location_mock.simulator.a;
import com.yandex.mapkit.location.LocationSimulatorListener;

/* loaded from: classes12.dex */
public final /* synthetic */ class xfs0 implements LocationSimulatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xfs0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.yandex.mapkit.location.LocationSimulatorListener
    public final void onSimulationFinished() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((b) obj).a();
                break;
            default:
                ((a) obj).a();
                break;
        }
    }
}
