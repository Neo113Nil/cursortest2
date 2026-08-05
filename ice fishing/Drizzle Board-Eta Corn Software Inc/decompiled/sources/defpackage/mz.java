package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class mz {
    public static final Method qoPGr6Ce;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (fn.qoPGr6Ce(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (fn.qoPGr6Ce(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        qoPGr6Ce = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !fn.qoPGr6Ce(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
