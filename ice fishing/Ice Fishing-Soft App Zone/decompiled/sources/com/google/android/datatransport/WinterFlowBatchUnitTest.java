package com.google.android.datatransport;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBatchUnitTest extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public final /* synthetic */ boolean WinterFlowBandwidthObject;
    public int WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowTransactionInterface WinterFlowServerProtocol;
    public final /* synthetic */ Object WinterFlowServiceUtility;
    public WinterFlowTransactionInterface WinterFlowSyntax;
    public final /* synthetic */ WinterFlowStrategyResolver WinterFlowThreadListener;
    public /* synthetic */ Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowBatchUnitTest(WinterFlowTransactionInterface winterFlowTransactionInterface, WinterFlowStrategyResolver winterFlowStrategyResolver, Object obj, boolean z, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowServerProtocol = winterFlowTransactionInterface;
        this.WinterFlowThreadListener = winterFlowStrategyResolver;
        this.WinterFlowServiceUtility = obj;
        this.WinterFlowBandwidthObject = z;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        WinterFlowBatchUnitTest winterFlowBatchUnitTest = new WinterFlowBatchUnitTest(this.WinterFlowServerProtocol, this.WinterFlowThreadListener, this.WinterFlowServiceUtility, this.WinterFlowBandwidthObject, winterFlowTransactionManagerLayer);
        winterFlowBatchUnitTest.WinterFlowTransactionAgent = obj;
        return winterFlowBatchUnitTest;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r6.WinterFlowHookDataSource(r2, r8) == r7) goto L16;
     */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowNodeView winterFlowNodeView;
        WinterFlowTransactionInterface winterFlowTransactionInterface;
        int i = this.WinterFlowResponseEngine;
        Object obj2 = this.WinterFlowServiceUtility;
        WinterFlowStrategyResolver winterFlowStrategyResolver = this.WinterFlowThreadListener;
        WinterFlowTransactionInterface winterFlowTransactionInterface2 = this.WinterFlowServerProtocol;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (i == 0) {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            WinterFlowNodeView winterFlowNodeView2 = (WinterFlowNodeView) this.WinterFlowTransactionAgent;
            WinterFlowDebugStrategy WinterFlowHookDataSource = winterFlowStrategyResolver.WinterFlowHookDataSource();
            this.WinterFlowTransactionAgent = winterFlowNodeView2;
            this.WinterFlowSyntax = winterFlowTransactionInterface2;
            this.WinterFlowResponseEngine = 1;
            Integer num = new Integer(((AtomicInteger) WinterFlowHookDataSource.WinterFlowHookDataSource.WinterFlowTransactionManagerStrategy).incrementAndGet());
            if (num != winterFlowListenerJava) {
                winterFlowNodeView = winterFlowNodeView2;
                obj = num;
                winterFlowTransactionInterface = winterFlowTransactionInterface2;
            }
            return winterFlowListenerJava;
        }
        if (i != 1) {
            if (i != 2) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            if (this.WinterFlowBandwidthObject) {
                winterFlowStrategyResolver.WinterFlowServerProtocol.WinterFlowCacheManagerAgent(new WinterFlowDebugMechanism(obj2 != null ? obj2.hashCode() : 0, winterFlowTransactionInterface2.WinterFlowVariableVersionControl, obj2));
            }
            return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        }
        winterFlowTransactionInterface = this.WinterFlowSyntax;
        winterFlowNodeView = (WinterFlowNodeView) this.WinterFlowTransactionAgent;
        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        winterFlowTransactionInterface.WinterFlowVariableVersionControl = ((Number) obj).intValue();
        this.WinterFlowTransactionAgent = null;
        this.WinterFlowSyntax = null;
        this.WinterFlowResponseEngine = 2;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowBatchUnitTest) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowNodeView) obj)).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
