package defpackage;

/* loaded from: classes3.dex */
public abstract class d4j {
    public static final a4j a;
    public static final a4j b;

    static {
        a4j a4jVar = null;
        try {
            a4jVar = (a4j) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = a4jVar;
        b = new a4j();
    }
}
