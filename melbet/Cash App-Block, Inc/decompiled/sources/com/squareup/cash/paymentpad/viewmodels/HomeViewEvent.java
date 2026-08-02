package com.squareup.cash.paymentpad.viewmodels;

import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class HomeViewEvent {

    public final class MainPaymentPadEvent extends HomeViewEvent {
        public final MainPaymentPadViewEvent event;

        public MainPaymentPadEvent(MainPaymentPadViewEvent mainPaymentPadViewEvent) {
            mainPaymentPadViewEvent.getClass();
            this.event = mainPaymentPadViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MainPaymentPadEvent) && Intrinsics.areEqual(this.event, ((MainPaymentPadEvent) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "MainPaymentPadEvent(event=" + this.event + ")";
        }
    }

    public final class PayRequestNearby extends HomeViewEvent {
        public static final PayRequestNearby INSTANCE = new PayRequestNearby();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PayRequestNearby);
        }

        public final int hashCode() {
            return 69911182;
        }

        public final String toString() {
            return "PayRequestNearby";
        }
    }

    public final class QrCode extends HomeViewEvent {
        public static final QrCode INSTANCE = new QrCode();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof QrCode);
        }

        public final int hashCode() {
            return 807889430;
        }

        public final String toString() {
            return "QrCode";
        }
    }

    public final class SuspensionsBannerClicked extends HomeViewEvent {
        public static final SuspensionsBannerClicked INSTANCE = new SuspensionsBannerClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SuspensionsBannerClicked);
        }

        public final int hashCode() {
            return -2105986259;
        }

        public final String toString() {
            return "SuspensionsBannerClicked";
        }
    }

    public final class TabToolbarEvent extends HomeViewEvent {
        public final TabToolbarInternalViewEvent event;

        public TabToolbarEvent(TabToolbarInternalViewEvent tabToolbarInternalViewEvent) {
            tabToolbarInternalViewEvent.getClass();
            this.event = tabToolbarInternalViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TabToolbarEvent) && Intrinsics.areEqual(this.event, ((TabToolbarEvent) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "TabToolbarEvent(event=" + this.event + ")";
        }
    }
}
