package com.squareup.cash.core.navigationcontainer;

import com.squareup.cash.ui.OnTransitionListener;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class UiContainerKt$ScreenContent$2$2$1$4$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ OnTransitionListener $onTransitionListener;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UiContainerKt$ScreenContent$2$2$1$4$1(OnTransitionListener onTransitionListener, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$onTransitionListener = onTransitionListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        OnTransitionListener onTransitionListener = this.$onTransitionListener;
        switch (i) {
            case 0:
                return new UiContainerKt$ScreenContent$2$2$1$4$1(onTransitionListener, continuation, 0);
            default:
                return new UiContainerKt$ScreenContent$2$2$1$4$1(onTransitionListener, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((UiContainerKt$ScreenContent$2$2$1$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        OnTransitionListener onTransitionListener = this.$onTransitionListener;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                onTransitionListener.onEnterTransitionFinished();
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                onTransitionListener.onExitTransitionStarted();
                break;
        }
        return Unit.INSTANCE;
    }
}
