package com.google.crypto.tink.internal;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;

/* loaded from: classes.dex */
public class LegacyKeyManagerImpl {
    public final KeyData.KeyMaterialType keyMaterialType;
    public final Class primitiveClass;
    public final String typeUrl;

    public final class LegacyPrivateKeyManagerImpl extends LegacyKeyManagerImpl {
    }

    public LegacyKeyManagerImpl(String str, Class cls, KeyData.KeyMaterialType keyMaterialType) {
        this.typeUrl = str;
        this.primitiveClass = cls;
        this.keyMaterialType = keyMaterialType;
    }

    public final Object getPrimitive(ByteString byteString) {
        return ((PrimitiveRegistry) MutablePrimitiveRegistry.globalInstance.registry.get()).getPrimitiveWithoutReparsing(MutableSerializationRegistry.GLOBAL_INSTANCE.parseKey(ProtoKeySerialization.create(this.typeUrl, byteString, this.keyMaterialType, OutputPrefixType.RAW, null)), this.primitiveClass);
    }
}
