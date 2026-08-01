package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
final class WinterFlowRuntimeValidator extends WinterFlowDeserializationNetwork {
    public final WinterFlowJSONProxy WinterFlowRouterStructure;

    public WinterFlowRuntimeValidator(WinterFlowJSONProxy winterFlowJSONProxy) {
        this.WinterFlowRouterStructure = winterFlowJSONProxy;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        WinterFlowThreadPoolTransaction winterFlowThreadPoolTransaction = new WinterFlowThreadPoolTransaction();
        winterFlowThreadPoolTransaction.WinterFlowVariableBandwidth = this.WinterFlowRouterStructure;
        return winterFlowThreadPoolTransaction;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
        WinterFlowThreadPoolTransaction winterFlowThreadPoolTransaction = (WinterFlowThreadPoolTransaction) winterFlowUserManagerController;
        WinterFlowJSONProxy winterFlowJSONProxy = winterFlowThreadPoolTransaction.WinterFlowVariableBandwidth;
        WinterFlowJSONProxy winterFlowJSONProxy2 = this.WinterFlowRouterStructure;
        if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowJSONProxy, winterFlowJSONProxy2) || !winterFlowThreadPoolTransaction.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            return;
        }
        WinterFlowJSONProxy winterFlowJSONProxy3 = winterFlowThreadPoolTransaction.WinterFlowVariableBandwidth;
        winterFlowJSONProxy3.WinterFlowArrayNetwork();
        winterFlowJSONProxy3.WinterFlowHookDataSource = null;
        winterFlowThreadPoolTransaction.WinterFlowVariableBandwidth = winterFlowJSONProxy2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WinterFlowRuntimeValidator) && this.WinterFlowRouterStructure == ((WinterFlowRuntimeValidator) obj).WinterFlowRouterStructure;
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.WinterFlowRouterStructure + ')';
    }
}
