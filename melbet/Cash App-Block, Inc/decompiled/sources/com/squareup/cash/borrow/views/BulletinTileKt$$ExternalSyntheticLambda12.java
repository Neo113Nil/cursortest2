package com.squareup.cash.borrow.views;

import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.focus.FocusOwnerImpl;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.bitcoin.viewmodels.applet.education.BitcoinStoriesWidgetViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.education.BitcoinStoryViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.onramp.BitcoinOnRampOptionViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.onramp.BitcoinOnRampWidgetViewEvent$OptionClicked;
import com.squareup.cash.bitcoin.viewmodels.applet.stackingtools.BitcoinStackingToolsInfoViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.stackingtools.BitcoinStackingToolsInfoViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetViewEvent;
import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsContentViewModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositOptionsViewEvent;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositOptionsViewModel;
import com.squareup.cash.blockers.presenters.AddMoneyBlockerPresenter;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewEvent;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewModel;
import com.squareup.cash.blockers.viewmodels.CalendarBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.ConfirmCvvViewEvent$Next;
import com.squareup.cash.blockers.viewmodels.ConfirmCvvViewModel;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewEvent;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewModel;
import com.squareup.cash.blockers.viewmodels.GpsLocationConsentBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.InputCardInfoViewEvent;
import com.squareup.cash.blockers.viewmodels.LayoutUpdate;
import com.squareup.cash.blockers.viewmodels.ReferralCodeViewEvent;
import com.squareup.cash.blockers.viewmodels.ReferralCodeViewModel;
import com.squareup.cash.blockers.viewmodels.RequestPushNotificationsBlockerViewEvent;
import com.squareup.cash.blockers.viewmodels.RequestPushNotificationsBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.SavingsTransferOptionSelectionViewEvent;
import com.squareup.cash.blockers.viewmodels.SavingsTransferOptionSelectionViewModel;
import com.squareup.cash.blockers.viewmodels.SelectionViewEvent;
import com.squareup.cash.blockers.viewmodels.StatusResultViewEvent;
import com.squareup.cash.blockers.viewmodels.StatusResultViewModel;
import com.squareup.cash.blockers.viewmodels.VerifyContactsViewEvent;
import com.squareup.cash.blockers.viewmodels.VerifyContactsViewModel;
import com.squareup.cash.blockers.viewmodels.VerifyHelpItem;
import com.squareup.cash.blockers.viewmodels.VerifyHelpViewEvent;
import com.squareup.cash.blockers.views.StatusResultDialogView;
import com.squareup.cash.borrow.presenters.ExpandedLoanHistoryListPresenter$models$pager$1$1$1;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewEvent;
import com.squareup.cash.borrow.viewmodels.SheetButtonAction;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.protos.franklin.api.AddMoneyScreen;
import com.squareup.protos.franklin.common.StatusResultButton;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class BulletinTileKt$$ExternalSyntheticLambda12 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda12(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AddMoneyScreen.GooglePayButton googlePayButton;
        String str;
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke(new BorrowHomeViewEvent.TapBulletinRow((BorrowAppletBulletinsTile.Data.Bulletin) obj));
                return Unit.INSTANCE;
            case 1:
                ((Function1) obj2).invoke(new BitcoinStoriesWidgetViewEvent.OnStoryClicked((BitcoinStoryViewModel) obj));
                return Unit.INSTANCE;
            case 2:
                ((Function1) obj2).invoke(new BitcoinOnRampWidgetViewEvent$OptionClicked(((BitcoinOnRampOptionViewModel) obj).f1053type));
                return Unit.INSTANCE;
            case 3:
                ((Function1) obj2).invoke(new BitcoinStackingToolsInfoViewEvent.ContinueClicked(((BitcoinStackingToolsInfoViewModel) obj).f1057type));
                return Unit.INSTANCE;
            case 4:
                ((Function1) obj2).invoke(new BitcoinStackingToolsInfoViewEvent.ItemClicked((BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoType) obj));
                return Unit.INSTANCE;
            case 5:
                ((Function1) obj2).invoke((BitcoinSettingsWidgetViewEvent) obj);
                return Unit.INSTANCE;
            case 6:
                ((Function1) obj2).invoke((BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem) obj);
                return Unit.INSTANCE;
            case 7:
                ((Function1) obj2).invoke(new StablecoinDepositOptionsViewEvent.NetworkSelected(((StablecoinDepositOptionsViewModel.NetworkRow) obj).network));
                return Unit.INSTANCE;
            case 8:
                AddMoneyBlockerPresenter addMoneyBlockerPresenter = (AddMoneyBlockerPresenter) obj2;
                MutableState mutableState = (MutableState) obj;
                if (!addMoneyBlockerPresenter.googlePayEnabled || !((Boolean) mutableState.getValue()).booleanValue() || (googlePayButton = addMoneyBlockerPresenter.addMoneyScreen.google_pay_button) == null || (str = googlePayButton.text) == null || StringsKt.isBlank(str)) {
                    return null;
                }
                return str;
            case 9:
                ((Function1) obj2).invoke(new FilesetUploadViewEvent.RemoveFile(((FilesetUploadViewModel.FileViewModel) obj).id));
                return Unit.INSTANCE;
            case 10:
                Function1 function1 = (Function1) obj2;
                int ordinal = ((BankAccountLinkingViewModel) obj).bottomButton.ordinal();
                if (ordinal == 1) {
                    r3 = BankAccountLinkingViewEvent.SkipClick.INSTANCE;
                } else if (ordinal == 2) {
                    r3 = BankAccountLinkingViewEvent.HelpClick.INSTANCE;
                }
                if (r3 != null) {
                    function1.invoke(r3);
                }
                return Unit.INSTANCE;
            case 11:
                ((Function1) obj2).invoke(Boolean.valueOf(!((CalendarBlockerViewModel.Loaded.Toggle) obj).toggledOn));
                return Unit.INSTANCE;
            case 12:
                ((Function1) obj2).invoke(new ConfirmCvvViewEvent$Next(((ConfirmCvvViewModel) obj).cvvLength));
                return Unit.INSTANCE;
            case 13:
                ((Function1) obj2).invoke(((EarnerEnrollmentBlockerViewModel.CategorySelection.Category) obj).category);
                return Unit.INSTANCE;
            case 14:
                ((Function1) obj2).invoke(((GpsLocationConsentBlockerViewModel.Loaded) obj).primaryButton.event);
                return Unit.INSTANCE;
            case 15:
                ((FocusOwnerImpl) obj).clearFocus(false);
                ((Function1) obj2).invoke(InputCardInfoViewEvent.TapBack.INSTANCE);
                return Unit.INSTANCE;
            case 16:
                Function1 function12 = (Function1) obj2;
                String str2 = ((ReferralCodeViewModel) obj).codeOverride;
                if (str2 == null || str2.length() == 0) {
                    return Updater.mutableStateOf$default("");
                }
                function12.invoke(new ReferralCodeViewEvent.CodeInputChanged(str2));
                return Updater.mutableStateOf$default(str2);
            case 17:
                RequestPushNotificationsBlockerViewModel.NotificationToggle notificationToggle = (RequestPushNotificationsBlockerViewModel.NotificationToggle) obj;
                ((Function1) obj2).invoke(new RequestPushNotificationsBlockerViewEvent.OnToggleChanged(notificationToggle.category, true ^ notificationToggle.enabled));
                return Unit.INSTANCE;
            case 18:
                ((Function1) obj2).invoke(new SavingsTransferOptionSelectionViewEvent.SelectTransferOption(((SavingsTransferOptionSelectionViewModel.Content.TransferOption) obj).id));
                return Unit.INSTANCE;
            case 19:
                ((Function1) obj2).invoke(new SelectionViewEvent.HelpClick((List) obj));
                return Unit.INSTANCE;
            case 20:
                StatusResultViewModel.Ready ready = (StatusResultViewModel.Ready) obj;
                Ui.EventReceiver eventReceiver = ((StatusResultDialogView) obj2).eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(new StatusResultViewEvent.ButtonClick(ready.primaryButton));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 21:
                StatusResultButton statusResultButton = (StatusResultButton) obj;
                Ui.EventReceiver eventReceiver2 = ((StatusResultDialogView) obj2).eventReceiver;
                if (eventReceiver2 != null) {
                    eventReceiver2.sendEvent(new StatusResultViewEvent.ButtonClick(statusResultButton));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 22:
                ((Function1) obj2).invoke(new StatusResultViewEvent.PromotionsSelected((LayoutUpdate.Promotions) obj));
                return Unit.INSTANCE;
            case 23:
                ((Function1) obj2).invoke(new StatusResultViewEvent.ButtonClick((StatusResultButton) obj));
                return Unit.INSTANCE;
            case 24:
                ((Function1) obj2).invoke(new StatusResultViewEvent.ButtonClick(((StatusResultViewModel.Ready) ((StatusResultViewModel) obj)).primaryButton));
                return Unit.INSTANCE;
            case 25:
                Function1 function13 = (Function1) obj2;
                if (((VerifyContactsViewModel) obj).retreatActionEnabled) {
                    function13.invoke(VerifyContactsViewEvent.Retreat.INSTANCE);
                }
                return Unit.INSTANCE;
            case 26:
                ((Function1) obj2).invoke(new VerifyHelpViewEvent.VerifyHelpItemSelected((VerifyHelpItem) obj));
                return Unit.INSTANCE;
            case 27:
                return new ExpandedLoanHistoryListPresenter$models$pager$1$1$1((MusicPresenter) obj2, (Ref$ObjectRef) obj);
            case 28:
                Latch$await$2$2 latch$await$2$2 = (Latch$await$2$2) obj2;
                String str3 = ((BorrowHomeOverlayViewModel.InfoModal) obj).primaryActionUrl;
                latch$await$2$2.invoke(str3 != null ? new SheetButtonAction.ActionUrl(str3) : null);
                return Unit.INSTANCE;
            default:
                BorrowHomeOverlayViewModel.SheetButton sheetButton = ((BorrowHomeOverlayViewModel.InfoSheet) obj).sheetButton;
                sheetButton.getClass();
                ((Latch$await$2$2) obj2).invoke(sheetButton.action);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BulletinTileKt$$ExternalSyntheticLambda12(int i, Object obj, Function1 function1) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = function1;
    }
}
