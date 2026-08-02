package com.squareup.cash.paychecks.viewmodels;

import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiState;

/* loaded from: classes6.dex */
public interface PaychecksActivityListViewEvent {

    public final class AggregationSelected implements PaychecksActivityListViewEvent {
        public final PaychecksUiState.CalendarMonthPaychecksAggregation aggregation;

        public AggregationSelected(PaychecksUiState.CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation) {
            this.aggregation = calendarMonthPaychecksAggregation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AggregationSelected) && this.aggregation.equals(((AggregationSelected) obj).aggregation);
        }

        public final int hashCode() {
            return this.aggregation.hashCode();
        }

        public final String toString() {
            return "AggregationSelected(aggregation=" + this.aggregation + ")";
        }
    }

    public final class Close implements PaychecksActivityListViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -927206191;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }
}
