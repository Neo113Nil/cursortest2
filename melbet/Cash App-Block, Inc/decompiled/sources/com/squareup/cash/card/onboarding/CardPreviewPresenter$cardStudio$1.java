package com.squareup.cash.card.onboarding;

import androidx.room.util.DBUtil;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.local.db.LocalTabContentQueries;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.franklin.api.CardCustomizationBlocker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardPreviewPresenter$cardStudio$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CardPreviewPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardPreviewPresenter$cardStudio$1(CardPreviewPresenter cardPreviewPresenter, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cardPreviewPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardPreviewPresenter$cardStudio$1 cardPreviewPresenter$cardStudio$1 = new CardPreviewPresenter$cardStudio$1(this.this$0, continuation);
        cardPreviewPresenter$cardStudio$1.L$0 = obj;
        return cardPreviewPresenter$cardStudio$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CardPreviewPresenter$cardStudio$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CardPreviewPresenter cardPreviewPresenter = this.this$0;
        LocalTabContentQueries localTabContentQueries = cardPreviewPresenter.cardStudioQueries;
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            CardCustomizationBlocker.CardOption cardOption = cardPreviewPresenter.args.preselectedCard;
            if (cardOption != null) {
                CardCustomizationBlocker.CardOption.CashtagDisplay cashtagDisplay = cardOption.cashtag_display;
                localTabContentQueries.insertInitialState(cashtagDisplay == CardCustomizationBlocker.CardOption.CashtagDisplay.ALWAYS_HIDDEN || cashtagDisplay == CardCustomizationBlocker.CardOption.CashtagDisplay.OPTIONAL);
                localTabContentQueries.updateThemes(cardOption.card_theme);
            }
            localTabContentQueries.deleteTemporaryState();
            FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take = FlowKt.take(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(localTabContentQueries.select$2()), cardPreviewPresenter.ioDispatcher), 1);
            this.L$0 = null;
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, take, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
