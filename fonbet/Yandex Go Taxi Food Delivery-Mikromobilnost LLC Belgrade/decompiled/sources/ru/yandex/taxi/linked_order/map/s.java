package ru.yandex.taxi.linked_order.map;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import defpackage.cpy;
import defpackage.m201;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class s implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ cpy b;

    public s(vpr vprVar, cpy cpyVar) {
        this.a = vprVar;
        this.b = cpyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LinkedOrderRouteProgressTracker$startTracker$$inlined$mapNotNull$1$2$1 linkedOrderRouteProgressTracker$startTracker$$inlined$mapNotNull$1$2$1;
        int i;
        Pair pair;
        if (continuation instanceof LinkedOrderRouteProgressTracker$startTracker$$inlined$mapNotNull$1$2$1) {
            linkedOrderRouteProgressTracker$startTracker$$inlined$mapNotNull$1$2$1 = (LinkedOrderRouteProgressTracker$startTracker$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = linkedOrderRouteProgressTracker$startTracker$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkedOrderRouteProgressTracker$startTracker$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = linkedOrderRouteProgressTracker$startTracker$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkedOrderRouteProgressTracker$startTracker$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    m201 m201Var = (m201) obj;
                    zzs zzsVar = m201Var.a.a;
                    if (zzsVar != null) {
                        this.b.h = zzsVar;
                        Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                        pair = new Pair(new Point(zzsVar.a, zzsVar.b), m201Var.b);
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        linkedOrderRouteProgressTracker$startTracker$$inlined$mapNotNull$1$2$1.L$0 = null;
                        linkedOrderRouteProgressTracker$startTracker$$inlined$mapNotNull$1$2$1.L$1 = null;
                        linkedOrderRouteProgressTracker$startTracker$$inlined$mapNotNull$1$2$1.L$2 = null;
                        linkedOrderRouteProgressTracker$startTracker$$inlined$mapNotNull$1$2$1.L$3 = null;
                        linkedOrderRouteProgressTracker$startTracker$$inlined$mapNotNull$1$2$1.L$4 = null;
                        linkedOrderRouteProgressTracker$startTracker$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(pair, linkedOrderRouteProgressTracker$startTracker$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        linkedOrderRouteProgressTracker$startTracker$$inlined$mapNotNull$1$2$1 = new LinkedOrderRouteProgressTracker$startTracker$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = linkedOrderRouteProgressTracker$startTracker$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkedOrderRouteProgressTracker$startTracker$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
