package ru.yandex.taxi.preorder.map;

import defpackage.ab00;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class g implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ n b;

    public g(tpr[] tprVarArr, n nVar) {
        this.a = tprVarArr;
        this.b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RouteOverlayIconHolder$sourceIconResultFlow$$inlined$combine$1$1 routeOverlayIconHolder$sourceIconResultFlow$$inlined$combine$1$1;
        int i;
        if (continuation instanceof RouteOverlayIconHolder$sourceIconResultFlow$$inlined$combine$1$1) {
            routeOverlayIconHolder$sourceIconResultFlow$$inlined$combine$1$1 = (RouteOverlayIconHolder$sourceIconResultFlow$$inlined$combine$1$1) continuation;
            int i2 = routeOverlayIconHolder$sourceIconResultFlow$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeOverlayIconHolder$sourceIconResultFlow$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeOverlayIconHolder$sourceIconResultFlow$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeOverlayIconHolder$sourceIconResultFlow$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    ab00 ab00Var = new ab00(tprVarArr, 15);
                    RouteOverlayIconHolder$sourceIconResultFlow$$inlined$combine$1$3 routeOverlayIconHolder$sourceIconResultFlow$$inlined$combine$1$3 = new RouteOverlayIconHolder$sourceIconResultFlow$$inlined$combine$1$3(null, this.b);
                    routeOverlayIconHolder$sourceIconResultFlow$$inlined$combine$1$1.L$0 = null;
                    routeOverlayIconHolder$sourceIconResultFlow$$inlined$combine$1$1.L$1 = null;
                    routeOverlayIconHolder$sourceIconResultFlow$$inlined$combine$1$1.L$2 = null;
                    routeOverlayIconHolder$sourceIconResultFlow$$inlined$combine$1$1.label = 1;
                    if (kotlinx.coroutines.flow.internal.j.a(vprVar, ab00Var, routeOverlayIconHolder$sourceIconResultFlow$$inlined$combine$1$3, routeOverlayIconHolder$sourceIconResultFlow$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        routeOverlayIconHolder$sourceIconResultFlow$$inlined$combine$1$1 = new RouteOverlayIconHolder$sourceIconResultFlow$$inlined$combine$1$1(this, continuation);
        Object obj2 = routeOverlayIconHolder$sourceIconResultFlow$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeOverlayIconHolder$sourceIconResultFlow$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
