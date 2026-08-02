package com.squareup.cash.bitcoin.viewmodels.roundups;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes5.dex */
public interface BitcoinRoundUpsCardUpsellViewEvent {

    public final class CardAction implements BitcoinRoundUpsCardUpsellViewEvent {
        public static final CardAction INSTANCE = new CardAction();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CardAction);
        }

        public final int hashCode() {
            return 1308711389;
        }

        public final String toString() {
            return "CardAction";
        }
    }

    public final class Close implements BitcoinRoundUpsCardUpsellViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 134491937;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }
}
