package com.squareup.cash.paychecks.views;

import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class ComposeDecoratedAllocationGroup implements ComposeDecoratedAllocation {
    public final ArrayList allocations;
    public final float percentage;
    public final DistributionWheelViewModel.Allocation.Treatment treatment;

    public ComposeDecoratedAllocationGroup(DistributionWheelViewModel.Allocation.Treatment treatment, ArrayList arrayList) {
        this.allocations = arrayList;
        this.treatment = treatment;
        double d = 0.0d;
        while (arrayList.iterator().hasNext()) {
            d += ((SingleComposeDecoratedAllocation) r5.next()).percentage;
        }
        this.percentage = (float) d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposeDecoratedAllocationGroup)) {
            return false;
        }
        ComposeDecoratedAllocationGroup composeDecoratedAllocationGroup = (ComposeDecoratedAllocationGroup) obj;
        return this.allocations.equals(composeDecoratedAllocationGroup.allocations) && this.treatment.equals(composeDecoratedAllocationGroup.treatment);
    }

    @Override // com.squareup.cash.paychecks.views.ComposeDecoratedAllocation
    public final float getPercentage() {
        return this.percentage;
    }

    @Override // com.squareup.cash.paychecks.views.ComposeDecoratedAllocation
    public final DistributionWheelViewModel.Allocation.Treatment getTreatment() {
        return this.treatment;
    }

    public final int hashCode() {
        return this.treatment.hashCode() + (this.allocations.hashCode() * 31);
    }

    public final String toString() {
        return "ComposeDecoratedAllocationGroup(allocations=" + this.allocations + ", treatment=" + this.treatment + ")";
    }
}
