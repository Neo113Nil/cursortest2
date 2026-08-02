package com.squareup.cash.card.spendinginsights.viewmodels;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightHomeViewEvent;
import com.squareup.cash.charting.viewmodels.SegmentedBarChartViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface SpendingInsightsHomeViewModel {

    public final class Content implements SpendingInsightsHomeViewModel {
        public final ActivitySection activitySection;
        public final InsightsSection insightsSection;
        public final OverviewSection overviewSection;
        public final String title;

        public final class ActivitySection {
            public final UiCallbackModel embedded;
            public final String title;

            public ActivitySection(UiCallbackModel uiCallbackModel, String str) {
                this.title = str;
                this.embedded = uiCallbackModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActivitySection)) {
                    return false;
                }
                ActivitySection activitySection = (ActivitySection) obj;
                return Intrinsics.areEqual(this.title, activitySection.title) && this.embedded.equals(activitySection.embedded);
            }

            public final int hashCode() {
                String str = this.title;
                return this.embedded.hashCode() + ((str == null ? 0 : str.hashCode()) * 961);
            }

            public final String toString() {
                return "ActivitySection(title=" + this.title + ", subtitle=null, embedded=" + this.embedded + ")";
            }
        }

        public final class InsightsSection {
            public final ArrayList insights;

            public final class InsightsRow {
                public final SpendingInsightHomeViewEvent.InsightsRowTapped action;
                public final RowIcon icon;
                public final String subtitle;
                public final String title;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* loaded from: classes7.dex */
                public final class RowIcon {
                    public static final /* synthetic */ RowIcon[] $VALUES;
                    public static final RowIcon AI_INSIGHTS;
                    public static final RowIcon RECURRING_PAYMENTS;
                    public static final RowIcon TOP_LOCATIONS;

                    static {
                        RowIcon rowIcon = new RowIcon("RECURRING_PAYMENTS", 0);
                        RECURRING_PAYMENTS = rowIcon;
                        RowIcon rowIcon2 = new RowIcon("TOP_LOCATIONS", 1);
                        TOP_LOCATIONS = rowIcon2;
                        RowIcon rowIcon3 = new RowIcon("AI_INSIGHTS", 2);
                        AI_INSIGHTS = rowIcon3;
                        $VALUES = new RowIcon[]{rowIcon, rowIcon2, rowIcon3};
                    }

                    public static RowIcon valueOf(String str) {
                        return (RowIcon) Enum.valueOf(RowIcon.class, str);
                    }

                    public static RowIcon[] values() {
                        return (RowIcon[]) $VALUES.clone();
                    }
                }

                public InsightsRow(RowIcon rowIcon, String str, String str2, SpendingInsightHomeViewEvent.InsightsRowTapped insightsRowTapped) {
                    this.icon = rowIcon;
                    this.title = str;
                    this.subtitle = str2;
                    this.action = insightsRowTapped;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof InsightsRow)) {
                        return false;
                    }
                    InsightsRow insightsRow = (InsightsRow) obj;
                    return this.icon == insightsRow.icon && this.title.equals(insightsRow.title) && Intrinsics.areEqual(this.subtitle, insightsRow.subtitle) && this.action.equals(insightsRow.action);
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.title);
                    String str = this.subtitle;
                    return this.action.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
                }

                public final String toString() {
                    return "InsightsRow(icon=" + this.icon + ", title=" + this.title + ", subtitle=" + this.subtitle + ", action=" + this.action + ")";
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
            public final SegmentedBarChartViewModel chart;

            public OverviewSection(SegmentedBarChartViewModel segmentedBarChartViewModel) {
                this.chart = segmentedBarChartViewModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OverviewSection) && this.chart.equals(((OverviewSection) obj).chart);
            }

            public final int hashCode() {
                return this.chart.hashCode();
            }

            public final String toString() {
                return "OverviewSection(chart=" + this.chart + ")";
            }
        }

        public Content(String str, OverviewSection overviewSection, InsightsSection insightsSection, ActivitySection activitySection) {
            this.title = str;
            this.overviewSection = overviewSection;
            this.insightsSection = insightsSection;
            this.activitySection = activitySection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.title.equals(content.title) && this.overviewSection.equals(content.overviewSection) && Intrinsics.areEqual(this.insightsSection, content.insightsSection) && this.activitySection.equals(content.activitySection);
        }

        @Override // com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightsHomeViewModel
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int hashCode = (this.overviewSection.chart.hashCode() + (this.title.hashCode() * 31)) * 31;
            InsightsSection insightsSection = this.insightsSection;
            return (this.activitySection.hashCode() + ((hashCode + (insightsSection == null ? 0 : insightsSection.insights.hashCode())) * 31)) * 31;
        }

        public final String toString() {
            return "Content(title=" + this.title + ", overviewSection=" + this.overviewSection + ", insightsSection=" + this.insightsSection + ", activitySection=" + this.activitySection + ", disclosures=null)";
        }
    }

    public final class Loading implements SpendingInsightsHomeViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        @Override // com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightsHomeViewModel
        public final String getTitle() {
            return null;
        }

        public final int hashCode() {
            return 453705112;
        }

        public final String toString() {
            return "Loading";
        }
    }

    String getTitle();
}
