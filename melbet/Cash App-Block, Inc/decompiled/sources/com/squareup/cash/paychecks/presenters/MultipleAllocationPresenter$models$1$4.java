package com.squareup.cash.paychecks.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewEvent;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MultipleAllocationPresenter$models$1$4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MultipleAllocationViewEvent $event;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $requestInFlight$delegate;
    public int label;
    public final /* synthetic */ CardLockPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultipleAllocationPresenter$models$1$4(CardLockPresenter cardLockPresenter, MultipleAllocationViewEvent multipleAllocationViewEvent, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cardLockPresenter;
        this.$event = multipleAllocationViewEvent;
        this.$requestInFlight$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new MultipleAllocationPresenter$models$1$4(this.this$0, this.$event, this.$requestInFlight$delegate, continuation, 0);
            case 1:
                return new MultipleAllocationPresenter$models$1$4(this.this$0, this.$event, this.$requestInFlight$delegate, continuation, 1);
            default:
                return new MultipleAllocationPresenter$models$1$4(this.this$0, this.$event, this.$requestInFlight$delegate, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((MultipleAllocationPresenter$models$1$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MultipleAllocationViewEvent multipleAllocationViewEvent = this.$event;
        MutableState mutableState = this.$requestInFlight$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState.setValue(Boolean.valueOf(true));
                    MultipleAllocationViewEvent.Submit.SubmitSingleAllocation submitSingleAllocation = (MultipleAllocationViewEvent.Submit.SubmitSingleAllocation) multipleAllocationViewEvent;
                    SubmitSetPaycheckMultiAllocationRequest.SubmitSingle submitSingle = new SubmitSetPaycheckMultiAllocationRequest.SubmitSingle(MultipleAllocationPresenterKt.toAllocationDistribution(submitSingleAllocation.distribution), new Integer(submitSingleAllocation.currentAllocationIndex), ByteString.EMPTY);
                    this.label = 1;
                    if (CardLockPresenter.submit$default(this.this$0, null, null, null, submitSingle, false, this, 7) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue(Boolean.valueOf(false));
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState.setValue(Boolean.valueOf(true));
                    SubmitSetPaycheckMultiAllocationRequest.SubmitAll submitAll = new SubmitSetPaycheckMultiAllocationRequest.SubmitAll(MultipleAllocationPresenterKt.toAllocationDistribution(((MultipleAllocationViewEvent.Submit.SubmitAllocations) multipleAllocationViewEvent).distribution), ByteString.EMPTY);
                    this.label = 1;
                    if (CardLockPresenter.submit$default(this.this$0, submitAll, null, null, null, false, this, 14) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue(Boolean.valueOf(false));
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState.setValue(Boolean.valueOf(true));
                    SubmitSetPaycheckMultiAllocationRequest.Disable disable = new SubmitSetPaycheckMultiAllocationRequest.Disable(MultipleAllocationPresenterKt.toAllocationDistribution(((MultipleAllocationViewEvent.Submit.DisableAllocations) multipleAllocationViewEvent).distribution), ByteString.EMPTY);
                    this.label = 1;
                    if (CardLockPresenter.submit$default(this.this$0, null, disable, null, null, false, this, 13) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue(Boolean.valueOf(false));
                break;
        }
        return Unit.INSTANCE;
    }
}
