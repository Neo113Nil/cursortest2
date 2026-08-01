package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDebugArray extends WinterFlowEventDebug implements WinterFlowControllerLayer {
    public final /* synthetic */ WinterFlowWebsocketManager WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowRuntimeSessionManager WinterFlowUnitTestResponse;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WinterFlowDebugArray(WinterFlowWebsocketManager winterFlowWebsocketManager, WinterFlowRuntimeSessionManager winterFlowRuntimeSessionManager) {
        super(r0);
        WinterFlowSessionManagerProcess winterFlowSessionManagerProcess = WinterFlowSessionManagerProcess.WinterFlowTransactionAgent;
        this.WinterFlowTransactionManagerStrategy = winterFlowWebsocketManager;
        this.WinterFlowUnitTestResponse = winterFlowRuntimeSessionManager;
    }

    @Override // com.google.android.datatransport.WinterFlowControllerLayer
    public final void WinterFlowRouterAdapter(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, Throwable th) {
        WinterFlowWebsocketManager winterFlowWebsocketManager = this.WinterFlowTransactionManagerStrategy;
        WinterFlowRuntimeSessionManager winterFlowRuntimeSessionManager = this.WinterFlowUnitTestResponse;
        WinterFlowUnitTestLibrary.WinterFlowValidatorHandler(th, new WinterFlowRepositoryLayer(2, winterFlowWebsocketManager, winterFlowRuntimeSessionManager));
        WinterFlowControllerLayer winterFlowControllerLayer = (WinterFlowControllerLayer) winterFlowRuntimeSessionManager.WinterFlowVariableVersionControl.WinterFlowConsumerUserManager(WinterFlowSessionManagerProcess.WinterFlowTransactionAgent);
        if (winterFlowControllerLayer == null) {
            throw th;
        }
        winterFlowControllerLayer.WinterFlowRouterAdapter(winterFlowEncryptionMicroservice, th);
    }
}
