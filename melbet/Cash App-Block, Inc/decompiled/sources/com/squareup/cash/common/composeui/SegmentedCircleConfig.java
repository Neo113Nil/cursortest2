package com.squareup.cash.common.composeui;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SegmentedCircleConfig {
    public final String accessibilityLabel;
    public final long backgroundColor;
    public final SizingConfig backgroundStrokeThickness;
    public final SegmentedCircle$ContentLayoutPolicy contentHorizontalLayoutPolicy;
    public final SegmentedCircle$ContentLayoutPolicy contentVerticalLayoutPolicy;
    public final DebugSettings debugSettings;
    public final Function3 innerContent;
    public final SizingConfig segmentGapWidth;
    public final long segmentsBackgroundColor;
    public final SizingConfig.Fixed strokeThickness;

    public final class DebugSettings {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DebugSettings);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "DebugSettings(drawVerticalAxis=null, drawHorizontalAxis=null, drawAngles=null)";
        }
    }

    public interface SizingConfig {

        public final class Fixed implements SizingConfig {
            public final float size;

            public Fixed(float f) {
                this.size = f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Fixed) && Float.compare(this.size, ((Fixed) obj).size) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.size);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.size, "Fixed(size=", ")");
            }
        }

        public final class Percentage implements SizingConfig {
            public final float percentage;

            public Percentage(float f) {
                this.percentage = f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Percentage) && Float.compare(this.percentage, ((Percentage) obj).percentage) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.percentage);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.percentage, "Percentage(percentage=", ")");
            }
        }
    }

    public SegmentedCircleConfig(SizingConfig.Fixed fixed, SizingConfig.Fixed fixed2, SizingConfig sizingConfig, String str, long j, long j2, SegmentedCircle$ContentLayoutPolicy segmentedCircle$ContentLayoutPolicy, SegmentedCircle$ContentLayoutPolicy segmentedCircle$ContentLayoutPolicy2, Function3 function3, int i) {
        fixed2 = (i & 2) != 0 ? fixed : fixed2;
        j = (i & 16) != 0 ? Color.Transparent : j;
        j2 = (i & 32) != 0 ? j : j2;
        segmentedCircle$ContentLayoutPolicy = (i & 64) != 0 ? SegmentedCircle$ContentLayoutPolicy.INSIDE_CORNER : segmentedCircle$ContentLayoutPolicy;
        segmentedCircle$ContentLayoutPolicy2 = (i & 128) != 0 ? SegmentedCircle$ContentLayoutPolicy.INSIDE_CORNER : segmentedCircle$ContentLayoutPolicy2;
        DebugSettings debugSettings = new DebugSettings();
        function3 = (i & 512) != 0 ? VisibleKt.lambda$2112913107 : function3;
        segmentedCircle$ContentLayoutPolicy.getClass();
        segmentedCircle$ContentLayoutPolicy2.getClass();
        function3.getClass();
        this.strokeThickness = fixed;
        this.backgroundStrokeThickness = fixed2;
        this.segmentGapWidth = sizingConfig;
        this.accessibilityLabel = str;
        this.backgroundColor = j;
        this.segmentsBackgroundColor = j2;
        this.contentHorizontalLayoutPolicy = segmentedCircle$ContentLayoutPolicy;
        this.contentVerticalLayoutPolicy = segmentedCircle$ContentLayoutPolicy2;
        this.debugSettings = debugSettings;
        this.innerContent = function3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SegmentedCircleConfig)) {
            return false;
        }
        SegmentedCircleConfig segmentedCircleConfig = (SegmentedCircleConfig) obj;
        return Intrinsics.areEqual(this.strokeThickness, segmentedCircleConfig.strokeThickness) && Intrinsics.areEqual(this.backgroundStrokeThickness, segmentedCircleConfig.backgroundStrokeThickness) && Intrinsics.areEqual(this.segmentGapWidth, segmentedCircleConfig.segmentGapWidth) && Intrinsics.areEqual(this.accessibilityLabel, segmentedCircleConfig.accessibilityLabel) && Color.m676equalsimpl0(this.backgroundColor, segmentedCircleConfig.backgroundColor) && Color.m676equalsimpl0(this.segmentsBackgroundColor, segmentedCircleConfig.segmentsBackgroundColor) && this.contentHorizontalLayoutPolicy == segmentedCircleConfig.contentHorizontalLayoutPolicy && this.contentVerticalLayoutPolicy == segmentedCircleConfig.contentVerticalLayoutPolicy && Intrinsics.areEqual(this.debugSettings, segmentedCircleConfig.debugSettings) && Intrinsics.areEqual(this.innerContent, segmentedCircleConfig.innerContent);
    }

    public final int hashCode() {
        int hashCode = (this.segmentGapWidth.hashCode() + ((this.backgroundStrokeThickness.hashCode() + (Float.hashCode(this.strokeThickness.size) * 31)) * 31)) * 31;
        String str = this.accessibilityLabel;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        int hashCode3 = this.contentVerticalLayoutPolicy.hashCode() + ((this.contentHorizontalLayoutPolicy.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(hashCode2, 31, this.backgroundColor), 31, this.segmentsBackgroundColor)) * 31);
        this.debugSettings.getClass();
        return this.innerContent.hashCode() + (hashCode3 * 961);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.backgroundColor);
        String m682toStringimpl2 = Color.m682toStringimpl(this.segmentsBackgroundColor);
        StringBuilder sb = new StringBuilder("SegmentedCircleConfig(strokeThickness=");
        sb.append(this.strokeThickness);
        sb.append(", backgroundStrokeThickness=");
        sb.append(this.backgroundStrokeThickness);
        sb.append(", segmentGapWidth=");
        sb.append(this.segmentGapWidth);
        sb.append(", accessibilityLabel=");
        sb.append(this.accessibilityLabel);
        sb.append(", backgroundColor=");
        Boxes$$ExternalSyntheticOutline1.m(sb, m682toStringimpl, ", segmentsBackgroundColor=", m682toStringimpl2, ", contentHorizontalLayoutPolicy=");
        sb.append(this.contentHorizontalLayoutPolicy);
        sb.append(", contentVerticalLayoutPolicy=");
        sb.append(this.contentVerticalLayoutPolicy);
        sb.append(", debugSettings=");
        sb.append(this.debugSettings);
        sb.append(", innerContent=");
        sb.append(this.innerContent);
        sb.append(")");
        return sb.toString();
    }
}
