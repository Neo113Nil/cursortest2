package com.squareup.cash.investing.viewmodels;

import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class TransferStockViewEvent {

    public final class AgreeToSellAll extends TransferStockViewEvent {
        public static final AgreeToSellAll INSTANCE = new AgreeToSellAll();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AgreeToSellAll);
        }

        public final int hashCode() {
            return 1889527904;
        }

        public final String toString() {
            return "AgreeToSellAll";
        }
    }

    public final class AmountEntered extends TransferStockViewEvent {
        public final String rawAmount;

        public AmountEntered(String str) {
            str.getClass();
            this.rawAmount = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AmountEntered) && Intrinsics.areEqual(this.rawAmount, ((AmountEntered) obj).rawAmount);
        }

        public final int hashCode() {
            return this.rawAmount.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AmountEntered(rawAmount=", this.rawAmount, ")");
        }
    }

    public final class ChangeOrderTypeClicked extends TransferStockViewEvent {
        public static final ChangeOrderTypeClicked INSTANCE = new ChangeOrderTypeClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChangeOrderTypeClicked);
        }

        public final int hashCode() {
            return -1520677145;
        }

        public final String toString() {
            return "ChangeOrderTypeClicked";
        }
    }

    public final class DialogDismissed extends TransferStockViewEvent {
        public static final DialogDismissed INSTANCE = new DialogDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DialogDismissed);
        }

        public final int hashCode() {
            return -1303820407;
        }

        public final String toString() {
            return "DialogDismissed";
        }
    }

    public final class Expanded extends TransferStockViewEvent {
        public static final Expanded INSTANCE = new Expanded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Expanded);
        }

        public final int hashCode() {
            return 210722417;
        }

        public final String toString() {
            return "Expanded";
        }
    }

    public final class ItemSelected extends TransferStockViewEvent {
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

    public final class MoreInfoClicked extends TransferStockViewEvent {
        public static final MoreInfoClicked INSTANCE = new MoreInfoClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MoreInfoClicked);
        }

        public final int hashCode() {
            return -1903122356;
        }

        public final String toString() {
            return "MoreInfoClicked";
        }
    }

    public final class Peeking extends TransferStockViewEvent {
        public static final Peeking INSTANCE = new Peeking();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Peeking);
        }

        public final int hashCode() {
            return 1595415535;
        }

        public final String toString() {
            return "Peeking";
        }
    }

    public final class Submit extends TransferStockViewEvent {
        public static final Submit INSTANCE = new Submit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Submit);
        }

        public final int hashCode() {
            return -1926168624;
        }

        public final String toString() {
            return "Submit";
        }
    }

    public final class UserDismissed extends TransferStockViewEvent {
        public static final UserDismissed INSTANCE = new UserDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UserDismissed);
        }

        public final int hashCode() {
            return -535810458;
        }

        public final String toString() {
            return "UserDismissed";
        }
    }
}
