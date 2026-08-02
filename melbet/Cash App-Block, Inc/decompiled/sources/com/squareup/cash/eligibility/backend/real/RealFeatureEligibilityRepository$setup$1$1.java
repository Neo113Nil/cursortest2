package com.squareup.cash.eligibility.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$models$3$1;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.ChannelAsFlow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealFeatureEligibilityRepository$setup$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealFeatureEligibilityRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealFeatureEligibilityRepository$setup$1$1(RealFeatureEligibilityRepository realFeatureEligibilityRepository, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realFeatureEligibilityRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealFeatureEligibilityRepository realFeatureEligibilityRepository = this.this$0;
        switch (i) {
            case 0:
                return new RealFeatureEligibilityRepository$setup$1$1(realFeatureEligibilityRepository, continuation, 0);
            default:
                return new RealFeatureEligibilityRepository$setup$1$1(realFeatureEligibilityRepository, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
            case 0:
                ((RealFeatureEligibilityRepository$setup$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            default:
                return ((RealFeatureEligibilityRepository$setup$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        final RealFeatureEligibilityRepository realFeatureEligibilityRepository = this.this$0;
        final int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlow sessionState = realFeatureEligibilityRepository.sessionManager.getSessionState();
                    final int i4 = 0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository$setup$1$1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            int i5 = i4;
                            RealFeatureEligibilityRepository realFeatureEligibilityRepository2 = realFeatureEligibilityRepository;
                            switch (i5) {
                                case 0:
                                    if (((SessionState) obj2) instanceof SessionState.Authenticated) {
                                        StateFlowKt.sendOrThrow$default(realFeatureEligibilityRepository2.updateEligibilityRequestsQueue, new RealFeatureEligibilityRepository.UpdateEligibilityRequest.CacheExpired(realFeatureEligibilityRepository2.clock.millis()));
                                    }
                                    break;
                                default:
                                    Object withContext = JobKt.withContext(realFeatureEligibilityRepository2.ioDispatcher, new EarningsHomePresenter$models$3$1(realFeatureEligibilityRepository2, (RealFeatureEligibilityRepository.UpdateEligibilityRequest) obj2, (Continuation) null), continuation);
                                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    if (withContext != coroutineSingletons2) {
                                        withContext = Unit.INSTANCE;
                                    }
                                    if (withContext != coroutineSingletons2) {
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (sessionState.collect(flowCollector, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChannelAsFlow receiveAsFlow = FlowKt.receiveAsFlow(realFeatureEligibilityRepository.updateEligibilityRequestsQueue);
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository$setup$1$1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            int i52 = i2;
                            RealFeatureEligibilityRepository realFeatureEligibilityRepository2 = realFeatureEligibilityRepository;
                            switch (i52) {
                                case 0:
                                    if (((SessionState) obj2) instanceof SessionState.Authenticated) {
                                        StateFlowKt.sendOrThrow$default(realFeatureEligibilityRepository2.updateEligibilityRequestsQueue, new RealFeatureEligibilityRepository.UpdateEligibilityRequest.CacheExpired(realFeatureEligibilityRepository2.clock.millis()));
                                    }
                                    break;
                                default:
                                    Object withContext = JobKt.withContext(realFeatureEligibilityRepository2.ioDispatcher, new EarningsHomePresenter$models$3$1(realFeatureEligibilityRepository2, (RealFeatureEligibilityRepository.UpdateEligibilityRequest) obj2, (Continuation) null), continuation);
                                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    if (withContext != coroutineSingletons22) {
                                        withContext = Unit.INSTANCE;
                                    }
                                    if (withContext != coroutineSingletons22) {
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (receiveAsFlow.collect(flowCollector2, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
