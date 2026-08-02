package ru.yandex.taxi.preorder.map.interactor;

import defpackage.e6l0;
import defpackage.fji;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p0c0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Lp0c0;", "Lfji;", "<destruct>", "Le6l0;", "<anonymous>", "(Lkotlin/Pair;)Le6l0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.map.interactor.RouteOverlayAppearanceInteractor$destinationAppearanceFlow$2", f = "RouteOverlayApperanceInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteOverlayAppearanceInteractor$destinationAppearanceFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteOverlayAppearanceInteractor$destinationAppearanceFlow$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RouteOverlayAppearanceInteractor$destinationAppearanceFlow$2 routeOverlayAppearanceInteractor$destinationAppearanceFlow$2 = new RouteOverlayAppearanceInteractor$destinationAppearanceFlow$2(this.this$0, continuation);
        routeOverlayAppearanceInteractor$destinationAppearanceFlow$2.L$0 = obj;
        return routeOverlayAppearanceInteractor$destinationAppearanceFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteOverlayAppearanceInteractor$destinationAppearanceFlow$2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        p0c0 p0c0Var = (p0c0) pair.getFirst();
        return c.a(this.this$0, new e6l0(p0c0Var, null), (fji) pair.getSecond());
    }
}
