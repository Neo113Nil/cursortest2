package ru.yandex.taxi.masstransit.stopbubble.interactor;

import defpackage.cq60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w210;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Lcq60;", "Lc430;", "it", "Lgl50;", "<anonymous>", "(Lkotlin/Pair;)Lgl50;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stopbubble.interactor.StopBubbleInteractor$stateFlow$1", f = "StopBubbleInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class StopBubbleInteractor$stateFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StopBubbleInteractor$stateFlow$1 stopBubbleInteractor$stateFlow$1 = new StopBubbleInteractor$stateFlow$1(2, continuation);
        stopBubbleInteractor$stateFlow$1.L$0 = obj;
        return stopBubbleInteractor$stateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StopBubbleInteractor$stateFlow$1) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        w210 w210Var = ((cq60) pair.c()).l;
        if (w210Var != null) {
            return w210Var.a;
        }
        return null;
    }
}
