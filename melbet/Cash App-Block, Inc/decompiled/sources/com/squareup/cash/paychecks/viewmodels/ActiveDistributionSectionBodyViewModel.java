package com.squareup.cash.paychecks.viewmodels;

import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ActiveDistributionSectionBodyViewModel {
    public final ArrayList allocations;
    public final DistributionWheelViewModel wheelViewModel;

    public final class Allocation {
        public final Color color;
        public final String label;
        public final String percentage;

        public Allocation(Color color, String str, String str2) {
            color.getClass();
            str.getClass();
            this.color = color;
            this.percentage = str;
            this.label = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Allocation)) {
                return false;
            }
            Allocation allocation = (Allocation) obj;
            return Intrinsics.areEqual(this.color, allocation.color) && Intrinsics.areEqual(this.percentage, allocation.percentage) && this.label.equals(allocation.label);
        }

        public final int hashCode() {
            return this.label.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.color.hashCode() * 31, 31, this.percentage);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Allocation(color=");
            sb.append(this.color);
            sb.append(", percentage=");
            sb.append(this.percentage);
            sb.append(", label=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.label, ")");
        }
    }

    public ActiveDistributionSectionBodyViewModel(DistributionWheelViewModel distributionWheelViewModel, ArrayList arrayList) {
        this.wheelViewModel = distributionWheelViewModel;
        this.allocations = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveDistributionSectionBodyViewModel)) {
            return false;
        }
        ActiveDistributionSectionBodyViewModel activeDistributionSectionBodyViewModel = (ActiveDistributionSectionBodyViewModel) obj;
        return this.wheelViewModel.equals(activeDistributionSectionBodyViewModel.wheelViewModel) && this.allocations.equals(activeDistributionSectionBodyViewModel.allocations);
    }

    public final int hashCode() {
        return this.allocations.hashCode() + (this.wheelViewModel.hashCode() * 31);
    }

    public final String toString() {
        return "ActiveDistributionSectionBodyViewModel(wheelViewModel=" + this.wheelViewModel + ", allocations=" + this.allocations + ")";
    }
}
