package com.squareup.cash.bitcoin.viewmodels.paidinbitcoin;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes5.dex */
public interface PaidInBitcoinLandingViewEvent {

    public final class Close implements PaidInBitcoinLandingViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 847867031;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class SelectPercentage implements PaidInBitcoinLandingViewEvent {
        public static final SelectPercentage INSTANCE = new SelectPercentage();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SelectPercentage);
        }

        public final int hashCode() {
            return 618356919;
        }

        public final String toString() {
            return "SelectPercentage";
        }
    }

    public final class SetupDirectDeposit implements PaidInBitcoinLandingViewEvent {
        public static final SetupDirectDeposit INSTANCE = new SetupDirectDeposit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SetupDirectDeposit);
        }

        public final int hashCode() {
            return -43802951;
        }

        public final String toString() {
            return "SetupDirectDeposit";
        }
    }
}
