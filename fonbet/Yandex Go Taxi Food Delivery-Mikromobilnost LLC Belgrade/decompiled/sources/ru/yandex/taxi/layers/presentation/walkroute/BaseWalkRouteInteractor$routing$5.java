package ru.yandex.taxi.layers.presentation.walkroute;

import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.u641;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/mapkit/transport/masstransit/Route;", "route", "Lzy11;", "<anonymous>", "(Lcom/yandex/mapkit/transport/masstransit/Route;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.walkroute.BaseWalkRouteInteractor$routing$5", f = "BaseWalkRouteInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BaseWalkRouteInteractor$routing$5 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWalkRouteInteractor$routing$5(Continuation continuation, e eVar) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseWalkRouteInteractor$routing$5 baseWalkRouteInteractor$routing$5 = new BaseWalkRouteInteractor$routing$5(continuation, this.this$0);
        baseWalkRouteInteractor$routing$5.L$0 = obj;
        return baseWalkRouteInteractor$routing$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BaseWalkRouteInteractor$routing$5 baseWalkRouteInteractor$routing$5 = (BaseWalkRouteInteractor$routing$5) create((Route) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        baseWalkRouteInteractor$routing$5.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Route route = (Route) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (route != null) {
            u641.a(this.this$0.d, null, route.getGeometry().getPoints(), 3);
        }
        return zy11.a;
    }
}
