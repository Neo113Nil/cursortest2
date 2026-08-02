package androidx.glance.appwidget.protobuf;

/* loaded from: classes3.dex */
public interface Schema {
    boolean equals(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2);

    int getSerializedSize(GeneratedMessageLite generatedMessageLite);

    int hashCode(GeneratedMessageLite generatedMessageLite);

    boolean isInitialized(Object obj);

    void makeImmutable(Object obj);

    void mergeFrom(Object obj, CodedInputStreamReader codedInputStreamReader, ExtensionRegistryLite extensionRegistryLite);

    void mergeFrom(Object obj, Object obj2);

    GeneratedMessageLite newInstance();

    void writeTo(Object obj, ManifestSchemaFactory manifestSchemaFactory);
}
