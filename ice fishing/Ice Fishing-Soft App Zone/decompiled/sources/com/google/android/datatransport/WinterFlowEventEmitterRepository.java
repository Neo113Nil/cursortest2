package com.google.android.datatransport;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowEventEmitterRepository {
    public static final WinterFlowFrameworkNetwork WinterFlowRouterStructure;

    static {
        String str;
        int i = WinterFlowInterfaceTransaction.WinterFlowRouterStructure;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = WinterFlowFrontendSubsystem.WinterFlowBandwidthObject(WinterFlowFrontendSubsystem.WinterFlowThreadListener(Arrays.asList(new WinterFlowBackendMapper()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    ((WinterFlowBackendMapper) obj).getClass();
                    do {
                        ((WinterFlowBackendMapper) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((WinterFlowBackendMapper) obj) == null) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                WinterFlowRouterStructure = new WinterFlowFrameworkNetwork(WinterFlowProxySystem.WinterFlowRouterStructure(mainLooper));
            } else {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("The main looper is not available");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
