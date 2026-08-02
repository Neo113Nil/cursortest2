package defpackage;

/* loaded from: classes3.dex */
public abstract class e4j {
    public static final b4j a;
    public static final b4j b;

    static {
        yym yymVar = yym.c;
        b4j b4jVar = null;
        try {
            b4jVar = (b4j) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = b4jVar;
        b = new b4j();
    }
}
