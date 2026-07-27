package kotlin.text;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class CatchingFishRealmDataStore {
    public static final Method CatchingFishParcelableFAB;
    public static final Method CatchingFishSnackbar;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(methods);
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
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(parameterTypes, "getParameterTypes(...)");
                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i2++;
        }
        CatchingFishParcelableFAB = method2;
        int length2 = methods.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            Method method3 = methods[i];
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i++;
        }
        CatchingFishSnackbar = method;
    }
}
