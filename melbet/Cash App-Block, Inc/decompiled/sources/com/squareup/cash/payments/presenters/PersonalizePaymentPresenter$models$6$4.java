package com.squareup.cash.payments.presenters;

import androidx.compose.runtime.MutableState;
import app.cash.broadway.screen.AskedQuestion;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInput;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PersonalizePaymentResult;
import com.squareup.cash.payments.viewmodels.Background;
import com.squareup.cash.payments.viewmodels.CanvasDetails;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent;
import com.squareup.cash.payments.viewmodels.SelectedTrack;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.screens.RedactedString;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PersonalizePaymentPresenter$models$6$4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $backgrounds$delegate;
    public final /* synthetic */ MutableState $canvasDetails$delegate;
    public final /* synthetic */ MutableState $chosenBackgroundIndex$delegate;
    public final /* synthetic */ MutableState $dialogModel$delegate;
    public final /* synthetic */ MutableState $elements$delegate;
    public final /* synthetic */ PersonalizePaymentViewEvent $event;
    public final /* synthetic */ MutableState $selectedTrack$delegate;
    public int label;
    public final /* synthetic */ PersonalizePaymentPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalizePaymentPresenter$models$6$4(PersonalizePaymentPresenter personalizePaymentPresenter, PersonalizePaymentViewEvent personalizePaymentViewEvent, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, Continuation continuation) {
        super(2, continuation);
        this.this$0 = personalizePaymentPresenter;
        this.$event = personalizePaymentViewEvent;
        this.$backgrounds$delegate = mutableState;
        this.$chosenBackgroundIndex$delegate = mutableState2;
        this.$elements$delegate = mutableState3;
        this.$canvasDetails$delegate = mutableState4;
        this.$selectedTrack$delegate = mutableState5;
        this.$dialogModel$delegate = mutableState6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PersonalizePaymentPresenter$models$6$4(this.this$0, this.$event, this.$backgrounds$delegate, this.$chosenBackgroundIndex$delegate, this.$elements$delegate, this.$canvasDetails$delegate, this.$selectedTrack$delegate, this.$dialogModel$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PersonalizePaymentPresenter$models$6$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PersonalizePaymentPresenter personalizePaymentPresenter = this.this$0;
        PaymentScreens.PersonalizePayment personalizePayment = personalizePaymentPresenter.args;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        MutableState mutableState = this.$dialogModel$delegate;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (personalizePaymentPresenter.isMusicEnabled) {
                personalizePaymentPresenter.musicPlayer.stop();
            }
            boolean z = personalizePaymentPresenter.isDoneMode;
            MutableState mutableState2 = this.$selectedTrack$delegate;
            MutableState mutableState3 = this.$canvasDetails$delegate;
            MutableState mutableState4 = this.$chosenBackgroundIndex$delegate;
            MutableState mutableState5 = this.$backgrounds$delegate;
            MutableState mutableState6 = this.$elements$delegate;
            if (z) {
                Background background = (Background) ((List) mutableState5.getValue()).get(((Number) mutableState4.getValue()).intValue());
                String initiatorNote = PersonalizePaymentPresenter.getInitiatorNote((String) personalizePayment.note.getValue(), (List) mutableState6.getValue());
                PersonalizationDraftStore personalizationDraftStore = personalizePaymentPresenter.draftStore;
                PersonalizationInput.Background.SelectedBackgroundId selectedBackgroundId = new PersonalizationInput.Background.SelectedBackgroundId(background.id);
                ArrayList universalElements = PersonalizationUtilKt.toUniversalElements((List) mutableState6.getValue(), ((CanvasDetails) mutableState3.getValue()).size);
                SelectedTrack selectedTrack = (SelectedTrack) mutableState2.getValue();
                PersonalizationDraft personalizationDraft = new PersonalizationDraft(new PersonalizationInput(selectedBackgroundId, universalElements, selectedTrack != null ? selectedTrack.musicId : null), background.fullSize, background.color, background.effects, background.id, (List) mutableState6.getValue(), background.defaultTextFormat.text_color);
                StateFlowImpl stateFlowImpl = personalizationDraftStore._draft;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, personalizationDraft);
                PersonalizePaymentResult personalizePaymentResult = new PersonalizePaymentResult(new RedactedString(initiatorNote));
                AskedQuestion askedQuestion = personalizePayment.question;
                BetterNavigator.ScreenNavigator screenNavigator = personalizePaymentPresenter.navigator;
                if (askedQuestion != null) {
                    screenNavigator.giveAnswer(askedQuestion, personalizePaymentResult);
                } else {
                    screenNavigator.goTo(new Finish(personalizePaymentResult));
                }
            } else if (personalizePaymentPresenter.networkInfo.isNetworkAvailable()) {
                List list = ((PersonalizePaymentViewEvent.Send) this.$event).lastGesturesSignal;
                String initiatorNote2 = PersonalizePaymentPresenter.getInitiatorNote((String) personalizePayment.note.getValue(), (List) mutableState6.getValue());
                PersonalizationInput.Background.SelectedBackgroundId selectedBackgroundId2 = new PersonalizationInput.Background.SelectedBackgroundId(((Background) ((List) mutableState5.getValue()).get(((Number) mutableState4.getValue()).intValue())).id);
                ArrayList universalElements2 = PersonalizationUtilKt.toUniversalElements((List) mutableState6.getValue(), ((CanvasDetails) mutableState3.getValue()).size);
                SelectedTrack selectedTrack2 = (SelectedTrack) mutableState2.getValue();
                PersonalizationInput personalizationInput = new PersonalizationInput(selectedBackgroundId2, universalElements2, selectedTrack2 != null ? selectedTrack2.musicId : null);
                this.label = 1;
                if (personalizePaymentPresenter.send$presenters(list, initiatorNote2, personalizationInput, false, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                mutableState.setValue(PersonalizePaymentPresenter.access$buildOfflineConfirmationDialogViewModel(personalizePaymentPresenter, personalizePaymentPresenter.stringManager.get(R.string.confirm_personalized_payment_offline_send_title)));
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }
}
