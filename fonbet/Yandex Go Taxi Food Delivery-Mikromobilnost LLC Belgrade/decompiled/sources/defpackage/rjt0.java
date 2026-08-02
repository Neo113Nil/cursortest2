package defpackage;

import com.yandex.go.preorder.mode.SourceAnalyticsMode;
import com.yandex.go.route.interactor.c;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$Type;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.directions.driving.TollRoad;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.collections.a;
import kotlin.collections.b;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.analytics.RoutesAnalytics$ReturnedRouteTypeV2;
import ru.yandex.taxi.analytics.RoutesAnalytics$Screen;
import ru.yandex.taxi.analytics.RoutesAnalytics$ShownRouteType;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

/* loaded from: classes6.dex */
public final class rjt0 {
    public final lx4 a;
    public final kgl0 b;
    public final c c;
    public final rqo d;
    public final opz0 e;
    public final wiq0 f;
    public final gj21 g;
    public final ide0 h;
    public final ede0 i;
    public final fde0 j;
    public final gde0 k;
    public final hde0 l;
    public final x770 m;
    public final kf00 n;
    public SourceAnalyticsMode o = SourceAnalyticsMode.MAIN;

    public rjt0(lx4 lx4Var, kgl0 kgl0Var, c cVar, rqo rqoVar, opz0 opz0Var, wiq0 wiq0Var, gj21 gj21Var, ide0 ide0Var, ede0 ede0Var, fde0 fde0Var, gde0 gde0Var, hde0 hde0Var, x770 x770Var, kf00 kf00Var) {
        this.a = lx4Var;
        this.b = kgl0Var;
        this.c = cVar;
        this.d = rqoVar;
        this.e = opz0Var;
        this.f = wiq0Var;
        this.g = gj21Var;
        this.h = ide0Var;
        this.i = ede0Var;
        this.j = fde0Var;
        this.k = gde0Var;
        this.l = hde0Var;
        this.m = x770Var;
        this.n = kf00Var;
    }

    public static void b(rjt0 rjt0Var, String str) {
        Map f = b.f();
        rjt0Var.getClass();
        i d = ((j) rjt0Var.a).d("Routes.".concat(str));
        w53 w53Var = new w53(1);
        w53Var.put("mode", rjt0Var.o.getModeName());
        w53Var.putAll(f);
        d.a.putAll(w53Var);
        d.m();
    }

