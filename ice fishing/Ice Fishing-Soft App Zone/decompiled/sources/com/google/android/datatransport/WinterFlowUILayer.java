package com.google.android.datatransport;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUILayer extends WinterFlowBandwidthFunction {
    public final Thread WinterFlowRouterRouter;
    public final WinterFlowResponseObject WinterFlowSyntax;

    public WinterFlowUILayer(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, Thread thread, WinterFlowResponseObject winterFlowResponseObject) {
        super(winterFlowEncryptionMicroservice, true);
        this.WinterFlowRouterRouter = thread;
        this.WinterFlowSyntax = winterFlowResponseObject;
    }

    @Override // com.google.android.datatransport.WinterFlowControllerTransaction
    public final void WinterFlowServerProtocol(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.WinterFlowRouterRouter;
        if (WinterFlowManagerRequest.WinterFlowThreadListener(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
