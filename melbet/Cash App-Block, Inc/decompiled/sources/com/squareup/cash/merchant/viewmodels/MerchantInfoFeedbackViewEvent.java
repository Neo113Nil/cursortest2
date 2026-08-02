package com.squareup.cash.merchant.viewmodels;

import com.squareup.cash.merchant.viewmodels.MerchantInfoFeedbackViewModel;

/* loaded from: classes6.dex */
public interface MerchantInfoFeedbackViewEvent {

    public final class ContinueClicked implements MerchantInfoFeedbackViewEvent {
        public static final ContinueClicked INSTANCE = new ContinueClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ContinueClicked);
        }

        public final int hashCode() {
            return -653125855;
        }

        public final String toString() {
            return "ContinueClicked";
        }
    }

    public final class RowSelected implements MerchantInfoFeedbackViewEvent {
        public final MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow row;

        public RowSelected(MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow merchantInfoRow) {
            this.row = merchantInfoRow;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RowSelected) && this.row.equals(((RowSelected) obj).row);
        }

        public final int hashCode() {
            return this.row.hashCode();
        }

        public final String toString() {
            return "RowSelected(row=" + this.row + ")";
        }
    }

    public final class SheetDismissed implements MerchantInfoFeedbackViewEvent {
        public static final SheetDismissed INSTANCE = new SheetDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SheetDismissed);
        }

        public final int hashCode() {
            return -1639934903;
        }

        public final String toString() {
            return "SheetDismissed";
        }
    }
}
