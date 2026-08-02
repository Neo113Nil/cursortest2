package com.squareup.cash.biometrics;

/* loaded from: classes7.dex */
public abstract class SecureStore$WriteResult {

    public final class Failure extends SecureStore$WriteResult {
        public final Exception cause;

        public Failure(Exception exc) {
            this.cause = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && this.cause.equals(((Failure) obj).cause);
        }

        public final int hashCode() {
            return this.cause.hashCode();
        }

        public final String toString() {
            return "Failure(cause=" + this.cause + ")";
        }
    }

    public final class SecureStoreUnavailable extends SecureStore$WriteResult {
        public static final SecureStoreUnavailable INSTANCE = new SecureStoreUnavailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SecureStoreUnavailable);
        }

        public final int hashCode() {
            return -119882211;
        }

        public final String toString() {
            return "SecureStoreUnavailable";
        }
    }

    public final class Success extends SecureStore$WriteResult {
        public static final Success INSTANCE = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return -1710169844;
        }

        public final String toString() {
            return "Success";
        }
    }
}
