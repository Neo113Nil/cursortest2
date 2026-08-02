package com.squareup.cash.activity.presenters.receipts;

import androidx.compose.runtime.State;
import androidx.paging.compose.LazyPagingItems$collectLoadState$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.presenters.receipts.ReceiptPresenter;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ReceiptViewEvent;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class ReceiptPresenter$models$4$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ReceiptViewEvent $event;
    public final /* synthetic */ State $intermediateState$delegate;
    public final /* synthetic */ ActivityItemEventHandler $itemEventHandler;
    public final /* synthetic */ int $r8$classId = 1;
    public int label;
    public final /* synthetic */ ReceiptPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptPresenter$models$4$3(State state, ActivityItemEventHandler activityItemEventHandler, ReceiptViewEvent receiptViewEvent, ReceiptPresenter receiptPresenter, Continuation continuation) {
        super(2, continuation);
        this.$intermediateState$delegate = state;
        this.$itemEventHandler = activityItemEventHandler;
        this.$event = receiptViewEvent;
        this.this$0 = receiptPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new ReceiptPresenter$models$4$3(this.this$0, this.$itemEventHandler, this.$event, this.$intermediateState$delegate, continuation);
            default:
                return new ReceiptPresenter$models$4$3(this.$intermediateState$delegate, this.$itemEventHandler, this.$event, this.this$0, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ReceiptPresenter$models$4$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ReceiptPresenter receiptPresenter = this.this$0;
        ReceiptViewEvent receiptViewEvent = this.$event;
        ActivityItemEventHandler activityItemEventHandler = this.$itemEventHandler;
        State state = this.$intermediateState$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ReceiptPresenter.IntermediateState intermediateState = (ReceiptPresenter.IntermediateState) state.getValue();
                    PaymentHistoryButton paymentHistoryButton = ((ReceiptViewEvent.ButtonClicked) receiptViewEvent).button;
                    this.label = 1;
                    if (ReceiptPresenter.access$handleButtonClick(receiptPresenter, activityItemEventHandler, intermediateState, paymentHistoryButton, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ReceiptPresenter.IntermediateState intermediateState2 = (ReceiptPresenter.IntermediateState) state.getValue();
                    ReceiptPresenter.IntermediateState.Loaded loaded = intermediateState2 instanceof ReceiptPresenter.IntermediateState.Loaded ? (ReceiptPresenter.IntermediateState.Loaded) intermediateState2 : null;
                    if (loaded != null) {
                        Flow handleEvent = activityItemEventHandler.handleEvent(loaded.itemViewModel, new ActivityItemViewEvent.ReactionSelected(((ReceiptViewEvent.ReactionSelected) receiptViewEvent).reaction), loaded.activityItem);
                        LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$2 = receiptPresenter.eventHandlerFlowCollector;
                        this.label = 1;
                        if (handleEvent.collect(lazyPagingItems$collectLoadState$2, this) == coroutineSingletons2) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
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
    public ReceiptPresenter$models$4$3(ReceiptPresenter receiptPresenter, ActivityItemEventHandler activityItemEventHandler, ReceiptViewEvent receiptViewEvent, State state, Continuation continuation) {
        super(2, continuation);
        this.this$0 = receiptPresenter;
        this.$itemEventHandler = activityItemEventHandler;
        this.$event = receiptViewEvent;
        this.$intermediateState$delegate = state;
    }
}
