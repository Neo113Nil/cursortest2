package com.squareup.cash.e2ee.signature.validator;

import com.squareup.cash.e2ee.signature.Signature;

/* loaded from: classes6.dex */
public final class SignatureValidityCheck$Valid {
    public final Signature signature;

    public SignatureValidityCheck$Valid(Signature signature) {
        this.signature = signature;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SignatureValidityCheck$Valid) && this.signature.equals(((SignatureValidityCheck$Valid) obj).signature);
    }

    public final int hashCode() {
        return this.signature.hashCode();
    }

    public final String toString() {
        return "Valid(signature=" + this.signature + ")";
    }
}
