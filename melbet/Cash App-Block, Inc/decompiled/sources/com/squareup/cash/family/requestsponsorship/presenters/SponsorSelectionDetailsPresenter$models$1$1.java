package com.squareup.cash.family.requestsponsorship.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.franklin.api.SponsorSelectionDetailsBlocker;
import com.squareup.protos.franklin.ui.UiCustomer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class SponsorSelectionDetailsPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction $confirmAction;
    public final /* synthetic */ UiCustomer $selectedSponsor;
    public final /* synthetic */ MutableState $submissionState;
    public int label;
    public final /* synthetic */ SponsorSelectionDetailsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SponsorSelectionDetailsPresenter$models$1$1(SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction confirmSelectedSponsorAction, SponsorSelectionDetailsPresenter sponsorSelectionDetailsPresenter, UiCustomer uiCustomer, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$confirmAction = confirmSelectedSponsorAction;
        this.this$0 = sponsorSelectionDetailsPresenter;
        this.$selectedSponsor = uiCustomer;
        this.$submissionState = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SponsorSelectionDetailsPresenter$models$1$1(this.$confirmAction, this.this$0, this.$selectedSponsor, this.$submissionState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SponsorSelectionDetailsPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction confirmSelectedSponsorAction = this.$confirmAction;
            String str = confirmSelectedSponsorAction.full_name;
            Boolean bool = confirmSelectedSponsorAction.is_recommended_sponsor;
            Boolean bool2 = confirmSelectedSponsorAction.is_added_to_favorites;
            Boolean bool3 = confirmSelectedSponsorAction.is_cash_customer;
            String str2 = confirmSelectedSponsorAction.invite_code;
            this.label = 1;
            if (this.this$0.confirmSelectedSponsor(this.$selectedSponsor, str2, str, bool, bool2, bool3, this.$submissionState, this) == coroutineSingletons) {
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
