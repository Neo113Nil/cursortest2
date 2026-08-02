package com.google.crypto.tink.mac.internal;

import com.google.crypto.tink.internal.KeyParser$1;
import com.google.crypto.tink.internal.KeySerializer$1;
import com.google.crypto.tink.internal.ParametersParser$1;
import com.google.crypto.tink.internal.ParametersSerializer$1;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.mac.AesCmacKey;
import com.google.crypto.tink.mac.AesCmacParameters;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.util.Bytes;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class AesCmacProtoSerialization {
    public static final KeyParser$1 KEY_PARSER;
    public static final KeySerializer$1 KEY_SERIALIZER;
    public static final ParametersParser$1 PARAMETERS_PARSER;
    public static final ParametersSerializer$1 PARAMETERS_SERIALIZER;

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.AesCmacKey");
        PARAMETERS_SERIALIZER = new ParametersSerializer$1(AesCmacParameters.class, new MacWrapper$$ExternalSyntheticLambda0(18));
        PARAMETERS_PARSER = new ParametersParser$1(bytesFromPrintableAscii, new MacWrapper$$ExternalSyntheticLambda0(19));
        KEY_SERIALIZER = new KeySerializer$1(AesCmacKey.class, new MacWrapper$$ExternalSyntheticLambda0(20));
        KEY_PARSER = new KeyParser$1(bytesFromPrintableAscii, new MacWrapper$$ExternalSyntheticLambda0(21));
    }

    public static OutputPrefixType toOutputPrefixType(AesCmacParameters.Variant variant) {
        if (AesCmacParameters.Variant.TINK == variant) {
            return OutputPrefixType.TINK;
        }
        if (AesCmacParameters.Variant.CRUNCHY == variant) {
            return OutputPrefixType.CRUNCHY;
        }
        if (AesCmacParameters.Variant.NO_PREFIX == variant) {
            return OutputPrefixType.RAW;
        }
        if (AesCmacParameters.Variant.LEGACY == variant) {
            return OutputPrefixType.LEGACY;
        }
        MacWrapper$$ExternalSyntheticLambda0.m(variant, "Unable to serialize variant: ");
        return null;
    }

    public static AesCmacParameters.Variant toVariant(OutputPrefixType outputPrefixType) {
        int ordinal = outputPrefixType.ordinal();
        if (ordinal == 1) {
            return AesCmacParameters.Variant.TINK;
        }
        if (ordinal == 2) {
            return AesCmacParameters.Variant.LEGACY;
        }
        if (ordinal == 3) {
            return AesCmacParameters.Variant.NO_PREFIX;
        }
        if (ordinal == 4) {
            return AesCmacParameters.Variant.CRUNCHY;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }
}
