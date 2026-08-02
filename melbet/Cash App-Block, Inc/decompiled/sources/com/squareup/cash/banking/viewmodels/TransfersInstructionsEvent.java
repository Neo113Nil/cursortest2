package com.squareup.cash.banking.viewmodels;

/* loaded from: classes5.dex */
public interface TransfersInstructionsEvent {

    public final class BankTransferAccountNumberClick implements TransfersInstructionsEvent {
        public static final BankTransferAccountNumberClick INSTANCE = new BankTransferAccountNumberClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BankTransferAccountNumberClick);
        }

        public final int hashCode() {
            return 1438414197;
        }

        public final String toString() {
            return "BankTransferAccountNumberClick";
        }
    }

    public final class BankTransferGoToCards implements TransfersInstructionsEvent {
        public static final BankTransferGoToCards INSTANCE = new BankTransferGoToCards();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BankTransferGoToCards);
        }

        public final int hashCode() {
            return -1296463331;
        }

        public final String toString() {
            return "BankTransferGoToCards";
        }
    }

    public final class BankTransferHowToClick implements TransfersInstructionsEvent {
        public static final BankTransferHowToClick INSTANCE = new BankTransferHowToClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BankTransferHowToClick);
        }

        public final int hashCode() {
            return -2119311744;
        }

        public final String toString() {
            return "BankTransferHowToClick";
        }
    }

    public final class BankTransferOrderCashCard implements TransfersInstructionsEvent {
        public static final BankTransferOrderCashCard INSTANCE = new BankTransferOrderCashCard();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BankTransferOrderCashCard);
        }

        public final int hashCode() {
            return 957867598;
        }

        public final String toString() {
            return "BankTransferOrderCashCard";
        }
    }

    public final class BankTransferRoutingNumberClick implements TransfersInstructionsEvent {
        public static final BankTransferRoutingNumberClick INSTANCE = new BankTransferRoutingNumberClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BankTransferRoutingNumberClick);
        }

        public final int hashCode() {
            return -830294724;
        }

        public final String toString() {
            return "BankTransferRoutingNumberClick";
        }
    }

    public final class GoBack implements TransfersInstructionsEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return -1352143509;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class TabClick implements TransfersInstructionsEvent {
        public final TransfersViewModel$Companion$TransfersTab tab;

        public TabClick(TransfersViewModel$Companion$TransfersTab transfersViewModel$Companion$TransfersTab) {
            transfersViewModel$Companion$TransfersTab.getClass();
            this.tab = transfersViewModel$Companion$TransfersTab;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TabClick) && this.tab == ((TabClick) obj).tab;
        }

        public final int hashCode() {
            return this.tab.hashCode();
        }

        public final String toString() {
            return "TabClick(tab=" + this.tab + ")";
        }
    }

    public final class WireTransferAccountNumberClick implements TransfersInstructionsEvent {
        public static final WireTransferAccountNumberClick INSTANCE = new WireTransferAccountNumberClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof WireTransferAccountNumberClick);
        }

        public final int hashCode() {
            return 432236158;
        }

        public final String toString() {
            return "WireTransferAccountNumberClick";
        }
    }

    public final class WireTransferActionClick implements TransfersInstructionsEvent {
        public static final WireTransferActionClick INSTANCE = new WireTransferActionClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof WireTransferActionClick);
        }

        public final int hashCode() {
            return 1291807558;
        }

        public final String toString() {
            return "WireTransferActionClick";
        }
    }

    public final class WireTransferRoutingNumberClick implements TransfersInstructionsEvent {
        public static final WireTransferRoutingNumberClick INSTANCE = new WireTransferRoutingNumberClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof WireTransferRoutingNumberClick);
        }

        public final int hashCode() {
            return -1836472763;
        }

        public final String toString() {
            return "WireTransferRoutingNumberClick";
        }
    }
}
