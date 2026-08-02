package com.google.crypto.tink.mac.internal;

import com.google.android.gms.common.api.internal.zaaa;
import com.google.crypto.tink.internal.KeyParser$1;
import com.google.crypto.tink.internal.KeySerializer$1;
import com.google.crypto.tink.internal.ParametersParser$1;
import com.google.crypto.tink.internal.ParametersSerializer$1;
import com.google.crypto.tink.internal.PrimitiveRegistry;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.mac.HmacKey;
import com.google.crypto.tink.mac.HmacParameters;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.util.Bytes;

/* loaded from: classes.dex */
public abstract class HmacProtoSerialization {
    public static final zaaa HASH_TYPE_CONVERTER;
    public static final KeyParser$1 KEY_PARSER;
    public static final KeySerializer$1 KEY_SERIALIZER;
    public static final zaaa OUTPUT_PREFIX_TYPE_CONVERTER;
    public static final ParametersParser$1 PARAMETERS_PARSER;
    public static final ParametersSerializer$1 PARAMETERS_SERIALIZER;

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.HmacKey");
        PrimitiveRegistry.Builder builder = zaaa.builder();
        builder.add(OutputPrefixType.RAW, HmacParameters.Variant.NO_PREFIX);
        builder.add(OutputPrefixType.TINK, HmacParameters.Variant.TINK);
        builder.add(OutputPrefixType.LEGACY, HmacParameters.Variant.LEGACY);
        builder.add(OutputPrefixType.CRUNCHY, HmacParameters.Variant.CRUNCHY);
        OUTPUT_PREFIX_TYPE_CONVERTER = builder.build();
        PrimitiveRegistry.Builder builder2 = zaaa.builder();
        builder2.add(HashType.SHA1, HmacParameters.HashType.SHA1);
        builder2.add(HashType.SHA224, HmacParameters.HashType.SHA224);
        builder2.add(HashType.SHA256, HmacParameters.HashType.SHA256);
        builder2.add(HashType.SHA384, HmacParameters.HashType.SHA384);
        builder2.add(HashType.SHA512, HmacParameters.HashType.SHA512);
        HASH_TYPE_CONVERTER = builder2.build();
        PARAMETERS_SERIALIZER = new ParametersSerializer$1(HmacParameters.class, new MacWrapper$$ExternalSyntheticLambda0(22));
        PARAMETERS_PARSER = new ParametersParser$1(bytesFromPrintableAscii, new MacWrapper$$ExternalSyntheticLambda0(23));
        KEY_SERIALIZER = new KeySerializer$1(HmacKey.class, new MacWrapper$$ExternalSyntheticLambda0(24));
        KEY_PARSER = new KeyParser$1(bytesFromPrintableAscii, new MacWrapper$$ExternalSyntheticLambda0(25));
    }
}
