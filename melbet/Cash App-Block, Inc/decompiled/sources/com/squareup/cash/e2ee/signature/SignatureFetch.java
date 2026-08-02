package com.squareup.cash.e2ee.signature;

import com.squareup.cash.e2ee.signature.validator.SignatureValidityCheck$Invalid;

/* loaded from: classes6.dex */
public interface SignatureFetch {

    public final class Failure implements SignatureFetch {
        public final SignatureValidityCheck$Invalid reason;

        public Failure(SignatureValidityCheck$Invalid signatureValidityCheck$Invalid) {
            this.reason = signatureValidityCheck$Invalid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && this.reason.equals(((Failure) obj).reason);
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final String toString() {
            return "Failure(reason=" + this.reason + ")";
        }
    }

    public final class Success implements SignatureFetch {
        public final Signature signature;

        public Success(Signature signature) {
            this.signature = signature;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.signature.equals(((Success) obj).signature);
        }

        public final int hashCode() {
            return this.signature.hashCode();
        }

        public final String toString() {
            return "Success(signature=" + this.signature + ")";
        }
    }
}
