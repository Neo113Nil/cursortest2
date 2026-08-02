package com.squareup.cash.payments.backend.real;

import app.cash.broadway.screen.Screen;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.util.coroutines.StateFlowKt;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes.dex */
public final class RealPaymentManager implements PaymentManager {
    public final SharedFlowImpl paymentActions = FlowKt.MutableSharedFlow$default(0, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, null, 5);
    public final LinkedHashSet pendingPaymentTokens = new LinkedHashSet();
    public final AndroidStringManager stringManager;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentHistoryButton.ButtonAction.values().length];
            try {
                iArr[PaymentHistoryButton.ButtonAction.CONFIRM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.PASSCODE_CONFIRMATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.LINK_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.OPEN_DIALOG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.OPEN_URL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.REPORT_PROBLEM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.CALL_NUMBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.VERIFY_IDENTITY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.COMPLETE_SCENARIO_PLAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.REFUND.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.REPORT_ABUSE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.UNREPORT_ABUSE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.COMPLETE_CLIENT_SCENARIO.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.SHOW_MORE_INFO_SHEET.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.SHOW_SUPPORT_OPTIONS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.CHECK_STATUS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.BITCOIN_DEPOSIT_REVERSAL.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.ADD_REACTION.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.CANCEL_INVESTMENT_ORDER.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.CANCEL_CRYPTO_ORDER.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.START_SUPPORT_FLOW.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.MAKE_LOAN_PAYMENT.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.SKIP_LOAN_PAYMENT.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.ACCEPT_CRYPTO_PAYMENT.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.CANCEL_RECURRING_PURCHASE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.SHOW_PAYMENT_DETAIL_VIEW.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[PaymentHistoryButton.ButtonAction.OPEN_SHARE_SHEET.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealPaymentManager(AndroidStringManager androidStringManager) {
        this.stringManager = androidStringManager;
    }

    public final void acceptCryptoPayment$real(String str, String str2) {
        str.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, new PaymentAction.AcceptCryptoPayment(str, str2));
    }

    public final void callNumber$real(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, new PaymentAction.CallNumberAction(str, str2, str3));
    }

    public final void cancel$real(String str, String str2, Money money, List list) {
        str.getClass();
        money.getClass();
        list.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, !CollectionsKt.contains(this.pendingPaymentTokens, str2) ? new PaymentAction.CancelAction(str, str2, money, list) : new PaymentAction.ErrorAction(str, this.stringManager.get(R.string.payment_already_canceled_error_message)));
    }

    public final void cancelCryptoOrder$real(String str, String str2, String str3) {
        str.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, new PaymentAction.CancelCryptoOrderAction(str, str2, str3));
    }

    public final void cancelInvestmentOrder$real(String str, String str2, String str3) {
        str.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, new PaymentAction.CancelInvestmentOrderAction(str, str2, str3));
    }

    public final void checkStatus$real(String str, String str2, Money money, List list) {
        str.getClass();
        money.getClass();
        list.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, new PaymentAction.CheckStatusAction(str, str2, money, list));
    }

    public final void completeClientScenario$real(ClientScenario clientScenario, String str, String str2) {
        str.getClass();
        clientScenario.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, new PaymentAction.CompleteClientScenarioAction(clientScenario, str, str2));
    }

    public final void completeScenarioPlan(String str, String str2, ScenarioPlan scenarioPlan, StatusResult statusResult) {
        str.getClass();
        str2.getClass();
        scenarioPlan.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, new PaymentAction.CompleteScenarioPlanAction(str, str2, scenarioPlan));
    }

    public final void confirm(String str, String str2) {
        str.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, !CollectionsKt.contains(this.pendingPaymentTokens, str2) ? new PaymentAction.ConfirmAction(str, str2) : new PaymentAction.ErrorAction(str, this.stringManager.get(R.string.payment_already_confirmed_error_message)));
    }

    public final void error(String str, String str2) {
        str.getClass();
        str2.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, new PaymentAction.ErrorAction(str, str2));
    }

    public final void linkCard$real(String str, String str2) {
        str.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, new PaymentAction.LinkCardAction(str, str2));
    }

    public final void makeLoanPayment$real(Money money, String str, String str2, String str3) {
        str.getClass();
        money.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, new PaymentAction.MakeLoanPayment(money, str, str2, str3));
    }

    public final void openShareSheet$real(String str, PaymentHistoryButton.ShareSheetDetails shareSheetDetails) {
        str.getClass();
        shareSheetDetails.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, new PaymentAction.ShowShareSheet(str, shareSheetDetails));
    }

    public final void openUrl$real(String str, String str2, String str3, Screen screen) {
        str.getClass();
        str3.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, new PaymentAction.OpenUrlAction(str, str2, str3, screen, null));
    }

    public final void passcode$real(String str, String str2) {
        str.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, new PaymentAction.PasscodeAction(str, str2));
    }

    public final void refund$real(String str, String str2) {
        str.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, new PaymentAction.RefundAction(str, str2));
    }

    public final void reportAbuse(String str, String str2, String str3, String str4, PaymentHistoryButton.Dialog dialog) {
        str.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, new PaymentAction.ReportAbuseAction(str, str2, str3, str4, dialog));
    }

    public final void reportProblem$real(String str, String str2, PaymentHistoryData paymentHistoryData, Screen screen) {
        str.getClass();
        screen.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, new PaymentAction.StartPaymentSupportFlowAction(str, null, str2, paymentHistoryData, screen));
    }

    public final void reverseDeposit$real(Screen screen, String str, String str2) {
        str.getClass();
        screen.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, new PaymentAction.ReverseDepositAction(screen, str, str2));
    }

    public final void showPaymentDetailView$real(String str, String str2, boolean z) {
        str.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, new PaymentAction.ShowPaymentDetailView(str, str2, z));
    }

    public final void skipLoanPayment$real(String str, String str2) {
        str.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, new PaymentAction.SkipLoanPayment(str, StringsKt.removePrefix("LTA_", str2)));
    }

    public final void startSupportFlow$real(String str, String str2, String str3, PaymentHistoryData paymentHistoryData, Screen screen) {
        str.getClass();
        screen.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, new PaymentAction.StartPaymentSupportFlowAction(str, str2, str3, paymentHistoryData, screen));
    }

    public final void unreportAbuse(String str, String str2, String str3, String str4, PaymentHistoryButton.Dialog dialog) {
        str.getClass();
        StateFlowKt.emitOrThrow(this.paymentActions, new PaymentAction.UnreportAbuseAction(str, str2, str3, str4, dialog));
    }
}
