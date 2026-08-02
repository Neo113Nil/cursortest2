package com.squareup.cash.card.onboarding.core;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.StandaloneCoroutine;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardScene$disposeHeatMask$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ HeatMaskRenderer $renderer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardScene$disposeHeatMask$1(HeatMaskRenderer heatMaskRenderer, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.$renderer = heatMaskRenderer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new CardScene$disposeHeatMask$1(this.$renderer, continuation, 0);
            default:
                return new CardScene$disposeHeatMask$1(this.$renderer, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((CardScene$disposeHeatMask$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        HeatMaskRenderer heatMaskRenderer = this.$renderer;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                heatMaskRenderer.renderLoopActive = false;
                StandaloneCoroutine standaloneCoroutine = heatMaskRenderer.renderJob;
                if (standaloneCoroutine != null) {
                    standaloneCoroutine.cancel(null);
                }
                heatMaskRenderer.release();
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                heatMaskRenderer.renderLoopActive = false;
                StandaloneCoroutine standaloneCoroutine2 = heatMaskRenderer.renderJob;
                if (standaloneCoroutine2 != null) {
                    standaloneCoroutine2.cancel(null);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
