package com.squareup.cash.keystore;

/* loaded from: classes6.dex */
public enum AttestedKeyMetrics$ActionType {
    GENERATE_KEY("generateAttestedKey"),
    KEYSTORE_FETCH("keyStoreFetch"),
    ERASE_KEY("eraseAttestedKey"),
    SIGN("signWithAttestedKey");

    public final String dataDogIdentifier;

    AttestedKeyMetrics$ActionType(String str) {
        this.dataDogIdentifier = str;
    }

    public final String getDataDogIdentifier() {
        return this.dataDogIdentifier;
    }
}
