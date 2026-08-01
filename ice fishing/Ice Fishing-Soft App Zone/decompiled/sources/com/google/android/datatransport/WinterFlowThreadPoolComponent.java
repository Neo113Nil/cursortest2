package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowThreadPoolComponent extends WinterFlowFrameworkController implements WinterFlowEventEvent {
    public int WinterFlowResponseEngine;
    public long[] WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowConsumerDecorator WinterFlowServerProtocol;
    public int WinterFlowSyntax;
    public final /* synthetic */ WinterFlowNetworkHelper WinterFlowThreadListener;
    public /* synthetic */ Object WinterFlowTransactionAgent;
    public WinterFlowNetworkHelper WinterFlowTransactionManagerStrategy;
    public WinterFlowConsumerDecorator WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowThreadPoolComponent(WinterFlowConsumerDecorator winterFlowConsumerDecorator, WinterFlowNetworkHelper winterFlowNetworkHelper, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(winterFlowTransactionManagerLayer);
        this.WinterFlowServerProtocol = winterFlowConsumerDecorator;
        this.WinterFlowThreadListener = winterFlowNetworkHelper;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        WinterFlowThreadPoolComponent winterFlowThreadPoolComponent = new WinterFlowThreadPoolComponent(this.WinterFlowServerProtocol, this.WinterFlowThreadListener, winterFlowTransactionManagerLayer);
        winterFlowThreadPoolComponent.WinterFlowTransactionAgent = obj;
        return winterFlowThreadPoolComponent;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowAPIProcess winterFlowAPIProcess;
        WinterFlowConsumerDecorator winterFlowConsumerDecorator;
        long[] jArr;
        int i;
        WinterFlowNetworkHelper winterFlowNetworkHelper;
        int i2 = this.WinterFlowResponseEngine;
        if (i2 == 0) {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            winterFlowAPIProcess = (WinterFlowAPIProcess) this.WinterFlowTransactionAgent;
            winterFlowConsumerDecorator = this.WinterFlowServerProtocol;
            WinterFlowLibraryProcess winterFlowLibraryProcess = winterFlowConsumerDecorator.WinterFlowTransactionManagerStrategy;
            jArr = winterFlowLibraryProcess.WinterFlowCacheManagerAgent;
            i = winterFlowLibraryProcess.WinterFlowVariableVersionControl;
            winterFlowNetworkHelper = this.WinterFlowThreadListener;
        } else {
            if (i2 != 1) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.WinterFlowSyntax;
            jArr = this.WinterFlowRouterRouter;
            winterFlowConsumerDecorator = this.WinterFlowUnitTestResponse;
            winterFlowNetworkHelper = this.WinterFlowTransactionManagerStrategy;
            winterFlowAPIProcess = (WinterFlowAPIProcess) this.WinterFlowTransactionAgent;
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        winterFlowNetworkHelper.WinterFlowTransactionManagerStrategy = i;
        Object obj2 = winterFlowConsumerDecorator.WinterFlowTransactionManagerStrategy.WinterFlowHookDataSource[i];
        this.WinterFlowTransactionAgent = winterFlowAPIProcess;
        this.WinterFlowTransactionManagerStrategy = winterFlowNetworkHelper;
        this.WinterFlowUnitTestResponse = winterFlowConsumerDecorator;
        this.WinterFlowRouterRouter = jArr;
        this.WinterFlowSyntax = i3;
        this.WinterFlowResponseEngine = 1;
        winterFlowAPIProcess.WinterFlowHookDataSource(obj2, this);
        return WinterFlowListenerJava.WinterFlowVariableVersionControl;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowThreadPoolComponent) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAPIProcess) obj)).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
