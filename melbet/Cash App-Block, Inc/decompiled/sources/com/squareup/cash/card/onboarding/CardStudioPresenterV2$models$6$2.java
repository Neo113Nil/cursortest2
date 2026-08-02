package com.squareup.cash.card.onboarding;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardStudioViewEventV2;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
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
public final class CardStudioPresenterV2$models$6$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CardStudioViewEventV2 $event;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $state$delegate;
    public int label;
    public final /* synthetic */ CardStudioPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardStudioPresenterV2$models$6$2(CardStudioPresenter cardStudioPresenter, CardStudioViewEventV2 cardStudioViewEventV2, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cardStudioPresenter;
        this.$event = cardStudioViewEventV2;
        this.$state$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new CardStudioPresenterV2$models$6$2(this.this$0, this.$event, this.$state$delegate, continuation, 0);
            case 1:
                return new CardStudioPresenterV2$models$6$2(this.this$0, this.$event, this.$state$delegate, continuation, 1);
            default:
                return new CardStudioPresenterV2$models$6$2(this.this$0, this.$event, this.$state$delegate, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CardStudioPresenterV2$models$6$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CardStudioViewEventV2 cardStudioViewEventV2 = this.$event;
        MutableState mutableState = this.$state$delegate;
        switch (i) {
            case 0:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardStudioViewModelV2 cardStudioViewModelV2 = (CardStudioViewModelV2) mutableState.getValue();
                    cardStudioViewModelV2.getClass();
                    CardStudioViewModelV2.Content content = (CardStudioViewModelV2.Content) cardStudioViewModelV2;
                    TouchData touchData = ((CardStudioViewEventV2.DoneCustomizing) cardStudioViewEventV2).touchData;
                    boolean z = content.isShowingCashtag;
                    boolean z2 = content.isShowingCashtagToggle;
                    this.label = 1;
                    CardStudioPresenter cardStudioPresenter = this.this$0;
                    Object withContext = JobKt.withContext((CoroutineContext) cardStudioPresenter.ioContext, new CardStudioPresenterV2$doneLogic$2(touchData, cardStudioPresenter, z2, z, null), this);
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
            case 1:
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardStudioViewModelV2 cardStudioViewModelV22 = (CardStudioViewModelV2) mutableState.getValue();
                    cardStudioViewModelV22.getClass();
                    CardStudioViewModelV2.Content content2 = (CardStudioViewModelV2.Content) cardStudioViewModelV22;
                    TouchData touchData2 = ((CardStudioViewEventV2.UpdateTempCustomization) cardStudioViewEventV2).touchData;
                    CardTheme cardTheme = content2.cardTheme;
                    boolean z3 = content2.isShowingCashtag;
                    boolean z4 = content2.isShowingCashtagToggle;
                    this.label = 1;
                    CardStudioPresenter cardStudioPresenter2 = this.this$0;
                    Object withContext2 = JobKt.withContext((CoroutineContext) cardStudioPresenter2.ioContext, new CardStudioPresenter$tempCustomizationLogic$2(cardStudioPresenter2, z4, z3, cardTheme, touchData2, null, 1), this);
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
            default:
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardStudioViewModelV2 cardStudioViewModelV23 = (CardStudioViewModelV2) mutableState.getValue();
                    cardStudioViewModelV23.getClass();
                    CardStudioViewModelV2.Content content3 = (CardStudioViewModelV2.Content) cardStudioViewModelV23;
                    TouchData touchData3 = ((CardStudioViewEventV2.DeleteAllCustomization) cardStudioViewEventV2).touchData;
                    CardTheme cardTheme2 = content3.cardTheme;
                    boolean z5 = content3.isShowingCashtag;
                    boolean z6 = content3.isShowingCashtagToggle;
                    this.label = 1;
                    CardStudioPresenter cardStudioPresenter3 = this.this$0;
                    Object withContext3 = JobKt.withContext((CoroutineContext) cardStudioPresenter3.ioContext, new CardStudioPresenter$tempCustomizationLogic$2(cardStudioPresenter3, z6, z5, cardTheme2, touchData3, null, 1), this);
                    if (withContext3 != obj4) {
                        withContext3 = Unit.INSTANCE;
                    }
                    if (withContext3 == obj4) {
                        break;
                    }
                } else if (i4 != 1) {
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
