package com.squareup.cash.directdeposit.viewmodels;

/* loaded from: classes6.dex */
public final class DirectDepositEditPaycheckAmountViewModel {
    public final PaycheckDepositAllocationType selectedType;

    public DirectDepositEditPaycheckAmountViewModel(PaycheckDepositAllocationType paycheckDepositAllocationType) {
        paycheckDepositAllocationType.getClass();
        this.selectedType = paycheckDepositAllocationType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DirectDepositEditPaycheckAmountViewModel) && this.selectedType == ((DirectDepositEditPaycheckAmountViewModel) obj).selectedType;
    }

    public final int hashCode() {
        return this.selectedType.hashCode();
    }

    public final String toString() {
        return "DirectDepositEditPaycheckAmountViewModel(selectedType=" + this.selectedType + ")";
    }
}
