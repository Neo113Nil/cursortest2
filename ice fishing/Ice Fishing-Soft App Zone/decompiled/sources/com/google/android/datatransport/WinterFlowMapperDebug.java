package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMapperDebug extends WinterFlowCompilerHook {
    public final WinterFlowResolverPlatform WinterFlowRouterRouter;
    public Object WinterFlowSyntax;

    public WinterFlowMapperDebug(WinterFlowResolverPlatform winterFlowResolverPlatform, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.WinterFlowRouterRouter = winterFlowResolverPlatform;
        this.WinterFlowSyntax = obj2;
    }

    @Override // com.google.android.datatransport.WinterFlowCompilerHook, java.util.Map.Entry
    public final Object getValue() {
        return this.WinterFlowSyntax;
    }

    @Override // com.google.android.datatransport.WinterFlowCompilerHook, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.WinterFlowSyntax;
        this.WinterFlowSyntax = obj;
        WinterFlowDatabaseSchemaInterface winterFlowDatabaseSchemaInterface = (WinterFlowDatabaseSchemaInterface) this.WinterFlowRouterRouter.WinterFlowTransactionManagerStrategy;
        WinterFlowTransactionManagerUnitTest winterFlowTransactionManagerUnitTest = winterFlowDatabaseSchemaInterface.WinterFlowRouterRouter;
        Object obj3 = this.WinterFlowTransactionManagerStrategy;
        if (!winterFlowTransactionManagerUnitTest.containsKey(obj3)) {
            return obj2;
        }
        boolean z = winterFlowDatabaseSchemaInterface.WinterFlowUnitTestResponse;
        if (!z) {
            winterFlowTransactionManagerUnitTest.put(obj3, obj);
        } else {
            if (!z) {
                WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
                return null;
            }
            WinterFlowStackHandler winterFlowStackHandler = winterFlowDatabaseSchemaInterface.WinterFlowVariableVersionControl[winterFlowDatabaseSchemaInterface.WinterFlowTransactionManagerStrategy];
            Object obj4 = winterFlowStackHandler.WinterFlowVariableVersionControl[winterFlowStackHandler.WinterFlowUnitTestResponse];
            winterFlowTransactionManagerUnitTest.put(obj3, obj);
            winterFlowDatabaseSchemaInterface.WinterFlowCacheManagerAgent(obj4 != null ? obj4.hashCode() : 0, winterFlowTransactionManagerUnitTest.WinterFlowTransactionManagerStrategy, obj4, 0);
        }
        winterFlowDatabaseSchemaInterface.WinterFlowTransactionAgent = winterFlowTransactionManagerUnitTest.WinterFlowRouterRouter;
        return obj2;
    }
}
