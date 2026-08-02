package com.squareup.cash.account.settings.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public interface TaxesPasswordViewEvent {

    public final class ChangePasswordClicked implements TaxesPasswordViewEvent {
        public static final ChangePasswordClicked INSTANCE = new ChangePasswordClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChangePasswordClicked);
        }

        public final int hashCode() {
            return 1159234710;
        }

        public final String toString() {
            return "ChangePasswordClicked";
        }
    }

    public final class EnablePassword implements TaxesPasswordViewEvent {
        public final boolean enabled;

        public EnablePassword(boolean z) {
            this.enabled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EnablePassword) && this.enabled == ((EnablePassword) obj).enabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.enabled);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("EnablePassword(enabled=", ")", this.enabled);
        }
    }

    public final class GoBack implements TaxesPasswordViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 1909238741;
        }

        public final String toString() {
            return "GoBack";
        }
    }
}
