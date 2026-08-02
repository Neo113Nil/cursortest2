package com.squareup.cash.card.onboarding.graphics;

import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardGridNuxKt$CardGridNux$6$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $animationComplete$delegate;
    public final /* synthetic */ Animatable $animationProgress;
    public final /* synthetic */ Transition $currentTransition;
    public final /* synthetic */ SpringSpec $gentleSpring;
    public final /* synthetic */ long $startTimeMs;
    public long J$0;
    public long J$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardGridNuxKt$CardGridNux$6$1$1(long j, Transition transition, Animatable animatable, SpringSpec springSpec, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$startTimeMs = j;
        this.$currentTransition = transition;
        this.$animationProgress = animatable;
        this.$gentleSpring = springSpec;
        this.$animationComplete$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardGridNuxKt$CardGridNux$6$1$1(this.$startTimeMs, this.$currentTransition, this.$animationProgress, this.$gentleSpring, this.$animationComplete$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CardGridNuxKt$CardGridNux$6$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r11.$animationProgress, r2, r11.$gentleSpring, null, null, r6, 12) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long currentTimeMillis;
        long j;
        long j2;
        CardGridNuxKt$CardGridNux$6$1$1 cardGridNuxKt$CardGridNux$6$1$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            currentTimeMillis = System.currentTimeMillis() - this.$startTimeMs;
            j = 600 - currentTimeMillis;
            if (j < 0) {
                j = 0;
            }
            if (j > 0) {
                this.J$0 = currentTimeMillis;
                this.J$1 = j;
                this.label = 1;
                if (JobKt.delay(j, this) != coroutineSingletons) {
                    j2 = j;
                }
                return coroutineSingletons;
            }
            if (this.$currentTransition.targetState$delegate.getValue() != EnterExitState.PostExit) {
                return Unit.INSTANCE;
            }
            Float f = new Float(1.0f);
            this.J$0 = currentTimeMillis;
            this.J$1 = j;
            this.label = 2;
            cardGridNuxKt$CardGridNux$6$1$1 = this;
        } else {
            if (i != 1) {
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                cardGridNuxKt$CardGridNux$6$1$1 = this;
                cardGridNuxKt$CardGridNux$6$1$1.$animationComplete$delegate.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            }
            j2 = this.J$1;
            currentTimeMillis = this.J$0;
            SafeTrace.throwOnFailure(obj);
        }
        j = j2;
        if (this.$currentTransition.targetState$delegate.getValue() != EnterExitState.PostExit) {
        }
    }
}
