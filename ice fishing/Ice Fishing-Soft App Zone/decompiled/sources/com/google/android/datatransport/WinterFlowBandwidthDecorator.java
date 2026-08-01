package com.google.android.datatransport;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBandwidthDecorator extends WinterFlowUnitTestRouter implements WinterFlowDataSourceHelper {
    public static final /* synthetic */ AtomicIntegerFieldUpdater WinterFlowServerProtocol = AtomicIntegerFieldUpdater.newUpdater(WinterFlowBandwidthDecorator.class, "runningWorkers$volatile");
    public static final /* synthetic */ long WinterFlowThreadListener = WinterFlowQueueThreadPool.WinterFlowRouterStructure.objectFieldOffset(WinterFlowBandwidthDecorator.class.getDeclaredField("runningWorkers$volatile"));
    public final WinterFlowDatabaseSchemaObject WinterFlowResponseEngine;
    public final WinterFlowUnitTestRouter WinterFlowRouterRouter;
    public final int WinterFlowSyntax;
    public final Object WinterFlowTransactionAgent;
    public final /* synthetic */ WinterFlowDataSourceHelper WinterFlowUnitTestResponse;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public WinterFlowBandwidthDecorator(WinterFlowUnitTestRouter winterFlowUnitTestRouter, int i) {
        WinterFlowDataSourceHelper winterFlowDataSourceHelper = winterFlowUnitTestRouter instanceof WinterFlowDataSourceHelper ? (WinterFlowDataSourceHelper) winterFlowUnitTestRouter : null;
        this.WinterFlowUnitTestResponse = winterFlowDataSourceHelper == null ? WinterFlowPipelineFramework.WinterFlowRouterStructure : winterFlowDataSourceHelper;
        this.WinterFlowRouterRouter = winterFlowUnitTestRouter;
        this.WinterFlowSyntax = i;
        this.WinterFlowResponseEngine = new WinterFlowDatabaseSchemaObject();
        this.WinterFlowTransactionAgent = new Object();
    }

    @Override // com.google.android.datatransport.WinterFlowUnitTestRouter
    public final void WinterFlowConfigurationSubsystem(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, Runnable runnable) {
        Runnable WinterFlowSoftwareProtocol;
        this.WinterFlowResponseEngine.WinterFlowRouterStructure(runnable);
        if (WinterFlowQueueThreadPool.WinterFlowRouterStructure.getIntVolatile(this, WinterFlowThreadListener) >= this.WinterFlowSyntax || !WinterFlowUserManagerUserManager() || (WinterFlowSoftwareProtocol = WinterFlowSoftwareProtocol()) == null) {
            return;
        }
        this.WinterFlowRouterRouter.WinterFlowConfigurationSubsystem(this, new WinterFlowValidatorSystem(23, this, WinterFlowSoftwareProtocol));
    }

    @Override // com.google.android.datatransport.WinterFlowDataSourceHelper
    public final void WinterFlowRouterRouter(long j, WinterFlowEventCloud winterFlowEventCloud) {
        this.WinterFlowUnitTestResponse.WinterFlowRouterRouter(j, winterFlowEventCloud);
    }

    public final Runnable WinterFlowSoftwareProtocol() {
        while (true) {
            Runnable runnable = (Runnable) this.WinterFlowResponseEngine.WinterFlowArrayNetwork();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.WinterFlowTransactionAgent) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = WinterFlowServerProtocol;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.WinterFlowResponseEngine.WinterFlowCacheManagerAgent() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowUnitTestRouter
    public final void WinterFlowStrategyTool(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, Runnable runnable) {
        Runnable WinterFlowSoftwareProtocol;
        this.WinterFlowResponseEngine.WinterFlowRouterStructure(runnable);
        if (WinterFlowQueueThreadPool.WinterFlowRouterStructure.getIntVolatile(this, WinterFlowThreadListener) >= this.WinterFlowSyntax || !WinterFlowUserManagerUserManager() || (WinterFlowSoftwareProtocol = WinterFlowSoftwareProtocol()) == null) {
            return;
        }
        this.WinterFlowRouterRouter.WinterFlowStrategyTool(this, new WinterFlowValidatorSystem(23, this, WinterFlowSoftwareProtocol));
    }

    @Override // com.google.android.datatransport.WinterFlowDataSourceHelper
    public final WinterFlowVersionControlView WinterFlowTransactionManagerStrategy(long j, Runnable runnable, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        return this.WinterFlowUnitTestResponse.WinterFlowTransactionManagerStrategy(j, runnable, winterFlowEncryptionMicroservice);
    }

    public final boolean WinterFlowUserManagerUserManager() {
        synchronized (this.WinterFlowTransactionAgent) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = WinterFlowServerProtocol;
            if (WinterFlowQueueThreadPool.WinterFlowRouterStructure.getIntVolatile(this, WinterFlowThreadListener) >= this.WinterFlowSyntax) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowUnitTestRouter
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.WinterFlowRouterRouter);
        sb.append(".limitedParallelism(");
        return WinterFlowResolverBackend.WinterFlowServerProtocol(sb, this.WinterFlowSyntax, ')');
    }
}
