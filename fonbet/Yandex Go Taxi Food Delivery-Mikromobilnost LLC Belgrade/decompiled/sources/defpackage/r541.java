package defpackage;

import android.content.Context;
import com.yandex.mapkit.navigation.transport.layer.LevelSelection;
import com.yandex.mapkit.navigation.transport.layer.RouteLineStyle;
import com.yandex.mapkit.navigation.transport.layer.RouteStyle;
import com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider;
import com.yandex.mapkit.styling.ArrowStyle;
import com.yandex.mapkit.styling.ConstantFunctionPoints;
import com.yandex.mapkit.styling.PlacemarkStyle;
import com.yandex.mapkit.styling.PolylineStyle;
import com.yandex.mapkit.styling.ProportionFunction;
import com.yandex.mapkit.styling.transportnavigation.TransportNavigationStyleProvider;
import com.yandex.mapkit.transport.masstransit.ConstructionMask;
import com.yandex.mapkit.transport.masstransit.Line;
import com.yandex.mapkit.transport.masstransit.TrafficTypeID;
import java.util.List;

/* loaded from: classes7.dex */
public final class r541 implements RouteViewStyleProvider {
    public final Context a;
    public final RouteViewStyleProvider b;

    public r541(Context context, TransportNavigationStyleProvider transportNavigationStyleProvider) {
        this.a = context;
        this.b = transportNavigationStyleProvider.routeViewStyleProvider();
    }

    public final void a(RouteLineStyle routeLineStyle) {
        PolylineStyle base = routeLineStyle.getBase();
        base.setStrokeColor(qje.t(xng0.textMain, this.a));
        base.setStrokeWidth(ProportionFunction.fromConstantFunction(new ConstantFunctionPoints(3.0f)));
        base.setGapLength(4.0f);
        base.setDashLength(4.0f);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public final void provideFitnessPolylineStyle(ConstructionMask constructionMask, TrafficTypeID trafficTypeID, boolean z, boolean z2, LevelSelection levelSelection, RouteLineStyle routeLineStyle) {
        a(routeLineStyle);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public final void provideManoeuvreStyle(boolean z, boolean z2, ArrowStyle arrowStyle) {
        arrowStyle.setMinZoomVisible(Float.valueOf(17.0f));
        arrowStyle.setLength(ProportionFunction.fromConstantFunction(new ConstantFunctionPoints(48.0f)));
        arrowStyle.setTriangleHeight(ProportionFunction.fromConstantFunction(new ConstantFunctionPoints(11.0f)));
        int i = mqg0.white;
        Context context = this.a;
        arrowStyle.setFillColor(context.getColor(i));
        arrowStyle.setOutlineColor(qje.u(context.getTheme(), xng0.textMinor));
        arrowStyle.setOutlineWidth(ProportionFunction.fromConstantFunction(new ConstantFunctionPoints(2.0f)));
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public final void provideRouteStyle(boolean z, boolean z2, RouteStyle routeStyle) {
        routeStyle.setShowManoeuvres(true);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public final void provideTransferPolylineStyle(boolean z, boolean z2, RouteLineStyle routeLineStyle) {
        a(routeLineStyle);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public final void provideTransportPolylineStyle(List list, List list2, Line.Style style, boolean z, boolean z2, boolean z3, RouteLineStyle routeLineStyle) {
        a(routeLineStyle);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public final void provideTransportStopStyle(float f, boolean z, PlacemarkStyle placemarkStyle) {
        this.b.provideTransportStopStyle(f, z, placemarkStyle);
    }
}
