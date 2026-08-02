package defpackage;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.directions.DirectionsFactory;
import com.yandex.mapkit.directions.carparks.CarparksLayer;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.navigation.automotive.Navigation;
import com.yandex.mapkit.navigation.automotive.SpeedLimitsRules;
import com.yandex.mapkit.search.SearchFactory;
import com.yandex.mapkit.search.advert_layer.AdvertLayer;
import com.yandex.mapkit.transport.masstransit.Route;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;

/* loaded from: classes7.dex */
public final class qd1 extends k45 {
    public final /* synthetic */ int b = 4;
    public final Object c;
    public final Object w;

    public qd1(ssr ssrVar, qz8 qz8Var, eu00 eu00Var) {
        super(ssrVar, "carparks_layer");
        this.c = qz8Var;
        this.w = eu00Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        int i = this.b;
        Object obj = this.c;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                nd1 nd1Var = (nd1) obj;
                Object obj3 = x920Var.b;
                String str = x920Var.a;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1958418279:
                            if (str.equals("setRouteGeometry")) {
                                List<Map> list = (List) ((Map) obj3).get(CRLDistributionPointsExtension.POINTS);
                                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                                for (Map map : list) {
                                    Object obj4 = map.get("lat");
                                    Double d = obj4 instanceof Double ? (Double) obj4 : null;
                                    Object obj5 = map.get("lon");
                                    Double d2 = obj5 instanceof Double ? (Double) obj5 : null;
                                    if (d == null) {
                                        ny61.g("Required value was null.");
                                        break;
                                    } else if (d2 == null) {
                                        ny61.g("Required value was null.");
                                        break;
                                    } else {
                                        arrayList.add(new Point(d.doubleValue(), d2.doubleValue()));
                                    }
                                }
                                ((AdvertLayer) nd1Var.a).setRoute(new Polyline(arrayList));
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case -1688560070:
                            if (str.equals("resetRoute")) {
                                ((AdvertLayer) nd1Var.a).resetRoute();
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case -1557842005:
                            if (str.equals("setPosition")) {
                                Map map2 = (Map) obj3;
                                ((AdvertLayer) nd1Var.a).setRoutePosition(new PolylinePosition(((Integer) map2.get("segmentIndex")).intValue(), ((Double) map2.get("segmentPosition")).doubleValue()));
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case 3237136:
                            if (str.equals("init")) {
                                nd1Var.a = SearchFactory.getInstance().createAdvertLayer((String) obj3, ((au00) ((eu00) obj2).a).getMapWindow(), null);
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case 1168679359:
                            if (str.equals("clearSelection")) {
                                ((AdvertLayer) nd1Var.a).clearSelection();
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                    }
                }
                ((ba20) da20Var).notImplemented();
                break;
            case 1:
                rmj rmjVar = (rmj) obj2;
                ini0 ini0Var = (ini0) obj;
                Object obj6 = x920Var.b;
                String str2 = x920Var.a;
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -1914501377:
                            if (str2.equals("setDefaultAnimationDurationMs")) {
                                d4c0.a = ((Number) obj6).longValue();
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case -1897762767:
                            if (str2.equals("animatedSetVisibility")) {
                                HashMap hashMap = obj6 instanceof HashMap ? (HashMap) obj6 : null;
                                if (hashMap != null) {
                                    Map map3 = (Map) hashMap.get("animation");
                                    Animation animation = new Animation(Animation.Type.valueOf(((String) map3.get("animationType")).toUpperCase(Locale.ROOT)), (float) ((Double) map3.get("durationSec")).doubleValue());
                                    for (Map.Entry entry : ((HashMap) hashMap.get(Constants.KEY_DATA)).entrySet()) {
                                        String str3 = (String) entry.getKey();
                                        Object value = entry.getValue();
                                        MapObject mapObject = (MapObject) ini0Var.c(str3, ReferenceType.MAP_OBJECT);
                                        Boolean bool = value instanceof Boolean ? (Boolean) value : null;
                                        if (bool == null) {
                                            ny61.g("Required value was null.");
                                            break;
                                        } else if (!Boolean.valueOf(mapObject.isVisible()).equals(bool)) {
                                            mapObject.setVisible(bool.booleanValue(), new Animation(animation.getType(), animation.getDuration()), new ak00(2));
                                        }
                                    }
                                    ((ba20) da20Var).success(null);
                                    break;
                                } else {
                                    ny61.g("Required value was null.");
                                    break;
                                }
                            }
                            break;
                        case -1877251820:
                            if (str2.equals("setVisibility")) {
                                HashMap hashMap2 = obj6 instanceof HashMap ? (HashMap) obj6 : null;
                                if (hashMap2 != null) {
                                    for (Map.Entry entry2 : hashMap2.entrySet()) {
                                        ((MapObject) ini0Var.c((String) entry2.getKey(), ReferenceType.MAP_OBJECT)).setVisible(((Boolean) entry2.getValue()).booleanValue());
                                    }
                                    ((ba20) da20Var).success(null);
                                    break;
                                } else {
                                    ny61.g("Required value was null.");
                                    break;
                                }
                            }
                            break;
                        case -205883000:
                            if (str2.equals("unsubscribeForTaps")) {
                                List list2 = obj6 instanceof List ? (List) obj6 : null;
                                if (list2 != null) {
                                    Iterator it = list2.iterator();
                                    while (it.hasNext()) {
                                        ((MapObject) ini0Var.c((String) it.next(), ReferenceType.MAP_OBJECT)).removeTapListener((uo00) rmjVar.e);
                                    }
                                    ((ba20) da20Var).success(null);
                                    break;
                                } else {
                                    ny61.g("Required value was null.");
                                    break;
                                }
                            }
                            break;
                        case 749980538:
                            if (str2.equals("setZIndex")) {
                                HashMap hashMap3 = obj6 instanceof HashMap ? (HashMap) obj6 : null;
                                if (hashMap3 != null) {
                                    for (Map.Entry entry3 : hashMap3.entrySet()) {
                                        MapObject mapObject2 = (MapObject) ini0Var.c((String) entry3.getKey(), ReferenceType.MAP_OBJECT);
                                        Object value2 = entry3.getValue();
                                        Double d3 = value2 instanceof Double ? (Double) value2 : null;
                                        Float valueOf = d3 != null ? Float.valueOf((float) d3.doubleValue()) : null;
                                        if (valueOf == null) {
                                            ny61.g("Required value was null.");
                                            break;
                                        } else {
                                            mapObject2.setZIndex(valueOf.floatValue());
                                        }
                                    }
                                    ((ba20) da20Var).success(null);
                                    break;
                                } else {
                                    ny61.g("Required value was null.");
                                    break;
                                }
                            }
                            break;
                        case 1947253999:
                            if (str2.equals("subscribeForTaps")) {
                                List list3 = obj6 instanceof List ? (List) obj6 : null;
                                if (list3 != null) {
                                    Iterator it2 = list3.iterator();
                                    while (it2.hasNext()) {
                                        ((MapObject) ini0Var.c((String) it2.next(), ReferenceType.MAP_OBJECT)).addTapListener((uo00) rmjVar.e);
                                    }
                                    ((ba20) da20Var).success(null);
                                    break;
                                } else {
                                    ny61.g("Required value was null.");
                                    break;
                                }
                            }
                            break;
                    }
                }
                ((ba20) da20Var).notImplemented();
                break;
            case 2:
                qz8 qz8Var = (qz8) obj;
                Object obj7 = x920Var.b;
                String str4 = x920Var.a;
                if (str4 != null) {
                    switch (str4.hashCode()) {
                        case -854558288:
                            if (str4.equals("setVisible")) {
                                ((CarparksLayer) qz8Var.a).setVisible(((Boolean) obj7).booleanValue());
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case -90262790:
                            if (str4.equals("setCarparksStyle")) {
                                ((ba20) da20Var).success(Boolean.valueOf(((CarparksLayer) qz8Var.a).setCarparksStyle((String) obj7)));
                                break;
                            }
                            break;
                        case 3237136:
                            if (str4.equals("init")) {
                                qz8Var.a = DirectionsFactory.getInstance().createCarparksLayer(((au00) ((eu00) obj2).a).getMapWindow());
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case 2091215590:
                            if (str4.equals("resetCarparksStyles")) {
                                ((CarparksLayer) qz8Var.a).resetCarparksStyles();
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                    }
                }
                ((ba20) da20Var).notImplemented();
                break;
            case 3:
                ini0 ini0Var2 = (ini0) obj;
                fmj fmjVar = (fmj) obj2;
                Object obj8 = x920Var.b;
                String str5 = x920Var.a;
                if (str5 != null) {
                    switch (str5.hashCode()) {
                        case -2087271666:
                            if (str5.equals("customSpeedLimits")) {
                                ((ba20) da20Var).success(rsq0.m(((Navigation) fmjVar.a).getGuidance().getSpeedLimitsPolicy().customSpeedLimits(((Double) obj8).doubleValue())));
                                break;
                            }
                            break;
                        case -1788139785:
                            if (str5.equals("setSpeedLimitTolerance")) {
                                ((Navigation) fmjVar.a).getGuidance().setSpeedLimitTolerance(((Double) obj8).doubleValue());
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case -1770097092:
                            if (str5.equals("getLegalSpeedLimits")) {
                                ((ba20) da20Var).success(rsq0.m(((Navigation) fmjVar.a).getGuidance().getSpeedLimitsPolicy().getLegalSpeedLimits()));
                                break;
                            }
                            break;
                        case -1211688250:
                            if (str5.equals("getCurrentRoute")) {
                                DrivingRoute currentRoute = ((Navigation) fmjVar.a).getGuidance().getCurrentRoute();
                                if (currentRoute == null) {
                                    ((ba20) da20Var).success(null);
                                    break;
                                } else {
                                    ((ba20) da20Var).success(ini0Var2.a(ReferenceType.DRIVING_ROUTE, currentRoute));
                                    break;
                                }
                            }
                            break;
                        case -1060831349:
                            if (str5.equals("setEnableAlternatives")) {
                                ((Navigation) fmjVar.a).getGuidance().setEnableAlternatives(((Boolean) obj8).booleanValue());
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case 855440444:
                            if (str5.equals("getSpeedLimitStatus")) {
                                ((ba20) da20Var).success(((Navigation) fmjVar.a).getGuidance().getSpeedLimitStatus().name().toLowerCase(Locale.ROOT));
                                break;
                            }
                            break;
                        case 1227148809:
                            if (str5.equals("getSpeedLimits")) {
                                LocalizedValue speedLimit = ((Navigation) fmjVar.a).getGuidance().getSpeedLimit();
                                ((ba20) da20Var).success(speedLimit != null ? b.i(new Pair("value", Double.valueOf(speedLimit.getValue())), new Pair("text", speedLimit.getText())) : null);
                                break;
                            }
                            break;
                        case 1495276353:
                            if (str5.equals("getRoadName")) {
                                ((ba20) da20Var).success(((Navigation) fmjVar.a).getGuidance().getRoadName());
                                break;
                            }
                            break;
                        case 1740761198:
                            if (str5.equals("getSpeedLimitsRules")) {
                                SpeedLimitsRules speedLimitsRules = ((Navigation) fmjVar.a).getGuidance().getSpeedLimitsPolicy().getSpeedLimitsRules();
                                String name = speedLimitsRules.getUrban().name();
                                Locale locale = Locale.ROOT;
                                ((ba20) da20Var).success(b.i(new Pair("urban", name.toLowerCase(locale)), new Pair("rural", speedLimitsRules.getRural().name().toLowerCase(locale)), new Pair("expressway", speedLimitsRules.getExpressway().name().toLowerCase(locale))));
                                break;
                            }
                            break;
                        case 2117233525:
                            if (str5.equals("switchRoute")) {
                                ((Navigation) fmjVar.a).getGuidance().switchToRoute((DrivingRoute) ini0Var2.c((String) obj8, ReferenceType.DRIVING_ROUTE));
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                    }
                }
                ((ba20) da20Var).notImplemented();
                break;
            default:
                f311 f311Var = (f311) obj2;
                String str6 = x920Var.a;
                if (str6 != null) {
                    switch (str6.hashCode()) {
                        case -1225190692:
                            if (str6.equals("getRoutePosition")) {
                                PolylinePosition routePosition = ((com.yandex.mapkit.navigation.transport.Navigation) f311Var.a).getGuidance().getRoutePosition();
                                ((ba20) da20Var).success(routePosition != null ? b.i(new Pair("segmentIndex", Integer.valueOf(routePosition.getSegmentIndex())), new Pair("segmentPosition", Double.valueOf(routePosition.getSegmentPosition()))) : null);
                                break;
                            }
                            break;
                        case -1211688250:
                            if (str6.equals("getCurrentRoute")) {
                                Route currentRoute2 = ((com.yandex.mapkit.navigation.transport.Navigation) f311Var.a).getGuidance().getCurrentRoute();
                                if (currentRoute2 == null) {
                                    ((ba20) da20Var).success(null);
                                    break;
                                } else {
                                    ((ba20) da20Var).success(((ini0) obj).a(ReferenceType.TRANSPORT_ROUTE, currentRoute2));
                                    break;
                                }
                            }
                            break;
                        case -847965823:
                            if (str6.equals("enableAutoRerouting")) {
                                ((com.yandex.mapkit.navigation.transport.Navigation) f311Var.a).getGuidance().enableAutoRerouting();
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case -316023509:
                            if (str6.equals("getLocation")) {
                                Location location = ((com.yandex.mapkit.navigation.transport.Navigation) f311Var.a).getGuidance().getLocation();
                                ((ba20) da20Var).success(location != null ? rsq0.g(location) : null);
                                break;
                            }
                            break;
                        case -190272687:
                            if (str6.equals("getTimeToFinish")) {
                                ((ba20) da20Var).success(((com.yandex.mapkit.navigation.transport.Navigation) f311Var.a).getGuidance().getTimeToFinish());
                                break;
                            }
                            break;
                        case -52506795:
                            if (str6.equals("getRemainingDistance")) {
                                ((ba20) da20Var).success(((com.yandex.mapkit.navigation.transport.Navigation) f311Var.a).getGuidance().getRemainingDistance());
                                break;
                            }
                            break;
                        case 218229767:
                            if (str6.equals("getLastReachedRequestPoint")) {
                                RequestPoint lastReachedRequestPoint = ((com.yandex.mapkit.navigation.transport.Navigation) f311Var.a).getGuidance().getLastReachedRequestPoint();
                                ((ba20) da20Var).success(lastReachedRequestPoint != null ? rsq0.k(lastReachedRequestPoint) : null);
                                break;
                            }
                            break;
                        case 341443345:
                            if (str6.equals("getCourse")) {
                                ((ba20) da20Var).success(((com.yandex.mapkit.navigation.transport.Navigation) f311Var.a).getGuidance().getCourse());
                                break;
                            }
                            break;
                        case 1445969980:
                            if (str6.equals("disableAutoRerouting")) {
                                ((com.yandex.mapkit.navigation.transport.Navigation) f311Var.a).getGuidance().disableAutoRerouting();
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                    }
                }
                ((ba20) da20Var).notImplemented();
                break;
        }
    }

    public qd1(ssr ssrVar, nd1 nd1Var, eu00 eu00Var) {
        super(ssrVar, "advert_layer");
        this.c = nd1Var;
        this.w = eu00Var;
    }

    public qd1(ssr ssrVar, ini0 ini0Var, fmj fmjVar) {
        super(ssrVar, "directions_guidance");
        this.c = ini0Var;
        this.w = fmjVar;
    }

    public qd1(ssr ssrVar, ini0 ini0Var, f311 f311Var) {
        super(ssrVar, "transport_guidance");
        this.c = ini0Var;
        this.w = f311Var;
    }

    public qd1(ssr ssrVar, ini0 ini0Var, rmj rmjVar) {
        super(ssrVar, "base_map_objects");
        this.c = ini0Var;
        this.w = rmjVar;
    }
}
