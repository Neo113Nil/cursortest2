package com.squareup.cash.buynowpaylater.viewmodels;

import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AfterPayOrderDetailsPaymentMethodModel {
    public final boolean hasPaymentMethods;
    public final AfterPayOrderDetailsViewEvent onPaymentMethodClick;
    public final OrderPaymentViewModel orderPaymentViewModel;

    public AfterPayOrderDetailsPaymentMethodModel(boolean z, OrderPaymentViewModel orderPaymentViewModel, AfterPayOrderDetailsViewEvent.PaymentMethodInfoButtonClicked paymentMethodInfoButtonClicked) {
        this.hasPaymentMethods = z;
        this.orderPaymentViewModel = orderPaymentViewModel;
        this.onPaymentMethodClick = paymentMethodInfoButtonClicked;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterPayOrderDetailsPaymentMethodModel)) {
            return false;
        }
        AfterPayOrderDetailsPaymentMethodModel afterPayOrderDetailsPaymentMethodModel = (AfterPayOrderDetailsPaymentMethodModel) obj;
        return this.hasPaymentMethods == afterPayOrderDetailsPaymentMethodModel.hasPaymentMethods && Intrinsics.areEqual(this.orderPaymentViewModel, afterPayOrderDetailsPaymentMethodModel.orderPaymentViewModel) && Intrinsics.areEqual(this.onPaymentMethodClick, afterPayOrderDetailsPaymentMethodModel.onPaymentMethodClick);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.hasPaymentMethods) * 31;
        OrderPaymentViewModel orderPaymentViewModel = this.orderPaymentViewModel;
        int hashCode2 = (hashCode + (orderPaymentViewModel == null ? 0 : orderPaymentViewModel.hashCode())) * 31;
        AfterPayOrderDetailsViewEvent afterPayOrderDetailsViewEvent = this.onPaymentMethodClick;
        return hashCode2 + (afterPayOrderDetailsViewEvent != null ? afterPayOrderDetailsViewEvent.hashCode() : 0);
    }

    public final String toString() {
        return "AfterPayOrderDetailsPaymentMethodModel(hasPaymentMethods=" + this.hasPaymentMethods + ", orderPaymentViewModel=" + this.orderPaymentViewModel + ", onPaymentMethodClick=" + this.onPaymentMethodClick + ")";
    }
}
