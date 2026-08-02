package com.squareup.cash.data.contacts;

/* loaded from: classes6.dex */
public interface ContactSync$ResetReason {

    public final class PermissionDenied implements ContactSync$ResetReason {
        public static final PermissionDenied INSTANCE = new PermissionDenied();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PermissionDenied);
        }

        public final int hashCode() {
            return 773009377;
        }

        public final String toString() {
            return "PermissionDenied";
        }
    }

    public final class SignOut implements ContactSync$ResetReason {
        public static final SignOut INSTANCE = new SignOut();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SignOut);
        }

        public final int hashCode() {
            return 653055194;
        }

        public final String toString() {
            return "SignOut";
        }
    }
}