    public final RoutesAnalytics$Screen a() {
        int i = qjt0.a[this.o.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return RoutesAnalytics$Screen.EditSourcePoint;
        }
        if (i == 3) {
            return RoutesAnalytics$Screen.EditDestinationPoint;
        }
        if (i == 4 || i == 5) {
            return RoutesAnalytics$Screen.Summary;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110 A[LOOP:2: B:53:0x010a->B:55:0x0110, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(List list) {
        String str;
        Iterator it;
        RoutesAnalytics$ShownRouteType routesAnalytics$ShownRouteType;
        List<TollRoad> tollRoads;
        RoutesAnalytics$Screen a = a();
        if (a != null) {
            List<ulm> list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ulm) it2.next()).a);
            }
            if (list.size() == 1) {
                DrivingRoute drivingRoute = (DrivingRoute) a.R(arrayList);
                if ((drivingRoute == null || (tollRoads = drivingRoute.getTollRoads()) == null) ? false : !tollRoads.isEmpty()) {
                    str = "Only toll route required to draw";
                    ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                    for (ulm ulmVar : list2) {
                        q6l0 q6l0Var = ulmVar.b;
                        MapRouteAppearance$Type mapRouteAppearance$Type = q6l0Var != null ? q6l0Var.i : null;
                        int i = mapRouteAppearance$Type == null ? -1 : qjt0.b[mapRouteAppearance$Type.ordinal()];
                        if (i != -1) {
                            if (i == 1) {
                                routesAnalytics$ShownRouteType = RoutesAnalytics$ShownRouteType.BezierOverride;
                            } else if (i == 2) {
                                routesAnalytics$ShownRouteType = RoutesAnalytics$ShownRouteType.WalkRouteOverride;
                            } else if (i != 3) {
                                w511.b();
                                return;
                            }
                            arrayList2.add(routesAnalytics$ShownRouteType);
                        }
                        routesAnalytics$ShownRouteType = !ulmVar.a.getTollRoads().isEmpty() ? RoutesAnalytics$ShownRouteType.Toll : RoutesAnalytics$ShownRouteType.Free;
                        arrayList2.add(routesAnalytics$ShownRouteType);
                    }
                    boolean isEnabled = ((en11) this.e.a.getValue()).isEnabled();
                    Boolean bool = (Boolean) ((jbh) this.d).a(SimpleBooleanExperiment.ROUTE_AVOID_TOLLS).b();
                    bool.getClass();
                    pex0 m = ((k) this.f).m();
                    boolean z = m == null ? m.X : true;
                    kgl0 kgl0Var = this.b;
                    kgl0Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put(MetaDataField.SCREEN_FIELD, a.getEventValue());
                    ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((RoutesAnalytics$ShownRouteType) it.next()).getEventValue());
                    }
                    hashMap.put("route_types", arrayList3);
                    hashMap.put("toll_roads", Boolean.valueOf(isEnabled));
                    hashMap.put("route_avoid_tolls", bool);
                    hashMap.put("debug_description", str);
                    hashMap.put("tariff_toll_roads_enabled", Boolean.valueOf(z));
                    kgl0Var.a.a("Routes.Shown", hashMap, 1, new HashMap());
                }
            }
            str = list.isEmpty() ? "Routes empty" : list.size() == 2 ? "Draw free and toll route" : "Draw free route";
            ArrayList arrayList22 = new ArrayList(tcc.n(list2, 10));
            while (r1.hasNext()) {
            }
            boolean isEnabled2 = ((en11) this.e.a.getValue()).isEnabled();
            Boolean bool2 = (Boolean) ((jbh) this.d).a(SimpleBooleanExperiment.ROUTE_AVOID_TOLLS).b();
            bool2.getClass();
            pex0 m2 = ((k) this.f).m();
            if (m2 == null) {
            }
            kgl0 kgl0Var2 = this.b;
            kgl0Var2.getClass();
            HashMap hashMap2 = new HashMap();
            hashMap2.put(MetaDataField.SCREEN_FIELD, a.getEventValue());
            ArrayList arrayList32 = new ArrayList(tcc.n(arrayList22, 10));
            it = arrayList22.iterator();
            while (it.hasNext()) {
            }
            hashMap2.put("route_types", arrayList32);
            hashMap2.put("toll_roads", Boolean.valueOf(isEnabled2));
            hashMap2.put("route_avoid_tolls", bool2);
            hashMap2.put("debug_description", str);
            hashMap2.put("tariff_toll_roads_enabled", Boolean.valueOf(z));
            kgl0Var2.a.a("Routes.Shown", hashMap2, 1, new HashMap());
        }
    }

    public final void d(long j, IOException iOException) {
        long nanoTime = System.nanoTime() - j;
        Pattern pattern = t7s.a;
        double d = nanoTime / 1.0E9d;
        RoutesAnalytics$Screen a = a();
        String modeName = this.o.getModeName();
        String str = null;
        String format = a != null ? String.format(Locale.US, "%.3f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)) : null;
        if (a != null) {
            String message = iOException.getMessage();
            if (message == null || evu0.J(message)) {
                message = "Error while fetching routes";
            }
            str = message;
        }
        kgl0 kgl0Var = this.b;
        kgl0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("requestTime", Double.valueOf(d));
        hashMap.put("Mode", modeName);
        if (a != null) {
            hashMap.put(MetaDataField.SCREEN_FIELD, a.getEventValue());
        }
        if (str != null) {
            hashMap.put(Constants.KEY_MESSAGE, str);
        }
        if (format != null) {
            hashMap.put("request_time_sec", format);
        }
        kgl0Var.a.a("Routes.Error", hashMap, 2, new HashMap());
    }

    public final void e(long j, List list) {
        long nanoTime = System.nanoTime() - j;
        Pattern pattern = t7s.a;
        double d = nanoTime / 1.0E9d;
        RoutesAnalytics$Screen a = a();
        String modeName = this.o.getModeName();
        ArrayList arrayList = null;
        String format = a != null ? String.format(Locale.US, "%.3f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)) : null;
        if (a != null) {
            List list2 = list;
            arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(!((DrivingRoute) it.next()).getTollRoads().isEmpty() ? RoutesAnalytics$ReturnedRouteTypeV2.Toll : RoutesAnalytics$ReturnedRouteTypeV2.Free);
            }
        }
        kgl0 kgl0Var = this.b;
        kgl0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("requestTime", Double.valueOf(d));
        hashMap.put("Mode", modeName);
        if (a != null) {
            hashMap.put(MetaDataField.SCREEN_FIELD, a.getEventValue());
        }
        if (format != null) {
            hashMap.put("request_time_sec", format);
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((RoutesAnalytics$ReturnedRouteTypeV2) it2.next()).getEventValue());
            }
            hashMap.put("route_types", arrayList2);
        }
        kgl0Var.a.a("Routes.Returned", hashMap, 2, new HashMap());
    }

    public final void f(String str) {
        i d = ((j) this.a).d(b64.j(this.o.getModeName(), ".ModeChanged"));
        d.a.put("mode", str);
        d.m();
    }
}
