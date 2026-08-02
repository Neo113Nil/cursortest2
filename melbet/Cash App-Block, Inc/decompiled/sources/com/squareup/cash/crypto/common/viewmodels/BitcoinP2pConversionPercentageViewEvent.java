package com.squareup.cash.crypto.common.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes6.dex */
public interface BitcoinP2pConversionPercentageViewEvent {

    public final class Confirm implements BitcoinP2pConversionPercentageViewEvent {
        public static final Confirm INSTANCE = new Confirm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirm);
        }

        public final int hashCode() {
            return 357767376;
        }

        public final String toString() {
            return "Confirm";
        }
    }

    public final class Disable implements BitcoinP2pConversionPercentageViewEvent {
        public static final Disable INSTANCE = new Disable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Disable);
        }

        public final int hashCode() {
            return 1077957880;
        }

        public final String toString() {
            return "Disable";
        }
    }

    public final class DismissAlert implements BitcoinP2pConversionPercentageViewEvent {
        public static final DismissAlert INSTANCE = new DismissAlert();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissAlert);
        }

        public final int hashCode() {
            return 1046054114;
        }

        public final String toString() {
            return "DismissAlert";
        }
    }

    public final class Exit implements BitcoinP2pConversionPercentageViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return -1464254194;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class SelectPercentage implements BitcoinP2pConversionPercentageViewEvent {
        public final long bps;

        public SelectPercentage(long j) {
            this.bps = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectPercentage) && this.bps == ((SelectPercentage) obj).bps;
        }

        public final int hashCode() {
            return Long.hashCode(this.bps);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.bps, "SelectPercentage(bps=", ")");
        }
    }

    public final class TapCustomPercentage implements BitcoinP2pConversionPercentageViewEvent {
        public static final TapCustomPercentage INSTANCE = new TapCustomPercentage();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapCustomPercentage);
        }

        public final int hashCode() {
            return 262109374;
        }

        public final String toString() {
            return "TapCustomPercentage";
        }
    }
}
