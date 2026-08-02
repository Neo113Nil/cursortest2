package ru.yandex.taxi.linked_order.map;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import defpackage.cpy;
import defpackage.h8l0;
import defpackage.ny61;
import defpackage.ool0;
import defpackage.vpr;
import defpackage.x4s0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class o implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ cpy b;

    public o(vpr vprVar, cpy cpyVar) {
        this.a = vprVar;
        this.b = cpyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LinkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$2$1 linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof LinkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$2$1) {
            linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$2$1 = (LinkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$2$1) continuation;
            int i2 = linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    h8l0 h8l0Var = (h8l0) obj;
                    PolylinePosition polylinePosition = h8l0Var.b;
                    ool0 ool0Var = h8l0Var.a;
                    if (polylinePosition == null) {
                        cpy cpyVar = this.b;
                        x4s0 x4s0Var = cpyVar.e;
                        Polyline geometry = ool0Var.getGeometry();
                        PolylinePosition polylinePosition2 = cpyVar.i;
                        zzs zzsVar = cpyVar.h;
                        x4s0Var.getClass();
                        h8l0Var = new h8l0(ool0Var, x4s0.a(geometry, polylinePosition2, zzsVar));
                    }
                    linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$2$1.L$0 = null;
                    linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$2$1.L$1 = null;
                    linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$2$1.L$2 = null;
                    linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$2$1.L$3 = null;
                    linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(h8l0Var, linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$2$1) == coroutineSingletons) {
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
        linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$2$1 = new LinkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$2$1(this, continuation);
        Object obj22 = linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
