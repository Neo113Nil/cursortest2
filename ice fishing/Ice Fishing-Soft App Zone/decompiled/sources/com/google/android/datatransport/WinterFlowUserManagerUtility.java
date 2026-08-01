package com.google.android.datatransport;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUserManagerUtility extends WinterFlowTestingAgent {
    public final AtomicReference WinterFlowRouterStructure = new AtomicReference(null);

    @Override // com.google.android.datatransport.WinterFlowTestingAgent
    public final WinterFlowTransactionManagerLayer[] WinterFlowHookDataSource(WinterFlowWorkerSession winterFlowWorkerSession) {
        this.WinterFlowRouterStructure.set(null);
        return WinterFlowEncryptionSubsystem.WinterFlowRouterStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowTestingAgent
    public final boolean WinterFlowRouterStructure(WinterFlowWorkerSession winterFlowWorkerSession) {
        AtomicReference atomicReference = this.WinterFlowRouterStructure;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(WinterFlowTestingCloud.WinterFlowRouterRouter);
        return true;
    }
}
