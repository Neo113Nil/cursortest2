package com.squareup.cash.account.settings.viewmodels.trustedcontact;

/* loaded from: classes7.dex */
public abstract class TrustedContactSettingViewEvent {

    public final class AddTrustedContactClicked extends TrustedContactSettingViewEvent {
        public static final AddTrustedContactClicked INSTANCE = new AddTrustedContactClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddTrustedContactClicked);
        }

        public final int hashCode() {
            return 230028255;
        }

        public final String toString() {
            return "AddTrustedContactClicked";
        }
    }

    public final class OpenTrustedContactClicked extends TrustedContactSettingViewEvent {
        public static final OpenTrustedContactClicked INSTANCE = new OpenTrustedContactClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenTrustedContactClicked);
        }

        public final int hashCode() {
            return 654593938;
        }

        public final String toString() {
            return "OpenTrustedContactClicked";
        }
    }
}
