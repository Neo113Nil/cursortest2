package com.squareup.cash.passkeys.backend;

/* loaded from: classes6.dex */
public interface PasskeyRepository$DeregisterPasskeyResult {

    public final class Error implements PasskeyRepository$DeregisterPasskeyResult {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -263106438;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Success implements PasskeyRepository$DeregisterPasskeyResult {
        public static final Success INSTANCE = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return 169601525;
        }

        public final String toString() {
            return "Success";
        }
    }
}
