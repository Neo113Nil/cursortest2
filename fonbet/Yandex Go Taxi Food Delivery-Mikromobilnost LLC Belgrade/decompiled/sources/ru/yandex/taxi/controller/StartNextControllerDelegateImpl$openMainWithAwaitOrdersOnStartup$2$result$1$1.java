package ru.yandex.taxi.controller;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00002\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Pair;", "Lns70;", "Lo2y0;", "it", "<anonymous>", "(Lkotlin/Pair;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.controller.StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$result$1$1", f = "StartNextControllerDelegateImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$result$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$result$1$1 startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$result$1$1 = new StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$result$1$1(2, continuation);
        startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$result$1$1.L$0 = obj;
        return startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$result$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$result$1$1) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return pair;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
