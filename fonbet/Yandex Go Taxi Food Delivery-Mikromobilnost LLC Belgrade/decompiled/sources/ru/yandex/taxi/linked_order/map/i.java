package ru.yandex.taxi.linked_order.map;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.PolylinePosition;
import defpackage.cpy;
import defpackage.g20;
import defpackage.h8l0;
import defpackage.iwa1;
import defpackage.ny61;
import defpackage.srb1;
import defpackage.t1s;
import defpackage.u1s;
import defpackage.vpr;
import defpackage.yoy;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ cpy b;

    public i(vpr vprVar, cpy cpyVar) {
        this.a = vprVar;
        this.b = cpyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LinkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$filter$1$2$1 linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$filter$1$2$1;
        int i;
        h8l0 h8l0Var;
        PolylinePosition polylinePosition;
        Object obj2;
        if (continuation instanceof LinkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$filter$1$2$1) {
            linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$filter$1$2$1 = (LinkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$filter$1$2$1) continuation;
            int i2 = linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    zzs zzsVar = (zzs) obj;
                    cpy cpyVar = this.b;
                    t1s t1sVar = cpyVar.f;
                    yoy yoyVar = cpyVar.j;
                    u1s u1sVar = (u1s) t1sVar.c;
                    if (t1sVar.b) {
                        t1sVar.b = false;
                        obj2 = null;
                    } else if (u1sVar.a) {
                        if (u1sVar.b <= (System.currentTimeMillis() - t1sVar.a) / 1000) {
                            g20 g20Var = yoyVar instanceof g20 ? (g20) yoyVar : null;
                            if (g20Var != null && (h8l0Var = g20Var.a) != null && (polylinePosition = h8l0Var.b) != null) {
                                Point b = iwa1.b(((g20) yoyVar).a.a.getGeometry(), polylinePosition);
                                if ((b != null ? srb1.c(b.getLatitude(), b.getLongitude(), zzsVar.a, zzsVar.b) : 0.0d) > u1sVar.c) {
                                    t1sVar.a = System.currentTimeMillis();
                                    obj2 = null;
                                }
                            }
                        }
                    }
                    linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$filter$1$2$1.L$0 = obj2;
                    linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$filter$1$2$1.L$1 = obj2;
                    linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$filter$1$2$1.L$2 = obj2;
                    linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$filter$1$2$1.L$3 = obj2;
                    linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$filter$1$2$1.label = 1;
                    if (this.a.emit(obj, linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$filter$1$2$1 = new LinkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$filter$1$2$1(this, continuation);
        Object obj32 = linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
