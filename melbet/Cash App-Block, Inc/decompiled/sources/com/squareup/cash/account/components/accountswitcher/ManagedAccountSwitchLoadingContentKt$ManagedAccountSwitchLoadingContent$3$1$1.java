package com.squareup.cash.account.components.accountswitcher;

import androidx.compose.animation.core.Animatable;
import com.squareup.cash.charting.components.EarningsBarChartKt$ChartBars$1$1$1$1;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt$fadeIn$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ManagedAccountSwitchLoadingContentKt$ManagedAccountSwitchLoadingContent$3$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Animatable $bounceOffset;
    public final /* synthetic */ Animatable $bounceScale;
    public final /* synthetic */ float $offsetPx;
    public /* synthetic */ Object L$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagedAccountSwitchLoadingContentKt$ManagedAccountSwitchLoadingContent$3$1$1(Animatable animatable, float f, Animatable animatable2, Continuation continuation) {
        super(2, continuation);
        this.$bounceOffset = animatable;
        this.$offsetPx = f;
        this.$bounceScale = animatable2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ManagedAccountSwitchLoadingContentKt$ManagedAccountSwitchLoadingContent$3$1$1 managedAccountSwitchLoadingContentKt$ManagedAccountSwitchLoadingContent$3$1$1 = new ManagedAccountSwitchLoadingContentKt$ManagedAccountSwitchLoadingContent$3$1$1(this.$bounceOffset, this.$offsetPx, this.$bounceScale, continuation);
        managedAccountSwitchLoadingContentKt$ManagedAccountSwitchLoadingContent$3$1$1.L$0 = obj;
        return managedAccountSwitchLoadingContentKt$ManagedAccountSwitchLoadingContent$3$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ManagedAccountSwitchLoadingContentKt$ManagedAccountSwitchLoadingContent$3$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        JobKt.launch$default(coroutineScope, null, null, new CoreInteractiveCardKt$fadeIn$2(this.$bounceOffset, this.$offsetPx, null), 3);
        return JobKt.launch$default(coroutineScope, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1(this.$bounceScale, null, 13), 3);
    }
}
