package com.squareup.cash.pools.views;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PoolDetailsViewKt$ProgressContent$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $currentAmount;
    public final /* synthetic */ long $currentAmountRaw;
    public final /* synthetic */ MutableState $displayAmount$delegate;
    public final /* synthetic */ MutableState $hasAnimatedAmount$delegate;
    public final /* synthetic */ MutableState $haveAnimationsStarted$delegate;
    public final /* synthetic */ Function0 $onAnimationComplete;
    public final /* synthetic */ boolean $shouldAnimateAmount;
    public final /* synthetic */ MutableState $showContributionPill$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolDetailsViewKt$ProgressContent$1$1$1(boolean z, String str, long j, Function0 function0, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.$shouldAnimateAmount = z;
        this.$currentAmount = str;
        this.$currentAmountRaw = j;
        this.$onAnimationComplete = function0;
        this.$haveAnimationsStarted$delegate = mutableState;
        this.$showContributionPill$delegate = mutableState2;
        this.$displayAmount$delegate = mutableState3;
        this.$hasAnimatedAmount$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PoolDetailsViewKt$ProgressContent$1$1$1(this.$shouldAnimateAmount, this.$currentAmount, this.$currentAmountRaw, this.$onAnimationComplete, this.$haveAnimationsStarted$delegate, this.$showContributionPill$delegate, this.$displayAmount$delegate, this.$hasAnimatedAmount$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PoolDetailsViewKt$ProgressContent$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(2000, r9) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(2000, r9) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(500, r9) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        MutableState mutableState = this.$showContributionPill$delegate;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState.setValue(Boolean.FALSE);
                    this.$hasAnimatedAmount$delegate.setValue(Boolean.TRUE);
                    this.$onAnimationComplete.invoke();
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                this.$onAnimationComplete.invoke();
                return Unit.INSTANCE;
            }
            SafeTrace.throwOnFailure(obj);
        }
        Boolean bool = Boolean.TRUE;
        this.$haveAnimationsStarted$delegate.setValue(bool);
        if (this.$shouldAnimateAmount) {
            mutableState.setValue(bool);
            this.$displayAmount$delegate.setValue(new AnimatedAmountTextView.Amount(this.$currentAmount, this.$currentAmountRaw));
            this.label = 2;
        } else {
            this.label = 3;
        }
        return coroutineSingletons;
    }
}
