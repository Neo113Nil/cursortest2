package com.squareup.cash.shopping.settings.viewmodels;

/* loaded from: classes7.dex */
public interface ShoppingSettingsAutofillViewEvent {

    public final class AddAddressClicked implements ShoppingSettingsAutofillViewEvent {
        public static final AddAddressClicked INSTANCE = new AddAddressClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddAddressClicked);
        }

        public final int hashCode() {
            return -2061531946;
        }

        public final String toString() {
            return "AddAddressClicked";
        }
    }

    public final class AutofillToggleClicked implements ShoppingSettingsAutofillViewEvent {
        public static final AutofillToggleClicked INSTANCE = new AutofillToggleClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AutofillToggleClicked);
        }

        public final int hashCode() {
            return 1447898851;
        }

        public final String toString() {
            return "AutofillToggleClicked";
        }
    }

    public final class EditAddressClicked implements ShoppingSettingsAutofillViewEvent {
        public static final EditAddressClicked INSTANCE = new EditAddressClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EditAddressClicked);
        }

        public final int hashCode() {
            return 1828707899;
        }

        public final String toString() {
            return "EditAddressClicked";
        }
    }

    public final class GoBack implements ShoppingSettingsAutofillViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return -128161043;
        }

        public final String toString() {
            return "GoBack";
        }
    }
}
