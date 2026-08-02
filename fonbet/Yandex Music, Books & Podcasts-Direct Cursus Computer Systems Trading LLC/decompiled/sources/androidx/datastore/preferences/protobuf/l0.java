package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class l0 {
    public static final j0 a;
    public static final k0 b;

    static {
        j0 j0Var = null;
        try {
            j0Var = (j0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = j0Var;
        b = new k0();
    }
}
