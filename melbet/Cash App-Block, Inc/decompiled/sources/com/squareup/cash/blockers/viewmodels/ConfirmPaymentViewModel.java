package com.squareup.cash.blockers.viewmodels;

import com.squareup.protos.franklin.common.scenarios.ConfirmBlockerSupplement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ConfirmPaymentViewModel {
    public final boolean isLoading;
    public final ConfirmBlockerSupplement supplement;

    public ConfirmPaymentViewModel(ConfirmBlockerSupplement confirmBlockerSupplement, boolean z) {
        confirmBlockerSupplement.getClass();
        this.supplement = confirmBlockerSupplement;
        this.isLoading = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmPaymentViewModel)) {
            return false;
        }
        ConfirmPaymentViewModel confirmPaymentViewModel = (ConfirmPaymentViewModel) obj;
        return Intrinsics.areEqual(this.supplement, confirmPaymentViewModel.supplement) && this.isLoading == confirmPaymentViewModel.isLoading;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isLoading) + (this.supplement.hashCode() * 31);
    }

    public final String toString() {
        return "ConfirmPaymentViewModel(supplement=" + this.supplement + ", isLoading=" + this.isLoading + ")";
    }
}
