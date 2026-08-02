package ru.yandex.taxi.logistics.deliveries.map.android;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.Subpolyline;
import defpackage.bvf0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qfl0;
import defpackage.tse;
import defpackage.w4e0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.deliveries.map.android.RouteWayOnMap$draw$1$1", f = "RouteWayOnMap.kt", l = {50}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class RouteWayOnMap$draw$1$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ qfl0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteWayOnMap$draw$1$1(qfl0 qfl0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qfl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RouteWayOnMap$draw$1$1 routeWayOnMap$draw$1$1 = new RouteWayOnMap$draw$1$1(this.this$0, continuation);
        routeWayOnMap$draw$1$1.L$0 = obj;
        return routeWayOnMap$draw$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteWayOnMap$draw$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:5:0x002e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w4e0 w4e0Var;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            if (bvf0.D(tseVar)) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            qfl0 qfl0Var = this.this$0;
            PolylinePosition polylinePosition = qfl0Var.j;
            DrivingRoute drivingRoute = qfl0Var.k;
            if (polylinePosition != null && drivingRoute != null && (polylinePosition.getSegmentIndex() != drivingRoute.getPosition().getSegmentIndex() || polylinePosition.getSegmentPosition() != drivingRoute.getPosition().getSegmentPosition())) {
                this.this$0.j = drivingRoute.getPosition();
                jst.e.getClass();
                qfl0 qfl0Var2 = this.this$0;
                PolylinePosition position = drivingRoute.getPosition();
                qfl0 qfl0Var3 = this.this$0;
                w4e0Var = qfl0Var3.g;
                if (w4e0Var == null) {
                    w4e0Var = qfl0Var3.b(drivingRoute);
                } else if (!jl40.l(qfl0Var3.h, drivingRoute.getRouteId())) {
                    w4e0Var = qfl0Var3.b(drivingRoute);
                }
                qfl0Var3.h = drivingRoute.getRouteId();
                qfl0Var2.getClass();
                w4e0Var.r(Collections.singletonList(new Subpolyline(new PolylinePosition(0, 0.0d), position)));
            }
            if (bvf0.D(tseVar)) {
                this.L$0 = tseVar;
                this.label = 1;
                if (kotlinx.coroutines.a.i(50L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                qfl0 qfl0Var4 = this.this$0;
                PolylinePosition polylinePosition2 = qfl0Var4.j;
                DrivingRoute drivingRoute2 = qfl0Var4.k;
                if (polylinePosition2 != null) {
                    this.this$0.j = drivingRoute2.getPosition();
                    jst.e.getClass();
                    qfl0 qfl0Var22 = this.this$0;
                    PolylinePosition position2 = drivingRoute2.getPosition();
                    qfl0 qfl0Var32 = this.this$0;
                    w4e0Var = qfl0Var32.g;
                    if (w4e0Var == null) {
                    }
                    qfl0Var32.h = drivingRoute2.getRouteId();
                    qfl0Var22.getClass();
                    w4e0Var.r(Collections.singletonList(new Subpolyline(new PolylinePosition(0, 0.0d), position2)));
                }
                if (bvf0.D(tseVar)) {
                    return zy11.a;
                }
            }
        }
    }
}
