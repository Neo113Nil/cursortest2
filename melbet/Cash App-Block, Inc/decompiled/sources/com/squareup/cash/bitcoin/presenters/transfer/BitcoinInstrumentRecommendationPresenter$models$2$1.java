package com.squareup.cash.bitcoin.presenters.transfer;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.bitcoin.screens.BitcoinInstrumentRecommendationScreen;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BitcoinInstrumentRecommendationPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ CardStudioPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BitcoinInstrumentRecommendationPresenter$models$2$1(CardStudioPresenter cardStudioPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cardStudioPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CardStudioPresenter cardStudioPresenter = this.this$0;
        switch (i) {
            case 0:
                return new BitcoinInstrumentRecommendationPresenter$models$2$1(cardStudioPresenter, continuation, 0);
            default:
                return new BitcoinInstrumentRecommendationPresenter$models$2$1(cardStudioPresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BitcoinInstrumentRecommendationPresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CardStudioPresenter cardStudioPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption bitcoinInstrumentRecommendationOption = ((BitcoinInstrumentRecommendationScreen) cardStudioPresenter.cardStudioQueries).primaryOption;
                    this.label = 1;
                    if (CardStudioPresenter.access$handleButtonClick(cardStudioPresenter, bitcoinInstrumentRecommendationOption, this) == coroutineSingletons) {
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
                    BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption bitcoinInstrumentRecommendationOption2 = ((BitcoinInstrumentRecommendationScreen) cardStudioPresenter.cardStudioQueries).secondaryOption;
                    this.label = 1;
                    if (CardStudioPresenter.access$handleButtonClick(cardStudioPresenter, bitcoinInstrumentRecommendationOption2, this) == coroutineSingletons2) {
                        break;
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
}
