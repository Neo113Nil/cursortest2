package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowInvokerMapper {
    public static final WinterFlowAdapterQueue WinterFlowHookDataSource;
    public static final WinterFlowAdapterQueue WinterFlowRouterStructure;

    static {
        WinterFlowRequestCompiler winterFlowRequestCompiler = WinterFlowRequestCompiler.WinterFlowCacheManagerAgent;
        WinterFlowAdapterQueue winterFlowAdapterQueue = null;
        try {
            winterFlowAdapterQueue = (WinterFlowAdapterQueue) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        WinterFlowRouterStructure = winterFlowAdapterQueue;
        WinterFlowHookDataSource = new WinterFlowAdapterQueue();
    }
}
