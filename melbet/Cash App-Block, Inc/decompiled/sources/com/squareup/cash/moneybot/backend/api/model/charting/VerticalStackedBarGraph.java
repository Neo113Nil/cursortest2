package com.squareup.cash.moneybot.backend.api.model.charting;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class VerticalStackedBarGraph implements Graph {
    public final ArrayList bars;
    public final ArrayList yAxisLabels;

    public final class Bar {
        public final String accessibilityText;
        public final String categoryText;
        public final String header;
        public final ArrayList items;
        public final String subtitle;

        public final class BarItem {
            public final Color color;
            public final long value;

            public BarItem(Color color, long j) {
                color.getClass();
                this.color = color;
                this.value = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BarItem)) {
                    return false;
                }
                BarItem barItem = (BarItem) obj;
                return Intrinsics.areEqual(this.color, barItem.color) && this.value == barItem.value;
            }

            public final int hashCode() {
                return Long.hashCode(this.value) + (this.color.hashCode() * 31);
            }

            public final String toString() {
                return "BarItem(color=" + this.color + ", value=" + this.value + ")";
            }
        }

        public Bar(ArrayList arrayList, String str, String str2, String str3, String str4) {
            this.categoryText = str;
            this.header = str2;
            this.subtitle = str3;
            this.accessibilityText = str4;
            this.items = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Bar)) {
                return false;
            }
            Bar bar = (Bar) obj;
            return this.categoryText.equals(bar.categoryText) && this.header.equals(bar.header) && this.subtitle.equals(bar.subtitle) && Intrinsics.areEqual(this.accessibilityText, bar.accessibilityText) && this.items.equals(bar.items);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.categoryText.hashCode() * 31, 31, this.header), 31, this.subtitle);
            String str = this.accessibilityText;
            return this.items.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Bar(categoryText=", this.categoryText, ", header=", this.header, ", subtitle=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.subtitle, ", accessibilityText=", this.accessibilityText, ", items=");
            return Recorder$$ExternalSyntheticOutline1.m(")", m, this.items);
        }
    }

    public VerticalStackedBarGraph(ArrayList arrayList, ArrayList arrayList2) {
        this.bars = arrayList;
        this.yAxisLabels = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalStackedBarGraph)) {
            return false;
        }
        VerticalStackedBarGraph verticalStackedBarGraph = (VerticalStackedBarGraph) obj;
        return this.bars.equals(verticalStackedBarGraph.bars) && this.yAxisLabels.equals(verticalStackedBarGraph.yAxisLabels);
    }

    public final int hashCode() {
        return this.yAxisLabels.hashCode() + (this.bars.hashCode() * 31);
    }

    public final String toString() {
        return "VerticalStackedBarGraph(bars=" + this.bars + ", yAxisLabels=" + this.yAxisLabels + ")";
    }
}
