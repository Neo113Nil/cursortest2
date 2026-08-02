package ru.yandex.taxi.masstransit.stoproute.interactor;

import com.yandex.mapkit.geometry.Point;
import defpackage.ny61;
import defpackage.v3l0;
import defpackage.vpr;
import defpackage.x3l0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtStopRouteMapController$initMap$$inlined$map$2$2$1 mtStopRouteMapController$initMap$$inlined$map$2$2$1;
        int i;
        Object obj2;
        if (continuation instanceof MtStopRouteMapController$initMap$$inlined$map$2$2$1) {
            mtStopRouteMapController$initMap$$inlined$map$2$2$1 = (MtStopRouteMapController$initMap$$inlined$map$2$2$1) continuation;
            int i2 = mtStopRouteMapController$initMap$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtStopRouteMapController$initMap$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = mtStopRouteMapController$initMap$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtStopRouteMapController$initMap$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Iterator it = ((x3l0) obj).c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((v3l0) obj2).c) {
                            break;
                        }
                    }
                    v3l0 v3l0Var = (v3l0) obj2;
                    Point point = v3l0Var != null ? v3l0Var.e : null;
                    mtStopRouteMapController$initMap$$inlined$map$2$2$1.L$0 = null;
                    mtStopRouteMapController$initMap$$inlined$map$2$2$1.L$1 = null;
                    mtStopRouteMapController$initMap$$inlined$map$2$2$1.L$2 = null;
                    mtStopRouteMapController$initMap$$inlined$map$2$2$1.L$3 = null;
                    mtStopRouteMapController$initMap$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(point, mtStopRouteMapController$initMap$$inlined$map$2$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        mtStopRouteMapController$initMap$$inlined$map$2$2$1 = new MtStopRouteMapController$initMap$$inlined$map$2$2$1(this, continuation);
        Object obj32 = mtStopRouteMapController$initMap$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtStopRouteMapController$initMap$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
