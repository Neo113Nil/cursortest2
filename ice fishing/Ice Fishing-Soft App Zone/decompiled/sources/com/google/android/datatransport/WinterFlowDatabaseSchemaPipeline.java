package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowDatabaseSchemaPipeline extends WinterFlowRuntimeComponent implements WinterFlowParserFramework, WinterFlowDatabaseFramework, WinterFlowOrchestrationIDE {
    public final int WinterFlowTransactionAgent;

    public WinterFlowDatabaseSchemaPipeline(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.WinterFlowTransactionAgent = i;
    }

    @Override // com.google.android.datatransport.WinterFlowRuntimeComponent
    public final WinterFlowDatabaseFramework WinterFlowCacheManagerAgent() {
        WinterFlowListenerProtocol.WinterFlowRouterStructure.getClass();
        return this;
    }

    @Override // com.google.android.datatransport.WinterFlowParserFramework
    public final int WinterFlowHookDataSource() {
        return this.WinterFlowTransactionAgent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.datatransport.WinterFlowDatabaseFramework] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WinterFlowDatabaseSchemaPipeline) {
            WinterFlowDatabaseSchemaPipeline winterFlowDatabaseSchemaPipeline = (WinterFlowDatabaseSchemaPipeline) obj;
            return this.WinterFlowRouterRouter.equals(winterFlowDatabaseSchemaPipeline.WinterFlowRouterRouter) && this.WinterFlowSyntax.equals(winterFlowDatabaseSchemaPipeline.WinterFlowSyntax) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowTransactionManagerStrategy, winterFlowDatabaseSchemaPipeline.WinterFlowTransactionManagerStrategy) && WinterFlowTransactionManagerStrategy().equals(winterFlowDatabaseSchemaPipeline.WinterFlowTransactionManagerStrategy());
        }
        if (!(obj instanceof WinterFlowDatabaseSchemaPipeline)) {
            return false;
        }
        ?? r0 = this.WinterFlowVariableVersionControl;
        if (r0 == 0) {
            WinterFlowCacheManagerAgent();
            this.WinterFlowVariableVersionControl = this;
        } else {
            this = r0;
        }
        return obj.equals(this);
    }

    public final int hashCode() {
        WinterFlowTransactionManagerStrategy();
        return this.WinterFlowSyntax.hashCode() + ((this.WinterFlowRouterRouter.hashCode() + (WinterFlowTransactionManagerStrategy().hashCode() * 31)) * 31);
    }

    public final String toString() {
        WinterFlowDatabaseFramework winterFlowDatabaseFramework = this.WinterFlowVariableVersionControl;
        if (winterFlowDatabaseFramework == null) {
            WinterFlowCacheManagerAgent();
            this.WinterFlowVariableVersionControl = this;
            winterFlowDatabaseFramework = this;
        }
        if (winterFlowDatabaseFramework != this) {
            return winterFlowDatabaseFramework.toString();
        }
        String str = this.WinterFlowRouterRouter;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : WinterFlowResolverBackend.WinterFlowResponseEngine("function ", str, " (Kotlin reflection is not available)");
    }

    public WinterFlowDatabaseSchemaPipeline(int i, Class cls, String str, String str2, int i2) {
        this(i, i2, cls, WinterFlowVariablePlatform.WinterFlowVariableVersionControl, str, str2);
    }
}
