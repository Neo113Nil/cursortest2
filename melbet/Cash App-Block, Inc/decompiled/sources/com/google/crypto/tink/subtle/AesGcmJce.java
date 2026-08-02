package com.google.crypto.tink.subtle;

import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.aead.AesGcmKey;
import com.google.crypto.tink.aead.AesGcmParameters;
import com.google.crypto.tink.aead.ChaCha20Poly1305Key;
import com.google.crypto.tink.aead.XAesGcmKey;
import com.google.crypto.tink.aead.XChaCha20Poly1305Key;
import com.google.crypto.tink.aead.internal.AesGcmJceUtil;
import com.google.crypto.tink.aead.internal.ChaCha20Poly1305Jce;
import com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.OutputPrefixUtil;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.crypto.tink.prf.AesCmacPrfKey;
import com.google.crypto.tink.prf.AesCmacPrfParameters;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.squareup.cash.db.WireAdapter;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes4.dex */
public final class AesGcmJce implements Aead {
    public static AesGcmJce create(LegacyProtoKey legacyProtoKey) {
        byte[] byteArray;
        ProtoKeySerialization protoKeySerialization = legacyProtoKey.serialization;
        LegacyProtoKey.throwIfMissingAccess(protoKeySerialization);
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
        AesGcmJce aesGcmJce = new AesGcmJce();
        if (byteArray.length == 0 || byteArray.length == 5) {
            return aesGcmJce;
        }
        a$$ExternalSyntheticBUOutline0.m$3("identifier has an invalid length");
        throw null;
    }

    public static boolean isSupported() {
        return ChaCha20Poly1305Jce.isSupported();
    }

    public static AesGcmJce create(XChaCha20Poly1305Key xChaCha20Poly1305Key) {
        Cipher validCipherInstance = ChaCha20Poly1305Jce.getValidCipherInstance();
        byte[] byteArray = ((com.google.crypto.tink.util.Bytes) xChaCha20Poly1305Key.keyBytes.adapter).toByteArray();
        xChaCha20Poly1305Key.outputPrefix.toByteArray();
        validCipherInstance.getProvider();
        AesGcmJce aesGcmJce = new AesGcmJce();
        if (re$$ExternalSyntheticOutline0._isCompatible(1)) {
            if (byteArray.length == 32) {
                return aesGcmJce;
            }
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("The key length in bytes must be 32.");
            throw null;
        }
        a$$ExternalSyntheticBUOutline0.m$6("Can not use ChaCha20Poly1305 in FIPS-mode.");
        throw null;
    }

    public static AesGcmJce create(XAesGcmKey xAesGcmKey) {
        int i = xAesGcmKey.parameters.saltSizeBytes;
        if (i >= 8 && i <= 12) {
            byte[] byteArray = ((com.google.crypto.tink.util.Bytes) xAesGcmKey.keyBytes.adapter).toByteArray();
            com.google.crypto.tink.util.Bytes bytes = xAesGcmKey.outputPrefix;
            int i2 = xAesGcmKey.parameters.saltSizeBytes;
            AesGcmJce aesGcmJce = new AesGcmJce();
            PrfAesCmac.create(AesCmacPrfKey.create(AesCmacPrfParameters.create(byteArray.length), new WireAdapter(com.google.crypto.tink.util.Bytes.copyFrom(byteArray))));
            bytes.toByteArray();
            return aesGcmJce;
        }
        a$$ExternalSyntheticBUOutline0.m$6("invalid salt size");
        return null;
    }

    public static AesGcmJce create(AesGcmKey aesGcmKey) {
        AesGcmParameters aesGcmParameters = aesGcmKey.parameters;
        if (aesGcmParameters.ivSizeBytes == 12) {
            if (aesGcmParameters.tagSizeBytes == 16) {
                byte[] byteArray = ((com.google.crypto.tink.util.Bytes) aesGcmKey.keyBytes.adapter).toByteArray();
                com.google.crypto.tink.util.Bytes bytes = aesGcmKey.outputPrefix;
                AesGcmJce aesGcmJce = new AesGcmJce();
                if (re$$ExternalSyntheticOutline0._isCompatible$1(2)) {
                    AesGcmJceUtil.getSecretKey(byteArray);
                    bytes.toByteArray();
                    return aesGcmJce;
                }
                a$$ExternalSyntheticBUOutline0.m$6("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
                throw null;
            }
            throw new GeneralSecurityException("Expected tag Size 16, got " + aesGcmParameters.tagSizeBytes);
        }
        throw new GeneralSecurityException("Expected IV Size 12, got " + aesGcmParameters.ivSizeBytes);
    }

    public static AesGcmJce create(ChaCha20Poly1305Key chaCha20Poly1305Key) {
        byte[] byteArray = ((com.google.crypto.tink.util.Bytes) chaCha20Poly1305Key.keyBytes.adapter).toByteArray();
        chaCha20Poly1305Key.outputPrefix.toByteArray();
        AesGcmJce aesGcmJce = new AesGcmJce();
        new InsecureNonceChaCha20Poly1305(byteArray, 0);
        return aesGcmJce;
    }
}
