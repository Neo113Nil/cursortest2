package com.google.crypto.tink.aead.internal;

import com.google.crypto.tink.aead.AesCtrHmacAeadKey;
import com.google.crypto.tink.aead.AesCtrHmacAeadParameters;
import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.aead.XAesGcmKey$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.internal.KeyParser$1;
import com.google.crypto.tink.internal.KeySerializer$1;
import com.google.crypto.tink.internal.ParametersParser$1;
import com.google.crypto.tink.internal.ParametersSerializer$1;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HmacParams;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.util.Bytes;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class AesCtrHmacAeadProtoSerialization {
    public static final KeyParser$1 KEY_PARSER;
    public static final KeySerializer$1 KEY_SERIALIZER;
    public static final ParametersParser$1 PARAMETERS_PARSER;
    public static final ParametersSerializer$1 PARAMETERS_SERIALIZER;

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        PARAMETERS_SERIALIZER = new ParametersSerializer$1(AesCtrHmacAeadParameters.class, new XAesGcmKey$$ExternalSyntheticBUOutline0(18));
        PARAMETERS_PARSER = new ParametersParser$1(bytesFromPrintableAscii, new XAesGcmKey$$ExternalSyntheticBUOutline0(19));
        KEY_SERIALIZER = new KeySerializer$1(AesCtrHmacAeadKey.class, new XAesGcmKey$$ExternalSyntheticBUOutline0(20));
        KEY_PARSER = new KeyParser$1(bytesFromPrintableAscii, new XAesGcmKey$$ExternalSyntheticBUOutline0(21));
    }

    public static HmacParams getHmacProtoParams(AesCtrHmacAeadParameters aesCtrHmacAeadParameters) {
        HashType hashType;
        HmacParams.Builder newBuilder = HmacParams.newBuilder();
        newBuilder.setTagSize$1(aesCtrHmacAeadParameters.tagSizeBytes);
        AesEaxParameters.Variant variant = aesCtrHmacAeadParameters.hashType;
        if (AesEaxParameters.Variant.SHA1 == variant) {
            hashType = HashType.SHA1;
        } else if (AesEaxParameters.Variant.SHA224 == variant) {
            hashType = HashType.SHA224;
        } else if (AesEaxParameters.Variant.SHA256 == variant) {
            hashType = HashType.SHA256;
        } else if (AesEaxParameters.Variant.SHA384 == variant) {
            hashType = HashType.SHA384;
        } else {
            if (AesEaxParameters.Variant.SHA512 != variant) {
                MacWrapper$$ExternalSyntheticLambda0.m(variant, "Unable to serialize HashType ");
                return null;
            }
            hashType = HashType.SHA512;
        }
        newBuilder.setHash(hashType);
        return (HmacParams) newBuilder.build();
    }

    public static AesEaxParameters.Variant toHashType(HashType hashType) {
        int ordinal = hashType.ordinal();
        if (ordinal == 1) {
            return AesEaxParameters.Variant.SHA1;
        }
        if (ordinal == 2) {
            return AesEaxParameters.Variant.SHA384;
        }
        if (ordinal == 3) {
            return AesEaxParameters.Variant.SHA256;
        }
        if (ordinal == 4) {
            return AesEaxParameters.Variant.SHA512;
        }
        if (ordinal == 5) {
            return AesEaxParameters.Variant.SHA224;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + hashType.getNumber());
    }

    public static OutputPrefixType toProtoOutputPrefixType(AesEaxParameters.Variant variant) {
        if (AesEaxParameters.Variant.TINK$1 == variant) {
            return OutputPrefixType.TINK;
        }
        if (AesEaxParameters.Variant.CRUNCHY$1 == variant) {
            return OutputPrefixType.CRUNCHY;
        }
        if (AesEaxParameters.Variant.NO_PREFIX$1 == variant) {
            return OutputPrefixType.RAW;
        }
        MacWrapper$$ExternalSyntheticLambda0.m(variant, "Unable to serialize variant: ");
        return null;
    }

    public static AesEaxParameters.Variant toVariant(OutputPrefixType outputPrefixType) {
        int ordinal = outputPrefixType.ordinal();
        if (ordinal == 1) {
            return AesEaxParameters.Variant.TINK$1;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return AesEaxParameters.Variant.NO_PREFIX$1;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
            }
        }
        return AesEaxParameters.Variant.CRUNCHY$1;
    }
}
