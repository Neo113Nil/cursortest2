package com.squareup.cash.banking.viewmodels;

/* loaded from: classes5.dex */
public interface BetterOverdraftViewEvent {

    public final class BackClicked implements BetterOverdraftViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return -619653297;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class CancelTurnOffClicked implements BetterOverdraftViewEvent {
        public static final CancelTurnOffClicked INSTANCE = new CancelTurnOffClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelTurnOffClicked);
        }

        public final int hashCode() {
            return 620084224;
        }

        public final String toString() {
            return "CancelTurnOffClicked";
        }
    }

    public final class ConfirmTurnOffClicked implements BetterOverdraftViewEvent {
        public static final ConfirmTurnOffClicked INSTANCE = new ConfirmTurnOffClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmTurnOffClicked);
        }

        public final int hashCode() {
            return 1727759940;
        }

        public final String toString() {
            return "ConfirmTurnOffClicked";
        }
    }

    public final class PayButtonClicked implements BetterOverdraftViewEvent {
        public static final PayButtonClicked INSTANCE = new PayButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PayButtonClicked);
        }

        public final int hashCode() {
            return 1654353950;
        }

        public final String toString() {
            return "PayButtonClicked";
        }
    }

    /* loaded from: classes4.dex */
    public final class SupportLinkClicked implements BetterOverdraftViewEvent {
        public static final SupportLinkClicked INSTANCE = new SupportLinkClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SupportLinkClicked);
        }

        public final int hashCode() {
            return 1737102991;
        }

        public final String toString() {
            return "SupportLinkClicked";
        }
    }

    public final class ToggleButtonClicked implements BetterOverdraftViewEvent {
        public static final ToggleButtonClicked INSTANCE = new ToggleButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToggleButtonClicked);
        }

        public final int hashCode() {
            return -2014996304;
        }

        public final String toString() {
            return "ToggleButtonClicked";
        }
    }
}
