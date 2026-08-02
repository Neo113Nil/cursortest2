package com.squareup.cash.paychecks.views;

import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;

/* loaded from: classes6.dex */
public final class SpacedAllocationSegment {
    public final ComposeDecoratedAllocation allocation;
    public final float angle;
    public final float gap;
    public final SpacedAllocationSegmentsProperties segmentProperties;
    public final boolean selected;
    public final float sweepAngle;

    public SpacedAllocationSegment(ComposeDecoratedAllocation composeDecoratedAllocation, SpacedAllocationSegmentsProperties spacedAllocationSegmentsProperties) {
        composeDecoratedAllocation.getClass();
        this.allocation = composeDecoratedAllocation;
        this.segmentProperties = spacedAllocationSegmentsProperties;
        float f = (composeDecoratedAllocation.equals(spacedAllocationSegmentsProperties.interactiveSegment) && spacedAllocationSegmentsProperties.applyExtraSpacingForHandle) ? spacedAllocationSegmentsProperties.handleGap : spacedAllocationSegmentsProperties.gapBetweenSegments;
        this.gap = f;
        float max = Math.max(composeDecoratedAllocation.getPercentage() * 360.0f * spacedAllocationSegmentsProperties.angleShrink, f);
        this.angle = max;
        this.selected = composeDecoratedAllocation.getTreatment() instanceof DistributionWheelViewModel.Allocation.Treatment.InteractableSelected;
        this.sweepAngle = max - f;
    }
}
