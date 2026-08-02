package defpackage;

/* loaded from: classes3.dex */
public abstract class x9h {
    public static final u9h a;
    public static final u9h b;

    static {
        yym yymVar = yym.c;
        u9h u9hVar = null;
        try {
            u9hVar = (u9h) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = u9hVar;
        b = new u9h();
    }
}
