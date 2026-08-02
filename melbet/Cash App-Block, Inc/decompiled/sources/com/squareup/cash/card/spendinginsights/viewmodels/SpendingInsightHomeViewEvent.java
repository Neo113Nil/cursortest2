package com.squareup.cash.card.spendinginsights.viewmodels;

import kotlin.jvm.internal.Intrinsics;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes6.dex */
public interface SpendingInsightHomeViewEvent {

    public final class Exit implements SpendingInsightHomeViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return -1564207570;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class InsightsRowTapped implements SpendingInsightHomeViewEvent {
        public final String clientRoute;
        public final CdfEvent event;

        public InsightsRowTapped(String str, CdfEvent cdfEvent) {
            this.clientRoute = str;
            this.event = cdfEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InsightsRowTapped)) {
                return false;
            }
            InsightsRowTapped insightsRowTapped = (InsightsRowTapped) obj;
            return this.clientRoute.equals(insightsRowTapped.clientRoute) && Intrinsics.areEqual(this.event, insightsRowTapped.event);
        }

        public final int hashCode() {
            int hashCode = this.clientRoute.hashCode() * 31;
            CdfEvent cdfEvent = this.event;
            return hashCode + (cdfEvent == null ? 0 : cdfEvent.hashCode());
        }

        public final String toString() {
            return "InsightsRowTapped(clientRoute=" + this.clientRoute + ", event=" + this.event + ")";
        }
    }

    public abstract class UrlTapped implements SpendingInsightHomeViewEvent {
    }
}
