package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class MapFieldSchemas {
    public static final MapFieldSchemaLite FULL_SCHEMA;
    public static final MapFieldSchemaLite LITE_SCHEMA;

    static {
        Protobuf protobuf = Protobuf.INSTANCE;
        MapFieldSchemaLite mapFieldSchemaLite = null;
        try {
            mapFieldSchemaLite = (MapFieldSchemaLite) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        FULL_SCHEMA = mapFieldSchemaLite;
        LITE_SCHEMA = new MapFieldSchemaLite();
    }
}
