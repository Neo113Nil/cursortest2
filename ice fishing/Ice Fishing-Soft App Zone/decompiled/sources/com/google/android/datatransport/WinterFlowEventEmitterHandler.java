package com.google.android.datatransport;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowEventEmitterHandler extends WinterFlowScriptController implements WinterFlowDataSourceHelper {
    public final Executor WinterFlowUnitTestResponse;

    public WinterFlowEventEmitterHandler(Executor executor) {
        this.WinterFlowUnitTestResponse = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowUnitTestRouter
    public final void WinterFlowConfigurationSubsystem(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, Runnable runnable) {
        try {
            this.WinterFlowUnitTestResponse.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            WinterFlowInvokerComponent.WinterFlowThreadListener(winterFlowEncryptionMicroservice, cancellationException);
            WinterFlowCacheDecorator winterFlowCacheDecorator = WinterFlowInheritanceUtility.WinterFlowRouterStructure;
            WinterFlowInheritanceFramework.WinterFlowUnitTestResponse.WinterFlowConfigurationSubsystem(winterFlowEncryptionMicroservice, runnable);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowDataSourceHelper
    public final void WinterFlowRouterRouter(long j, WinterFlowEventCloud winterFlowEventCloud) {
        Executor executor = this.WinterFlowUnitTestResponse;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            WinterFlowValidatorSystem winterFlowValidatorSystem = new WinterFlowValidatorSystem(28, this, winterFlowEventCloud, false);
            WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = winterFlowEventCloud.WinterFlowSyntax;
            try {
                scheduledFuture = scheduledExecutorService.schedule(winterFlowValidatorSystem, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                WinterFlowInvokerComponent.WinterFlowThreadListener(winterFlowEncryptionMicroservice, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            winterFlowEventCloud.WinterFlowConsumerUserManager(new WinterFlowProxyStructure(0, scheduledFuture));
        } else {
            WinterFlowSerializerWidget.WinterFlowBandwidthObject.WinterFlowRouterRouter(j, winterFlowEventCloud);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowDataSourceHelper
    public final WinterFlowVersionControlView WinterFlowTransactionManagerStrategy(long j, Runnable runnable, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        Executor executor = this.WinterFlowUnitTestResponse;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                WinterFlowInvokerComponent.WinterFlowThreadListener(winterFlowEncryptionMicroservice, cancellationException);
            }
        }
        return scheduledFuture != null ? new WinterFlowVariableHandler(scheduledFuture) : WinterFlowSerializerWidget.WinterFlowBandwidthObject.WinterFlowTransactionManagerStrategy(j, runnable, winterFlowEncryptionMicroservice);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.WinterFlowUnitTestResponse;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WinterFlowEventEmitterHandler) && ((WinterFlowEventEmitterHandler) obj).WinterFlowUnitTestResponse == this.WinterFlowUnitTestResponse;
    }

    public final int hashCode() {
        return System.identityHashCode(this.WinterFlowUnitTestResponse);
    }

    @Override // com.google.android.datatransport.WinterFlowUnitTestRouter
    public final String toString() {
        return this.WinterFlowUnitTestResponse.toString();
    }
}
