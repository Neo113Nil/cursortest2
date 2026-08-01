package com.google.android.datatransport;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowOrchestrationMapper {
    public final WinterFlowRequestEngine WinterFlowHookDataSource;
    public final LinkedHashMap WinterFlowRouterStructure;

    public WinterFlowOrchestrationMapper() {
        this.WinterFlowRouterStructure = new LinkedHashMap();
        this.WinterFlowHookDataSource = new WinterFlowRequestEngine(WinterFlowFrontendNode.WinterFlowVariableVersionControl);
    }

    public WinterFlowOrchestrationMapper(WinterFlowDatabaseScript winterFlowDatabaseScript) {
        this.WinterFlowRouterStructure = new LinkedHashMap();
        this.WinterFlowHookDataSource = new WinterFlowRequestEngine(winterFlowDatabaseScript);
    }
}
