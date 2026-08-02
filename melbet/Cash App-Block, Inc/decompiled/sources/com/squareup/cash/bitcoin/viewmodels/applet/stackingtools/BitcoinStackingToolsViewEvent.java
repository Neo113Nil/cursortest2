package com.squareup.cash.bitcoin.viewmodels.applet.stackingtools;

import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewEvent;

/* loaded from: classes5.dex */
public interface BitcoinStackingToolsViewEvent extends BitcoinHomeViewEvent {

    public final class AutoInvestClicked implements BitcoinStackingToolsViewEvent {
        public static final AutoInvestClicked INSTANCE = new AutoInvestClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AutoInvestClicked);
        }

        public final int hashCode() {
            return 1210816483;
        }

        public final String toString() {
            return "AutoInvestClicked";
        }
    }

    public final class LearnMoreClicked implements BitcoinStackingToolsViewEvent {
        public static final LearnMoreClicked INSTANCE = new LearnMoreClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LearnMoreClicked);
        }

        public final int hashCode() {
            return 1510369102;
        }

        public final String toString() {
            return "LearnMoreClicked";
        }
    }

    public final class PaidInBitcoinClicked implements BitcoinStackingToolsViewEvent {
        public static final PaidInBitcoinClicked INSTANCE = new PaidInBitcoinClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PaidInBitcoinClicked);
        }

        public final int hashCode() {
            return -897921606;
        }

        public final String toString() {
            return "PaidInBitcoinClicked";
        }
    }

    public final class ReceiveAsBitcoinClicked implements BitcoinStackingToolsViewEvent {
        public static final ReceiveAsBitcoinClicked INSTANCE = new ReceiveAsBitcoinClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReceiveAsBitcoinClicked);
        }

        public final int hashCode() {
            return 1111729630;
        }

        public final String toString() {
            return "ReceiveAsBitcoinClicked";
        }
    }

    public final class RoundUpsClicked implements BitcoinStackingToolsViewEvent {
        public static final RoundUpsClicked INSTANCE = new RoundUpsClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RoundUpsClicked);
        }

        public final int hashCode() {
            return -747079971;
        }

        public final String toString() {
            return "RoundUpsClicked";
        }
    }
}
