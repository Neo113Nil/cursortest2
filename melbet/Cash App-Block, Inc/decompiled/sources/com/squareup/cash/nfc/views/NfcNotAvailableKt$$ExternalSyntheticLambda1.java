package com.squareup.cash.nfc.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.fragment.app.FragmentAnim;
import androidx.glance.appwidget.AppWidgetUtilsKt;
import androidx.glance.appwidget.CoroutineBroadcastReceiverKt;
import androidx.glance.appwidget.GlanceAppWidgetKt;
import app.cash.local.viewmodels.sheet.EducationalSheetEvent;
import com.squareup.cash.account.components.accountswitcher.BadgeTitleKt;
import com.squareup.cash.afterpayapplet.views.browser.SelectAfterpayPromptSheetKt;
import com.squareup.cash.bitcoin.views.BitcoinInvoiceEntryViewKt;
import com.squareup.cash.bitcoin.views.roundups.BitcoinRoundUpsCardUpsellViewKt;
import com.squareup.cash.blockers.views.SsnViewKt;
import com.squareup.cash.blockers.views.components.VerifyAliasViewKt;
import com.squareup.cash.cashapplite.views.KycAppletTileKt;
import com.squareup.cash.earnings.views.streamdetail.EarningsStreamDetailKt;
import com.squareup.cash.earningstracker.views.EarningsTrackerViewKt;
import com.squareup.cash.earningstracker.views.NetEarningsInfoSheetViewKt;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.family.familyhub.views.SponsorDetailViewKt;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt;
import com.squareup.cash.initialscreenloader.views.AppUpgradeViewKt;
import com.squareup.cash.instruments.views.InstrumentAvatarUtilsKt;
import com.squareup.cash.offers.views.details.OfferDetailsSheetKt;
import com.squareup.cash.payments.presenters.RecipientMapper;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.shopping.sup.views.SingleUsePaymentAddCardSheetKt;
import com.squareup.cash.support.chat.views.ChatExitPromptViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class NfcNotAvailableKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ NfcNotAvailableKt$$ExternalSyntheticLambda1(int i, int i2, Function1 function1) {
        this.$r8$classId = i2;
        this.f$0 = function1;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                NfcNotAvailableKt.NfcNotAvailable(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                ((String) obj2).getClass();
                function1.invoke(new EducationalSheetEvent.OnUrlClick(i2, str));
                break;
            case 2:
                ((Integer) obj2).intValue();
                BadgeTitleKt.AccountsLoadingFailedViewContent(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                SelectAfterpayPromptSheetKt.SelectAfterpayPrompt(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                BitcoinInvoiceEntryViewKt.BitcoinDisplayCurrencyInfoView(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                BitcoinRoundUpsCardUpsellViewKt.BitcoinRoundUpsCardUpsellView(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                SsnViewKt.FilesetUploadOptionsSheet(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                SsnViewKt.GetFlowLoading(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                VerifyAliasViewKt.ContactPermissionExplanation(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                RecipientMapper.DisclosureSection(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                KycAppletTileKt.LiteCashInError(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                KycAppletTileKt.LiteCashInLoading(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                EarningsStreamDetailKt.LoadErrorBlock(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                EarningsTrackerViewKt.Toolbar(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                NetEarningsInfoSheetViewKt.NetEarningsInfoSheetView(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                AllowanceViewKt.SpendingControlsItem(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                SponsorDetailViewKt.ManagedAccountLoginQrCodeProviderView(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                SafetyHubViewKt.SafetyHubLoadingView(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                AppUpgradeViewKt.GenericErrorModal(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).intValue();
                AppUpgradeViewKt.InitiateSessionFailedModal(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).intValue();
                AppUpgradeViewKt.ScenarioPlanErrorModal(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).intValue();
                InstrumentAvatarUtilsKt.InstrumentSelectionLoadingView(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).intValue();
                OfferDetailsSheetKt.Links(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).intValue();
                QuickPayViewKt.PaymentLoading(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                SingleUsePaymentAddCardSheetKt.CardDetails(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).intValue();
                FragmentAnim.ConnectionFailedContent(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).intValue();
                AppWidgetUtilsKt.ReviewPlanContent(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).intValue();
                CoroutineBroadcastReceiverKt.SpendingLimitReachedContent(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).intValue();
                GlanceAppWidgetKt.SpendingLimitReachedErrorContent(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ChatExitPromptViewKt.ExitDialog(function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ NfcNotAvailableKt$$ExternalSyntheticLambda1(Function1 function1, int i, int i2, boolean z) {
        this.$r8$classId = i2;
        this.f$0 = function1;
        this.f$1 = i;
    }
}
