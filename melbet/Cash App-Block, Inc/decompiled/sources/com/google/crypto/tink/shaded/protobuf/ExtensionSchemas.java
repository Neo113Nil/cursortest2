package com.google.crypto.tink.shaded.protobuf;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class ExtensionSchemas {
    public static final ExtensionSchema FULL_SCHEMA;
    public static final ExtensionSchemaLite LITE_SCHEMA = new ExtensionSchemaLite();

    static {
        Protobuf protobuf = Protobuf.INSTANCE;
        ExtensionSchema extensionSchema = null;
        try {
            extensionSchema = (ExtensionSchema) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        FULL_SCHEMA = extensionSchema;
    }

    public static ExtensionSchema full() {
        ExtensionSchema extensionSchema = FULL_SCHEMA;
        if (extensionSchema != null) {
            return extensionSchema;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Protobuf runtime is not correctly loaded.");
        return null;
    }
}
