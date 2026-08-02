package com.squareup.cash.paychecks.views;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SpacedAllocationSegmentsProperties {
    public final float angleShrink;
    public final boolean applyExtraSpacingForHandle;
    public final float gapBetweenSegments;
    public final float handleGap;
    public final ComposeDecoratedAllocation interactiveSegment;

    public SpacedAllocationSegmentsProperties(ComposeDecoratedAllocation composeDecoratedAllocation, float f, float f2, boolean z, float f3) {
        this.interactiveSegment = composeDecoratedAllocation;
        this.gapBetweenSegments = f;
        this.handleGap = f2;
        this.applyExtraSpacingForHandle = z;
        this.angleShrink = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacedAllocationSegmentsProperties)) {
            return false;
        }
        SpacedAllocationSegmentsProperties spacedAllocationSegmentsProperties = (SpacedAllocationSegmentsProperties) obj;
        return Intrinsics.areEqual(this.interactiveSegment, spacedAllocationSegmentsProperties.interactiveSegment) && Float.compare(this.gapBetweenSegments, spacedAllocationSegmentsProperties.gapBetweenSegments) == 0 && Float.compare(this.handleGap, spacedAllocationSegmentsProperties.handleGap) == 0 && this.applyExtraSpacingForHandle == spacedAllocationSegmentsProperties.applyExtraSpacingForHandle && Float.compare(this.angleShrink, spacedAllocationSegmentsProperties.angleShrink) == 0;
    }

    public final int hashCode() {
        ComposeDecoratedAllocation composeDecoratedAllocation = this.interactiveSegment;
        return Float.hashCode(this.angleShrink) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.handleGap, CameraState$Type$EnumUnboxingLocalUtility.m(this.gapBetweenSegments, (composeDecoratedAllocation == null ? 0 : composeDecoratedAllocation.hashCode()) * 31, 31), 31), 31, this.applyExtraSpacingForHandle);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpacedAllocationSegmentsProperties(interactiveSegment=");
        sb.append(this.interactiveSegment);
        sb.append(", gapBetweenSegments=");
        sb.append(this.gapBetweenSegments);
        sb.append(", handleGap=");
        sb.append(this.handleGap);
        sb.append(", applyExtraSpacingForHandle=");
        sb.append(this.applyExtraSpacingForHandle);
        sb.append(", angleShrink=");
        return Recorder$$ExternalSyntheticOutline1.m(this.angleShrink, ")", sb);
    }
}
