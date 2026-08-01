package com.google.android.datatransport;

import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFunctionScript implements WinterFlowVersionEngine {
    public final /* synthetic */ WinterFlowConfigurationSubsystem WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ List WinterFlowVariableVersionControl;

    public WinterFlowFunctionScript(List list, WinterFlowConfigurationSubsystem winterFlowConfigurationSubsystem) {
        this.WinterFlowVariableVersionControl = list;
        this.WinterFlowTransactionManagerStrategy = winterFlowConfigurationSubsystem;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionEngine
    public final Object WinterFlowTransactionAgent(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        WinterFlowExceptionFramework winterFlowExceptionFramework = (WinterFlowExceptionFramework) obj;
        int intValue = ((Number) obj2).intValue();
        WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowExceptionFramework) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= winterFlowResolverLibrary.WinterFlowCacheManagerAgent(intValue) ? 32 : 16;
        }
        int i2 = 1;
        int i3 = 0;
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i & 1, (i & 147) != 146)) {
            WinterFlowCloudMicroservice winterFlowCloudMicroservice = (WinterFlowCloudMicroservice) this.WinterFlowVariableVersionControl.get(intValue);
            winterFlowResolverLibrary.WinterFlowCompilerDataSource(1554789641);
            WinterFlowConfigurationSubsystem winterFlowConfigurationSubsystem = this.WinterFlowTransactionManagerStrategy;
            boolean WinterFlowVariableVersionControl = winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowConfigurationSubsystem) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowCloudMicroservice);
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = WinterFlowModuleModule.WinterFlowRouterStructure;
            if (WinterFlowVariableVersionControl || WinterFlowSyntaxSubsystem == winterFlowThreadPoolProcess) {
                WinterFlowSyntaxSubsystem = new WinterFlowHookComponent(winterFlowConfigurationSubsystem, winterFlowCloudMicroservice, i3);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            }
            WinterFlowObjectUI winterFlowObjectUI = (WinterFlowObjectUI) WinterFlowSyntaxSubsystem;
            boolean WinterFlowVariableVersionControl2 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowConfigurationSubsystem) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowCloudMicroservice);
            Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowVariableVersionControl2 || WinterFlowSyntaxSubsystem2 == winterFlowThreadPoolProcess) {
                WinterFlowSyntaxSubsystem2 = new WinterFlowHookComponent(winterFlowConfigurationSubsystem, winterFlowCloudMicroservice, i2);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
            }
            WinterFlowUnitTestLibrary.WinterFlowArrayNetwork(winterFlowCloudMicroservice, winterFlowObjectUI, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem2, winterFlowResolverLibrary, 0);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }
}
