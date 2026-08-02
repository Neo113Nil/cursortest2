package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class d0 {
    public static final b0 a;
    public static final c0 b;

    static {
        b0 b0Var = null;
        try {
            b0Var = (b0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = b0Var;
        b = new c0();
    }
}
