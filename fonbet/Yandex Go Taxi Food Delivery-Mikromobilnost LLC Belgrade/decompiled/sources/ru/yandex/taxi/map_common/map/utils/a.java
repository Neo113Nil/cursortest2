package ru.yandex.taxi.map_common.map.utils;

import com.yandex.go.coroutines.h;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.Projection;
import com.yandex.mapkit.geometry.geo.XYPoint;
import defpackage.ny61;
import defpackage.tje;
import defpackage.zzs;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a {
    public final h a;
    public Projection b;

    public a(h hVar) {
        this.a = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        FlatWorldProjectionImpl$getProjection$1 flatWorldProjectionImpl$getProjection$1;
        int i;
        if (continuationImpl instanceof FlatWorldProjectionImpl$getProjection$1) {
            flatWorldProjectionImpl$getProjection$1 = (FlatWorldProjectionImpl$getProjection$1) continuationImpl;
            int i2 = flatWorldProjectionImpl$getProjection$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flatWorldProjectionImpl$getProjection$1.label = i2 - Integer.MIN_VALUE;
                Object obj = flatWorldProjectionImpl$getProjection$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flatWorldProjectionImpl$getProjection$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Projection projection = this.b;
                    if (projection != null) {
                        return projection;
                    }
                    flatWorldProjectionImpl$getProjection$1.label = 1;
                    obj = this.a.a(flatWorldProjectionImpl$getProjection$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Projection projection2 = (Projection) obj;
                this.b = projection2;
                return projection2;
            }
        }
        flatWorldProjectionImpl$getProjection$1 = new FlatWorldProjectionImpl$getProjection$1(this, continuationImpl);
        Object obj2 = flatWorldProjectionImpl$getProjection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flatWorldProjectionImpl$getProjection$1.label;
        if (i != 0) {
        }
        Projection projection22 = (Projection) obj2;
        this.b = projection22;
        return projection22;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Point point, ContinuationImpl continuationImpl) {
        FlatWorldProjectionImpl$worldToXY$2 flatWorldProjectionImpl$worldToXY$2;
        int i;
        if (continuationImpl instanceof FlatWorldProjectionImpl$worldToXY$2) {
            flatWorldProjectionImpl$worldToXY$2 = (FlatWorldProjectionImpl$worldToXY$2) continuationImpl;
            int i2 = flatWorldProjectionImpl$worldToXY$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flatWorldProjectionImpl$worldToXY$2.label = i2 - Integer.MIN_VALUE;
                Object obj = flatWorldProjectionImpl$worldToXY$2.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flatWorldProjectionImpl$worldToXY$2.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    flatWorldProjectionImpl$worldToXY$2.L$0 = point;
                    flatWorldProjectionImpl$worldToXY$2.label = 1;
                    obj = a(flatWorldProjectionImpl$worldToXY$2);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    point = (Point) flatWorldProjectionImpl$worldToXY$2.L$0;
                    kotlin.b.b(obj);
                }
                return ((Projection) obj).worldToXY(point, 30);
            }
        }
        flatWorldProjectionImpl$worldToXY$2 = new FlatWorldProjectionImpl$worldToXY$2(this, continuationImpl);
        Object obj3 = flatWorldProjectionImpl$worldToXY$2.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flatWorldProjectionImpl$worldToXY$2.label;
        if (i != 0) {
        }
        return ((Projection) obj3).worldToXY(point, 30);
    }

    public final XYPoint c(zzs zzsVar) {
        XYPoint worldToXY;
        Projection projection = this.b;
        return (projection == null || (worldToXY = projection.worldToXY(ru.yandex.taxi.map.utils.a.F(zzsVar), 30)) == null) ? (XYPoint) tje.Y(EmptyCoroutineContext.a, new FlatWorldProjectionImpl$worldToXYBlocking$1(this, zzsVar, null)) : worldToXY;
    }

    public final XYPoint d(Point point) {
        XYPoint worldToXY;
        Projection projection = this.b;
        return (projection == null || (worldToXY = projection.worldToXY(point, 30)) == null) ? (XYPoint) tje.Y(EmptyCoroutineContext.a, new FlatWorldProjectionImpl$worldToXYBlocking$2(this, point, null)) : worldToXY;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(XYPoint xYPoint, ContinuationImpl continuationImpl) {
        FlatWorldProjectionImpl$xyToGeoPoint$1 flatWorldProjectionImpl$xyToGeoPoint$1;
        int i;
        if (continuationImpl instanceof FlatWorldProjectionImpl$xyToGeoPoint$1) {
            flatWorldProjectionImpl$xyToGeoPoint$1 = (FlatWorldProjectionImpl$xyToGeoPoint$1) continuationImpl;
            int i2 = flatWorldProjectionImpl$xyToGeoPoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flatWorldProjectionImpl$xyToGeoPoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = flatWorldProjectionImpl$xyToGeoPoint$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flatWorldProjectionImpl$xyToGeoPoint$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    flatWorldProjectionImpl$xyToGeoPoint$1.L$0 = null;
                    flatWorldProjectionImpl$xyToGeoPoint$1.label = 1;
                    obj = g(xYPoint, flatWorldProjectionImpl$xyToGeoPoint$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ru.yandex.taxi.map.utils.a.E((Point) obj, null);
            }
        }
        flatWorldProjectionImpl$xyToGeoPoint$1 = new FlatWorldProjectionImpl$xyToGeoPoint$1(this, continuationImpl);
        Object obj3 = flatWorldProjectionImpl$xyToGeoPoint$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flatWorldProjectionImpl$xyToGeoPoint$1.label;
        if (i != 0) {
        }
        return ru.yandex.taxi.map.utils.a.E((Point) obj3, null);
    }

    public final zzs f(XYPoint xYPoint) {
        Projection projection = this.b;
        if (projection != null) {
            return ru.yandex.taxi.map.utils.a.E(projection.xyToWorld(xYPoint, 30), null);
        }
        return (zzs) tje.Y(EmptyCoroutineContext.a, new FlatWorldProjectionImpl$xyToGeoPointBlocking$2(this, xYPoint, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(XYPoint xYPoint, ContinuationImpl continuationImpl) {
        FlatWorldProjectionImpl$xyToWorldPoint$1 flatWorldProjectionImpl$xyToWorldPoint$1;
        int i;
        if (continuationImpl instanceof FlatWorldProjectionImpl$xyToWorldPoint$1) {
            flatWorldProjectionImpl$xyToWorldPoint$1 = (FlatWorldProjectionImpl$xyToWorldPoint$1) continuationImpl;
            int i2 = flatWorldProjectionImpl$xyToWorldPoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flatWorldProjectionImpl$xyToWorldPoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = flatWorldProjectionImpl$xyToWorldPoint$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flatWorldProjectionImpl$xyToWorldPoint$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    flatWorldProjectionImpl$xyToWorldPoint$1.L$0 = xYPoint;
                    flatWorldProjectionImpl$xyToWorldPoint$1.label = 1;
                    obj = a(flatWorldProjectionImpl$xyToWorldPoint$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xYPoint = (XYPoint) flatWorldProjectionImpl$xyToWorldPoint$1.L$0;
                    kotlin.b.b(obj);
                }
                return ((Projection) obj).xyToWorld(xYPoint, 30);
            }
        }
        flatWorldProjectionImpl$xyToWorldPoint$1 = new FlatWorldProjectionImpl$xyToWorldPoint$1(this, continuationImpl);
        Object obj3 = flatWorldProjectionImpl$xyToWorldPoint$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flatWorldProjectionImpl$xyToWorldPoint$1.label;
        if (i != 0) {
        }
        return ((Projection) obj3).xyToWorld(xYPoint, 30);
    }
}
