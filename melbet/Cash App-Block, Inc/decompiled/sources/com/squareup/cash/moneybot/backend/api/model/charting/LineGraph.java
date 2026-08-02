package com.squareup.cash.moneybot.backend.api.model.charting;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LineGraph implements Graph {
    public final Legend legend;
    public final ArrayList lines;
    public final ArrayList xAxisLabels;
    public final ArrayList yAxisLabels;

    public final class Legend {
        public final ArrayList items;

        public final class LegendItem {
            public final Color color;
            public final String label;
            public final Integer lineIndex;
            public final String summary;

            public LegendItem(String str, String str2, Color color, Integer num) {
                this.label = str;
                this.summary = str2;
                this.color = color;
                this.lineIndex = num;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LegendItem)) {
                    return false;
                }
                LegendItem legendItem = (LegendItem) obj;
                return this.label.equals(legendItem.label) && Intrinsics.areEqual(this.summary, legendItem.summary) && this.color.equals(legendItem.color) && Intrinsics.areEqual(this.lineIndex, legendItem.lineIndex);
            }

            public final int hashCode() {
                int hashCode = this.label.hashCode() * 31;
                String str = this.summary;
                int m = SVG$Unit$EnumUnboxingLocalUtility.m(this.color, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
                Integer num = this.lineIndex;
                return m + (num != null ? num.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LegendItem(label=", this.label, ", summary=", this.summary, ", color=");
                m.append(this.color);
                m.append(", lineIndex=");
                m.append(this.lineIndex);
                m.append(")");
                return m.toString();
            }
        }

        public Legend(ArrayList arrayList) {
            this.items = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Legend) && this.items.equals(((Legend) obj).items);
        }

        public final int hashCode() {
            return this.items.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("Legend(items=", ")", this.items);
        }
    }

    public final class Line {
        public final Color color;
        public final ArrayList points;

        public final class Point {
            public final String description;
            public final Icon icon;
            public final Color iconTintColor;
            public final String label;
            public final long xValue;
            public final long yValue;

            public Point(long j, long j2, String str, String str2, Icon icon, Color color) {
                this.xValue = j;
                this.yValue = j2;
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
                return this.xValue == point.xValue && this.yValue == point.yValue && this.label.equals(point.label) && Intrinsics.areEqual(this.description, point.description) && Intrinsics.areEqual(this.icon, point.icon) && Intrinsics.areEqual(this.iconTintColor, point.iconTintColor);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.xValue) * 31, 31, this.yValue), 31, this.label);
                String str = this.description;
                int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                Icon icon = this.icon;
                int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
                Color color = this.iconTintColor;
                return hashCode2 + (color != null ? color.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(this.xValue, "Point(xValue=", ", yValue=");
                Fragment$5$$ExternalSyntheticOutline0.m(this.yValue, ", label=", this.label, m1149m);
                m1149m.append(", description=");
                m1149m.append(this.description);
                m1149m.append(", icon=");
                m1149m.append(this.icon);
                m1149m.append(", iconTintColor=");
                m1149m.append(this.iconTintColor);
                m1149m.append(")");
                return m1149m.toString();
            }
        }

        public Line(Color color, ArrayList arrayList) {
            color.getClass();
            this.color = color;
            this.points = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Line)) {
                return false;
            }
            Line line = (Line) obj;
            return Intrinsics.areEqual(this.color, line.color) && this.points.equals(line.points);
        }

        public final int hashCode() {
            return this.points.hashCode() + (this.color.hashCode() * 31);
        }

        public final String toString() {
            return "Line(color=" + this.color + ", points=" + this.points + ")";
        }
    }

    public LineGraph(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Legend legend) {
        this.lines = arrayList;
        this.yAxisLabels = arrayList2;
        this.xAxisLabels = arrayList3;
        this.legend = legend;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineGraph)) {
            return false;
        }
        LineGraph lineGraph = (LineGraph) obj;
        return this.lines.equals(lineGraph.lines) && this.yAxisLabels.equals(lineGraph.yAxisLabels) && this.xAxisLabels.equals(lineGraph.xAxisLabels) && Intrinsics.areEqual(this.legend, lineGraph.legend);
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.xAxisLabels, CameraState$Type$EnumUnboxingLocalUtility.m(this.yAxisLabels, this.lines.hashCode() * 31, 31), 31);
        Legend legend = this.legend;
        return m + (legend == null ? 0 : legend.items.hashCode());
    }

    public final String toString() {
        return "LineGraph(lines=" + this.lines + ", yAxisLabels=" + this.yAxisLabels + ", xAxisLabels=" + this.xAxisLabels + ", legend=" + this.legend + ")";
    }
}
