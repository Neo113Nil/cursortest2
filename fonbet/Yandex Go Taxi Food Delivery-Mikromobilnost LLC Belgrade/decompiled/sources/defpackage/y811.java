package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.repository.TransportRoutesRepository$requestRoutes$$inlined$suspendCallbackApi$2;
import com.yandex.go.taxi.summary.mobilityhub.repository.TransportRoutesRepository$requestRoutes$$inlined$suspendCallbackApi$3;
import com.yandex.mapkit.transport.masstransit.Session;
import com.yandex.runtime.Error;
import java.io.IOException;
import java.util.List;

/* loaded from: classes14.dex */
public final class y811 implements Session.RouteListener {
    public final /* synthetic */ TransportRoutesRepository$requestRoutes$$inlined$suspendCallbackApi$2 a;
    public final /* synthetic */ TransportRoutesRepository$requestRoutes$$inlined$suspendCallbackApi$3 b;

    public y811(TransportRoutesRepository$requestRoutes$$inlined$suspendCallbackApi$2 transportRoutesRepository$requestRoutes$$inlined$suspendCallbackApi$2, TransportRoutesRepository$requestRoutes$$inlined$suspendCallbackApi$3 transportRoutesRepository$requestRoutes$$inlined$suspendCallbackApi$3) {
        this.a = transportRoutesRepository$requestRoutes$$inlined$suspendCallbackApi$2;
        this.b = transportRoutesRepository$requestRoutes$$inlined$suspendCallbackApi$3;
    }

    @Override // com.yandex.mapkit.transport.masstransit.Session.RouteListener
    public final void onMasstransitRoutes(List list) {
        this.a.invoke(list);
    }

    @Override // com.yandex.mapkit.transport.masstransit.Session.RouteListener
    public final void onMasstransitRoutesError(Error error) {
        this.b.invoke(new IOException("Error " + error + " during mass transit route request"));
    }
}
