package ru.yandex.taxi.layers.presentation.walkroute;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.u641;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Pair;", "Lzzs;", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.walkroute.BaseWalkRouteInteractor$userAndObjectTracking$4", f = "BaseWalkRouteInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BaseWalkRouteInteractor$userAndObjectTracking$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWalkRouteInteractor$userAndObjectTracking$4(Continuation continuation, e eVar) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseWalkRouteInteractor$userAndObjectTracking$4 baseWalkRouteInteractor$userAndObjectTracking$4 = new BaseWalkRouteInteractor$userAndObjectTracking$4(continuation, this.this$0);
        baseWalkRouteInteractor$userAndObjectTracking$4.L$0 = obj;
        return baseWalkRouteInteractor$userAndObjectTracking$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BaseWalkRouteInteractor$userAndObjectTracking$4 baseWalkRouteInteractor$userAndObjectTracking$4 = (BaseWalkRouteInteractor$userAndObjectTracking$4) create((Pair) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        baseWalkRouteInteractor$userAndObjectTracking$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        zzs zzsVar = (zzs) pair.getFirst();
        u641.a(this.this$0.d, zzsVar, null, 4);
        return zy11.a;
    }
}
