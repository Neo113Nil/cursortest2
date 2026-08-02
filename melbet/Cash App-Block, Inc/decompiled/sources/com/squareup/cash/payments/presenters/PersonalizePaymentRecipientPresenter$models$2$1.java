package com.squareup.cash.payments.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.music.backend.real.RealMusicPlayer;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.payments.backend.api.PersonalizationRepository;
import com.squareup.cash.payments.viewmodels.ConfirmRetryResourceDialog;
import com.squareup.cash.payments.viewmodels.SelectedTrack;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.work.presenters.providers.RealPasscodeProvider$getPasscode$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PersonalizePaymentRecipientPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $personalizationLoadingState$delegate;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ PersonalizePaymentRecipientPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PersonalizePaymentRecipientPresenter$models$2$1(PersonalizePaymentRecipientPresenter personalizePaymentRecipientPresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = personalizePaymentRecipientPresenter;
        this.$personalizationLoadingState$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$personalizationLoadingState$delegate;
        PersonalizePaymentRecipientPresenter personalizePaymentRecipientPresenter = this.this$0;
        switch (i) {
            case 0:
                return new PersonalizePaymentRecipientPresenter$models$2$1(personalizePaymentRecipientPresenter, mutableState, continuation, 0);
            case 1:
                return new PersonalizePaymentRecipientPresenter$models$2$1(personalizePaymentRecipientPresenter, mutableState, continuation, 1);
            default:
                return new PersonalizePaymentRecipientPresenter$models$2$1(personalizePaymentRecipientPresenter, mutableState, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PersonalizePaymentRecipientPresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        PersonalizePaymentRecipientPresenter personalizePaymentRecipientPresenter = this.this$0;
        MutableState mutableState = this.$personalizationLoadingState$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealPersonalizePaymentManager realPersonalizePaymentManager = personalizePaymentRecipientPresenter.personalizePaymentManager;
                    String str = personalizePaymentRecipientPresenter.args.entity.entity_token;
                    if (str == null) {
                        str = "";
                    }
                    PersonalizationRepository personalizationRepository = realPersonalizePaymentManager.personalizationRepository;
                    Flow flowOn = FlowKt.flowOn(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(personalizationRepository.loadPersonalizedTransaction(str), personalizationRepository.loadBackgrounds(true), new RealPasscodeProvider$getPasscode$1(realPersonalizePaymentManager, (Continuation) null, 1), 0), personalizePaymentRecipientPresenter.ioDispatcher);
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass1 = new MusicPresenter$models$2$1.AnonymousClass1(25, mutableState);
                    this.label = 1;
                    if (flowOn.collect(anonymousClass1, this) == coroutineSingletons) {
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
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SelectedTrack selectedTrack = (SelectedTrack) mutableState.getValue();
                    RealMusicPlayer realMusicPlayer = personalizePaymentRecipientPresenter.musicPlayer;
                    if (selectedTrack != null) {
                        SelectedTrack selectedTrack2 = (SelectedTrack) mutableState.getValue();
                        selectedTrack2.getClass();
                        String str2 = selectedTrack2.musicId;
                        this.label = 1;
                        if (realMusicPlayer.play(str2, this) == coroutineSingletons2) {
                            break;
                        }
                    } else {
                        realMusicPlayer.stop();
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                AndroidStringManager androidStringManager = personalizePaymentRecipientPresenter.stringManager;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState.setValue(null);
                    RealPersonalizePaymentManager realPersonalizePaymentManager2 = personalizePaymentRecipientPresenter.personalizePaymentManager;
                    this.label = 1;
                    obj = realPersonalizePaymentManager2.personalizationRepository.refreshPersonalizationResources(this);
                    if (obj == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    mutableState.setValue(null);
                } else {
                    mutableState.setValue(new ConfirmRetryResourceDialog(androidStringManager.get(R.string.retry_personalization_title), androidStringManager.get(R.string.retry_personalization_message), androidStringManager.get(R.string.retry_personalization_refresh_positive_button), androidStringManager.get(R.string.retry_personalization_refresh_negative_button)));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
