package com.google.crypto.tink.proto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes.dex */
public enum HashType implements Internal.EnumLite {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    public final int value;

    HashType(int i) {
        this.value = i;
    }

    public static HashType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i == 4) {
            return SHA512;
        }
        if (i != 5) {
            return null;
        }
        return SHA224;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        return 0;
    }
}
