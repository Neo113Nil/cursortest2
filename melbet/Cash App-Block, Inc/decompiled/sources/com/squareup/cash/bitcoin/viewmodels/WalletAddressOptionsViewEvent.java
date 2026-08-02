package com.squareup.cash.bitcoin.viewmodels;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes5.dex */
public abstract class WalletAddressOptionsViewEvent {

    public final class Close extends WalletAddressOptionsViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 77669695;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class CopyAddress extends WalletAddressOptionsViewEvent {
        public static final CopyAddress INSTANCE = new CopyAddress();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CopyAddress);
        }

        public final int hashCode() {
            return -1283679034;
        }

        public final String toString() {
            return "CopyAddress";
        }
    }

    public final class ShareAddress extends WalletAddressOptionsViewEvent {
        public static final ShareAddress INSTANCE = new ShareAddress();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShareAddress);
        }

        public final int hashCode() {
            return 640968174;
        }

        public final String toString() {
            return "ShareAddress";
        }
    }
}
