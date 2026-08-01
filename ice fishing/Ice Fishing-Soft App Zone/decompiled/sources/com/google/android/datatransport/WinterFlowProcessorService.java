package com.google.android.datatransport;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProcessorService implements WinterFlowExceptionProcessor, WinterFlowServiceProviderEngine {
    public ArrayDeque WinterFlowHookDataSource;
    public final HashMap WinterFlowRouterStructure;

    public WinterFlowProcessorService() {
        WinterFlowProcessorModule winterFlowProcessorModule = WinterFlowProcessorModule.WinterFlowVariableVersionControl;
        this.WinterFlowRouterStructure = new HashMap();
        this.WinterFlowHookDataSource = new ArrayDeque();
    }

    public final void WinterFlowRouterStructure(WinterFlowCompilerMechanism winterFlowCompilerMechanism) {
        WinterFlowProcessorModule winterFlowProcessorModule = WinterFlowProcessorModule.WinterFlowVariableVersionControl;
        synchronized (this) {
            try {
                if (!this.WinterFlowRouterStructure.containsKey(WinterFlowHandlerWebsocket.class)) {
                    this.WinterFlowRouterStructure.put(WinterFlowHandlerWebsocket.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.WinterFlowRouterStructure.get(WinterFlowHandlerWebsocket.class)).put(winterFlowCompilerMechanism, winterFlowProcessorModule);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
