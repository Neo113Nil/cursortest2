package com.nimbusds.jose.jwk;

/* loaded from: classes5.dex */
public enum KeyOperation {
    SIGN("sign"),
    VERIFY("verify"),
    ENCRYPT("encrypt"),
    DECRYPT("decrypt"),
    WRAP_KEY("wrapKey"),
    UNWRAP_KEY("unwrapKey"),
    /* JADX INFO: Fake field, exist only in values array */
    DERIVE_KEY("deriveKey"),
    /* JADX INFO: Fake field, exist only in values array */
    DERIVE_BITS("deriveBits");

    public final String identifier;

    KeyOperation(String str) {
        this.identifier = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.identifier;
    }
}
