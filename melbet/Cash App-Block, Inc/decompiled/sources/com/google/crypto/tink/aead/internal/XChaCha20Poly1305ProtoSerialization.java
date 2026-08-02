package com.google.crypto.tink.aead.internal;

import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.aead.XChaCha20Poly1305Key;
import com.google.crypto.tink.aead.XChaCha20Poly1305Parameters;
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
public abstract class XChaCha20Poly1305ProtoSerialization {
    public static final KeyParser$1 KEY_PARSER;
    public static final KeySerializer$1 KEY_SERIALIZER;
    public static final ParametersParser$1 PARAMETERS_PARSER;
    public static final ParametersSerializer$1 PARAMETERS_SERIALIZER;

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        PARAMETERS_SERIALIZER = new ParametersSerializer$1(XChaCha20Poly1305Parameters.class, new AesSivKeyManager$$ExternalSyntheticLambda0(13));
        PARAMETERS_PARSER = new ParametersParser$1(bytesFromPrintableAscii, new AesSivKeyManager$$ExternalSyntheticLambda0(14));
        KEY_SERIALIZER = new KeySerializer$1(XChaCha20Poly1305Key.class, new AesSivKeyManager$$ExternalSyntheticLambda0(15));
        KEY_PARSER = new KeyParser$1(bytesFromPrintableAscii, new AesSivKeyManager$$ExternalSyntheticLambda0(16));
    }

    public static OutputPrefixType toProtoOutputPrefixType(AesEaxParameters.Variant variant) {
        if (AesEaxParameters.Variant.TINK$6 == variant) {
            return OutputPrefixType.TINK;
        }
        if (AesEaxParameters.Variant.CRUNCHY$5 == variant) {
            return OutputPrefixType.CRUNCHY;
        }
        if (AesEaxParameters.Variant.NO_PREFIX$6 == variant) {
            return OutputPrefixType.RAW;
        }
        MacWrapper$$ExternalSyntheticLambda0.m(variant, "Unable to serialize variant: ");
        return null;
    }

    public static AesEaxParameters.Variant toVariant(OutputPrefixType outputPrefixType) {
        int ordinal = outputPrefixType.ordinal();
        if (ordinal == 1) {
            return AesEaxParameters.Variant.TINK$6;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return AesEaxParameters.Variant.NO_PREFIX$6;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
            }
        }
        return AesEaxParameters.Variant.CRUNCHY$5;
    }
}
