package kotlin.text;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishBiometricKtor {
    public static final CatchingFishBiometricKtor CatchingFishCoroutine = new CatchingFishBiometricKtor();
    public final HashMap CatchingFishParcelableFAB = new HashMap();
    public final HashMap CatchingFishSnackbar = new HashMap();

    public static void CatchingFishSnackbar(HashMap hashMap, CatchingFishHiltDaggerHilt catchingFishHiltDaggerHilt, CatchingFishToolbarLiveData catchingFishToolbarLiveData, Class cls) {
        CatchingFishToolbarLiveData catchingFishToolbarLiveData2 = (CatchingFishToolbarLiveData) hashMap.get(catchingFishHiltDaggerHilt);
        if (catchingFishToolbarLiveData2 == null || catchingFishToolbarLiveData == catchingFishToolbarLiveData2) {
            if (catchingFishToolbarLiveData2 == null) {
                hashMap.put(catchingFishHiltDaggerHilt, catchingFishToolbarLiveData);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + catchingFishHiltDaggerHilt.CatchingFishSnackbar.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + catchingFishToolbarLiveData2 + ", new value " + catchingFishToolbarLiveData);
    }

    public final CatchingFishOkHttpCameraX CatchingFishParcelableFAB(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.CatchingFishParcelableFAB;
        if (superclass != null) {
            CatchingFishOkHttpCameraX catchingFishOkHttpCameraX = (CatchingFishOkHttpCameraX) hashMap2.get(superclass);
            if (catchingFishOkHttpCameraX == null) {
                catchingFishOkHttpCameraX = CatchingFishParcelableFAB(superclass, null);
            }
            hashMap.putAll(catchingFishOkHttpCameraX.CatchingFishSnackbar);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            CatchingFishOkHttpCameraX catchingFishOkHttpCameraX2 = (CatchingFishOkHttpCameraX) hashMap2.get(cls2);
            if (catchingFishOkHttpCameraX2 == null) {
                catchingFishOkHttpCameraX2 = CatchingFishParcelableFAB(cls2, null);
            }
            for (Map.Entry entry : catchingFishOkHttpCameraX2.CatchingFishSnackbar.entrySet()) {
                CatchingFishSnackbar(hashMap, (CatchingFishHiltDaggerHilt) entry.getKey(), (CatchingFishToolbarLiveData) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            CatchingFishCustomViewToast catchingFishCustomViewToast = (CatchingFishCustomViewToast) method.getAnnotation(CatchingFishCustomViewToast.class);
            if (catchingFishCustomViewToast != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!CatchingFishToastFlux.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                CatchingFishToolbarLiveData value = catchingFishCustomViewToast.value();
                if (parameterTypes.length > 1) {
                    if (!CatchingFishToolbarLiveData.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != CatchingFishToolbarLiveData.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                CatchingFishSnackbar(hashMap, new CatchingFishHiltDaggerHilt(i, method), value, cls);
                z = true;
            }
        }
        CatchingFishOkHttpCameraX catchingFishOkHttpCameraX3 = new CatchingFishOkHttpCameraX(hashMap);
        hashMap2.put(cls, catchingFishOkHttpCameraX3);
        this.CatchingFishSnackbar.put(cls, Boolean.valueOf(z));
        return catchingFishOkHttpCameraX3;
    }
}
