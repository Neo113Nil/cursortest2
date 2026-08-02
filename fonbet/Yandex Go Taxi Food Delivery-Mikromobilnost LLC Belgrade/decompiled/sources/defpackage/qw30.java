package defpackage;

import com.yandex.mapkit.transport.masstransit.Session;
import com.yandex.runtime.Error;
import java.io.IOException;
import java.util.List;
import ru.yandex.taxi.masstransit.datasource.routing.MtRouteRequesterImpl$requestRoutes$$inlined$suspendCallbackApi$2;
import ru.yandex.taxi.masstransit.datasource.routing.MtRouteRequesterImpl$requestRoutes$$inlined$suspendCallbackApi$3;

/* loaded from: classes6.dex */
public final class qw30 implements Session.RouteListener {
    public final /* synthetic */ MtRouteRequesterImpl$requestRoutes$$inlined$suspendCallbackApi$2 a;
    public final /* synthetic */ MtRouteRequesterImpl$requestRoutes$$inlined$suspendCallbackApi$3 b;

    public qw30(MtRouteRequesterImpl$requestRoutes$$inlined$suspendCallbackApi$2 mtRouteRequesterImpl$requestRoutes$$inlined$suspendCallbackApi$2, MtRouteRequesterImpl$requestRoutes$$inlined$suspendCallbackApi$3 mtRouteRequesterImpl$requestRoutes$$inlined$suspendCallbackApi$3) {
        this.a = mtRouteRequesterImpl$requestRoutes$$inlined$suspendCallbackApi$2;
        this.b = mtRouteRequesterImpl$requestRoutes$$inlined$suspendCallbackApi$3;
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
