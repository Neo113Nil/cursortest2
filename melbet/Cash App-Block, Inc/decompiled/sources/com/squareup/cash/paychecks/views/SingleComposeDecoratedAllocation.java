package com.squareup.cash.paychecks.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SingleComposeDecoratedAllocation implements ComposeDecoratedAllocation {
    public final long color;
    public final float percentage;
    public final DistributionWheelViewModel.Allocation.Treatment treatment;

    public SingleComposeDecoratedAllocation(float f, long j, DistributionWheelViewModel.Allocation.Treatment treatment) {
        treatment.getClass();
        this.percentage = f;
        this.color = j;
        this.treatment = treatment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleComposeDecoratedAllocation)) {
            return false;
        }
        SingleComposeDecoratedAllocation singleComposeDecoratedAllocation = (SingleComposeDecoratedAllocation) obj;
        return Float.compare(this.percentage, singleComposeDecoratedAllocation.percentage) == 0 && Color.m676equalsimpl0(this.color, singleComposeDecoratedAllocation.color) && Intrinsics.areEqual(this.treatment, singleComposeDecoratedAllocation.treatment);
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
        int hashCode = Float.hashCode(this.percentage) * 31;
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return this.treatment.hashCode() + Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.color);
    }

    public final String toString() {
        return "SingleComposeDecoratedAllocation(percentage=" + this.percentage + ", color=" + Color.m682toStringimpl(this.color) + ", treatment=" + this.treatment + ")";
    }
}
