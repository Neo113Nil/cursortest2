package com.squareup.cash.appmessages.views;

import com.squareup.cash.appmessages.AppMessageViewEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class InlineAppMessageKt$ImageHeader$lottieComposition$2$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InlineAppMessageKt$ImageHeader$lottieComposition$2$1(Function1 function1, Continuation continuation, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.$onEvent = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Function1 function1 = this.$onEvent;
        ((Number) obj).intValue();
        Continuation continuation = (Continuation) obj3;
        switch (i) {
            case 0:
                new InlineAppMessageKt$ImageHeader$lottieComposition$2$1(function1, continuation, 0).invokeSuspend(Unit.INSTANCE);
                break;
            default:
                new InlineAppMessageKt$ImageHeader$lottieComposition$2$1(function1, continuation, 1).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return Boolean.FALSE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        AppMessageViewEvent.AppMessageImageFailedToRender appMessageImageFailedToRender = AppMessageViewEvent.AppMessageImageFailedToRender.INSTANCE;
        Function1 function1 = this.$onEvent;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(appMessageImageFailedToRender);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(appMessageImageFailedToRender);
                break;
        }
        return Boolean.FALSE;
    }
}
