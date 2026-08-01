package com.google.android.datatransport;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowRequestBandwidth {
    public static final Method WinterFlowHookDataSource;
    public static final Method WinterFlowRouterStructure;

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
            if (WinterFlowManagerRequest.WinterFlowThreadListener(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (WinterFlowManagerRequest.WinterFlowThreadListener(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i2++;
        }
        WinterFlowRouterStructure = method2;
        int length2 = methods.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            Method method3 = methods[i];
            if (WinterFlowManagerRequest.WinterFlowThreadListener(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i++;
        }
        WinterFlowHookDataSource = method;
    }
}
