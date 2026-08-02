package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class o {
    public static final n a = new n();
    public static final m b;

    static {
        m mVar = null;
        try {
            mVar = (m) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = mVar;
    }
}
