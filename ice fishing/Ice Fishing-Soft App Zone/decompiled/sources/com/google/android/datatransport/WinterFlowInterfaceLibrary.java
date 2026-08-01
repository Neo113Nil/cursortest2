package com.google.android.datatransport;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowInterfaceLibrary extends WinterFlowControllerTransaction {
    public final boolean WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowInterfaceLibrary(WinterFlowConsumerBandwidth winterFlowConsumerBandwidth) {
        super(true);
        boolean z = true;
        WinterFlowCloudMicroservice(winterFlowConsumerBandwidth);
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        long j = WinterFlowControllerTransaction.WinterFlowVariableVersionControl;
        WinterFlowServerNode winterFlowServerNode = (WinterFlowServerNode) unsafe.getObjectVolatile(this, j);
        WinterFlowConsumerWebsocket winterFlowConsumerWebsocket = winterFlowServerNode instanceof WinterFlowConsumerWebsocket ? (WinterFlowConsumerWebsocket) winterFlowServerNode : null;
        if (winterFlowConsumerWebsocket != null) {
            WinterFlowControllerTransaction WinterFlowServerProtocol = winterFlowConsumerWebsocket.WinterFlowServerProtocol();
            while (!WinterFlowServerProtocol.WinterFlowUserManagerUserManager()) {
                WinterFlowServerNode winterFlowServerNode2 = (WinterFlowServerNode) WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(WinterFlowServerProtocol, j);
                WinterFlowConsumerWebsocket winterFlowConsumerWebsocket2 = winterFlowServerNode2 instanceof WinterFlowConsumerWebsocket ? (WinterFlowConsumerWebsocket) winterFlowServerNode2 : null;
                if (winterFlowConsumerWebsocket2 != null) {
                    WinterFlowServerProtocol = winterFlowConsumerWebsocket2.WinterFlowServerProtocol();
                }
            }
            this.WinterFlowUnitTestResponse = z;
        }
        z = false;
        this.WinterFlowUnitTestResponse = z;
    }

    @Override // com.google.android.datatransport.WinterFlowControllerTransaction
    public final boolean WinterFlowSoftwareEngine() {
        return true;
    }

    @Override // com.google.android.datatransport.WinterFlowControllerTransaction
    public final boolean WinterFlowUserManagerUserManager() {
        return this.WinterFlowUnitTestResponse;
    }
}
