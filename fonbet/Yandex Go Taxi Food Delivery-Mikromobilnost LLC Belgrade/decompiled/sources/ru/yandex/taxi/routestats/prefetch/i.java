package ru.yandex.taxi.routestats.prefetch;

import defpackage.boe0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ boe0 b;

    public i(vpr vprVar, boe0 boe0Var) {
        this.a = vprVar;
        this.b = boe0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RouteStatsPrefetchListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$map$3$2$1 routeStatsPrefetchListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$map$3$2$1;
        int i;
        if (continuation instanceof RouteStatsPrefetchListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$map$3$2$1) {
            routeStatsPrefetchListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$map$3$2$1 = (RouteStatsPrefetchListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$map$3$2$1) continuation;
            int i2 = routeStatsPrefetchListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$map$3$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeStatsPrefetchListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$map$3$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = routeStatsPrefetchListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$map$3$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeStatsPrefetchListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$map$3$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List A0 = kotlin.collections.a.A0((List) obj, this.b.a);
                    routeStatsPrefetchListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$map$3$2$1.L$0 = null;
                    routeStatsPrefetchListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$map$3$2$1.L$1 = null;
                    routeStatsPrefetchListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$map$3$2$1.L$2 = null;
                    routeStatsPrefetchListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$map$3$2$1.L$3 = null;
                    routeStatsPrefetchListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$map$3$2$1.label = 1;
                    if (this.a.emit(A0, routeStatsPrefetchListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$map$3$2$1) == coroutineSingletons) {
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
        routeStatsPrefetchListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$map$3$2$1 = new RouteStatsPrefetchListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$map$3$2$1(this, continuation);
        Object obj22 = routeStatsPrefetchListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$map$3$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeStatsPrefetchListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$map$3$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
