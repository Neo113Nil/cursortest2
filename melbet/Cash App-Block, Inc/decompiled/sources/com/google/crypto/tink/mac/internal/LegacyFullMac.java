package com.google.crypto.tink.mac.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.Mac;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.OutputPrefixUtil;
import com.google.crypto.tink.internal.ProtoKeySerialization;

/* loaded from: classes4.dex */
public final class LegacyFullMac implements Mac {
    public static LegacyFullMac create(LegacyProtoKey legacyProtoKey) {
        ProtoKeySerialization protoKeySerialization = legacyProtoKey.serialization;
        LegacyProtoKey.throwIfMissingAccess(protoKeySerialization);
        int ordinal = protoKeySerialization.outputPrefixType.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    OutputPrefixUtil.EMPTY_PREFIX.toByteArray();
                } else if (ordinal != 4) {
                    a$$ExternalSyntheticBUOutline0.m$6("unknown output prefix type");
                    return null;
                }
            }
            OutputPrefixUtil.getLegacyOutputPrefix(protoKeySerialization.idRequirement.intValue()).toByteArray();
        } else {
            OutputPrefixUtil.getTinkOutputPrefix(protoKeySerialization.idRequirement.intValue()).toByteArray();
        }
        return new LegacyFullMac();
    }
}
