package defpackage;

import com.yandex.mapkit.navigation.transport.layer.RouteView;
import com.yandex.mapkit.navigation.transport.layer.RouteViewListener;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes7.dex */
public final class q811 implements RouteViewListener {
    public final /* synthetic */ r811 a;

    public q811(r811 r811Var) {
        this.a = r811Var;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewListener
    public final void onRouteTap(RouteView routeView) {
        r811 r811Var = this.a;
        r811Var.c(new zr01(8, r811Var, routeView));
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewListener
    public final void onRouteViewsChanged() {
        yeo yeoVar;
        r811 r811Var = this.a;
        try {
            Map e = gw00.e(new Pair("type", "onRouteViewsChanged"));
            if ((e instanceof zy11) || (yeoVar = r811Var.b) == null) {
                return;
            }
            yeoVar.success(e);
        } catch (Throwable th) {
            yeo yeoVar2 = r811Var.b;
            if (yeoVar2 != null) {
                yeoVar2.error(r811.class.getSimpleName(), ljo.b(th), null);
            }
        }
    }
}
