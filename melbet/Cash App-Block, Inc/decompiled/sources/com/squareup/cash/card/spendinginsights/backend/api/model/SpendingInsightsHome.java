package com.squareup.cash.card.spendinginsights.backend.api.model;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightRow;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes6.dex */
public final class SpendingInsightsHome {
    public final EntryPoint entryPoint;
    public final InsightsSection insightsSection;
    public final OverviewSection overviewSection;

    /* loaded from: classes7.dex */
    public final class EntryPoint {
        public final String clientRoute;
        public final String previewText;
        public final boolean visible;

        public EntryPoint(String str, String str2, boolean z) {
            this.previewText = str;
            this.clientRoute = str2;
            this.visible = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EntryPoint)) {
                return false;
            }
            EntryPoint entryPoint = (EntryPoint) obj;
            return Intrinsics.areEqual(this.previewText, entryPoint.previewText) && Intrinsics.areEqual(this.clientRoute, entryPoint.clientRoute) && this.visible == entryPoint.visible;
        }

        public final int hashCode() {
            String str = this.previewText;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.clientRoute;
            return Boolean.hashCode(this.visible) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EntryPoint(previewText=", this.previewText, ", clientRoute=", this.clientRoute, ", visible="), this.visible, ")");
        }
    }

    public final class InsightsSection {
        public final ArrayList insights;

        /* loaded from: classes7.dex */
        public final class InsightsRow {
            public final CdfEvent cdfEvent;
            public final String clientRoute;
            public final CardSpendingInsightRow.RowImage image;
            public final String subtitle;
            public final String title;

            public InsightsRow(CardSpendingInsightRow.RowImage rowImage, String str, String str2, String str3, CdfEvent cdfEvent) {
                this.image = rowImage;
                this.title = str;
                this.subtitle = str2;
                this.clientRoute = str3;
                this.cdfEvent = cdfEvent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InsightsRow)) {
                    return false;
                }
                InsightsRow insightsRow = (InsightsRow) obj;
                return this.image == insightsRow.image && this.title.equals(insightsRow.title) && Intrinsics.areEqual(this.subtitle, insightsRow.subtitle) && this.clientRoute.equals(insightsRow.clientRoute) && Intrinsics.areEqual(this.cdfEvent, insightsRow.cdfEvent);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.image.hashCode() * 31, 31, this.title);
                String str = this.subtitle;
                int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.clientRoute);
                CdfEvent cdfEvent = this.cdfEvent;
                return m2 + (cdfEvent != null ? cdfEvent.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("InsightsRow(image=");
                sb.append(this.image);
                sb.append(", title=");
                sb.append(this.title);
                sb.append(", subtitle=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.subtitle, ", clientRoute=", this.clientRoute, ", cdfEvent=");
                sb.append(this.cdfEvent);
                sb.append(")");
                return sb.toString();
            }
        }

        public InsightsSection(ArrayList arrayList) {
            this.insights = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InsightsSection) && this.insights.equals(((InsightsSection) obj).insights);
        }

        public final int hashCode() {
            return this.insights.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("InsightsSection(insights=", ")", this.insights);
        }
    }

    public final class OverviewSection {
        public final VerticalStackedBarGraph graph;

        public final class VerticalStackedBarGraph {
            public final ArrayList bars;
            public final Legend legend;

            /* loaded from: classes7.dex */
            public final class Bar {
                public final String accessibilityText;
                public final String categoryText;
                public final String headerText;
                public final ArrayList items;
                public final String subtitleText;
                public final String valueText;

                /* loaded from: classes6.dex */
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

                public Bar(String str, String str2, String str3, String str4, String str5, ArrayList arrayList) {
                    this.headerText = str;
                    this.subtitleText = str2;
                    this.categoryText = str3;
                    this.valueText = str4;
                    this.accessibilityText = str5;
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
                    return this.headerText.equals(bar.headerText) && this.subtitleText.equals(bar.subtitleText) && this.categoryText.equals(bar.categoryText) && this.valueText.equals(bar.valueText) && Intrinsics.areEqual(this.accessibilityText, bar.accessibilityText) && this.items.equals(bar.items);
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.headerText.hashCode() * 31, 31, this.subtitleText), 31, this.categoryText), 31, this.valueText);
                    String str = this.accessibilityText;
                    return this.items.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Bar(headerText=", this.headerText, ", subtitleText=", this.subtitleText, ", categoryText=");
                    Boxes$$ExternalSyntheticOutline1.m(m, this.categoryText, ", valueText=", this.valueText, ", accessibilityText=");
                    m.append(this.accessibilityText);
                    m.append(", items=");
                    m.append(this.items);
                    m.append(")");
                    return m.toString();
                }
            }

            public final class Legend {
                public final ArrayList labels;

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

            public VerticalStackedBarGraph(ArrayList arrayList, Legend legend) {
                this.bars = arrayList;
                this.legend = legend;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VerticalStackedBarGraph)) {
                    return false;
                }
                VerticalStackedBarGraph verticalStackedBarGraph = (VerticalStackedBarGraph) obj;
                return this.bars.equals(verticalStackedBarGraph.bars) && Intrinsics.areEqual(this.legend, verticalStackedBarGraph.legend);
            }

            public final int hashCode() {
                int hashCode = this.bars.hashCode() * 31;
                Legend legend = this.legend;
                return hashCode + (legend == null ? 0 : legend.labels.hashCode());
            }

            public final String toString() {
                return "VerticalStackedBarGraph(bars=" + this.bars + ", legend=" + this.legend + ")";
            }
        }

        public OverviewSection(VerticalStackedBarGraph verticalStackedBarGraph) {
            this.graph = verticalStackedBarGraph;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OverviewSection) && Intrinsics.areEqual(this.graph, ((OverviewSection) obj).graph);
        }

        public final int hashCode() {
            VerticalStackedBarGraph verticalStackedBarGraph = this.graph;
            if (verticalStackedBarGraph == null) {
                return 0;
            }
            return verticalStackedBarGraph.hashCode();
        }

        public final String toString() {
            return "OverviewSection(graph=" + this.graph + ")";
        }
    }

    public SpendingInsightsHome(EntryPoint entryPoint, OverviewSection overviewSection, InsightsSection insightsSection) {
        this.entryPoint = entryPoint;
        this.overviewSection = overviewSection;
        this.insightsSection = insightsSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpendingInsightsHome)) {
            return false;
        }
        SpendingInsightsHome spendingInsightsHome = (SpendingInsightsHome) obj;
        return Intrinsics.areEqual(this.entryPoint, spendingInsightsHome.entryPoint) && this.overviewSection.equals(spendingInsightsHome.overviewSection) && Intrinsics.areEqual(this.insightsSection, spendingInsightsHome.insightsSection);
    }

    public final int hashCode() {
        EntryPoint entryPoint = this.entryPoint;
        int hashCode = (this.overviewSection.hashCode() + ((entryPoint == null ? 0 : entryPoint.hashCode()) * 31)) * 31;
        InsightsSection insightsSection = this.insightsSection;
        return hashCode + (insightsSection != null ? insightsSection.insights.hashCode() : 0);
    }

    public final String toString() {
        return "SpendingInsightsHome(entryPoint=" + this.entryPoint + ", overviewSection=" + this.overviewSection + ", insightsSection=" + this.insightsSection + ")";
    }
}
