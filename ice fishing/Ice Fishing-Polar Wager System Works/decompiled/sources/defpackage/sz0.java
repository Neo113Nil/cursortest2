package defpackage;

/* loaded from: classes.dex */
public abstract class sz0 {
    public static final defpackage.tz0 IHQe1A4L2xu;

    static {
        defpackage.tz0 tz0Var = null;
        try {
            tz0Var = (defpackage.tz0) java.lang.Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (java.lang.ClassCastException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException unused) {
        }
        if (tz0Var == null) {
            tz0Var = new defpackage.tz0();
        }
        IHQe1A4L2xu = tz0Var;
    }

    public static defpackage.xc IHQe1A4L2xu(java.lang.Class cls) {
        IHQe1A4L2xu.getClass();
        return new defpackage.xc(cls);
    }
}
