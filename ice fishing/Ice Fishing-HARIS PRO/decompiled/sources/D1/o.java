package D1;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final p f171a;

    static {
        p pVar = null;
        try {
            pVar = (p) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (pVar == null) {
            pVar = new p();
        }
        f171a = pVar;
    }

    public static e a(Class cls) {
        f171a.getClass();
        return new e(cls);
    }
}
