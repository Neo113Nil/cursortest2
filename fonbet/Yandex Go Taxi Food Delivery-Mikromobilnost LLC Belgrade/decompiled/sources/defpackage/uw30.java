package defpackage;

import com.yandex.mapkit.transport.masstransit.Session;
import com.yandex.runtime.Error;
import java.io.IOException;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.masstransit.datasource.routing.MtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$2;
import ru.yandex.taxi.masstransit.datasource.routing.MtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$3;

/* loaded from: classes6.dex */
public final class uw30 implements Session.RouteListener {
    public final /* synthetic */ MtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$2 a;
    public final /* synthetic */ MtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$3 b;

    public uw30(MtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$2 mtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$2, MtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$3 mtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$3) {
        this.a = mtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$2;
        this.b = mtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$3;
    }

    @Override // com.yandex.mapkit.transport.masstransit.Session.RouteListener
    public final void onMasstransitRoutes(List list) {
        this.a.invoke(a.R(list));
    }

    @Override // com.yandex.mapkit.transport.masstransit.Session.RouteListener
    public final void onMasstransitRoutesError(Error error) {
        this.b.invoke(new IOException("Error " + error + " during masstransit route uri resolving"));
    }
}
