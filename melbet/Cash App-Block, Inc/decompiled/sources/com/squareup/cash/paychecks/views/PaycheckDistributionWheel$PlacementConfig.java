package com.squareup.cash.paychecks.views;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.common.composeui.SegmentedCircle$ContentLayoutPolicy;
import com.squareup.cash.common.composeui.SegmentedCircleConfig;

/* loaded from: classes6.dex */
public final class PaycheckDistributionWheel$PlacementConfig {
    public static final PaycheckDistributionWheel$PlacementConfig ARCADE_DISTRIBUTION_FLOW;
    public static final PaycheckDistributionWheel$PlacementConfig PAYCHECKS_HOME_SECTION;
    public static final PaycheckDistributionWheel$PlacementConfig PAYCHECK_RECEIPT;
    public final SegmentedCircle$ContentLayoutPolicy contentLayoutPolicy;
    public final SegmentedCircleConfig.SizingConfig.Percentage segmentGapWidth;
    public final SegmentedCircleConfig.SizingConfig.Percentage strokeThickness;

    static {
        SegmentedCircle$ContentLayoutPolicy segmentedCircle$ContentLayoutPolicy = SegmentedCircle$ContentLayoutPolicy.INSIDE_CORNER;
        PAYCHECKS_HOME_SECTION = new PaycheckDistributionWheel$PlacementConfig(new SegmentedCircleConfig.SizingConfig.Percentage(0.05f), new SegmentedCircleConfig.SizingConfig.Percentage(0.045f), segmentedCircle$ContentLayoutPolicy);
        PAYCHECK_RECEIPT = new PaycheckDistributionWheel$PlacementConfig(new SegmentedCircleConfig.SizingConfig.Percentage(0.047f), new SegmentedCircleConfig.SizingConfig.Percentage(0.015f), segmentedCircle$ContentLayoutPolicy);
        ARCADE_DISTRIBUTION_FLOW = new PaycheckDistributionWheel$PlacementConfig(new SegmentedCircleConfig.SizingConfig.Percentage(0.036f), new SegmentedCircleConfig.SizingConfig.Percentage(0.015f), SegmentedCircle$ContentLayoutPolicy.INSIDE_EDGE);
    }

    public PaycheckDistributionWheel$PlacementConfig(SegmentedCircleConfig.SizingConfig.Percentage percentage, SegmentedCircleConfig.SizingConfig.Percentage percentage2, SegmentedCircle$ContentLayoutPolicy segmentedCircle$ContentLayoutPolicy) {
        this.strokeThickness = percentage;
        this.segmentGapWidth = percentage2;
        this.contentLayoutPolicy = segmentedCircle$ContentLayoutPolicy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaycheckDistributionWheel$PlacementConfig)) {
            return false;
        }
        PaycheckDistributionWheel$PlacementConfig paycheckDistributionWheel$PlacementConfig = (PaycheckDistributionWheel$PlacementConfig) obj;
        return this.strokeThickness.equals(paycheckDistributionWheel$PlacementConfig.strokeThickness) && this.segmentGapWidth.equals(paycheckDistributionWheel$PlacementConfig.segmentGapWidth) && this.contentLayoutPolicy == paycheckDistributionWheel$PlacementConfig.contentLayoutPolicy;
    }

    public final int hashCode() {
        return this.contentLayoutPolicy.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.segmentGapWidth.percentage, Float.hashCode(this.strokeThickness.percentage) * 31, 31);
    }

    public final String toString() {
        return "PlacementConfig(strokeThickness=" + this.strokeThickness + ", segmentGapWidth=" + this.segmentGapWidth + ", contentLayoutPolicy=" + this.contentLayoutPolicy + ")";
    }
}
