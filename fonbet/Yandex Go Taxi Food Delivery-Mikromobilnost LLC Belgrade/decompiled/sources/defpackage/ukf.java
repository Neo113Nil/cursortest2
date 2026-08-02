package defpackage;

import com.yandex.mapkit.navigation.transport.layer.LevelSelection;
import com.yandex.mapkit.navigation.transport.layer.RouteLineStyle;
import com.yandex.mapkit.navigation.transport.layer.RouteStyle;
import com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider;
import com.yandex.mapkit.styling.ArrowStyle;
import com.yandex.mapkit.styling.PlacemarkStyle;
import com.yandex.mapkit.transport.masstransit.ConstructionMask;
import com.yandex.mapkit.transport.masstransit.Line;
import com.yandex.mapkit.transport.masstransit.TrafficTypeID;
import java.util.Iterator;
import java.util.List;
import ru.yandextaxi.flutter_yandex_mapkit.styles.models.RouteViewStyleData$ArrowStyle;
import ru.yandextaxi.flutter_yandex_mapkit.styles.models.RouteViewStyleData$LineStyle;
import ru.yandextaxi.flutter_yandex_mapkit.styles.models.RouteViewStyleData$TransportRouteStyle;
import ru.yandextaxi.flutter_yandex_mapkit.styles.models.TransportRouteViewStyleData;

/* loaded from: classes7.dex */
public final class ukf implements RouteViewStyleProvider {
    public final RouteViewStyleProvider a;
    public TransportRouteViewStyleData b;

