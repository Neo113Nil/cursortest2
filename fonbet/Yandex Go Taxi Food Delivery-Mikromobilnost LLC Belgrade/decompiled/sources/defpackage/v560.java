package defpackage;

/* loaded from: classes.dex */
public abstract class v560 {
    public static final s560 a;
    public static final s560 b;

    static {
        Class cls = g72.a;
        s560 s560Var = null;
        try {
            s560Var = (s560) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = s560Var;
        b = new s560();
    }
}
