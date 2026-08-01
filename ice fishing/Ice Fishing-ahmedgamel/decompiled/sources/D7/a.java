package D7;

import java.lang.reflect.Method;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f649a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        h.b(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (h.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                h.d(parameterTypes, "getParameterTypes(...)");
                if (h.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f649a = method;
        int length2 = methods.length;
        for (int i6 = 0; i6 < length2 && !h.a(methods[i6].getName(), "getSuppressed"); i6++) {
        }
    }
}
