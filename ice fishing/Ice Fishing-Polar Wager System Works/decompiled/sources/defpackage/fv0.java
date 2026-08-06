package defpackage;

/* loaded from: classes.dex */
public abstract class fv0 {
    public static final java.lang.reflect.Method IHQe1A4L2xu;
    public static final java.lang.reflect.Method oh6vYeIP;

    static {
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method[] methods = java.lang.Throwable.class.getMethods();
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
            if (defpackage.x70.QoRHpC4k(method2.getName(), "addSuppressed")) {
                java.lang.Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (defpackage.x70.QoRHpC4k(parameterTypes.length == 1 ? parameterTypes[0] : null, java.lang.Throwable.class)) {
                    break;
                }
            }
            i2++;
        }
        IHQe1A4L2xu = method2;
        int length2 = methods.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            java.lang.reflect.Method method3 = methods[i];
            if (defpackage.x70.QoRHpC4k(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i++;
        }
        oh6vYeIP = method;
    }
}
