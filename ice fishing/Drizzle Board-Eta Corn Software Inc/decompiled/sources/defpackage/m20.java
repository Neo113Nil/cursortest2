package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class m20 {
    public static final n20 qoPGr6Ce;

    static {
        n20 n20Var = null;
        try {
            n20Var = (n20) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (n20Var == null) {
            n20Var = new n20();
        }
        qoPGr6Ce = n20Var;
    }

    public static p5 qoPGr6Ce(Class cls) {
        qoPGr6Ce.getClass();
        return new p5(cls);
    }
}
