package com.squareup.cash.profile.viewmodels;

/* loaded from: classes7.dex */
public interface ProfileConfirmSignOutViewEvent {

    public final class Cancel implements ProfileConfirmSignOutViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return 1561874405;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Confirm implements ProfileConfirmSignOutViewEvent {
        public static final Confirm INSTANCE = new Confirm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirm);
        }

        public final int hashCode() {
            return 1574367925;
        }

        public final String toString() {
            return "Confirm";
        }
    }
}
