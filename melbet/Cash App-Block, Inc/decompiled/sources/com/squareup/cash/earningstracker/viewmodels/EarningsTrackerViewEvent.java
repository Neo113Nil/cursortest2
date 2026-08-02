package com.squareup.cash.earningstracker.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface EarningsTrackerViewEvent {

    public final class BarSelected implements EarningsTrackerViewEvent {
        public final String displayLabel;
        public final String displayValue;

        public BarSelected(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.displayLabel = str;
            this.displayValue = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BarSelected)) {
                return false;
            }
            BarSelected barSelected = (BarSelected) obj;
            return Intrinsics.areEqual(this.displayLabel, barSelected.displayLabel) && Intrinsics.areEqual(this.displayValue, barSelected.displayValue);
        }

        public final int hashCode() {
            return this.displayValue.hashCode() + (this.displayLabel.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("BarSelected(displayLabel=", this.displayLabel, ", displayValue=", this.displayValue, ")");
        }
    }

    public final class BarSelectionCleared implements EarningsTrackerViewEvent {
        public static final BarSelectionCleared INSTANCE = new BarSelectionCleared();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BarSelectionCleared);
        }

        public final int hashCode() {
            return -1555559623;
        }

        public final String toString() {
            return "BarSelectionCleared";
        }
    }

    public final class CustomerClicked implements EarningsTrackerViewEvent {
        public final String customerToken;

        public CustomerClicked(String str) {
            str.getClass();
            this.customerToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CustomerClicked) && Intrinsics.areEqual(this.customerToken, ((CustomerClicked) obj).customerToken);
        }

        public final int hashCode() {
            return this.customerToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CustomerClicked(customerToken=", this.customerToken, ")");
        }
    }

    public final class FilterChipClicked implements EarningsTrackerViewEvent {
        public final DateFilter earningsFilter;

        public FilterChipClicked(DateFilter dateFilter) {
            dateFilter.getClass();
            this.earningsFilter = dateFilter;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FilterChipClicked) && Intrinsics.areEqual(this.earningsFilter, ((FilterChipClicked) obj).earningsFilter);
        }

        public final int hashCode() {
            return this.earningsFilter.hashCode();
        }

        public final String toString() {
            return "FilterChipClicked(earningsFilter=" + this.earningsFilter + ")";
        }
    }

    public final class GoBack implements EarningsTrackerViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 2029720489;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class HeaderAnimationComplete implements EarningsTrackerViewEvent {
        public static final HeaderAnimationComplete INSTANCE = new HeaderAnimationComplete();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HeaderAnimationComplete);
        }

        public final int hashCode() {
            return -205635754;
        }

        public final String toString() {
            return "HeaderAnimationComplete";
        }
    }

    public final class NetEarningsInfoClick implements EarningsTrackerViewEvent {
        public static final NetEarningsInfoClick INSTANCE = new NetEarningsInfoClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NetEarningsInfoClick);
        }

        public final int hashCode() {
            return 1689286382;
        }

        public final String toString() {
            return "NetEarningsInfoClick";
        }
    }

    public final class PullToRefresh implements EarningsTrackerViewEvent {
        public static final PullToRefresh INSTANCE = new PullToRefresh();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PullToRefresh);
        }

        public final int hashCode() {
            return -511716319;
        }

        public final String toString() {
            return "PullToRefresh";
        }
    }

    public final class Refresh implements EarningsTrackerViewEvent {
        public static final Refresh INSTANCE = new Refresh();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Refresh);
        }

        public final int hashCode() {
            return -583104415;
        }

        public final String toString() {
            return "Refresh";
        }
    }

    public final class TimeframeSelected implements EarningsTrackerViewEvent {
        public final Timeframe timeframe;

        public TimeframeSelected(Timeframe timeframe) {
            timeframe.getClass();
            this.timeframe = timeframe;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TimeframeSelected) && this.timeframe == ((TimeframeSelected) obj).timeframe;
        }

        public final int hashCode() {
            return this.timeframe.hashCode();
        }

        public final String toString() {
            return "TimeframeSelected(timeframe=" + this.timeframe + ")";
        }
    }

    public final class TimeframeSelectorIconClick implements EarningsTrackerViewEvent {
        public static final TimeframeSelectorIconClick INSTANCE = new TimeframeSelectorIconClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TimeframeSelectorIconClick);
        }

        public final int hashCode() {
            return -2105066166;
        }

        public final String toString() {
            return "TimeframeSelectorIconClick";
        }
    }
}
