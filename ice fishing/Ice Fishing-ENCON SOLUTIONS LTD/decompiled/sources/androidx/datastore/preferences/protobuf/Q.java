package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final P f2343a;

    /* renamed from: b, reason: collision with root package name */
    public static final P f2344b;

    static {
        T t = T.f2345c;
        P p2 = null;
        try {
            p2 = (P) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f2343a = p2;
        f2344b = new P();
    }
}
