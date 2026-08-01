package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSingletonQuery implements WinterFlowLoaderUtility {
    public boolean WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowSingletonQuery(Object obj, boolean z) {
        this.WinterFlowVariableVersionControl = obj;
        this.WinterFlowTransactionManagerStrategy = z;
    }

    @Override // com.google.android.datatransport.WinterFlowLoaderUtility
    public long WinterFlowConfigurationSubsystem(int i, long j, long j2) {
        if (!this.WinterFlowTransactionManagerStrategy) {
            return 0L;
        }
        WinterFlowTransactionManagerService winterFlowTransactionManagerService = (WinterFlowTransactionManagerService) this.WinterFlowVariableVersionControl;
        if (winterFlowTransactionManagerService.WinterFlowRouterStructure.WinterFlowHookDataSource()) {
            return 0L;
        }
        return winterFlowTransactionManagerService.WinterFlowRouterRouter(winterFlowTransactionManagerService.WinterFlowArrayNetwork(winterFlowTransactionManagerService.WinterFlowRouterStructure.WinterFlowVariableVersionControl(winterFlowTransactionManagerService.WinterFlowArrayNetwork(winterFlowTransactionManagerService.WinterFlowUnitTestResponse(j2)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.google.android.datatransport.WinterFlowLoaderUtility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object WinterFlowPackageIDE(long j, long j2, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        WinterFlowConfigurationTesting winterFlowConfigurationTesting;
        int i;
        long j3;
        if (winterFlowTransactionManagerLayer instanceof WinterFlowConfigurationTesting) {
            winterFlowConfigurationTesting = (WinterFlowConfigurationTesting) winterFlowTransactionManagerLayer;
            int i2 = winterFlowConfigurationTesting.WinterFlowTransactionAgent;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                winterFlowConfigurationTesting.WinterFlowTransactionAgent = i2 - Integer.MIN_VALUE;
                Object obj = winterFlowConfigurationTesting.WinterFlowSyntax;
                i = winterFlowConfigurationTesting.WinterFlowTransactionAgent;
                if (i != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    j3 = 0;
                    if (this.WinterFlowTransactionManagerStrategy) {
                        WinterFlowTransactionManagerService winterFlowTransactionManagerService = (WinterFlowTransactionManagerService) this.WinterFlowVariableVersionControl;
                        if (!winterFlowTransactionManagerService.WinterFlowSyntax) {
                            winterFlowConfigurationTesting.WinterFlowRouterRouter = j2;
                            winterFlowConfigurationTesting.WinterFlowTransactionAgent = 1;
                            obj = winterFlowTransactionManagerService.WinterFlowRouterStructure(j2, winterFlowConfigurationTesting);
                            WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                            if (obj == winterFlowListenerJava) {
                                return winterFlowListenerJava;
                            }
                        }
                        j3 = WinterFlowXMLNetwork.WinterFlowArrayNetwork(j2, j3);
                    }
                    return new WinterFlowXMLNetwork(j3);
                }
                if (i != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = winterFlowConfigurationTesting.WinterFlowRouterRouter;
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                j3 = ((WinterFlowXMLNetwork) obj).WinterFlowRouterStructure;
                j3 = WinterFlowXMLNetwork.WinterFlowArrayNetwork(j2, j3);
                return new WinterFlowXMLNetwork(j3);
            }
        }
        winterFlowConfigurationTesting = new WinterFlowConfigurationTesting(this, (WinterFlowOrchestrationCompiler) winterFlowTransactionManagerLayer);
        Object obj2 = winterFlowConfigurationTesting.WinterFlowSyntax;
        i = winterFlowConfigurationTesting.WinterFlowTransactionAgent;
        if (i != 0) {
        }
        j3 = ((WinterFlowXMLNetwork) obj2).WinterFlowRouterStructure;
        j3 = WinterFlowXMLNetwork.WinterFlowArrayNetwork(j2, j3);
        return new WinterFlowXMLNetwork(j3);
    }

    public WinterFlowSingletonQuery(String str, boolean z) {
        this.WinterFlowTransactionManagerStrategy = z;
        this.WinterFlowVariableVersionControl = str;
    }
}
