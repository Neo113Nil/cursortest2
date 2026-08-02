package com.squareup.cash.payments.views.coreflowsheet;

import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.runtime.Updater;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.sheet.RealSheetState$ProcessQueuedNestedFlingsEffect$1$1$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.ChannelAsFlow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import papa.PapaEvent;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CoreFlowRealSheetState$awaitDismissal$2$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ CoreFlowRealSheetState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CoreFlowRealSheetState$awaitDismissal$2$1$1(CoreFlowRealSheetState coreFlowRealSheetState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = coreFlowRealSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CoreFlowRealSheetState coreFlowRealSheetState = this.this$0;
        switch (i) {
            case 0:
                return new CoreFlowRealSheetState$awaitDismissal$2$1$1(coreFlowRealSheetState, continuation, 0);
            case 1:
                return new CoreFlowRealSheetState$awaitDismissal$2$1$1(coreFlowRealSheetState, continuation, 1);
            case 2:
                return new CoreFlowRealSheetState$awaitDismissal$2$1$1(coreFlowRealSheetState, continuation, 2);
            case 3:
                return new CoreFlowRealSheetState$awaitDismissal$2$1$1(coreFlowRealSheetState, continuation, 3);
            default:
                return new CoreFlowRealSheetState$awaitDismissal$2$1$1(coreFlowRealSheetState, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CoreFlowRealSheetState$awaitDismissal$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CoreFlowRealSheetState coreFlowRealSheetState = this.this$0;
        int i2 = 1;
        switch (i) {
            case 0:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object first = FlowKt.first(new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new CoreFlowRealSheetState$$ExternalSyntheticLambda1(coreFlowRealSheetState, 1)), 19), this);
                    if (first != obj2) {
                        first = Unit.INSTANCE;
                    }
                    if (first == obj2) {
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
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new CoreFlowRealSheetState$$ExternalSyntheticLambda1(coreFlowRealSheetState, 11));
                    CoreFlowRealSheetState$ProcessQueuedNestedFlingsEffect$1$1$2 coreFlowRealSheetState$ProcessQueuedNestedFlingsEffect$1$1$2 = new CoreFlowRealSheetState$ProcessQueuedNestedFlingsEffect$1$1$2(coreFlowRealSheetState, 1);
                    this.label = 1;
                    if (snapshotFlow.collect(coreFlowRealSheetState$ProcessQueuedNestedFlingsEffect$1$1$2, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow2 = Updater.snapshotFlow(new CoreFlowRealSheetState$$ExternalSyntheticLambda1(coreFlowRealSheetState, 12));
                    CoreFlowRealSheetState$ProcessQueuedNestedFlingsEffect$1$1$2 coreFlowRealSheetState$ProcessQueuedNestedFlingsEffect$1$1$22 = new CoreFlowRealSheetState$ProcessQueuedNestedFlingsEffect$1$1$2(coreFlowRealSheetState, 2);
                    this.label = 1;
                    if (snapshotFlow2.collect(coreFlowRealSheetState$ProcessQueuedNestedFlingsEffect$1$1$22, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BufferedChannel Channel$default = PapaEvent.Channel$default(0, null, null, 7);
                    coreFlowRealSheetState.settleWithVelocity = new RealSheetState$ProcessQueuedNestedFlingsEffect$1$1$$ExternalSyntheticLambda0(Channel$default, i2);
                    ChannelAsFlow consumeAsFlow = FlowKt.consumeAsFlow(Channel$default);
                    CoreFlowRealSheetState$ProcessQueuedNestedFlingsEffect$1$1$2 coreFlowRealSheetState$ProcessQueuedNestedFlingsEffect$1$1$23 = new CoreFlowRealSheetState$ProcessQueuedNestedFlingsEffect$1$1$2(coreFlowRealSheetState, 0);
                    this.label = 1;
                    if (consumeAsFlow.collect(coreFlowRealSheetState$ProcessQueuedNestedFlingsEffect$1$1$23, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (CoreFlowRealSheetState.access$awaitDismissalDragEnabled(coreFlowRealSheetState, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i7 != 1) {
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
