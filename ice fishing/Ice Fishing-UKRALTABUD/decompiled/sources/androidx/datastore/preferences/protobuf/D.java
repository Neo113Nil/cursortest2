package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final C f1351a;

    /* renamed from: b, reason: collision with root package name */
    public static final C f1352b;

    static {
        T t2 = T.f1385c;
        C c2 = null;
        try {
            c2 = (C) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1351a = c2;
        f1352b = new C();
    }
}
