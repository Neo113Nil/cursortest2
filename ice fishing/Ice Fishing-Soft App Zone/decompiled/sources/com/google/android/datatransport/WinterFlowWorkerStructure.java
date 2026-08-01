package com.google.android.datatransport;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWorkerStructure implements Executor {
    public Runnable WinterFlowUnitTestResponse;
    public final Executor WinterFlowVariableVersionControl;
    public final ArrayDeque WinterFlowTransactionManagerStrategy = new ArrayDeque();
    public final Object WinterFlowRouterRouter = new Object();

    public WinterFlowWorkerStructure(Executor executor) {
        this.WinterFlowVariableVersionControl = executor;
    }

    public final void WinterFlowRouterStructure() {
        synchronized (this.WinterFlowRouterRouter) {
            Object poll = this.WinterFlowTransactionManagerStrategy.poll();
            Runnable runnable = (Runnable) poll;
            this.WinterFlowUnitTestResponse = runnable;
            if (poll != null) {
                this.WinterFlowVariableVersionControl.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.WinterFlowRouterRouter) {
            this.WinterFlowTransactionManagerStrategy.offer(new WinterFlowControllerManager(11, runnable, this));
            if (this.WinterFlowUnitTestResponse == null) {
                WinterFlowRouterStructure();
            }
        }
    }
}
