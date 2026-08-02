package com.squareup.cash.deposits.physical.viewmodels.barcode;

import com.squareup.cash.formview.viewmodels.FormViewModel;

/* loaded from: classes6.dex */
public abstract class PaperMoneyDepositBarcodeExpiredViewModel {

    public final class Expired extends PaperMoneyDepositBarcodeExpiredViewModel {
        public final FormViewModel formViewModel;

        public Expired(FormViewModel formViewModel) {
            this.formViewModel = formViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Expired) && this.formViewModel.equals(((Expired) obj).formViewModel);
        }

        public final int hashCode() {
            return this.formViewModel.hashCode();
        }

        public final String toString() {
            return "Expired(formViewModel=" + this.formViewModel + ")";
        }
    }

    public final class Loading extends PaperMoneyDepositBarcodeExpiredViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -318717856;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
