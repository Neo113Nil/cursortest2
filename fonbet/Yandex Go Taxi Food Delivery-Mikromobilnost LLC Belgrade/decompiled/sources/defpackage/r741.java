package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.interactor.WalkingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$2;
import com.yandex.go.taxi.summary.mobilityhub.interactor.WalkingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$3;
import com.yandex.mapkit.transport.masstransit.Session;
import com.yandex.runtime.Error;
import java.io.IOException;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes14.dex */
public final class r741 implements Session.RouteListener {
    public final /* synthetic */ WalkingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$2 a;
    public final /* synthetic */ WalkingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$3 b;

    public r741(WalkingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$2 walkingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$2, WalkingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$3 walkingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$3) {
        this.a = walkingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$2;
        this.b = walkingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$3;
    }

    @Override // com.yandex.mapkit.transport.masstransit.Session.RouteListener
    public final void onMasstransitRoutes(List list) {
        this.a.invoke(a.R(list));
    }

    @Override // com.yandex.mapkit.transport.masstransit.Session.RouteListener
    public final void onMasstransitRoutesError(Error error) {
        this.b.invoke(new IOException("Error " + error + " during walking route uri resolving"));
    }
}
