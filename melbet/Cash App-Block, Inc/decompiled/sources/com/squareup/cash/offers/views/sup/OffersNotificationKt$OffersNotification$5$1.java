package com.squareup.cash.offers.views.sup;

import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class OffersNotificationKt$OffersNotification$5$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ State $isAnimationFinishedMovingUp$delegate;
    public final /* synthetic */ Function0 $onNotificationDismiss;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OffersNotificationKt$OffersNotification$5$1(Function0 function0, State state, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$onNotificationDismiss = function0;
        this.$isAnimationFinishedMovingUp$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        State state = this.$isAnimationFinishedMovingUp$delegate;
        Function0 function0 = this.$onNotificationDismiss;
        switch (i) {
            case 0:
                return new OffersNotificationKt$OffersNotification$5$1(function0, state, continuation, 0);
            default:
                return new OffersNotificationKt$OffersNotification$5$1(function0, state, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((OffersNotificationKt$OffersNotification$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Function0 function0 = this.$onNotificationDismiss;
        State state = this.$isAnimationFinishedMovingUp$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) state.getValue()).booleanValue()) {
                    function0.invoke();
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) state.getValue()).booleanValue()) {
                    function0.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
