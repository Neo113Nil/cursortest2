package com.google.crypto.tink.proto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes.dex */
public enum OutputPrefixType implements Internal.EnumLite {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    WITH_ID_REQUIREMENT(5),
    UNRECOGNIZED(-1);

    public final int value;

    OutputPrefixType(int i) {
        this.value = i;
    }

    public static OutputPrefixType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i == 4) {
            return CRUNCHY;
        }
        if (i != 5) {
            return null;
        }
        return WITH_ID_REQUIREMENT;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        return 0;
    }
}
