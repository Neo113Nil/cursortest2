package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.mapkit.transport.masstransit.Route;
import java.util.List;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticSource;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticType;

/* loaded from: classes13.dex */
public final class vw20 implements sy60 {
    public final /* synthetic */ ww20 a;
    public final /* synthetic */ j2v b;

    public vw20(ww20 ww20Var, j2v j2vVar) {
        this.a = ww20Var;
        this.b = j2vVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }

    public final void n1(Route route, List list, List list2) {
        Screen screen = Screen.MOBILITY_HUB_TRANSPORT_DETAILS;
        ww20 ww20Var = this.a;
        ww20Var.D((m950) ww20Var.G.get(), new ng30(route, list, screen, jl40.l(ww20Var.F, "transport") ? MtDetailedRouteAnalyticSource.Transport : MtDetailedRouteAnalyticSource.Hub, list2, MtDetailedRouteAnalyticType.Vertical, 1712), new sw20(ww20Var, this.b, 1));
    }
}
