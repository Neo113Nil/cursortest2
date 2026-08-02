package ru.yandex.taxi.map_common.map;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.RequestPointType;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.BoundingBoxHelper;
import com.yandex.mapkit.geometry.LinearRing;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polygon;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.location.LocationSettings;
import com.yandex.mapkit.location.LocationSettingsFactory;
import com.yandex.mapkit.location.SimulationSettings;
import com.yandex.mapkit.map.LayerIds;
import defpackage.el00;
import defpackage.jl40;
import defpackage.li6;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qqy;
import defpackage.rcc;
import defpackage.tls;
import defpackage.w511;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public abstract class k {
    public static final BoundingBox a(tls tlsVar) {
        if (el00.a) {
            li6 li6Var = new li6();
            tlsVar.invoke(li6Var);
            if (!li6Var.a.isEmpty() || !li6Var.b.isEmpty()) {
                if (!el00.a) {
                    ny61.r("MapKit must be initialized before building a BoundingBox");
                    return null;
                }
                ListBuilder a = rcc.a();
                if (!li6Var.a.isEmpty()) {
                    a.add(ru.yandex.taxi.map.utils.a.e(0, li6Var.a));
                }
                a.addAll(li6Var.b);
                ListBuilder j = a.j();
                if (j.isEmpty()) {
                    ny61.r("Nothing was added to BoxBuilder");
                    return null;
                }
                qqy qqyVar = (qqy) j.listIterator(0);
                if (!qqyVar.hasNext()) {
                    w511.x("Empty collection can't be reduced.");
                    return null;
                }
                Object next = qqyVar.next();
                while (qqyVar.hasNext()) {
                    next = BoundingBoxHelper.getBounds((BoundingBox) next, (BoundingBox) qqyVar.next());
                }
                return (BoundingBox) next;
            }
        }
        return null;
    }

    public static final Object b(List list) {
        Object obj;
        if (list.size() < 3) {
            return new Result.Failure(new IllegalArgumentException(oyr.i(list.size(), "LinearRing requires at least 3 points, got ")));
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Point point = (Point) obj;
            if (!t(point.getLatitude(), point.getLongitude())) {
                break;
            }
        }
        Point point2 = (Point) obj;
        if (point2 == null) {
            if (!jl40.l(kotlin.collections.a.P(list), kotlin.collections.a.Z(list))) {
                list = kotlin.collections.a.o0(list, kotlin.collections.a.P(list));
            }
            return new LinearRing((List<Point>) list);
        }
        double latitude = point2.getLatitude();
        double longitude = point2.getLongitude();
        StringBuilder u = oyr.u(latitude, "Invalid coordinates: lat=", ", lon=");
        u.append(longitude);
        return new Result.Failure(new IllegalArgumentException(u.toString()));
    }

    public static final Object c(List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Point point = (Point) obj;
            if (!t(point.getLatitude(), point.getLongitude())) {
                break;
            }
        }
        Point point2 = (Point) obj;
        if (point2 == null) {
            return new Polyline((List<Point>) list);
        }
        double latitude = point2.getLatitude();
        double longitude = point2.getLongitude();
        StringBuilder u = oyr.u(latitude, "Invalid coordinates: lat=", ", lon=");
        u.append(longitude);
        return new Result.Failure(new IllegalArgumentException(u.toString()));
    }

    public static final Object d(List list) {
        return list.size() < 2 ? new Result.Failure(new IllegalArgumentException(oyr.i(list.size(), "Polyline requires at least 2 points, got "))) : c(list);
    }

    public static final Object e(Point point, RequestPointType requestPointType, String str, String str2, String str3) {
        if (t(point.getLatitude(), point.getLongitude())) {
            return new RequestPoint(point, requestPointType, str, str2, str3);
        }
        double latitude = point.getLatitude();
        double longitude = point.getLongitude();
        StringBuilder u = oyr.u(latitude, "Invalid coordinates: lat=", ", lon=");
        u.append(longitude);
        return new Result.Failure(new IllegalArgumentException(u.toString()));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(el00 el00Var, ContinuationImpl continuationImpl) {
        MapKitManagerExtensionsKt$createCoarseLocationSettings$1 mapKitManagerExtensionsKt$createCoarseLocationSettings$1;
        int i;
        if (continuationImpl instanceof MapKitManagerExtensionsKt$createCoarseLocationSettings$1) {
            mapKitManagerExtensionsKt$createCoarseLocationSettings$1 = (MapKitManagerExtensionsKt$createCoarseLocationSettings$1) continuationImpl;
            int i2 = mapKitManagerExtensionsKt$createCoarseLocationSettings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapKitManagerExtensionsKt$createCoarseLocationSettings$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapKitManagerExtensionsKt$createCoarseLocationSettings$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapKitManagerExtensionsKt$createCoarseLocationSettings$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mapKitManagerExtensionsKt$createCoarseLocationSettings$1.L$0 = null;
                    mapKitManagerExtensionsKt$createCoarseLocationSettings$1.label = 1;
                    if (el00Var.a(mapKitManagerExtensionsKt$createCoarseLocationSettings$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return LocationSettingsFactory.coarseSettings();
            }
        }
        mapKitManagerExtensionsKt$createCoarseLocationSettings$1 = new MapKitManagerExtensionsKt$createCoarseLocationSettings$1(continuationImpl);
        Object obj3 = mapKitManagerExtensionsKt$createCoarseLocationSettings$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapKitManagerExtensionsKt$createCoarseLocationSettings$1.label;
        if (i != 0) {
        }
        return LocationSettingsFactory.coarseSettings();
    }

    public static final Polyline g() {
        if (el00.a) {
            return new Polyline(EmptyList.a);
        }
        return null;
    }

    public static final LinearRing h(List list) {
        if (!el00.a) {
            return null;
        }
        Object b = b(list);
        return (LinearRing) (b instanceof Result.Failure ? null : b);
    }

    public static final Polyline i(List list) {
        if (!el00.a) {
            return null;
        }
        Object c = c(list);
        return (Polyline) (c instanceof Result.Failure ? null : c);
    }

    public static final Polygon j(List list, List list2) {
        Object polygon;
        if (!el00.a) {
            return null;
        }
        Object b = b(list);
        if (b instanceof Result.Failure) {
            b = null;
        }
        LinearRing linearRing = (LinearRing) b;
        if (linearRing == null) {
            polygon = new Result.Failure(new IllegalArgumentException(oyr.i(list.size(), "Invalid outer ring: requires at least 3 points, got ")));
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                Object b2 = b((List) it.next());
                if (b2 instanceof Result.Failure) {
                    b2 = null;
                }
                LinearRing linearRing2 = (LinearRing) b2;
                if (linearRing2 != null) {
                    arrayList.add(linearRing2);
                }
            }
            polygon = new Polygon(linearRing, arrayList);
        }
        return (Polygon) (polygon instanceof Result.Failure ? null : polygon);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v0, types: [el00] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(el00 el00Var, ArrayList arrayList, ContinuationImpl continuationImpl) {
        MapKitManagerExtensionsKt$createPolyline$1 mapKitManagerExtensionsKt$createPolyline$1;
        int i;
        ArrayList arrayList2;
        if (continuationImpl instanceof MapKitManagerExtensionsKt$createPolyline$1) {
            mapKitManagerExtensionsKt$createPolyline$1 = (MapKitManagerExtensionsKt$createPolyline$1) continuationImpl;
            int i2 = mapKitManagerExtensionsKt$createPolyline$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapKitManagerExtensionsKt$createPolyline$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapKitManagerExtensionsKt$createPolyline$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapKitManagerExtensionsKt$createPolyline$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mapKitManagerExtensionsKt$createPolyline$1.L$0 = null;
                    mapKitManagerExtensionsKt$createPolyline$1.L$1 = arrayList;
                    mapKitManagerExtensionsKt$createPolyline$1.label = 1;
                    arrayList2 = arrayList;
                    if (el00Var.a(mapKitManagerExtensionsKt$createPolyline$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r6 = (List) mapKitManagerExtensionsKt$createPolyline$1.L$1;
                    kotlin.b.b(obj);
                    arrayList2 = r6;
                }
                return d(arrayList2);
            }
        }
        mapKitManagerExtensionsKt$createPolyline$1 = new MapKitManagerExtensionsKt$createPolyline$1(continuationImpl);
        Object obj2 = mapKitManagerExtensionsKt$createPolyline$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapKitManagerExtensionsKt$createPolyline$1.label;
        if (i != 0) {
        }
        return d(arrayList2);
    }

    public static final Polyline l(List list) {
        if (!el00.a) {
            return null;
        }
        Object d = d(list);
        return (Polyline) (d instanceof Result.Failure ? null : d);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(el00 el00Var, zzs zzsVar, RequestPointType requestPointType, String str, ContinuationImpl continuationImpl) {
        MapKitManagerExtensionsKt$createRequestPoint$1 mapKitManagerExtensionsKt$createRequestPoint$1;
        int i;
        if (continuationImpl instanceof MapKitManagerExtensionsKt$createRequestPoint$1) {
            mapKitManagerExtensionsKt$createRequestPoint$1 = (MapKitManagerExtensionsKt$createRequestPoint$1) continuationImpl;
            int i2 = mapKitManagerExtensionsKt$createRequestPoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapKitManagerExtensionsKt$createRequestPoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapKitManagerExtensionsKt$createRequestPoint$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapKitManagerExtensionsKt$createRequestPoint$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                kotlin.b.b(obj);
                Point F = ru.yandex.taxi.map.utils.a.F(zzsVar);
                mapKitManagerExtensionsKt$createRequestPoint$1.L$0 = null;
                mapKitManagerExtensionsKt$createRequestPoint$1.L$1 = null;
                mapKitManagerExtensionsKt$createRequestPoint$1.L$2 = null;
                mapKitManagerExtensionsKt$createRequestPoint$1.L$3 = null;
                mapKitManagerExtensionsKt$createRequestPoint$1.L$4 = null;
                mapKitManagerExtensionsKt$createRequestPoint$1.L$5 = null;
                mapKitManagerExtensionsKt$createRequestPoint$1.label = 1;
                Object n = n(el00Var, F, requestPointType, str, mapKitManagerExtensionsKt$createRequestPoint$1);
                return n == coroutineSingletons ? coroutineSingletons : n;
            }
        }
        mapKitManagerExtensionsKt$createRequestPoint$1 = new MapKitManagerExtensionsKt$createRequestPoint$1(continuationImpl);
        Object obj2 = mapKitManagerExtensionsKt$createRequestPoint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapKitManagerExtensionsKt$createRequestPoint$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(el00 el00Var, Point point, RequestPointType requestPointType, String str, ContinuationImpl continuationImpl) {
        MapKitManagerExtensionsKt$createRequestPoint$2 mapKitManagerExtensionsKt$createRequestPoint$2;
        int i;
        String str2;
        if (continuationImpl instanceof MapKitManagerExtensionsKt$createRequestPoint$2) {
            mapKitManagerExtensionsKt$createRequestPoint$2 = (MapKitManagerExtensionsKt$createRequestPoint$2) continuationImpl;
            int i2 = mapKitManagerExtensionsKt$createRequestPoint$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapKitManagerExtensionsKt$createRequestPoint$2.label = i2 - Integer.MIN_VALUE;
                Object obj = mapKitManagerExtensionsKt$createRequestPoint$2.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapKitManagerExtensionsKt$createRequestPoint$2.label;
                String str3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mapKitManagerExtensionsKt$createRequestPoint$2.L$0 = null;
                    mapKitManagerExtensionsKt$createRequestPoint$2.L$1 = point;
                    mapKitManagerExtensionsKt$createRequestPoint$2.L$2 = requestPointType;
                    mapKitManagerExtensionsKt$createRequestPoint$2.L$3 = str;
                    mapKitManagerExtensionsKt$createRequestPoint$2.L$4 = null;
                    mapKitManagerExtensionsKt$createRequestPoint$2.L$5 = null;
                    mapKitManagerExtensionsKt$createRequestPoint$2.label = 1;
                    if (el00Var.a(mapKitManagerExtensionsKt$createRequestPoint$2) == obj2) {
                        return obj2;
                    }
                    str2 = null;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str4 = (String) mapKitManagerExtensionsKt$createRequestPoint$2.L$5;
                    String str5 = (String) mapKitManagerExtensionsKt$createRequestPoint$2.L$4;
                    str = (String) mapKitManagerExtensionsKt$createRequestPoint$2.L$3;
                    requestPointType = (RequestPointType) mapKitManagerExtensionsKt$createRequestPoint$2.L$2;
                    point = (Point) mapKitManagerExtensionsKt$createRequestPoint$2.L$1;
                    kotlin.b.b(obj);
                    str3 = str5;
                    str2 = str4;
                }
                return e(point, requestPointType, str, str3, str2);
            }
        }
        mapKitManagerExtensionsKt$createRequestPoint$2 = new MapKitManagerExtensionsKt$createRequestPoint$2(continuationImpl);
        Object obj3 = mapKitManagerExtensionsKt$createRequestPoint$2.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapKitManagerExtensionsKt$createRequestPoint$2.label;
        String str32 = null;
        if (i != 0) {
        }
        return e(point, requestPointType, str, str32, str2);
    }

    public static final RequestPoint o(Point point, RequestPointType requestPointType, String str) {
        if (!el00.a) {
            return null;
        }
        Object e = e(point, requestPointType, str, null, null);
        return (RequestPoint) (e instanceof Result.Failure ? null : e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(el00 el00Var, Polyline polyline, LocationSettings locationSettings, ContinuationImpl continuationImpl) {
        MapKitManagerExtensionsKt$createSimulationSettings$1 mapKitManagerExtensionsKt$createSimulationSettings$1;
        int i;
        if (continuationImpl instanceof MapKitManagerExtensionsKt$createSimulationSettings$1) {
            mapKitManagerExtensionsKt$createSimulationSettings$1 = (MapKitManagerExtensionsKt$createSimulationSettings$1) continuationImpl;
            int i2 = mapKitManagerExtensionsKt$createSimulationSettings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapKitManagerExtensionsKt$createSimulationSettings$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapKitManagerExtensionsKt$createSimulationSettings$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapKitManagerExtensionsKt$createSimulationSettings$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mapKitManagerExtensionsKt$createSimulationSettings$1.L$0 = null;
                    mapKitManagerExtensionsKt$createSimulationSettings$1.L$1 = polyline;
                    mapKitManagerExtensionsKt$createSimulationSettings$1.L$2 = locationSettings;
                    mapKitManagerExtensionsKt$createSimulationSettings$1.label = 1;
                    if (el00Var.a(mapKitManagerExtensionsKt$createSimulationSettings$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    locationSettings = (LocationSettings) mapKitManagerExtensionsKt$createSimulationSettings$1.L$2;
                    polyline = (Polyline) mapKitManagerExtensionsKt$createSimulationSettings$1.L$1;
                    kotlin.b.b(obj);
                }
                return new SimulationSettings(polyline, locationSettings);
            }
        }
        mapKitManagerExtensionsKt$createSimulationSettings$1 = new MapKitManagerExtensionsKt$createSimulationSettings$1(continuationImpl);
        Object obj3 = mapKitManagerExtensionsKt$createSimulationSettings$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapKitManagerExtensionsKt$createSimulationSettings$1.label;
        if (i != 0) {
        }
        return new SimulationSettings(polyline, locationSettings);
    }

    public static final SimulationSettings q(Polyline polyline, LocationSettings locationSettings) {
        if (!el00.a || polyline == null) {
            return null;
        }
        return new SimulationSettings(polyline, locationSettings);
    }

    public static final String r() {
        if (el00.a) {
            return LayerIds.getMapLayerId();
        }
        return null;
    }

    public static final String s() {
        if (el00.a) {
            return LayerIds.getMapObjectsLayerId();
        }
        return null;
    }

    public static final boolean t(double d, double d2) {
        return Math.abs(d) <= Double.MAX_VALUE && Math.abs(d2) <= Double.MAX_VALUE && -90.0d <= d && d <= 90.0d && -180.0d <= d2 && d2 <= 180.0d;
    }
}
