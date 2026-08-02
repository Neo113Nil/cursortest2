package com.squareup.cash.keystore;

/* loaded from: classes6.dex */
public enum AttestedKeyMetrics$ErrorType {
    GENERATE_KEY("generateAttestedKey"),
    GENERATE_KEY_CALLER_TIMEOUT("generateAttestedKeyCallerTimeout"),
    KEYSTORE_FETCH("keyStoreFetch"),
    KEYSTORE_LOAD("keyStoreLoad"),
    ERASE_KEY("eraseAttestedKey"),
    SIGN("signWithAttestedKey"),
    UNUSABLE_KEY("unusableKey");

    public final String dataDogIdentifier;

    AttestedKeyMetrics$ErrorType(String str) {
        this.dataDogIdentifier = str;
    }

    public final String getDataDogIdentifier() {
        return this.dataDogIdentifier;
    }
}
