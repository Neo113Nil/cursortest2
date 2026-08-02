package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes.dex */
public enum HpkeKem implements Internal.EnumLite {
    KEM_UNKNOWN(0),
    DHKEM_X25519_HKDF_SHA256(1),
    DHKEM_P256_HKDF_SHA256(2),
    DHKEM_P384_HKDF_SHA384(3),
    DHKEM_P521_HKDF_SHA512(4),
    X_WING(5),
    ML_KEM768(6),
    ML_KEM1024(7),
    UNRECOGNIZED(-1);

    public final int value;

    HpkeKem(int i) {
        this.value = i;
    }
}
