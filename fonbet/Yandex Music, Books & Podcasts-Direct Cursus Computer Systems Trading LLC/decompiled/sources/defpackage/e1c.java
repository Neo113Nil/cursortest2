package defpackage;

/* loaded from: classes3.dex */
public abstract class e1c {
    public static final b1c a = new b1c();
    public static final b1c b;

    static {
        b1c b1cVar = null;
        try {
            b1cVar = (b1c) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = b1cVar;
    }
}
