package com.squareup.cash.account.settings.viewmodels;

/* loaded from: classes7.dex */
public abstract class ReferralStatusViewEvent {

    public final class BackPressed extends ReferralStatusViewEvent {
        public static final BackPressed INSTANCE = new BackPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackPressed);
        }

        public final int hashCode() {
            return 1471801196;
        }

        public final String toString() {
            return "BackPressed";
        }
    }

    public final class ViewAttached extends ReferralStatusViewEvent {
        public static final ViewAttached INSTANCE = new ViewAttached();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewAttached);
        }

        public final int hashCode() {
            return 679494488;
        }

        public final String toString() {
            return "ViewAttached";
        }
    }

    public final class ViewDetached extends ReferralStatusViewEvent {
        public static final ViewDetached INSTANCE = new ViewDetached();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewDetached);
        }

        public final int hashCode() {
            return 1185304870;
        }

        public final String toString() {
            return "ViewDetached";
        }
    }
}
