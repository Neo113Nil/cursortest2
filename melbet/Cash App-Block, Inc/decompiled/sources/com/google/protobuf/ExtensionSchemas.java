package com.google.protobuf;

import bo.app.a$$ExternalSyntheticBUOutline0;

@CheckReturnValue
/* loaded from: classes4.dex */
final class ExtensionSchemas {
    private static final ExtensionSchema<?> LITE_SCHEMA = new ExtensionSchemaLite();
    private static final ExtensionSchema<?> FULL_SCHEMA = loadSchemaForFullRuntime();

    public static ExtensionSchema<?> full() {
        ExtensionSchema<?> extensionSchema = FULL_SCHEMA;
        if (extensionSchema != null) {
            return extensionSchema;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Protobuf runtime is not correctly loaded.");
        return null;
    }

    public static ExtensionSchema<?> lite() {
        return LITE_SCHEMA;
    }

    private static ExtensionSchema<?> loadSchemaForFullRuntime() {
        try {
            return (ExtensionSchema) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
