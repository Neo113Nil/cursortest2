package com.squareup.cash.afterpayapplet.viewmodels.viewevents;

import com.squareup.cash.afterpayapplet.viewmodels.Tap;

/* loaded from: classes5.dex */
public interface AfterpayAppletMerchantSheetViewEvent {

    public final class CtaButtonTapped implements AfterpayAppletMerchantSheetViewEvent {
        public final Tap tap;

        public CtaButtonTapped(Tap tap) {
            this.tap = tap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CtaButtonTapped) && this.tap.equals(((CtaButtonTapped) obj).tap);
        }

        public final int hashCode() {
            return this.tap.hashCode();
        }

        public final String toString() {
            return "CtaButtonTapped(tap=" + this.tap + ")";
        }
    }

    public final class Dismiss implements AfterpayAppletMerchantSheetViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 1221149095;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class SheetViewed implements AfterpayAppletMerchantSheetViewEvent {
        public static final SheetViewed INSTANCE = new SheetViewed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SheetViewed);
        }

        public final int hashCode() {
            return -674074400;
        }

        public final String toString() {
            return "SheetViewed";
        }
    }

    public final class SheetViewedFromForeground implements AfterpayAppletMerchantSheetViewEvent {
        public static final SheetViewedFromForeground INSTANCE = new SheetViewedFromForeground();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SheetViewedFromForeground);
        }

        public final int hashCode() {
            return 4883853;
        }

        public final String toString() {
            return "SheetViewedFromForeground";
        }
    }

    public final class TryAgain implements AfterpayAppletMerchantSheetViewEvent {
        public static final TryAgain INSTANCE = new TryAgain();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TryAgain);
        }

        public final int hashCode() {
            return 844739304;
        }

        public final String toString() {
            return "TryAgain";
        }
    }
}
