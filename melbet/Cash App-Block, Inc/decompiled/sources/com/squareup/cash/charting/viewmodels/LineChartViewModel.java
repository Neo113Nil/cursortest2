package com.squareup.cash.charting.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LineChartViewModel {
    public final List lines;
    public final AxisConfig xAxisConfig;
    public final AxisConfig yAxisConfig;

    public final class AxisConfig {
        public final List labels;

        public AxisConfig(List list) {
            list.getClass();
            this.labels = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AxisConfig) && Intrinsics.areEqual(this.labels, ((AxisConfig) obj).labels);
        }

        public final int hashCode() {
            return this.labels.hashCode() * 961;
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("AxisConfig(labels=", ", axisMin=null, axisMax=null)", this.labels);
        }
    }

    public final class AxisLabel {
        public final String label;
        public final float value;

        public AxisLabel(String str, float f) {
            this.label = str;
            this.value = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AxisLabel)) {
                return false;
            }
            AxisLabel axisLabel = (AxisLabel) obj;
            return this.label.equals(axisLabel.label) && Float.compare(this.value, axisLabel.value) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.value) + (this.label.hashCode() * 31);
        }

        public final String toString() {
            return "AxisLabel(label=" + this.label + ", value=" + this.value + ")";
        }
    }

    public final class SelectionConfig {
        public final Color inSelectionColor;
        public final boolean showHandle;

        public SelectionConfig(Color color, int i) {
            boolean z = (i & 4) == 0;
            color.getClass();
            this.inSelectionColor = color;
            this.showHandle = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectionConfig)) {
                return false;
            }
            SelectionConfig selectionConfig = (SelectionConfig) obj;
            return Intrinsics.areEqual(this.inSelectionColor, selectionConfig.inSelectionColor) && this.showHandle == selectionConfig.showHandle;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showHandle) + (this.inSelectionColor.hashCode() * 961);
        }

        public final String toString() {
            return "SelectionConfig(inSelectionColor=" + this.inSelectionColor + ", outOfSelectionColor=null, showHandle=" + this.showHandle + ")";
        }
    }

    public LineChartViewModel(List list, AxisConfig axisConfig, AxisConfig axisConfig2) {
        this.lines = list;
        this.xAxisConfig = axisConfig;
        this.yAxisConfig = axisConfig2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineChartViewModel)) {
            return false;
        }
        LineChartViewModel lineChartViewModel = (LineChartViewModel) obj;
        return this.lines.equals(lineChartViewModel.lines) && this.xAxisConfig.equals(lineChartViewModel.xAxisConfig) && this.yAxisConfig.equals(lineChartViewModel.yAxisConfig);
    }

    public final int hashCode() {
        return this.yAxisConfig.hashCode() + ((this.xAxisConfig.hashCode() + (this.lines.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LineChartViewModel(lines=" + this.lines + ", xAxisConfig=" + this.xAxisConfig + ", yAxisConfig=" + this.yAxisConfig + ")";
    }

    public final class Line {
        public final Color color;
        public final InterpolationMethod interpolationMethod;
        public final List points;
        public final SelectionConfig selectionConfig;
        public final float strokeCornerRadius;
        public final LineChartViewModel$Line$StrokeEffect$Solid strokeEffect;
        public final float strokeWidth;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class InterpolationMethod {
            public static final /* synthetic */ InterpolationMethod[] $VALUES;
            public static final InterpolationMethod LINEAR;

            static {
                InterpolationMethod interpolationMethod = new InterpolationMethod("LINEAR", 0);
                LINEAR = interpolationMethod;
                $VALUES = new InterpolationMethod[]{interpolationMethod, new InterpolationMethod("STEP", 1)};
            }

            public static InterpolationMethod valueOf(String str) {
                return (InterpolationMethod) Enum.valueOf(InterpolationMethod.class, str);
            }

            public static InterpolationMethod[] values() {
                return (InterpolationMethod[]) $VALUES.clone();
            }
        }

        public final class Point {
            public final String description;
            public final Icon icon;
            public final Color iconTintColor;
            public final String label;
            public final float x;
            public final float y;

            public Point(float f, float f2, String str, String str2, Icon icon, Color color, int i) {
                str = (i & 8) != 0 ? null : str;
                str2 = (i & 16) != 0 ? null : str2;
                icon = (i & 32) != 0 ? null : icon;
                color = (i & 64) != 0 ? null : color;
                this.x = f;
                this.y = f2;
                this.label = str;
                this.description = str2;
                this.icon = icon;
                this.iconTintColor = color;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Point)) {
                    return false;
                }
                Point point = (Point) obj;
                return Float.compare(this.x, point.x) == 0 && Float.compare(this.y, point.y) == 0 && Intrinsics.areEqual(this.label, point.label) && Intrinsics.areEqual(this.description, point.description) && Intrinsics.areEqual(this.icon, point.icon) && Intrinsics.areEqual(this.iconTintColor, point.iconTintColor);
            }

            public final int hashCode() {
                int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.y, Float.hashCode(this.x) * 31, 961);
                String str = this.label;
                int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.description;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Icon icon = this.icon;
                int hashCode3 = (hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
                Color color = this.iconTintColor;
                return hashCode3 + (color != null ? color.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Point(x=", this.x, ", y=", this.y, ", id=null, label=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.label, ", description=", this.description, ", icon=");
                m.append(this.icon);
                m.append(", iconTintColor=");
                m.append(this.iconTintColor);
                m.append(")");
                return m.toString();
            }
        }

        public Line(List list, Color color, SelectionConfig selectionConfig, float f, LineChartViewModel$Line$StrokeEffect$Solid lineChartViewModel$Line$StrokeEffect$Solid, float f2, InterpolationMethod interpolationMethod) {
            list.getClass();
            color.getClass();
            selectionConfig.getClass();
            lineChartViewModel$Line$StrokeEffect$Solid.getClass();
            interpolationMethod.getClass();
            this.points = list;
            this.color = color;
            this.selectionConfig = selectionConfig;
            this.strokeWidth = f;
            this.strokeEffect = lineChartViewModel$Line$StrokeEffect$Solid;
            this.strokeCornerRadius = f2;
            this.interpolationMethod = interpolationMethod;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Line)) {
                return false;
            }
            Line line = (Line) obj;
            return Intrinsics.areEqual(this.points, line.points) && Intrinsics.areEqual(this.color, line.color) && Intrinsics.areEqual(this.selectionConfig, line.selectionConfig) && Dp.m1037equalsimpl0(this.strokeWidth, line.strokeWidth) && Intrinsics.areEqual(this.strokeEffect, line.strokeEffect) && Dp.m1037equalsimpl0(this.strokeCornerRadius, line.strokeCornerRadius) && this.interpolationMethod == line.interpolationMethod;
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.strokeWidth, (this.selectionConfig.hashCode() + SVG$Unit$EnumUnboxingLocalUtility.m(this.color, this.points.hashCode() * 31, 31)) * 31, 31);
            this.strokeEffect.getClass();
            return this.interpolationMethod.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.strokeCornerRadius, (790993107 + m) * 31, 31);
        }

        public final String toString() {
            return "Line(points=" + this.points + ", color=" + this.color + ", selectionConfig=" + this.selectionConfig + ", strokeWidth=" + Dp.m1038toStringimpl(this.strokeWidth) + ", strokeEffect=" + this.strokeEffect + ", strokeCornerRadius=" + Dp.m1038toStringimpl(this.strokeCornerRadius) + ", interpolationMethod=" + this.interpolationMethod + ")";
        }

        public Line(List list, Color color) {
            this(list, color, new SelectionConfig(color, 6), 4.0f, LineChartViewModel$Line$StrokeEffect$Solid.INSTANCE, RecyclerView.DECELERATION_RATE, InterpolationMethod.LINEAR);
        }
    }
}
