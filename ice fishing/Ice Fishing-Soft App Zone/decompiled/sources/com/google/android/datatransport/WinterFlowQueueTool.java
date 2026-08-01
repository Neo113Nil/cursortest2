package com.google.android.datatransport;

import java.util.Random;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowQueueTool extends WinterFlowOrchestrationFramework {
    public abstract Random WinterFlowArrayNetwork();

    @Override // com.google.android.datatransport.WinterFlowOrchestrationFramework
    public final int WinterFlowHookDataSource() {
        return WinterFlowArrayNetwork().nextInt();
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationFramework
    public final int WinterFlowRouterStructure(int i) {
        return (WinterFlowArrayNetwork().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }
}
