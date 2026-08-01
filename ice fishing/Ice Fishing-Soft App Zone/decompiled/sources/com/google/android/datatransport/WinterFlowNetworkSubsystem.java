package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowNetworkSubsystem {
    public static final ThreadLocal WinterFlowRouterStructure = new ThreadLocal();

    public static WinterFlowResponseObject WinterFlowRouterStructure() {
        ThreadLocal threadLocal = WinterFlowRouterStructure;
        WinterFlowResponseObject winterFlowResponseObject = (WinterFlowResponseObject) threadLocal.get();
        if (winterFlowResponseObject != null) {
            return winterFlowResponseObject;
        }
        WinterFlowUserManagerNode winterFlowUserManagerNode = new WinterFlowUserManagerNode(Thread.currentThread());
        threadLocal.set(winterFlowUserManagerNode);
        return winterFlowUserManagerNode;
    }
}
