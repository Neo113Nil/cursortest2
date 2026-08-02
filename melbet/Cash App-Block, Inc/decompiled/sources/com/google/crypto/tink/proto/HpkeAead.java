package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes.dex */
public enum HpkeAead implements Internal.EnumLite {
    AEAD_UNKNOWN(0),
    AES_128_GCM(1),
    AES_256_GCM(2),
    CHACHA20_POLY1305(3),
    UNRECOGNIZED(-1);

    public final int value;

    HpkeAead(int i) {
        this.value = i;
    }
}
