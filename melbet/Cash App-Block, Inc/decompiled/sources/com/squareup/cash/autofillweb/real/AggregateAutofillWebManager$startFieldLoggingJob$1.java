package com.squareup.cash.autofillweb.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class AggregateAutofillWebManager$startFieldLoggingJob$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ AggregateAutofillWebManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AggregateAutofillWebManager$startFieldLoggingJob$1(AggregateAutofillWebManager aggregateAutofillWebManager, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = aggregateAutofillWebManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        AggregateAutofillWebManager aggregateAutofillWebManager = this.this$0;
        switch (i) {
            case 0:
                return new AggregateAutofillWebManager$startFieldLoggingJob$1(aggregateAutofillWebManager, continuation, 0);
            default:
                return new AggregateAutofillWebManager$startFieldLoggingJob$1(aggregateAutofillWebManager, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AggregateAutofillWebManager$startFieldLoggingJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        final AggregateAutofillWebManager aggregateAutofillWebManager = this.this$0;
        final int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                SharedFlowImpl sharedFlowImpl = aggregateAutofillWebManager.fillrManager.loggingFieldsDetected;
                final int i4 = 0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.autofillweb.real.AggregateAutofillWebManager$startFieldLoggingJob$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        int i5 = i4;
                        AggregateAutofillWebManager aggregateAutofillWebManager2 = aggregateAutofillWebManager;
                        switch (i5) {
                            case 0:
                                aggregateAutofillWebManager2.fillrFieldsDetectedCalls.add((Set) obj2);
                                break;
                            default:
                                aggregateAutofillWebManager2.cashFillFieldsDetectedCalls.add((Set) obj2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                sharedFlowImpl.collect(flowCollector, this);
                return coroutineSingletons;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow loggingFieldsDetected = aggregateAutofillWebManager.autofillWebManager.getLoggingFieldsDetected();
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: com.squareup.cash.autofillweb.real.AggregateAutofillWebManager$startFieldLoggingJob$1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            int i52 = i2;
                            AggregateAutofillWebManager aggregateAutofillWebManager2 = aggregateAutofillWebManager;
                            switch (i52) {
                                case 0:
                                    aggregateAutofillWebManager2.fillrFieldsDetectedCalls.add((Set) obj2);
                                    break;
                                default:
                                    aggregateAutofillWebManager2.cashFillFieldsDetectedCalls.add((Set) obj2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (loggingFieldsDetected.collect(flowCollector2, this) == coroutineSingletons2) {
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
