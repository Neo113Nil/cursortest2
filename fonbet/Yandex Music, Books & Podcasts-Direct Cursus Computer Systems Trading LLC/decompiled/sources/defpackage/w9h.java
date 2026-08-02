package defpackage;

/* loaded from: classes3.dex */
public abstract class w9h {
    public static final t9h a;
    public static final t9h b;

    static {
        t9h t9hVar = null;
        try {
            t9hVar = (t9h) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = t9hVar;
        b = new t9h();
    }
}
