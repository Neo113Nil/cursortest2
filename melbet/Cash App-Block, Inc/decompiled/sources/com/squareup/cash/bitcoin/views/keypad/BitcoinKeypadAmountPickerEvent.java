package com.squareup.cash.bitcoin.views.keypad;

import bo.app.re$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public interface BitcoinKeypadAmountPickerEvent {

    public final class AmountEntered implements BitcoinKeypadAmountPickerEvent {
        public final long amountCents;
        public final String rawAmount;

        public AmountEntered(String str, long j) {
            this.rawAmount = str;
            this.amountCents = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AmountEntered)) {
                return false;
            }
            AmountEntered amountEntered = (AmountEntered) obj;
            return this.rawAmount.equals(amountEntered.rawAmount) && this.amountCents == amountEntered.amountCents;
        }

        public final int hashCode() {
            return Long.hashCode(this.amountCents) + (this.rawAmount.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("AmountEntered(rawAmount=", this.rawAmount, ", amountCents=", this.amountCents);
            m.append(")");
            return m.toString();
        }
    }

    public final class ButtonClicked implements BitcoinKeypadAmountPickerEvent {
        public static final ButtonClicked INSTANCE = new ButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ButtonClicked);
        }

        public final int hashCode() {
            return 1249629633;
        }

        public final String toString() {
            return "ButtonClicked";
        }
    }

    public final class ChangeCurrencyClicked implements BitcoinKeypadAmountPickerEvent {
        public static final ChangeCurrencyClicked INSTANCE = new ChangeCurrencyClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChangeCurrencyClicked);
        }

        public final int hashCode() {
            return 1241843250;
        }

        public final String toString() {
            return "ChangeCurrencyClicked";
        }
    }

    public final class CloseButtonClicked implements BitcoinKeypadAmountPickerEvent {
        public static final CloseButtonClicked INSTANCE = new CloseButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseButtonClicked);
        }

        public final int hashCode() {
            return 110072785;
        }

        public final String toString() {
            return "CloseButtonClicked";
        }
    }

    public final class MaxButtonClicked implements BitcoinKeypadAmountPickerEvent {
        public static final MaxButtonClicked INSTANCE = new MaxButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MaxButtonClicked);
        }

        public final int hashCode() {
            return -172048155;
        }

        public final String toString() {
            return "MaxButtonClicked";
        }
    }

    public final class NoteClicked implements BitcoinKeypadAmountPickerEvent {
        public static final NoteClicked INSTANCE = new NoteClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoteClicked);
        }

        public final int hashCode() {
            return 1302679553;
        }

        public final String toString() {
            return "NoteClicked";
        }
    }

    public final class QrCodeScannerClicked implements BitcoinKeypadAmountPickerEvent {
        public static final QrCodeScannerClicked INSTANCE = new QrCodeScannerClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof QrCodeScannerClicked);
        }

        public final int hashCode() {
            return -776423189;
        }

        public final String toString() {
            return "QrCodeScannerClicked";
        }
    }
}
