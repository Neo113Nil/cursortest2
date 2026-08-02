package defpackage;

/* loaded from: classes3.dex */
public abstract class f1c {
    public static final c1c a = new c1c();
    public static final c1c b;

    static {
        yym yymVar = yym.c;
        c1c c1cVar = null;
        try {
            c1cVar = (c1c) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = c1cVar;
    }
}
