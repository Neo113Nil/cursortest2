package com.google.android.datatransport;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVersionScheduler {
    public static final WinterFlowVersionScheduler WinterFlowCacheManagerAgent = new WinterFlowVersionScheduler();
    public final HashMap WinterFlowRouterStructure = new HashMap();
    public final HashMap WinterFlowHookDataSource = new HashMap();

    public static void WinterFlowHookDataSource(HashMap hashMap, WinterFlowVersionControlDeserialization winterFlowVersionControlDeserialization, WinterFlowMicroserviceProcess winterFlowMicroserviceProcess, Class cls) {
        WinterFlowMicroserviceProcess winterFlowMicroserviceProcess2 = (WinterFlowMicroserviceProcess) hashMap.get(winterFlowVersionControlDeserialization);
        if (winterFlowMicroserviceProcess2 == null || winterFlowMicroserviceProcess == winterFlowMicroserviceProcess2) {
            if (winterFlowMicroserviceProcess2 == null) {
                hashMap.put(winterFlowVersionControlDeserialization, winterFlowMicroserviceProcess);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + winterFlowVersionControlDeserialization.WinterFlowHookDataSource.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + String.valueOf(winterFlowMicroserviceProcess2) + ", new value " + String.valueOf(winterFlowMicroserviceProcess));
    }

    public final WinterFlowRendererAPI WinterFlowRouterStructure(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.WinterFlowRouterStructure;
        if (superclass != null) {
            WinterFlowRendererAPI winterFlowRendererAPI = (WinterFlowRendererAPI) hashMap2.get(superclass);
            if (winterFlowRendererAPI == null) {
                winterFlowRendererAPI = WinterFlowRouterStructure(superclass, null);
            }
            hashMap.putAll(winterFlowRendererAPI.WinterFlowHookDataSource);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            WinterFlowRendererAPI winterFlowRendererAPI2 = (WinterFlowRendererAPI) hashMap2.get(cls2);
            if (winterFlowRendererAPI2 == null) {
                winterFlowRendererAPI2 = WinterFlowRouterStructure(cls2, null);
            }
            for (Map.Entry entry : winterFlowRendererAPI2.WinterFlowHookDataSource.entrySet()) {
                WinterFlowHookDataSource(hashMap, (WinterFlowVersionControlDeserialization) entry.getKey(), (WinterFlowMicroserviceProcess) entry.getValue(), cls);
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
            WinterFlowHook winterFlowHook = (WinterFlowHook) method.getAnnotation(WinterFlowHook.class);
            if (winterFlowHook != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!WinterFlowDecoratorVersion.class.isAssignableFrom(parameterTypes[0])) {
                        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                WinterFlowMicroserviceProcess value = winterFlowHook.value();
                if (parameterTypes.length > 1) {
                    if (!WinterFlowMicroserviceProcess.class.isAssignableFrom(parameterTypes[1])) {
                        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != WinterFlowMicroserviceProcess.ON_ANY) {
                        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("cannot have more than 2 params");
                    return null;
                }
                WinterFlowHookDataSource(hashMap, new WinterFlowVersionControlDeserialization(i, method), value, cls);
                z = true;
            }
        }
        WinterFlowRendererAPI winterFlowRendererAPI3 = new WinterFlowRendererAPI(hashMap);
        hashMap2.put(cls, winterFlowRendererAPI3);
        this.WinterFlowHookDataSource.put(cls, Boolean.valueOf(z));
        return winterFlowRendererAPI3;
    }
}
