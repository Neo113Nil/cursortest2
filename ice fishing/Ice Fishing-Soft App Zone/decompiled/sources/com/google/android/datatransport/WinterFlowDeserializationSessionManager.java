package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDeserializationSessionManager {
    public long WinterFlowHookDataSource;
    public boolean WinterFlowRouterStructure;

    public final long WinterFlowRouterStructure() {
        if (this.WinterFlowRouterStructure) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.WinterFlowHookDataSource - System.nanoTime());
    }
}
