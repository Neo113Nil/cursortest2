package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowRuntimeRuntime {
    public static final WinterFlowSerializerUI WinterFlowHookDataSource;
    public static final WinterFlowSerializerUI WinterFlowRouterStructure;

    static {
        WinterFlowRequestCompiler winterFlowRequestCompiler = WinterFlowRequestCompiler.WinterFlowCacheManagerAgent;
        WinterFlowSerializerUI winterFlowSerializerUI = null;
        try {
            winterFlowSerializerUI = (WinterFlowSerializerUI) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        WinterFlowRouterStructure = winterFlowSerializerUI;
        WinterFlowHookDataSource = new WinterFlowSerializerUI();
    }
}
