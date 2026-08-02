package defpackage;

import com.yandex.go.multimodal_route.interactors.MultimodalRouteUriInteractorImpl$resolveUriInternal$$inlined$suspendCallbackApi$2;
import com.yandex.go.multimodal_route.interactors.MultimodalRouteUriInteractorImpl$resolveUriInternal$$inlined$suspendCallbackApi$3;
import com.yandex.mapkit.transport.masstransit.Session;
import com.yandex.runtime.Error;
import java.io.IOException;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes12.dex */
public final class vu40 implements Session.RouteListener {
    public final /* synthetic */ MultimodalRouteUriInteractorImpl$resolveUriInternal$$inlined$suspendCallbackApi$2 a;
    public final /* synthetic */ MultimodalRouteUriInteractorImpl$resolveUriInternal$$inlined$suspendCallbackApi$3 b;

    public vu40(MultimodalRouteUriInteractorImpl$resolveUriInternal$$inlined$suspendCallbackApi$2 multimodalRouteUriInteractorImpl$resolveUriInternal$$inlined$suspendCallbackApi$2, MultimodalRouteUriInteractorImpl$resolveUriInternal$$inlined$suspendCallbackApi$3 multimodalRouteUriInteractorImpl$resolveUriInternal$$inlined$suspendCallbackApi$3) {
        this.a = multimodalRouteUriInteractorImpl$resolveUriInternal$$inlined$suspendCallbackApi$2;
        this.b = multimodalRouteUriInteractorImpl$resolveUriInternal$$inlined$suspendCallbackApi$3;
    }

    @Override // com.yandex.mapkit.transport.masstransit.Session.RouteListener
    public final void onMasstransitRoutes(List list) {
        this.a.invoke(a.R(list));
    }

    @Override // com.yandex.mapkit.transport.masstransit.Session.RouteListener
    public final void onMasstransitRoutesError(Error error) {
        this.b.invoke(new IOException("Error " + error + " in multimodal thread request"));
    }
}
