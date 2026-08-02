package com.squareup.cash.card.onboarding;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.ProfilePasswordDialogViewModel$MessageDialog;
import com.squareup.cash.bitcoin.viewmodels.unavailable.BitcoinFeatureUnavailableViewModel;
import com.squareup.cash.blockers.presenters.AmountBlockerPresenter$models$1$2;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentLearnMoreSheetViewModel;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAccountPickerOptionsMenuScreen;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerOptionsMenuViewModel;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter$models$1$1;
import com.squareup.cash.profile.screens.ActivePasswordDialog;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.BasicShieetKt$BasicShieet$4$1;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentAddCardViewModel;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentCancelPlanDialogViewModel;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class CardStudioUndoDialogPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    public CardStudioUndoDialogPresenter(AndroidStringManager androidStringManager, BetterNavigator.ScreenNavigator screenNavigator, ActivePasswordDialog activePasswordDialog) {
        this.$r8$classId = 4;
        activePasswordDialog.getClass();
        this.stringManager = androidStringManager;
        this.navigator = screenNavigator;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        int i2 = this.$r8$classId;
        AndroidStringManager androidStringManager = this.stringManager;
        Continuation continuation = null;
        switch (i2) {
            case 0:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-264318893);
                Updater.LaunchedEffect(gapComposer, flow, new CardStudioPresenter$models$1$1(flow, continuation, this, 6));
                CardStudioUndoDialogViewModel cardStudioUndoDialogViewModel = new CardStudioUndoDialogViewModel(androidStringManager.get(R.string.card_studio_undo_dialog_title), androidStringManager.get(R.string.card_studio_undo_dialog_message), androidStringManager.get(R.string.card_studio_undo_dialog_button), androidStringManager.get(R.string.card_studio_undo_cancel_dialog_button));
                gapComposer.end(false);
                return cardStudioUndoDialogViewModel;
            case 1:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(345605027);
                Updater.LaunchedEffect(gapComposer2, flow, new AmountBlockerPresenter$models$1$2(flow, continuation, this, 21));
                BitcoinFeatureUnavailableViewModel bitcoinFeatureUnavailableViewModel = new BitcoinFeatureUnavailableViewModel(androidStringManager.get(R.string.feature_not_available), androidStringManager.get(R.string.bitcoin_presenters_done_cta));
                gapComposer2.end(false);
                return bitcoinFeatureUnavailableViewModel;
            case 2:
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(-394632302);
                Updater.LaunchedEffect(gapComposer3, flow, new InvestingHomeView$onScrollFlow$1(flow, continuation, this, 19));
                DividendReinvestmentLearnMoreSheetViewModel dividendReinvestmentLearnMoreSheetViewModel = new DividendReinvestmentLearnMoreSheetViewModel(androidStringManager.get(R.string.investing_drip_learn_more_title), androidStringManager.get(R.string.investing_drip_learn_more_dismiss_label), CollectionsKt__CollectionsKt.listOf((Object[]) new DividendReinvestmentLearnMoreSheetViewModel.InfoSection[]{new DividendReinvestmentLearnMoreSheetViewModel.InfoSection(androidStringManager.get(R.string.investing_drip_learn_more_first_entry_title), androidStringManager.get(R.string.investing_drip_learn_more_first_entry_message)), new DividendReinvestmentLearnMoreSheetViewModel.InfoSection(androidStringManager.get(R.string.investing_drip_learn_more_second_entry_title), androidStringManager.get(R.string.investing_drip_learn_more_second_entry_message)), new DividendReinvestmentLearnMoreSheetViewModel.InfoSection(androidStringManager.get(R.string.investing_drip_learn_more_third_entry_title), androidStringManager.get(R.string.investing_drip_learn_more_third_entry_message))}));
                gapComposer3.end(false);
                return dividendReinvestmentLearnMoreSheetViewModel;
            case 3:
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(955653659);
                Updater.LaunchedEffect(gapComposer4, flow, new RealMRIFactory$sign$2(flow, continuation, this, 20));
                Parcelable.Creator<OnboardingAccountPickerOptionsMenuScreen.Result> creator = OnboardingAccountPickerOptionsMenuScreen.Result.CREATOR;
                AccountPickerOptionsMenuViewModel accountPickerOptionsMenuViewModel = new AccountPickerOptionsMenuViewModel(CollectionsKt__CollectionsKt.listOf((Object[]) new AccountPickerOptionsMenuViewModel.Option[]{new AccountPickerOptionsMenuViewModel.Option(0, androidStringManager.get(R.string.account_picker_options_menu_option_remove_account)), new AccountPickerOptionsMenuViewModel.Option(1, androidStringManager.get(R.string.account_picker_options_menu_option_close))}));
                gapComposer4.end(false);
                return accountPickerOptionsMenuViewModel;
            case 4:
                flow.getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(-1970719196);
                Updater.LaunchedEffect(gapComposer5, flow, new PdfPreviewPresenter$models$1$1(flow, continuation, this, 27));
                ProfilePasswordDialogViewModel$MessageDialog profilePasswordDialogViewModel$MessageDialog = new ProfilePasswordDialogViewModel$MessageDialog(androidStringManager.get(R.string.profile_taxes_active_dialog_message));
                gapComposer5.end(false);
                return profilePasswordDialogViewModel$MessageDialog;
            case 5:
                flow.getClass();
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(-28447029);
                Updater.LaunchedEffect(gapComposer6, flow, new BasicShieetKt$BasicShieet$4$1(flow, continuation, this, 25));
                SingleUsePaymentAddCardViewModel singleUsePaymentAddCardViewModel = new SingleUsePaymentAddCardViewModel(androidStringManager.get(R.string.sup_add_card_sheet_title), androidStringManager.get(R.string.sup_add_card_sheet_message), androidStringManager.get(R.string.sup_add_card_sheet_button_text));
                gapComposer6.end(false);
                return singleUsePaymentAddCardViewModel;
            default:
                flow.getClass();
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(-53191093);
                Updater.LaunchedEffect(gapComposer7, flow, new BasicShieetKt$BasicShieet$4$1(flow, continuation, this, 26));
                SingleUsePaymentCancelPlanDialogViewModel singleUsePaymentCancelPlanDialogViewModel = new SingleUsePaymentCancelPlanDialogViewModel(androidStringManager.get(R.string.sup_cancel_plan_dialog_title), androidStringManager.get(R.string.sup_cancel_plan_dialog_message), androidStringManager.get(R.string.sup_cancel_plan_dialog_primary_button), androidStringManager.get(R.string.sup_cancel_plan_dialog_secondary_button));
                gapComposer7.end(false);
                return singleUsePaymentCancelPlanDialogViewModel;
        }
    }

    public CardStudioUndoDialogPresenter(BetterNavigator.ScreenNavigator screenNavigator, AndroidStringManager androidStringManager) {
        this.$r8$classId = 5;
        this.navigator = screenNavigator;
        this.stringManager = androidStringManager;
    }

    public /* synthetic */ CardStudioUndoDialogPresenter(AndroidStringManager androidStringManager, BetterNavigator.ScreenNavigator screenNavigator, int i) {
        this.$r8$classId = i;
        this.stringManager = androidStringManager;
        this.navigator = screenNavigator;
    }

    public CardStudioUndoDialogPresenter(SingleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen singleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen, BetterNavigator.ScreenNavigator screenNavigator, AndroidStringManager androidStringManager) {
        this.$r8$classId = 6;
        singleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen.getClass();
        this.navigator = screenNavigator;
        this.stringManager = androidStringManager;
    }
}
