package com.squareup.cash.deposits.physical.viewmodels.barcode;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes6.dex */
public abstract class PaperMoneyDepositBarcodeExpiredEvent {

    public final class ButtonClicked extends PaperMoneyDepositBarcodeExpiredEvent {
        public static final ButtonClicked INSTANCE = new ButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ButtonClicked);
        }

        public final int hashCode() {
            return 1693795407;
        }

        public final String toString() {
            return "ButtonClicked";
        }
    }

    public final class Close extends PaperMoneyDepositBarcodeExpiredEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1098487730;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }
}
