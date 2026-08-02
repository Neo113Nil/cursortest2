package ru.yandex.taxi.controller;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "it", "Lkotlin/Pair;", "Lns70;", "Lo2y0;", "<anonymous>", "(Z)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.controller.StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$result$1$3", f = "StartNextControllerDelegateImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$result$1$3 extends SuspendLambda implements wls {
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$result$1$3(2, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        ((StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$result$1$3) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return null;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
