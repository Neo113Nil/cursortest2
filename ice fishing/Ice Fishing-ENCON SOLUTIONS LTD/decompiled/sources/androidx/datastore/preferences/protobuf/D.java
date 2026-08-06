package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final C f2311a;

    /* renamed from: b, reason: collision with root package name */
    public static final C f2312b;

    static {
        T t = T.f2345c;
        C c2 = null;
        try {
            c2 = (C) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f2311a = c2;
        f2312b = new C();
    }
}
