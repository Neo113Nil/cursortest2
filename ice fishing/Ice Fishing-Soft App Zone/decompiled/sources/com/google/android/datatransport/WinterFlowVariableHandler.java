package com.google.android.datatransport;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVariableHandler implements WinterFlowVersionControlView {
    public final ScheduledFuture WinterFlowVariableVersionControl;

    public WinterFlowVariableHandler(ScheduledFuture scheduledFuture) {
        this.WinterFlowVariableVersionControl = scheduledFuture;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionControlView
    public final void WinterFlowRouterStructure() {
        this.WinterFlowVariableVersionControl.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.WinterFlowVariableVersionControl + ']';
    }
}
