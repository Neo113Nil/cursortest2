package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final P f1391a;

    /* renamed from: b, reason: collision with root package name */
    public static final P f1392b;

    static {
        T t2 = T.f1393c;
        P p2 = null;
        try {
            p2 = (P) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1391a = p2;
        f1392b = new P();
    }
}
