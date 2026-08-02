package com.squareup.cash.card.spendinginsights.backend.api.model;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SpendingInsightsConfig {
    public final ActivitySection activitySection;
    public final String previewTitle;
    public final RecurringPaymentInfo recurringPaymentInfo;
    public final String title;

    public final class ActivitySection {
        public final ActivityFilter activityFilter;
        public final Integer pageSize;
        public final String title;

        public final class ActivityFilter {
            public final List exclude;
            public final List include;

            public ActivityFilter(List list, List list2) {
                list.getClass();
                list2.getClass();
                this.include = list;
                this.exclude = list2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActivityFilter)) {
                    return false;
                }
                ActivityFilter activityFilter = (ActivityFilter) obj;
                return Intrinsics.areEqual(this.include, activityFilter.include) && Intrinsics.areEqual(this.exclude, activityFilter.exclude);
            }

            public final int hashCode() {
                return this.exclude.hashCode() + (this.include.hashCode() * 31);
            }

            public final String toString() {
                return "ActivityFilter(include=" + this.include + ", exclude=" + this.exclude + ")";
            }
        }

        public ActivitySection(String str, Integer num, ActivityFilter activityFilter) {
            this.title = str;
            this.pageSize = num;
            this.activityFilter = activityFilter;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivitySection)) {
                return false;
            }
            ActivitySection activitySection = (ActivitySection) obj;
            return Intrinsics.areEqual(this.title, activitySection.title) && Intrinsics.areEqual(this.pageSize, activitySection.pageSize) && this.activityFilter.equals(activitySection.activityFilter);
        }

        public final int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.pageSize;
            return this.activityFilter.hashCode() + ((hashCode + (num != null ? num.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m(this.pageSize, "ActivitySection(title=", this.title, ", pageSize=", ", activityFilter=");
            m.append(this.activityFilter);
            m.append(")");
            return m.toString();
        }
    }

    public final class RecurringPaymentInfo {
        public final String body;
        public final String title;

        public RecurringPaymentInfo(String str, String str2) {
            this.title = str;
            this.body = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecurringPaymentInfo)) {
                return false;
            }
            RecurringPaymentInfo recurringPaymentInfo = (RecurringPaymentInfo) obj;
            return this.title.equals(recurringPaymentInfo.title) && this.body.equals(recurringPaymentInfo.body);
        }

        public final int hashCode() {
            return this.body.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("RecurringPaymentInfo(title=", this.title, ", body=", this.body, ")");
        }
    }

    public SpendingInsightsConfig(String str, String str2, ActivitySection activitySection, RecurringPaymentInfo recurringPaymentInfo) {
        this.previewTitle = str;
        this.title = str2;
        this.activitySection = activitySection;
        this.recurringPaymentInfo = recurringPaymentInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpendingInsightsConfig)) {
            return false;
        }
        SpendingInsightsConfig spendingInsightsConfig = (SpendingInsightsConfig) obj;
        return Intrinsics.areEqual(this.previewTitle, spendingInsightsConfig.previewTitle) && this.title.equals(spendingInsightsConfig.title) && this.activitySection.equals(spendingInsightsConfig.activitySection) && Intrinsics.areEqual(this.recurringPaymentInfo, spendingInsightsConfig.recurringPaymentInfo);
    }

    public final int hashCode() {
        String str = this.previewTitle;
        int hashCode = (this.activitySection.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.title)) * 31;
        RecurringPaymentInfo recurringPaymentInfo = this.recurringPaymentInfo;
        return hashCode + (recurringPaymentInfo != null ? recurringPaymentInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SpendingInsightsConfig(previewTitle=", this.previewTitle, ", title=", this.title, ", activitySection=");
        m.append(this.activitySection);
        m.append(", recurringPaymentInfo=");
        m.append(this.recurringPaymentInfo);
        m.append(")");
        return m.toString();
    }
}
