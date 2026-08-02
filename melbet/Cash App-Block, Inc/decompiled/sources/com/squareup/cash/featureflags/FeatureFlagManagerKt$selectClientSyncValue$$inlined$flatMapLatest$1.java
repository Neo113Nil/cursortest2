package com.squareup.cash.featureflags;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.protos.franklin.common.SyncValueType;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class FeatureFlagManagerKt$selectClientSyncValue$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ Flow $clientSyncValues$inlined;
    public final /* synthetic */ Flow $profileValues$inlined;
    public final /* synthetic */ SyncValueType $syncValueType$inlined;
    public final /* synthetic */ FeatureFlagManager $this_selectClientSyncValue$inlined;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureFlagManagerKt$selectClientSyncValue$$inlined$flatMapLatest$1(Continuation continuation, SyncValueType syncValueType, Flow flow, FeatureFlagManager featureFlagManager, Flow flow2) {
        super(3, continuation);
        this.$syncValueType$inlined = syncValueType;
        this.$clientSyncValues$inlined = flow;
        this.$this_selectClientSyncValue$inlined = featureFlagManager;
        this.$profileValues$inlined = flow2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FeatureFlagManagerKt$selectClientSyncValue$$inlined$flatMapLatest$1 featureFlagManagerKt$selectClientSyncValue$$inlined$flatMapLatest$1 = new FeatureFlagManagerKt$selectClientSyncValue$$inlined$flatMapLatest$1((Continuation) obj3, this.$syncValueType$inlined, this.$clientSyncValues$inlined, this.$this_selectClientSyncValue$inlined, this.$profileValues$inlined);
        featureFlagManagerKt$selectClientSyncValue$$inlined$flatMapLatest$1.L$0 = (FlowCollector) obj;
        featureFlagManagerKt$selectClientSyncValue$$inlined$flatMapLatest$1.L$1 = obj2;
        return featureFlagManagerKt$selectClientSyncValue$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow flow;
        FlowCollector flowCollector = this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (((List) ((FeatureFlag$JsonFeatureFlag.Options) obj2).value).contains(this.$syncValueType$inlined)) {
                flow = this.$clientSyncValues$inlined;
            } else {
                ProductionSyncValueMigrationBypass productionSyncValueMigrationBypass = ((RealFeatureFlagManager) this.$this_selectClientSyncValue$inlined).syncValueMigrationBypass;
                flow = this.$profileValues$inlined;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flow, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
