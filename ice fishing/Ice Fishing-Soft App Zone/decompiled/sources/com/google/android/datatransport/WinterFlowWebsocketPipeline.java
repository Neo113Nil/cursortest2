package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWebsocketPipeline implements WinterFlowParserHelper {
    public WinterFlowLoaderHook WinterFlowResponseEngine;
    public Object WinterFlowRouterRouter;
    public Object[] WinterFlowSyntax;
    public final WinterFlowAPISystem WinterFlowTransactionAgent = new WinterFlowAPISystem(15, this);
    public WinterFlowEncryptionComponent WinterFlowTransactionManagerStrategy;
    public String WinterFlowUnitTestResponse;
    public WinterFlowLoaderConsumer WinterFlowVariableVersionControl;

    public WinterFlowWebsocketPipeline(WinterFlowLoaderConsumer winterFlowLoaderConsumer, WinterFlowEncryptionComponent winterFlowEncryptionComponent, String str, Object obj, Object[] objArr) {
        this.WinterFlowVariableVersionControl = winterFlowLoaderConsumer;
        this.WinterFlowTransactionManagerStrategy = winterFlowEncryptionComponent;
        this.WinterFlowUnitTestResponse = str;
        this.WinterFlowRouterRouter = obj;
        this.WinterFlowSyntax = objArr;
    }

    @Override // com.google.android.datatransport.WinterFlowParserHelper
    public final void WinterFlowCacheManagerAgent() {
        WinterFlowLoaderHook winterFlowLoaderHook = this.WinterFlowResponseEngine;
        if (winterFlowLoaderHook != null) {
            ((WinterFlowObjectPackage) winterFlowLoaderHook).WinterFlowCompilerVariable();
        }
    }

    public final void WinterFlowHookDataSource() {
        String WinterFlowCacheManagerAgent;
        WinterFlowEncryptionComponent winterFlowEncryptionComponent = this.WinterFlowTransactionManagerStrategy;
        if (this.WinterFlowResponseEngine != null) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterAdapter("entry(", this.WinterFlowResponseEngine, ") is not null");
            return;
        }
        if (winterFlowEncryptionComponent != null) {
            WinterFlowAPISystem winterFlowAPISystem = this.WinterFlowTransactionAgent;
            Object WinterFlowRouterStructure = winterFlowAPISystem.WinterFlowRouterStructure();
            if (WinterFlowRouterStructure == null || winterFlowEncryptionComponent.WinterFlowCacheManagerAgent(WinterFlowRouterStructure)) {
                this.WinterFlowResponseEngine = winterFlowEncryptionComponent.WinterFlowArrayNetwork(this.WinterFlowUnitTestResponse, winterFlowAPISystem);
                return;
            }
            if (WinterFlowRouterStructure instanceof WinterFlowTransactionUnitTest) {
                WinterFlowTransactionUnitTest winterFlowTransactionUnitTest = (WinterFlowTransactionUnitTest) WinterFlowRouterStructure;
                if (winterFlowTransactionUnitTest.WinterFlowVariableVersionControl() == WinterFlowSessionManagerProcess.WinterFlowRouterAdapter || winterFlowTransactionUnitTest.WinterFlowVariableVersionControl() == WinterFlowSessionManagerProcess.WinterFlowResolverController || winterFlowTransactionUnitTest.WinterFlowVariableVersionControl() == WinterFlowSessionManagerProcess.WinterFlowMapperProtocol) {
                    WinterFlowCacheManagerAgent = "MutableState containing " + winterFlowTransactionUnitTest.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    WinterFlowCacheManagerAgent = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                WinterFlowCacheManagerAgent = WinterFlowWorkerVersionControl.WinterFlowCacheManagerAgent(WinterFlowRouterStructure);
            }
            throw new IllegalArgumentException(WinterFlowCacheManagerAgent);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowParserHelper
    public final void WinterFlowRouterStructure() {
        WinterFlowHookDataSource();
    }

    @Override // com.google.android.datatransport.WinterFlowParserHelper
    public final void WinterFlowVariableVersionControl() {
        WinterFlowLoaderHook winterFlowLoaderHook = this.WinterFlowResponseEngine;
        if (winterFlowLoaderHook != null) {
            ((WinterFlowObjectPackage) winterFlowLoaderHook).WinterFlowCompilerVariable();
        }
    }
}
