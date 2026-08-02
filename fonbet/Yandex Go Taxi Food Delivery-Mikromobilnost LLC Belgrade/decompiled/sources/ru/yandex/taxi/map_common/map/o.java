package ru.yandex.taxi.map_common.map;

import com.yandex.mapkit.RequestPointType;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.directions.driving.DrivingRouteMetadata;
import com.yandex.mapkit.directions.driving.DrivingSession;
import com.yandex.mapkit.directions.driving.Flags;
import com.yandex.mapkit.directions.driving.VehicleType;
import com.yandex.mapkit.directions.driving.Weight;
import defpackage.bvf0;
import defpackage.cv00;
import defpackage.el00;
import defpackage.hst;
import defpackage.ike;
import defpackage.jst;
import defpackage.ke00;
import defpackage.nlm;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.uhs0;
import defpackage.uyj;
import defpackage.vlm;
import defpackage.zzs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class o implements cv00 {
    public final el00 a;
    public final vlm b;
    public ike c;
    public DrivingSession d;
    public nlm e;
    public pzt0 f;

    public o(el00 el00Var, vlm vlmVar) {
        this.a = el00Var;
        this.b = vlmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(o oVar, zzs zzsVar, ContinuationImpl continuationImpl) {
        MapkitDrivingRouterImpl$createRequestPoint$1 mapkitDrivingRouterImpl$createRequestPoint$1;
        int i;
        Object m;
        Throwable a;
        oVar.getClass();
        if (continuationImpl instanceof MapkitDrivingRouterImpl$createRequestPoint$1) {
            mapkitDrivingRouterImpl$createRequestPoint$1 = (MapkitDrivingRouterImpl$createRequestPoint$1) continuationImpl;
            int i2 = mapkitDrivingRouterImpl$createRequestPoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapkitDrivingRouterImpl$createRequestPoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapkitDrivingRouterImpl$createRequestPoint$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapkitDrivingRouterImpl$createRequestPoint$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    double d = zzsVar.a;
                    double d2 = zzsVar.b;
                    if (Math.abs(d) > Double.MAX_VALUE || Math.abs(d2) > Double.MAX_VALUE || -90.0d > d || d > 90.0d || -180.0d > d2 || d2 > 180.0d) {
                        hst hstVar = jst.e;
                        ke00 a2 = hstVar.b.a();
                        if (a2 != null && a2.b(15)) {
                            StringBuilder u = oyr.u(d, "Invalid coordinates lat=", ", lon=");
                            u.append(d2);
                            a2.a(15, "MapKitDrivingRouter:createRequestPoint", null, u.toString(), hstVar.a);
                        }
                        return null;
                    }
                    el00 el00Var = oVar.a;
                    RequestPointType requestPointType = RequestPointType.WAYPOINT;
                    mapkitDrivingRouterImpl$createRequestPoint$1.L$0 = null;
                    mapkitDrivingRouterImpl$createRequestPoint$1.label = 1;
                    m = k.m(el00Var, zzsVar, requestPointType, "", mapkitDrivingRouterImpl$createRequestPoint$1);
                    if (m == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    m = ((Result) obj).getValue();
                }
                a = Result.a(m);
                if (a != null) {
                    jst.e.k(a, "MapKitDrivingRouter:createRequestPoint");
                }
                if (m instanceof Result.Failure) {
                    return m;
                }
                return null;
            }
        }
        mapkitDrivingRouterImpl$createRequestPoint$1 = new MapkitDrivingRouterImpl$createRequestPoint$1(oVar, continuationImpl);
        Object obj2 = mapkitDrivingRouterImpl$createRequestPoint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapkitDrivingRouterImpl$createRequestPoint$1.label;
        if (i != 0) {
        }
        a = Result.a(m);
        if (a != null) {
        }
        if (m instanceof Result.Failure) {
        }
    }

    public static final void c(o oVar, List list) {
        oVar.getClass();
        if (list.isEmpty()) {
            oVar.e("Empty driving routes");
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            DrivingRouteMetadata metadata = ((DrivingRoute) list.get(i)).getMetadata();
            Weight weight = metadata.getWeight();
            Flags flags = metadata.getFlags();
            hst hstVar = jst.e;
            weight.getTimeWithTraffic().getText();
            flags.getHasTolls();
            hstVar.getClass();
        }
        nlm nlmVar = oVar.e;
        if (nlmVar != null) {
            nlmVar.e(list);
        }
    }

    public final void d() {
        ike ikeVar = this.c;
        if (ikeVar != null) {
            bvf0.j(ikeVar, null);
        }
        this.c = null;
        DrivingSession drivingSession = this.d;
        if (drivingSession != null) {
            drivingSession.cancel();
        }
        this.d = null;
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.f = null;
        nlm nlmVar = this.e;
        if (nlmVar != null) {
            nlmVar.a();
        }
        this.e = null;
    }

    public final void e(String str) {
        IOException iOException = new IOException(str);
        jst.e.k(iOException, "Exception during route querying");
        nlm nlmVar = this.e;
        if (nlmVar != null) {
            nlmVar.d(iOException);
        }
    }

    public final void f(List list, Boolean bool, nlm nlmVar, Integer num, Double d, VehicleType vehicleType) {
        DrivingSession drivingSession = this.d;
        if (drivingSession != null) {
            drivingSession.cancel();
        }
        this.d = null;
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.f = null;
        nlm nlmVar2 = this.e;
        if (nlmVar2 != null) {
            nlmVar2.a();
        }
        if (list.size() < 2) {
            nlmVar.d(new IOException("Can't build a drive route - not enough points"));
            return;
        }
        List M = kotlin.collections.a.M(list);
        if (((ArrayList) M).size() < 2) {
            nlmVar.d(new IOException("Can't build a drive route - all points are null(s)"));
            return;
        }
        this.e = nlmVar;
        ike ikeVar = this.c;
        if (ikeVar == null) {
            ikeVar = bvf0.a(uyj.b);
            this.c = ikeVar;
        }
        this.f = tje.N(ikeVar, null, null, new MapkitDrivingRouterImpl$query$1(M, nlmVar, this, bool, d, num, vehicleType, null), 3);
    }

    public final void g(List list, Boolean bool, uhs0 uhs0Var, Double d) {
        f(list, bool, uhs0Var, 1, d, VehicleType.TAXI);
    }
}
