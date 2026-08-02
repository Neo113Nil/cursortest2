package defpackage;

import com.yandex.mapkit.map.LayerIds;
import com.yandex.mapkit.map.SublayerFeatureType;
import com.yandex.mapkit.map.SublayerManager;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes7.dex */
public final class wva0 extends k45 {
    public final /* synthetic */ int b;
    public final eu00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wva0(ssr ssrVar, eu00 eu00Var, int i) {
        super(ssrVar, "performance_metrics");
        this.b = i;
        switch (i) {
            case 1:
                super(ssrVar, "sublayers_controller");
                this.c = eu00Var;
                break;
            default:
                this.c = eu00Var;
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        String str;
        int i = this.b;
        eu00 eu00Var = this.c;
        switch (i) {
            case 0:
                String str2 = x920Var.a;
                if (str2 != null) {
                    int hashCode = str2.hashCode();
                    if (hashCode == -1938783471) {
                        if (str2.equals("startPerformanceMetricsCapture")) {
                            ((au00) eu00Var.a).getMapWindow().startPerformanceMetricsCapture();
                            ((ba20) da20Var).success(null);
                            break;
                        }
                    } else if (hashCode == -194371292) {
                        if (str2.equals("dropPerformanceMetricsCapture")) {
                            ((au00) eu00Var.a).getMapWindow().stopPerformanceMetricsCapture();
                            ((ba20) da20Var).success(null);
                            break;
                        }
                    } else if (hashCode == 1102746481 && str2.equals("stopPerformanceMetricsCapture")) {
                        ((ba20) da20Var).success(((au00) eu00Var.a).getMapWindow().stopPerformanceMetricsCapture());
                        break;
                    }
                }
                ((ba20) da20Var).notImplemented();
                break;
            default:
                Object obj = x920Var.b;
                String str3 = x920Var.a;
                if (str3 != null) {
                    switch (str3.hashCode()) {
                        case -2081388880:
                            if (str3.equals("moveBefore")) {
                                Map map = (Map) obj;
                                ((au00) eu00Var.a).getMapWindow().getMap().getSublayerManager().moveBefore(((Integer) map.get("from")).intValue(), ((Integer) map.get("to")).intValue());
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case -1403871290:
                            if (str3.equals("findFirstUserLayerOf")) {
                                Map map2 = (Map) obj;
                                String str4 = (String) map2.get("sublayer");
                                String str5 = (String) map2.get("sublayerFeatureType");
                                SublayerManager sublayerManager = ((au00) eu00Var.a).getMapWindow().getMap().getSublayerManager();
                                if (str5 != null) {
                                    ((ba20) da20Var).success(sublayerManager.findFirstOf(str4, SublayerFeatureType.valueOf(str5.toUpperCase(Locale.ROOT))));
                                    break;
                                } else {
                                    ((ba20) da20Var).success(sublayerManager.findFirstOf(str4));
                                    break;
                                }
                            }
                            break;
                        case -13016914:
                            if (str3.equals("findFirstOf")) {
                                Map map3 = (Map) obj;
                                String str6 = (String) map3.get("sublayer");
                                switch (str6.hashCode()) {
                                    case -1923139157:
                                        if (str6.equals("searchPinsLayer")) {
                                            str = LayerIds.getSearchPinsLayerId();
                                            break;
                                        }
                                        str = "";
                                        break;
                                    case -1673066864:
                                        if (str6.equals("routeMapObjectsLayer")) {
                                            str = LayerIds.getRouteMapObjectsLayerId();
                                            break;
                                        }
                                        str = "";
                                        break;
                                    case -1597719534:
                                        if (str6.equals("drivingNavigationBalloonsLayer")) {
                                            str = LayerIds.getDrivingNavigationBalloonsLayerId();
                                            break;
                                        }
                                        str = "";
                                        break;
                                    case -1280974593:
                                        if (str6.equals("advertPinsLayer")) {
                                            str = LayerIds.getAdvertPinsLayerId();
                                            break;
                                        }
                                        str = "";
                                        break;
                                    case -596142789:
                                        if (str6.equals("drivingNavigation")) {
                                            str = LayerIds.getDrivingNavigationBaseLayerId();
                                            break;
                                        }
                                        str = "";
                                        break;
                                    case -233422728:
                                        if (str6.equals("roadEventsLayer")) {
                                            str = LayerIds.getRoadEventsLayerId();
                                            break;
                                        }
                                        str = "";
                                        break;
                                    case -34417519:
                                        if (str6.equals("userLocationLayer")) {
                                            str = LayerIds.getUserLocationLayerId();
                                            break;
                                        }
                                        str = "";
                                        break;
                                    case 160971093:
                                        if (str6.equals("mapLayer")) {
                                            str = LayerIds.getMapLayerId();
                                            break;
                                        }
                                        str = "";
                                        break;
                                    case 256468532:
                                        if (str6.equals("jamsLayer")) {
                                            str = LayerIds.getJamsLayerId();
                                            break;
                                        }
                                        str = "";
                                        break;
                                    case 579927065:
                                        if (str6.equals("mapObjectsLayer")) {
                                            str = LayerIds.getMapObjectsLayerId();
                                            break;
                                        }
                                        str = "";
                                        break;
                                    case 1008780963:
                                        if (str6.equals("drivingNavigationUserPlacemarkLayer")) {
                                            str = LayerIds.getDrivingNavigationUserPlacemarkLayerId();
                                            break;
                                        }
                                        str = "";
                                        break;
                                    case 1066119237:
                                        if (str6.equals("drivingNavigationRoutePinsLayer")) {
                                            str = LayerIds.getDrivingNavigationRoutePinsLayerId();
                                            break;
                                        }
                                        str = "";
                                        break;
                                    case 1642098770:
                                        if (str6.equals("buildingsLayer")) {
                                            str = LayerIds.getBuildingsLayerId();
                                            break;
                                        }
                                        str = "";
                                        break;
                                    case 1701657879:
                                        if (str6.equals("personalizedPoiLayer")) {
                                            str = LayerIds.getPersonalizedPoiLayerId();
                                            break;
                                        }
                                        str = "";
                                        break;
                                    case 1909653416:
                                        if (str6.equals("transportLayer")) {
                                            str = LayerIds.getTransportLayerId();
                                            break;
                                        }
                                        str = "";
                                        break;
                                    default:
                                        str = "";
                                        break;
                                }
                                String str7 = (String) map3.get("sublayerFeatureType");
                                SublayerManager sublayerManager2 = ((au00) eu00Var.a).getMapWindow().getMap().getSublayerManager();
                                if (str7 != null) {
                                    ((ba20) da20Var).success(sublayerManager2.findFirstOf(str, SublayerFeatureType.valueOf(str7.toUpperCase(Locale.ROOT))));
                                    break;
                                } else {
                                    ((ba20) da20Var).success(sublayerManager2.findFirstOf(str));
                                    break;
                                }
                            }
                            break;
                        case 1040356491:
                            if (str3.equals("moveAfter")) {
                                Map map4 = (Map) obj;
                                ((au00) eu00Var.a).getMapWindow().getMap().getSublayerManager().moveAfter(((Integer) map4.get("from")).intValue(), ((Integer) map4.get("to")).intValue());
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case 1058126607:
                            if (str3.equals("moveToEnd")) {
                                ((au00) eu00Var.a).getMapWindow().getMap().getSublayerManager().moveToEnd(((Integer) obj).intValue());
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
}
