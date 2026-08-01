package com.google.android.datatransport;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCompilerAlgorithm implements WinterFlowListenerModule, WinterFlowMicroserviceMiddleware, WinterFlowTransactionDeserialization, WinterFlowDeserializationProcess {
    public final CountDownLatch WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowCompilerAlgorithm() {
        this.WinterFlowVariableVersionControl = new CountDownLatch(1);
    }

    @Override // com.google.android.datatransport.WinterFlowMicroserviceMiddleware
    public void WinterFlowArrayNetwork(Exception exc) {
        this.WinterFlowVariableVersionControl.countDown();
    }

    @Override // com.google.android.datatransport.WinterFlowListenerModule
    public void WinterFlowCacheManagerAgent(Object obj) {
        this.WinterFlowVariableVersionControl.countDown();
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionDeserialization
    public void WinterFlowHookDataSource() {
        this.WinterFlowVariableVersionControl.countDown();
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationProcess
    public /* synthetic */ void WinterFlowRouterStructure(WinterFlowExceptionParser winterFlowExceptionParser) {
        this.WinterFlowVariableVersionControl.countDown();
    }
}
