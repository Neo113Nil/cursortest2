package com.squareup.cash.charting.components;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface ChartConfig {

    public interface CapConfig {

        public final class RoundedCapConfig implements CapConfig {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RoundedCapConfig) && Dp.m1037equalsimpl0(6.0f, 6.0f);
            }

            public final int hashCode() {
                return Float.hashCode(6.0f);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RoundedCapConfig(capHeight=", Dp.m1038toStringimpl(6.0f), ")");
            }
        }

        public final class SquareCapConfig implements CapConfig {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SquareCapConfig) && Dp.m1037equalsimpl0(4.0f, 4.0f) && Dp.m1037equalsimpl0(8.0f, 8.0f);
            }

            public final int hashCode() {
                return Float.hashCode(8.0f) + (Float.hashCode(4.0f) * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("SquareCapConfig(smallCornerRadius=", Dp.m1038toStringimpl(4.0f), ", largeCornerRadius=", Dp.m1038toStringimpl(8.0f), ")");
            }
        }
    }

    public final class FlexChartConfig implements ChartConfig {
        public final long axisLineColor;
        public final CapConfig.SquareCapConfig capConfig;
        public final SelectionBehavior selectionBehavior;
        public final Color zeroBarColor;

        public FlexChartConfig(CapConfig.SquareCapConfig squareCapConfig, Color color, long j, SelectionBehavior selectionBehavior) {
            this.capConfig = squareCapConfig;
            this.zeroBarColor = color;
            this.axisLineColor = j;
            this.selectionBehavior = selectionBehavior;
        }

        public final boolean equals(Object obj) {
            Object obj2 = 8;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlexChartConfig)) {
                return false;
            }
            FlexChartConfig flexChartConfig = (FlexChartConfig) obj;
            return Dp.m1037equalsimpl0(206.0f, 206.0f) && this.capConfig.equals(flexChartConfig.capConfig) && Dp.m1037equalsimpl0(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) && this.zeroBarColor.equals(flexChartConfig.zeroBarColor) && obj2.equals(obj2) && Color.m676equalsimpl0(this.axisLineColor, flexChartConfig.axisLineColor) && this.selectionBehavior == flexChartConfig.selectionBehavior;
        }

        @Override // com.squareup.cash.charting.components.ChartConfig
        /* renamed from: getAxisLineColor-0d7_KjU */
        public final long mo3453getAxisLineColor0d7_KjU() {
            return this.axisLineColor;
        }

        @Override // com.squareup.cash.charting.components.ChartConfig
        public final CapConfig getCapConfig() {
            return this.capConfig;
        }

        @Override // com.squareup.cash.charting.components.ChartConfig
        /* renamed from: getChartHeight-D9Ej5fM */
        public final float mo3454getChartHeightD9Ej5fM() {
            return 206.0f;
        }

        @Override // com.squareup.cash.charting.components.ChartConfig
        public final Integer getCrowdedLabelThreshold() {
            return 8;
        }

        @Override // com.squareup.cash.charting.components.ChartConfig
        /* renamed from: getSegmentSpacing-D9Ej5fM */
        public final float mo3455getSegmentSpacingD9Ej5fM() {
            return RecyclerView.DECELERATION_RATE;
        }

        @Override // com.squareup.cash.charting.components.ChartConfig
        public final SelectionBehavior getSelectionBehavior() {
            return this.selectionBehavior;
        }

        @Override // com.squareup.cash.charting.components.ChartConfig
        /* renamed from: getZeroBarColor-QN2ZGVo */
        public final Color mo3456getZeroBarColorQN2ZGVo() {
            return this.zeroBarColor;
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(RecyclerView.DECELERATION_RATE, (this.capConfig.hashCode() + (Float.hashCode(206.0f) * 31)) * 31, 31);
            long j = this.zeroBarColor.value;
            ULong.Companion companion = ULong.Companion;
            int m2 = Recorder$$ExternalSyntheticOutline2.m(m, 31, j);
            Integer num = 8;
            int hashCode = (num.hashCode() + m2) * 31;
            int i = Color.$r8$clinit;
            return this.selectionBehavior.hashCode() + Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.axisLineColor);
        }

        public final String toString() {
            String m1038toStringimpl = Dp.m1038toStringimpl(206.0f);
            String m1038toStringimpl2 = Dp.m1038toStringimpl(RecyclerView.DECELERATION_RATE);
            String m682toStringimpl = Color.m682toStringimpl(this.axisLineColor);
            StringBuilder sb = new StringBuilder("FlexChartConfig(chartHeight=");
            sb.append(m1038toStringimpl);
            sb.append(", capConfig=");
            sb.append(this.capConfig);
            sb.append(", segmentSpacing=");
            sb.append(m1038toStringimpl2);
            sb.append(", zeroBarColor=");
            sb.append(this.zeroBarColor);
            sb.append(", crowdedLabelThreshold=");
            NavAction$$ExternalSyntheticOutline0.m(sb, (Integer) 8, ", axisLineColor=", m682toStringimpl, ", selectionBehavior=");
            sb.append(this.selectionBehavior);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class StaticChartConfig implements ChartConfig {
        public final long axisLineColor;
        public final float barWidth;
        public final CapConfig capConfig;
        public final float chartHeight;
        public final Integer crowdedLabelThreshold;
        public final float segmentSpacing;
        public final SelectionBehavior selectionBehavior;
        public final Color zeroBarColor;

        public StaticChartConfig(float f, float f2, CapConfig capConfig, float f3, Color color, Integer num, long j, SelectionBehavior selectionBehavior) {
            this.chartHeight = f;
            this.barWidth = f2;
            this.capConfig = capConfig;
            this.segmentSpacing = f3;
            this.zeroBarColor = color;
            this.crowdedLabelThreshold = num;
            this.axisLineColor = j;
            this.selectionBehavior = selectionBehavior;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StaticChartConfig)) {
                return false;
            }
            StaticChartConfig staticChartConfig = (StaticChartConfig) obj;
            return Dp.m1037equalsimpl0(this.chartHeight, staticChartConfig.chartHeight) && Dp.m1037equalsimpl0(this.barWidth, staticChartConfig.barWidth) && this.capConfig.equals(staticChartConfig.capConfig) && Dp.m1037equalsimpl0(this.segmentSpacing, staticChartConfig.segmentSpacing) && Intrinsics.areEqual(this.zeroBarColor, staticChartConfig.zeroBarColor) && Intrinsics.areEqual(this.crowdedLabelThreshold, staticChartConfig.crowdedLabelThreshold) && Color.m676equalsimpl0(this.axisLineColor, staticChartConfig.axisLineColor) && this.selectionBehavior == staticChartConfig.selectionBehavior;
        }

        @Override // com.squareup.cash.charting.components.ChartConfig
        /* renamed from: getAxisLineColor-0d7_KjU */
        public final long mo3453getAxisLineColor0d7_KjU() {
            return this.axisLineColor;
        }

        @Override // com.squareup.cash.charting.components.ChartConfig
        public final CapConfig getCapConfig() {
            return this.capConfig;
        }

        @Override // com.squareup.cash.charting.components.ChartConfig
        /* renamed from: getChartHeight-D9Ej5fM */
        public final float mo3454getChartHeightD9Ej5fM() {
            return this.chartHeight;
        }

        @Override // com.squareup.cash.charting.components.ChartConfig
        public final Integer getCrowdedLabelThreshold() {
            return this.crowdedLabelThreshold;
        }

        @Override // com.squareup.cash.charting.components.ChartConfig
        /* renamed from: getSegmentSpacing-D9Ej5fM */
        public final float mo3455getSegmentSpacingD9Ej5fM() {
            return this.segmentSpacing;
        }

        @Override // com.squareup.cash.charting.components.ChartConfig
        public final SelectionBehavior getSelectionBehavior() {
            return this.selectionBehavior;
        }

        @Override // com.squareup.cash.charting.components.ChartConfig
        /* renamed from: getZeroBarColor-QN2ZGVo */
        public final Color mo3456getZeroBarColorQN2ZGVo() {
            return this.zeroBarColor;
        }

        public final int hashCode() {
            int hashCode;
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.segmentSpacing, (this.capConfig.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.barWidth, Float.hashCode(this.chartHeight) * 31, 31)) * 31, 31);
            Color color = this.zeroBarColor;
            if (color == null) {
                hashCode = 0;
            } else {
                long j = color.value;
                ULong.Companion companion = ULong.Companion;
                hashCode = Long.hashCode(j);
            }
            int i = (m + hashCode) * 31;
            Integer num = this.crowdedLabelThreshold;
            int hashCode2 = (i + (num != null ? num.hashCode() : 0)) * 31;
            int i2 = Color.$r8$clinit;
            ULong.Companion companion2 = ULong.Companion;
            return this.selectionBehavior.hashCode() + Recorder$$ExternalSyntheticOutline2.m(hashCode2, 31, this.axisLineColor);
        }

        public final String toString() {
            String m1038toStringimpl = Dp.m1038toStringimpl(this.chartHeight);
            String m1038toStringimpl2 = Dp.m1038toStringimpl(this.barWidth);
            String m1038toStringimpl3 = Dp.m1038toStringimpl(this.segmentSpacing);
            String m682toStringimpl = Color.m682toStringimpl(this.axisLineColor);
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StaticChartConfig(chartHeight=", m1038toStringimpl, ", barWidth=", m1038toStringimpl2, ", capConfig=");
            m.append(this.capConfig);
            m.append(", segmentSpacing=");
            m.append(m1038toStringimpl3);
            m.append(", zeroBarColor=");
            m.append(this.zeroBarColor);
            m.append(", crowdedLabelThreshold=");
            m.append(this.crowdedLabelThreshold);
            m.append(", axisLineColor=");
            m.append(m682toStringimpl);
            m.append(", selectionBehavior=");
            m.append(this.selectionBehavior);
            m.append(")");
            return m.toString();
        }
    }

    /* renamed from: getAxisLineColor-0d7_KjU, reason: not valid java name */
    long mo3453getAxisLineColor0d7_KjU();

    CapConfig getCapConfig();

    /* renamed from: getChartHeight-D9Ej5fM, reason: not valid java name */
    float mo3454getChartHeightD9Ej5fM();

    Integer getCrowdedLabelThreshold();

    /* renamed from: getSegmentSpacing-D9Ej5fM, reason: not valid java name */
    float mo3455getSegmentSpacingD9Ej5fM();

    SelectionBehavior getSelectionBehavior();

    /* renamed from: getZeroBarColor-QN2ZGVo, reason: not valid java name */
    Color mo3456getZeroBarColorQN2ZGVo();
}