    public ukf(RouteViewStyleProvider routeViewStyleProvider) {
        this.a = routeViewStyleProvider;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public final void provideFitnessPolylineStyle(ConstructionMask constructionMask, TrafficTypeID trafficTypeID, boolean z, boolean z2, LevelSelection levelSelection, RouteLineStyle routeLineStyle) {
        TransportRouteViewStyleData.FitnessPolylineStyleData fitnessPolylineStyle;
        List styles;
        Object obj;
        RouteViewStyleData$LineStyle style;
        this.a.provideFitnessPolylineStyle(constructionMask, trafficTypeID, z, z2, levelSelection, routeLineStyle);
        TransportRouteViewStyleData transportRouteViewStyleData = this.b;
        if (transportRouteViewStyleData == null || (fitnessPolylineStyle = transportRouteViewStyleData.getFitnessPolylineStyle()) == null || (styles = fitnessPolylineStyle.getStyles()) == null) {
            return;
        }
        Iterator it = styles.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((TransportRouteViewStyleData.FitnessPolylineStyleData.FitnessPolylineStyle) obj).getCondition().a(constructionMask, trafficTypeID, z, z2)) {
                    break;
                }
            }
        }
        TransportRouteViewStyleData.FitnessPolylineStyleData.FitnessPolylineStyle fitnessPolylineStyle2 = (TransportRouteViewStyleData.FitnessPolylineStyleData.FitnessPolylineStyle) obj;
        if (fitnessPolylineStyle2 == null || (style = fitnessPolylineStyle2.getStyle()) == null) {
            return;
        }
        style.a(routeLineStyle);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public final void provideManoeuvreStyle(boolean z, boolean z2, ArrowStyle arrowStyle) {
        TransportRouteViewStyleData.YxManeuverStyleData maneuverStyle;
        List styles;
        Object obj;
        RouteViewStyleData$ArrowStyle style;
        this.a.provideManoeuvreStyle(z, z2, arrowStyle);
        TransportRouteViewStyleData transportRouteViewStyleData = this.b;
        if (transportRouteViewStyleData == null || (maneuverStyle = transportRouteViewStyleData.getManeuverStyle()) == null || (styles = maneuverStyle.getStyles()) == null) {
            return;
        }
        Iterator it = styles.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((TransportRouteViewStyleData.YxManeuverStyleData.ManeuverStyle) obj).getCondition().a(z, z2)) {
                    break;
                }
            }
        }
        TransportRouteViewStyleData.YxManeuverStyleData.ManeuverStyle maneuverStyle2 = (TransportRouteViewStyleData.YxManeuverStyleData.ManeuverStyle) obj;
        if (maneuverStyle2 == null || (style = maneuverStyle2.getStyle()) == null) {
            return;
        }
        style.a(arrowStyle);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public final void provideRouteStyle(boolean z, boolean z2, RouteStyle routeStyle) {
        TransportRouteViewStyleData.YxRouteStyleData routeStyle2;
        List styles;
        Object obj;
        RouteViewStyleData$TransportRouteStyle style;
        this.a.provideRouteStyle(z, z2, routeStyle);
        TransportRouteViewStyleData transportRouteViewStyleData = this.b;
        if (transportRouteViewStyleData == null || (routeStyle2 = transportRouteViewStyleData.getRouteStyle()) == null || (styles = routeStyle2.getStyles()) == null) {
            return;
        }
        Iterator it = styles.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((TransportRouteViewStyleData.YxRouteStyleData.RouteStyle) obj).getCondition().a(z, z2)) {
                    break;
                }
            }
        }
        TransportRouteViewStyleData.YxRouteStyleData.RouteStyle routeStyle3 = (TransportRouteViewStyleData.YxRouteStyleData.RouteStyle) obj;
        if (routeStyle3 == null || (style = routeStyle3.getStyle()) == null) {
            return;
        }
        style.a(routeStyle);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public final void provideTransferPolylineStyle(boolean z, boolean z2, RouteLineStyle routeLineStyle) {
        TransportRouteViewStyleData.TransferPolylineStyleData transferPolylineStyle;
        List styles;
        Object obj;
        RouteViewStyleData$LineStyle style;
        this.a.provideTransferPolylineStyle(z, z2, routeLineStyle);
        TransportRouteViewStyleData transportRouteViewStyleData = this.b;
        if (transportRouteViewStyleData == null || (transferPolylineStyle = transportRouteViewStyleData.getTransferPolylineStyle()) == null || (styles = transferPolylineStyle.getStyles()) == null) {
            return;
        }
        Iterator it = styles.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((TransportRouteViewStyleData.TransferPolylineStyleData.TransferPolylineStyle) obj).getCondition().a(z, z2)) {
                    break;
                }
            }
        }
        TransportRouteViewStyleData.TransferPolylineStyleData.TransferPolylineStyle transferPolylineStyle2 = (TransportRouteViewStyleData.TransferPolylineStyleData.TransferPolylineStyle) obj;
        if (transferPolylineStyle2 == null || (style = transferPolylineStyle2.getStyle()) == null) {
            return;
        }
        style.a(routeLineStyle);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public final void provideTransportPolylineStyle(List list, List list2, Line.Style style, boolean z, boolean z2, boolean z3, RouteLineStyle routeLineStyle) {
        TransportRouteViewStyleData.TransportPolylineStyleData transportPolylineStyle;
        List styles;
        Object obj;
        RouteViewStyleData$LineStyle style2;
        this.a.provideTransportPolylineStyle(list, list2, style, z, z2, z3, routeLineStyle);
        TransportRouteViewStyleData transportRouteViewStyleData = this.b;
        if (transportRouteViewStyleData == null || (transportPolylineStyle = transportRouteViewStyleData.getTransportPolylineStyle()) == null || (styles = transportPolylineStyle.getStyles()) == null) {
            return;
        }
        Iterator it = styles.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((TransportRouteViewStyleData.TransportPolylineStyleData.TransportPolylineStyle) obj).getCondition().a(list2, z, z2, z3)) {
                    break;
                }
            }
        }
        TransportRouteViewStyleData.TransportPolylineStyleData.TransportPolylineStyle transportPolylineStyle2 = (TransportRouteViewStyleData.TransportPolylineStyleData.TransportPolylineStyle) obj;
        if (transportPolylineStyle2 == null || (style2 = transportPolylineStyle2.getStyle()) == null) {
            return;
        }
        style2.a(routeLineStyle);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public final void provideTransportStopStyle(float f, boolean z, PlacemarkStyle placemarkStyle) {
        this.a.provideTransportStopStyle(f, z, placemarkStyle);
    }
}
