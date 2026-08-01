package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowTransactionManagerStrategy {
    public static final WinterFlowStrategySystem WinterFlowHookDataSource;
    public static final WinterFlowStrategySystem WinterFlowRouterStructure = new WinterFlowStrategySystem();

    static {
        WinterFlowRequestCompiler winterFlowRequestCompiler = WinterFlowRequestCompiler.WinterFlowCacheManagerAgent;
        WinterFlowStrategySystem winterFlowStrategySystem = null;
        try {
            winterFlowStrategySystem = (WinterFlowStrategySystem) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        WinterFlowHookDataSource = winterFlowStrategySystem;
    }
}
