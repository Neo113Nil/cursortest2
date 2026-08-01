package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowResponseObject extends WinterFlowUnitTestRouter {
    public static final /* synthetic */ int WinterFlowResponseEngine = 0;
    public boolean WinterFlowRouterRouter;
    public WinterFlowOrchestrationValidator WinterFlowSyntax;
    public long WinterFlowUnitTestResponse;

    public final void WinterFlowSoftwareEngine(boolean z) {
        this.WinterFlowUnitTestResponse = (z ? 4294967296L : 1L) + this.WinterFlowUnitTestResponse;
        if (z) {
            return;
        }
        this.WinterFlowRouterRouter = true;
    }

    public final void WinterFlowSoftwareProtocol(boolean z) {
        long j = this.WinterFlowUnitTestResponse - (z ? 4294967296L : 1L);
        this.WinterFlowUnitTestResponse = j;
        if (j <= 0 && this.WinterFlowRouterRouter) {
            shutdown();
        }
    }

    public abstract long WinterFlowSyntaxSubsystem();

    public final boolean WinterFlowTestingNode() {
        WinterFlowOrchestrationValidator winterFlowOrchestrationValidator = this.WinterFlowSyntax;
        if (winterFlowOrchestrationValidator == null) {
            return false;
        }
        WinterFlowInvokerEntity winterFlowInvokerEntity = (WinterFlowInvokerEntity) (winterFlowOrchestrationValidator.isEmpty() ? null : winterFlowOrchestrationValidator.removeFirst());
        if (winterFlowInvokerEntity == null) {
            return false;
        }
        winterFlowInvokerEntity.run();
        return true;
    }

    public final void WinterFlowUserManagerUserManager(WinterFlowInvokerEntity winterFlowInvokerEntity) {
        WinterFlowOrchestrationValidator winterFlowOrchestrationValidator = this.WinterFlowSyntax;
        if (winterFlowOrchestrationValidator == null) {
            winterFlowOrchestrationValidator = new WinterFlowOrchestrationValidator();
            this.WinterFlowSyntax = winterFlowOrchestrationValidator;
        }
        winterFlowOrchestrationValidator.addLast(winterFlowInvokerEntity);
    }

    public abstract void shutdown();
}
