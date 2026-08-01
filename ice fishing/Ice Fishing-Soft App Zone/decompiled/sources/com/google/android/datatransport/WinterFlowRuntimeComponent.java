package com.google.android.datatransport;

import java.io.Serializable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowRuntimeComponent implements WinterFlowDatabaseFramework, Serializable {
    public final boolean WinterFlowResponseEngine;
    public final String WinterFlowRouterRouter;
    public final String WinterFlowSyntax;
    public final Object WinterFlowTransactionManagerStrategy;
    public final Class WinterFlowUnitTestResponse;
    public transient WinterFlowDatabaseFramework WinterFlowVariableVersionControl;

    public WinterFlowRuntimeComponent(Object obj, Class cls, String str, String str2, boolean z) {
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = cls;
        this.WinterFlowRouterRouter = str;
        this.WinterFlowSyntax = str2;
        this.WinterFlowResponseEngine = z;
    }

    public abstract WinterFlowDatabaseFramework WinterFlowCacheManagerAgent();

    public final WinterFlowDeploymentProcess WinterFlowTransactionManagerStrategy() {
        boolean z = this.WinterFlowResponseEngine;
        Class cls = this.WinterFlowUnitTestResponse;
        if (!z) {
            return WinterFlowListenerProtocol.WinterFlowRouterStructure(cls);
        }
        WinterFlowListenerProtocol.WinterFlowRouterStructure.getClass();
        return new WinterFlowFrontendEngine(cls);
    }
}
