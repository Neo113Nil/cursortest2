package com.google.android.datatransport;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSyntaxEntity extends AccessibilityNodeProvider {
    public final WinterFlowConfigurationModule WinterFlowRouterStructure;

    public WinterFlowSyntaxEntity(WinterFlowConfigurationModule winterFlowConfigurationModule) {
        this.WinterFlowRouterStructure = winterFlowConfigurationModule;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy(i, new WinterFlowFrameworkDataSource(accessibilityNodeInfo), str, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        WinterFlowFrameworkDataSource WinterFlowUnitTestResponse = this.WinterFlowRouterStructure.WinterFlowUnitTestResponse(i);
        if (WinterFlowUnitTestResponse == null) {
            return null;
        }
        return WinterFlowUnitTestResponse.WinterFlowRouterStructure;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        WinterFlowFrameworkDataSource WinterFlowResponseEngine = this.WinterFlowRouterStructure.WinterFlowResponseEngine(i);
        if (WinterFlowResponseEngine == null) {
            return null;
        }
        return WinterFlowResponseEngine.WinterFlowRouterStructure;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.WinterFlowRouterStructure.WinterFlowOrchestrationSubsystem(i, i2, bundle);
    }
}
