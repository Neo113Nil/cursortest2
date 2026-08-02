package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.div.state.db.StateEntry;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.a;
import com.ybsdk.core.analytics.generated.PlusStatusDiffRate;
import com.ybsdk.core.analytics.generated.SavingsDragAndDropWidgetTypeSavings;
import com.ybsdk.core.analytics.generated.delegates.AllCardsEvents$AllCardsSnackbarShownState;
import com.ybsdk.core.analytics.generated.delegates.CardCommonEvents$CardActivationClaimingResultResult;
import com.ybsdk.core.analytics.generated.delegates.CardCommonEvents$CardActivationClaimingStatusResultResult;
import com.ybsdk.core.analytics.generated.delegates.CardCommonEvents$CardActivationInitialLoadingResultResult;
import com.ybsdk.core.analytics.generated.delegates.CardCommonEvents$CardCreateResultResult;
import com.ybsdk.core.analytics.generated.delegates.CardCommonEvents$CardReissueDeletionScreenResultErrorType;
import com.ybsdk.core.analytics.generated.delegates.CardCommonEvents$CardReissueDeletionScreenResultResult;
import com.ybsdk.core.analytics.generated.delegates.CardCommonEvents$CardReissueDeletionScreenResultSuccessType;
import com.ybsdk.core.analytics.generated.delegates.CardCommonEvents$CardReissuePollingResultResult;
import com.ybsdk.core.analytics.generated.delegates.CardCommonEvents$CardReissueStartResultResult;
import com.ybsdk.core.analytics.generated.delegates.CardCommonEvents$CardUserBlockResultResult;
import com.ybsdk.core.analytics.generated.delegates.ChangePhoneEvents$ChangePhoneConfirmationCodeCheckResult;
import com.ybsdk.core.analytics.generated.delegates.ChangePhoneEvents$ChangePhoneResultResult;
import com.ybsdk.core.analytics.generated.delegates.DiffRateEvents$BottomsheetDiffRateCalendarLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.DivkitCommonEvents$DivkitCommonScreenLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.FuturePaymentsEvents$FuturePaymentsLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.GovServicesEvents$PaymentGovSuccessScreenLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.HidingBalancesEvents$HidingBalancesInitiatedAction;
import com.ybsdk.core.analytics.generated.delegates.PushNotificationsEvents$PushNotificationsActionStartAction;
import com.ybsdk.core.analytics.generated.delegates.PushNotificationsEvents$PushNotificationsSubscribeResult;
import com.ybsdk.core.analytics.generated.delegates.PushNotificationsEvents$PushNotificationsUnsubscribeResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrAllowCameraInitiatedType;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrDeleteSubscriptionLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrIconClickedSource;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrLoadSubscriptionsLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentInfoLoadedQrcType;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentInfoLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentInfoLoadedVersion;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentLoadedVersion;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentSplitShutterLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrResolvingRulesLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrSubscriptionLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrSubscriptionLoadedVersion;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrSubscriptionStartedVersion;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountButtonClickButton;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountButtonClickType;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountOpenType;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountResultResult;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountResultType;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountEditNameSaveResultError;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountEditNameSaveResultResult;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountEditNameSaveResultType;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountLoadedType;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsDashboardDragAndDropInitiatedType;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsDashboardDragAndDropMovedType;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsRegistrationCreatingApplicationResultResult;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsRegistrationResultResult;
import com.ybsdk.core.analytics.generated.delegates.TransfersDashboardEvents$TransfersDashboardBottomSheetShownResult;
import com.ybsdk.core.analytics.generated.delegates.UpgradeEvents$EsiaLaunchBrowserLaunchUrlErrorErrorType;
import com.ybsdk.core.analytics.generated.delegates.UpgradeEvents$EsiaLaunchBrowserProcessIntentStatus;
import com.ybsdk.core.analytics.generated.delegates.UpgradeEvents$UpgradeCheckResultResult;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes8.dex */
public final class rt1 {
    public final a a;

    public /* synthetic */ rt1(a aVar) {
        this.a = aVar;
    }

