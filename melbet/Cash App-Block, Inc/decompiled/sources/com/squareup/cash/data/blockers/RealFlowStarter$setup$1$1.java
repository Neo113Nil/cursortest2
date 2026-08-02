package com.squareup.cash.data.blockers;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db2.BlockersConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealFlowStarter$setup$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealFlowStarter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealFlowStarter$setup$1$1(RealFlowStarter realFlowStarter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realFlowStarter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealFlowStarter realFlowStarter = this.this$0;
        switch (i) {
            case 0:
                return new RealFlowStarter$setup$1$1(realFlowStarter, continuation, 0);
            default:
                return new RealFlowStarter$setup$1$1(realFlowStarter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealFlowStarter$setup$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        final RealFlowStarter realFlowStarter = this.this$0;
        final int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FinishSetupTileBadgeCounter instrumentLinkingConfig = ((RealAppConfigManager) realFlowStarter.appConfig).instrumentLinkingConfig();
                    final int i4 = 0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.data.blockers.RealFlowStarter$setup$1$1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            int i5 = i4;
                            RealFlowStarter realFlowStarter2 = realFlowStarter;
                            switch (i5) {
                                case 0:
                                    realFlowStarter2.instrumentLinkingConfig = (InstrumentLinkingConfig) obj2;
                                    realFlowStarter2.instrumentLinkingConfigReady.complete$1();
                                    break;
                                default:
                                    realFlowStarter2.blockersConfig = (BlockersConfig) obj2;
                                    realFlowStarter2.blockersConfigReady.complete$1();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (instrumentLinkingConfig.collect(flowCollector, this) == coroutineSingletons) {
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
                    FinishSetupTileBadgeCounter blockersConfig = ((RealAppConfigManager) realFlowStarter.appConfig).blockersConfig();
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: com.squareup.cash.data.blockers.RealFlowStarter$setup$1$1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            int i52 = i2;
                            RealFlowStarter realFlowStarter2 = realFlowStarter;
                            switch (i52) {
                                case 0:
                                    realFlowStarter2.instrumentLinkingConfig = (InstrumentLinkingConfig) obj2;
                                    realFlowStarter2.instrumentLinkingConfigReady.complete$1();
                                    break;
                                default:
                                    realFlowStarter2.blockersConfig = (BlockersConfig) obj2;
                                    realFlowStarter2.blockersConfigReady.complete$1();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (blockersConfig.collect(flowCollector2, this) == coroutineSingletons2) {
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
