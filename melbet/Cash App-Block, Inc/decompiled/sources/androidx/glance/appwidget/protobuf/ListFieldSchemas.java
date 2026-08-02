package androidx.glance.appwidget.protobuf;

/* loaded from: classes3.dex */
public abstract class ListFieldSchemas {
    public static final ListFieldSchemaLite FULL_SCHEMA;
    public static final ListFieldSchemaLite LITE_SCHEMA;

    static {
        Protobuf protobuf = Protobuf.INSTANCE;
        ListFieldSchemaLite listFieldSchemaLite = null;
        try {
            listFieldSchemaLite = (ListFieldSchemaLite) Class.forName("androidx.glance.appwidget.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        FULL_SCHEMA = listFieldSchemaLite;
        LITE_SCHEMA = new ListFieldSchemaLite();
    }
}
