package kotlin.jvm.internal;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final r f8077a;

    static {
        r rVar = null;
        try {
            rVar = (r) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (rVar == null) {
            rVar = new r();
        }
        f8077a = rVar;
    }

    public static d a(Class cls) {
        f8077a.getClass();
        return new d(cls);
    }
}
