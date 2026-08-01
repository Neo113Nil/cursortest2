package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowSessionManagerSessionManager {
    public static final /* synthetic */ long WinterFlowHookDataSource = WinterFlowQueueThreadPool.WinterFlowRouterStructure.objectFieldOffset(WinterFlowSessionManagerSessionManager.class.getDeclaredField("_handled$volatile"));
    public final Throwable WinterFlowRouterStructure;
    private volatile /* synthetic */ int _handled$volatile;

    public WinterFlowSessionManagerSessionManager(Throwable th, boolean z) {
        this.WinterFlowRouterStructure = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.WinterFlowRouterStructure + ']';
    }
}
