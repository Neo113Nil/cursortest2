package com.squareup.cash.account.settings.viewmodels.trustedcontact;

/* loaded from: classes7.dex */
public abstract class InvestingContactViewEvent {

    public final class BackClicked extends InvestingContactViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return 851776854;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class CloseClicked extends InvestingContactViewEvent {
        public static final CloseClicked INSTANCE = new CloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClicked);
        }

        public final int hashCode() {
            return 24097209;
        }

        public final String toString() {
            return "CloseClicked";
        }
    }

    public final class EditClicked extends InvestingContactViewEvent {
        public static final EditClicked INSTANCE = new EditClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EditClicked);
        }

        public final int hashCode() {
            return -288051501;
        }

        public final String toString() {
            return "EditClicked";
        }
    }

    public final class RemoveClicked extends InvestingContactViewEvent {
        public static final RemoveClicked INSTANCE = new RemoveClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RemoveClicked);
        }

        public final int hashCode() {
            return 644651417;
        }

        public final String toString() {
            return "RemoveClicked";
        }
    }
}
