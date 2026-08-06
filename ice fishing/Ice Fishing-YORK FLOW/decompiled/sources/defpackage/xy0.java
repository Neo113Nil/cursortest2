package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class xy0 {
    public static final java.lang.reflect.Method ZpBGe2uQfcn8;
    public static final java.lang.reflect.Method giKS3J6vZuNy;

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
            if (defpackage.ma0.QiMR8OkAhezm(method2.getName(), "addSuppressed")) {
                java.lang.Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (defpackage.ma0.QiMR8OkAhezm(parameterTypes.length == 1 ? parameterTypes[0] : null, java.lang.Throwable.class)) {
                    break;
                }
            }
            i2++;
        }
        ZpBGe2uQfcn8 = method2;
        int length2 = methods.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            java.lang.reflect.Method method3 = methods[i];
            if (defpackage.ma0.QiMR8OkAhezm(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i++;
        }
        giKS3J6vZuNy = method;
    }
}
