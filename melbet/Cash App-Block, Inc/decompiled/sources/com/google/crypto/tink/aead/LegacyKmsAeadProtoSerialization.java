package com.google.crypto.tink.aead;

import com.google.crypto.tink.aead.LegacyKmsAeadParameters;
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
public abstract class LegacyKmsAeadProtoSerialization {
    public static final KeyParser$1 KEY_PARSER;
    public static final KeySerializer$1 KEY_SERIALIZER;
    public static final ParametersParser$1 PARAMETERS_PARSER;
    public static final ParametersSerializer$1 PARAMETERS_SERIALIZER;

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        PARAMETERS_SERIALIZER = new ParametersSerializer$1(LegacyKmsAeadParameters.class, new XAesGcmKey$$ExternalSyntheticBUOutline0(8));
        PARAMETERS_PARSER = new ParametersParser$1(bytesFromPrintableAscii, new XAesGcmKey$$ExternalSyntheticBUOutline0(9));
        KEY_SERIALIZER = new KeySerializer$1(LegacyKmsAeadKey.class, new XAesGcmKey$$ExternalSyntheticBUOutline0(10));
        KEY_PARSER = new KeyParser$1(bytesFromPrintableAscii, new XAesGcmKey$$ExternalSyntheticBUOutline0(11));
    }

    public static OutputPrefixType toProtoOutputPrefixType(LegacyKmsAeadParameters.Variant variant) {
        if (LegacyKmsAeadParameters.Variant.TINK == variant) {
            return OutputPrefixType.TINK;
        }
        if (LegacyKmsAeadParameters.Variant.NO_PREFIX == variant) {
            return OutputPrefixType.RAW;
        }
        MacWrapper$$ExternalSyntheticLambda0.m(variant, "Unable to serialize variant: ");
        return null;
    }

    public static LegacyKmsAeadParameters.Variant toVariant(OutputPrefixType outputPrefixType) {
        int ordinal = outputPrefixType.ordinal();
        if (ordinal == 1) {
            return LegacyKmsAeadParameters.Variant.TINK;
        }
        if (ordinal == 3) {
            return LegacyKmsAeadParameters.Variant.NO_PREFIX;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }
}
