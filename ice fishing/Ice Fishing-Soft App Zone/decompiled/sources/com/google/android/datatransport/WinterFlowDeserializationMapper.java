package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDeserializationMapper {
    public static final WinterFlowDeserializationMapper WinterFlowArrayNetwork;
    public static final WinterFlowDeserializationMapper WinterFlowCacheManagerAgent;
    public final Throwable WinterFlowHookDataSource;
    public final boolean WinterFlowRouterStructure;

    static {
        if (WinterFlowThreadHelper.WinterFlowRouterRouter) {
            WinterFlowArrayNetwork = null;
            WinterFlowCacheManagerAgent = null;
        } else {
            WinterFlowArrayNetwork = new WinterFlowDeserializationMapper(null, false);
            WinterFlowCacheManagerAgent = new WinterFlowDeserializationMapper(null, true);
        }
    }

    public WinterFlowDeserializationMapper(Throwable th, boolean z) {
        this.WinterFlowRouterStructure = z;
        this.WinterFlowHookDataSource = th;
    }
}
