package defpackage;

/* loaded from: classes.dex */
public abstract class u560 {
    public static final r560 a;
    public static final r560 b;

    static {
        r560 r560Var = null;
        try {
            r560Var = (r560) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = r560Var;
        b = new r560();
    }
}
