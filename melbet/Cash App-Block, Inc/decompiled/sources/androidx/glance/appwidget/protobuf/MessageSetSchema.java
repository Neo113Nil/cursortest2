package androidx.glance.appwidget.protobuf;

import androidx.glance.appwidget.protobuf.GeneratedMessageLite;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class MessageSetSchema implements Schema {
    public final AbstractMessageLite defaultInstance;
    public final ExtensionSchemaLite extensionSchema;
    public final UnknownFieldSchema unknownFieldSchema;

    public MessageSetSchema(UnknownFieldSchema unknownFieldSchema, ExtensionSchemaLite extensionSchemaLite, AbstractMessageLite abstractMessageLite) {
        this.unknownFieldSchema = unknownFieldSchema;
        extensionSchemaLite.getClass();
        this.extensionSchema = extensionSchemaLite;
        this.defaultInstance = abstractMessageLite;
    }

    @Override // androidx.glance.appwidget.protobuf.Schema
    public final boolean equals(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        UnknownFieldSetLiteSchema unknownFieldSetLiteSchema = (UnknownFieldSetLiteSchema) this.unknownFieldSchema;
        unknownFieldSetLiteSchema.getClass();
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        unknownFieldSetLiteSchema.getClass();
        return unknownFieldSetLite.equals(generatedMessageLite2.unknownFields);
    }

    @Override // androidx.glance.appwidget.protobuf.Schema
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
            i2 += CodedOutputStream$OutputStreamEncoder.computeBytesSize(3, (ByteString$LiteralByteString) unknownFieldSetLite.objects[i3]) + CodedOutputStream$OutputStreamEncoder.computeUInt32SizeNoTag(i4) + CodedOutputStream$OutputStreamEncoder.computeTagSize(2) + (CodedOutputStream$OutputStreamEncoder.computeTagSize(1) * 2);
        }
        unknownFieldSetLite.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // androidx.glance.appwidget.protobuf.Schema
    public final int hashCode(GeneratedMessageLite generatedMessageLite) {
        ((UnknownFieldSetLiteSchema) this.unknownFieldSchema).getClass();
        return generatedMessageLite.unknownFields.hashCode();
    }

    @Override // androidx.glance.appwidget.protobuf.Schema
    public final boolean isInitialized(Object obj) {
        this.extensionSchema.getClass();
        JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(obj);
        throw null;
    }

    @Override // androidx.glance.appwidget.protobuf.Schema
    public final void makeImmutable(Object obj) {
        ((UnknownFieldSetLiteSchema) this.unknownFieldSchema).getClass();
        UnknownFieldSetLite unknownFieldSetLite = ((GeneratedMessageLite) obj).unknownFields;
        if (unknownFieldSetLite.isMutable) {
            unknownFieldSetLite.isMutable = false;
        }
        this.extensionSchema.getClass();
        JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(obj);
        throw null;
    }

    @Override // androidx.glance.appwidget.protobuf.Schema
    public final void mergeFrom(Object obj, CodedInputStreamReader codedInputStreamReader, ExtensionRegistryLite extensionRegistryLite) {
        this.unknownFieldSchema.getBuilderFromMessage(obj);
        this.extensionSchema.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.glance.appwidget.protobuf.Schema
    public final GeneratedMessageLite newInstance() {
        AbstractMessageLite abstractMessageLite = this.defaultInstance;
        return abstractMessageLite instanceof GeneratedMessageLite ? ((GeneratedMessageLite) abstractMessageLite).newMutableInstance$1() : ((GeneratedMessageLite.Builder) ((GeneratedMessageLite) abstractMessageLite).dynamicMethod(5)).buildPartial();
    }

    @Override // androidx.glance.appwidget.protobuf.Schema
    public final void writeTo(Object obj, ManifestSchemaFactory manifestSchemaFactory) {
        this.extensionSchema.getClass();
        JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(obj);
        throw null;
    }

    @Override // androidx.glance.appwidget.protobuf.Schema
    public final void mergeFrom(Object obj, Object obj2) {
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, obj, obj2);
    }
}
