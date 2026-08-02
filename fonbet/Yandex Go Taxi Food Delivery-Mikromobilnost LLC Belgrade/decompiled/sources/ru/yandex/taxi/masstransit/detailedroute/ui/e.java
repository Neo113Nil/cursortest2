package ru.yandex.taxi.masstransit.detailedroute.ui;

import defpackage.ny61;
import defpackage.rw30;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class e implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ rw30 b;

    public e(r0 r0Var, rw30 rw30Var) {
        this.a = r0Var;
        this.b = rw30Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RouteToTransportRouteItemMapperImpl$updateLocalState$lambda$0$$inlined$map$1$1 routeToTransportRouteItemMapperImpl$updateLocalState$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof RouteToTransportRouteItemMapperImpl$updateLocalState$lambda$0$$inlined$map$1$1) {
            routeToTransportRouteItemMapperImpl$updateLocalState$lambda$0$$inlined$map$1$1 = (RouteToTransportRouteItemMapperImpl$updateLocalState$lambda$0$$inlined$map$1$1) continuation;
            int i2 = routeToTransportRouteItemMapperImpl$updateLocalState$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeToTransportRouteItemMapperImpl$updateLocalState$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeToTransportRouteItemMapperImpl$updateLocalState$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeToTransportRouteItemMapperImpl$updateLocalState$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    routeToTransportRouteItemMapperImpl$updateLocalState$lambda$0$$inlined$map$1$1.L$0 = null;
                    routeToTransportRouteItemMapperImpl$updateLocalState$lambda$0$$inlined$map$1$1.L$1 = null;
                    routeToTransportRouteItemMapperImpl$updateLocalState$lambda$0$$inlined$map$1$1.L$2 = null;
                    routeToTransportRouteItemMapperImpl$updateLocalState$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, routeToTransportRouteItemMapperImpl$updateLocalState$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        routeToTransportRouteItemMapperImpl$updateLocalState$lambda$0$$inlined$map$1$1 = new RouteToTransportRouteItemMapperImpl$updateLocalState$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = routeToTransportRouteItemMapperImpl$updateLocalState$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeToTransportRouteItemMapperImpl$updateLocalState$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
