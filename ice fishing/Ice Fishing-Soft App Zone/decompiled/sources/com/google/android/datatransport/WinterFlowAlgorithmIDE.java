package com.google.android.datatransport;

import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAlgorithmIDE {
    public final List WinterFlowRouterStructure;

    public WinterFlowAlgorithmIDE(WinterFlowStrategyXML... winterFlowStrategyXMLArr) {
        if (winterFlowStrategyXMLArr.length <= 0) {
            this.WinterFlowRouterStructure = WinterFlowProtocolPipeline.WinterFlowOrchestrationConfiguration(winterFlowStrategyXMLArr);
        } else {
            WinterFlowStrategyXML winterFlowStrategyXML = winterFlowStrategyXMLArr[0];
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WinterFlowAlgorithmIDE) {
            return this.WinterFlowRouterStructure.equals(((WinterFlowAlgorithmIDE) obj).WinterFlowRouterStructure);
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode();
    }
}
