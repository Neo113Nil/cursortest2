package com.google.android.datatransport;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowIDEPlatform extends WinterFlowGatewayRouter implements WinterFlowCacheCacheManager {
    private volatile /* synthetic */ Object owner$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater WinterFlowThreadListener = AtomicReferenceFieldUpdater.newUpdater(WinterFlowIDEPlatform.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long WinterFlowServiceUtility = WinterFlowQueueThreadPool.WinterFlowRouterStructure.objectFieldOffset(WinterFlowIDEPlatform.class.getDeclaredField("owner$volatile"));

    public WinterFlowIDEPlatform() {
        super(1);
        this.owner$volatile = WinterFlowInvokerComponent.WinterFlowServiceUtility;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        r5 = com.google.android.datatransport.WinterFlowIDEPlatform.WinterFlowThreadListener;
        r2 = r0.WinterFlowTransactionManagerStrategy;
        r5.set(r2, null);
        r5 = r0.WinterFlowVariableVersionControl;
        r5.WinterFlowConfigurationSubsystem(r1, r5.WinterFlowUnitTestResponse, new com.google.android.datatransport.WinterFlowUnitTestUtility(1, new com.google.android.datatransport.WinterFlowCompilerCloud(14, r2, r0)));
     */
    @Override // com.google.android.datatransport.WinterFlowCacheCacheManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowArrayNetwork(WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        boolean WinterFlowVariableVersionControl = WinterFlowVariableVersionControl();
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        if (!WinterFlowVariableVersionControl) {
            WinterFlowEventCloud WinterFlowMapperProtocol = WinterFlowUnitTestLibrary.WinterFlowMapperProtocol(WinterFlowCloudStack.WinterFlowCompilerVariable(winterFlowOrchestrationCompiler));
            try {
                WinterFlowTestingSubsystem winterFlowTestingSubsystem = new WinterFlowTestingSubsystem(this, WinterFlowMapperProtocol);
                while (true) {
                    int andDecrement = WinterFlowGatewayRouter.WinterFlowSyntax.getAndDecrement(this);
                    if (andDecrement <= this.WinterFlowVariableVersionControl) {
                        if (andDecrement > 0) {
                            break;
                        }
                        if (WinterFlowRouterStructure(winterFlowTestingSubsystem)) {
                            break;
                        }
                    }
                }
                Object WinterFlowBatchUI = WinterFlowMapperProtocol.WinterFlowBatchUI();
                WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                if (WinterFlowBatchUI != winterFlowListenerJava) {
                    WinterFlowBatchUI = winterFlowAlgorithmSession;
                }
                if (WinterFlowBatchUI == winterFlowListenerJava) {
                    return WinterFlowBatchUI;
                }
            } catch (Throwable th) {
                WinterFlowMapperProtocol.WinterFlowCompilerVariable();
                throw th;
            }
        }
        return winterFlowAlgorithmSession;
    }

    @Override // com.google.android.datatransport.WinterFlowCacheCacheManager
    public final void WinterFlowHookDataSource(Object obj) {
        while (true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            if (Math.max(unsafe.getIntVolatile(this, WinterFlowGatewayRouter.WinterFlowResponseEngine), 0) != 0) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This mutex is not locked");
                return;
            }
            long j = WinterFlowServiceUtility;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowInvokerComponent.WinterFlowServiceUtility;
            if (objectVolatile != winterFlowJSONDecorator) {
                if (objectVolatile != obj && obj != null) {
                    WinterFlowEventEmitterOrchestration.WinterFlowTransactionAgent("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    WinterFlowIDEPlatform winterFlowIDEPlatform = this;
                    if (unsafe2.compareAndSwapObject(winterFlowIDEPlatform, WinterFlowServiceUtility, objectVolatile, winterFlowJSONDecorator)) {
                        winterFlowIDEPlatform.WinterFlowCacheManagerAgent();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(winterFlowIDEPlatform, j) != objectVolatile) {
                            this = winterFlowIDEPlatform;
                            break;
                        }
                        this = winterFlowIDEPlatform;
                    }
                }
            }
        }
    }

    public final boolean WinterFlowVariableVersionControl() {
        WinterFlowIDEPlatform winterFlowIDEPlatform;
        while (true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowGatewayRouter.WinterFlowResponseEngine;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile > this.WinterFlowVariableVersionControl) {
                while (true) {
                    Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    long j2 = WinterFlowGatewayRouter.WinterFlowResponseEngine;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j2);
                    int i = this.WinterFlowVariableVersionControl;
                    if (intVolatile2 <= i) {
                        winterFlowIDEPlatform = this;
                        break;
                    }
                    WinterFlowIDEPlatform winterFlowIDEPlatform2 = this;
                    winterFlowIDEPlatform = winterFlowIDEPlatform2;
                    if (unsafe2.compareAndSwapInt(winterFlowIDEPlatform2, j2, intVolatile2, i)) {
                        break;
                    }
                    this = winterFlowIDEPlatform;
                }
            } else {
                winterFlowIDEPlatform = this;
                if (intVolatile <= 0) {
                    return false;
                }
                if (unsafe.compareAndSwapInt(winterFlowIDEPlatform, j, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(winterFlowIDEPlatform, WinterFlowServiceUtility, (Object) null);
                    return true;
                }
            }
            this = winterFlowIDEPlatform;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(WinterFlowQuerySyntax.WinterFlowBandwidthObject(this));
        sb.append("[isLocked=");
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        sb.append(Math.max(unsafe.getIntVolatile(this, WinterFlowGatewayRouter.WinterFlowResponseEngine), 0) == 0);
        sb.append(",owner=");
        sb.append(unsafe.getObjectVolatile(this, WinterFlowServiceUtility));
        sb.append(']');
        return sb.toString();
    }
}
