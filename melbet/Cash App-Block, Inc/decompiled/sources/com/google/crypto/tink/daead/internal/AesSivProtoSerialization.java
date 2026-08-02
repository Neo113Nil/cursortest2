package com.google.crypto.tink.daead.internal;

import com.google.crypto.tink.daead.AesSivKey;
import com.google.crypto.tink.daead.AesSivKeyManager$$ExternalSyntheticLambda0;
import com.google.crypto.tink.daead.AesSivParameters;
import com.google.crypto.tink.internal.KeyParser$1;
import com.google.crypto.tink.internal.KeySerializer$1;
import com.google.crypto.tink.internal.ParametersParser$1;
import com.google.crypto.tink.internal.ParametersSerializer$1;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.util.Bytes;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class AesSivProtoSerialization {
    public static final KeyParser$1 KEY_PARSER;
    public static final KeySerializer$1 KEY_SERIALIZER;
    public static final ParametersParser$1 PARAMETERS_PARSER;
    public static final ParametersSerializer$1 PARAMETERS_SERIALIZER;
    public static final Map outputPrefixToVariantMap;
    public static final Map variantsToOutputPrefixMap;

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.AesSivKey");
        PARAMETERS_SERIALIZER = new ParametersSerializer$1(AesSivParameters.class, new AesSivKeyManager$$ExternalSyntheticLambda0(18));
        PARAMETERS_PARSER = new ParametersParser$1(bytesFromPrintableAscii, new AesSivKeyManager$$ExternalSyntheticLambda0(19));
        KEY_SERIALIZER = new KeySerializer$1(AesSivKey.class, new AesSivKeyManager$$ExternalSyntheticLambda0(20));
        KEY_PARSER = new KeyParser$1(bytesFromPrintableAscii, new AesSivKeyManager$$ExternalSyntheticLambda0(21));
        HashMap hashMap = new HashMap();
        AesSivParameters.Variant variant = AesSivParameters.Variant.NO_PREFIX;
        OutputPrefixType outputPrefixType = OutputPrefixType.RAW;
        hashMap.put(variant, outputPrefixType);
        AesSivParameters.Variant variant2 = AesSivParameters.Variant.TINK;
        OutputPrefixType outputPrefixType2 = OutputPrefixType.TINK;
        hashMap.put(variant2, outputPrefixType2);
        AesSivParameters.Variant variant3 = AesSivParameters.Variant.CRUNCHY;
        OutputPrefixType outputPrefixType3 = OutputPrefixType.CRUNCHY;
        hashMap.put(variant3, outputPrefixType3);
        variantsToOutputPrefixMap = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(OutputPrefixType.class);
        enumMap.put((EnumMap) outputPrefixType, (OutputPrefixType) variant);
        enumMap.put((EnumMap) outputPrefixType2, (OutputPrefixType) variant2);
        enumMap.put((EnumMap) outputPrefixType3, (OutputPrefixType) variant3);
        enumMap.put((EnumMap) OutputPrefixType.LEGACY, (OutputPrefixType) variant3);
        outputPrefixToVariantMap = Collections.unmodifiableMap(enumMap);
    }

    public static OutputPrefixType toProtoOutputPrefixType(AesSivParameters.Variant variant) {
        Map map = variantsToOutputPrefixMap;
        if (map.containsKey(variant)) {
            return (OutputPrefixType) map.get(variant);
        }
        MacWrapper$$ExternalSyntheticLambda0.m(variant, "Unable to serialize variant: ");
        return null;
    }

    public static AesSivParameters.Variant toVariant(OutputPrefixType outputPrefixType) {
        Map map = outputPrefixToVariantMap;
        if (map.containsKey(outputPrefixType)) {
            return (AesSivParameters.Variant) map.get(outputPrefixType);
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }
}
