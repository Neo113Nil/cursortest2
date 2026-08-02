package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public interface Schema {
    boolean equals(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2);

    int getSerializedSize(GeneratedMessageLite generatedMessageLite);

    int hashCode(GeneratedMessageLite generatedMessageLite);

    boolean isInitialized(Object obj);

    void makeImmutable(Object obj);

    void mergeFrom(Object obj, CodedInputStreamReader codedInputStreamReader, ExtensionRegistryLite extensionRegistryLite);

    void mergeFrom(Object obj, Object obj2);

    void mergeFrom(Object obj, byte[] bArr, int i, int i2, ArrayDecoders$Registers arrayDecoders$Registers);

    Object newInstance();

    void writeTo(Object obj, ManifestSchemaFactory manifestSchemaFactory);
}
