package com.google.android.datatransport;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseNode extends WinterFlowSessionManagerSessionManager {
    public static final /* synthetic */ long WinterFlowCacheManagerAgent = WinterFlowQueueThreadPool.WinterFlowRouterStructure.objectFieldOffset(WinterFlowDatabaseNode.class.getDeclaredField("_resumed$volatile"));
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WinterFlowDatabaseNode(WinterFlowEventCloud winterFlowEventCloud, Throwable th, boolean z) {
        super(th, z);
        if (th == null) {
            th = new CancellationException("Continuation " + winterFlowEventCloud + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
