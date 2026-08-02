package app.cash.cdp.integration;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$CdpInteractivitySessionTimeout;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$CdpLibraryBatchSize;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager$values$$inlined$map$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class CdpConfigUpdateSetupTeardown$setup$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ CdpConfigUpdateSetupTeardown this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CdpConfigUpdateSetupTeardown$setup$1$1(CdpConfigUpdateSetupTeardown cdpConfigUpdateSetupTeardown, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cdpConfigUpdateSetupTeardown;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CdpConfigUpdateSetupTeardown cdpConfigUpdateSetupTeardown = this.this$0;
        switch (i) {
            case 0:
                return new CdpConfigUpdateSetupTeardown$setup$1$1(cdpConfigUpdateSetupTeardown, continuation, 0);
            default:
                return new CdpConfigUpdateSetupTeardown$setup$1$1(cdpConfigUpdateSetupTeardown, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CdpConfigUpdateSetupTeardown$setup$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        final CdpConfigUpdateSetupTeardown cdpConfigUpdateSetupTeardown = this.this$0;
        final int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealFeatureFlagManager$values$$inlined$map$1 peekValues = ((RealFeatureFlagManager) ((FeatureFlagManager) cdpConfigUpdateSetupTeardown.featureFlagManager)).peekValues(LaunchDarklyFeatureFlags$CdpLibraryBatchSize.INSTANCE);
                    final int i4 = 0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: app.cash.cdp.integration.CdpConfigUpdateSetupTeardown$setup$1$1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            int i5 = i4;
                            CdpConfigUpdateSetupTeardown cdpConfigUpdateSetupTeardown2 = cdpConfigUpdateSetupTeardown;
                            switch (i5) {
                                case 0:
                                    ((CashCdpConfigProvider) cdpConfigUpdateSetupTeardown2.cdpConfigurationProvider).batchSize = ((FeatureFlag$LongFeatureFlag.Value) obj2).value;
                                    break;
                                default:
                                    ((CashCdpConfigProvider) cdpConfigUpdateSetupTeardown2.cdpConfigurationProvider).interactivitySessionTimeoutSeconds = ((FeatureFlag$LongFeatureFlag.Value) obj2).value;
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (peekValues.collect(flowCollector, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealFeatureFlagManager$values$$inlined$map$1 peekValues2 = ((RealFeatureFlagManager) ((FeatureFlagManager) cdpConfigUpdateSetupTeardown.featureFlagManager)).peekValues(LaunchDarklyFeatureFlags$CdpInteractivitySessionTimeout.INSTANCE);
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: app.cash.cdp.integration.CdpConfigUpdateSetupTeardown$setup$1$1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            int i52 = i2;
                            CdpConfigUpdateSetupTeardown cdpConfigUpdateSetupTeardown2 = cdpConfigUpdateSetupTeardown;
                            switch (i52) {
                                case 0:
                                    ((CashCdpConfigProvider) cdpConfigUpdateSetupTeardown2.cdpConfigurationProvider).batchSize = ((FeatureFlag$LongFeatureFlag.Value) obj2).value;
                                    break;
                                default:
                                    ((CashCdpConfigProvider) cdpConfigUpdateSetupTeardown2.cdpConfigurationProvider).interactivitySessionTimeoutSeconds = ((FeatureFlag$LongFeatureFlag.Value) obj2).value;
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (peekValues2.collect(flowCollector2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i5 != 1) {
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
