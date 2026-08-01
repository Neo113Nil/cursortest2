package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInheritanceObject {
    public WinterFlowJSON WinterFlowArrayNetwork;
    public WinterFlowJSON WinterFlowCacheManagerAgent;
    public int WinterFlowHookDataSource;
    public WinterFlowUserManagerController WinterFlowRouterStructure;
    public final /* synthetic */ WinterFlowExceptionStrategy WinterFlowTransactionManagerStrategy;
    public boolean WinterFlowVariableVersionControl;

    public WinterFlowInheritanceObject(WinterFlowExceptionStrategy winterFlowExceptionStrategy, WinterFlowUserManagerController winterFlowUserManagerController, int i, WinterFlowJSON winterFlowJSON, WinterFlowJSON winterFlowJSON2, boolean z) {
        this.WinterFlowTransactionManagerStrategy = winterFlowExceptionStrategy;
        this.WinterFlowRouterStructure = winterFlowUserManagerController;
        this.WinterFlowHookDataSource = i;
        this.WinterFlowCacheManagerAgent = winterFlowJSON;
        this.WinterFlowArrayNetwork = winterFlowJSON2;
        this.WinterFlowVariableVersionControl = z;
    }

    public final boolean WinterFlowRouterStructure(int i, int i2) {
        WinterFlowJSON winterFlowJSON = this.WinterFlowCacheManagerAgent;
        int i3 = this.WinterFlowHookDataSource;
        WinterFlowDeserializationModule winterFlowDeserializationModule = (WinterFlowDeserializationModule) winterFlowJSON.WinterFlowVariableVersionControl[i + i3];
        WinterFlowDeserializationModule winterFlowDeserializationModule2 = (WinterFlowDeserializationModule) this.WinterFlowArrayNetwork.WinterFlowVariableVersionControl[i3 + i2];
        return WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowDeserializationModule, winterFlowDeserializationModule2) || winterFlowDeserializationModule.getClass() == winterFlowDeserializationModule2.getClass();
    }
}
