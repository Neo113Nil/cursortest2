package com.squareup.cash.charting.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SegmentedBarChartViewModel {
    public final List categories;
    public final Legend legend;
    public final String subtitle;
    public final String title;
    public final List yAxisLabels;

    public final class Legend {
        public final ArrayList labels;

        public final class Label {
            public final Color color;
            public final String label;

            public Label(Color color, String str) {
                color.getClass();
                str.getClass();
                this.color = color;
                this.label = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Label)) {
                    return false;
                }
                Label label = (Label) obj;
                return Intrinsics.areEqual(this.color, label.color) && Intrinsics.areEqual(this.label, label.label);
            }

            public final int hashCode() {
                return this.label.hashCode() + (this.color.hashCode() * 31);
            }

            public final String toString() {
                return "Label(color=" + this.color + ", label=" + this.label + ")";
            }
        }

        public Legend(ArrayList arrayList) {
            this.labels = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Legend) && this.labels.equals(((Legend) obj).labels);
        }

        public final int hashCode() {
            return this.labels.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("Legend(labels=", ")", this.labels);
        }
    }

    public SegmentedBarChartViewModel(String str, String str2, List list, Legend legend, List list2) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, list);
        this.title = str;
        this.subtitle = str2;
        this.categories = list;
        this.legend = legend;
        this.yAxisLabels = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SegmentedBarChartViewModel)) {
            return false;
        }
        SegmentedBarChartViewModel segmentedBarChartViewModel = (SegmentedBarChartViewModel) obj;
        return Intrinsics.areEqual(this.title, segmentedBarChartViewModel.title) && Intrinsics.areEqual(this.subtitle, segmentedBarChartViewModel.subtitle) && Intrinsics.areEqual(this.categories, segmentedBarChartViewModel.categories) && Intrinsics.areEqual(this.legend, segmentedBarChartViewModel.legend) && Intrinsics.areEqual(this.yAxisLabels, segmentedBarChartViewModel.yAxisLabels);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle), 31, this.categories);
        Legend legend = this.legend;
        int hashCode = (m + (legend == null ? 0 : legend.labels.hashCode())) * 31;
        List list = this.yAxisLabels;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SegmentedBarChartViewModel(title=", this.title, ", subtitle=", this.subtitle, ", categories=");
        m.append(this.categories);
        m.append(", legend=");
        m.append(this.legend);
        m.append(", yAxisLabels=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(m, this.yAxisLabels, ")");
    }

    public /* synthetic */ SegmentedBarChartViewModel(String str, String str2, List list, Legend legend, List list2, int i) {
        this(str, str2, list, (i & 8) != 0 ? null : legend, (i & 16) != 0 ? null : list2);
    }

    public final class Category {
        public final String accessibilityLabel;
        public final String header;
        public final SegmentedBarChartViewModel$ChartLabel$DefaultLabel label;
        public final List segments;
        public final boolean selected;
        public final String subtitle;
        public final List yAxisLabels;

        public final class Segment {
            public final Color color;
            public final float value;

            public Segment(float f, Color color) {
                color.getClass();
                this.color = color;
                this.value = f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Segment)) {
                    return false;
                }
                Segment segment = (Segment) obj;
                return Intrinsics.areEqual(this.color, segment.color) && Float.compare(this.value, segment.value) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.value) + (this.color.hashCode() * 31);
            }

            public final String toString() {
                return "Segment(color=" + this.color + ", value=" + this.value + ")";
            }
        }

        public Category(List list, SegmentedBarChartViewModel$ChartLabel$DefaultLabel segmentedBarChartViewModel$ChartLabel$DefaultLabel, String str, String str2, boolean z, String str3, List list2) {
            list.getClass();
            segmentedBarChartViewModel$ChartLabel$DefaultLabel.getClass();
            this.segments = list;
            this.label = segmentedBarChartViewModel$ChartLabel$DefaultLabel;
            this.header = str;
            this.subtitle = str2;
            this.selected = z;
            this.accessibilityLabel = str3;
            this.yAxisLabels = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Category)) {
                return false;
            }
            Category category = (Category) obj;
            return Intrinsics.areEqual(this.segments, category.segments) && Intrinsics.areEqual(this.label, category.label) && Intrinsics.areEqual(this.header, category.header) && Intrinsics.areEqual(this.subtitle, category.subtitle) && this.selected == category.selected && Intrinsics.areEqual(this.accessibilityLabel, category.accessibilityLabel) && Intrinsics.areEqual(this.yAxisLabels, category.yAxisLabels);
        }

        public final int hashCode() {
            int hashCode = (this.label.hashCode() + (this.segments.hashCode() * 31)) * 31;
            String str = this.header;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.selected);
            String str3 = this.accessibilityLabel;
            int hashCode3 = (m + (str3 == null ? 0 : str3.hashCode())) * 31;
            List list = this.yAxisLabels;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Category(segments=");
            sb.append(this.segments);
            sb.append(", label=");
            sb.append(this.label);
            sb.append(", header=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.header, ", subtitle=", this.subtitle, ", selected=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.selected, ", accessibilityLabel=", this.accessibilityLabel, ", yAxisLabels=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.yAxisLabels, ")");
        }

        public /* synthetic */ Category(List list, SegmentedBarChartViewModel$ChartLabel$DefaultLabel segmentedBarChartViewModel$ChartLabel$DefaultLabel, String str, String str2, boolean z, String str3, int i) {
            this(list, segmentedBarChartViewModel$ChartLabel$DefaultLabel, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, z, str3, (List) null);
        }
    }
}
