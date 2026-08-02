package com.squareup.cash.banking.viewmodels;

/* loaded from: classes5.dex */
public interface OverdraftViewEvent {

    public final class FooterClicked implements OverdraftViewEvent {
        public static final FooterClicked INSTANCE = new FooterClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FooterClicked);
        }

        public final int hashCode() {
            return 1439848971;
        }

        public final String toString() {
            return "FooterClicked";
        }
    }

    public final class GoBack implements OverdraftViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 503015120;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class RepaymentClicked implements OverdraftViewEvent {
        public static final RepaymentClicked INSTANCE = new RepaymentClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RepaymentClicked);
        }

        public final int hashCode() {
            return -1882444843;
        }

        public final String toString() {
            return "RepaymentClicked";
        }
    }

    public final class ToggleClicked implements OverdraftViewEvent {
        public static final ToggleClicked INSTANCE = new ToggleClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToggleClicked);
        }

        public final int hashCode() {
            return 428614194;
        }

        public final String toString() {
            return "ToggleClicked";
        }
    }
}
