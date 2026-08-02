package com.squareup.cash.e2ee.signature.validator;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public abstract class SignatureValidityCheck$Invalid {

    public final class InvalidCerts extends SignatureValidityCheck$Invalid {
        public final Throwable exception;

        public InvalidCerts(Throwable th) {
            this.exception = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidCerts) && this.exception.equals(((InvalidCerts) obj).exception);
        }

        public final int hashCode() {
            return this.exception.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("InvalidCerts(exception=", ")", this.exception);
        }
    }

    public final class InvalidKey extends SignatureValidityCheck$Invalid {
        public static final InvalidKey INSTANCE = new InvalidKey();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InvalidKey);
        }

        public final int hashCode() {
            return -1730689554;
        }

        public final String toString() {
            return "InvalidKey";
        }
    }

    public final class NoSignature extends SignatureValidityCheck$Invalid {
        public static final NoSignature INSTANCE = new NoSignature();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoSignature);
        }

        public final int hashCode() {
            return 1484901297;
        }

        public final String toString() {
            return "NoSignature";
        }
    }
}
