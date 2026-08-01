package com.google.android.datatransport;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServerHook extends WinterFlowUnitTestRouter {
    public static final WinterFlowRendererNode WinterFlowConcurrencyThread = new WinterFlowRendererNode(WinterFlowResolverVersion.WinterFlowBandwidthObject);
    public static final WinterFlowValidatorProtocol WinterFlowSingletonPlatform = new WinterFlowValidatorProtocol(0);
    public final WinterFlowPipelineBackend WinterFlowOrchestrationSubsystem;
    public final Handler WinterFlowRouterRouter;
    public boolean WinterFlowServiceUtility;
    public boolean WinterFlowThreadListener;
    public final Choreographer WinterFlowUnitTestResponse;
    public final Object WinterFlowSyntax = new Object();
    public final WinterFlowOrchestrationValidator WinterFlowResponseEngine = new WinterFlowOrchestrationValidator();
    public ArrayList WinterFlowTransactionAgent = new ArrayList();
    public ArrayList WinterFlowServerProtocol = new ArrayList();
    public final WinterFlowNetworkCompiler WinterFlowBandwidthObject = new WinterFlowNetworkCompiler(this);

    public WinterFlowServerHook(Choreographer choreographer, Handler handler) {
        this.WinterFlowUnitTestResponse = choreographer;
        this.WinterFlowRouterRouter = handler;
        this.WinterFlowOrchestrationSubsystem = new WinterFlowPipelineBackend(choreographer, this);
    }

    @Override // com.google.android.datatransport.WinterFlowUnitTestRouter
    public final void WinterFlowConfigurationSubsystem(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, Runnable runnable) {
        synchronized (this.WinterFlowSyntax) {
            this.WinterFlowResponseEngine.addLast(runnable);
            if (!this.WinterFlowThreadListener) {
                this.WinterFlowThreadListener = true;
                this.WinterFlowRouterRouter.post(this.WinterFlowBandwidthObject);
                if (!this.WinterFlowServiceUtility) {
                    this.WinterFlowServiceUtility = true;
                    this.WinterFlowUnitTestResponse.postFrameCallback(this.WinterFlowBandwidthObject);
                }
            }
        }
    }

    public final void WinterFlowSoftwareProtocol() {
        Runnable runnable;
        boolean z;
        do {
            synchronized (this.WinterFlowSyntax) {
                WinterFlowOrchestrationValidator winterFlowOrchestrationValidator = this.WinterFlowResponseEngine;
                runnable = (Runnable) (winterFlowOrchestrationValidator.isEmpty() ? null : winterFlowOrchestrationValidator.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (this.WinterFlowSyntax) {
                    WinterFlowOrchestrationValidator winterFlowOrchestrationValidator2 = this.WinterFlowResponseEngine;
                    runnable = (Runnable) (winterFlowOrchestrationValidator2.isEmpty() ? null : winterFlowOrchestrationValidator2.removeFirst());
                }
            }
            synchronized (this.WinterFlowSyntax) {
                if (this.WinterFlowResponseEngine.isEmpty()) {
                    z = false;
                    this.WinterFlowThreadListener = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }
}
