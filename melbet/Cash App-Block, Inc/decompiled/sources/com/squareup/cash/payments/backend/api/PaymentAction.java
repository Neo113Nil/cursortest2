package com.squareup.cash.payments.backend.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.text.android.CanvasCompatQ;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.Screen;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class PaymentAction {
    public final String flowToken;

    public final class AcceptCryptoPayment extends PaymentAction implements HasPaymentToken {
        public final String paymentToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AcceptCryptoPayment(String str, String str2) {
            super(str);
            str.getClass();
            this.paymentToken = str2;
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction.HasPaymentToken
        public final String getPaymentToken() {
            return this.paymentToken;
        }
    }

    public final class CallNumberAction extends PaymentAction implements HasPaymentToken {
        public final String number;
        public final String paymentToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallNumberAction(String str, String str2, String str3) {
            super(str);
            str.getClass();
            str3.getClass();
            this.paymentToken = str2;
            this.number = str3;
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction.HasPaymentToken
        public final String getPaymentToken() {
            return this.paymentToken;
        }
    }

    public final class CancelAction extends PaymentAction implements HasPaymentToken {
        public final List getters;
        public final Money paymentAmount;
        public final String paymentToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelAction(String str, String str2, Money money, List list) {
            super(str);
            str.getClass();
            money.getClass();
            list.getClass();
            this.paymentToken = str2;
            this.paymentAmount = money;
            this.getters = list;
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction.HasPaymentToken
        public final String getPaymentToken() {
            return this.paymentToken;
        }
    }

    public final class CancelCryptoOrderAction extends PaymentAction {
        public final String cancellationText;
        public final String orderToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelCryptoOrderAction(String str, String str2, String str3) {
            super(str);
            str.getClass();
            this.orderToken = str2;
            this.cancellationText = str3;
        }
    }

    public final class CancelInvestmentOrderAction extends PaymentAction {
        public final String cancellationText;
        public final String orderToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelInvestmentOrderAction(String str, String str2, String str3) {
            super(str);
            str.getClass();
            this.orderToken = str2;
            this.cancellationText = str3;
        }
    }

    public final class CancelRecurringPurchase extends PaymentAction {
        public final Money amount;
        public final String flowToken;
        public final RecurringSchedule.Frequency frequency;
        public final InvestmentEntityToken investmentEntityToken;

        /* renamed from: type, reason: collision with root package name */
        public final ScheduledTransactionPreference.Type f1182type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelRecurringPurchase(String str, ScheduledTransactionPreference.Type type2, RecurringSchedule.Frequency frequency, InvestmentEntityToken investmentEntityToken, Money money) {
            super(str);
            str.getClass();
            type2.getClass();
            frequency.getClass();
            money.getClass();
            this.flowToken = str;
            this.f1182type = type2;
            this.frequency = frequency;
            this.investmentEntityToken = investmentEntityToken;
            this.amount = money;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CancelRecurringPurchase)) {
                return false;
            }
            CancelRecurringPurchase cancelRecurringPurchase = (CancelRecurringPurchase) obj;
            return Intrinsics.areEqual(this.flowToken, cancelRecurringPurchase.flowToken) && this.f1182type == cancelRecurringPurchase.f1182type && this.frequency == cancelRecurringPurchase.frequency && Intrinsics.areEqual(this.investmentEntityToken, cancelRecurringPurchase.investmentEntityToken) && Intrinsics.areEqual(this.amount, cancelRecurringPurchase.amount);
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction
        public final String getFlowToken() {
            return this.flowToken;
        }

        public final int hashCode() {
            int hashCode = (this.frequency.hashCode() + ((this.f1182type.hashCode() + (this.flowToken.hashCode() * 31)) * 31)) * 31;
            InvestmentEntityToken investmentEntityToken = this.investmentEntityToken;
            return this.amount.hashCode() + ((hashCode + (investmentEntityToken == null ? 0 : investmentEntityToken.value.hashCode())) * 31);
        }

        public final String toString() {
            return "CancelRecurringPurchase(flowToken=" + this.flowToken + ", type=" + this.f1182type + ", frequency=" + this.frequency + ", investmentEntityToken=" + this.investmentEntityToken + ", amount=" + this.amount + ")";
        }
    }

    public final class CheckStatusAction extends PaymentAction implements HasPaymentToken {
        public final Money paymentAmount;
        public final List paymentGetters;
        public final String paymentToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CheckStatusAction(String str, String str2, Money money, List list) {
            super(str);
            str.getClass();
            money.getClass();
            list.getClass();
            this.paymentToken = str2;
            this.paymentAmount = money;
            this.paymentGetters = list;
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction.HasPaymentToken
        public final String getPaymentToken() {
            return this.paymentToken;
        }
    }

    public final class CompleteClientScenarioAction extends PaymentAction implements HasPaymentToken {
        public final ClientScenario clientScenario;
        public final String paymentToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CompleteClientScenarioAction(ClientScenario clientScenario, String str, String str2) {
            super(str);
            str.getClass();
            str2.getClass();
            clientScenario.getClass();
            this.paymentToken = str2;
            this.clientScenario = clientScenario;
        }

        public final ClientScenario getClientScenario() {
            return this.clientScenario;
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction.HasPaymentToken
        public final String getPaymentToken() {
            return this.paymentToken;
        }
    }

    public final class CompleteScenarioPlanAction extends PaymentAction implements HasPaymentToken {
        public final String paymentToken;
        public final ScenarioPlan scenarioPlan;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CompleteScenarioPlanAction(String str, String str2, ScenarioPlan scenarioPlan) {
            super(str);
            str.getClass();
            str2.getClass();
            scenarioPlan.getClass();
            this.paymentToken = str2;
            this.scenarioPlan = scenarioPlan;
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction.HasPaymentToken
        public final String getPaymentToken() {
            return this.paymentToken;
        }
    }

    public final class ConfirmAction extends PaymentAction implements HasPaymentToken {
        public final String paymentToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmAction(String str, String str2) {
            super(str);
            str.getClass();
            this.paymentToken = str2;
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction.HasPaymentToken
        public final String getPaymentToken() {
            return this.paymentToken;
        }
    }

    public final class ErrorAction extends PaymentAction {
        public final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorAction(String str, String str2) {
            super(str);
            str.getClass();
            str2.getClass();
            this.message = str2;
        }
    }

    public interface HasPaymentToken {
        String getPaymentToken();
    }

    public final class InitiatePaymentAction extends PaymentAction implements HasPaymentToken {
        public final List getters;
        public final String paymentToken;

        public InitiatePaymentAction(String str, List list) {
            super(str);
            this.paymentToken = str;
            this.getters = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitiatePaymentAction)) {
                return false;
            }
            InitiatePaymentAction initiatePaymentAction = (InitiatePaymentAction) obj;
            return this.paymentToken.equals(initiatePaymentAction.paymentToken) && this.getters.equals(initiatePaymentAction.getters);
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction.HasPaymentToken
        public final String getPaymentToken() {
            return this.paymentToken;
        }

        public final int hashCode() {
            return this.getters.hashCode() + (this.paymentToken.hashCode() * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("InitiatePaymentAction(paymentToken=", this.paymentToken, ", getters=", ")", this.getters);
        }
    }

    public final class InitiatePaymentPendingAction extends PaymentAction implements HasPaymentToken {
        public final String paymentToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitiatePaymentPendingAction(String str) {
            super(str);
            str.getClass();
            this.paymentToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitiatePaymentPendingAction) && Intrinsics.areEqual(this.paymentToken, ((InitiatePaymentPendingAction) obj).paymentToken);
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction.HasPaymentToken
        public final String getPaymentToken() {
            return this.paymentToken;
        }

        public final int hashCode() {
            return this.paymentToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InitiatePaymentPendingAction(paymentToken=", this.paymentToken, ")");
        }
    }

    public final class LinkCardAction extends PaymentAction implements HasPaymentToken {
        public final String paymentToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkCardAction(String str, String str2) {
            super(str);
            str.getClass();
            this.paymentToken = str2;
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction.HasPaymentToken
        public final String getPaymentToken() {
            return this.paymentToken;
        }
    }

    public final class MakeLoanPayment extends PaymentAction {
        public final Money amount;
        public final String loanTransactionToken;
        public final String opaqueData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MakeLoanPayment(Money money, String str, String str2, String str3) {
            super(str);
            str.getClass();
            money.getClass();
            this.loanTransactionToken = str2;
            this.amount = money;
            this.opaqueData = str3;
        }
    }

    public final class OpenDialogAction extends PaymentAction implements HasPaymentToken {
        public final PaymentHistoryButton.Dialog dialog;
        public final String paymentToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenDialogAction(String str, String str2, PaymentHistoryButton.Dialog dialog) {
            super(str);
            dialog.getClass();
            this.paymentToken = str2;
            this.dialog = dialog;
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction.HasPaymentToken
        public final String getPaymentToken() {
            return this.paymentToken;
        }
    }

    public final class OpenUrlAction extends PaymentAction implements HasPaymentToken {
        public final Screen exitScreen;
        public final String paymentToken;
        public final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenUrlAction(String str, String str2, String str3, Screen screen, CanvasCompatQ canvasCompatQ) {
            super(str);
            str.getClass();
            str3.getClass();
            this.paymentToken = str2;
            this.url = str3;
            this.exitScreen = screen;
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction.HasPaymentToken
        public final String getPaymentToken() {
            return this.paymentToken;
        }
    }

    public final class PasscodeAction extends PaymentAction implements HasPaymentToken {
        public final String paymentToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PasscodeAction(String str, String str2) {
            super(str);
            str.getClass();
            this.paymentToken = str2;
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction.HasPaymentToken
        public final String getPaymentToken() {
            return this.paymentToken;
        }
    }

    public final class RefundAction extends PaymentAction implements HasPaymentToken {
        public final String paymentToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefundAction(String str, String str2) {
            super(str);
            str.getClass();
            this.paymentToken = str2;
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction.HasPaymentToken
        public final String getPaymentToken() {
            return this.paymentToken;
        }
    }

    public final class ReportAbuseAction extends PaymentAction implements HasPaymentToken {
        public final String customerToken;
        public final PaymentHistoryButton.Dialog dialog;
        public final String flowToken;
        public final String paymentToken;
        public final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReportAbuseAction(String str, String str2, String str3, String str4, PaymentHistoryButton.Dialog dialog) {
            super(str);
            str.getClass();
            this.flowToken = str;
            this.paymentToken = str2;
            this.customerToken = str3;
            this.url = str4;
            this.dialog = dialog;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReportAbuseAction)) {
                return false;
            }
            ReportAbuseAction reportAbuseAction = (ReportAbuseAction) obj;
            return Intrinsics.areEqual(this.flowToken, reportAbuseAction.flowToken) && this.paymentToken.equals(reportAbuseAction.paymentToken) && this.customerToken.equals(reportAbuseAction.customerToken) && Intrinsics.areEqual(this.url, reportAbuseAction.url) && Intrinsics.areEqual(this.dialog, reportAbuseAction.dialog);
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction
        public final String getFlowToken() {
            return this.flowToken;
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction.HasPaymentToken
        public final String getPaymentToken() {
            return this.paymentToken;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.flowToken.hashCode() * 31, 31, this.paymentToken), 31, this.customerToken);
            String str = this.url;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            PaymentHistoryButton.Dialog dialog = this.dialog;
            return hashCode + (dialog != null ? dialog.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ReportAbuseAction(flowToken=", this.flowToken, ", paymentToken=", this.paymentToken, ", customerToken=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.customerToken, ", url=", this.url, ", dialog=");
            m.append(this.dialog);
            m.append(")");
            return m.toString();
        }
    }

    public final class ReverseDepositAction extends PaymentAction implements HasPaymentToken {
        public final Screen exitScreen;
        public final String paymentToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReverseDepositAction(Screen screen, String str, String str2) {
            super(str);
            str.getClass();
            screen.getClass();
            this.paymentToken = str2;
            this.exitScreen = screen;
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction.HasPaymentToken
        public final String getPaymentToken() {
            return this.paymentToken;
        }
    }

    public final class SendCancelCryptoOrderAction extends PaymentAction {
        public final String orderToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendCancelCryptoOrderAction(String str, String str2) {
            super(str);
            str.getClass();
            str2.getClass();
            this.orderToken = str2;
        }
    }

    public final class SendCancelInvestmentOrderAction extends PaymentAction {
        public final String orderToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendCancelInvestmentOrderAction(String str, String str2) {
            super(str);
            str.getClass();
            str2.getClass();
            this.orderToken = str2;
        }
    }

    public final class SendConfirmAction extends PaymentAction implements HasPaymentToken {
        public final String paymentToken;
        public final InstrumentSelection selection;

        public SendConfirmAction(String str, String str2, InstrumentSelection instrumentSelection) {
            super(str);
            this.paymentToken = str2;
            this.selection = instrumentSelection;
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction.HasPaymentToken
        public final String getPaymentToken() {
            return this.paymentToken;
        }

        public final InstrumentSelection getSelection() {
            return this.selection;
        }
    }

    public final class SendRefundAction extends PaymentAction implements HasPaymentToken {
        public final ClientScenario clientScenario;
        public final String paymentToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendRefundAction(ClientScenario clientScenario, String str, String str2) {
            super(str);
            str.getClass();
            str2.getClass();
            this.clientScenario = clientScenario;
            this.paymentToken = str2;
        }

        public final ClientScenario getClientScenario() {
            return this.clientScenario;
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction.HasPaymentToken
        public final String getPaymentToken() {
            return this.paymentToken;
        }
    }

    public final class SendSkipLoanPayment extends PaymentAction {
        public final String loanTransactionToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendSkipLoanPayment(String str, String str2) {
            super(str);
            str.getClass();
            str2.getClass();
            this.loanTransactionToken = str2;
        }
    }

    public final class ShowContact extends PaymentAction {
        public final String flowToken;
        public final String theirId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowContact(String str, String str2) {
            super(str);
            str.getClass();
            this.flowToken = str;
            this.theirId = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowContact)) {
                return false;
            }
            ShowContact showContact = (ShowContact) obj;
            return Intrinsics.areEqual(this.flowToken, showContact.flowToken) && this.theirId.equals(showContact.theirId);
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction
        public final String getFlowToken() {
            return this.flowToken;
        }

        public final int hashCode() {
            return this.theirId.hashCode() + (this.flowToken.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("ShowContact(flowToken=", this.flowToken, ", theirId=", this.theirId, ")");
        }
    }

    public final class ShowPaymentDetailView extends PaymentAction implements HasPaymentToken {
        public final String flowToken;
        public final boolean fromActivityTab;
        public final String paymentToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowPaymentDetailView(String str, String str2, boolean z) {
            super(str);
            str.getClass();
            this.flowToken = str;
            this.paymentToken = str2;
            this.fromActivityTab = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowPaymentDetailView)) {
                return false;
            }
            ShowPaymentDetailView showPaymentDetailView = (ShowPaymentDetailView) obj;
            return Intrinsics.areEqual(this.flowToken, showPaymentDetailView.flowToken) && this.paymentToken.equals(showPaymentDetailView.paymentToken) && this.fromActivityTab == showPaymentDetailView.fromActivityTab;
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction
        public final String getFlowToken() {
            return this.flowToken;
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction.HasPaymentToken
        public final String getPaymentToken() {
            return this.paymentToken;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.fromActivityTab) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.flowToken.hashCode() * 31, 31, this.paymentToken);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShowPaymentDetailView(flowToken=", this.flowToken, ", paymentToken=", this.paymentToken, ", fromActivityTab="), this.fromActivityTab, ")");
        }
    }

    public final class ShowProfile extends PaymentAction implements HasPaymentToken {
        public final String flowToken;
        public final boolean isBusiness;
        public final boolean isMerchant;
        public final String paymentToken;
        public final String theirId;
        public final String threadedCustomerId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowProfile(String str, String str2, String str3, String str4, boolean z, boolean z2) {
            super(str);
            str.getClass();
            this.flowToken = str;
            this.paymentToken = str2;
            this.threadedCustomerId = str3;
            this.theirId = str4;
            this.isMerchant = z;
            this.isBusiness = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowProfile)) {
                return false;
            }
            ShowProfile showProfile = (ShowProfile) obj;
            return Intrinsics.areEqual(this.flowToken, showProfile.flowToken) && this.paymentToken.equals(showProfile.paymentToken) && Intrinsics.areEqual(this.threadedCustomerId, showProfile.threadedCustomerId) && this.theirId.equals(showProfile.theirId) && this.isMerchant == showProfile.isMerchant && this.isBusiness == showProfile.isBusiness;
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction
        public final String getFlowToken() {
            return this.flowToken;
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction.HasPaymentToken
        public final String getPaymentToken() {
            return this.paymentToken;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.flowToken.hashCode() * 31, 31, this.paymentToken);
            String str = this.threadedCustomerId;
            return Boolean.hashCode(this.isBusiness) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.theirId), 31, this.isMerchant);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShowProfile(flowToken=", this.flowToken, ", paymentToken=", this.paymentToken, ", threadedCustomerId=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.threadedCustomerId, ", theirId=", this.theirId, ", isMerchant=");
            return Request$Priority$EnumUnboxingLocalUtility.m(m, this.isMerchant, ", isBusiness=", this.isBusiness, ")");
        }
    }

    public final class ShowShareSheet extends PaymentAction {
        public final PaymentHistoryButton.ShareSheetDetails details;
        public final String flowToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowShareSheet(String str, PaymentHistoryButton.ShareSheetDetails shareSheetDetails) {
            super(str);
            str.getClass();
            shareSheetDetails.getClass();
            this.flowToken = str;
            this.details = shareSheetDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowShareSheet)) {
                return false;
            }
            ShowShareSheet showShareSheet = (ShowShareSheet) obj;
            return Intrinsics.areEqual(this.flowToken, showShareSheet.flowToken) && Intrinsics.areEqual(this.details, showShareSheet.details);
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction
        public final String getFlowToken() {
            return this.flowToken;
        }

        public final int hashCode() {
            return this.details.hashCode() + (this.flowToken.hashCode() * 31);
        }

        public final String toString() {
            return "ShowShareSheet(flowToken=" + this.flowToken + ", details=" + this.details + ")";
        }
    }

    public final class SkipLoanPayment extends PaymentAction {
        public final String loanTransactionToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SkipLoanPayment(String str, String str2) {
            super(str);
            str.getClass();
            this.loanTransactionToken = str2;
        }
    }

    public final class StartPaymentSupportFlowAction extends PaymentAction implements HasPaymentToken {
        public final Screen exitScreen;
        public final String nodeToken;
        public final String paymentToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartPaymentSupportFlowAction(String str, String str2, String str3, PaymentHistoryData paymentHistoryData, Screen screen) {
            super(str);
            str.getClass();
            screen.getClass();
            this.nodeToken = str2;
            this.paymentToken = str3;
            this.exitScreen = screen;
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction.HasPaymentToken
        public final String getPaymentToken() {
            return this.paymentToken;
        }
    }

    public final class UnreportAbuseAction extends PaymentAction implements HasPaymentToken {
        public final String customerToken;
        public final PaymentHistoryButton.Dialog dialog;
        public final String flowToken;
        public final String paymentToken;
        public final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnreportAbuseAction(String str, String str2, String str3, String str4, PaymentHistoryButton.Dialog dialog) {
            super(str);
            str.getClass();
            this.flowToken = str;
            this.paymentToken = str2;
            this.customerToken = str3;
            this.url = str4;
            this.dialog = dialog;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnreportAbuseAction)) {
                return false;
            }
            UnreportAbuseAction unreportAbuseAction = (UnreportAbuseAction) obj;
            return Intrinsics.areEqual(this.flowToken, unreportAbuseAction.flowToken) && this.paymentToken.equals(unreportAbuseAction.paymentToken) && this.customerToken.equals(unreportAbuseAction.customerToken) && Intrinsics.areEqual(this.url, unreportAbuseAction.url) && Intrinsics.areEqual(this.dialog, unreportAbuseAction.dialog);
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction
        public final String getFlowToken() {
            return this.flowToken;
        }

        @Override // com.squareup.cash.payments.backend.api.PaymentAction.HasPaymentToken
        public final String getPaymentToken() {
            return this.paymentToken;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.flowToken.hashCode() * 31, 31, this.paymentToken), 31, this.customerToken);
            String str = this.url;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            PaymentHistoryButton.Dialog dialog = this.dialog;
            return hashCode + (dialog != null ? dialog.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UnreportAbuseAction(flowToken=", this.flowToken, ", paymentToken=", this.paymentToken, ", customerToken=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.customerToken, ", url=", this.url, ", dialog=");
            m.append(this.dialog);
            m.append(")");
            return m.toString();
        }
    }

    public PaymentAction(String str) {
        this.flowToken = str;
    }

    public String getFlowToken() {
        return this.flowToken;
    }
}
