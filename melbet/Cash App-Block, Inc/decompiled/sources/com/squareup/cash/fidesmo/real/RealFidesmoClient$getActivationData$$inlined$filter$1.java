package com.squareup.cash.fidesmo.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealFidesmoClient$getActivationData$$inlined$filter$1 implements Flow {
    public final /* synthetic */ long $connectionId$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;

    /* renamed from: com.squareup.cash.fidesmo.real.RealFidesmoClient$getActivationData$$inlined$filter$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ long $connectionId$inlined;
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* renamed from: com.squareup.cash.fidesmo.real.RealFidesmoClient$getActivationData$$inlined$filter$1$2$1, reason: invalid class name */
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

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, long j, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
            this.$connectionId$inlined = j;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            RealFidesmoClient$waitForProvisioningData$$inlined$filter$2$2$1 realFidesmoClient$waitForProvisioningData$$inlined$filter$2$2$1;
            int i2;
            int i3 = this.$r8$classId;
            long j = this.$connectionId$inlined;
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
                                if (((Number) obj).longValue() != j) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        break;
                                    }
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
                    if (continuation instanceof RealFidesmoClient$waitForProvisioningData$$inlined$filter$2$2$1) {
                        realFidesmoClient$waitForProvisioningData$$inlined$filter$2$2$1 = (RealFidesmoClient$waitForProvisioningData$$inlined$filter$2$2$1) continuation;
                        int i5 = realFidesmoClient$waitForProvisioningData$$inlined$filter$2$2$1.label;
                        if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                            realFidesmoClient$waitForProvisioningData$$inlined$filter$2$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                            Object obj3 = realFidesmoClient$waitForProvisioningData$$inlined$filter$2$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = realFidesmoClient$waitForProvisioningData$$inlined$filter$2$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                if (((Number) obj).longValue() != j) {
                                    realFidesmoClient$waitForProvisioningData$$inlined$filter$2$2$1.label = 1;
                                    if (flowCollector.emit(obj, realFidesmoClient$waitForProvisioningData$$inlined$filter$2$2$1) == coroutineSingletons3) {
                                        break;
                                    }
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
                    realFidesmoClient$waitForProvisioningData$$inlined$filter$2$2$1 = new RealFidesmoClient$waitForProvisioningData$$inlined$filter$2$2$1(this, continuation);
                    Object obj32 = realFidesmoClient$waitForProvisioningData$$inlined$filter$2$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = realFidesmoClient$waitForProvisioningData$$inlined$filter$2$2$1.label;
                    if (i2 != 0) {
                    }
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ RealFidesmoClient$getActivationData$$inlined$filter$1(StateFlowImpl stateFlowImpl, long j, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = stateFlowImpl;
        this.$connectionId$inlined = j;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        long j = this.$connectionId$inlined;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flow.collect(new AnonymousClass2(flowCollector, j, 0), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = flow.collect(new AnonymousClass2(flowCollector, j, 1), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
