package com.squareup.cash.moneybot.backend.real;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileMoneybotChat;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealMoneybotFlagsHelper$moneybotEnabled$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FinishSetupTileBadgeCounter $this_unsafeTransform$inlined;
    public final /* synthetic */ RealMoneybotFlagsHelper this$0;

    /* renamed from: com.squareup.cash.moneybot.backend.real.RealMoneybotFlagsHelper$moneybotEnabled$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;
        public final /* synthetic */ RealMoneybotFlagsHelper this$0;

        /* renamed from: com.squareup.cash.moneybot.backend.real.RealMoneybotFlagsHelper$moneybotEnabled$$inlined$map$1$2$1, reason: invalid class name */
        /* loaded from: classes6.dex */
        public final class AnonymousClass1 extends ContinuationImpl {
            public int label;
            public /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= PKIFailureInfo.systemUnavail;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, RealMoneybotFlagsHelper realMoneybotFlagsHelper, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
            this.this$0 = realMoneybotFlagsHelper;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            RealMoneybotFlagsHelper$moneybotHomeEnabled$$inlined$map$1$2$1 realMoneybotFlagsHelper$moneybotHomeEnabled$$inlined$map$1$2$1;
            int i2;
            int i3 = this.$r8$classId;
            RealMoneybotFlagsHelper realMoneybotFlagsHelper = this.this$0;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            switch (i3) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i4 = anonymousClass1.label;
                        if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i4 - PKIFailureInfo.systemUnavail;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj2);
                                Boolean valueOf = Boolean.valueOf(((Boolean) obj).booleanValue() ? ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) realMoneybotFlagsHelper.featureFlagManager).currentValue(AmplitudeExperiments$MobileMoneybotChat.INSTANCE)).enabled() : false);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(valueOf, anonymousClass1) == coroutineSingletons) {
                                    break;
                                }
                            } else if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj2);
                            }
                            break;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                default:
                    if (continuation instanceof RealMoneybotFlagsHelper$moneybotHomeEnabled$$inlined$map$1$2$1) {
                        realMoneybotFlagsHelper$moneybotHomeEnabled$$inlined$map$1$2$1 = (RealMoneybotFlagsHelper$moneybotHomeEnabled$$inlined$map$1$2$1) continuation;
                        int i5 = realMoneybotFlagsHelper$moneybotHomeEnabled$$inlined$map$1$2$1.label;
                        if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                            realMoneybotFlagsHelper$moneybotHomeEnabled$$inlined$map$1$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                            Object obj3 = realMoneybotFlagsHelper$moneybotHomeEnabled$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = realMoneybotFlagsHelper$moneybotHomeEnabled$$inlined$map$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                Boolean valueOf2 = Boolean.valueOf(((Boolean) obj).booleanValue() ? ((Boolean) realMoneybotFlagsHelper.sessionFlags.moneybotHome.getValue()).booleanValue() : false);
                                realMoneybotFlagsHelper$moneybotHomeEnabled$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf2, realMoneybotFlagsHelper$moneybotHomeEnabled$$inlined$map$1$2$1) == coroutineSingletons3) {
                                    break;
                                }
                            } else if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj3);
                            }
                            break;
                        }
                    }
                    realMoneybotFlagsHelper$moneybotHomeEnabled$$inlined$map$1$2$1 = new RealMoneybotFlagsHelper$moneybotHomeEnabled$$inlined$map$1$2$1(this, continuation);
                    Object obj32 = realMoneybotFlagsHelper$moneybotHomeEnabled$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = realMoneybotFlagsHelper$moneybotHomeEnabled$$inlined$map$1$2$1.label;
                    if (i2 != 0) {
                    }
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ RealMoneybotFlagsHelper$moneybotEnabled$$inlined$map$1(FinishSetupTileBadgeCounter finishSetupTileBadgeCounter, RealMoneybotFlagsHelper realMoneybotFlagsHelper, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = finishSetupTileBadgeCounter;
        this.this$0 = realMoneybotFlagsHelper;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        RealMoneybotFlagsHelper realMoneybotFlagsHelper = this.this$0;
        FinishSetupTileBadgeCounter finishSetupTileBadgeCounter = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = finishSetupTileBadgeCounter.collect(new AnonymousClass2(flowCollector, realMoneybotFlagsHelper, 0), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = finishSetupTileBadgeCounter.collect(new AnonymousClass2(flowCollector, realMoneybotFlagsHelper, 1), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
