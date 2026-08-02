package ru.yandex.taxi.logistics.sdk.screen_route_list.ui;

import defpackage.a6l0;
import defpackage.e0l0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.z5l0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ a6l0 b;

    public a(vpr vprVar, a6l0 a6l0Var) {
        this.a = vprVar;
        this.b = a6l0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RouteListViewModel$special$$inlined$map$1$2$1 routeListViewModel$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof RouteListViewModel$special$$inlined$map$1$2$1) {
            routeListViewModel$special$$inlined$map$1$2$1 = (RouteListViewModel$special$$inlined$map$1$2$1) continuation;
            int i2 = routeListViewModel$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeListViewModel$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = routeListViewModel$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeListViewModel$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    b.b(obj2);
                    e0l0 e0l0Var = (e0l0) obj;
                    int size = e0l0Var.a.size();
                    a6l0 a6l0Var = this.b;
                    if (size < 2) {
                        a6l0Var.c.a.dismiss();
                    }
                    z5l0 W = a6l0Var.W(e0l0Var);
                    routeListViewModel$special$$inlined$map$1$2$1.L$0 = null;
                    routeListViewModel$special$$inlined$map$1$2$1.L$1 = null;
                    routeListViewModel$special$$inlined$map$1$2$1.L$2 = null;
                    routeListViewModel$special$$inlined$map$1$2$1.L$3 = null;
                    routeListViewModel$special$$inlined$map$1$2$1.I$0 = 0;
                    routeListViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(W, routeListViewModel$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                return zy11.a;
            }
        }
        routeListViewModel$special$$inlined$map$1$2$1 = new RouteListViewModel$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = routeListViewModel$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeListViewModel$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
