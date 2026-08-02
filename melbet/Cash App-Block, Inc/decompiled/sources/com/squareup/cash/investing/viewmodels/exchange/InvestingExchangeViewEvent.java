package com.squareup.cash.investing.viewmodels.exchange;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface InvestingExchangeViewEvent {

    public final class AgreeToSellAll implements InvestingExchangeViewEvent {
        public static final AgreeToSellAll INSTANCE = new AgreeToSellAll();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AgreeToSellAll);
        }

        public final int hashCode() {
            return 8674770;
        }

        public final String toString() {
            return "AgreeToSellAll";
        }
    }

    public final class AmountEntered implements InvestingExchangeViewEvent {
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

    public final class ChangeOrderTypeClicked implements InvestingExchangeViewEvent {
        public static final ChangeOrderTypeClicked INSTANCE = new ChangeOrderTypeClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChangeOrderTypeClicked);
        }

        public final int hashCode() {
            return 1584738905;
        }

        public final String toString() {
            return "ChangeOrderTypeClicked";
        }
    }

    public final class CloseButtonClicked implements InvestingExchangeViewEvent {
        public static final CloseButtonClicked INSTANCE = new CloseButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseButtonClicked);
        }

        public final int hashCode() {
            return -1955003993;
        }

        public final String toString() {
            return "CloseButtonClicked";
        }
    }

    public final class DialogDismissed implements InvestingExchangeViewEvent {
        public static final DialogDismissed INSTANCE = new DialogDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DialogDismissed);
        }

        public final int hashCode() {
            return 519274583;
        }

        public final String toString() {
            return "DialogDismissed";
        }
    }

    public final class Expanded implements InvestingExchangeViewEvent {
        public static final Expanded INSTANCE = new Expanded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Expanded);
        }

        public final int hashCode() {
            return -1467133597;
        }

        public final String toString() {
            return "Expanded";
        }
    }

    public final class ItemSelected implements InvestingExchangeViewEvent {
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

    public final class OnBackPressed implements InvestingExchangeViewEvent {
        public static final OnBackPressed INSTANCE = new OnBackPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnBackPressed);
        }

        public final int hashCode() {
            return 186678130;
        }

        public final String toString() {
            return "OnBackPressed";
        }
    }

    public final class Peeking implements InvestingExchangeViewEvent {
        public static final Peeking INSTANCE = new Peeking();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Peeking);
        }

        public final int hashCode() {
            return -1091108163;
        }

        public final String toString() {
            return "Peeking";
        }
    }

    public final class Submit implements InvestingExchangeViewEvent {
        public static final Submit INSTANCE = new Submit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Submit);
        }

        public final int hashCode() {
            return -1181546686;
        }

        public final String toString() {
            return "Submit";
        }
    }
}
