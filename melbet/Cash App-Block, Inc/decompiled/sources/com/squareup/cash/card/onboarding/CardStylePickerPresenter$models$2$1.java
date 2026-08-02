package com.squareup.cash.card.onboarding;

import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.boost.db.RewardSlotQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.card.onboarding.screens.CardStyleScreen;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeClose;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeStart;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardStylePickerPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardStylePickerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardStylePickerPresenter$models$2$1(CardStylePickerPresenter cardStylePickerPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cardStylePickerPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CardStylePickerPresenter cardStylePickerPresenter = this.this$0;
        switch (i) {
            case 0:
                return new CardStylePickerPresenter$models$2$1(cardStylePickerPresenter, continuation, 0);
            case 1:
                return new CardStylePickerPresenter$models$2$1(cardStylePickerPresenter, continuation, 1);
            default:
                return new CardStylePickerPresenter$models$2$1(cardStylePickerPresenter, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CardStylePickerPresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CardStylePickerPresenter cardStylePickerPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                cardStylePickerPresenter.analytics.track(new CashCardCustomizeStart(CashCardCustomizeStart.CustomizationType.STYLE), null);
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                cardStylePickerPresenter.analytics.track(new CashCardCustomizeClose(CashCardCustomizeClose.CustomizationType.STYLE), null);
                cardStylePickerPresenter.cashDatabase.transactionWithWrapper(new RewardSlotQueries$$ExternalSyntheticLambda0(cardStylePickerPresenter, 28));
                BlockerFlowListener blockerFlowListener = cardStylePickerPresenter.blockerFlowAnalytics;
                CardStyleScreen cardStyleScreen = cardStylePickerPresenter.args;
                blockerFlowListener.onFlowCancelled(cardStyleScreen.blockersData);
                cardStylePickerPresenter.navigator.goTo(cardStyleScreen.blockersData.exitScreen);
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return cardStylePickerPresenter.cardStudioQueries.insertInitialState(true);
        }
    }
}
