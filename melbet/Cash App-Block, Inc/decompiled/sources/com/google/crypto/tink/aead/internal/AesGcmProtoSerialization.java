package com.google.crypto.tink.aead.internal;

import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.aead.AesGcmKey;
import com.google.crypto.tink.aead.AesGcmParameters;
import com.google.crypto.tink.aead.XAesGcmKey$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.internal.KeyParser$1;
import com.google.crypto.tink.internal.KeySerializer$1;
import com.google.crypto.tink.internal.ParametersParser$1;
import com.google.crypto.tink.internal.ParametersSerializer$1;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.util.Bytes;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class AesGcmProtoSerialization {
    public static final KeyParser$1 KEY_PARSER;
    public static final KeySerializer$1 KEY_SERIALIZER;
    public static final ParametersParser$1 PARAMETERS_PARSER;
    public static final ParametersSerializer$1 PARAMETERS_SERIALIZER;

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.AesGcmKey");
        PARAMETERS_SERIALIZER = new ParametersSerializer$1(AesGcmParameters.class, new XAesGcmKey$$ExternalSyntheticBUOutline0(26));
        PARAMETERS_PARSER = new ParametersParser$1(bytesFromPrintableAscii, new XAesGcmKey$$ExternalSyntheticBUOutline0(27));
        KEY_SERIALIZER = new KeySerializer$1(AesGcmKey.class, new XAesGcmKey$$ExternalSyntheticBUOutline0(28));
        KEY_PARSER = new KeyParser$1(bytesFromPrintableAscii, new XAesGcmKey$$ExternalSyntheticBUOutline0(29));
    }

    public static OutputPrefixType toProtoOutputPrefixType(AesEaxParameters.Variant variant) {
        if (AesEaxParameters.Variant.TINK$2 == variant) {
            return OutputPrefixType.TINK;
        }
        if (AesEaxParameters.Variant.CRUNCHY$2 == variant) {
            return OutputPrefixType.CRUNCHY;
        }
        if (AesEaxParameters.Variant.NO_PREFIX$2 == variant) {
            return OutputPrefixType.RAW;
        }
        MacWrapper$$ExternalSyntheticLambda0.m(variant, "Unable to serialize variant: ");
        return null;
    }

    public static AesEaxParameters.Variant toVariant(OutputPrefixType outputPrefixType) {
        int ordinal = outputPrefixType.ordinal();
        if (ordinal == 1) {
            return AesEaxParameters.Variant.TINK$2;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return AesEaxParameters.Variant.NO_PREFIX$2;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
            }
        }
        return AesEaxParameters.Variant.CRUNCHY$2;
    }

    public static void validateParameters(AesGcmParameters aesGcmParameters) {
        int i = aesGcmParameters.tagSizeBytes;
        int i2 = aesGcmParameters.ivSizeBytes;
        if (i != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(aesGcmParameters.tagSizeBytes)));
        }
        if (i2 != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(i2)));
        }
    }
}
