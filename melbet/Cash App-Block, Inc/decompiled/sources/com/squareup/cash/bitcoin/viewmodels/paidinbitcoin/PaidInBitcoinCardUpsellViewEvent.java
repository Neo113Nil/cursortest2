package com.squareup.cash.bitcoin.viewmodels.paidinbitcoin;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes5.dex */
public interface PaidInBitcoinCardUpsellViewEvent {

    public final class CardAction implements PaidInBitcoinCardUpsellViewEvent {
        public static final CardAction INSTANCE = new CardAction();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CardAction);
        }

        public final int hashCode() {
            return 735671403;
        }

        public final String toString() {
            return "CardAction";
        }
    }

    public final class Close implements PaidInBitcoinCardUpsellViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 384644051;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }
}
