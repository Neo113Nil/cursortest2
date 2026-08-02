package com.squareup.cash.featureflags;

import androidx.compose.runtime.AbstractApplier;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class FeatureFlagManagerKt$valuesState$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AbstractApplier $flag;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FeatureFlagManager $this_valuesState;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeatureFlagManagerKt$valuesState$2(FeatureFlagManager featureFlagManager, AbstractApplier abstractApplier, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$this_valuesState = featureFlagManager;
        this.$flag = abstractApplier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                FeatureFlagManagerKt$valuesState$2 featureFlagManagerKt$valuesState$2 = new FeatureFlagManagerKt$valuesState$2(this.$this_valuesState, this.$flag, continuation, 0);
                featureFlagManagerKt$valuesState$2.L$0 = obj;
                return featureFlagManagerKt$valuesState$2;
            default:
                FeatureFlagManagerKt$valuesState$2 featureFlagManagerKt$valuesState$22 = new FeatureFlagManagerKt$valuesState$2(this.$this_valuesState, this.$flag, continuation, 1);
                featureFlagManagerKt$valuesState$22.L$0 = obj;
                return featureFlagManagerKt$valuesState$22;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        FlowCollector flowCollector = (FlowCollector) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((FeatureFlagManagerKt$valuesState$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        AbstractApplier abstractApplier = this.$flag;
        FeatureFlagManager featureFlagManager = this.$this_valuesState;
        switch (i) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FeatureFlag$Option peekCurrentValue = ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(abstractApplier);
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector.emit(peekCurrentValue, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FeatureFlag$Option currentValue = ((RealFeatureFlagManager) featureFlagManager).currentValue(abstractApplier);
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector2.emit(currentValue, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
