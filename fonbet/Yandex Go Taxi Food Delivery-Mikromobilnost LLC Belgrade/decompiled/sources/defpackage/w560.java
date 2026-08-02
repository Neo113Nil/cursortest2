package defpackage;

/* loaded from: classes.dex */
public abstract class w560 {
    public static final t560 a;
    public static final t560 b;

    static {
        fvf0 fvf0Var = fvf0.c;
        t560 t560Var = null;
        try {
            t560Var = (t560) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = t560Var;
        b = new t560();
    }
}
