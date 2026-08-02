package com.squareup.cash.investing.viewmodels.families;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DependentAutoInvestViewModel {
    public final DependentAutoInvestRecurringPurchaseViewModel recurringPurchaseModel;
    public final String title;

    public DependentAutoInvestViewModel(String str, DependentAutoInvestRecurringPurchaseViewModel dependentAutoInvestRecurringPurchaseViewModel) {
        str.getClass();
        this.title = str;
        this.recurringPurchaseModel = dependentAutoInvestRecurringPurchaseViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentAutoInvestViewModel)) {
            return false;
        }
        DependentAutoInvestViewModel dependentAutoInvestViewModel = (DependentAutoInvestViewModel) obj;
        return Intrinsics.areEqual(this.title, dependentAutoInvestViewModel.title) && Intrinsics.areEqual(this.recurringPurchaseModel, dependentAutoInvestViewModel.recurringPurchaseModel);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        DependentAutoInvestRecurringPurchaseViewModel dependentAutoInvestRecurringPurchaseViewModel = this.recurringPurchaseModel;
        return hashCode + (dependentAutoInvestRecurringPurchaseViewModel == null ? 0 : dependentAutoInvestRecurringPurchaseViewModel.hashCode());
    }

    public final String toString() {
        return "DependentAutoInvestViewModel(title=" + this.title + ", recurringPurchaseModel=" + this.recurringPurchaseModel + ")";
    }
}
