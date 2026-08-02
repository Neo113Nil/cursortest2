package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public final class UnknownFieldSetLiteSchema extends UnknownFieldSchema {
    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite getBuilderFromMessage(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.DEFAULT_INSTANCE) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = newInstance;
        return newInstance;
    }
}
