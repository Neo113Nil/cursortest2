package com.squareup.cash.merchant.viewmodels;

import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.history.payments.viewmodels.ProfilePaymentHistoryViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MerchantBodyViewModel {
    public final GenericTreeElementsViewModel.Loaded genericTreeElements;
    public final ProfilePaymentHistoryViewModel paymentHistory;

    public MerchantBodyViewModel(GenericTreeElementsViewModel.Loaded loaded, ProfilePaymentHistoryViewModel profilePaymentHistoryViewModel) {
        loaded.getClass();
        profilePaymentHistoryViewModel.getClass();
        this.genericTreeElements = loaded;
        this.paymentHistory = profilePaymentHistoryViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantBodyViewModel)) {
            return false;
        }
        MerchantBodyViewModel merchantBodyViewModel = (MerchantBodyViewModel) obj;
        return Intrinsics.areEqual(this.genericTreeElements, merchantBodyViewModel.genericTreeElements) && Intrinsics.areEqual(this.paymentHistory, merchantBodyViewModel.paymentHistory);
    }

    public final int hashCode() {
        return this.paymentHistory.hashCode() + (this.genericTreeElements.hashCode() * 31);
    }

    public final String toString() {
        return "MerchantBodyViewModel(genericTreeElements=" + this.genericTreeElements + ", paymentHistory=" + this.paymentHistory + ")";
    }
}
