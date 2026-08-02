package ru.yandex.taxi.linked_order.map;

import defpackage.cpy;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class p implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ cpy b;

    public p(tpr tprVar, cpy cpyVar) {
        this.a = tprVar;
        this.b = cpyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        LinkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$1 linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$1;
        int i;
        if (continuation instanceof LinkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$1) {
            linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$1 = (LinkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$1) continuation;
            int i2 = linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o oVar = new o(vprVar, this.b);
                    linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$1.L$0 = null;
                    linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$1.L$1 = null;
                    linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$1.L$2 = null;
                    linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$1.label = 1;
                    if (this.a.collect(oVar, linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$1) == coroutineSingletons) {
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
        linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$1 = new LinkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$1(this, continuation);
        Object obj2 = linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
