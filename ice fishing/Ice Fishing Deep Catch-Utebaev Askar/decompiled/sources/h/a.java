package h;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f127a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f128b;

    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    static {
        Method method;
        boolean z;
        Method[] throwableMethods = Throwable.class.getMethods();
        Intrinsics.checkNotNullExpressionValue(throwableMethods, "throwableMethods");
        int length = throwableMethods.length;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 >= length) {
                break;
            }
            Method method2 = throwableMethods[i2];
            if (Intrinsics.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                Intrinsics.checkNotNullExpressionValue(parameterTypes, "it.parameterTypes");
                Intrinsics.checkNotNullParameter(parameterTypes, "<this>");
                z = Intrinsics.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class);
            }
            if (z) {
                method = method2;
                break;
            }
            i2++;
        }
        f128b = method;
        int length2 = throwableMethods.length;
        for (int i3 = 0; i3 < length2 && !Intrinsics.a(throwableMethods[i3].getName(), "getSuppressed"); i3++) {
        }
    }
}
