package com.google.crypto.tink.hybrid.internal;

import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.internal.KeyManagerRegistry;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.OutputPrefixUtil;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Bytes;

/* loaded from: classes4.dex */
public final class LegacyFullHybridEncrypt implements HybridEncrypt {
    public final byte[] outputPrefix;
    public final HybridEncrypt rawHybridEncrypt;

    public LegacyFullHybridEncrypt(HybridEncrypt hybridEncrypt, byte[] bArr) {
        this.rawHybridEncrypt = hybridEncrypt;
        this.outputPrefix = bArr;
    }

    public static LegacyFullHybridEncrypt create(LegacyProtoKey legacyProtoKey) {
        byte[] byteArray;
        ProtoKeySerialization protoKeySerialization = legacyProtoKey.serialization;
        LegacyProtoKey.throwIfMissingAccess(protoKeySerialization);
        HybridEncrypt hybridEncrypt = (HybridEncrypt) KeyManagerRegistry.GLOBAL_INSTANCE.getKeyManager(HybridEncrypt.class, protoKeySerialization.typeUrl).getPrimitive(protoKeySerialization.value);
        OutputPrefixType outputPrefixType = protoKeySerialization.outputPrefixType;
        int ordinal = outputPrefixType.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    byteArray = OutputPrefixUtil.EMPTY_PREFIX.toByteArray();
                } else if (ordinal != 4) {
                    MacWrapper$$ExternalSyntheticLambda0.m(outputPrefixType, "unknown output prefix type ");
                    return null;
                }
            }
            byteArray = OutputPrefixUtil.getLegacyOutputPrefix(protoKeySerialization.idRequirement.intValue()).toByteArray();
        } else {
            byteArray = OutputPrefixUtil.getTinkOutputPrefix(protoKeySerialization.idRequirement.intValue()).toByteArray();
        }
        return new LegacyFullHybridEncrypt(hybridEncrypt, byteArray);
    }

    @Override // com.google.crypto.tink.HybridEncrypt
    public final byte[] encrypt(byte[] bArr) {
        byte[] bArr2 = this.outputPrefix;
        int length = bArr2.length;
        HybridEncrypt hybridEncrypt = this.rawHybridEncrypt;
        return length == 0 ? hybridEncrypt.encrypt(bArr) : Bytes.concat(bArr2, hybridEncrypt.encrypt(bArr));
    }
}
