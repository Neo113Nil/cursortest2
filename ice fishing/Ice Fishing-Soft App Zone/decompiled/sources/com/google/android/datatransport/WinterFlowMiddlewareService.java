package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMiddlewareService extends WinterFlowProtocolNetwork {
    public static final WinterFlowOrchestrationSession WinterFlowArrayNetwork = new WinterFlowOrchestrationSession(0);
    public static volatile WinterFlowMiddlewareService WinterFlowCacheManagerAgent;
    public final WinterFlowHandlerResponse WinterFlowHookDataSource = new WinterFlowHandlerResponse();

    public static WinterFlowMiddlewareService WinterFlowServiceUtility() {
        if (WinterFlowCacheManagerAgent != null) {
            return WinterFlowCacheManagerAgent;
        }
        synchronized (WinterFlowMiddlewareService.class) {
            try {
                if (WinterFlowCacheManagerAgent == null) {
                    WinterFlowCacheManagerAgent = new WinterFlowMiddlewareService();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return WinterFlowCacheManagerAgent;
    }
}
