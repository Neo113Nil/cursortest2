package com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.kgoose.api.v3.Metric;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface SlotContent {

    public final class CompositionChart implements SlotContent {
        public final List segments;

        public final class Segment {
            public final Color color;
            public final float fraction;

            public Segment(float f, Color color) {
                this.fraction = f;
                this.color = color;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Segment)) {
                    return false;
                }
                Segment segment = (Segment) obj;
                return Float.compare(this.fraction, segment.fraction) == 0 && Intrinsics.areEqual(this.color, segment.color);
            }

            public final int hashCode() {
                int hashCode = Float.hashCode(this.fraction) * 31;
                Color color = this.color;
                return hashCode + (color == null ? 0 : color.hashCode());
            }

            public final String toString() {
                return "Segment(fraction=" + this.fraction + ", color=" + this.color + ")";
            }
        }

        public CompositionChart(List list) {
            list.getClass();
            this.segments = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CompositionChart) && Intrinsics.areEqual(this.segments, ((CompositionChart) obj).segments);
        }

        public final int hashCode() {
            return this.segments.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("CompositionChart(segments=", ")", this.segments);
        }
    }

    public final class LineGraph implements SlotContent {
        public final String accessibilityLabel;
        public final List lines;

        public final class Line {
            public final Color color;
            public final ArrayList points;

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

        public final class Point {
            public final long xValue;
            public final long yValue;

            public Point(long j, long j2) {
                this.xValue = j;
                this.yValue = j2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Point)) {
                    return false;
                }
                Point point = (Point) obj;
                return this.xValue == point.xValue && this.yValue == point.yValue;
            }

            public final int hashCode() {
                return Long.hashCode(this.yValue) + (Long.hashCode(this.xValue) * 31);
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m(this.yValue, ")", Boxes$$ExternalSyntheticOutline1.m1149m(this.xValue, "Point(xValue=", ", yValue="));
            }
        }

        public LineGraph(List list, String str) {
            list.getClass();
            this.lines = list;
            this.accessibilityLabel = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LineGraph)) {
                return false;
            }
            LineGraph lineGraph = (LineGraph) obj;
            return Intrinsics.areEqual(this.lines, lineGraph.lines) && Intrinsics.areEqual(this.accessibilityLabel, lineGraph.accessibilityLabel);
        }

        public final int hashCode() {
            int hashCode = this.lines.hashCode() * 31;
            String str = this.accessibilityLabel;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "LineGraph(lines=" + this.lines + ", accessibilityLabel=" + this.accessibilityLabel + ")";
        }
    }

    public final class Metric implements SlotContent {
        public final String amountPrefix;
        public final String amountSuffix;
        public final double animationStartAmount;
        public final String animationStartAmountText;
        public final double displayAmount;
        public final String displayAmountText;
        public final Metric.TrendDirection trendDirection;

        public Metric(String str, String str2, String str3, double d, Metric.TrendDirection trendDirection, String str4, double d2) {
            str2.getClass();
            str4.getClass();
            this.amountPrefix = str;
            this.displayAmountText = str2;
            this.amountSuffix = str3;
            this.displayAmount = d;
            this.trendDirection = trendDirection;
            this.animationStartAmountText = str4;
            this.animationStartAmount = d2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metric)) {
                return false;
            }
            Metric metric = (Metric) obj;
            return Intrinsics.areEqual(this.amountPrefix, metric.amountPrefix) && Intrinsics.areEqual(this.displayAmountText, metric.displayAmountText) && Intrinsics.areEqual(this.amountSuffix, metric.amountSuffix) && Double.compare(this.displayAmount, metric.displayAmount) == 0 && this.trendDirection == metric.trendDirection && Intrinsics.areEqual(this.animationStartAmountText, metric.animationStartAmountText) && Double.compare(this.animationStartAmount, metric.animationStartAmount) == 0;
        }

        public final int hashCode() {
            String str = this.amountPrefix;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.displayAmountText);
            String str2 = this.amountSuffix;
            int m2 = Fragment$5$$ExternalSyntheticOutline0.m(this.displayAmount, (m + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
            Metric.TrendDirection trendDirection = this.trendDirection;
            return Double.hashCode(this.animationStartAmount) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (trendDirection != null ? trendDirection.hashCode() : 0)) * 31, 31, this.animationStartAmountText);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Metric(amountPrefix=", this.amountPrefix, ", displayAmountText=", this.displayAmountText, ", amountSuffix=");
            m.append(this.amountSuffix);
            m.append(", displayAmount=");
            m.append(this.displayAmount);
            m.append(", trendDirection=");
            m.append(this.trendDirection);
            m.append(", animationStartAmountText=");
            m.append(this.animationStartAmountText);
            m.append(", animationStartAmount=");
            m.append(this.animationStartAmount);
            m.append(")");
            return m.toString();
        }
    }

    public final class ProgressRing implements SlotContent {
        public final List contents;
        public final float fraction;
        public final Color ringColor;

        public interface Content {

            public final class Avatar implements Content {
                public final UiAvatar avatar;

                public Avatar(UiAvatar uiAvatar) {
                    uiAvatar.getClass();
                    this.avatar = uiAvatar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Avatar) && Intrinsics.areEqual(this.avatar, ((Avatar) obj).avatar);
                }

                public final int hashCode() {
                    return this.avatar.hashCode();
                }

                public final String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(this.avatar, "Avatar(avatar=", ")");
                }
            }

            public final class Image implements Content {
                public final com.squareup.protos.cash.ui.Image image;

                public Image(com.squareup.protos.cash.ui.Image image) {
                    image.getClass();
                    this.image = image;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Image) && Intrinsics.areEqual(this.image, ((Image) obj).image);
                }

                public final int hashCode() {
                    return this.image.hashCode();
                }

                public final String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(this.image, "Image(image=", ")");
                }
            }

            public final class Text implements Content {
                public final Color backgroundColor;
                public final String text;

                public Text(Color color, String str) {
                    this.text = str;
                    this.backgroundColor = color;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Text)) {
                        return false;
                    }
                    Text text = (Text) obj;
                    return this.text.equals(text.text) && Intrinsics.areEqual(this.backgroundColor, text.backgroundColor);
                }

                public final int hashCode() {
                    int hashCode = this.text.hashCode() * 31;
                    Color color = this.backgroundColor;
                    return hashCode + (color == null ? 0 : color.hashCode());
                }

                public final String toString() {
                    return "Text(text=" + this.text + ", backgroundColor=" + this.backgroundColor + ")";
                }
            }
        }

        public ProgressRing(float f, Color color, List list) {
            this.fraction = f;
            this.ringColor = color;
            this.contents = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgressRing)) {
                return false;
            }
            ProgressRing progressRing = (ProgressRing) obj;
            return Float.compare(this.fraction, progressRing.fraction) == 0 && Intrinsics.areEqual(this.ringColor, progressRing.ringColor) && this.contents.equals(progressRing.contents);
        }

        public final int hashCode() {
            int hashCode = Float.hashCode(this.fraction) * 31;
            Color color = this.ringColor;
            return this.contents.hashCode() + ((hashCode + (color == null ? 0 : color.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProgressRing(fraction=");
            sb.append(this.fraction);
            sb.append(", ringColor=");
            sb.append(this.ringColor);
            sb.append(", contents=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.contents, ")");
        }
    }

    public final class StackedImage implements SlotContent {
        public final String accessibilityLabel;
        public final ArrayList contents;

        public interface Content {

            public final class Avatar implements Content {
                public final UiAvatar avatar;

                public Avatar(UiAvatar uiAvatar) {
                    this.avatar = uiAvatar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Avatar) && this.avatar.equals(((Avatar) obj).avatar);
                }

                public final int hashCode() {
                    return this.avatar.hashCode();
                }

                public final String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(this.avatar, "Avatar(avatar=", ")");
                }
            }

            public final class Image implements Content {
                public final com.squareup.protos.cash.ui.Image image;

                public Image(com.squareup.protos.cash.ui.Image image) {
                    this.image = image;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Image) && this.image.equals(((Image) obj).image);
                }

                public final int hashCode() {
                    return this.image.hashCode();
                }

                public final String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(this.image, "Image(image=", ")");
                }
            }

            public final class Text implements Content {
                public final Color backgroundColor;
                public final String text;

                public Text(Color color, String str) {
                    this.text = str;
                    this.backgroundColor = color;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Text)) {
                        return false;
                    }
                    Text text = (Text) obj;
                    return this.text.equals(text.text) && Intrinsics.areEqual(this.backgroundColor, text.backgroundColor);
                }

                public final int hashCode() {
                    int hashCode = this.text.hashCode() * 31;
                    Color color = this.backgroundColor;
                    return hashCode + (color == null ? 0 : color.hashCode());
                }

                public final String toString() {
                    return "Text(text=" + this.text + ", backgroundColor=" + this.backgroundColor + ")";
                }
            }
        }

        public StackedImage(String str, ArrayList arrayList) {
            this.contents = arrayList;
            this.accessibilityLabel = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StackedImage)) {
                return false;
            }
            StackedImage stackedImage = (StackedImage) obj;
            return this.contents.equals(stackedImage.contents) && Intrinsics.areEqual(this.accessibilityLabel, stackedImage.accessibilityLabel);
        }

        public final int hashCode() {
            int hashCode = this.contents.hashCode() * 31;
            String str = this.accessibilityLabel;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "StackedImage(contents=" + this.contents + ", accessibilityLabel=" + this.accessibilityLabel + ")";
        }
    }

    public final class Table implements SlotContent {
        public final List rows;

        public final class Row {
            public final String amount;
            public final UiAvatar icon;
            public final String name;

            public Row(UiAvatar uiAvatar, String str, String str2) {
                this.icon = uiAvatar;
                this.name = str;
                this.amount = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Row)) {
                    return false;
                }
                Row row = (Row) obj;
                return this.icon.equals(row.icon) && this.name.equals(row.name) && this.amount.equals(row.amount);
            }

            public final int hashCode() {
                return this.amount.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.name);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Row(icon=");
                sb.append(this.icon);
                sb.append(", name=");
                sb.append(this.name);
                sb.append(", amount=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.amount, ")");
            }
        }

        public Table(List list) {
            list.getClass();
            this.rows = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Table) && Intrinsics.areEqual(this.rows, ((Table) obj).rows);
        }

        public final int hashCode() {
            return this.rows.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Table(rows=", ")", this.rows);
        }
    }
}
