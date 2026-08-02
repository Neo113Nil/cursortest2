package defpackage;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.RequestPointType;
import com.yandex.mapkit.annotations.AnnotationLanguage;
import com.yandex.mapkit.directions.DirectionsFactory;
import com.yandex.mapkit.directions.driving.AvoidanceFlags;
import com.yandex.mapkit.directions.driving.DrivingOptions;
import com.yandex.mapkit.directions.driving.DrivingRouter;
import com.yandex.mapkit.directions.driving.DrivingRouterType;
import com.yandex.mapkit.directions.driving.DrivingSession;
import com.yandex.mapkit.directions.driving.VehicleOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes7.dex */
public final class xlm extends k45 {
    public final ini0 b;
    public DrivingRouter c;
    public final HashMap w;
    public final HashMap x;

    public xlm(ssr ssrVar, ini0 ini0Var) {
        super(ssrVar, "driving_router");
        this.b = ini0Var;
        this.w = new HashMap();
        this.x = new HashMap();
    }

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        Object obj = x920Var.b;
        String str = x920Var.a;
        if (str != null) {
            int hashCode = str.hashCode();
            HashMap hashMap = this.x;
            HashMap hashMap2 = this.w;
            if (hashCode != -1852281244) {
                if (hashCode != 225827961) {
                    if (hashCode == 1370295993 && str.equals("requestRoutes")) {
                        if (this.c == null) {
                            ((ba20) da20Var).error("error", "Driving router not initialized", "");
                            return;
                        }
                        Map map = (Map) obj;
                        ArrayList j = lyi.j(map);
                        Map map2 = (Map) map.get("drivingOptions");
                        Double d = (Double) map2.get("initialAzimuth");
                        Integer num = (Integer) map2.get("routesCount");
                        Boolean bool = (Boolean) map2.get("avoidTolls");
                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                        Long l = (Long) map2.get("departureTime");
                        String str2 = (String) map2.get("annotationLanguage");
                        DrivingOptions drivingOptions = new DrivingOptions(d, num, l, str2 == null ? null : AnnotationLanguage.valueOf(str2.toUpperCase(Locale.ROOT)), new AvoidanceFlags(booleanValue, false, false, false, false, false, false, false));
                        VehicleOptions m = lyi.m((Map) map.get("vehicleOptions"));
                        String str3 = (String) map.get("cancelToken");
                        ArrayList arrayList = new ArrayList();
                        Iterator it = j.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (((RequestPoint) next).getType() == RequestPointType.WAYPOINT) {
                                arrayList.add(next);
                            }
                        }
                        if (arrayList.size() < 2) {
                            ((ba20) da20Var).error("requestRoutes", "The route must have at least two WayPoint points", null);
                            return;
                        } else {
                            hashMap2.put(str3, this.c.requestRoutes(j, drivingOptions, m, new wlm(this, str3)));
                            hashMap.put(str3, da20Var);
                            return;
                        }
                    }
                } else if (str.equals("initRouter")) {
                    if (this.c == null) {
                        this.c = DirectionsFactory.getInstance().createDrivingRouter(DrivingRouterType.COMBINED);
                    }
                    ((ba20) da20Var).success(null);
                    return;
                }
            } else if (str.equals("cancelRoutes")) {
                String str4 = (String) obj;
                DrivingSession drivingSession = (DrivingSession) hashMap2.remove(str4);
                if (drivingSession != null) {
                    drivingSession.cancel();
                }
                da20 da20Var2 = (da20) hashMap.remove(str4);
                if (da20Var2 != null) {
                    da20Var2.success(null);
                }
                ((ba20) da20Var).success(null);
                return;
            }
        }
        ((ba20) da20Var).notImplemented();
    }
}
