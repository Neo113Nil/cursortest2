package D1;

/* loaded from: classes.dex */
public abstract class q {
    public static void a(int i, Object obj) {
        if (obj == null || b(i, obj)) {
            return;
        }
        c(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean b(int i, Object obj) {
        if (obj instanceof t1.a) {
            return (obj instanceof f ? ((f) obj).f() : obj instanceof C1.a ? 0 : obj instanceof C1.l ? 1 : obj instanceof C1.p ? 2 : obj instanceof C1.q ? 3 : -1) == i;
        }
        return false;
    }

    public static void c(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        i.g(classCastException, q.class.getName());
        throw classCastException;
    }
}
