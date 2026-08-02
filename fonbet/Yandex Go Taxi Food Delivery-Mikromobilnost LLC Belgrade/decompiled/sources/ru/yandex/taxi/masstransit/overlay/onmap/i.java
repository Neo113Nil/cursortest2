package ru.yandex.taxi.masstransit.overlay.onmap;

import com.yandex.mapkit.geometry.Point;
import defpackage.ah00;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.rol0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.y110;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class i {
    public final ah00 a;
    public final tt2 b;
    public final y110 c;
    public final rol0 d = com.yandex.go.coroutines.b.l(1000);
    public pzt0 e;

    public i(ah00 ah00Var, tt2 tt2Var, y110 y110Var) {
        this.a = ah00Var;
        this.b = tt2Var;
        this.c = y110Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r10 == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(i iVar, String str, Point point, Continuation continuation) {
        NearestTransportTrackingInteractor$focusOnStopAndVehicle$1 nearestTransportTrackingInteractor$focusOnStopAndVehicle$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Point point2;
        iVar.getClass();
        if (continuation instanceof NearestTransportTrackingInteractor$focusOnStopAndVehicle$1) {
            nearestTransportTrackingInteractor$focusOnStopAndVehicle$1 = (NearestTransportTrackingInteractor$focusOnStopAndVehicle$1) continuation;
            int i2 = nearestTransportTrackingInteractor$focusOnStopAndVehicle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nearestTransportTrackingInteractor$focusOnStopAndVehicle$1.label = i2 - Integer.MIN_VALUE;
                NearestTransportTrackingInteractor$focusOnStopAndVehicle$1 nearestTransportTrackingInteractor$focusOnStopAndVehicle$12 = nearestTransportTrackingInteractor$focusOnStopAndVehicle$1;
                Object obj = nearestTransportTrackingInteractor$focusOnStopAndVehicle$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nearestTransportTrackingInteractor$focusOnStopAndVehicle$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str == null) {
                        point2 = null;
                        Point point3 = point;
                        ah00 ah00Var = iVar.a;
                        tt2 tt2Var = iVar.b;
                        nearestTransportTrackingInteractor$focusOnStopAndVehicle$12.L$0 = null;
                        nearestTransportTrackingInteractor$focusOnStopAndVehicle$12.L$1 = null;
                        nearestTransportTrackingInteractor$focusOnStopAndVehicle$12.L$2 = null;
                        nearestTransportTrackingInteractor$focusOnStopAndVehicle$12.label = 2;
                        Object b = j.b(ah00Var, tt2Var, point3, point2, 1000.0f, nearestTransportTrackingInteractor$focusOnStopAndVehicle$12);
                        return b == coroutineSingletons ? coroutineSingletons : b;
                    }
                    y110 y110Var = iVar.c;
                    nearestTransportTrackingInteractor$focusOnStopAndVehicle$12.L$0 = null;
                    nearestTransportTrackingInteractor$focusOnStopAndVehicle$12.L$1 = point;
                    nearestTransportTrackingInteractor$focusOnStopAndVehicle$12.L$2 = null;
                    nearestTransportTrackingInteractor$focusOnStopAndVehicle$12.label = 1;
                    obj = j.a(y110Var, str, nearestTransportTrackingInteractor$focusOnStopAndVehicle$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    point = (Point) nearestTransportTrackingInteractor$focusOnStopAndVehicle$12.L$1;
                    kotlin.b.b(obj);
                }
                point2 = (Point) obj;
                Point point32 = point;
                ah00 ah00Var2 = iVar.a;
                tt2 tt2Var2 = iVar.b;
                nearestTransportTrackingInteractor$focusOnStopAndVehicle$12.L$0 = null;
                nearestTransportTrackingInteractor$focusOnStopAndVehicle$12.L$1 = null;
                nearestTransportTrackingInteractor$focusOnStopAndVehicle$12.L$2 = null;
                nearestTransportTrackingInteractor$focusOnStopAndVehicle$12.label = 2;
                Object b2 = j.b(ah00Var2, tt2Var2, point32, point2, 1000.0f, nearestTransportTrackingInteractor$focusOnStopAndVehicle$12);
                if (b2 == coroutineSingletons) {
                }
            }
        }
        nearestTransportTrackingInteractor$focusOnStopAndVehicle$1 = new NearestTransportTrackingInteractor$focusOnStopAndVehicle$1(iVar, continuation);
        NearestTransportTrackingInteractor$focusOnStopAndVehicle$1 nearestTransportTrackingInteractor$focusOnStopAndVehicle$122 = nearestTransportTrackingInteractor$focusOnStopAndVehicle$1;
        Object obj2 = nearestTransportTrackingInteractor$focusOnStopAndVehicle$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nearestTransportTrackingInteractor$focusOnStopAndVehicle$122.label;
        if (i != 0) {
        }
        point2 = (Point) obj2;
        Point point322 = point;
        ah00 ah00Var22 = iVar.a;
        tt2 tt2Var22 = iVar.b;
        nearestTransportTrackingInteractor$focusOnStopAndVehicle$122.L$0 = null;
        nearestTransportTrackingInteractor$focusOnStopAndVehicle$122.L$1 = null;
        nearestTransportTrackingInteractor$focusOnStopAndVehicle$122.L$2 = null;
        nearestTransportTrackingInteractor$focusOnStopAndVehicle$122.label = 2;
        Object b22 = j.b(ah00Var22, tt2Var22, point322, point2, 1000.0f, nearestTransportTrackingInteractor$focusOnStopAndVehicle$122);
        if (b22 == coroutineSingletons) {
        }
    }

    public final void b(tse tseVar, tpr tprVar, tpr tprVar2) {
        c();
        this.e = tje.N(tseVar, null, null, new NearestTransportTrackingInteractor$startTracking$1(this, tprVar, tprVar2, null), 3);
    }

    public final void c() {
        pzt0 pzt0Var = this.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }
}
