package kotlin.jvm.internal;

import h1.InterfaceC0231a;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public abstract class s {
    public static void a(int i2, Object obj) {
        if (obj == null || b(i2, obj)) {
            return;
        }
        String f2 = C1.a.f(i2, "kotlin.jvm.functions.Function");
        ClassCastException classCastException = new ClassCastException(obj.getClass().getName() + " cannot be cast to " + f2);
        i.g(classCastException, s.class.getName());
        throw classCastException;
    }

    public static boolean b(int i2, Object obj) {
        if (obj instanceof InterfaceC0231a) {
            return (obj instanceof f ? ((f) obj).getArity() : obj instanceof InterfaceC1046a ? 0 : obj instanceof t1.l ? 1 : obj instanceof t1.p ? 2 : obj instanceof t1.q ? 3 : -1) == i2;
        }
        return false;
    }
}
