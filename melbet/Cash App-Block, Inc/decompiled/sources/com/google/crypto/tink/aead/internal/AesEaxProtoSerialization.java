package com.google.crypto.tink.aead.internal;

import com.google.crypto.tink.aead.AesEaxKey;
import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.aead.XAesGcmKey$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.internal.KeyParser$1;
import com.google.crypto.tink.internal.KeySerializer$1;
import com.google.crypto.tink.internal.ParametersParser$1;
import com.google.crypto.tink.internal.ParametersSerializer$1;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.crypto.tink.proto.AesEaxParams;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.util.Bytes;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class AesEaxProtoSerialization {
    public static final KeyParser$1 KEY_PARSER;
    public static final KeySerializer$1 KEY_SERIALIZER;
    public static final ParametersParser$1 PARAMETERS_PARSER;
    public static final ParametersSerializer$1 PARAMETERS_SERIALIZER;

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.AesEaxKey");
        PARAMETERS_SERIALIZER = new ParametersSerializer$1(AesEaxParameters.class, new XAesGcmKey$$ExternalSyntheticBUOutline0(22));
        PARAMETERS_PARSER = new ParametersParser$1(bytesFromPrintableAscii, new XAesGcmKey$$ExternalSyntheticBUOutline0(23));
        KEY_SERIALIZER = new KeySerializer$1(AesEaxKey.class, new XAesGcmKey$$ExternalSyntheticBUOutline0(24));
        KEY_PARSER = new KeyParser$1(bytesFromPrintableAscii, new XAesGcmKey$$ExternalSyntheticBUOutline0(25));
    }

    public static AesEaxParams getProtoParams(AesEaxParameters aesEaxParameters) {
        if (aesEaxParameters.tagSizeBytes != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(aesEaxParameters.tagSizeBytes)));
        }
        AesEaxParams.Builder newBuilder = AesEaxParams.newBuilder();
        newBuilder.setIvSize$1(aesEaxParameters.ivSizeBytes);
        return (AesEaxParams) newBuilder.build();
    }

    public static OutputPrefixType toProtoOutputPrefixType(AesEaxParameters.Variant variant) {
        if (AesEaxParameters.Variant.TINK == variant) {
            return OutputPrefixType.TINK;
        }
        if (AesEaxParameters.Variant.CRUNCHY == variant) {
            return OutputPrefixType.CRUNCHY;
        }
        if (AesEaxParameters.Variant.NO_PREFIX == variant) {
            return OutputPrefixType.RAW;
        }
        MacWrapper$$ExternalSyntheticLambda0.m(variant, "Unable to serialize variant: ");
        return null;
    }

    public static AesEaxParameters.Variant toVariant(OutputPrefixType outputPrefixType) {
        int ordinal = outputPrefixType.ordinal();
        if (ordinal == 1) {
            return AesEaxParameters.Variant.TINK;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return AesEaxParameters.Variant.NO_PREFIX;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
            }
        }
        return AesEaxParameters.Variant.CRUNCHY;
    }
}
