package com.squareup.cash.payments.views.coreflowsheet;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CoreFlowRealSheetState$ProcessQueuedNestedFlingsEffect$1$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CoreFlowRealSheetState this$0;

    public /* synthetic */ CoreFlowRealSheetState$ProcessQueuedNestedFlingsEffect$1$1$2(CoreFlowRealSheetState coreFlowRealSheetState, int i) {
        this.$r8$classId = i;
        this.this$0 = coreFlowRealSheetState;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CoreFlowRealSheetState coreFlowRealSheetState = this.this$0;
        switch (i) {
            case 0:
                Object obj2 = coreFlowRealSheetState.draggableState.settle(((Number) obj).floatValue(), continuation);
                return obj2 == CoroutineSingletons.COROUTINE_SUSPENDED ? obj2 : Unit.INSTANCE;
            case 1:
                Pair pair = (Pair) obj;
                int intValue = ((Number) pair.first).intValue();
                boolean booleanValue = ((Boolean) pair.second).booleanValue();
                if (!coreFlowRealSheetState.isReadyToBeDisplayed()) {
                    return Unit.INSTANCE;
                }
                if (intValue <= 0 || booleanValue || coreFlowRealSheetState.draggableState.settledValue$delegate.getValue() != CoreFlowSheetPosition.Peeking) {
                    return Unit.INSTANCE;
                }
                Object expand = coreFlowRealSheetState.expand(continuation);
                return expand == CoroutineSingletons.COROUTINE_SUSPENDED ? expand : Unit.INSTANCE;
            default:
                return emit(((Number) obj).intValue(), continuation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(int i, Continuation continuation) {
        CoreFlowRealSheetState$HandleContentAndImeTransitionsEffect$2$1$2$emit$1 coreFlowRealSheetState$HandleContentAndImeTransitionsEffect$2$1$2$emit$1;
        int i2;
        if (continuation instanceof CoreFlowRealSheetState$HandleContentAndImeTransitionsEffect$2$1$2$emit$1) {
            coreFlowRealSheetState$HandleContentAndImeTransitionsEffect$2$1$2$emit$1 = (CoreFlowRealSheetState$HandleContentAndImeTransitionsEffect$2$1$2$emit$1) continuation;
            int i3 = coreFlowRealSheetState$HandleContentAndImeTransitionsEffect$2$1$2$emit$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                coreFlowRealSheetState$HandleContentAndImeTransitionsEffect$2$1$2$emit$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = coreFlowRealSheetState$HandleContentAndImeTransitionsEffect$2$1$2$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = coreFlowRealSheetState$HandleContentAndImeTransitionsEffect$2$1$2$emit$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    coreFlowRealSheetState$HandleContentAndImeTransitionsEffect$2$1$2$emit$1.I$0 = i;
                    coreFlowRealSheetState$HandleContentAndImeTransitionsEffect$2$1$2$emit$1.label = 1;
                    if (JobKt.delay(300L, coreFlowRealSheetState$HandleContentAndImeTransitionsEffect$2$1$2$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = coreFlowRealSheetState$HandleContentAndImeTransitionsEffect$2$1$2$emit$1.I$0;
                    SafeTrace.throwOnFailure(obj);
                }
                this.this$0.imeStableHeightPx$delegate.setValue(Integer.valueOf(i));
                return Unit.INSTANCE;
            }
        }
        coreFlowRealSheetState$HandleContentAndImeTransitionsEffect$2$1$2$emit$1 = new CoreFlowRealSheetState$HandleContentAndImeTransitionsEffect$2$1$2$emit$1(this, continuation);
        Object obj2 = coreFlowRealSheetState$HandleContentAndImeTransitionsEffect$2$1$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = coreFlowRealSheetState$HandleContentAndImeTransitionsEffect$2$1$2$emit$1.label;
        if (i2 != 0) {
        }
        this.this$0.imeStableHeightPx$delegate.setValue(Integer.valueOf(i));
        return Unit.INSTANCE;
    }
}
