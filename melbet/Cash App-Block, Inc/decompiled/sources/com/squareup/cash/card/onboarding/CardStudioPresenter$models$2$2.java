package com.squareup.cash.card.onboarding;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardStudioViewEvent;
import com.squareup.cash.card.onboarding.CardStudioViewModel;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeTapSave;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.TouchData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardStudioPresenter$models$2$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CardStudioViewEvent $event;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $state$delegate;
    public int label;
    public final /* synthetic */ CardStudioPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardStudioPresenter$models$2$2(CardStudioPresenter cardStudioPresenter, CardStudioViewEvent cardStudioViewEvent, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cardStudioPresenter;
        this.$event = cardStudioViewEvent;
        this.$state$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new CardStudioPresenter$models$2$2(this.this$0, this.$event, this.$state$delegate, continuation, 0);
            default:
                return new CardStudioPresenter$models$2$2(this.this$0, this.$event, this.$state$delegate, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CardStudioPresenter$models$2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CardStudioViewEvent cardStudioViewEvent = this.$event;
        MutableState mutableState = this.$state$delegate;
        switch (i) {
            case 0:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardStudioPresenter cardStudioPresenter = this.this$0;
                    ((Analytics) cardStudioPresenter.analytics).track(new CashCardCustomizeTapSave(), null);
                    CardStudioViewModel cardStudioViewModel = (CardStudioViewModel) mutableState.getValue();
                    cardStudioViewModel.getClass();
                    CardStudioViewModel.Content content = (CardStudioViewModel.Content) cardStudioViewModel;
                    TouchData touchData = ((CardStudioViewEvent.DoneCustomizing) cardStudioViewEvent).touchData;
                    boolean z = content.isShowingCashtag;
                    boolean z2 = content.isShowingCashtagButton;
                    this.label = 1;
                    Object withContext = JobKt.withContext((CoroutineContext) cardStudioPresenter.ioContext, new CardStudioPresenter$doneLogic$2(touchData, cardStudioPresenter, z2, z, null), this);
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext == obj2) {
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
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardStudioViewModel cardStudioViewModel2 = (CardStudioViewModel) mutableState.getValue();
                    cardStudioViewModel2.getClass();
                    CardStudioViewModel.Content content2 = (CardStudioViewModel.Content) cardStudioViewModel2;
                    TouchData touchData2 = ((CardStudioViewEvent.UpdateTempCustomization) cardStudioViewEvent).touchData;
                    CardTheme cardTheme = content2.cardTheme;
                    boolean z3 = content2.isShowingCashtag;
                    boolean z4 = content2.isShowingCashtagButton;
                    this.label = 1;
                    CardStudioPresenter cardStudioPresenter2 = this.this$0;
                    Object withContext2 = JobKt.withContext((CoroutineContext) cardStudioPresenter2.ioContext, new CardStudioPresenter$tempCustomizationLogic$2(cardStudioPresenter2, z4, z3, cardTheme, touchData2, null, 0), this);
                    if (withContext2 != obj3) {
                        withContext2 = Unit.INSTANCE;
                    }
                    if (withContext2 == obj3) {
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
