package com.squareup.cash.earnings.viewmodels.streamdetail;

import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface EarningsStreamDetailViewEvent {

    public final class Back implements EarningsStreamDetailViewEvent {
        public static final Back INSTANCE = new Back();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return 12388267;
        }

        public final String toString() {
            return Constants.META_BACK_BUTTON;
        }
    }

    public final class DateFilterChanged implements EarningsStreamDetailViewEvent {
        public final DateFilter filter;

        public DateFilterChanged(DateFilter dateFilter) {
            dateFilter.getClass();
            this.filter = dateFilter;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DateFilterChanged) && Intrinsics.areEqual(this.filter, ((DateFilterChanged) obj).filter);
        }

        public final int hashCode() {
            return this.filter.hashCode();
        }

        public final String toString() {
            return "DateFilterChanged(filter=" + this.filter + ")";
        }
    }

    public final class RetryLoad implements EarningsStreamDetailViewEvent {
        public static final RetryLoad INSTANCE = new RetryLoad();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryLoad);
        }

        public final int hashCode() {
            return 2096160618;
        }

        public final String toString() {
            return "RetryLoad";
        }
    }
}
