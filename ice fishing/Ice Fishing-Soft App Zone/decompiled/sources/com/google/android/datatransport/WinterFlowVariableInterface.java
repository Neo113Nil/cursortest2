package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowVariableInterface {
    public final WinterFlowJSON WinterFlowRouterStructure = new WinterFlowJSON(new WinterFlowServiceProviderDataSource[16]);
    public final WinterFlowMicroserviceFunction WinterFlowHookDataSource = new WinterFlowMicroserviceFunction(10);

    public void WinterFlowHookDataSource(WinterFlowCacheModule winterFlowCacheModule) {
        WinterFlowJSON winterFlowJSON = this.WinterFlowRouterStructure;
        int i = winterFlowJSON.WinterFlowUnitTestResponse;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((WinterFlowServiceProviderDataSource) winterFlowJSON.WinterFlowVariableVersionControl[i]).WinterFlowArrayNetwork.WinterFlowRouterStructure == 0) {
                winterFlowJSON.WinterFlowTransactionAgent(i);
            }
        }
    }

    public boolean WinterFlowRouterStructure(WinterFlowDatabaseRenderer winterFlowDatabaseRenderer, WinterFlowAlgorithmHandler winterFlowAlgorithmHandler, WinterFlowCacheModule winterFlowCacheModule, boolean z) {
        WinterFlowJSON winterFlowJSON = this.WinterFlowRouterStructure;
        Object[] objArr = winterFlowJSON.WinterFlowVariableVersionControl;
        int i = winterFlowJSON.WinterFlowUnitTestResponse;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((WinterFlowServiceProviderDataSource) objArr[i2]).WinterFlowRouterStructure(winterFlowDatabaseRenderer, winterFlowAlgorithmHandler, winterFlowCacheModule, z) || z2;
        }
        return z2;
    }
}
