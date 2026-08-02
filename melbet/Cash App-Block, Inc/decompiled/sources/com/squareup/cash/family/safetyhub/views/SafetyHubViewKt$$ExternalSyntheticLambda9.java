package com.squareup.cash.family.safetyhub.views;

import com.squareup.cash.family.familyhub.viewmodels.SponsorDetailViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.SponsorLedInviteViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.SponsorResourcesViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.U13CelebrationViewEvent$ButtonPressed;
import com.squareup.cash.family.requestsponsorship.viewmodels.ContactPermissionDialogViewEvent;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectContactMethodViewEvent;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorErrorViewEvent$NegativeClick;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorViewEvent;
import com.squareup.cash.family.safetyhub.viewmodels.SafetyEducationPageViewEvent$TapBack;
import com.squareup.cash.family.safetyhub.viewmodels.SafetyHubViewEvent;
import com.squareup.cash.favorites.viewmodels.AddFavoritesViewEvent;
import com.squareup.cash.favorites.viewmodels.FavoriteAddedViewEvent;
import com.squareup.cash.favorites.viewmodels.FavoritesMessageViewEvent$OkClicked;
import com.squareup.cash.favorites.viewmodels.ListFavoritesViewEvent;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class SafetyHubViewKt$$ExternalSyntheticLambda9 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ SafetyHubViewKt$$ExternalSyntheticLambda9(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        U13CelebrationViewEvent$ButtonPressed u13CelebrationViewEvent$ButtonPressed = U13CelebrationViewEvent$ButtonPressed.INSTANCE;
        SafetyHubViewEvent.TapClose tapClose = SafetyHubViewEvent.TapClose.INSTANCE;
        AddFavoritesViewEvent.GrantContactsPermissionClicked grantContactsPermissionClicked = AddFavoritesViewEvent.GrantContactsPermissionClicked.INSTANCE;
        ListFavoritesViewEvent.AddMoreFavorites addMoreFavorites = ListFavoritesViewEvent.AddMoreFavorites.INSTANCE;
        ListFavoritesViewEvent.BackClicked backClicked = ListFavoritesViewEvent.BackClicked.INSTANCE;
        FidesmoProvisioningViewEvent.Close close = FidesmoProvisioningViewEvent.Close.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(tapClose);
                break;
            case 1:
                function1.invoke(SponsorDetailViewEvent.TapBack.INSTANCE);
                break;
            case 2:
                function1.invoke(SponsorDetailViewEvent.TapRequestCash.INSTANCE);
                break;
            case 3:
                function1.invoke(SponsorDetailViewEvent.TapInviteFriends.INSTANCE);
                break;
            case 4:
                function1.invoke(SponsorLedInviteViewEvent.TapBack.INSTANCE);
                break;
            case 5:
                function1.invoke(SponsorLedInviteViewEvent.CtaClicked.INSTANCE);
                break;
            case 6:
                function1.invoke(SponsorResourcesViewEvent.TapBack.INSTANCE);
                break;
            case 7:
                function1.invoke(u13CelebrationViewEvent$ButtonPressed);
                break;
            case 8:
                function1.invoke(u13CelebrationViewEvent$ButtonPressed);
                break;
            case 9:
                function1.invoke(ContactPermissionDialogViewEvent.Confirm.INSTANCE);
                break;
            case 10:
                function1.invoke(ContactPermissionDialogViewEvent.Cancel.INSTANCE);
                break;
            case 11:
                function1.invoke(SelectContactMethodViewEvent.Close.INSTANCE);
                break;
            case 12:
                function1.invoke(SelectSponsorErrorViewEvent$NegativeClick.INSTANCE);
                break;
            case 13:
                function1.invoke(SelectSponsorViewEvent.ClosePressed.INSTANCE);
                break;
            case 14:
                function1.invoke(SelectSponsorViewEvent.EnableContact.INSTANCE);
                break;
            case 15:
                function1.invoke(SelectSponsorViewEvent.SendInviteTapped.INSTANCE);
                break;
            case 16:
                function1.invoke(SafetyEducationPageViewEvent$TapBack.INSTANCE);
                break;
            case 17:
                function1.invoke(tapClose);
                break;
            case 18:
                function1.invoke(grantContactsPermissionClicked);
                break;
            case 19:
                function1.invoke(grantContactsPermissionClicked);
                break;
            case 20:
                function1.invoke(FavoriteAddedViewEvent.CloseClicked.INSTANCE);
                break;
            case 21:
                function1.invoke(FavoritesMessageViewEvent$OkClicked.INSTANCE);
                break;
            case 22:
                function1.invoke(backClicked);
                break;
            case 23:
                function1.invoke(addMoreFavorites);
                break;
            case 24:
                function1.invoke(addMoreFavorites);
                break;
            case 25:
                function1.invoke(backClicked);
                break;
            case 26:
                function1.invoke(close);
                break;
            case 27:
                function1.invoke(close);
                break;
            case 28:
                function1.invoke(close);
                break;
            default:
                function1.invoke(FidesmoProvisioningViewEvent.PreScanInstructionsCompleted.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
