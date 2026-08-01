package com.google.android.datatransport;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJSONEngine extends WinterFlowDatabaseDeserialization {
    public final /* synthetic */ AtomicReferenceArray WinterFlowRouterRouter;
    public final WinterFlowWorkerThreadPool WinterFlowUnitTestResponse;

    public WinterFlowJSONEngine(long j, WinterFlowJSONEngine winterFlowJSONEngine, WinterFlowWorkerThreadPool winterFlowWorkerThreadPool, int i) {
        super(j, winterFlowJSONEngine, i);
        this.WinterFlowUnitTestResponse = winterFlowWorkerThreadPool;
        this.WinterFlowRouterRouter = new AtomicReferenceArray(WinterFlowNodeServiceProvider.WinterFlowHookDataSource * 2);
    }

    public final boolean WinterFlowResponseEngine(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.WinterFlowRouterRouter;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final void WinterFlowServerProtocol(int i, boolean z) {
        if (z) {
            WinterFlowWorkerThreadPool winterFlowWorkerThreadPool = this.WinterFlowUnitTestResponse;
            winterFlowWorkerThreadPool.getClass();
            winterFlowWorkerThreadPool.WinterFlowUserManagerUserManager((this.WinterFlowArrayNetwork * WinterFlowNodeServiceProvider.WinterFlowHookDataSource) + i);
        }
        WinterFlowRouterRouter();
    }

    public final void WinterFlowServiceUtility(int i, Object obj) {
        this.WinterFlowRouterRouter.set((i * 2) + 1, obj);
    }

    public final void WinterFlowThreadListener(int i, Object obj) {
        this.WinterFlowRouterRouter.set(i * 2, obj);
    }

    public final Object WinterFlowTransactionAgent(int i) {
        return this.WinterFlowRouterRouter.get((i * 2) + 1);
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseDeserialization
    public final int WinterFlowTransactionManagerStrategy() {
        return WinterFlowNodeServiceProvider.WinterFlowHookDataSource;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0047, code lost:
    
        WinterFlowThreadListener(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // com.google.android.datatransport.WinterFlowDatabaseDeserialization
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WinterFlowUnitTestResponse(int i, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        int i2 = WinterFlowNodeServiceProvider.WinterFlowHookDataSource;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.WinterFlowRouterRouter.get(i * 2);
        while (true) {
            Object WinterFlowTransactionAgent = WinterFlowTransactionAgent(i);
            boolean z2 = WinterFlowTransactionAgent instanceof WinterFlowTransactionIDE;
            WinterFlowWorkerThreadPool winterFlowWorkerThreadPool = this.WinterFlowUnitTestResponse;
            if (z2 || (WinterFlowTransactionAgent instanceof WinterFlowDataSourceOrchestration)) {
                if (WinterFlowResponseEngine(i, WinterFlowTransactionAgent, z ? WinterFlowNodeServiceProvider.WinterFlowResponseEngine : WinterFlowNodeServiceProvider.WinterFlowTransactionAgent)) {
                    WinterFlowThreadListener(i, null);
                    WinterFlowServerProtocol(i, !z);
                    if (z) {
                        winterFlowWorkerThreadPool.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (WinterFlowTransactionAgent == WinterFlowNodeServiceProvider.WinterFlowResponseEngine || WinterFlowTransactionAgent == WinterFlowNodeServiceProvider.WinterFlowTransactionAgent) {
                    break;
                }
                if (WinterFlowTransactionAgent != WinterFlowNodeServiceProvider.WinterFlowUnitTestResponse && WinterFlowTransactionAgent != WinterFlowNodeServiceProvider.WinterFlowTransactionManagerStrategy) {
                    if (WinterFlowTransactionAgent == WinterFlowNodeServiceProvider.WinterFlowSyntax || WinterFlowTransactionAgent == WinterFlowNodeServiceProvider.WinterFlowArrayNetwork || WinterFlowTransactionAgent == WinterFlowNodeServiceProvider.WinterFlowServerProtocol) {
                        return;
                    }
                    WinterFlowCompilerMechanism.WinterFlowVariableVersionControl(WinterFlowTransactionAgent, "unexpected state: ");
                    return;
                }
            }
        }
    }
}
