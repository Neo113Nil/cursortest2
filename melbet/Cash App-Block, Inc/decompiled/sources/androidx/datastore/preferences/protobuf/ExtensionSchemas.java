package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class ExtensionSchemas {
    public static final ExtensionSchemaLite FULL_SCHEMA;
    public static final ExtensionSchemaLite LITE_SCHEMA = new ExtensionSchemaLite();

    static {
        Protobuf protobuf = Protobuf.INSTANCE;
        ExtensionSchemaLite extensionSchemaLite = null;
        try {
            extensionSchemaLite = (ExtensionSchemaLite) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        FULL_SCHEMA = extensionSchemaLite;
    }
}
