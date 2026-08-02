package com.squareup.cash.earnings.viewmodels.home;

import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface EarningsHeaderViewEvent {

    public final class ChartBarSelected implements EarningsHeaderViewEvent {
        public static final ChartBarSelected INSTANCE = new ChartBarSelected();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChartBarSelected);
        }

        public final int hashCode() {
            return 967572386;
        }

        public final String toString() {
            return "ChartBarSelected";
        }
    }

    public final class ChartBarSelectionCleared implements EarningsHeaderViewEvent {
        public static final ChartBarSelectionCleared INSTANCE = new ChartBarSelectionCleared();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChartBarSelectionCleared);
        }

        public final int hashCode() {
            return -1276049785;
        }

        public final String toString() {
            return "ChartBarSelectionCleared";
        }
    }

    public final class DateFilterChanged implements EarningsHeaderViewEvent {
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

    public final class TotalEarningsAnimationComplete implements EarningsHeaderViewEvent {
        public static final TotalEarningsAnimationComplete INSTANCE = new TotalEarningsAnimationComplete();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TotalEarningsAnimationComplete);
        }

        public final int hashCode() {
            return 2055732066;
        }

        public final String toString() {
            return "TotalEarningsAnimationComplete";
        }
    }
}
