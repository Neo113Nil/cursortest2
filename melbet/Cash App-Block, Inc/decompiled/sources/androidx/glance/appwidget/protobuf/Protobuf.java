package androidx.glance.appwidget.protobuf;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.glance.appwidget.protobuf.ManifestSchemaFactory;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class Protobuf {
    public static final Protobuf INSTANCE = new Protobuf();
    public final ConcurrentHashMap schemaCache = new ConcurrentHashMap();
    public final ManifestSchemaFactory schemaFactory = new ManifestSchemaFactory();

    public final Schema schemaFor(Class cls) {
        ExtensionSchemaLite extensionSchemaLite;
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
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                newSchemaForRawMessageInfo = new MessageSetSchema(SchemaUtil.UNKNOWN_FIELD_SET_LITE_SCHEMA, ExtensionSchemas.LITE_SCHEMA, messageInfoFor.defaultInstance);
            } else {
                UnknownFieldSchema unknownFieldSchema = SchemaUtil.UNKNOWN_FIELD_SET_FULL_SCHEMA;
                ExtensionSchemaLite extensionSchemaLite2 = ExtensionSchemas.FULL_SCHEMA;
                if (extensionSchemaLite2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                newSchemaForRawMessageInfo = new MessageSetSchema(unknownFieldSchema, extensionSchemaLite2, messageInfoFor.defaultInstance);
            }
        } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            NewInstanceSchemaLite newInstanceSchemaLite = NewInstanceSchemas.LITE_SCHEMA;
            ListFieldSchemaLite listFieldSchemaLite = ListFieldSchemas.LITE_SCHEMA;
            UnknownFieldSetLiteSchema unknownFieldSetLiteSchema = SchemaUtil.UNKNOWN_FIELD_SET_LITE_SCHEMA;
            ExtensionSchemaLite extensionSchemaLite3 = CameraSelector$$ExternalSyntheticOutline0.ordinal(messageInfoFor.getSyntax()) != 1 ? ExtensionSchemas.LITE_SCHEMA : null;
            MapFieldSchemaLite mapFieldSchemaLite = MapFieldSchemas.LITE_SCHEMA;
            if (!(messageInfoFor instanceof RawMessageInfo)) {
                int[] iArr = MessageSchema.EMPTY_INT_ARRAY;
                a$$ExternalSyntheticBUOutline0.m$1();
                return null;
            }
            newSchemaForRawMessageInfo = MessageSchema.newSchemaForRawMessageInfo(messageInfoFor, newInstanceSchemaLite, listFieldSchemaLite, unknownFieldSetLiteSchema, extensionSchemaLite3, mapFieldSchemaLite);
        } else {
            NewInstanceSchemaLite newInstanceSchemaLite2 = NewInstanceSchemas.FULL_SCHEMA;
            ListFieldSchemaLite listFieldSchemaLite2 = ListFieldSchemas.FULL_SCHEMA;
            UnknownFieldSchema unknownFieldSchema2 = SchemaUtil.UNKNOWN_FIELD_SET_FULL_SCHEMA;
            if (CameraSelector$$ExternalSyntheticOutline0.ordinal(messageInfoFor.getSyntax()) != 1) {
                ExtensionSchemaLite extensionSchemaLite4 = ExtensionSchemas.FULL_SCHEMA;
                if (extensionSchemaLite4 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                extensionSchemaLite = extensionSchemaLite4;
            } else {
                extensionSchemaLite = null;
            }
            MapFieldSchemaLite mapFieldSchemaLite2 = MapFieldSchemas.FULL_SCHEMA;
            if (!(messageInfoFor instanceof RawMessageInfo)) {
                int[] iArr2 = MessageSchema.EMPTY_INT_ARRAY;
                a$$ExternalSyntheticBUOutline0.m$1();
                return null;
            }
            newSchemaForRawMessageInfo = MessageSchema.newSchemaForRawMessageInfo(messageInfoFor, newInstanceSchemaLite2, listFieldSchemaLite2, unknownFieldSchema2, extensionSchemaLite, mapFieldSchemaLite2);
        }
        Schema schema2 = (Schema) concurrentHashMap.putIfAbsent(cls, newSchemaForRawMessageInfo);
        return schema2 != null ? schema2 : newSchemaForRawMessageInfo;
    }
}
