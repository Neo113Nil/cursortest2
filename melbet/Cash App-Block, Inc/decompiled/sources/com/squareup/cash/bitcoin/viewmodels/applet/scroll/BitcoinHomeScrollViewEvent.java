package com.squareup.cash.bitcoin.viewmodels.applet.scroll;

import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewEvent;

/* loaded from: classes5.dex */
public interface BitcoinHomeScrollViewEvent extends BitcoinHomeViewEvent {

    public final class ScrollStarted implements BitcoinHomeScrollViewEvent {
        public static final ScrollStarted INSTANCE = new ScrollStarted();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ScrollStarted);
        }

        public final int hashCode() {
            return -809298181;
        }

        public final String toString() {
            return "ScrollStarted";
        }
    }

    public final class ScrollStopped implements BitcoinHomeScrollViewEvent {
        public static final ScrollStopped INSTANCE = new ScrollStopped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ScrollStopped);
        }

        public final int hashCode() {
            return -796432313;
        }

        public final String toString() {
            return "ScrollStopped";
        }
    }
}
