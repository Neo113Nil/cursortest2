package com.google.crypto.tink.shaded.protobuf;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.shaded.protobuf.ManifestSchemaFactory;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class Protobuf {
    public static final Protobuf INSTANCE = new Protobuf();
    public final ConcurrentHashMap schemaCache = new ConcurrentHashMap();
    public final ManifestSchemaFactory schemaFactory = new ManifestSchemaFactory();

    public final Schema schemaFor(Class cls) {
        Schema newSchemaForRawMessageInfo;
        Class cls2;
        Internal.checkNotNull(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.schemaCache;
        Schema schema = (Schema) concurrentHashMap.get(cls);
        if (schema != null) {
            return schema;
        }
        ManifestSchemaFactory manifestSchemaFactory = this.schemaFactory;
        manifestSchemaFactory.getClass();
        Class cls3 = SchemaUtil.GENERATED_MESSAGE_CLASS;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = SchemaUtil.GENERATED_MESSAGE_CLASS) != null && !cls2.isAssignableFrom(cls)) {
            a$$ExternalSyntheticBUOutline0.m$3("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        RawMessageInfo messageInfoFor = ((ManifestSchemaFactory.CompositeMessageInfoFactory) manifestSchemaFactory.messageInfoFactory).messageInfoFor(cls);
        if ((messageInfoFor.flags & 2) == 2) {
            newSchemaForRawMessageInfo = GeneratedMessageLite.class.isAssignableFrom(cls) ? MessageSetSchema.newSchema(SchemaUtil.UNKNOWN_FIELD_SET_LITE_SCHEMA, ExtensionSchemas.LITE_SCHEMA, messageInfoFor.defaultInstance) : MessageSetSchema.newSchema(SchemaUtil.UNKNOWN_FIELD_SET_FULL_SCHEMA, ExtensionSchemas.full(), messageInfoFor.defaultInstance);
        } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            NewInstanceSchemaLite newInstanceSchemaLite = NewInstanceSchemas.LITE_SCHEMA;
            ListFieldSchemaLite listFieldSchemaLite = ListFieldSchemas.LITE_SCHEMA;
            UnknownFieldSetLiteSchema unknownFieldSetLiteSchema = SchemaUtil.UNKNOWN_FIELD_SET_LITE_SCHEMA;
            ExtensionSchemaLite extensionSchemaLite = CameraSelector$$ExternalSyntheticOutline0.ordinal(messageInfoFor.getSyntax()) != 1 ? ExtensionSchemas.LITE_SCHEMA : null;
            MapFieldSchemaLite mapFieldSchemaLite = MapFieldSchemas.LITE_SCHEMA;
            if (!(messageInfoFor instanceof RawMessageInfo)) {
                int[] iArr = MessageSchema.EMPTY_INT_ARRAY;
                a$$ExternalSyntheticBUOutline0.m$1();
                return null;
            }
            newSchemaForRawMessageInfo = MessageSchema.newSchemaForRawMessageInfo(messageInfoFor, newInstanceSchemaLite, listFieldSchemaLite, unknownFieldSetLiteSchema, extensionSchemaLite, mapFieldSchemaLite);
        } else {
            NewInstanceSchemaLite newInstanceSchemaLite2 = NewInstanceSchemas.FULL_SCHEMA;
            ListFieldSchemaLite listFieldSchemaLite2 = ListFieldSchemas.FULL_SCHEMA;
            UnknownFieldSchema unknownFieldSchema = SchemaUtil.UNKNOWN_FIELD_SET_FULL_SCHEMA;
            ExtensionSchema full = CameraSelector$$ExternalSyntheticOutline0.ordinal(messageInfoFor.getSyntax()) != 1 ? ExtensionSchemas.full() : null;
            MapFieldSchemaLite mapFieldSchemaLite2 = MapFieldSchemas.FULL_SCHEMA;
            if (!(messageInfoFor instanceof RawMessageInfo)) {
                int[] iArr2 = MessageSchema.EMPTY_INT_ARRAY;
                a$$ExternalSyntheticBUOutline0.m$1();
                return null;
            }
            newSchemaForRawMessageInfo = MessageSchema.newSchemaForRawMessageInfo(messageInfoFor, newInstanceSchemaLite2, listFieldSchemaLite2, unknownFieldSchema, full, mapFieldSchemaLite2);
        }
        Schema schema2 = (Schema) concurrentHashMap.putIfAbsent(cls, newSchemaForRawMessageInfo);
        return schema2 != null ? schema2 : newSchemaForRawMessageInfo;
    }
}
