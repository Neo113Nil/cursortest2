package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowExceptionIDE implements WinterFlowEventProvider {
    public final /* synthetic */ WinterFlowControllerScript WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowEventProvider WinterFlowVariableVersionControl;

    public WinterFlowExceptionIDE(WinterFlowEventProvider winterFlowEventProvider, WinterFlowControllerScript winterFlowControllerScript) {
        this.WinterFlowVariableVersionControl = winterFlowEventProvider;
        this.WinterFlowTransactionManagerStrategy = winterFlowControllerScript;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:22|23))(2:24|25))(2:26|27))(2:38|39)|28|29|30|(3:32|15|16)|33))|46|6|7|(0)(0)|28|29|30|(0)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0060, code lost:
    
        if (r10.WinterFlowRouterStructure(r9, r0) == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004c, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004d, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
    
        r10 = new com.google.android.datatransport.WinterFlowResponseDebug(r9);
        r9 = r9.WinterFlowTransactionManagerStrategy;
        r0.WinterFlowTransactionAgent = r9;
        r0.WinterFlowServerProtocol = null;
        r0.WinterFlowSyntax = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        if (com.google.android.datatransport.WinterFlowHandlerWebsocket.WinterFlowArrayHelper(r10, r9, r9, r0) == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        throw r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.google.android.datatransport.WinterFlowEventProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowRouterStructure(WinterFlowCacheInterface winterFlowCacheInterface, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        WinterFlowDecoratorFramework winterFlowDecoratorFramework;
        int i;
        WinterFlowListenerJava winterFlowListenerJava;
        WinterFlowAlgorithmProcess winterFlowAlgorithmProcess;
        WinterFlowAlgorithmProcess winterFlowAlgorithmProcess2;
        WinterFlowControllerScript winterFlowControllerScript;
        try {
            if (winterFlowTransactionManagerLayer instanceof WinterFlowDecoratorFramework) {
                winterFlowDecoratorFramework = (WinterFlowDecoratorFramework) winterFlowTransactionManagerLayer;
                int i2 = winterFlowDecoratorFramework.WinterFlowSyntax;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    winterFlowDecoratorFramework.WinterFlowSyntax = i2 - Integer.MIN_VALUE;
                    Object obj = winterFlowDecoratorFramework.WinterFlowRouterRouter;
                    i = winterFlowDecoratorFramework.WinterFlowSyntax;
                    winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                    if (i != 0) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        WinterFlowEventProvider winterFlowEventProvider = this.WinterFlowVariableVersionControl;
                        winterFlowDecoratorFramework.WinterFlowTransactionAgent = this;
                        winterFlowDecoratorFramework.WinterFlowServerProtocol = winterFlowCacheInterface;
                        winterFlowDecoratorFramework.WinterFlowSyntax = 1;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                Throwable th = (Throwable) winterFlowDecoratorFramework.WinterFlowTransactionAgent;
                                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                                throw th;
                            }
                            if (i != 3) {
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            winterFlowAlgorithmProcess2 = (WinterFlowAlgorithmProcess) winterFlowDecoratorFramework.WinterFlowTransactionAgent;
                            try {
                                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                                winterFlowAlgorithmProcess2.WinterFlowBandwidthObject();
                                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                            } catch (Throwable th2) {
                                th = th2;
                                winterFlowAlgorithmProcess2.WinterFlowBandwidthObject();
                                throw th;
                            }
                        }
                        winterFlowCacheInterface = winterFlowDecoratorFramework.WinterFlowServerProtocol;
                        this = (WinterFlowExceptionIDE) winterFlowDecoratorFramework.WinterFlowTransactionAgent;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    }
                    WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = winterFlowDecoratorFramework.WinterFlowTransactionManagerStrategy;
                    winterFlowEncryptionMicroservice.getClass();
                    winterFlowAlgorithmProcess = new WinterFlowAlgorithmProcess(winterFlowCacheInterface, winterFlowEncryptionMicroservice);
                    winterFlowControllerScript = this.WinterFlowTransactionManagerStrategy;
                    winterFlowDecoratorFramework.WinterFlowTransactionAgent = winterFlowAlgorithmProcess;
                    winterFlowDecoratorFramework.WinterFlowServerProtocol = null;
                    winterFlowDecoratorFramework.WinterFlowSyntax = 3;
                    if (winterFlowControllerScript.WinterFlowArrayNetwork(winterFlowAlgorithmProcess, null, winterFlowDecoratorFramework) != winterFlowListenerJava) {
                        winterFlowAlgorithmProcess2 = winterFlowAlgorithmProcess;
                        winterFlowAlgorithmProcess2.WinterFlowBandwidthObject();
                        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                    }
                    return winterFlowListenerJava;
                }
            }
            winterFlowControllerScript = this.WinterFlowTransactionManagerStrategy;
            winterFlowDecoratorFramework.WinterFlowTransactionAgent = winterFlowAlgorithmProcess;
            winterFlowDecoratorFramework.WinterFlowServerProtocol = null;
            winterFlowDecoratorFramework.WinterFlowSyntax = 3;
            if (winterFlowControllerScript.WinterFlowArrayNetwork(winterFlowAlgorithmProcess, null, winterFlowDecoratorFramework) != winterFlowListenerJava) {
            }
            return winterFlowListenerJava;
        } catch (Throwable th3) {
            th = th3;
            winterFlowAlgorithmProcess2 = winterFlowAlgorithmProcess;
            winterFlowAlgorithmProcess2.WinterFlowBandwidthObject();
            throw th;
        }
        winterFlowDecoratorFramework = new WinterFlowDecoratorFramework(this, winterFlowTransactionManagerLayer);
        Object obj2 = winterFlowDecoratorFramework.WinterFlowRouterRouter;
        i = winterFlowDecoratorFramework.WinterFlowSyntax;
        winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (i != 0) {
        }
        WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice2 = winterFlowDecoratorFramework.WinterFlowTransactionManagerStrategy;
        winterFlowEncryptionMicroservice2.getClass();
        winterFlowAlgorithmProcess = new WinterFlowAlgorithmProcess(winterFlowCacheInterface, winterFlowEncryptionMicroservice2);
    }
}
