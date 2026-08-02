package com.squareup.cash.shopping.sup.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SingleUsePaymentPlanDetailsViewModel {
    public final String firstPayment;
    public final String orderTotal;

    public SingleUsePaymentPlanDetailsViewModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.firstPayment = str;
        this.orderTotal = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleUsePaymentPlanDetailsViewModel)) {
            return false;
        }
        SingleUsePaymentPlanDetailsViewModel singleUsePaymentPlanDetailsViewModel = (SingleUsePaymentPlanDetailsViewModel) obj;
        return Intrinsics.areEqual(this.firstPayment, singleUsePaymentPlanDetailsViewModel.firstPayment) && Intrinsics.areEqual(this.orderTotal, singleUsePaymentPlanDetailsViewModel.orderTotal);
    }

    public final int hashCode() {
        return this.orderTotal.hashCode() + (this.firstPayment.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("SingleUsePaymentPlanDetailsViewModel(firstPayment=", this.firstPayment, ", orderTotal=", this.orderTotal, ")");
    }
}
