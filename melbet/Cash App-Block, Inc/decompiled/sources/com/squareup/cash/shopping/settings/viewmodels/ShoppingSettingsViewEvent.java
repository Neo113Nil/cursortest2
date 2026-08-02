package com.squareup.cash.shopping.settings.viewmodels;

/* loaded from: classes7.dex */
public interface ShoppingSettingsViewEvent {

    public final class AutofillClick implements ShoppingSettingsViewEvent {
        public static final AutofillClick INSTANCE = new AutofillClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AutofillClick);
        }

        public final int hashCode() {
            return 1323593546;
        }

        public final String toString() {
            return "AutofillClick";
        }
    }

    public final class GoBack implements ShoppingSettingsViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 1763510811;
        }

        public final String toString() {
            return "GoBack";
        }
    }
}
