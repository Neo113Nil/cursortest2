package com.squareup.cash.payments.views.personalization;

import com.squareup.cash.payments.viewmodels.NearbyPayRequestViewEvent;
import com.squareup.cash.payments.viewmodels.NearbyPayersSheetViewEvent$OnDismiss;
import com.squareup.cash.payments.viewmodels.NearbyPaymentKeypadViewEvent;
import com.squareup.cash.payments.viewmodels.NearbyPaymentsInfoViewEvent;
import com.squareup.cash.payments.viewmodels.NearbyPeopleOverflowSheetViewEvent;
import com.squareup.cash.payments.viewmodels.NearbyPermissionsPromptSheetViewEvent;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentRecipientViewEvent;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentStickersViewEvent;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent$DialogEvent$CloseDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class ActionMenuKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ ActionMenuKt$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        NearbyPayRequestViewEvent.OnMoreInfoClicked onMoreInfoClicked = NearbyPayRequestViewEvent.OnMoreInfoClicked.INSTANCE;
        NearbyPaymentKeypadViewEvent.OnCloseClicked onCloseClicked = NearbyPaymentKeypadViewEvent.OnCloseClicked.INSTANCE;
        PersonalizePaymentStickersViewEvent.Back back = PersonalizePaymentStickersViewEvent.Back.INSTANCE;
        PersonalizePaymentViewEvent$DialogEvent$CloseDialog personalizePaymentViewEvent$DialogEvent$CloseDialog = PersonalizePaymentViewEvent$DialogEvent$CloseDialog.INSTANCE;
        PersonalizePaymentRecipientViewEvent.CloseDialog closeDialog = PersonalizePaymentRecipientViewEvent.CloseDialog.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(PersonalizePaymentViewEvent.AddTextTapped.INSTANCE);
                break;
            case 1:
                function1.invoke(NearbyPayRequestViewEvent.OnCloseClicked.INSTANCE);
                break;
            case 2:
                function1.invoke(NearbyPayRequestViewEvent.OnErrorDismissed.INSTANCE);
                break;
            case 3:
                function1.invoke(onMoreInfoClicked);
                break;
            case 4:
                function1.invoke(onMoreInfoClicked);
                break;
            case 5:
                function1.invoke(NearbyPayRequestViewEvent.OnHelpClicked.INSTANCE);
                break;
            case 6:
                function1.invoke(NearbyPayRequestViewEvent.OnViewAllPeopleClicked.INSTANCE);
                break;
            case 7:
                function1.invoke(NearbyPayersSheetViewEvent$OnDismiss.INSTANCE);
                break;
            case 8:
                function1.invoke(NearbyPaymentKeypadViewEvent.OnPayClicked.INSTANCE);
                break;
            case 9:
                function1.invoke(NearbyPaymentKeypadViewEvent.OnMoreInfoClicked.INSTANCE);
                break;
            case 10:
                function1.invoke(onCloseClicked);
                break;
            case 11:
                function1.invoke(onCloseClicked);
                break;
            case 12:
                function1.invoke(NearbyPaymentKeypadViewEvent.OnInstrumentClicked.INSTANCE);
                break;
            case 13:
                function1.invoke(NearbyPaymentsInfoViewEvent.OnBackClicked.INSTANCE);
                break;
            case 14:
                function1.invoke(NearbyPeopleOverflowSheetViewEvent.OnDismiss.INSTANCE);
                break;
            case 15:
                function1.invoke(NearbyPermissionsPromptSheetViewEvent.OnCloseClicked.INSTANCE);
                break;
            case 16:
                function1.invoke(NearbyPermissionsPromptSheetViewEvent.OnPermissionsAction.INSTANCE);
                break;
            case 17:
                function1.invoke(PersonalizePaymentViewEvent.MusicButtonTapped.INSTANCE);
                break;
            case 18:
                function1.invoke(PersonalizePaymentViewEvent.StickerMenuTapped.INSTANCE);
                break;
            case 19:
                function1.invoke(closeDialog);
                break;
            case 20:
                function1.invoke(closeDialog);
                break;
            case 21:
                function1.invoke(PersonalizePaymentRecipientViewEvent.Close.INSTANCE);
                break;
            case 22:
                function1.invoke(PersonalizePaymentRecipientViewEvent.ReloadResources.INSTANCE);
                break;
            case 23:
                function1.invoke(closeDialog);
                break;
            case 24:
                function1.invoke(PersonalizePaymentRecipientViewEvent.HideMoreReactions.INSTANCE);
                break;
            case 25:
                function1.invoke(back);
                break;
            case 26:
                function1.invoke(back);
                break;
            case 27:
                function1.invoke(PersonalizePaymentViewEvent.Back.INSTANCE);
                break;
            case 28:
                function1.invoke(personalizePaymentViewEvent$DialogEvent$CloseDialog);
                break;
            default:
                function1.invoke(personalizePaymentViewEvent$DialogEvent$CloseDialog);
                break;
        }
        return Unit.INSTANCE;
    }
}
