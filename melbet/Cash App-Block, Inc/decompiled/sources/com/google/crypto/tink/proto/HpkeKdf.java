package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes.dex */
public enum HpkeKdf implements Internal.EnumLite {
    KDF_UNKNOWN(0),
    HKDF_SHA256(1),
    HKDF_SHA384(2),
    HKDF_SHA512(3),
    UNRECOGNIZED(-1);

    public final int value;

    HpkeKdf(int i) {
        this.value = i;
    }
}
