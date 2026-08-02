package ru.yandex.taxi.scooters.presentation.route_navigation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.wto0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lzy11;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.route_navigation.ScootersRouteNavigationPresenter$waitForRouteFinishOrCancellation$1$1$1$4", f = "ScootersRouteNavigationPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersRouteNavigationPresenter$waitForRouteFinishOrCancellation$1$1$1$4 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersRouteNavigationPresenter$waitForRouteFinishOrCancellation$1$1$1$4(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersRouteNavigationPresenter$waitForRouteFinishOrCancellation$1$1$1$4(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersRouteNavigationPresenter$waitForRouteFinishOrCancellation$1$1$1$4 scootersRouteNavigationPresenter$waitForRouteFinishOrCancellation$1$1$1$4 = (ScootersRouteNavigationPresenter$waitForRouteFinishOrCancellation$1$1$1$4) create((zy11) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersRouteNavigationPresenter$waitForRouteFinishOrCancellation$1$1$1$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((wto0) this.this$0.Dg()).n5();
        return zy11.a;
    }
}
