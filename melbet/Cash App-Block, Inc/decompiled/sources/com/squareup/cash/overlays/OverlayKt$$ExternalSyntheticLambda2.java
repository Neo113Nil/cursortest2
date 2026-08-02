package com.squareup.cash.overlays;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListLayoutInfoKt;
import androidx.compose.foundation.pager.LazyLayoutPagerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DistanceAndFlags;
import androidx.compose.ui.node.HitTestResultKt;
import com.squareup.cash.avatar.components.BadgedAvatarKt;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.SlotContent;
import com.squareup.cash.moneybot.viewmodels.RawMessagesViewModel;
import com.squareup.cash.moneybot.viewmodels.staticpicker.MoneybotStaticPickerViewModel;
import com.squareup.cash.moneybot.viewmodels.textinput.MoneybotTextInputViewModel;
import com.squareup.cash.moneybot.views.plugins.SlottedTableKt;
import com.squareup.cash.nearby.viewmodels.NearbyOrderedListsViewModel;
import com.squareup.cash.nearby.views.DotGridKt;
import com.squareup.cash.nfc.presenters.NfcNotAvailablePresenter;
import com.squareup.cash.offers.viewmodels.ArcadeOffersTimelineViewModels;
import com.squareup.cash.offers.viewmodels.OffersDetailsSheetViewModelV2;
import com.squareup.cash.offers.viewmodels.OffersGreenStatusViewModel;
import com.squareup.cash.offers.viewmodels.OffersHomeViewModelV2;
import com.squareup.cash.offers.viewmodels.OffersTimelineViewModelV2;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel;
import com.squareup.cash.offers.views.UtilsKt;
import com.squareup.cash.offers.views.details.OfferDetailsSheetKt;
import com.squareup.cash.offers.views.home.OfferTileKt;
import com.squareup.cash.offers.views.home.OffersHeroTileKt;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingConfirmAccountRemovalScreen;
import com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt;
import com.squareup.cash.p2pblocking.viewmodels.P2PListViewModel;
import com.squareup.cash.p2pblocking.views.P2PListRowKt;
import com.squareup.cash.passkeys.views.PasskeyOperationSheetUiState;
import com.squareup.cash.passkeys.views.PasskeyUpsellViewKt;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.viewmodels.PaycheckAlertDialogViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.paychecks.views.wheel.ReceiptWheelContentKt;
import com.squareup.cash.payments.viewmodels.DuplicatePaymentViewModel;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationTitleViewModel;
import com.squareup.cash.payments.viewmodels.QuickPayDetailsViewModel;
import com.squareup.cash.payments.viewmodels.RecipientSelectionWarningViewModel;
import com.squareup.cash.payments.viewmodels.SchedulePaymentViewModel;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.payments.views.UtilKt;
import com.squareup.cash.payments.views.composer.ErrorKt;
import com.squareup.protos.franklin.common.Reaction;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final /* synthetic */ class OverlayKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ OverlayKt$$ExternalSyntheticLambda2(Modifier modifier, List list, int i, int i2) {
        this.$r8$classId = 28;
        this.f$0 = modifier;
        this.f$2 = i;
        this.f$1 = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                OverlayKt.Overlay((Function0) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                SlottedTableKt.SlottedTable((SlotContent.Table) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                LazyListLayoutInfoKt.RawMessagesView((RawMessagesViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                BadgedAvatarKt.MoneybotStaticPickerView((MoneybotStaticPickerViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                LazyLayoutPagerKt.MoneybotTextInputView((MoneybotTextInputViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                DotGridKt.NearbyOrderedListsView((NearbyOrderedListsViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((NfcNotAvailablePresenter) obj4).m3669models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                UtilsKt.OffersGreenStatusSheet((OffersGreenStatusViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                OfferDetailsSheetKt.GreenStatusSection((OffersDetailsSheetViewModelV2.Loaded.GreenStatusSection) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                OfferDetailsSheetKt.AnimatedOfferButton((OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                OffersHeroTileKt.HeroOffersTileCardContent((OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile) obj4, (Function4) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                OffersHeroTileKt.OffersHeroTileImage((Modifier) obj4, (OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                OfferTileKt.OffersHomeV2Loaded((OffersHomeViewModelV2.Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                DistanceAndFlags.OffersTimelineSheetV2((OffersTimelineViewModelV2) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                HitTestResultKt.OffersTimelineSheet((ArcadeOffersTimelineViewModels) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ((VerifyCheckDialogPresenter) obj4).m3467models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                AliasPickerViewKt.ConfirmAccountRemovalContent((Function1) obj4, (OnboardingConfirmAccountRemovalScreen) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                P2PListRowKt.P2PList((P2PListViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                PasskeyUpsellViewKt.PasskeyOperationSheetContent((PasskeyOperationSheetUiState) obj4, (PaddingValues) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.PaycheckAlertDialog((PaycheckAlertDialogViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1), i2);
                break;
            case 20:
                ((Integer) obj2).getClass();
                ReceiptWheelContentKt.MultipleAllocationsWheelContent((DistributionWheelViewModel.Content.MultipleAllocationsScreen) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                ReceiptWheelContentKt.EditSingleDistributionWheelContent((DistributionWheelViewModel.Content.EditSingleDistributionScreen) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ((InviteErrorPresenter) obj4).m3587models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).intValue();
                QuickPayViewKt.DuplicatePaymentView((Function1) obj4, (DuplicatePaymentViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                QuickPayViewKt.QuickPayDetailsSheetView((QuickPayDetailsViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).intValue();
                QuickPayViewKt.RecipientSelectionWarning((Function1) obj4, (RecipientSelectionWarningViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).intValue();
                QuickPayViewKt.SchedulePaymentView((Function1) obj4, (SchedulePaymentViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                UtilKt.PersonalizedPaymentReactedButton((Modifier) obj4, (Reaction) obj3, (Composer) obj, Updater.updateChangedFlags(1), i2);
                break;
            case 28:
                ((Integer) obj2).getClass();
                UtilKt.TransitionalBackground((Modifier) obj4, i2, (List) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                break;
            default:
                ((Integer) obj2).intValue();
                ErrorKt.Title((PaymentConfigurationTitleViewModel.TitleViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ OverlayKt$$ExternalSyntheticLambda2(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
    }

    public /* synthetic */ OverlayKt$$ExternalSyntheticLambda2(Object obj, Object obj2, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i2;
    }
}
