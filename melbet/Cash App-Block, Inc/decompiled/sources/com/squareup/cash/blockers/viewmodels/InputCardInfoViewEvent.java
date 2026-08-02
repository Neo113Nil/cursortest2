package com.squareup.cash.blockers.viewmodels;

import com.squareup.protos.franklin.common.KeyedCard;

/* loaded from: classes4.dex */
public abstract class InputCardInfoViewEvent {

    public final class TapBack extends InputCardInfoViewEvent {
        public static final TapBack INSTANCE = new TapBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapBack);
        }

        public final int hashCode() {
            return 2036323525;
        }

        public final String toString() {
            return "TapBack";
        }
    }

    public final class TapNext extends InputCardInfoViewEvent {
        public final KeyedCard card;

        public TapNext(KeyedCard keyedCard) {
            this.card = keyedCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapNext) && this.card.equals(((TapNext) obj).card);
        }

        public final int hashCode() {
            return this.card.hashCode();
        }

        public final String toString() {
            return "TapNext(card=" + this.card + ")";
        }
    }

    public final class TapScanCard extends InputCardInfoViewEvent {
        public static final TapScanCard INSTANCE = new TapScanCard();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapScanCard);
        }

        public final int hashCode() {
            return -1261510645;
        }

        public final String toString() {
            return "TapScanCard";
        }
    }

    public final class TapSkipBlocker extends InputCardInfoViewEvent {
        public static final TapSkipBlocker INSTANCE = new TapSkipBlocker();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapSkipBlocker);
        }

        public final int hashCode() {
            return -936283683;
        }

        public final String toString() {
            return "TapSkipBlocker";
        }
    }
}
