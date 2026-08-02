package com.nimbusds.jose.jwk;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class KeyType implements Serializable {
    public final String value;
    public static final KeyType EC = new KeyType("EC");
    public static final KeyType RSA = new KeyType("RSA");
    public static final KeyType OCT = new KeyType("oct");
    public static final KeyType OKP = new KeyType("OKP");

    public KeyType(String str) {
        if (str != null) {
            this.value = str;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("The key type value must not be null");
            throw null;
        }
    }

    public static KeyType parse(String str) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$3("The key type to parse must not be null");
            return null;
        }
        KeyType keyType = EC;
        if (str.equals(keyType.value)) {
            return keyType;
        }
        KeyType keyType2 = RSA;
        if (str.equals(keyType2.value)) {
            return keyType2;
        }
        KeyType keyType3 = OCT;
        if (str.equals(keyType3.value)) {
            return keyType3;
        }
        KeyType keyType4 = OKP;
        return str.equals(keyType4.value) ? keyType4 : new KeyType(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof KeyType) {
            return this.value.equals(((KeyType) obj).value);
        }
        return false;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return this.value;
    }
}
