package ru.yandex.taxi.preorder.map;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class m implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ n b;

    public m(mth mthVar, n nVar) {
        this.a = mthVar;
        this.b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RouteOverlayIconHolder$special$$inlined$map$1$1 routeOverlayIconHolder$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof RouteOverlayIconHolder$special$$inlined$map$1$1) {
            routeOverlayIconHolder$special$$inlined$map$1$1 = (RouteOverlayIconHolder$special$$inlined$map$1$1) continuation;
            int i2 = routeOverlayIconHolder$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeOverlayIconHolder$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeOverlayIconHolder$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeOverlayIconHolder$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l lVar = new l(vprVar, this.b);
                    routeOverlayIconHolder$special$$inlined$map$1$1.L$0 = null;
                    routeOverlayIconHolder$special$$inlined$map$1$1.L$1 = null;
                    routeOverlayIconHolder$special$$inlined$map$1$1.L$2 = null;
                    routeOverlayIconHolder$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(lVar, routeOverlayIconHolder$special$$inlined$map$1$1) == coroutineSingletons) {
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
        routeOverlayIconHolder$special$$inlined$map$1$1 = new RouteOverlayIconHolder$special$$inlined$map$1$1(this, continuation);
        Object obj2 = routeOverlayIconHolder$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeOverlayIconHolder$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
