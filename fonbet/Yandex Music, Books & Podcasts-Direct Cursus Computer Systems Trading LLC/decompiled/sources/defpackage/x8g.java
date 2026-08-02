package defpackage;

/* loaded from: classes3.dex */
public abstract class x8g {
    public static final v8g a;
    public static final v8g b;

    static {
        yym yymVar = yym.c;
        v8g v8gVar = null;
        try {
            v8gVar = (v8g) Class.forName("com.google.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = v8gVar;
        b = new v8g();
    }
}
