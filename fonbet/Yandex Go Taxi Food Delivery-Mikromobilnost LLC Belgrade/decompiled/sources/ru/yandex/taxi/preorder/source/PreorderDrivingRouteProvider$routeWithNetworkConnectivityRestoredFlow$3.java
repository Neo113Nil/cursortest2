package ru.yandex.taxi.preorder.source;

import defpackage.d0l0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld0l0;", "route", "Lzy11;", "<unused var>", "<anonymous>", "(Lru/yandex/taxi/object/Route;V)Lru/yandex/taxi/object/Route;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.PreorderDrivingRouteProvider$routeWithNetworkConnectivityRestoredFlow$3", f = "PreorderDrivingRouteProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PreorderDrivingRouteProvider$routeWithNetworkConnectivityRestoredFlow$3 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PreorderDrivingRouteProvider$routeWithNetworkConnectivityRestoredFlow$3 preorderDrivingRouteProvider$routeWithNetworkConnectivityRestoredFlow$3 = new PreorderDrivingRouteProvider$routeWithNetworkConnectivityRestoredFlow$3(3, (Continuation) obj3);
        preorderDrivingRouteProvider$routeWithNetworkConnectivityRestoredFlow$3.L$0 = (d0l0) obj;
        return preorderDrivingRouteProvider$routeWithNetworkConnectivityRestoredFlow$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d0l0 d0l0Var = (d0l0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return d0l0Var;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
