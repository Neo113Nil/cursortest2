package com.squareup.cash.money.viewmodels;

import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes6.dex */
public interface MoneyTabEvent {

    public final class HandleBack implements MoneyTabEvent {
        public static final HandleBack INSTANCE = new HandleBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HandleBack);
        }

        public final int hashCode() {
            return -362430601;
        }

        public final String toString() {
            return "HandleBack";
        }
    }

    public final class HypeCountdownClicked implements MoneyTabEvent {
        public static final HypeCountdownClicked INSTANCE = new HypeCountdownClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HypeCountdownClicked);
        }

        public final int hashCode() {
            return -384029212;
        }

        public final String toString() {
            return "HypeCountdownClicked";
        }
    }

    public final class NavigateToMoneybot implements MoneyTabEvent {
        public static final NavigateToMoneybot INSTANCE = new NavigateToMoneybot();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToMoneybot);
        }

        public final int hashCode() {
            return -1157834437;
        }

        public final String toString() {
            return "NavigateToMoneybot";
        }
    }

    public final class NavigateToWallet implements MoneyTabEvent {
        public final Integer initialPaymentDevicePage;

        public NavigateToWallet(Integer num) {
            this.initialPaymentDevicePage = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToWallet) && Intrinsics.areEqual(this.initialPaymentDevicePage, ((NavigateToWallet) obj).initialPaymentDevicePage);
        }

        public final int hashCode() {
            Integer num = this.initialPaymentDevicePage;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return "NavigateToWallet(initialPaymentDevicePage=" + this.initialPaymentDevicePage + ")";
        }
    }

    public final class SuspensionsBannerClicked implements MoneyTabEvent {
        public static final SuspensionsBannerClicked INSTANCE = new SuspensionsBannerClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SuspensionsBannerClicked);
        }

        public final int hashCode() {
            return 2049759501;
        }

        public final String toString() {
            return "SuspensionsBannerClicked";
        }
    }

    public final class TabToolbarEvent implements MoneyTabEvent {
        public final TabToolbarInternalViewEvent event;

        public TabToolbarEvent(TabToolbarInternalViewEvent tabToolbarInternalViewEvent) {
            tabToolbarInternalViewEvent.getClass();
            this.event = tabToolbarInternalViewEvent;
        }
    }

    public final class Viewed implements MoneyTabEvent {
        public static final Viewed INSTANCE = new Viewed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Viewed);
        }

        public final int hashCode() {
            return -165952948;
        }

        public final String toString() {
            return "Viewed";
        }
    }

    public final class VisibleRangeChanged implements MoneyTabEvent {
        public final IntRange visibleRange;

        public VisibleRangeChanged(IntRange intRange) {
            intRange.getClass();
            this.visibleRange = intRange;
        }
    }
}
