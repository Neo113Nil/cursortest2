package com.google.android.datatransport;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowSerializerSystem {
    public static final int WinterFlowArrayNetwork;
    public static final int WinterFlowCacheManagerAgent;
    public static final long WinterFlowHookDataSource;
    public static final String WinterFlowRouterStructure;
    public static final WinterFlowCacheUtility WinterFlowTransactionManagerStrategy;
    public static final long WinterFlowVariableVersionControl;

    static {
        String str;
        int i = WinterFlowInterfaceTransaction.WinterFlowRouterStructure;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        WinterFlowRouterStructure = str;
        WinterFlowHookDataSource = WinterFlowDecoratorRouter.WinterFlowTransactionAgent("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = WinterFlowInterfaceTransaction.WinterFlowRouterStructure;
        if (i2 < 2) {
            i2 = 2;
        }
        WinterFlowCacheManagerAgent = WinterFlowDecoratorRouter.WinterFlowServerProtocol("kotlinx.coroutines.scheduler.core.pool.size", i2, 8);
        WinterFlowArrayNetwork = WinterFlowDecoratorRouter.WinterFlowServerProtocol("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        WinterFlowVariableVersionControl = TimeUnit.SECONDS.toNanos(WinterFlowDecoratorRouter.WinterFlowTransactionAgent("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        WinterFlowTransactionManagerStrategy = WinterFlowCacheUtility.WinterFlowUserManagerUserManager;
    }
}
