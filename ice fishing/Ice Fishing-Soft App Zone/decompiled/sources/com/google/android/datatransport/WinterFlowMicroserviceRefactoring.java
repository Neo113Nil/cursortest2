package com.google.android.datatransport;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowMicroserviceRefactoring extends WinterFlowVariableDeserialization implements WinterFlowVersionControlView, WinterFlowEncryptionIDE {
    public WinterFlowControllerTransaction WinterFlowRouterRouter;

    @Override // com.google.android.datatransport.WinterFlowEncryptionIDE
    public final WinterFlowFrontendAPI WinterFlowArrayNetwork() {
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionIDE
    public final boolean WinterFlowHookDataSource() {
        return true;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionControlView
    public final void WinterFlowRouterStructure() {
        WinterFlowMicroserviceRefactoring winterFlowMicroserviceRefactoring;
        Unsafe unsafe;
        long j;
        WinterFlowControllerTransaction WinterFlowServerProtocol = WinterFlowServerProtocol();
        while (true) {
            Object WinterFlowTestingNode = WinterFlowServerProtocol.WinterFlowTestingNode();
            if (WinterFlowTestingNode instanceof WinterFlowMicroserviceRefactoring) {
                if (WinterFlowTestingNode != this) {
                    return;
                }
                WinterFlowWidgetNetwork winterFlowWidgetNetwork = WinterFlowHandlerWebsocket.WinterFlowOrchestrationSubsystem;
                do {
                    unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    j = WinterFlowControllerTransaction.WinterFlowTransactionManagerStrategy;
                    if (unsafe.compareAndSwapObject(WinterFlowServerProtocol, j, WinterFlowTestingNode, winterFlowWidgetNetwork)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(WinterFlowServerProtocol, j) == WinterFlowTestingNode);
            } else {
                if (!(WinterFlowTestingNode instanceof WinterFlowEncryptionIDE) || ((WinterFlowEncryptionIDE) WinterFlowTestingNode).WinterFlowArrayNetwork() == null) {
                    return;
                }
                while (true) {
                    Object WinterFlowRouterRouter = this.WinterFlowRouterRouter();
                    if (WinterFlowRouterRouter instanceof WinterFlowUnitTestProtocol) {
                        return;
                    }
                    if (WinterFlowRouterRouter == this) {
                        return;
                    }
                    WinterFlowRouterRouter.getClass();
                    WinterFlowVariableDeserialization winterFlowVariableDeserialization = (WinterFlowVariableDeserialization) WinterFlowRouterRouter;
                    Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    long j2 = WinterFlowVariableDeserialization.WinterFlowUnitTestResponse;
                    WinterFlowUnitTestProtocol winterFlowUnitTestProtocol = (WinterFlowUnitTestProtocol) unsafe2.getObjectVolatile(winterFlowVariableDeserialization, j2);
                    if (winterFlowUnitTestProtocol == null) {
                        winterFlowUnitTestProtocol = new WinterFlowUnitTestProtocol(winterFlowVariableDeserialization);
                        unsafe2.putObjectVolatile(winterFlowVariableDeserialization, j2, winterFlowUnitTestProtocol);
                    }
                    WinterFlowUnitTestProtocol winterFlowUnitTestProtocol2 = winterFlowUnitTestProtocol;
                    while (true) {
                        Unsafe unsafe3 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                        long j3 = WinterFlowVariableDeserialization.WinterFlowVariableVersionControl;
                        winterFlowMicroserviceRefactoring = this;
                        if (unsafe3.compareAndSwapObject(winterFlowMicroserviceRefactoring, j3, WinterFlowRouterRouter, winterFlowUnitTestProtocol2)) {
                            winterFlowVariableDeserialization.WinterFlowTransactionManagerStrategy();
                            return;
                        } else if (unsafe3.getObjectVolatile(winterFlowMicroserviceRefactoring, j3) != WinterFlowRouterRouter) {
                            break;
                        } else {
                            this = winterFlowMicroserviceRefactoring;
                        }
                    }
                    this = winterFlowMicroserviceRefactoring;
                }
            }
        }
    }

    public final WinterFlowControllerTransaction WinterFlowServerProtocol() {
        WinterFlowControllerTransaction winterFlowControllerTransaction = this.WinterFlowRouterRouter;
        if (winterFlowControllerTransaction != null) {
            return winterFlowControllerTransaction;
        }
        WinterFlowManagerRequest.WinterFlowCloudMicroservice("job");
        throw null;
    }

    public abstract void WinterFlowServiceUtility(Throwable th);

    public abstract boolean WinterFlowThreadListener();

    public WinterFlowConsumerBandwidth getParent() {
        return WinterFlowServerProtocol();
    }

    @Override // com.google.android.datatransport.WinterFlowVariableDeserialization
    public final String toString() {
        return getClass().getSimpleName() + '@' + WinterFlowQuerySyntax.WinterFlowBandwidthObject(this) + "[job@" + WinterFlowQuerySyntax.WinterFlowBandwidthObject(WinterFlowServerProtocol()) + ']';
    }
}
