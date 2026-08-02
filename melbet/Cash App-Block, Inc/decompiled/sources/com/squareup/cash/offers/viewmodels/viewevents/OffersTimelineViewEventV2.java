package com.squareup.cash.offers.viewmodels.viewevents;

/* loaded from: classes6.dex */
public interface OffersTimelineViewEventV2 {

    public final class BackClicked implements OffersTimelineViewEventV2 {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return -401359947;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class SheetDismissed implements OffersTimelineViewEventV2 {
        public static final SheetDismissed INSTANCE = new SheetDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SheetDismissed);
        }

        public final int hashCode() {
            return 287504245;
        }

        public final String toString() {
            return "SheetDismissed";
        }
    }
}
