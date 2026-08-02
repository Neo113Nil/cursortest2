package com.squareup.cash.shopping.viewmodels;

/* loaded from: classes7.dex */
public interface IncentiveSheetViewEvent {

    public final class CloseSheet implements IncentiveSheetViewEvent {
        public static final CloseSheet INSTANCE = new CloseSheet();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseSheet);
        }

        public final int hashCode() {
            return 928328671;
        }

        public final String toString() {
            return "CloseSheet";
        }
    }

    public final class ContinueWithCashAppPay implements IncentiveSheetViewEvent {
        public static final ContinueWithCashAppPay INSTANCE = new ContinueWithCashAppPay();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ContinueWithCashAppPay);
        }

        public final int hashCode() {
            return -733903009;
        }

        public final String toString() {
            return "ContinueWithCashAppPay";
        }
    }
}