    public static void A(rt1 rt1Var, QrPaymentEvents$QrPaymentLoadedVersion qrPaymentEvents$QrPaymentLoadedVersion, String str, QrPaymentEvents$QrPaymentLoadedResult qrPaymentEvents$QrPaymentLoadedResult, String str2, String str3, Boolean bool) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(7);
        linkedHashMap.put("version", qrPaymentEvents$QrPaymentLoadedVersion.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("agreement", str);
        }
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, qrPaymentEvents$QrPaymentLoadedResult.getOriginalValue());
        if (str2 != null) {
            linkedHashMap.put("transfer_id", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("origin", str3);
        }
        if (bool != null) {
            linkedHashMap.put("used_ultra", bool);
        }
        rt1Var.a.a("qr.payment.loaded", linkedHashMap);
    }

    public static void E(rt1 rt1Var, QrPaymentEvents$QrSubscriptionStartedVersion qrPaymentEvents$QrSubscriptionStartedVersion) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put("version", qrPaymentEvents$QrSubscriptionStartedVersion.getOriginalValue());
        rt1Var.a.a("qr.subscription.started", linkedHashMap);
    }

    public static void K(rt1 rt1Var, String str, int i, SavingsEvents$SavingsDashboardDragAndDropInitiatedType savingsEvents$SavingsDashboardDragAndDropInitiatedType, SavingsDragAndDropWidgetTypeSavings savingsDragAndDropWidgetTypeSavings, int i2) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(5);
        if (str != null) {
            linkedHashMap.put("agreement_id", str);
        }
        linkedHashMap.put("from", Integer.valueOf(i));
        linkedHashMap.put("type", savingsEvents$SavingsDashboardDragAndDropInitiatedType.getOriginalValue());
        if (savingsDragAndDropWidgetTypeSavings != null) {
            linkedHashMap.put("widget_type", savingsDragAndDropWidgetTypeSavings.getOriginalValue());
        }
        rt1Var.a.a("savings.dashboard.drag_and_drop.initiated", linkedHashMap);
    }

    public static void L(rt1 rt1Var, String str, int i, int i2, SavingsEvents$SavingsDashboardDragAndDropMovedType savingsEvents$SavingsDashboardDragAndDropMovedType, int i3, List list, SavingsDragAndDropWidgetTypeSavings savingsDragAndDropWidgetTypeSavings, int i4) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(8);
        if (str != null) {
            linkedHashMap.put("agreement_id", str);
        }
        linkedHashMap.put("from", Integer.valueOf(i));
        linkedHashMap.put("to", Integer.valueOf(i2));
        linkedHashMap.put("type", savingsEvents$SavingsDashboardDragAndDropMovedType.getOriginalValue());
        linkedHashMap.put("total_savers", Integer.valueOf(i3));
        linkedHashMap.put("savers_list", list);
        if (savingsDragAndDropWidgetTypeSavings != null) {
            linkedHashMap.put("widget_type", savingsDragAndDropWidgetTypeSavings.getOriginalValue());
        }
        rt1Var.a.a("savings.dashboard.drag_and_drop.moved", linkedHashMap);
    }

    public static void O(rt1 rt1Var, SavingsEvents$SavingsRegistrationResultResult savingsEvents$SavingsRegistrationResultResult) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, savingsEvents$SavingsRegistrationResultResult.getOriginalValue());
        rt1Var.a.a("savings.registration.result", linkedHashMap);
    }

    public static void a(rt1 rt1Var, AllCardsEvents$AllCardsSnackbarShownState allCardsEvents$AllCardsSnackbarShownState) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(ClidProvider.STATE, allCardsEvents$AllCardsSnackbarShownState.getOriginalValue());
        rt1Var.a.a("all_cards.snackbar.shown", linkedHashMap);
    }

    public static void m(rt1 rt1Var, String str, String str2, DivkitCommonEvents$DivkitCommonScreenLoadedResult divkitCommonEvents$DivkitCommonScreenLoadedResult, String str3, int i) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        LinkedHashMap w = g8e.w(5, StateEntry.COLUMN_PATH, str);
        if (str2 != null) {
            w.put(MetaDataField.SCREEN_FIELD, str2);
        }
        w.put(TarifficatorScenarioActivity.RESULT_KEY, divkitCommonEvents$DivkitCommonScreenLoadedResult.getOriginalValue());
        if (str3 != null) {
            w.put("error", str3);
        }
        rt1Var.a.a("divkit_common_screen.loaded", w);
    }

    public static void p(rt1 rt1Var, FuturePaymentsEvents$FuturePaymentsLoadedResult futurePaymentsEvents$FuturePaymentsLoadedResult, String str, Map map, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, futurePaymentsEvents$FuturePaymentsLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        if (map != null) {
            linkedHashMap.put("params", map);
        }
        rt1Var.a.a("future_payments.loaded", linkedHashMap);
    }

    public static void y(rt1 rt1Var, QrPaymentEvents$QrLoadSubscriptionsLoadedResult qrPaymentEvents$QrLoadSubscriptionsLoadedResult, String str, Integer num, String str2, String str3, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(5);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, qrPaymentEvents$QrLoadSubscriptionsLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("agreements_list", str);
        }
        if (num != null) {
            linkedHashMap.put("count", num);
        }
        if (str2 != null) {
            linkedHashMap.put("subscriptions_count_list", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("error", str3);
        }
        rt1Var.a.a("qr.load_subscriptions.loaded", linkedHashMap);
    }

    public static void z(rt1 rt1Var, String str, QrPaymentEvents$QrPaymentInfoLoadedVersion qrPaymentEvents$QrPaymentInfoLoadedVersion, QrPaymentEvents$QrPaymentInfoLoadedResult qrPaymentEvents$QrPaymentInfoLoadedResult, QrPaymentEvents$QrPaymentInfoLoadedQrcType qrPaymentEvents$QrPaymentInfoLoadedQrcType, String str2, String str3, String str4, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            qrPaymentEvents$QrPaymentInfoLoadedQrcType = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 128) != 0) {
            str4 = null;
        }
        rt1Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(8);
        if (str != null) {
            linkedHashMap.put("qrc_link", str);
        }
        linkedHashMap.put("version", qrPaymentEvents$QrPaymentInfoLoadedVersion.getOriginalValue());
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, qrPaymentEvents$QrPaymentInfoLoadedResult.getOriginalValue());
        if (qrPaymentEvents$QrPaymentInfoLoadedQrcType != null) {
            linkedHashMap.put("qrc_type", qrPaymentEvents$QrPaymentInfoLoadedQrcType.getOriginalValue());
        }
        if (str2 != null) {
            linkedHashMap.put("error", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("origin", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("payment_service_id", str4);
        }
        rt1Var.a.a("qr.payment_info.loaded", linkedHashMap);
    }

    public void B(QrPaymentEvents$QrPaymentSplitShutterLoadedResult qrPaymentEvents$QrPaymentSplitShutterLoadedResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, qrPaymentEvents$QrPaymentSplitShutterLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("qr.payment_split_shutter.loaded", linkedHashMap);
    }

    public void C(QrPaymentEvents$QrResolvingRulesLoadedResult qrPaymentEvents$QrResolvingRulesLoadedResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, qrPaymentEvents$QrResolvingRulesLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("qr.resolving_rules.loaded", linkedHashMap);
    }

    public void D(QrPaymentEvents$QrSubscriptionLoadedVersion qrPaymentEvents$QrSubscriptionLoadedVersion, QrPaymentEvents$QrSubscriptionLoadedResult qrPaymentEvents$QrSubscriptionLoadedResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put("version", qrPaymentEvents$QrSubscriptionLoadedVersion.getOriginalValue());
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, qrPaymentEvents$QrSubscriptionLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("qr.subscription.loaded", linkedHashMap);
    }

    public void F(SavingsEvents$SavingsAccountCloseAccountButtonClickButton savingsEvents$SavingsAccountCloseAccountButtonClickButton, SavingsEvents$SavingsAccountCloseAccountButtonClickType savingsEvents$SavingsAccountCloseAccountButtonClickType, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put("button", savingsEvents$SavingsAccountCloseAccountButtonClickButton.getOriginalValue());
        if (savingsEvents$SavingsAccountCloseAccountButtonClickType != null) {
            linkedHashMap.put("type", savingsEvents$SavingsAccountCloseAccountButtonClickType.getOriginalValue());
        }
        if (str != null) {
            linkedHashMap.put(Constants.DEEPLINK, str);
        }
        if (str2 != null) {
            linkedHashMap.put("operation_type", str2);
        }
        this.a.a("savings.account.close_account.button.click", linkedHashMap);
    }

    public void G(SavingsEvents$SavingsAccountCloseAccountOpenType savingsEvents$SavingsAccountCloseAccountOpenType, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        if (savingsEvents$SavingsAccountCloseAccountOpenType != null) {
            linkedHashMap.put("type", savingsEvents$SavingsAccountCloseAccountOpenType.getOriginalValue());
        }
        if (str != null) {
            linkedHashMap.put("operation_type", str);
        }
        this.a.a("savings.account.close_account.open", linkedHashMap);
    }

    public void H(String str, SavingsEvents$SavingsAccountCloseAccountResultResult savingsEvents$SavingsAccountCloseAccountResultResult, SavingsEvents$SavingsAccountCloseAccountResultType savingsEvents$SavingsAccountCloseAccountResultType) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, savingsEvents$SavingsAccountCloseAccountResultResult.getOriginalValue());
        if (savingsEvents$SavingsAccountCloseAccountResultType != null) {
            linkedHashMap.put("type", savingsEvents$SavingsAccountCloseAccountResultType.getOriginalValue());
        }
        this.a.a("savings.account.close_account.result", linkedHashMap);
    }

    public void I(SavingsEvents$SavingsAccountEditNameSaveResultResult savingsEvents$SavingsAccountEditNameSaveResultResult, SavingsEvents$SavingsAccountEditNameSaveResultError savingsEvents$SavingsAccountEditNameSaveResultError, String str, SavingsEvents$SavingsAccountEditNameSaveResultType savingsEvents$SavingsAccountEditNameSaveResultType) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, savingsEvents$SavingsAccountEditNameSaveResultResult.getOriginalValue());
        if (savingsEvents$SavingsAccountEditNameSaveResultError != null) {
            linkedHashMap.put("error", savingsEvents$SavingsAccountEditNameSaveResultError.getOriginalValue());
        }
        linkedHashMap.put("name", str);
        if (savingsEvents$SavingsAccountEditNameSaveResultType != null) {
            linkedHashMap.put("type", savingsEvents$SavingsAccountEditNameSaveResultType.getOriginalValue());
        }
        this.a.a("savings.account.edit_name.save.result", linkedHashMap);
    }

    public void J(SavingsEvents$SavingsAccountLoadedResult savingsEvents$SavingsAccountLoadedResult, String str, SavingsEvents$SavingsAccountLoadedType savingsEvents$SavingsAccountLoadedType, Boolean bool, String str2, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(6);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, savingsEvents$SavingsAccountLoadedResult.getOriginalValue());
        linkedHashMap.put("agreement_id", str);
        if (savingsEvents$SavingsAccountLoadedType != null) {
            linkedHashMap.put("type", savingsEvents$SavingsAccountLoadedType.getOriginalValue());
        }
        if (bool != null) {
            linkedHashMap.put("has_income_widget", bool);
        }
        if (str2 != null) {
            linkedHashMap.put("widget_period", str2);
        }
        if (list != null) {
            linkedHashMap.put("available_periods", list);
        }
        this.a.a("savings.account.loaded", linkedHashMap);
    }

    public void M(SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton savingsEvents$SavingsOpeningFundTopupScreenButtonClickButton, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put("button", savingsEvents$SavingsOpeningFundTopupScreenButtonClickButton.getOriginalValue());
        if (str != null) {
            linkedHashMap.put(Constants.DEEPLINK, str);
        }
        this.a.a("savings.opening.fund_topup_screen.button.click", linkedHashMap);
    }

    public void N(SavingsEvents$SavingsRegistrationCreatingApplicationResultResult savingsEvents$SavingsRegistrationCreatingApplicationResultResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, savingsEvents$SavingsRegistrationCreatingApplicationResultResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("savings.registration.creating_application.result", linkedHashMap);
    }

    public void P(String str, TransfersDashboardEvents$TransfersDashboardBottomSheetShownResult transfersDashboardEvents$TransfersDashboardBottomSheetShownResult, String str2) {
        LinkedHashMap w = g8e.w(3, ClidProvider.STATE, str);
        w.put(TarifficatorScenarioActivity.RESULT_KEY, transfersDashboardEvents$TransfersDashboardBottomSheetShownResult.getOriginalValue());
        if (str2 != null) {
            w.put("error", str2);
        }
        this.a.a("transfers_dashboard.bottom_sheet.shown", w);
    }

    public void Q(UpgradeEvents$UpgradeCheckResultResult upgradeEvents$UpgradeCheckResultResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, upgradeEvents$UpgradeCheckResultResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("upgrade.check.result", linkedHashMap);
    }

    public void b(DiffRateEvents$BottomsheetDiffRateCalendarLoadedResult diffRateEvents$BottomsheetDiffRateCalendarLoadedResult, String str, PlusStatusDiffRate plusStatusDiffRate) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, diffRateEvents$BottomsheetDiffRateCalendarLoadedResult.getOriginalValue());
        linkedHashMap.put("default_min_date", str);
        linkedHashMap.put("plus_status", plusStatusDiffRate.getOriginalValue());
        this.a.a("bottomsheet.diff_rate.calendar.loaded", linkedHashMap);
    }

    public void c(CardCommonEvents$CardActivationClaimingResultResult cardCommonEvents$CardActivationClaimingResultResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, cardCommonEvents$CardActivationClaimingResultResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("card.activation.claiming.result", linkedHashMap);
    }

    public void d(CardCommonEvents$CardActivationClaimingStatusResultResult cardCommonEvents$CardActivationClaimingStatusResultResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, cardCommonEvents$CardActivationClaimingStatusResultResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("card.activation.claiming_status.result", linkedHashMap);
    }

    public void e(CardCommonEvents$CardActivationInitialLoadingResultResult cardCommonEvents$CardActivationInitialLoadingResultResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, cardCommonEvents$CardActivationInitialLoadingResultResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("card.activation.initial_loading.result", linkedHashMap);
    }

    public void f(CardCommonEvents$CardCreateResultResult cardCommonEvents$CardCreateResultResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, cardCommonEvents$CardCreateResultResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("card.create.result", linkedHashMap);
    }

    public void g(CardCommonEvents$CardReissueDeletionScreenResultSuccessType cardCommonEvents$CardReissueDeletionScreenResultSuccessType, CardCommonEvents$CardReissueDeletionScreenResultErrorType cardCommonEvents$CardReissueDeletionScreenResultErrorType, CardCommonEvents$CardReissueDeletionScreenResultResult cardCommonEvents$CardReissueDeletionScreenResultResult, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(5);
        if (cardCommonEvents$CardReissueDeletionScreenResultSuccessType != null) {
            linkedHashMap.put("success_type", cardCommonEvents$CardReissueDeletionScreenResultSuccessType.getOriginalValue());
        }
        if (cardCommonEvents$CardReissueDeletionScreenResultErrorType != null) {
            linkedHashMap.put("error_type", cardCommonEvents$CardReissueDeletionScreenResultErrorType.getOriginalValue());
        }
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, cardCommonEvents$CardReissueDeletionScreenResultResult.getOriginalValue());
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("card_type", str2);
        this.a.a("card.reissue_deletion.screen.result", linkedHashMap);
    }

    public void h(CardCommonEvents$CardReissuePollingResultResult cardCommonEvents$CardReissuePollingResultResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, cardCommonEvents$CardReissuePollingResultResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("card.reissue.polling_result", linkedHashMap);
    }

    public void i(CardCommonEvents$CardReissueStartResultResult cardCommonEvents$CardReissueStartResultResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, cardCommonEvents$CardReissueStartResultResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("card.reissue.start_result", linkedHashMap);
    }

    public void j(CardCommonEvents$CardUserBlockResultResult cardCommonEvents$CardUserBlockResultResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, cardCommonEvents$CardUserBlockResultResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("card.user_block.result", linkedHashMap);
    }

    public void k(ChangePhoneEvents$ChangePhoneConfirmationCodeCheckResult changePhoneEvents$ChangePhoneConfirmationCodeCheckResult, String str, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, changePhoneEvents$ChangePhoneConfirmationCodeCheckResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        linkedHashMap.put("attempt", Integer.valueOf(i));
        this.a.a("change_phone.confirmation_code.check", linkedHashMap);
    }

    public void l(ChangePhoneEvents$ChangePhoneResultResult changePhoneEvents$ChangePhoneResultResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, changePhoneEvents$ChangePhoneResultResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("change_phone.result", linkedHashMap);
    }

    public void n(UpgradeEvents$EsiaLaunchBrowserLaunchUrlErrorErrorType upgradeEvents$EsiaLaunchBrowserLaunchUrlErrorErrorType, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put("error_type", upgradeEvents$EsiaLaunchBrowserLaunchUrlErrorErrorType.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error_text", str);
        }
        this.a.a("esia.launch_browser.launch_url.error", linkedHashMap);
    }

    public void o(UpgradeEvents$EsiaLaunchBrowserProcessIntentStatus upgradeEvents$EsiaLaunchBrowserProcessIntentStatus, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(ACSPConstants.STATUS, upgradeEvents$EsiaLaunchBrowserProcessIntentStatus.getOriginalValue());
        if (str != null) {
            linkedHashMap.put(LaunchBrowserActivity.KEY_URI, str);
        }
        this.a.a("esia.launch_browser.process_intent", linkedHashMap);
    }

    public void q(HidingBalancesEvents$HidingBalancesInitiatedAction hidingBalancesEvents$HidingBalancesInitiatedAction, Boolean bool, Boolean bool2, Boolean bool3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        if (hidingBalancesEvents$HidingBalancesInitiatedAction != null) {
            linkedHashMap.put("action", hidingBalancesEvents$HidingBalancesInitiatedAction.getOriginalValue());
        }
        linkedHashMap.put("was_performed", bool);
        linkedHashMap.put("is_fragment_support_spoilers", bool2);
        linkedHashMap.put("is_feature_enabled", bool3);
        this.a.a("hiding_balances.initiated", linkedHashMap);
    }

    public void r(GovServicesEvents$PaymentGovSuccessScreenLoadedResult govServicesEvents$PaymentGovSuccessScreenLoadedResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, govServicesEvents$PaymentGovSuccessScreenLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("payment.gov.success_screen.loaded", linkedHashMap);
    }

    public void s(PushNotificationsEvents$PushNotificationsActionStartAction pushNotificationsEvents$PushNotificationsActionStartAction) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("action", pushNotificationsEvents$PushNotificationsActionStartAction.getOriginalValue());
        this.a.a("push_notifications.action_start", linkedHashMap);
    }

    public void t(PushNotificationsEvents$PushNotificationsSubscribeResult pushNotificationsEvents$PushNotificationsSubscribeResult, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, pushNotificationsEvents$PushNotificationsSubscribeResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        if (str2 != null) {
            linkedHashMap.put(MetaDataField.DEVICE_ID_FIELD, str2);
        }
        this.a.a("push_notifications.subscribe", linkedHashMap);
    }

    public void u(PushNotificationsEvents$PushNotificationsUnsubscribeResult pushNotificationsEvents$PushNotificationsUnsubscribeResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, pushNotificationsEvents$PushNotificationsUnsubscribeResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("push_notifications.unsubscribe", linkedHashMap);
    }

    public void v(QrPaymentEvents$QrAllowCameraInitiatedType qrPaymentEvents$QrAllowCameraInitiatedType) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("type", qrPaymentEvents$QrAllowCameraInitiatedType.getOriginalValue());
        this.a.a("qr.allow_camera.initiated", linkedHashMap);
    }

    public void w(QrPaymentEvents$QrDeleteSubscriptionLoadedResult qrPaymentEvents$QrDeleteSubscriptionLoadedResult, String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, qrPaymentEvents$QrDeleteSubscriptionLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("agreement_id", str);
        }
        linkedHashMap.put("subscription_id", str2);
        if (str3 != null) {
            linkedHashMap.put("error", str3);
        }
        this.a.a("qr.delete_subscription.loaded", linkedHashMap);
    }

    public void x(QrPaymentEvents$QrIconClickedSource qrPaymentEvents$QrIconClickedSource) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("source", qrPaymentEvents$QrIconClickedSource.getOriginalValue());
        this.a.a("qr.icon.clicked", linkedHashMap);
    }
}
