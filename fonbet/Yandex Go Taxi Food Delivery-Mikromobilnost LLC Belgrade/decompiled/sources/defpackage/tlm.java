package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.interactor.DrivingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$2;
import com.yandex.go.taxi.summary.mobilityhub.interactor.DrivingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$3;
import com.yandex.mapkit.directions.driving.DrivingSession;
import com.yandex.runtime.Error;
import java.io.IOException;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes14.dex */
public final class tlm implements DrivingSession.DrivingRouteListener {
    public final /* synthetic */ DrivingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$2 a;
    public final /* synthetic */ DrivingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$3 b;

    public tlm(DrivingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$2 drivingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$2, DrivingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$3 drivingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$3) {
        this.a = drivingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$2;
        this.b = drivingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$3;
    }

    @Override // com.yandex.mapkit.directions.driving.DrivingSession.DrivingRouteListener
    public final void onDrivingRoutes(List list) {
        this.a.invoke(a.R(list));
    }

    @Override // com.yandex.mapkit.directions.driving.DrivingSession.DrivingRouteListener
    public final void onDrivingRoutesError(Error error) {
        this.b.invoke(new IOException("Error " + error + " during driving route uri resolving"));
    }
}
