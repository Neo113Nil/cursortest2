package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class yp0 {
    public static final Method GWasM1elztuh;
    public static final Method Yi7zF1RB1;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        int length = methods.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i2];
            if (o30.rQPn8YBR(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (o30.rQPn8YBR(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i2++;
        }
        GWasM1elztuh = method2;
        int length2 = methods.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            Method method3 = methods[i];
            if (o30.rQPn8YBR(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i++;
        }
        Yi7zF1RB1 = method;
    }
}
