package ru.yandex.taxi.masstransit.stoproute.interactor;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.x3l0;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public h(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r6 == null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtStopRouteMapController$initMap$$inlined$map$4$2$1 mtStopRouteMapController$initMap$$inlined$map$4$2$1;
        int i;
        List singletonList;
        if (continuation instanceof MtStopRouteMapController$initMap$$inlined$map$4$2$1) {
            mtStopRouteMapController$initMap$$inlined$map$4$2$1 = (MtStopRouteMapController$initMap$$inlined$map$4$2$1) continuation;
            int i2 = mtStopRouteMapController$initMap$$inlined$map$4$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtStopRouteMapController$initMap$$inlined$map$4$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtStopRouteMapController$initMap$$inlined$map$4$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtStopRouteMapController$initMap$$inlined$map$4$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    x3l0 x3l0Var = (x3l0) obj;
                    if (x3l0Var != null && (singletonList = x3l0Var.g) != null) {
                        if (singletonList.isEmpty()) {
                            singletonList = null;
                        }
                    }
                    singletonList = Collections.singletonList(this.b);
                    mtStopRouteMapController$initMap$$inlined$map$4$2$1.L$0 = null;
                    mtStopRouteMapController$initMap$$inlined$map$4$2$1.L$1 = null;
                    mtStopRouteMapController$initMap$$inlined$map$4$2$1.L$2 = null;
                    mtStopRouteMapController$initMap$$inlined$map$4$2$1.L$3 = null;
                    mtStopRouteMapController$initMap$$inlined$map$4$2$1.label = 1;
                    if (this.a.emit(singletonList, mtStopRouteMapController$initMap$$inlined$map$4$2$1) == coroutineSingletons) {
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
        mtStopRouteMapController$initMap$$inlined$map$4$2$1 = new MtStopRouteMapController$initMap$$inlined$map$4$2$1(this, continuation);
        Object obj22 = mtStopRouteMapController$initMap$$inlined$map$4$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtStopRouteMapController$initMap$$inlined$map$4$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
