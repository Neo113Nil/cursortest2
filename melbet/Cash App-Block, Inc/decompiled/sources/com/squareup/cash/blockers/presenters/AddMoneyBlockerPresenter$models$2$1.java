package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.AddMoneyRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class AddMoneyBlockerPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $currentAmount$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $submitting$delegate;
    public int label;
    public final /* synthetic */ AddMoneyBlockerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddMoneyBlockerPresenter$models$2$1(AddMoneyBlockerPresenter addMoneyBlockerPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = addMoneyBlockerPresenter;
        this.$currentAmount$delegate = mutableState;
        this.$submitting$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new AddMoneyBlockerPresenter$models$2$1(this.this$0, this.$currentAmount$delegate, this.$submitting$delegate, continuation, 0);
            default:
                return new AddMoneyBlockerPresenter$models$2$1(this.this$0, this.$currentAmount$delegate, this.$submitting$delegate, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AddMoneyBlockerPresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$submitting$delegate;
        MutableState mutableState2 = this.$currentAmount$delegate;
        AddMoneyBlockerPresenter addMoneyBlockerPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Money money = (Money) mutableState2.getValue();
                    AddMoneyRequest.PaymentMethod paymentMethod = AddMoneyRequest.PaymentMethod.DEBIT_CARD;
                    this.label = 1;
                    if (AddMoneyBlockerPresenter.access$submit(addMoneyBlockerPresenter, money, paymentMethod, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue(Boolean.FALSE);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Money money2 = (Money) mutableState2.getValue();
                    AddMoneyRequest.PaymentMethod paymentMethod2 = AddMoneyRequest.PaymentMethod.GOOGLE_PAY;
                    this.label = 1;
                    if (AddMoneyBlockerPresenter.access$submit(addMoneyBlockerPresenter, money2, paymentMethod2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
