package com.squareup.cash.featureflags;

import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealSessionFlags$setup$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ RealSessionFlags this$0;

    /* renamed from: com.squareup.cash.featureflags.RealSessionFlags$setup$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ RealSessionFlags this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(RealSessionFlags realSessionFlags, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = realSessionFlags;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            RealSessionFlags realSessionFlags = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1(realSessionFlags, continuation, 0);
                case 1:
                    return new AnonymousClass1(realSessionFlags, continuation, 1);
                default:
                    return new AnonymousClass1(realSessionFlags, continuation, 2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            RealSessionFlags realSessionFlags = this.this$0;
            int i2 = 1;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowKt__MergeKt$flatMapConcat$$inlined$map$1 access$syncFor = RealSessionFlags.access$syncFor(realSessionFlags, realSessionFlags.featureFlagManager, realSessionFlags.moneybotHomeKeyValue);
                        AnonymousClass5 anonymousClass5 = new AnonymousClass5(realSessionFlags, i2);
                        this.label = 1;
                        if (access$syncFor.collect(anonymousClass5, this) == coroutineSingletons) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowKt__MergeKt$flatMapConcat$$inlined$map$1 access$syncFor2 = RealSessionFlags.access$syncFor(realSessionFlags, realSessionFlags.featureFlagManager, realSessionFlags.moneybotRespectSystemAppearanceKeyValue);
                        AnonymousClass5 anonymousClass52 = new AnonymousClass5(realSessionFlags, 2);
                        this.label = 1;
                        if (access$syncFor2.collect(anonymousClass52, this) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                default:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowKt__MergeKt$flatMapConcat$$inlined$map$1 access$syncFor3 = RealSessionFlags.access$syncFor(realSessionFlags, realSessionFlags.featureFlagManager, realSessionFlags.liquidGlassKeyValue);
                        this.label = 1;
                        if (access$syncFor3.collect(RealSessionFlags$setup$1$1$3$1.INSTANCE, this) == coroutineSingletons3) {
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

    /* renamed from: com.squareup.cash.featureflags.RealSessionFlags$setup$1$1$5, reason: invalid class name */
    public final class AnonymousClass5 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ RealSessionFlags this$0;

        public /* synthetic */ AnonymousClass5(RealSessionFlags realSessionFlags, int i) {
            this.$r8$classId = i;
            this.this$0 = realSessionFlags;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            RealSessionFlags realSessionFlags = this.this$0;
            switch (i) {
                case 0:
                    if (realSessionFlags.onboarded) {
                        realSessionFlags.onboarded = false;
                        StateFlowImpl stateFlowImpl = realSessionFlags.showModernTabs;
                        stateFlowImpl.getClass();
                        stateFlowImpl.updateState(null, false);
                    }
                    break;
                case 1:
                    StateFlowImpl stateFlowImpl2 = realSessionFlags.moneybotHome;
                    Boolean valueOf = Boolean.valueOf(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) obj).enabled());
                    stateFlowImpl2.getClass();
                    stateFlowImpl2.updateState(null, valueOf);
                    break;
                default:
                    StateFlowImpl stateFlowImpl3 = realSessionFlags.moneybotRespectSystemAppearance;
                    Boolean valueOf2 = Boolean.valueOf(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) obj).enabled());
                    stateFlowImpl3.getClass();
                    stateFlowImpl3.updateState(null, valueOf2);
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSessionFlags$setup$1$1(RealSessionFlags realSessionFlags, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realSessionFlags;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealSessionFlags realSessionFlags = this.this$0;
        switch (i) {
            case 0:
                RealSessionFlags$setup$1$1 realSessionFlags$setup$1$1 = new RealSessionFlags$setup$1$1(realSessionFlags, continuation);
                realSessionFlags$setup$1$1.L$0 = obj;
                return realSessionFlags$setup$1$1;
            default:
                RealSessionFlags$setup$1$1 realSessionFlags$setup$1$12 = new RealSessionFlags$setup$1$1(continuation, realSessionFlags);
                realSessionFlags$setup$1$12.L$0 = obj;
                return realSessionFlags$setup$1$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealSessionFlags$setup$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RealSessionFlags realSessionFlags = this.this$0;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                    int i4 = 0;
                    JobKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass1(realSessionFlags, continuation, i4), 1);
                    JobKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass1(realSessionFlags, continuation, i2), 1);
                    JobKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass1(realSessionFlags, continuation, 2), 1);
                    ChannelFlowBuilder merge = FlowKt.merge(realSessionFlags.signOut, new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(realSessionFlags.sessionManager.getSessionState(), 12));
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(realSessionFlags, i4);
                    this.L$0 = null;
                    this.label = 1;
                    if (merge.collect(anonymousClass5, this) == coroutineSingletons) {
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
                    RealSessionFlags$setup$1$1 realSessionFlags$setup$1$1 = new RealSessionFlags$setup$1$1(realSessionFlags, (Continuation) null);
                    this.L$0 = null;
                    this.label = 1;
                    if (JobKt.coroutineScope(realSessionFlags$setup$1$1, this) == coroutineSingletons2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSessionFlags$setup$1$1(Continuation continuation, RealSessionFlags realSessionFlags) {
        super(2, continuation);
        this.this$0 = realSessionFlags;
    }
}
