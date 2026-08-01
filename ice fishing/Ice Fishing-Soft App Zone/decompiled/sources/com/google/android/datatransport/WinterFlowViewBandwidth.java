package com.google.android.datatransport;

import java.util.ArrayList;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowViewBandwidth implements WinterFlowEncryptionIDE {
    public static final /* synthetic */ long WinterFlowRouterRouter;
    public static final /* synthetic */ long WinterFlowTransactionManagerStrategy;
    public static final /* synthetic */ long WinterFlowUnitTestResponse;
    public final WinterFlowFrontendAPI WinterFlowVariableVersionControl;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    static {
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        WinterFlowUnitTestResponse = unsafe.objectFieldOffset(WinterFlowViewBandwidth.class.getDeclaredField("_isCompleting$volatile"));
        WinterFlowRouterRouter = unsafe.objectFieldOffset(WinterFlowViewBandwidth.class.getDeclaredField("_rootCause$volatile"));
        WinterFlowTransactionManagerStrategy = unsafe.objectFieldOffset(WinterFlowViewBandwidth.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public WinterFlowViewBandwidth(WinterFlowFrontendAPI winterFlowFrontendAPI, Throwable th) {
        this.WinterFlowVariableVersionControl = winterFlowFrontendAPI;
        this._rootCause$volatile = th;
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionIDE
    public final WinterFlowFrontendAPI WinterFlowArrayNetwork() {
        return this.WinterFlowVariableVersionControl;
    }

    public final Throwable WinterFlowCacheManagerAgent() {
        return (Throwable) WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(this, WinterFlowRouterRouter);
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionIDE
    public final boolean WinterFlowHookDataSource() {
        return WinterFlowCacheManagerAgent() == null;
    }

    public final void WinterFlowRouterStructure(Throwable th) {
        Throwable WinterFlowCacheManagerAgent = WinterFlowCacheManagerAgent();
        if (WinterFlowCacheManagerAgent == null) {
            WinterFlowQueueThreadPool.WinterFlowRouterStructure.putObjectVolatile(this, WinterFlowRouterRouter, th);
            return;
        }
        if (th == WinterFlowCacheManagerAgent) {
            return;
        }
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        long j = WinterFlowTransactionManagerStrategy;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            unsafe.putObjectVolatile(this, j, th);
            return;
        }
        if (!(objectVolatile instanceof Throwable)) {
            if (objectVolatile instanceof ArrayList) {
                ((ArrayList) objectVolatile).add(th);
                return;
            } else {
                WinterFlowCompilerMechanism.WinterFlowVariableVersionControl(objectVolatile, "State is ");
                return;
            }
        }
        if (th == objectVolatile) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objectVolatile);
        arrayList.add(th);
        unsafe.putObjectVolatile(this, j, arrayList);
    }

    public final boolean WinterFlowTransactionManagerStrategy() {
        return WinterFlowQueueThreadPool.WinterFlowRouterStructure.getIntVolatile(this, WinterFlowUnitTestResponse) != 0;
    }

    public final ArrayList WinterFlowUnitTestResponse(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        long j = WinterFlowTransactionManagerStrategy;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            arrayList = new ArrayList(4);
        } else if (objectVolatile instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objectVolatile);
            arrayList = arrayList2;
        } else {
            if (!(objectVolatile instanceof ArrayList)) {
                WinterFlowCompilerMechanism.WinterFlowVariableVersionControl(objectVolatile, "State is ");
                return null;
            }
            arrayList = (ArrayList) objectVolatile;
        }
        Throwable WinterFlowCacheManagerAgent = WinterFlowCacheManagerAgent();
        if (WinterFlowCacheManagerAgent != null) {
            arrayList.add(0, WinterFlowCacheManagerAgent);
        }
        if (th != null && !th.equals(WinterFlowCacheManagerAgent)) {
            arrayList.add(th);
        }
        unsafe.putObjectVolatile(this, j, WinterFlowHandlerWebsocket.WinterFlowServiceUtility);
        return arrayList;
    }

    public final boolean WinterFlowVariableVersionControl() {
        return WinterFlowCacheManagerAgent() != null;
    }

    public final String toString() {
        return "Finishing[cancelling=" + WinterFlowVariableVersionControl() + ", completing=" + WinterFlowTransactionManagerStrategy() + ", rootCause=" + WinterFlowCacheManagerAgent() + ", exceptions=" + WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(this, WinterFlowTransactionManagerStrategy) + ", list=" + this.WinterFlowVariableVersionControl + ']';
    }
}
