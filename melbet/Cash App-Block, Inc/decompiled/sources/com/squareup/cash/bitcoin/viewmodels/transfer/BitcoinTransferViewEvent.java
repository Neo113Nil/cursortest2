package com.squareup.cash.bitcoin.viewmodels.transfer;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BitcoinTransferViewEvent {

    public final class AmountEntered implements BitcoinTransferViewEvent {
        public final long amountCents;
        public final String rawAmount;

        public AmountEntered(String str, long j) {
            str.getClass();
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
            return Intrinsics.areEqual(this.rawAmount, amountEntered.rawAmount) && this.amountCents == amountEntered.amountCents;
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

    public final class ChangeInstrumentClicked implements BitcoinTransferViewEvent {
        public static final ChangeInstrumentClicked INSTANCE = new ChangeInstrumentClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChangeInstrumentClicked);
        }

        public final int hashCode() {
            return 1941519444;
        }

        public final String toString() {
            return "ChangeInstrumentClicked";
        }
    }

    public final class ChangeOrderTypeClicked implements BitcoinTransferViewEvent {
        public static final ChangeOrderTypeClicked INSTANCE = new ChangeOrderTypeClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChangeOrderTypeClicked);
        }

        public final int hashCode() {
            return -1910957365;
        }

        public final String toString() {
            return "ChangeOrderTypeClicked";
        }
    }

    public final class CloseButtonClicked implements BitcoinTransferViewEvent {
        public static final CloseButtonClicked INSTANCE = new CloseButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseButtonClicked);
        }

        public final int hashCode() {
            return -1758006503;
        }

        public final String toString() {
            return "CloseButtonClicked";
        }
    }

    public final class DialogDismissed implements BitcoinTransferViewEvent {
        public static final DialogDismissed INSTANCE = new DialogDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DialogDismissed);
        }

        public final int hashCode() {
            return 389960741;
        }

        public final String toString() {
            return "DialogDismissed";
        }
    }

    public final class Expanded implements BitcoinTransferViewEvent {
        public static final Expanded INSTANCE = new Expanded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Expanded);
        }

        public final int hashCode() {
            return 2056456533;
        }

        public final String toString() {
            return "Expanded";
        }
    }

    public final class ItemSelected implements BitcoinTransferViewEvent {
        public final AmountSelection selection;

        public ItemSelected(AmountSelection amountSelection) {
            amountSelection.getClass();
            this.selection = amountSelection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ItemSelected) && Intrinsics.areEqual(this.selection, ((ItemSelected) obj).selection);
        }

        public final int hashCode() {
            return this.selection.hashCode();
        }

        public final String toString() {
            return "ItemSelected(selection=" + this.selection + ")";
        }
    }

    public final class OnBackPressed implements BitcoinTransferViewEvent {
        public static final OnBackPressed INSTANCE = new OnBackPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnBackPressed);
        }

        public final int hashCode() {
            return -1744180544;
        }

        public final String toString() {
            return "OnBackPressed";
        }
    }

    public final class Peeking implements BitcoinTransferViewEvent {
        public static final Peeking INSTANCE = new Peeking();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Peeking);
        }

        public final int hashCode() {
            return -700349301;
        }

        public final String toString() {
            return "Peeking";
        }
    }

    public final class PercentageSelected implements BitcoinTransferViewEvent {
        public final float percentage;

        public PercentageSelected(float f) {
            this.percentage = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PercentageSelected) && Float.compare(this.percentage, ((PercentageSelected) obj).percentage) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.percentage);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.percentage, "PercentageSelected(percentage=", ")");
        }
    }

    public final class Submit implements BitcoinTransferViewEvent {
        public static final Submit INSTANCE = new Submit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Submit);
        }

        public final int hashCode() {
            return 355079092;
        }

        public final String toString() {
            return "Submit";
        }
    }
}
