package com.squareup.cash.bitcoin.viewmodels.autowithdraw;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes5.dex */
public interface BitcoinAutoWithdrawUpsellViewEvent {

    public final class Close implements BitcoinAutoWithdrawUpsellViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1406298061;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class GetBitkeyClicked implements BitcoinAutoWithdrawUpsellViewEvent {
        public static final GetBitkeyClicked INSTANCE = new GetBitkeyClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GetBitkeyClicked);
        }

        public final int hashCode() {
            return -1680170812;
        }

        public final String toString() {
            return "GetBitkeyClicked";
        }
    }

    public final class GetStartedClicked implements BitcoinAutoWithdrawUpsellViewEvent {
        public static final GetStartedClicked INSTANCE = new GetStartedClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GetStartedClicked);
        }

        public final int hashCode() {
            return 1249020695;
        }

        public final String toString() {
            return "GetStartedClicked";
        }
    }
}
