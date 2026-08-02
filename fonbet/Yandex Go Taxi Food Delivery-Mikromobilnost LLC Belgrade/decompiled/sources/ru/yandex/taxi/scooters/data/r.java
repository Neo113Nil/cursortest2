package ru.yandex.taxi.scooters.data;

import com.yandex.mapkit.navigation.transport.Navigation;
import defpackage.iyn;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.x950;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class r implements vpr {
    public final /* synthetic */ vpr a;

    public r(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersNavigationRouteGuidanceRepository$special$$inlined$map$1$2$1 scootersNavigationRouteGuidanceRepository$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ScootersNavigationRouteGuidanceRepository$special$$inlined$map$1$2$1) {
            scootersNavigationRouteGuidanceRepository$special$$inlined$map$1$2$1 = (ScootersNavigationRouteGuidanceRepository$special$$inlined$map$1$2$1) continuation;
            int i2 = scootersNavigationRouteGuidanceRepository$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersNavigationRouteGuidanceRepository$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersNavigationRouteGuidanceRepository$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersNavigationRouteGuidanceRepository$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    x950 x950Var = (x950) obj;
                    iyn iynVar = x950Var instanceof iyn ? (iyn) x950Var : null;
                    Navigation navigation = iynVar != null ? iynVar.a : null;
                    scootersNavigationRouteGuidanceRepository$special$$inlined$map$1$2$1.L$0 = null;
                    scootersNavigationRouteGuidanceRepository$special$$inlined$map$1$2$1.L$1 = null;
                    scootersNavigationRouteGuidanceRepository$special$$inlined$map$1$2$1.L$2 = null;
                    scootersNavigationRouteGuidanceRepository$special$$inlined$map$1$2$1.L$3 = null;
                    scootersNavigationRouteGuidanceRepository$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(navigation, scootersNavigationRouteGuidanceRepository$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        scootersNavigationRouteGuidanceRepository$special$$inlined$map$1$2$1 = new ScootersNavigationRouteGuidanceRepository$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersNavigationRouteGuidanceRepository$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersNavigationRouteGuidanceRepository$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
