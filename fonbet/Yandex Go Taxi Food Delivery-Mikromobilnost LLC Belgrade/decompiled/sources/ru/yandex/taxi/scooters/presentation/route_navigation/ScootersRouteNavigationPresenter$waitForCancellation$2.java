package ru.yandex.taxi.scooters.presentation.route_navigation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.wnj;
import defpackage.x950;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx950;", "it", "", "<anonymous>", "(Lx950;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.route_navigation.ScootersRouteNavigationPresenter$waitForCancellation$2", f = "ScootersRouteNavigationPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersRouteNavigationPresenter$waitForCancellation$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersRouteNavigationPresenter$waitForCancellation$2 scootersRouteNavigationPresenter$waitForCancellation$2 = new ScootersRouteNavigationPresenter$waitForCancellation$2(2, continuation);
        scootersRouteNavigationPresenter$waitForCancellation$2.L$0 = obj;
        return scootersRouteNavigationPresenter$waitForCancellation$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersRouteNavigationPresenter$waitForCancellation$2) create((x950) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        x950 x950Var = (x950) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(x950Var instanceof wnj);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
