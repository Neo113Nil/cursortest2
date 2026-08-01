package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowUnitTestSession {
    public static final WinterFlowSyntaxValidator WinterFlowHookDataSource;
    public static final WinterFlowSyntaxValidator WinterFlowRouterStructure;

    static {
        WinterFlowRequestCompiler winterFlowRequestCompiler = WinterFlowRequestCompiler.WinterFlowCacheManagerAgent;
        WinterFlowSyntaxValidator winterFlowSyntaxValidator = null;
        try {
            winterFlowSyntaxValidator = (WinterFlowSyntaxValidator) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        WinterFlowRouterStructure = winterFlowSyntaxValidator;
        WinterFlowHookDataSource = new WinterFlowSyntaxValidator();
    }
}
