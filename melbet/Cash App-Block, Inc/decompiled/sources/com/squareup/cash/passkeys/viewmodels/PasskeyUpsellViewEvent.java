package com.squareup.cash.passkeys.viewmodels;

/* loaded from: classes6.dex */
public interface PasskeyUpsellViewEvent {

    public final class RegisterTapped implements PasskeyUpsellViewEvent {
        public static final RegisterTapped INSTANCE = new RegisterTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RegisterTapped);
        }

        public final int hashCode() {
            return -2029741381;
        }

        public final String toString() {
            return "RegisterTapped";
        }
    }

    public final class SkipTapped implements PasskeyUpsellViewEvent {
        public static final SkipTapped INSTANCE = new SkipTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SkipTapped);
        }

        public final int hashCode() {
            return 1731293847;
        }

        public final String toString() {
            return "SkipTapped";
        }
    }
}
