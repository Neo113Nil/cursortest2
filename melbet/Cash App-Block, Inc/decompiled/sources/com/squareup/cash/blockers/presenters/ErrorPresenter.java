package com.squareup.cash.blockers.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.screens.app.LocalMenuPickerScreen;
import app.cash.local.viewmodels.sheet.MenuPickerSheetModel;
import coil3.RealImageLoader$execute$2;
import com.google.android.gms.internal.mlkit_genai_prompt.zzafe;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.account.presenters.EditProfilePresenter$models$2$1;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletNotificationScreen;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletNotificationViewModel;
import com.squareup.cash.appmessages.AppMessageErrorViewModel;
import com.squareup.cash.arcade.components.ToastKt$Toast$9$1;
import com.squareup.cash.banking.presenters.DemandDepositDialogPresenter$Response;
import com.squareup.cash.banking.screens.DemandDepositDialogScreen;
import com.squareup.cash.banking.viewmodels.DemandDepositDialogViewModel;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.billssubscriptions.fixtures.FakeMerchants;
import com.squareup.cash.billssubscriptions.viewmodels.BillsSubscriptionsMerchantListViewModel$Loaded;
import com.squareup.cash.billssubscriptions.viewmodels.model.MerchantCatalog;
import com.squareup.cash.bitcoin.graph.api.model.BitcoinGraphModel;
import com.squareup.cash.bitcoin.graph.real.RealBitcoinGraphPresenter$State;
import com.squareup.cash.bitcoin.presenters.limits.BitcoinLimitsLoadingPresenter$models$$inlined$CollectEffect$1;
import com.squareup.cash.bitcoin.screens.BitcoinDepositNoteScreen;
import com.squareup.cash.bitcoin.screens.BitcoinMapErrorScreen;
import com.squareup.cash.bitcoin.screens.BitcoinNoteQuestion;
import com.squareup.cash.bitcoin.viewmodels.deposits.note.BitcoinDepositNoteViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapErrorViewModel;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.screens.InstrumentSelectionData;
import com.squareup.cash.blockers.viewmodels.CashtagConfirmationViewModel;
import com.squareup.cash.blockers.viewmodels.CashtagErrorViewModel;
import com.squareup.cash.blockers.viewmodels.ConfirmableOptionViewModel;
import com.squareup.cash.blockers.viewmodels.ErrorViewModel;
import com.squareup.cash.blockers.viewmodels.FilesetUploadErrorViewModel;
import com.squareup.cash.blockers.viewmodels.HelpItemMessageViewModel;
import com.squareup.cash.blockers.viewmodels.IneligibleMergeViewModel;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionDetailsSheetViewModel;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionDetailsViewModel;
import com.squareup.cash.blockers.viewmodels.InvalidInputViewModel;
import com.squareup.cash.blockers.viewmodels.RegisterErrorViewModel;
import com.squareup.cash.blockers.viewmodels.RemoteSkipErrorViewModel;
import com.squareup.cash.blockers.viewmodels.SkipVerifyViewModel;
import com.squareup.cash.blockers.viewmodels.UnselectableOptionViewModel;
import com.squareup.cash.blockers.viewmodels.VerifyErrorViewModel;
import com.squareup.cash.blockers.viewmodels.VerifyHelpItem;
import com.squareup.cash.blockers.viewmodels.VerifyHelpViewModel;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$2;
import com.squareup.cash.boost.backend.RealBoostSelector$removeBoost$1;
import com.squareup.cash.card.onboarding.CardStudioMoreSheetViewModel;
import com.squareup.cash.card.onboarding.CardStudioPresenter$models$1$1;
import com.squareup.cash.card.onboarding.ConfirmExitDisclosureViewModel;
import com.squareup.cash.card.onboarding.screens.CardStudioMoreSheetScreen;
import com.squareup.cash.card.onboarding.screens.DisclosureExitConfirmationScreen;
import com.squareup.cash.cashapplite.viewmodels.KycAppletTileModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.instruments.viewmodels.InstrumentAvatarViewModel;
import com.squareup.cash.limits.backend.real.RealLimitsStore;
import com.squareup.cash.maps.presenter.CashMapPresenter$models$3$1;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$AppMessageErrorScreen;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$UptoDateData;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntriesList;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes4.dex */
public final class ErrorPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId;
    public final Object args;
    public final Object navigator;

    public ErrorPresenter(BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 5;
        this.navigator = screenNavigator;
        this.args = FlowKt.MutableStateFlow(FakeMerchants.catalog);
    }

    public static final DemandDepositDialogPresenter$Response access$toPossibleClientScenario(ErrorPresenter errorPresenter, BalanceData.Dialog.Button button) {
        BalanceData.Dialog.Button.Action action = button.action;
        action.getClass();
        int ordinal = action.ordinal();
        if (ordinal == 0) {
            ClientScenario clientScenario = button.client_scenario;
            clientScenario.getClass();
            return new DemandDepositDialogPresenter$Response.DoClientScenario(clientScenario);
        }
        if (ordinal == 1) {
            return DemandDepositDialogPresenter$Response.Dismiss.INSTANCE;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public void HandleViewEvents(Flow flow, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1295088128);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(flow) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Updater.LaunchedEffect(gapComposer, flow, new AmountBlockerPresenter$models$1$2(flow, (Continuation) null, this, 12));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(this, flow, i, 29);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v37 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        Object obj;
        int i2 = this.$r8$classId;
        int i3 = 4;
        int i4 = 22;
        int i5 = 6;
        int i6 = 3;
        int i7 = 11;
        int i8 = 20;
        int i9 = 2;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i10 = 10;
        Object obj2 = this.args;
        DemandDepositDialogViewModel.Button button = 0;
        switch (i2) {
            case 0:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-1166175014);
                Updater.LaunchedEffect(gapComposer, flow, new CashtagPresenter$models$2$1(flow, (Continuation) button, this, i8));
                BlockersScreens.Error error = (BlockersScreens.Error) obj2;
                ErrorViewModel errorViewModel = new ErrorViewModel(error.title, error.message);
                gapComposer.end(false);
                return errorViewModel;
            case 1:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(2047774548);
                Updater.LaunchedEffect(gapComposer2, flow, new RealImageLoader$execute$2(flow, (Continuation) button, this, i10));
                MenuPickerSheetModel menuPickerSheetModel = new MenuPickerSheetModel(((LocalMenuPickerScreen) obj2).menus);
                gapComposer2.end(false);
                return menuPickerSheetModel;
            case 2:
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(1987562894);
                Updater.LaunchedEffect(gapComposer3, flow, new EditProfilePresenter$models$2$1(flow, (Continuation) button, this, 26));
                AfterpayAppletScreen$AfterpayAppletNotificationScreen afterpayAppletScreen$AfterpayAppletNotificationScreen = (AfterpayAppletScreen$AfterpayAppletNotificationScreen) obj2;
                String str = afterpayAppletScreen$AfterpayAppletNotificationScreen.title;
                String str2 = afterpayAppletScreen$AfterpayAppletNotificationScreen.subtitle;
                Long l = afterpayAppletScreen$AfterpayAppletNotificationScreen.timeUntilDismissMillis;
                AfterpayAppletNotificationViewModel afterpayAppletNotificationViewModel = new AfterpayAppletNotificationViewModel(Long.valueOf(l != null ? l.longValue() : 3000L), str, str2);
                gapComposer3.end(false);
                return afterpayAppletNotificationViewModel;
            case 3:
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(-1391898210);
                Updater.LaunchedEffect(gapComposer4, flow, new ToastKt$Toast$9$1(flow, (Continuation) button, this, i3));
                AppMessageErrorViewModel appMessageErrorViewModel = new AppMessageErrorViewModel(((PaymentScreens$HomeScreens$AppMessageErrorScreen) obj2).messageRes);
                gapComposer4.end(false);
                return appMessageErrorViewModel;
            case 4:
                flow.getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(-275885712);
                Updater.LaunchedEffect(gapComposer5, flow, new ToastKt$Toast$9$1(flow, (Continuation) button, this, 15));
                BalanceData.Dialog dialog = ((DemandDepositDialogScreen) obj2).dialog;
                String str3 = dialog.title;
                String str4 = dialog.main_text;
                str4.getClass();
                BalanceData.Dialog.Button button2 = dialog.primary_button;
                button2.getClass();
                String str5 = button2.text;
                str5.getClass();
                DemandDepositDialogViewModel.Button button3 = new DemandDepositDialogViewModel.Button(str5);
                BalanceData.Dialog.Button button4 = dialog.secondary_button;
                if (button4 != null) {
                    String str6 = button4.text;
                    str6.getClass();
                    button = new DemandDepositDialogViewModel.Button(str6);
                }
                DemandDepositDialogViewModel demandDepositDialogViewModel = new DemandDepositDialogViewModel(str3, str4, button3, button);
                gapComposer5.end(false);
                return demandDepositDialogViewModel;
            case 5:
                flow.getClass();
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(493436715);
                MutableState collectAsState = Updater.collectAsState((StateFlowImpl) obj2, null, gapComposer6, 1);
                Updater.LaunchedEffect(gapComposer6, flow, new ToastKt$Toast$9$1(flow, (Continuation) button, this, 23));
                BillsSubscriptionsMerchantListViewModel$Loaded billsSubscriptionsMerchantListViewModel$Loaded = new BillsSubscriptionsMerchantListViewModel$Loaded(null, ((MerchantCatalog) collectAsState.getValue()).sections, ((MerchantCatalog) collectAsState.getValue()).categories, false);
                gapComposer6.end(false);
                return billsSubscriptionsMerchantListViewModel$Loaded;
            case 6:
                flow.getClass();
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(456312029);
                Object rememberedValue = gapComposer7.rememberedValue();
                Continuation continuation = null;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Updater.mutableStateOf$default(new RealBitcoinGraphPresenter$State(null, null, true, false));
                    gapComposer7.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState2 = (MutableState) rememberedValue;
                Object rememberedValue2 = gapComposer7.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = Updater.mutableStateOf$default(new InvestingGraphContentModel.Loading(new InvestingGraphContentModel$AccentColorType$UptoDateData(ColorModel.Bitcoin.INSTANCE), 15));
                    gapComposer7.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState3 = (MutableState) rememberedValue2;
                HistoricalRange historicalRange = ((RealBitcoinGraphPresenter$State) mutableState2.getValue()).selectedRange;
                if (historicalRange != null) {
                    gapComposer7.startReplaceGroup(-1106477359);
                    mutableState = mutableState2;
                    Updater.LaunchedEffect(gapComposer7, historicalRange, new BenefitsHubPresenter$models$1$1(18, mutableState2, historicalRange, this, continuation));
                    gapComposer7.end(false);
                } else {
                    mutableState = mutableState2;
                    gapComposer7.startReplaceGroup(-1106436997);
                    gapComposer7.end(false);
                }
                BitcoinGraphModel bitcoinGraphModel = ((RealBitcoinGraphPresenter$State) mutableState.getValue()).graphModel;
                if (bitcoinGraphModel != null) {
                    gapComposer7.startReplaceGroup(-1106477359);
                    zzmh zzmhVar = new zzmh(bitcoinGraphModel, continuation, this, mutableState3, 19);
                    continuation = null;
                    Updater.LaunchedEffect(gapComposer7, bitcoinGraphModel, zzmhVar);
                    gapComposer7.end(false);
                } else {
                    gapComposer7.startReplaceGroup(-1106436997);
                    gapComposer7.end(false);
                }
                MutableState mutableState4 = mutableState;
                Updater.LaunchedEffect(gapComposer7, flow, new BenefitsHubPresenter$models$1$1(17, mutableState4, flow, this, continuation));
                if (((RealBitcoinGraphPresenter$State) mutableState4.getValue()).selectedRange == null || ((RealBitcoinGraphPresenter$State) mutableState4.getValue()).graphModel == null) {
                    obj = (InvestingGraphContentModel) mutableState3.getValue();
                } else if (((RealBitcoinGraphPresenter$State) mutableState4.getValue()).isSwitchingRange) {
                    InvestingGraphContentModel investingGraphContentModel = (InvestingGraphContentModel) mutableState3.getValue();
                    investingGraphContentModel.getClass();
                    InvestingGraphContentModel.Loaded loaded = (InvestingGraphContentModel.Loaded) investingGraphContentModel;
                    obj = new InvestingGraphContentModel.Loading(loaded.points, loaded.smoothedPoints, loaded.graphWidth, loaded.minimumHeightRange, loaded.accentColor);
                } else {
                    obj = (InvestingGraphContentModel) mutableState3.getValue();
                }
                gapComposer7.end(false);
                return obj;
            case 7:
                flow.getClass();
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startReplaceGroup(-1707994076);
                HandleViewEvents(flow, gapComposer8, i & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                String str7 = ((BitcoinNoteQuestion) ((BitcoinDepositNoteScreen) obj2).askedQuestion.question).currentNote;
                BitcoinDepositNoteViewModel bitcoinDepositNoteViewModel = new BitcoinDepositNoteViewModel(str7, !StringsKt.isBlank(str7 == null ? "" : str7));
                gapComposer8.end(false);
                return bitcoinDepositNoteViewModel;
            case 8:
                m3423models(flow, composer, i);
                return Unit.INSTANCE;
            case 9:
                flow.getClass();
                GapComposer gapComposer9 = (GapComposer) composer;
                gapComposer9.startReplaceGroup(2040579241);
                Updater.LaunchedEffect(gapComposer9, flow, new AmountBlockerPresenter$models$1$2(flow, (Continuation) button, this, 13));
                BitcoinMapErrorScreen bitcoinMapErrorScreen = (BitcoinMapErrorScreen) obj2;
                BitcoinMapErrorViewModel bitcoinMapErrorViewModel = new BitcoinMapErrorViewModel(bitcoinMapErrorScreen.title, bitcoinMapErrorScreen.details, bitcoinMapErrorScreen.actionPositiveText, bitcoinMapErrorScreen.actionNegativeText);
                gapComposer9.end(false);
                return bitcoinMapErrorViewModel;
            case 10:
                m3423models(flow, composer, i);
                return Unit.INSTANCE;
            case 11:
                flow.getClass();
                GapComposer gapComposer10 = (GapComposer) composer;
                gapComposer10.startReplaceGroup(-820929554);
                Updater.LaunchedEffect(gapComposer10, flow, new CashtagPresenter$models$2$1(flow, (Continuation) button, this, i7));
                CashtagConfirmationViewModel cashtagConfirmationViewModel = new CashtagConfirmationViewModel(((BlockersScreens.CashtagConfirmationScreen) obj2).message);
                gapComposer10.end(false);
                return cashtagConfirmationViewModel;
            case 12:
                flow.getClass();
                GapComposer gapComposer11 = (GapComposer) composer;
                gapComposer11.startReplaceGroup(-1048278293);
                Updater.LaunchedEffect(gapComposer11, flow, new CashtagPresenter$models$2$1(flow, (Continuation) button, this, 12));
                CashtagErrorViewModel cashtagErrorViewModel = new CashtagErrorViewModel(((BlockersScreens.CashtagErrorScreen) obj2).message);
                gapComposer11.end(false);
                return cashtagErrorViewModel;
            case 13:
                m3423models(flow, composer, i);
                return Unit.INSTANCE;
            case 14:
                flow.getClass();
                GapComposer gapComposer12 = (GapComposer) composer;
                gapComposer12.startReplaceGroup(228576481);
                Updater.LaunchedEffect(gapComposer12, flow, new CashtagPresenter$models$2$1(flow, (Continuation) button, this, 18));
                BlockersScreens.ConfirmableOptionDialog confirmableOptionDialog = (BlockersScreens.ConfirmableOptionDialog) obj2;
                ConfirmableOptionViewModel confirmableOptionViewModel = new ConfirmableOptionViewModel(confirmableOptionDialog.title, confirmableOptionDialog.message, confirmableOptionDialog.confirmButtonText, confirmableOptionDialog.cancelButtonText);
                gapComposer12.end(false);
                return confirmableOptionViewModel;
            case 15:
                flow.getClass();
                GapComposer gapComposer13 = (GapComposer) composer;
                gapComposer13.startReplaceGroup(702963563);
                Updater.LaunchedEffect(gapComposer13, flow, new CashtagPresenter$models$2$1(flow, (Continuation) button, this, i4));
                BlockersScreens.FilesetUploadErrorDialog filesetUploadErrorDialog = (BlockersScreens.FilesetUploadErrorDialog) obj2;
                FilesetUploadErrorViewModel filesetUploadErrorViewModel = new FilesetUploadErrorViewModel(filesetUploadErrorDialog.title, filesetUploadErrorDialog.message, filesetUploadErrorDialog.cancelButtonText, filesetUploadErrorDialog.showRetryButton);
                gapComposer13.end(false);
                return filesetUploadErrorViewModel;
            case 16:
                flow.getClass();
                GapComposer gapComposer14 = (GapComposer) composer;
                gapComposer14.startReplaceGroup(2012691237);
                Updater.LaunchedEffect(gapComposer14, flow, new CashtagPresenter$models$2$1(flow, (Continuation) button, this, 29));
                BlockersScreens.HelpItemMessage helpItemMessage = (BlockersScreens.HelpItemMessage) obj2;
                HelpItemMessageViewModel helpItemMessageViewModel = new HelpItemMessageViewModel(helpItemMessage.messageTitle, helpItemMessage.messageText);
                gapComposer14.end(false);
                return helpItemMessageViewModel;
            case 17:
                flow.getClass();
                GapComposer gapComposer15 = (GapComposer) composer;
                gapComposer15.startReplaceGroup(-1335818066);
                Updater.LaunchedEffect(gapComposer15, flow, new PasscodePresenter$models$1$2(flow, (Continuation) button, this, i9));
                IneligibleMergeViewModel ineligibleMergeViewModel = new IneligibleMergeViewModel(((BlockersScreens.IneligibleMergeScreen) obj2).message);
                gapComposer15.end(false);
                return ineligibleMergeViewModel;
            case 18:
                flow.getClass();
                GapComposer gapComposer16 = (GapComposer) composer;
                gapComposer16.startReplaceGroup(728892303);
                Updater.LaunchedEffect(gapComposer16, flow, new PasscodePresenter$models$1$2(flow, (Continuation) button, this, i6));
                InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailInfoDialog detailInfoDialog = ((BlockersScreens.InstrumentSelectionDetailsDialogScreen) obj2).dialog;
                InstrumentSelectionDetailsViewModel instrumentSelectionDetailsViewModel = new InstrumentSelectionDetailsViewModel(detailInfoDialog.title, detailInfoDialog.buttonText);
                gapComposer16.end(false);
                return instrumentSelectionDetailsViewModel;
            case 19:
                flow.getClass();
                GapComposer gapComposer17 = (GapComposer) composer;
                gapComposer17.startReplaceGroup(1645664148);
                Updater.LaunchedEffect(gapComposer17, flow, new PasscodePresenter$models$1$2(flow, (Continuation) button, this, i3));
                BlockersScreens.InstrumentSelectionDetailsScreen instrumentSelectionDetailsScreen = (BlockersScreens.InstrumentSelectionDetailsScreen) obj2;
                InstrumentSelectionData.InstrumentOption instrumentOption = instrumentSelectionDetailsScreen.option;
                InstrumentSelectionData.InstrumentOption.Enabled.OptionDialog optionDialog = instrumentSelectionDetailsScreen.dialog;
                int id = instrumentOption.getId();
                Image image = instrumentOption.getData().avatar;
                InstrumentAvatarViewModel instrumentAvatarViewModel = new InstrumentAvatarViewModel(image != null ? zzafe.toAvatarImage(image) : null, zzafe.toFallbackIcon(instrumentOption.getData().iconStyle), instrumentSelectionDetailsScreen.enabled);
                String str8 = (String) optionDialog.title.getValue();
                Redacted redacted = optionDialog.body;
                InstrumentSelectionDetailsSheetViewModel instrumentSelectionDetailsSheetViewModel = new InstrumentSelectionDetailsSheetViewModel(id, instrumentAvatarViewModel, str8, redacted != null ? (String) redacted.getValue() : null, optionDialog.submitButtonText, optionDialog.blockerAction, optionDialog.dismissButtonText);
                gapComposer17.end(false);
                return instrumentSelectionDetailsSheetViewModel;
            case 20:
                flow.getClass();
                GapComposer gapComposer18 = (GapComposer) composer;
                gapComposer18.startReplaceGroup(-1972232679);
                Updater.LaunchedEffect(gapComposer18, flow, new PasscodePresenter$models$1$2(flow, (Continuation) button, this, i5));
                BlockersScreens.InvalidInputScreen invalidInputScreen = (BlockersScreens.InvalidInputScreen) obj2;
                InvalidInputViewModel invalidInputViewModel = new InvalidInputViewModel(invalidInputScreen.message, invalidInputScreen.title);
                gapComposer18.end(false);
                return invalidInputViewModel;
            case 21:
                flow.getClass();
                GapComposer gapComposer19 = (GapComposer) composer;
                gapComposer19.startReplaceGroup(371468439);
                Updater.LaunchedEffect(gapComposer19, flow, new PasscodePresenter$models$1$2(flow, (Continuation) button, this, i4));
                RegisterErrorViewModel registerErrorViewModel = new RegisterErrorViewModel(((BlockersScreens.RegisterErrorScreen) obj2).message);
                gapComposer19.end(false);
                return registerErrorViewModel;
            case 22:
                flow.getClass();
                GapComposer gapComposer20 = (GapComposer) composer;
                gapComposer20.startReplaceGroup(-780107819);
                Updater.LaunchedEffect(gapComposer20, flow, new PasscodePresenter$models$1$2(flow, (Continuation) button, this, 23));
                RemoteSkipErrorViewModel remoteSkipErrorViewModel = new RemoteSkipErrorViewModel(((BlockersScreens.RemoteSkipErrorScreen) obj2).message);
                gapComposer20.end(false);
                return remoteSkipErrorViewModel;
            case 23:
                flow.getClass();
                GapComposer gapComposer21 = (GapComposer) composer;
                gapComposer21.startReplaceGroup(679850580);
                Updater.LaunchedEffect(gapComposer21, flow, new FileBlockerView$6$2$2(flow, (Continuation) button, this, i9));
                SkipVerifyViewModel skipVerifyViewModel = new SkipVerifyViewModel(((BlockersScreens.SkipVerifyScreen) obj2).message);
                gapComposer21.end(false);
                return skipVerifyViewModel;
            case 24:
                flow.getClass();
                GapComposer gapComposer22 = (GapComposer) composer;
                gapComposer22.startReplaceGroup(1293697832);
                Updater.LaunchedEffect(gapComposer22, flow, new FileBlockerView$6$2$2(flow, (Continuation) button, this, i5));
                UnselectableOptionViewModel unselectableOptionViewModel = new UnselectableOptionViewModel(((BlockersScreens.UnselectableOptionDialog) obj2).message);
                gapComposer22.end(false);
                return unselectableOptionViewModel;
            case 25:
                flow.getClass();
                GapComposer gapComposer23 = (GapComposer) composer;
                gapComposer23.startReplaceGroup(-1503512511);
                Updater.LaunchedEffect(gapComposer23, flow, new FileBlockerView$6$2$2(flow, (Continuation) button, this, i10));
                VerifyErrorViewModel verifyErrorViewModel = new VerifyErrorViewModel(((BlockersScreens.VerifyErrorScreen) obj2).message);
                gapComposer23.end(false);
                return verifyErrorViewModel;
            case 26:
                BlockersScreens.VerifyHelpScreen verifyHelpScreen = (BlockersScreens.VerifyHelpScreen) obj2;
                List list = verifyHelpScreen.helpItems;
                flow.getClass();
                GapComposer gapComposer24 = (GapComposer) composer;
                gapComposer24.startReplaceGroup(625466578);
                Updater.LaunchedEffect(gapComposer24, flow, new FileBlockerView$6$2$2(flow, (Continuation) button, this, i7));
                Object rememberedValue3 = gapComposer24.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = list == null ? EmptyList.INSTANCE : list;
                    gapComposer24.updateRememberedValue(rememberedValue3);
                }
                List list2 = (List) rememberedValue3;
                Object rememberedValue4 = gapComposer24.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    EnumEntriesList enumEntriesList = VerifyHelpItem.$ENTRIES;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = enumEntriesList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        int ordinal = ((VerifyHelpItem) next).ordinal();
                        if (ordinal != 0 && ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                if (verifyHelpScreen.showSkip) {
                                    List list3 = list;
                                    if (list3 != null && !list3.isEmpty()) {
                                    }
                                    arrayList.add(next);
                                }
                            } else if (verifyHelpScreen.f1063type == BlockersScreens.VerifyHelpScreen.Type.PHONE) {
                                arrayList.add(next);
                            }
                        }
                    }
                    gapComposer24.updateRememberedValue(arrayList);
                    rememberedValue4 = arrayList;
                }
                VerifyHelpViewModel verifyHelpViewModel = new VerifyHelpViewModel(list2, (List) rememberedValue4);
                gapComposer24.end(false);
                return verifyHelpViewModel;
            case 27:
                CardStudioMoreSheetScreen cardStudioMoreSheetScreen = (CardStudioMoreSheetScreen) obj2;
                flow.getClass();
                GapComposer gapComposer25 = (GapComposer) composer;
                gapComposer25.startReplaceGroup(1142703805);
                Object rememberedValue5 = gapComposer25.rememberedValue();
                if (rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = Recorder$$ExternalSyntheticOutline1.m(cardStudioMoreSheetScreen.isShowingCashtag, gapComposer25);
                }
                MutableState mutableState5 = (MutableState) rememberedValue5;
                Updater.LaunchedEffect(gapComposer25, flow, new RealBoostSelector$removeBoost$1(flow, (Continuation) null, this, mutableState5, 20));
                CardStudioMoreSheetViewModel cardStudioMoreSheetViewModel = new CardStudioMoreSheetViewModel(cardStudioMoreSheetScreen.cashtag, ((Boolean) mutableState5.getValue()).booleanValue(), cardStudioMoreSheetScreen.isShowingCashtagToggle);
                gapComposer25.end(false);
                return cardStudioMoreSheetViewModel;
            case 28:
                flow.getClass();
                GapComposer gapComposer26 = (GapComposer) composer;
                gapComposer26.startReplaceGroup(-36455036);
                Updater.LaunchedEffect(gapComposer26, flow, new CardStudioPresenter$models$1$1(flow, (Continuation) button, this, i10));
                DisclosureExitConfirmationScreen disclosureExitConfirmationScreen = (DisclosureExitConfirmationScreen) obj2;
                ConfirmExitDisclosureViewModel confirmExitDisclosureViewModel = new ConfirmExitDisclosureViewModel(disclosureExitConfirmationScreen.message, disclosureExitConfirmationScreen.negativeButtonText, disclosureExitConfirmationScreen.positiveButtonText);
                gapComposer26.end(false);
                return confirmExitDisclosureViewModel;
            default:
                flow.getClass();
                GapComposer gapComposer27 = (GapComposer) composer;
                gapComposer27.startReplaceGroup(-1800229693);
                Updater.LaunchedEffect(gapComposer27, flow, new CardStudioPresenter$models$1$1(flow, (Continuation) button, this, i8));
                KycAppletTileModel kycAppletTileModel = new KycAppletTileModel();
                gapComposer27.end(false);
                return kycAppletTileModel;
        }
    }

    public /* synthetic */ ErrorPresenter(BetterNavigator.ScreenNavigator screenNavigator, BlockersScreens.BlockersDialogScreens blockersDialogScreens, int i) {
        this.$r8$classId = i;
        this.navigator = screenNavigator;
        this.args = blockersDialogScreens;
    }

    public ErrorPresenter(PaymentScreens$HomeScreens$AppMessageErrorScreen paymentScreens$HomeScreens$AppMessageErrorScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 3;
        paymentScreens$HomeScreens$AppMessageErrorScreen.getClass();
        this.args = paymentScreens$HomeScreens$AppMessageErrorScreen;
        this.navigator = screenNavigator;
    }

    public ErrorPresenter(DisclosureExitConfirmationScreen disclosureExitConfirmationScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 28;
        disclosureExitConfirmationScreen.getClass();
        this.args = disclosureExitConfirmationScreen;
        this.navigator = screenNavigator;
    }

    public ErrorPresenter(BlockersScreens.BlockerActionFileDownloadFailureDialogScreen blockerActionFileDownloadFailureDialogScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 10;
        blockerActionFileDownloadFailureDialogScreen.getClass();
        this.args = blockerActionFileDownloadFailureDialogScreen;
        this.navigator = screenNavigator;
    }

    public ErrorPresenter(CardStudioMoreSheetScreen cardStudioMoreSheetScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 27;
        cardStudioMoreSheetScreen.getClass();
        this.args = cardStudioMoreSheetScreen;
        this.navigator = screenNavigator;
    }

    public ErrorPresenter(BetterNavigator.ScreenNavigator screenNavigator, BitcoinDepositNoteScreen bitcoinDepositNoteScreen) {
        this.$r8$classId = 7;
        bitcoinDepositNoteScreen.getClass();
        this.navigator = screenNavigator;
        this.args = bitcoinDepositNoteScreen;
    }

    public ErrorPresenter(FlowStarter flowStarter, Navigator navigator) {
        this.$r8$classId = 29;
        navigator.getClass();
        this.args = flowStarter;
        this.navigator = navigator;
    }

    public ErrorPresenter(BitcoinMapErrorScreen bitcoinMapErrorScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 9;
        bitcoinMapErrorScreen.getClass();
        this.args = bitcoinMapErrorScreen;
        this.navigator = screenNavigator;
    }

    public ErrorPresenter(BetterNavigator.ScreenNavigator screenNavigator, LocalMenuPickerScreen localMenuPickerScreen) {
        this.$r8$classId = 1;
        localMenuPickerScreen.getClass();
        this.navigator = screenNavigator;
        this.args = localMenuPickerScreen;
    }

    public ErrorPresenter(BetterNavigator.ScreenNavigator screenNavigator, AfterpayAppletScreen$AfterpayAppletNotificationScreen afterpayAppletScreen$AfterpayAppletNotificationScreen) {
        this.$r8$classId = 2;
        afterpayAppletScreen$AfterpayAppletNotificationScreen.getClass();
        this.navigator = screenNavigator;
        this.args = afterpayAppletScreen$AfterpayAppletNotificationScreen;
    }

    public /* synthetic */ ErrorPresenter(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.args = obj;
        this.navigator = obj2;
    }

    public ErrorPresenter(DemandDepositDialogScreen demandDepositDialogScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 4;
        demandDepositDialogScreen.getClass();
        this.args = demandDepositDialogScreen;
        this.navigator = screenNavigator;
    }

    /* renamed from: models, reason: collision with other method in class */
    public void m3423models(Flow flow, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = this.$r8$classId;
        Continuation continuation = null;
        int i6 = 1;
        flow.getClass();
        switch (i5) {
            case 8:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(-1146316499);
                if ((i & 6) == 0) {
                    i2 = i | (gapComposer.changedInstance(flow) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= gapComposer.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new SafeFlow(new CashMapPresenter$models$3$1((RealLimitsStore) this.args, null));
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Flow flow2 = (Flow) rememberedValue;
                    Updater.LaunchedEffect(gapComposer, flow2, new BitcoinLimitsLoadingPresenter$models$$inlined$CollectEffect$1(flow2, continuation, this, r7 ? 1 : 0));
                    Updater.LaunchedEffect(gapComposer, flow, new BitcoinLimitsLoadingPresenter$models$$inlined$CollectEffect$1(flow, continuation, this, i6));
                } else {
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(this, flow, i, i6);
                    break;
                }
                break;
            case 9:
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startRestartGroup(1070652672);
                if ((i & 6) == 0) {
                    i4 = i | (gapComposer2.changedInstance(flow) ? 4 : 2);
                } else {
                    i4 = i;
                }
                if ((i & 48) == 0) {
                    i4 |= gapComposer2.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer2.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer2, flow, new CashtagPresenter$models$2$1(flow, continuation, this, 15));
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(this, flow, i, 22);
                    break;
                }
                break;
            case 10:
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startRestartGroup(800569683);
                if ((i & 6) == 0) {
                    i3 = i | (gapComposer3.changedInstance(flow) ? 4 : 2);
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= gapComposer3.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer3.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer3, flow, new AmountBlockerPresenter$models$1$2(flow, continuation, this, 26));
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup3 = gapComposer3.endRestartGroup();
                if (endRestartGroup3 != null) {
                    endRestartGroup3.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(this, flow, i, 14);
                    break;
                }
                break;
        }
    }
}
