package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes.dex */
public enum EllipticCurveType implements Internal.EnumLite {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);

    public final int value;

    EllipticCurveType(int i) {
        this.value = i;
    }
}
