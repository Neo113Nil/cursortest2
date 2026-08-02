package com.google.crypto.tink.aead.internal;

import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.aead.XAesGcmKey;
import com.google.crypto.tink.aead.XAesGcmParameters;
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
public abstract class XAesGcmProtoSerialization {
    public static final KeyParser$1 KEY_PARSER;
    public static final KeySerializer$1 KEY_SERIALIZER;
    public static final ParametersParser$1 PARAMETERS_PARSER;
    public static final ParametersSerializer$1 PARAMETERS_SERIALIZER;

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        PARAMETERS_SERIALIZER = new ParametersSerializer$1(XAesGcmParameters.class, new AesSivKeyManager$$ExternalSyntheticLambda0(9));
        PARAMETERS_PARSER = new ParametersParser$1(bytesFromPrintableAscii, new AesSivKeyManager$$ExternalSyntheticLambda0(10));
        KEY_SERIALIZER = new KeySerializer$1(XAesGcmKey.class, new AesSivKeyManager$$ExternalSyntheticLambda0(11));
        KEY_PARSER = new KeyParser$1(bytesFromPrintableAscii, new AesSivKeyManager$$ExternalSyntheticLambda0(12));
    }

    public static OutputPrefixType toProtoOutputPrefixType(AesEaxParameters.Variant variant) {
        if (variant == AesEaxParameters.Variant.TINK$5) {
            return OutputPrefixType.TINK;
        }
        if (variant == AesEaxParameters.Variant.NO_PREFIX$5) {
            return OutputPrefixType.RAW;
        }
        MacWrapper$$ExternalSyntheticLambda0.m(variant, "Unable to serialize variant: ");
        return null;
    }

    public static AesEaxParameters.Variant toVariant(OutputPrefixType outputPrefixType) {
        int ordinal = outputPrefixType.ordinal();
        if (ordinal == 1) {
            return AesEaxParameters.Variant.TINK$5;
        }
        if (ordinal == 3) {
            return AesEaxParameters.Variant.NO_PREFIX$5;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }
}
