package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes9.dex */
public class qoi0 {
    public static final uoi0 a;

    static {
        uoi0 uoi0Var = null;
        try {
            uoi0Var = (uoi0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (uoi0Var == null) {
            uoi0Var = new uoi0();
        }
        a = uoi0Var;
    }

    public static g0c a(Class cls) {
        a.getClass();
        return new g0c(cls);
    }

    public static void b(MutablePropertyReference1Impl mutablePropertyReference1Impl) {
        a.getClass();
    }

    public static an11 c(Class cls) {
        g0c a2 = a(cls);
        List list = Collections.EMPTY_LIST;
        a.getClass();
        return new an11(a2, list, true);
    }

    public static an11 d(ogx ogxVar) {
        g0c a2 = a(List.class);
        List singletonList = Collections.singletonList(ogxVar);
        a.getClass();
        return new an11(a2, singletonList, false);
    }

    public static an11 e(Class cls) {
        g0c a2 = a(cls);
        List list = Collections.EMPTY_LIST;
        a.getClass();
        return new an11(a2, list, false);
    }
}
