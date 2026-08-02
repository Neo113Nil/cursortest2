package com.squareup.cash.family.requestsponsorship.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcj;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.formview.viewmodels.FormViewModel;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.SponsorSelectionDetailsBlocker;
import com.squareup.protos.franklin.app.SelectSponsorsRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class SponsorSelectionDetailsPresenter$models$1$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $submissionState;
    public final /* synthetic */ SponsorSelectionDetailsBlocker.CancelSponsorSelectionAction $this_with;
    public int label;
    public final /* synthetic */ SponsorSelectionDetailsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SponsorSelectionDetailsPresenter$models$1$3$1(SponsorSelectionDetailsPresenter sponsorSelectionDetailsPresenter, SponsorSelectionDetailsBlocker.CancelSponsorSelectionAction cancelSponsorSelectionAction, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sponsorSelectionDetailsPresenter;
        this.$this_with = cancelSponsorSelectionAction;
        this.$submissionState = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SponsorSelectionDetailsPresenter$models$1$3$1(this.this$0, this.$this_with, this.$submissionState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SponsorSelectionDetailsPresenter$models$1$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            String str = this.$this_with.invite_code;
            this.label = 1;
            FormViewModel.SubmissionState.SubmissionInFlight submissionInFlight = new FormViewModel.SubmissionState.SubmissionInFlight(BlockerAction.SubmitAction.AnimationDirection.BACKWARD, 1);
            MutableState mutableState = this.$submissionState;
            mutableState.setValue(submissionInFlight);
            SponsorSelectionDetailsPresenter sponsorSelectionDetailsPresenter = this.this$0;
            Object selectSponsor$default = zzcj.selectSponsor$default(sponsorSelectionDetailsPresenter.appService, SelectSponsorsRequest.Action.CANCEL, null, null, null, null, null, null, str, sponsorSelectionDetailsPresenter.navigator, sponsorSelectionDetailsPresenter.args, sponsorSelectionDetailsPresenter.blockersDataNavigator, sponsorSelectionDetailsPresenter.stringManager, sponsorSelectionDetailsPresenter.signOutSignal, null, new DrawerViewKt$$ExternalSyntheticLambda2(27, mutableState), this, 8318);
            if (selectSponsor$default != obj2) {
                selectSponsor$default = Unit.INSTANCE;
            }
            if (selectSponsor$default != obj2) {
                selectSponsor$default = Unit.INSTANCE;
            }
            if (selectSponsor$default == obj2) {
                return obj2;
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
