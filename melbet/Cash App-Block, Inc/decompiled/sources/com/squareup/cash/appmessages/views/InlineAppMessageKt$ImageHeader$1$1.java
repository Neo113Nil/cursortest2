package com.squareup.cash.appmessages.views;

import com.squareup.cash.appmessages.AppMessageViewEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class InlineAppMessageKt$ImageHeader$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $messageToken;
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InlineAppMessageKt$ImageHeader$1$1(Function1 function1, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$onEvent = function1;
        this.$messageToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        String str = this.$messageToken;
        Function1 function1 = this.$onEvent;
        switch (i) {
            case 0:
                return new InlineAppMessageKt$ImageHeader$1$1(function1, str, continuation, 0);
            default:
                return new InlineAppMessageKt$ImageHeader$1$1(function1, str, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((InlineAppMessageKt$ImageHeader$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        String str = this.$messageToken;
        Function1 function1 = this.$onEvent;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new AppMessageViewEvent.AppMessageViewed(str));
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new AppMessageViewEvent.AppMessageViewed(str));
                break;
        }
        return Unit.INSTANCE;
    }
}
