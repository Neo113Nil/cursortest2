package app.cash.local.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.viewmodels.OrderBuilderModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalOpenTabCheckoutViewModel {
    public final OrderBuilderModel.BuyerInfo.UiReady buyerInfo;
    public final boolean isPlaceOrderEnabled;
    public final boolean isPlaceOrderLoading;
    public final LocalCheckoutOrderSummaryViewModel orderSummary;
    public final LocalCheckoutPaymentSectionViewModel paymentSection;
    public final LocalCheckoutPaymentTimingViewModel paymentTiming;
    public final LocalCheckoutSpecialInstructionsViewModel specialInstructions;
    public final String subtotalAmount;
    public final String totalAmount;

    public LocalOpenTabCheckoutViewModel(OrderBuilderModel.BuyerInfo.UiReady uiReady, LocalCheckoutPaymentSectionViewModel localCheckoutPaymentSectionViewModel, LocalCheckoutPaymentTimingViewModel localCheckoutPaymentTimingViewModel, LocalCheckoutSpecialInstructionsViewModel localCheckoutSpecialInstructionsViewModel, LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel, String str, String str2, boolean z, boolean z2) {
        this.buyerInfo = uiReady;
        this.paymentSection = localCheckoutPaymentSectionViewModel;
        this.paymentTiming = localCheckoutPaymentTimingViewModel;
        this.specialInstructions = localCheckoutSpecialInstructionsViewModel;
        this.orderSummary = localCheckoutOrderSummaryViewModel;
        this.subtotalAmount = str;
        this.totalAmount = str2;
        this.isPlaceOrderEnabled = z;
        this.isPlaceOrderLoading = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalOpenTabCheckoutViewModel)) {
            return false;
        }
        LocalOpenTabCheckoutViewModel localOpenTabCheckoutViewModel = (LocalOpenTabCheckoutViewModel) obj;
        return this.buyerInfo.equals(localOpenTabCheckoutViewModel.buyerInfo) && this.paymentSection.equals(localOpenTabCheckoutViewModel.paymentSection) && this.paymentTiming.equals(localOpenTabCheckoutViewModel.paymentTiming) && Intrinsics.areEqual(this.specialInstructions, localOpenTabCheckoutViewModel.specialInstructions) && this.orderSummary.equals(localOpenTabCheckoutViewModel.orderSummary) && this.subtotalAmount.equals(localOpenTabCheckoutViewModel.subtotalAmount) && this.totalAmount.equals(localOpenTabCheckoutViewModel.totalAmount) && this.isPlaceOrderEnabled == localOpenTabCheckoutViewModel.isPlaceOrderEnabled && this.isPlaceOrderLoading == localOpenTabCheckoutViewModel.isPlaceOrderLoading;
    }

    public final int hashCode() {
        int hashCode = (this.paymentTiming.hashCode() + ((this.paymentSection.hashCode() + (this.buyerInfo.hashCode() * 31)) * 31)) * 31;
        LocalCheckoutSpecialInstructionsViewModel localCheckoutSpecialInstructionsViewModel = this.specialInstructions;
        return Boolean.hashCode(this.isPlaceOrderLoading) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.orderSummary.hashCode() + ((hashCode + (localCheckoutSpecialInstructionsViewModel == null ? 0 : localCheckoutSpecialInstructionsViewModel.hashCode())) * 31)) * 31, 31, this.subtotalAmount), 31, this.totalAmount), 31, this.isPlaceOrderEnabled);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalOpenTabCheckoutViewModel(buyerInfo=");
        sb.append(this.buyerInfo);
        sb.append(", paymentSection=");
        sb.append(this.paymentSection);
        sb.append(", paymentTiming=");
        sb.append(this.paymentTiming);
        sb.append(", specialInstructions=");
        sb.append(this.specialInstructions);
        sb.append(", orderSummary=");
        sb.append(this.orderSummary);
        sb.append(", subtotalAmount=");
        sb.append(this.subtotalAmount);
        sb.append(", totalAmount=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.totalAmount, ", isPlaceOrderEnabled=", this.isPlaceOrderEnabled, ", isPlaceOrderLoading=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isPlaceOrderLoading, ")");
    }
}
