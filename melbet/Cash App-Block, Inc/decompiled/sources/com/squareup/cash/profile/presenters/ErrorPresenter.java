package com.squareup.cash.profile.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.media3.extractor.ts.TsUtil;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.directoryui.viewmodels.DirectoryAnalyticsDataKt;
import com.squareup.cash.account.settings.viewmodels.ErrorViewModel;
import com.squareup.cash.account.settings.viewmodels.GenericConfirmDialogViewModel;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.payments.presenters.MainPaymentPresenter$models$4$4;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.WarningDialogViewModel;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter$models$1$1;
import com.squareup.cash.profile.screens.GenericConfirmDialog;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.AccountSwitchInfoDialogViewModel;
import com.squareup.cash.profile.viewmodels.AddressSheetViewModel;
import com.squareup.cash.profile.viewmodels.ProfileConfirmRemoveAliasViewModel;
import com.squareup.cash.profile.viewmodels.ProfileCropViewModel;
import com.squareup.cash.profile.viewmodels.ProfileHeaderMenuViewModel;
import com.squareup.cash.profile.viewmodels.RingtoneViewModel;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.cash.savings.viewmodels.TransferOutViewModel$Loading;
import com.squareup.cash.savings.viewmodels.TransferOutViewModel$Ready;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.security.screens.PasswordDialogScreen;
import com.squareup.cash.security.viewmodels.PasswordDialogViewModel;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.sheet.BasicShieetKt$BasicShieet$4$1;
import com.squareup.cash.shopping.settings.screens.ErrorScreen;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentCardDetailsScreen;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.chat.viewmodels.ChatErrorViewModel;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.support.incidents.backend.api.Incident;
import com.squareup.cash.support.presenters.ArticlePresenter$models$1$1;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.screens.SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen;
import com.squareup.cash.support.viewmodels.SupportArticleIncidentsSheetViewModel;
import com.squareup.cash.support.viewmodels.SupportFlowCheckConnectionViewModel;
import com.squareup.cash.support.viewmodels.SupportHomeContactOptionsSheetViewModel;
import com.squareup.cash.tax.primitives.TaxDialogDataModel;
import com.squareup.cash.tax.viewmodels.TaxMenuSheetViewModel;
import com.squareup.cash.tax.viewmodels.TaxWebBridgeDialogViewModel;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.transfers.screens.BalanceBasedAddCashDisabledDialogScreen;
import com.squareup.cash.transfers.screens.TransfersRouterScreen;
import com.squareup.cash.transfers.viewmodels.BalanceBasedAddCashDisabledDialogViewModel;
import com.squareup.cash.transfers.views.AddMoneyViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.wallet.screens.CardControlDialogScreen;
import com.squareup.cash.wallet.viewmodels.CardControlDialogViewModel;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$1$2$1;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.util.cash.StringsKt;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class ErrorPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId;
    public final Object args;
    public final BetterNavigator.ScreenNavigator navigator;

    public ErrorPresenter(SupportChatScreens.SupportChatDialogs.ChatErrorDialog chatErrorDialog, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 13;
        chatErrorDialog.getClass();
        this.args = chatErrorDialog;
        this.navigator = screenNavigator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v9 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        SupportHomeContactOptionsSheetViewModel.ContactOption.Type type2;
        int i2 = this.$r8$classId;
        int i3 = 5;
        int i4 = 23;
        int i5 = 18;
        int i6 = 19;
        int i7 = 17;
        Object obj = this.args;
        switch (i2) {
            case 0:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-325459744);
                Updater.LaunchedEffect(gapComposer, flow, new PdfPreviewPresenter$models$1$1(flow, (Continuation) r11, this, i5));
                ProfileScreens.ErrorScreen errorScreen = (ProfileScreens.ErrorScreen) obj;
                ErrorViewModel errorViewModel = new ErrorViewModel(errorScreen.title, errorScreen.message);
                gapComposer.end(false);
                return errorViewModel;
            case 1:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-1850675766);
                Updater.LaunchedEffect(gapComposer2, flow, new MainPaymentPresenter$models$4$4(flow, (Continuation) r11, this, 29));
                PaymentScreens.WarningDialog warningDialog = (PaymentScreens.WarningDialog) obj;
                Redacted redacted = warningDialog.title;
                String str = redacted != null ? (String) redacted.getValue() : null;
                String str2 = (String) warningDialog.message.getValue();
                Redacted redacted2 = warningDialog.cta;
                WarningDialogViewModel warningDialogViewModel = new WarningDialogViewModel(str, str2, redacted2 != null ? (String) redacted2.getValue() : 0, warningDialog.color);
                gapComposer2.end(false);
                return warningDialogViewModel;
            case 2:
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(-1656664913);
                Updater.LaunchedEffect(gapComposer3, flow, new PdfPreviewPresenter$models$1$1(flow, (Continuation) r11, this, 15));
                ProfileScreens.AccountSwitchInfoDialogScreen accountSwitchInfoDialogScreen = (ProfileScreens.AccountSwitchInfoDialogScreen) obj;
                AccountSwitchInfoDialogViewModel accountSwitchInfoDialogViewModel = new AccountSwitchInfoDialogViewModel(accountSwitchInfoDialogScreen.title, accountSwitchInfoDialogScreen.subtitle, accountSwitchInfoDialogScreen.confirmationButtonText);
                gapComposer3.end(false);
                return accountSwitchInfoDialogViewModel;
            case 3:
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(-1176439289);
                Updater.LaunchedEffect(gapComposer4, flow, new PdfPreviewPresenter$models$1$1(flow, (Continuation) r11, this, i7));
                AddressSheetViewModel addressSheetViewModel = new AddressSheetViewModel(((ProfileScreens.ProfileAddressSheet) obj).address);
                gapComposer4.end(false);
                return addressSheetViewModel;
            case 4:
                flow.getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(-1117055655);
                Updater.LaunchedEffect(gapComposer5, flow, new PdfPreviewPresenter$models$1$1(flow, (Continuation) r11, this, i6));
                GenericConfirmDialog genericConfirmDialog = (GenericConfirmDialog) obj;
                GenericConfirmDialogViewModel genericConfirmDialogViewModel = new GenericConfirmDialogViewModel(genericConfirmDialog.title, genericConfirmDialog.message, genericConfirmDialog.confirmButtonText);
                gapComposer5.end(false);
                return genericConfirmDialogViewModel;
            case 5:
                flow.getClass();
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(-971818995);
                Updater.LaunchedEffect(gapComposer6, flow, new PdfPreviewPresenter$models$1$1(flow, (Continuation) r11, this, i4));
                ProfileScreens.ConfirmRemoveAliasScreen confirmRemoveAliasScreen = (ProfileScreens.ConfirmRemoveAliasScreen) obj;
                ProfileConfirmRemoveAliasViewModel profileConfirmRemoveAliasViewModel = new ProfileConfirmRemoveAliasViewModel(confirmRemoveAliasScreen.f1189type, confirmRemoveAliasScreen.text);
                gapComposer6.end(false);
                return profileConfirmRemoveAliasViewModel;
            case 6:
                flow.getClass();
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(1842251665);
                Updater.LaunchedEffect(gapComposer7, flow, new PdfPreviewPresenter$models$1$1(flow, (Continuation) r11, this, 25));
                ProfileCropViewModel profileCropViewModel = new ProfileCropViewModel(((ProfileScreens.CropScreen) obj).photoUri);
                gapComposer7.end(false);
                return profileCropViewModel;
            case 7:
                flow.getClass();
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startReplaceGroup(1613759821);
                Updater.LaunchedEffect(gapComposer8, flow, new PdfPreviewPresenter$models$1$1(flow, (Continuation) r11, this, 26));
                ProfileHeaderMenuViewModel profileHeaderMenuViewModel = new ProfileHeaderMenuViewModel(((ProfileScreens.HeaderMenuScreen) obj).showClear);
                gapComposer8.end(false);
                return profileHeaderMenuViewModel;
            case 8:
                flow.getClass();
                GapComposer gapComposer9 = (GapComposer) composer;
                gapComposer9.startReplaceGroup(-128831988);
                Updater.LaunchedEffect(gapComposer9, flow, new SelectPaymentPlanBlockerPresenter$models$1$2(flow, r11, this, i3));
                ProfileScreens.RingtoneScreen ringtoneScreen = (ProfileScreens.RingtoneScreen) obj;
                RingtoneViewModel ringtoneViewModel = new RingtoneViewModel(ringtoneScreen.currentRingtone, ringtoneScreen.additionalItems, ringtoneScreen.showDefault, ringtoneScreen.showSilent);
                gapComposer9.end(false);
                return ringtoneViewModel;
            case 9:
                flow.getClass();
                GapComposer gapComposer10 = (GapComposer) composer;
                gapComposer10.startReplaceGroup(-1970614620);
                boolean changed = gapComposer10.changed(flow);
                Object rememberedValue = gapComposer10.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new FlowExtensionsKt$combine$$inlined$combine$1(6, flow, this);
                    gapComposer10.updateRememberedValue(rememberedValue);
                }
                TransferOutViewModel$Ready models = ((ShareSheetPresenter) obj).models((Flow) rememberedValue, (Composer) gapComposer10, 0);
                Object loading = models.equals(TransferOutViewModel$Loading.INSTANCE) ? new AmountPickerViewModel.Loading() : new AmountPickerViewModel.Ready(models.title, models.subtitle, models.submitText, models.minAmount, models.maxAmount, false, null, new AmountSelectorWidgetModel(EmptyList.INSTANCE), null, null, models.submitEnabled, false, null, null, 15200);
                gapComposer10.end(false);
                return loading;
            case 10:
                flow.getClass();
                GapComposer gapComposer11 = (GapComposer) composer;
                gapComposer11.startReplaceGroup(2043670274);
                Updater.LaunchedEffect(gapComposer11, flow, new BasicShieetKt$BasicShieet$4$1(flow, r11, this, i3));
                PasswordDialogViewModel.LoadPasswordDialog loadPasswordDialog = new PasswordDialogViewModel.LoadPasswordDialog(((PasswordDialogScreen) obj).dialog);
                gapComposer11.end(false);
                return loadPasswordDialog;
            case 11:
                flow.getClass();
                GapComposer gapComposer12 = (GapComposer) composer;
                gapComposer12.startReplaceGroup(-1794872480);
                Updater.LaunchedEffect(gapComposer12, flow, new BasicShieetKt$BasicShieet$4$1(flow, r11, this, i4));
                ErrorScreen errorScreen2 = (ErrorScreen) obj;
                com.squareup.cash.shopping.settings.viewmodels.ErrorViewModel errorViewModel2 = new com.squareup.cash.shopping.settings.viewmodels.ErrorViewModel(errorScreen2.title, errorScreen2.message);
                gapComposer12.end(false);
                return errorViewModel2;
            case 12:
                m3725models(flow, composer, i);
                return Unit.INSTANCE;
            case 13:
                flow.getClass();
                GapComposer gapComposer13 = (GapComposer) composer;
                gapComposer13.startReplaceGroup(1811246144);
                Updater.LaunchedEffect(gapComposer13, flow, new ArticlePresenter$models$1$1(flow, (Continuation) r11, this, 4));
                SupportChatScreens.SupportChatDialogs.ChatErrorDialog chatErrorDialog = (SupportChatScreens.SupportChatDialogs.ChatErrorDialog) obj;
                ChatErrorViewModel chatErrorViewModel = new ChatErrorViewModel(chatErrorDialog.title, chatErrorDialog.message);
                gapComposer13.end(false);
                return chatErrorViewModel;
            case 14:
                flow.getClass();
                GapComposer gapComposer14 = (GapComposer) composer;
                gapComposer14.startReplaceGroup(-933666481);
                Updater.LaunchedEffect(gapComposer14, flow, new ArticlePresenter$models$1$1(flow, (Continuation) r11, this, i7));
                ArrayList arrayList = ((SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen) obj).incidents;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(TsUtil.toNotification((Incident) it.next()));
                }
                SupportArticleIncidentsSheetViewModel supportArticleIncidentsSheetViewModel = new SupportArticleIncidentsSheetViewModel(arrayList2);
                gapComposer14.end(false);
                return supportArticleIncidentsSheetViewModel;
            case 15:
                flow.getClass();
                GapComposer gapComposer15 = (GapComposer) composer;
                gapComposer15.startReplaceGroup(-1394273349);
                Updater.LaunchedEffect(gapComposer15, flow, new ArticlePresenter$models$1$1(flow, (Continuation) r11, this, i5));
                SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen supportScreens$SupportDialogs$SupportFlowCheckConnectionScreen = (SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen) obj;
                SupportFlowCheckConnectionViewModel supportFlowCheckConnectionViewModel = new SupportFlowCheckConnectionViewModel(supportScreens$SupportDialogs$SupportFlowCheckConnectionScreen.title, supportScreens$SupportDialogs$SupportFlowCheckConnectionScreen.message);
                gapComposer15.end(false);
                return supportFlowCheckConnectionViewModel;
            case 16:
                flow.getClass();
                GapComposer gapComposer16 = (GapComposer) composer;
                gapComposer16.startReplaceGroup(195203481);
                Updater.LaunchedEffect(gapComposer16, flow, new ArticlePresenter$models$1$1(flow, (Continuation) r11, this, i6));
                List<SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.ContactOption> list = ((SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen) obj).contactOptions;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.ContactOption contactOption : list) {
                    int ordinal = contactOption.f1207type.ordinal();
                    if (ordinal == 0) {
                        type2 = SupportHomeContactOptionsSheetViewModel.ContactOption.Type.CHAT;
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        type2 = SupportHomeContactOptionsSheetViewModel.ContactOption.Type.PHONE;
                    }
                    arrayList3.add(new SupportHomeContactOptionsSheetViewModel.ContactOption(contactOption.title, contactOption.subtitle, type2, contactOption.enabled, contactOption.hasNotificationBadge));
                }
                SupportHomeContactOptionsSheetViewModel supportHomeContactOptionsSheetViewModel = new SupportHomeContactOptionsSheetViewModel(arrayList3);
                gapComposer16.end(false);
                return supportHomeContactOptionsSheetViewModel;
            case 17:
                m3725models(flow, composer, i);
                return Unit.INSTANCE;
            case 18:
                flow.getClass();
                GapComposer gapComposer17 = (GapComposer) composer;
                gapComposer17.startReplaceGroup(459634147);
                Updater.LaunchedEffect(gapComposer17, flow, new TaxWebAppBridge.AnonymousClass4(flow, (Continuation) r11, this, 7));
                TaxMenuSheetViewModel.LoadMenuItems loadMenuItems = new TaxMenuSheetViewModel.LoadMenuItems((List) obj);
                gapComposer17.end(false);
                return loadMenuItems;
            case 19:
                flow.getClass();
                GapComposer gapComposer18 = (GapComposer) composer;
                gapComposer18.startReplaceGroup(-1063367406);
                Updater.LaunchedEffect(gapComposer18, flow, new TaxWebAppBridge.AnonymousClass4(flow, (Continuation) r11, this, 11));
                TaxWebBridgeDialogViewModel.LoadTaxWebBridgeDialog loadTaxWebBridgeDialog = new TaxWebBridgeDialogViewModel.LoadTaxWebBridgeDialog((TaxDialogDataModel) obj);
                gapComposer18.end(false);
                return loadTaxWebBridgeDialog;
            case 20:
                flow.getClass();
                GapComposer gapComposer19 = (GapComposer) composer;
                gapComposer19.startReplaceGroup(915429496);
                Updater.LaunchedEffect(gapComposer19, flow, new TaxWebAppBridge.AnonymousClass4(flow, (Continuation) r11, this, i7));
                BalanceBasedAddCashDisabledDialogScreen balanceBasedAddCashDisabledDialogScreen = (BalanceBasedAddCashDisabledDialogScreen) obj;
                BalanceBasedAddCashDisabledDialogViewModel balanceBasedAddCashDisabledDialogViewModel = new BalanceBasedAddCashDisabledDialogViewModel(balanceBasedAddCashDisabledDialogScreen.title, balanceBasedAddCashDisabledDialogScreen.message, balanceBasedAddCashDisabledDialogScreen.positiveButtonLabel, balanceBasedAddCashDisabledDialogScreen.negativeButtonLabel);
                gapComposer19.end(false);
                return balanceBasedAddCashDisabledDialogViewModel;
            case 21:
                m3725models(flow, composer, i);
                return Unit.INSTANCE;
            default:
                flow.getClass();
                GapComposer gapComposer20 = (GapComposer) composer;
                gapComposer20.startReplaceGroup(485393095);
                Updater.LaunchedEffect(gapComposer20, flow, new CardAppletWorker$setup$1$2$1(flow, (Continuation) null, this, 3));
                CardModule.CardElementAction.OpenDialog openDialog = ((CardControlDialogScreen) obj).dialog;
                openDialog.getClass();
                LocalizedString localizedString = openDialog.title_text;
                String translated = localizedString != null ? StringsKt.translated(localizedString) : null;
                LocalizedString localizedString2 = openDialog.main_text;
                String translated2 = localizedString2 != null ? StringsKt.translated(localizedString2) : null;
                CardModule.CardElementAction.OpenDialog.OpenDialogButton openDialogButton = openDialog.primary_button;
                openDialogButton.getClass();
                CardControlDialogViewModel.Button button = DirectoryAnalyticsDataKt.toButton(openDialogButton);
                CardModule.CardElementAction.OpenDialog.OpenDialogButton openDialogButton2 = openDialog.secondary_button;
                CardControlDialogViewModel cardControlDialogViewModel = new CardControlDialogViewModel(translated, translated2, button, openDialogButton2 != null ? DirectoryAnalyticsDataKt.toButton(openDialogButton2) : null);
                gapComposer20.end(false);
                return cardControlDialogViewModel;
        }
    }

    public ErrorPresenter(ProfileScreens.AccountSwitchInfoDialogScreen accountSwitchInfoDialogScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 2;
        accountSwitchInfoDialogScreen.getClass();
        this.args = accountSwitchInfoDialogScreen;
        this.navigator = screenNavigator;
    }

    public /* synthetic */ ErrorPresenter(Object obj, BetterNavigator.ScreenNavigator screenNavigator, int i) {
        this.$r8$classId = i;
        this.args = obj;
        this.navigator = screenNavigator;
    }

    public ErrorPresenter(BetterNavigator.ScreenNavigator screenNavigator, GenericConfirmDialog genericConfirmDialog) {
        this.$r8$classId = 4;
        genericConfirmDialog.getClass();
        this.navigator = screenNavigator;
        this.args = genericConfirmDialog;
    }

    public ErrorPresenter(PaymentScreens.WarningDialog warningDialog, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 1;
        warningDialog.getClass();
        this.args = warningDialog;
        this.navigator = screenNavigator;
    }

    public ErrorPresenter(ProfileScreens.ProfileAddressSheet profileAddressSheet, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 3;
        profileAddressSheet.getClass();
        this.args = profileAddressSheet;
        this.navigator = screenNavigator;
    }

    public ErrorPresenter(ErrorScreen errorScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 11;
        errorScreen.getClass();
        this.args = errorScreen;
        this.navigator = screenNavigator;
    }

    public ErrorPresenter(SingleUsePaymentScreen$SingleUsePaymentCardDetailsScreen singleUsePaymentScreen$SingleUsePaymentCardDetailsScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 12;
        singleUsePaymentScreen$SingleUsePaymentCardDetailsScreen.getClass();
        this.args = singleUsePaymentScreen$SingleUsePaymentCardDetailsScreen;
        this.navigator = screenNavigator;
    }

    public ErrorPresenter(BetterNavigator.ScreenNavigator screenNavigator, PasswordDialogScreen passwordDialogScreen) {
        this.$r8$classId = 10;
        passwordDialogScreen.getClass();
        this.navigator = screenNavigator;
        this.args = passwordDialogScreen;
    }

    public ErrorPresenter(BetterNavigator.ScreenNavigator screenNavigator, TaxDialogDataModel taxDialogDataModel) {
        this.$r8$classId = 19;
        taxDialogDataModel.getClass();
        this.navigator = screenNavigator;
        this.args = taxDialogDataModel;
    }

    public ErrorPresenter(BetterNavigator.ScreenNavigator screenNavigator, List list) {
        this.$r8$classId = 18;
        list.getClass();
        this.navigator = screenNavigator;
        this.args = list;
    }

    public ErrorPresenter(Analytics analytics, ProfileScreens.ErrorScreen errorScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 0;
        errorScreen.getClass();
        this.args = errorScreen;
        this.navigator = screenNavigator;
    }

    public ErrorPresenter(SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen supportScreens$SupportDialogs$SupportFlowCheckConnectionScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 15;
        supportScreens$SupportDialogs$SupportFlowCheckConnectionScreen.getClass();
        this.args = supportScreens$SupportDialogs$SupportFlowCheckConnectionScreen;
        this.navigator = screenNavigator;
    }

    public ErrorPresenter(TransfersRouterScreen transfersRouterScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 21;
        transfersRouterScreen.getClass();
        this.args = transfersRouterScreen;
        this.navigator = screenNavigator;
    }

    public ErrorPresenter(CardControlDialogScreen cardControlDialogScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 22;
        cardControlDialogScreen.getClass();
        this.args = cardControlDialogScreen;
        this.navigator = screenNavigator;
    }

    public ErrorPresenter(ProfileScreens.HeaderMenuScreen headerMenuScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 7;
        headerMenuScreen.getClass();
        this.args = headerMenuScreen;
        this.navigator = screenNavigator;
    }

    public ErrorPresenter(ProfileScreens.RingtoneScreen ringtoneScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 8;
        ringtoneScreen.getClass();
        this.args = ringtoneScreen;
        this.navigator = screenNavigator;
    }

    public ErrorPresenter(ProfileScreens.ConfirmRemoveAliasScreen confirmRemoveAliasScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 5;
        confirmRemoveAliasScreen.getClass();
        this.args = confirmRemoveAliasScreen;
        this.navigator = screenNavigator;
    }

    public ErrorPresenter(ProfileScreens.CropScreen cropScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 6;
        cropScreen.getClass();
        this.args = cropScreen;
        this.navigator = screenNavigator;
    }

    public ErrorPresenter(BalanceBasedAddCashDisabledDialogScreen balanceBasedAddCashDisabledDialogScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 20;
        balanceBasedAddCashDisabledDialogScreen.getClass();
        this.args = balanceBasedAddCashDisabledDialogScreen;
        this.navigator = screenNavigator;
    }

    public ErrorPresenter(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen supportArticleIncidentsSheetScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 14;
        supportArticleIncidentsSheetScreen.getClass();
        this.args = supportArticleIncidentsSheetScreen;
        this.navigator = screenNavigator;
    }

    public ErrorPresenter(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen supportHomeContactOptionsSheetScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 16;
        supportHomeContactOptionsSheetScreen.getClass();
        this.args = supportHomeContactOptionsSheetScreen;
        this.navigator = screenNavigator;
    }

    /* renamed from: models, reason: collision with other method in class */
    public void m3725models(Flow flow, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = this.$r8$classId;
        Continuation continuation = null;
        flow.getClass();
        switch (i5) {
            case 12:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(291308567);
                if ((i & 6) == 0) {
                    i2 = i | (gapComposer.changedInstance(flow) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= gapComposer.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer, flow, new BasicShieetKt$BasicShieet$4$1(flow, continuation, this, 27));
                } else {
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(this, flow, i, 11);
                    break;
                }
                break;
            case 17:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startRestartGroup(520746769);
                if ((i & 6) == 0) {
                    i3 = i | (gapComposer2.changedInstance(flow) ? 4 : 2);
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= gapComposer2.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer2, flow, new TaxWebAppBridge.AnonymousClass4(flow, continuation, this, 3));
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(this, flow, i, 9);
                    break;
                }
                break;
            default:
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startRestartGroup(-669934441);
                if ((i & 48) == 0) {
                    i4 = i | (gapComposer3.changedInstance(this) ? 32 : 16);
                } else {
                    i4 = i;
                }
                if (gapComposer3.shouldExecute(i4 & 1, (i4 & 17) != 16)) {
                    Unit unit = Unit.INSTANCE;
                    boolean changedInstance = gapComposer3.changedInstance(this);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ChatInputView$Content$1$1$1(this, continuation, 26);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    Updater.LaunchedEffect(gapComposer3, unit, (Function2) rememberedValue);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup3 = gapComposer3.endRestartGroup();
                if (endRestartGroup3 != null) {
                    endRestartGroup3.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(this, flow, i, 17);
                    break;
                }
                break;
        }
    }
}
