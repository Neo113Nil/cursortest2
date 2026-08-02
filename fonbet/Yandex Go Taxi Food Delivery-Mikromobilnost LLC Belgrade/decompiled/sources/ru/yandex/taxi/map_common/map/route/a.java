package ru.yandex.taxi.map_common.map.route;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.geo.PolylineIndex;
import defpackage.f6c;
import defpackage.h8l0;
import defpackage.ix4;
import defpackage.ny61;
import defpackage.ool0;
import defpackage.plm;
import defpackage.scc;
import defpackage.tal0;
import defpackage.vpr;
import defpackage.y6i0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ plm b;

    public a(vpr vprVar, plm plmVar) {
        this.a = vprVar;
        this.b = plmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DrivingRouteGuideImpl$special$$inlined$mapNotNull$1$2$1 drivingRouteGuideImpl$special$$inlined$mapNotNull$1$2$1;
        int i;
        h8l0 h8l0Var;
        PolylinePosition polylinePosition;
        double d;
        int i2;
        PolylinePosition polylinePosition2;
        Iterable iterable;
        if (continuation instanceof DrivingRouteGuideImpl$special$$inlined$mapNotNull$1$2$1) {
            drivingRouteGuideImpl$special$$inlined$mapNotNull$1$2$1 = (DrivingRouteGuideImpl$special$$inlined$mapNotNull$1$2$1) continuation;
            int i3 = drivingRouteGuideImpl$special$$inlined$mapNotNull$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                drivingRouteGuideImpl$special$$inlined$mapNotNull$1$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = drivingRouteGuideImpl$special$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = drivingRouteGuideImpl$special$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    tal0 tal0Var = (tal0) obj;
                    ool0 ool0Var = tal0Var.a;
                    if (ool0Var != null) {
                        int i4 = 2;
                        if (ool0Var.getGeometry().getPoints().size() >= 2) {
                            List<Point> points = ool0Var.getGeometry().getPoints();
                            Double d2 = tal0Var.d;
                            Point point = tal0Var.b;
                            PolylineIndex polylineIndex = tal0Var.c;
                            if (point != null) {
                                if (d2 != null) {
                                    double doubleValue = d2.doubleValue();
                                    if (points.size() < 2 || doubleValue < 0.0d) {
                                        d = 0.0d;
                                    } else {
                                        Iterator<T> it = points.iterator();
                                        if (it.hasNext()) {
                                            d = 0.0d;
                                            ArrayList arrayList = new ArrayList();
                                            Object next = it.next();
                                            while (it.hasNext()) {
                                                Object next2 = it.next();
                                                arrayList.add(Double.valueOf(ru.yandex.taxi.map.utils.a.k((Point) next, (Point) next2)));
                                                next = next2;
                                            }
                                            iterable = arrayList;
                                        } else {
                                            iterable = EmptyList.a;
                                            d = 0.0d;
                                        }
                                        Iterator it2 = iterable.iterator();
                                        double d3 = d;
                                        while (it2.hasNext()) {
                                            d3 = ((Number) it2.next()).doubleValue() + d3;
                                        }
                                        double b = y6i0.b(d3 - (doubleValue / 1000.0d), 0.0d, d3);
                                        if (points.size() >= 2 && b > d) {
                                            int f = scc.f(points);
                                            double d4 = b;
                                            int i5 = 0;
                                            while (true) {
                                                if (i5 >= f) {
                                                    i2 = i4;
                                                    polylinePosition2 = new PolylinePosition(points.size() - 2, 1.0d);
                                                    break;
                                                }
                                                Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                                                int i6 = i5 + 1;
                                                i2 = i4;
                                                double k = ru.yandex.taxi.map.utils.a.k(points.get(i5), points.get(i6));
                                                if (d4 <= k) {
                                                    polylinePosition2 = new PolylinePosition(i5, k > d ? d4 / k : d);
                                                } else {
                                                    d4 -= k;
                                                    i5 = i6;
                                                    i4 = i2;
                                                }
                                            }
                                            if (polylinePosition2 == null) {
                                                this.b.a.getClass();
                                                if (points.size() < i2) {
                                                    polylinePosition = new PolylinePosition(0, d);
                                                } else {
                                                    int segmentIndex = polylinePosition2.getSegmentIndex();
                                                    int i7 = segmentIndex - 30;
                                                    if (i7 < 0) {
                                                        i7 = 0;
                                                    }
                                                    int i8 = segmentIndex + 30;
                                                    int size = points.size() - 2;
                                                    if (i8 > size) {
                                                        i8 = size;
                                                    }
                                                    ix4 a = f6c.a(point, points, polylinePosition2, i7, i8);
                                                    polylinePosition = a.a > 1.0E-6d ? (PolylinePosition) f6c.a(point, points, polylinePosition2, 0, points.size() - 2).b : (PolylinePosition) a.b;
                                                }
                                            } else if (polylineIndex != null) {
                                                polylinePosition = polylineIndex.closestPolylinePosition(point, PolylineIndex.Priority.CLOSEST_TO_RAW_POINT, Double.MAX_VALUE);
                                            }
                                            h8l0Var = new h8l0(ool0Var, polylinePosition);
                                            if (h8l0Var != null) {
                                            }
                                        }
                                    }
                                    i2 = 2;
                                    polylinePosition2 = null;
                                    if (polylinePosition2 == null) {
                                    }
                                    h8l0Var = new h8l0(ool0Var, polylinePosition);
                                    if (h8l0Var != null) {
                                    }
                                } else if (polylineIndex != null) {
                                    polylinePosition = polylineIndex.closestPolylinePosition(point, PolylineIndex.Priority.CLOSEST_TO_RAW_POINT, Double.MAX_VALUE);
                                    h8l0Var = new h8l0(ool0Var, polylinePosition);
                                    if (h8l0Var != null) {
                                        drivingRouteGuideImpl$special$$inlined$mapNotNull$1$2$1.L$0 = null;
                                        drivingRouteGuideImpl$special$$inlined$mapNotNull$1$2$1.L$1 = null;
                                        drivingRouteGuideImpl$special$$inlined$mapNotNull$1$2$1.L$2 = null;
                                        drivingRouteGuideImpl$special$$inlined$mapNotNull$1$2$1.L$3 = null;
                                        drivingRouteGuideImpl$special$$inlined$mapNotNull$1$2$1.L$4 = null;
                                        drivingRouteGuideImpl$special$$inlined$mapNotNull$1$2$1.label = 1;
                                        if (this.a.emit(h8l0Var, drivingRouteGuideImpl$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    }
                                }
                            }
                            polylinePosition = null;
                            h8l0Var = new h8l0(ool0Var, polylinePosition);
                            if (h8l0Var != null) {
                            }
                        }
                    }
                    h8l0Var = null;
                    if (h8l0Var != null) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        drivingRouteGuideImpl$special$$inlined$mapNotNull$1$2$1 = new DrivingRouteGuideImpl$special$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = drivingRouteGuideImpl$special$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = drivingRouteGuideImpl$special$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
