package com.squareup.cash.profile.viewmodels;

/* loaded from: classes7.dex */
public interface ProfileConfirmRemoveAliasViewEvent {

    public final class CancelClicked implements ProfileConfirmRemoveAliasViewEvent {
        public static final CancelClicked INSTANCE = new CancelClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelClicked);
        }

        public final int hashCode() {
            return -511241529;
        }

        public final String toString() {
            return "CancelClicked";
        }
    }

    public final class ConfirmClicked implements ProfileConfirmRemoveAliasViewEvent {
        public static final ConfirmClicked INSTANCE = new ConfirmClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmClicked);
        }

        public final int hashCode() {
            return -76185075;
        }

        public final String toString() {
            return "ConfirmClicked";
        }
    }
}
