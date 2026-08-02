package com.squareup.cash.moneybot.viewmodels.plugins;

import com.squareup.cash.charting.viewmodels.LineChartViewModel;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.SlotContent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface SlotContentViewModel {

    public final class CompositionChart implements SlotContentViewModel {
        public final SlotContent.CompositionChart model;

        public CompositionChart(SlotContent.CompositionChart compositionChart) {
            compositionChart.getClass();
            this.model = compositionChart;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CompositionChart) && Intrinsics.areEqual(this.model, ((CompositionChart) obj).model);
        }

        public final int hashCode() {
            return this.model.segments.hashCode();
        }

        public final String toString() {
            return "CompositionChart(model=" + this.model + ")";
        }
    }

    public final class LineGraph implements SlotContentViewModel {
        public final String accessibilityLabel;
        public final LineChartViewModel model;

        public LineGraph(LineChartViewModel lineChartViewModel, String str) {
            this.model = lineChartViewModel;
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
            return this.model.equals(lineGraph.model) && Intrinsics.areEqual(this.accessibilityLabel, lineGraph.accessibilityLabel);
        }

        public final int hashCode() {
            int hashCode = this.model.hashCode() * 31;
            String str = this.accessibilityLabel;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "LineGraph(model=" + this.model + ", accessibilityLabel=" + this.accessibilityLabel + ")";
        }
    }

    public final class Metric implements SlotContentViewModel {
        public final SlotContent.Metric model;

        public Metric(SlotContent.Metric metric) {
            metric.getClass();
            this.model = metric;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Metric) && Intrinsics.areEqual(this.model, ((Metric) obj).model);
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final String toString() {
            return "Metric(model=" + this.model + ")";
        }
    }

    public final class ProgressRing implements SlotContentViewModel {
        public final SlotContent.ProgressRing model;

        public ProgressRing(SlotContent.ProgressRing progressRing) {
            progressRing.getClass();
            this.model = progressRing;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProgressRing) && Intrinsics.areEqual(this.model, ((ProgressRing) obj).model);
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final String toString() {
            return "ProgressRing(model=" + this.model + ")";
        }
    }

    public final class StackedImage implements SlotContentViewModel {
        public final SlotContent.StackedImage model;

        public StackedImage(SlotContent.StackedImage stackedImage) {
            stackedImage.getClass();
            this.model = stackedImage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StackedImage) && Intrinsics.areEqual(this.model, ((StackedImage) obj).model);
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final String toString() {
            return "StackedImage(model=" + this.model + ")";
        }
    }

    public final class Table implements SlotContentViewModel {
        public final SlotContent.Table model;

        public Table(SlotContent.Table table) {
            table.getClass();
            this.model = table;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Table) && Intrinsics.areEqual(this.model, ((Table) obj).model);
        }

        public final int hashCode() {
            return this.model.rows.hashCode();
        }

        public final String toString() {
            return "Table(model=" + this.model + ")";
        }
    }
}
