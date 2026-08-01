package com.google.android.datatransport;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConfigurationFrontend implements WinterFlowHookTool {
    public final AtomicReference WinterFlowRouterStructure;

    public WinterFlowConfigurationFrontend(WinterFlowHookTool winterFlowHookTool) {
        this.WinterFlowRouterStructure = new AtomicReference(winterFlowHookTool);
    }

    @Override // com.google.android.datatransport.WinterFlowHookTool
    public final Iterator iterator() {
        WinterFlowHookTool winterFlowHookTool = (WinterFlowHookTool) this.WinterFlowRouterStructure.getAndSet(null);
        if (winterFlowHookTool != null) {
            return winterFlowHookTool.iterator();
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This sequence can be consumed only once.");
        return null;
    }
}
