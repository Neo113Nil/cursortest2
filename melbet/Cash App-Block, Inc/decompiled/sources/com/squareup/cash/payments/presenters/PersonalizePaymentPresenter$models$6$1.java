package com.squareup.cash.payments.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInput;
import com.squareup.cash.payments.viewmodels.Background;
import com.squareup.cash.payments.viewmodels.CanvasDetails;
import com.squareup.cash.payments.viewmodels.SelectedTrack;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PersonalizePaymentPresenter$models$6$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $backgrounds$delegate;
    public final /* synthetic */ MutableState $canvasDetails$delegate;
    public final /* synthetic */ MutableState $chosenBackgroundIndex$delegate;
    public final /* synthetic */ MutableState $dialogModel$delegate;
    public final /* synthetic */ MutableState $elements$delegate;
    public final /* synthetic */ MutableState $selectedTrack$delegate;
    public int label;
    public final /* synthetic */ PersonalizePaymentPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalizePaymentPresenter$models$6$1(PersonalizePaymentPresenter personalizePaymentPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, Continuation continuation) {
        super(2, continuation);
        this.this$0 = personalizePaymentPresenter;
        this.$elements$delegate = mutableState;
        this.$backgrounds$delegate = mutableState2;
        this.$chosenBackgroundIndex$delegate = mutableState3;
        this.$canvasDetails$delegate = mutableState4;
        this.$selectedTrack$delegate = mutableState5;
        this.$dialogModel$delegate = mutableState6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PersonalizePaymentPresenter$models$6$1(this.this$0, this.$elements$delegate, this.$backgrounds$delegate, this.$chosenBackgroundIndex$delegate, this.$canvasDetails$delegate, this.$selectedTrack$delegate, this.$dialogModel$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PersonalizePaymentPresenter$models$6$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        MutableState mutableState = this.$dialogModel$delegate;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            PersonalizePaymentPresenter personalizePaymentPresenter = this.this$0;
            if (!personalizePaymentPresenter.networkInfo.isNetworkAvailable()) {
                mutableState.setValue(PersonalizePaymentPresenter.access$buildOfflineConfirmationDialogViewModel(personalizePaymentPresenter, personalizePaymentPresenter.stringManager.get(R.string.confirm_personalized_payment_offline_send_title)));
                return Unit.INSTANCE;
            }
            EmptyList emptyList = EmptyList.INSTANCE;
            MutableState mutableState2 = this.$elements$delegate;
            String initiatorNote = PersonalizePaymentPresenter.getInitiatorNote((String) personalizePaymentPresenter.args.note.getValue(), (List) mutableState2.getValue());
            PersonalizationInput.Background.SelectedBackgroundId selectedBackgroundId = new PersonalizationInput.Background.SelectedBackgroundId(((Background) ((List) this.$backgrounds$delegate.getValue()).get(((Number) this.$chosenBackgroundIndex$delegate.getValue()).intValue())).id);
            ArrayList universalElements = PersonalizationUtilKt.toUniversalElements((List) mutableState2.getValue(), ((CanvasDetails) this.$canvasDetails$delegate.getValue()).size);
            SelectedTrack selectedTrack = (SelectedTrack) this.$selectedTrack$delegate.getValue();
            PersonalizationInput personalizationInput = new PersonalizationInput(selectedBackgroundId, universalElements, selectedTrack != null ? selectedTrack.musicId : null);
            this.label = 1;
            if (personalizePaymentPresenter.send$presenters(emptyList, initiatorNote, personalizationInput, false, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }
}
