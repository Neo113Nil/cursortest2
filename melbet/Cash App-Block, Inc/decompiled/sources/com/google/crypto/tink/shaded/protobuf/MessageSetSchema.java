package com.google.crypto.tink.shaded.protobuf;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class MessageSetSchema implements Schema {
    public final AbstractMessageLite defaultInstance;
    public final ExtensionSchema extensionSchema;
    public final UnknownFieldSchema unknownFieldSchema;

    public MessageSetSchema(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, AbstractMessageLite abstractMessageLite) {
        this.unknownFieldSchema = unknownFieldSchema;
        extensionSchema.getClass();
        this.extensionSchema = extensionSchema;
        this.defaultInstance = abstractMessageLite;
    }

    public static MessageSetSchema newSchema(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, AbstractMessageLite abstractMessageLite) {
        return new MessageSetSchema(unknownFieldSchema, extensionSchema, abstractMessageLite);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final boolean equals(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        UnknownFieldSetLiteSchema unknownFieldSetLiteSchema = (UnknownFieldSetLiteSchema) this.unknownFieldSchema;
        unknownFieldSetLiteSchema.getClass();
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        unknownFieldSetLiteSchema.getClass();
        return unknownFieldSetLite.equals(generatedMessageLite2.unknownFields);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final int getSerializedSize(GeneratedMessageLite generatedMessageLite) {
        ((UnknownFieldSetLiteSchema) this.unknownFieldSchema).getClass();
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        int i = unknownFieldSetLite.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < unknownFieldSetLite.count; i3++) {
            int i4 = unknownFieldSetLite.tags[i3] >>> 3;
            i2 += CodedOutputStream$ArrayEncoder.computeBytesSize(3, (ByteString) unknownFieldSetLite.objects[i3]) + CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(i4) + CodedOutputStream$ArrayEncoder.computeTagSize(2) + (CodedOutputStream$ArrayEncoder.computeTagSize(1) * 2);
        }
        unknownFieldSetLite.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final int hashCode(GeneratedMessageLite generatedMessageLite) {
        ((UnknownFieldSetLiteSchema) this.unknownFieldSchema).getClass();
        return generatedMessageLite.unknownFields.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final boolean isInitialized(Object obj) {
        ((ExtensionSchemaLite) this.extensionSchema).getClass();
        JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final void makeImmutable(Object obj) {
        ((UnknownFieldSetLiteSchema) this.unknownFieldSchema).getClass();
        UnknownFieldSetLite unknownFieldSetLite = ((GeneratedMessageLite) obj).unknownFields;
        if (unknownFieldSetLite.isMutable) {
            unknownFieldSetLite.isMutable = false;
        }
        ((ExtensionSchemaLite) this.extensionSchema).getClass();
        JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final void mergeFrom(Object obj, CodedInputStreamReader codedInputStreamReader, ExtensionRegistryLite extensionRegistryLite) {
        this.unknownFieldSchema.getBuilderFromMessage(obj);
        ((ExtensionSchemaLite) this.extensionSchema).getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final Object newInstance() {
        AbstractMessageLite abstractMessageLite = this.defaultInstance;
        return abstractMessageLite instanceof GeneratedMessageLite ? ((GeneratedMessageLite) abstractMessageLite).newMutableInstance$1() : abstractMessageLite.newBuilderForType().buildPartial$1();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final void writeTo(Object obj, ManifestSchemaFactory manifestSchemaFactory) {
        ((ExtensionSchemaLite) this.extensionSchema).getClass();
        JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final void mergeFrom(Object obj, byte[] bArr, int i, int i2, ArrayDecoders$Registers arrayDecoders$Registers) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        if (generatedMessageLite.unknownFields == UnknownFieldSetLite.DEFAULT_INSTANCE) {
            generatedMessageLite.unknownFields = UnknownFieldSetLite.newInstance();
        }
        throw Boxes$$ExternalSyntheticOutline1.m(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final void mergeFrom(Object obj, Object obj2) {
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, obj, obj2);
    }
}
