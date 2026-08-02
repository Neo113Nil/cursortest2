package ru.yandex.taxi.scooters.presentation.detailed_order;

import defpackage.b2k;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class d implements tpr {
    public final /* synthetic */ b2k a;

    public d(b2k b2kVar) {
        this.a = b2kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersDetailedOrderRouter$launchMtRouteOverlay$$inlined$map$1$1 scootersDetailedOrderRouter$launchMtRouteOverlay$$inlined$map$1$1;
        int i;
        if (continuation instanceof ScootersDetailedOrderRouter$launchMtRouteOverlay$$inlined$map$1$1) {
            scootersDetailedOrderRouter$launchMtRouteOverlay$$inlined$map$1$1 = (ScootersDetailedOrderRouter$launchMtRouteOverlay$$inlined$map$1$1) continuation;
            int i2 = scootersDetailedOrderRouter$launchMtRouteOverlay$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDetailedOrderRouter$launchMtRouteOverlay$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDetailedOrderRouter$launchMtRouteOverlay$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDetailedOrderRouter$launchMtRouteOverlay$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar);
                    scootersDetailedOrderRouter$launchMtRouteOverlay$$inlined$map$1$1.L$0 = null;
                    scootersDetailedOrderRouter$launchMtRouteOverlay$$inlined$map$1$1.L$1 = null;
                    scootersDetailedOrderRouter$launchMtRouteOverlay$$inlined$map$1$1.L$2 = null;
                    scootersDetailedOrderRouter$launchMtRouteOverlay$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, scootersDetailedOrderRouter$launchMtRouteOverlay$$inlined$map$1$1) == coroutineSingletons) {
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
        scootersDetailedOrderRouter$launchMtRouteOverlay$$inlined$map$1$1 = new ScootersDetailedOrderRouter$launchMtRouteOverlay$$inlined$map$1$1(this, continuation);
        Object obj2 = scootersDetailedOrderRouter$launchMtRouteOverlay$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDetailedOrderRouter$launchMtRouteOverlay$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
