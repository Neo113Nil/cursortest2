package com.squareup.cash.card.onboarding;

import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.card.onboarding.screens.CardPreviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardPreviewPresenter$models$2$4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardPreviewPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardPreviewPresenter$models$2$4(CardPreviewPresenter cardPreviewPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cardPreviewPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CardPreviewPresenter cardPreviewPresenter = this.this$0;
        switch (i) {
            case 0:
                return new CardPreviewPresenter$models$2$4(cardPreviewPresenter, continuation, 0);
            default:
                return new CardPreviewPresenter$models$2$4(cardPreviewPresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CardPreviewPresenter$models$2$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CardPreviewPresenter cardPreviewPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                cardPreviewPresenter.cardStudioQueries.delete$2();
                BlockerFlowListener blockerFlowListener = cardPreviewPresenter.blockerFlowAnalytics;
                CardPreviewScreen cardPreviewScreen = cardPreviewPresenter.args;
                blockerFlowListener.onFlowCancelled(cardPreviewScreen.blockersData);
                cardPreviewPresenter.navigator.goTo(cardPreviewScreen.blockersData.exitScreen);
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return cardPreviewPresenter.cardStudioQueries.delete$2();
        }
    }
}
