package com.squareup.cash.account.backend;

/* loaded from: classes5.dex */
public interface AccountSwitcher$Result {

    public final class Failure implements AccountSwitcher$Result {
        public static final Failure INSTANCE = new Failure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public final int hashCode() {
            return 960456454;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public final class Success implements AccountSwitcher$Result {
        public static final Success INSTANCE = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return 179860863;
        }

        public final String toString() {
            return "Success";
        }
    }
}
