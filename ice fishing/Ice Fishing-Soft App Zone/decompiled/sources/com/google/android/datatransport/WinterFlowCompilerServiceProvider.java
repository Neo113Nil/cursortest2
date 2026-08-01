package com.google.android.datatransport;

import android.view.Choreographer;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCompilerServiceProvider implements Choreographer.FrameCallback {
    public final /* synthetic */ WinterFlowObjectSession WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowEventCloud WinterFlowVariableVersionControl;

    public WinterFlowCompilerServiceProvider(WinterFlowEventCloud winterFlowEventCloud, WinterFlowPipelineBackend winterFlowPipelineBackend, WinterFlowObjectSession winterFlowObjectSession) {
        this.WinterFlowVariableVersionControl = winterFlowEventCloud;
        this.WinterFlowTransactionManagerStrategy = winterFlowObjectSession;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object winterFlowDecoratorTool;
        try {
            winterFlowDecoratorTool = this.WinterFlowTransactionManagerStrategy.WinterFlowUnitTestResponse(Long.valueOf(j));
        } catch (Throwable th) {
            winterFlowDecoratorTool = new WinterFlowDecoratorTool(th);
        }
        this.WinterFlowVariableVersionControl.WinterFlowSyntax(winterFlowDecoratorTool);
    }
}
