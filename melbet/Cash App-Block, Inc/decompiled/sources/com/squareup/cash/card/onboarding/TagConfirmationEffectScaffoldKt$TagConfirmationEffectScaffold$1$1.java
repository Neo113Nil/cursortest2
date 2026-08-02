package com.squareup.cash.card.onboarding;

import androidx.compose.animation.core.Animatable;
import com.squareup.cash.charting.components.EarningsBarChartKt$ChartBars$1$1$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class TagConfirmationEffectScaffoldKt$TagConfirmationEffectScaffold$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Animatable $alpha;
    public final /* synthetic */ boolean $animate;
    public final /* synthetic */ Animatable $entranceSpinProgress;
    public final /* synthetic */ boolean $playsEntranceRise;
    public final /* synthetic */ Animatable $riseOffset;
    public /* synthetic */ Object L$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagConfirmationEffectScaffoldKt$TagConfirmationEffectScaffold$1$1(boolean z, boolean z2, Animatable animatable, Animatable animatable2, Animatable animatable3, Continuation continuation) {
        super(2, continuation);
        this.$animate = z;
        this.$playsEntranceRise = z2;
        this.$alpha = animatable;
        this.$riseOffset = animatable2;
        this.$entranceSpinProgress = animatable3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TagConfirmationEffectScaffoldKt$TagConfirmationEffectScaffold$1$1 tagConfirmationEffectScaffoldKt$TagConfirmationEffectScaffold$1$1 = new TagConfirmationEffectScaffoldKt$TagConfirmationEffectScaffold$1$1(this.$animate, this.$playsEntranceRise, this.$alpha, this.$riseOffset, this.$entranceSpinProgress, continuation);
        tagConfirmationEffectScaffoldKt$TagConfirmationEffectScaffold$1$1.L$0 = obj;
        return tagConfirmationEffectScaffoldKt$TagConfirmationEffectScaffold$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TagConfirmationEffectScaffoldKt$TagConfirmationEffectScaffold$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        if (this.$animate) {
            JobKt.launch$default(coroutineScope, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1(this.$alpha, null, 21), 3);
            if (this.$playsEntranceRise) {
                JobKt.launch$default(coroutineScope, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1(this.$riseOffset, null, 22), 3);
                JobKt.launch$default(coroutineScope, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1(this.$entranceSpinProgress, null, 23), 3);
            }
        }
        return Unit.INSTANCE;
    }
}
