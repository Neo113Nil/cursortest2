package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSyntaxValidator {
    public static WinterFlowAlgorithmManager WinterFlowRouterStructure(Object obj, Object obj2) {
        WinterFlowAlgorithmManager winterFlowAlgorithmManager = (WinterFlowAlgorithmManager) obj;
        WinterFlowAlgorithmManager winterFlowAlgorithmManager2 = (WinterFlowAlgorithmManager) obj2;
        if (!winterFlowAlgorithmManager2.isEmpty()) {
            if (!winterFlowAlgorithmManager.WinterFlowVariableVersionControl) {
                winterFlowAlgorithmManager = winterFlowAlgorithmManager.WinterFlowHookDataSource();
            }
            winterFlowAlgorithmManager.WinterFlowRouterStructure();
            if (!winterFlowAlgorithmManager2.isEmpty()) {
                winterFlowAlgorithmManager.putAll(winterFlowAlgorithmManager2);
            }
        }
        return winterFlowAlgorithmManager;
    }
}
