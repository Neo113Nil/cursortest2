package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
final class WinterFlowObjectGateway extends WinterFlowDeserializationNetwork {
    public final WinterFlowObjectSession WinterFlowRouterStructure;

    public WinterFlowObjectGateway(WinterFlowObjectSession winterFlowObjectSession) {
        this.WinterFlowRouterStructure = winterFlowObjectSession;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        WinterFlowSingletonThread winterFlowSingletonThread = new WinterFlowSingletonThread();
        winterFlowSingletonThread.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        return winterFlowSingletonThread;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
        WinterFlowUIMicroservice winterFlowUIMicroservice;
        WinterFlowSingletonThread winterFlowSingletonThread = (WinterFlowSingletonThread) winterFlowUserManagerController;
        WinterFlowObjectSession winterFlowObjectSession = this.WinterFlowRouterStructure;
        winterFlowSingletonThread.WinterFlowVariableBandwidth = winterFlowObjectSession;
        if (winterFlowSingletonThread.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform && (winterFlowUIMicroservice = WinterFlowCloudStack.WinterFlowUserManagerUserManager(winterFlowSingletonThread, 2).WinterFlowBatchUI) != null) {
            winterFlowUIMicroservice.WinterFlowInterfaceSubsystem(winterFlowObjectSession, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WinterFlowObjectGateway) {
            return this.WinterFlowRouterStructure == ((WinterFlowObjectGateway) obj).WinterFlowRouterStructure;
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode();
    }
}
