package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class NewInstanceSchemas {
    public static final NewInstanceSchemaLite FULL_SCHEMA;
    public static final NewInstanceSchemaLite LITE_SCHEMA;

    static {
        Protobuf protobuf = Protobuf.INSTANCE;
        NewInstanceSchemaLite newInstanceSchemaLite = null;
        try {
            newInstanceSchemaLite = (NewInstanceSchemaLite) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        FULL_SCHEMA = newInstanceSchemaLite;
        LITE_SCHEMA = new NewInstanceSchemaLite();
    }
}
