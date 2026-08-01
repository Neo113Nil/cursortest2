package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUserManagerQuery implements WinterFlowEventProvider {
    public final Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowUserManagerQuery(int i, Object obj) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    @Override // com.google.android.datatransport.WinterFlowEventProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowRouterStructure(WinterFlowCacheInterface winterFlowCacheInterface, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        WinterFlowRequestTesting winterFlowRequestTesting;
        int i;
        WinterFlowAlgorithmProcess winterFlowAlgorithmProcess;
        Throwable th;
        int i2 = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object WinterFlowRouterStructure = ((WinterFlowResolverSyntax) obj).WinterFlowRouterStructure(new WinterFlowCloudComponent(0, winterFlowCacheInterface), winterFlowTransactionManagerLayer);
                return WinterFlowRouterStructure == winterFlowListenerJava ? WinterFlowRouterStructure : winterFlowAlgorithmSession;
            default:
                if (winterFlowTransactionManagerLayer instanceof WinterFlowRequestTesting) {
                    winterFlowRequestTesting = (WinterFlowRequestTesting) winterFlowTransactionManagerLayer;
                    int i3 = winterFlowRequestTesting.WinterFlowTransactionAgent;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        winterFlowRequestTesting.WinterFlowTransactionAgent = i3 - Integer.MIN_VALUE;
                        Object obj2 = winterFlowRequestTesting.WinterFlowSyntax;
                        i = winterFlowRequestTesting.WinterFlowTransactionAgent;
                        if (i != 0) {
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                            WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = winterFlowRequestTesting.WinterFlowTransactionManagerStrategy;
                            winterFlowEncryptionMicroservice.getClass();
                            WinterFlowAlgorithmProcess winterFlowAlgorithmProcess2 = new WinterFlowAlgorithmProcess(winterFlowCacheInterface, winterFlowEncryptionMicroservice);
                            try {
                                winterFlowRequestTesting.WinterFlowRouterRouter = winterFlowAlgorithmProcess2;
                                winterFlowRequestTesting.WinterFlowTransactionAgent = 1;
                                Object WinterFlowVariableVersionControl = ((WinterFlowEventEvent) obj).WinterFlowVariableVersionControl(winterFlowAlgorithmProcess2, winterFlowRequestTesting);
                                if (WinterFlowVariableVersionControl != winterFlowListenerJava) {
                                    WinterFlowVariableVersionControl = winterFlowAlgorithmSession;
                                }
                                if (WinterFlowVariableVersionControl == winterFlowListenerJava) {
                                    return winterFlowListenerJava;
                                }
                                winterFlowAlgorithmProcess = winterFlowAlgorithmProcess2;
                            } catch (Throwable th2) {
                                winterFlowAlgorithmProcess = winterFlowAlgorithmProcess2;
                                th = th2;
                                winterFlowAlgorithmProcess.WinterFlowBandwidthObject();
                                throw th;
                            }
                        } else {
                            if (i != 1) {
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            winterFlowAlgorithmProcess = winterFlowRequestTesting.WinterFlowRouterRouter;
                            try {
                                WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                            } catch (Throwable th3) {
                                th = th3;
                                winterFlowAlgorithmProcess.WinterFlowBandwidthObject();
                                throw th;
                            }
                        }
                        winterFlowAlgorithmProcess.WinterFlowBandwidthObject();
                        return winterFlowAlgorithmSession;
                    }
                }
                winterFlowRequestTesting = new WinterFlowRequestTesting(this, winterFlowTransactionManagerLayer);
                Object obj22 = winterFlowRequestTesting.WinterFlowSyntax;
                i = winterFlowRequestTesting.WinterFlowTransactionAgent;
                if (i != 0) {
                }
                winterFlowAlgorithmProcess.WinterFlowBandwidthObject();
                return winterFlowAlgorithmSession;
        }
    }
}
