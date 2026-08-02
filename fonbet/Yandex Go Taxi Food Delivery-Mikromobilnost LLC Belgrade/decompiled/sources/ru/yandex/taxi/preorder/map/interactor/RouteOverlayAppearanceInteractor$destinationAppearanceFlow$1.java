package ru.yandex.taxi.preorder.map.interactor;

import defpackage.fji;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p0c0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp0c0;", "style", "Lfji;", "deliveryPin", "Lkotlin/Pair;", "<anonymous>", "(Lp0c0;Lfji;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.map.interactor.RouteOverlayAppearanceInteractor$destinationAppearanceFlow$1", f = "RouteOverlayApperanceInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteOverlayAppearanceInteractor$destinationAppearanceFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RouteOverlayAppearanceInteractor$destinationAppearanceFlow$1 routeOverlayAppearanceInteractor$destinationAppearanceFlow$1 = new RouteOverlayAppearanceInteractor$destinationAppearanceFlow$1(3, (Continuation) obj3);
        routeOverlayAppearanceInteractor$destinationAppearanceFlow$1.L$0 = (p0c0) obj;
        routeOverlayAppearanceInteractor$destinationAppearanceFlow$1.L$1 = (fji) obj2;
        return routeOverlayAppearanceInteractor$destinationAppearanceFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p0c0 p0c0Var = (p0c0) this.L$0;
        fji fjiVar = (fji) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(p0c0Var, fjiVar);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
