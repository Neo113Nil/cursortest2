package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowXMLThread implements WinterFlowNodeProtocol {
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowXMLThread(int i, Object obj) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowNodeProtocol
    public final void WinterFlowTransactionAgent(WinterFlowDecoratorVersion winterFlowDecoratorVersion, WinterFlowMicroserviceProcess winterFlowMicroserviceProcess) {
        int i = this.WinterFlowVariableVersionControl;
        int i2 = 0;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowProcessorProtocol winterFlowProcessorProtocol = (WinterFlowProcessorProtocol) obj;
                winterFlowProcessorProtocol.WinterFlowConcurrencyThread = winterFlowMicroserviceProcess.WinterFlowRouterStructure();
                if (winterFlowProcessorProtocol.WinterFlowCacheManagerAgent != null) {
                    ArrayList WinterFlowFrameworkCacheManager = WinterFlowSerializerUtility.WinterFlowFrameworkCacheManager(winterFlowProcessorProtocol.WinterFlowTransactionManagerStrategy);
                    int size = WinterFlowFrameworkCacheManager.size();
                    while (i2 < size) {
                        Object obj2 = WinterFlowFrameworkCacheManager.get(i2);
                        i2++;
                        WinterFlowLibrarySessionManager winterFlowLibrarySessionManager = (WinterFlowLibrarySessionManager) obj2;
                        winterFlowLibrarySessionManager.getClass();
                        WinterFlowListenerProcess winterFlowListenerProcess = winterFlowLibrarySessionManager.WinterFlowServerProtocol;
                        winterFlowListenerProcess.getClass();
                        winterFlowListenerProcess.WinterFlowRouterStructure.WinterFlowRouterRouter = winterFlowMicroserviceProcess.WinterFlowRouterStructure();
                        winterFlowListenerProcess.WinterFlowArrayNetwork = winterFlowMicroserviceProcess.WinterFlowRouterStructure();
                        winterFlowListenerProcess.WinterFlowHookDataSource();
                    }
                    break;
                }
                break;
            default:
                WinterFlowNodeGateway winterFlowNodeGateway = (WinterFlowNodeGateway) obj;
                if (winterFlowMicroserviceProcess != WinterFlowMicroserviceProcess.ON_START) {
                    if (winterFlowMicroserviceProcess == WinterFlowMicroserviceProcess.ON_STOP) {
                        winterFlowNodeGateway.WinterFlowRouterRouter = false;
                        break;
                    }
                } else {
                    winterFlowNodeGateway.WinterFlowRouterRouter = true;
                    break;
                }
                break;
        }
    }
}
