package com.squareup.cash.bitcoin.viewmodels.deposits.copy;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes5.dex */
public abstract class BitcoinDepositCopyViewEvent {

    public final class Close extends BitcoinDepositCopyViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1653698029;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class CopyLightningInvoice extends BitcoinDepositCopyViewEvent {
        public static final CopyLightningInvoice INSTANCE = new CopyLightningInvoice();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CopyLightningInvoice);
        }

        public final int hashCode() {
            return -1517878781;
        }

        public final String toString() {
            return "CopyLightningInvoice";
        }
    }

    public final class CopyOnChainAddress extends BitcoinDepositCopyViewEvent {
        public static final CopyOnChainAddress INSTANCE = new CopyOnChainAddress();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CopyOnChainAddress);
        }

        public final int hashCode() {
            return 1040879218;
        }

        public final String toString() {
            return "CopyOnChainAddress";
        }
    }

    public final class Retry extends BitcoinDepositCopyViewEvent {
        public static final Retry INSTANCE = new Retry();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Retry);
        }

        public final int hashCode() {
            return 1667347101;
        }

        public final String toString() {
            return "Retry";
        }
    }
}
