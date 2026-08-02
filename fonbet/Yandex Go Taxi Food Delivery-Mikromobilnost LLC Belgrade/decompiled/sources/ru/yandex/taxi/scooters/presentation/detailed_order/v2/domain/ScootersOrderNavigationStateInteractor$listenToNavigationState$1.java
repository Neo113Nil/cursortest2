package ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.x950;
import defpackage.zls;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzuo0;", "scootersSessionState", "Lx950;", "navigationState", "Lkotlin/Pair;", "<anonymous>", "(Lzuo0;Lx950;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain.ScootersOrderNavigationStateInteractor$listenToNavigationState$1", f = "ScootersOrderNavigationStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersOrderNavigationStateInteractor$listenToNavigationState$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersOrderNavigationStateInteractor$listenToNavigationState$1 scootersOrderNavigationStateInteractor$listenToNavigationState$1 = new ScootersOrderNavigationStateInteractor$listenToNavigationState$1(3, (Continuation) obj3);
        scootersOrderNavigationStateInteractor$listenToNavigationState$1.L$0 = (zuo0) obj;
        scootersOrderNavigationStateInteractor$listenToNavigationState$1.L$1 = (x950) obj2;
        return scootersOrderNavigationStateInteractor$listenToNavigationState$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zuo0 zuo0Var = (zuo0) this.L$0;
        x950 x950Var = (x950) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(zuo0Var, x950Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
