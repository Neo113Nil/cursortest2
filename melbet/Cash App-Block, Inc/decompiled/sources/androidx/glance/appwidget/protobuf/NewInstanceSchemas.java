package androidx.glance.appwidget.protobuf;

/* loaded from: classes3.dex */
public abstract class NewInstanceSchemas {
    public static final NewInstanceSchemaLite FULL_SCHEMA;
    public static final NewInstanceSchemaLite LITE_SCHEMA;

    static {
        Protobuf protobuf = Protobuf.INSTANCE;
        NewInstanceSchemaLite newInstanceSchemaLite = null;
        try {
            newInstanceSchemaLite = (NewInstanceSchemaLite) Class.forName("androidx.glance.appwidget.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        FULL_SCHEMA = newInstanceSchemaLite;
        LITE_SCHEMA = new NewInstanceSchemaLite();
    }
}
