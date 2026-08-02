package com.google.crypto.tink.aead.internal;

import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.aead.AesGcmSivKey;
import com.google.crypto.tink.aead.AesGcmSivParameters;
import com.google.crypto.tink.daead.AesSivKeyManager$$ExternalSyntheticLambda0;
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
public abstract class AesGcmSivProtoSerialization {
    public static final KeyParser$1 KEY_PARSER;
    public static final KeySerializer$1 KEY_SERIALIZER;
    public static final ParametersParser$1 PARAMETERS_PARSER;
    public static final ParametersSerializer$1 PARAMETERS_SERIALIZER;

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        PARAMETERS_SERIALIZER = new ParametersSerializer$1(AesGcmSivParameters.class, new AesSivKeyManager$$ExternalSyntheticLambda0(1));
        PARAMETERS_PARSER = new ParametersParser$1(bytesFromPrintableAscii, new AesSivKeyManager$$ExternalSyntheticLambda0(2));
        KEY_SERIALIZER = new KeySerializer$1(AesGcmSivKey.class, new AesSivKeyManager$$ExternalSyntheticLambda0(3));
        KEY_PARSER = new KeyParser$1(bytesFromPrintableAscii, new AesSivKeyManager$$ExternalSyntheticLambda0(4));
    }

    public static OutputPrefixType toProtoOutputPrefixType(AesEaxParameters.Variant variant) {
        if (AesEaxParameters.Variant.TINK$3 == variant) {
            return OutputPrefixType.TINK;
        }
        if (AesEaxParameters.Variant.CRUNCHY$3 == variant) {
            return OutputPrefixType.CRUNCHY;
        }
        if (AesEaxParameters.Variant.NO_PREFIX$3 == variant) {
            return OutputPrefixType.RAW;
        }
        MacWrapper$$ExternalSyntheticLambda0.m(variant, "Unable to serialize variant: ");
        return null;
    }

    public static AesEaxParameters.Variant toVariant(OutputPrefixType outputPrefixType) {
        int ordinal = outputPrefixType.ordinal();
        if (ordinal == 1) {
            return AesEaxParameters.Variant.TINK$3;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return AesEaxParameters.Variant.NO_PREFIX$3;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
            }
        }
        return AesEaxParameters.Variant.CRUNCHY$3;
    }
}
