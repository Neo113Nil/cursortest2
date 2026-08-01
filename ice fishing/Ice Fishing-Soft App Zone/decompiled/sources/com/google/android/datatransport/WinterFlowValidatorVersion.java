package com.google.android.datatransport;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowValidatorVersion implements Executor {
    public static final Logger WinterFlowResponseEngine = Logger.getLogger(WinterFlowValidatorVersion.class.getName());
    public final Executor WinterFlowVariableVersionControl;
    public final ArrayDeque WinterFlowTransactionManagerStrategy = new ArrayDeque();
    public int WinterFlowUnitTestResponse = 1;
    public long WinterFlowRouterRouter = 0;
    public final WinterFlowValidatorSystem WinterFlowSyntax = new WinterFlowValidatorSystem(this);

    public WinterFlowValidatorVersion(Executor executor) {
        WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(executor);
        this.WinterFlowVariableVersionControl = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(runnable);
        synchronized (this.WinterFlowTransactionManagerStrategy) {
            int i = this.WinterFlowUnitTestResponse;
            if (i != 4 && i != 3) {
                long j = this.WinterFlowRouterRouter;
                boolean z = true;
                WinterFlowDataSourceQuery winterFlowDataSourceQuery = new WinterFlowDataSourceQuery(runnable, 1);
                this.WinterFlowTransactionManagerStrategy.add(winterFlowDataSourceQuery);
                this.WinterFlowUnitTestResponse = 2;
                try {
                    this.WinterFlowVariableVersionControl.execute(this.WinterFlowSyntax);
                    if (this.WinterFlowUnitTestResponse != 2) {
                        return;
                    }
                    synchronized (this.WinterFlowTransactionManagerStrategy) {
                        try {
                            if (this.WinterFlowRouterRouter == j && this.WinterFlowUnitTestResponse == 2) {
                                this.WinterFlowUnitTestResponse = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.WinterFlowTransactionManagerStrategy) {
                        try {
                            int i2 = this.WinterFlowUnitTestResponse;
                            if ((i2 != 1 && i2 != 2) || !this.WinterFlowTransactionManagerStrategy.removeLastOccurrence(winterFlowDataSourceQuery)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.WinterFlowTransactionManagerStrategy.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.WinterFlowVariableVersionControl + "}";
    }
}
