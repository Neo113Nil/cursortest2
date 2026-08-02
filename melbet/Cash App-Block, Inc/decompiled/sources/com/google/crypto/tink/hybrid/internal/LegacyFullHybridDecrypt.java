package com.google.crypto.tink.hybrid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.HybridDecrypt;
import com.google.crypto.tink.internal.KeyManagerRegistry;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.OutputPrefixUtil;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class LegacyFullHybridDecrypt implements HybridDecrypt {
    public final byte[] outputPrefix;
    public final HybridDecrypt rawHybridDecrypt;

    public LegacyFullHybridDecrypt(HybridDecrypt hybridDecrypt, byte[] bArr) {
        this.rawHybridDecrypt = hybridDecrypt;
        this.outputPrefix = bArr;
    }

    public static LegacyFullHybridDecrypt create(LegacyProtoKey legacyProtoKey) {
        byte[] byteArray;
        ProtoKeySerialization protoKeySerialization = legacyProtoKey.serialization;
        LegacyProtoKey.throwIfMissingAccess(protoKeySerialization);
        HybridDecrypt hybridDecrypt = (HybridDecrypt) KeyManagerRegistry.GLOBAL_INSTANCE.getKeyManager(HybridDecrypt.class, protoKeySerialization.typeUrl).getPrimitive(protoKeySerialization.value);
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
        return new LegacyFullHybridDecrypt(hybridDecrypt, byteArray);
    }

    @Override // com.google.crypto.tink.HybridDecrypt
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.outputPrefix;
        int length = bArr3.length;
        HybridDecrypt hybridDecrypt = this.rawHybridDecrypt;
        if (length == 0) {
            return hybridDecrypt.decrypt(bArr, bArr2);
        }
        if (Util.isPrefix(bArr3, bArr)) {
            return hybridDecrypt.decrypt(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
        }
        a$$ExternalSyntheticBUOutline0.m$6("Invalid ciphertext (output prefix mismatch)");
        return null;
    }
}
