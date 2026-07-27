package E0;

/* loaded from: classes.dex */
public abstract class s {
    public static void a(int i2, Object obj) {
        if (obj == null || b(i2, obj)) {
            return;
        }
        String e2 = h.e("kotlin.jvm.functions.Function", i2);
        ClassCastException classCastException = new ClassCastException(obj.getClass().getName() + " cannot be cast to " + e2);
        i.f(classCastException, s.class.getName());
        throw classCastException;
    }

    public static boolean b(int i2, Object obj) {
        if (obj instanceof t0.a) {
            return (obj instanceof f ? ((f) obj).g() : obj instanceof D0.a ? 0 : obj instanceof D0.l ? 1 : obj instanceof D0.p ? 2 : obj instanceof D0.q ? 3 : -1) == i2;
        }
        return false;
    }
}
