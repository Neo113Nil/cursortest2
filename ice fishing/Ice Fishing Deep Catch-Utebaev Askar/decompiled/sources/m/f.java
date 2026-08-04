package m;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f211a;

    static {
        g gVar = null;
        try {
            gVar = (g) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (gVar == null) {
            gVar = new g();
        }
        f211a = gVar;
    }

    public static c a(Class cls) {
        f211a.getClass();
        return new c(cls);
    }
}
