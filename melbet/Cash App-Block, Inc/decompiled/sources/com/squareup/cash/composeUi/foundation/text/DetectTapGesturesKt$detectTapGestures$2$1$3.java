package com.squareup.cash.composeUi.foundation.text;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class DetectTapGesturesKt$detectTapGestures$2$1$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ PressGestureScopeImpl $pressScope;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DetectTapGesturesKt$detectTapGestures$2$1$3(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$pressScope = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
        switch (i) {
            case 0:
                return new DetectTapGesturesKt$detectTapGestures$2$1$3(pressGestureScopeImpl, continuation, 0);
            default:
                return new DetectTapGesturesKt$detectTapGestures$2$1$3(pressGestureScopeImpl, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((DetectTapGesturesKt$detectTapGestures$2$1$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                pressGestureScopeImpl.isCanceled = true;
                pressGestureScopeImpl.mutex.unlock(null);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                pressGestureScopeImpl.isReleased = true;
                pressGestureScopeImpl.mutex.unlock(null);
                break;
        }
        return Unit.INSTANCE;
    }
}
