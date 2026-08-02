package ru.yandex.taxi.preorder.map;

import defpackage.fnx0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ n b;

    public l(vpr vprVar, n nVar) {
        this.a = vprVar;
        this.b = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RouteOverlayIconHolder$special$$inlined$map$1$2$1 routeOverlayIconHolder$special$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof RouteOverlayIconHolder$special$$inlined$map$1$2$1) {
            routeOverlayIconHolder$special$$inlined$map$1$2$1 = (RouteOverlayIconHolder$special$$inlined$map$1$2$1) continuation;
            int i2 = routeOverlayIconHolder$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeOverlayIconHolder$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = routeOverlayIconHolder$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeOverlayIconHolder$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.go.taxi.summary.map.clarify_source_point.interactor.a aVar = this.b.n;
                    String str = ((fnx0) obj).c.b;
                    routeOverlayIconHolder$special$$inlined$map$1$2$1.L$0 = null;
                    routeOverlayIconHolder$special$$inlined$map$1$2$1.L$1 = null;
                    routeOverlayIconHolder$special$$inlined$map$1$2$1.L$2 = null;
                    routeOverlayIconHolder$special$$inlined$map$1$2$1.L$3 = null;
                    vprVar = this.a;
                    routeOverlayIconHolder$special$$inlined$map$1$2$1.L$4 = vprVar;
                    routeOverlayIconHolder$special$$inlined$map$1$2$1.L$5 = null;
                    routeOverlayIconHolder$special$$inlined$map$1$2$1.L$6 = null;
                    routeOverlayIconHolder$special$$inlined$map$1$2$1.label = 1;
                    obj2 = aVar.b(str, routeOverlayIconHolder$special$$inlined$map$1$2$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) routeOverlayIconHolder$special$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                routeOverlayIconHolder$special$$inlined$map$1$2$1.L$0 = null;
                routeOverlayIconHolder$special$$inlined$map$1$2$1.L$1 = null;
                routeOverlayIconHolder$special$$inlined$map$1$2$1.L$2 = null;
                routeOverlayIconHolder$special$$inlined$map$1$2$1.L$3 = null;
                routeOverlayIconHolder$special$$inlined$map$1$2$1.L$4 = null;
                routeOverlayIconHolder$special$$inlined$map$1$2$1.L$5 = null;
                routeOverlayIconHolder$special$$inlined$map$1$2$1.L$6 = null;
                routeOverlayIconHolder$special$$inlined$map$1$2$1.label = 2;
            }
        }
        routeOverlayIconHolder$special$$inlined$map$1$2$1 = new RouteOverlayIconHolder$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = routeOverlayIconHolder$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeOverlayIconHolder$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        routeOverlayIconHolder$special$$inlined$map$1$2$1.L$0 = null;
        routeOverlayIconHolder$special$$inlined$map$1$2$1.L$1 = null;
        routeOverlayIconHolder$special$$inlined$map$1$2$1.L$2 = null;
        routeOverlayIconHolder$special$$inlined$map$1$2$1.L$3 = null;
        routeOverlayIconHolder$special$$inlined$map$1$2$1.L$4 = null;
        routeOverlayIconHolder$special$$inlined$map$1$2$1.L$5 = null;
        routeOverlayIconHolder$special$$inlined$map$1$2$1.L$6 = null;
        routeOverlayIconHolder$special$$inlined$map$1$2$1.label = 2;
    }
}
