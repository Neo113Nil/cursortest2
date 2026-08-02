package com.google.crypto.tink.daead.internal;

import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.OutputPrefixUtil;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;

/* loaded from: classes4.dex */
public final class LegacyFullDeterministicAead implements DeterministicAead {
    public static LegacyFullDeterministicAead create(LegacyProtoKey legacyProtoKey) {
        ProtoKeySerialization protoKeySerialization = legacyProtoKey.serialization;
        LegacyProtoKey.throwIfMissingAccess(protoKeySerialization);
        OutputPrefixType outputPrefixType = protoKeySerialization.outputPrefixType;
        int ordinal = outputPrefixType.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    OutputPrefixUtil.EMPTY_PREFIX.toByteArray();
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type " + outputPrefixType.getNumber());
                }
            }
            OutputPrefixUtil.getLegacyOutputPrefix(protoKeySerialization.idRequirement.intValue()).toByteArray();
        } else {
            OutputPrefixUtil.getTinkOutputPrefix(protoKeySerialization.idRequirement.intValue()).toByteArray();
        }
        return new LegacyFullDeterministicAead();
    }
}
