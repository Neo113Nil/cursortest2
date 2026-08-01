package com.google.android.datatransport;

import java.io.Serializable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowDebugFramework implements WinterFlowParserFramework, Serializable {
    public final int WinterFlowVariableVersionControl;

    public WinterFlowDebugFramework(int i) {
        this.WinterFlowVariableVersionControl = i;
    }

    @Override // com.google.android.datatransport.WinterFlowParserFramework
    public final int WinterFlowHookDataSource() {
        return this.WinterFlowVariableVersionControl;
    }

    public final String toString() {
        WinterFlowListenerProtocol.WinterFlowRouterStructure.getClass();
        return WinterFlowOrchestrationSystem.WinterFlowRouterStructure(this);
    }
}
