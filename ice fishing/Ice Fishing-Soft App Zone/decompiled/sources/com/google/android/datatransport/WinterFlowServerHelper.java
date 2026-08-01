package com.google.android.datatransport;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServerHelper extends WinterFlowSyntaxCloud {
    public final /* synthetic */ WinterFlowSyntaxTransactionManager WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowSyntaxTransactionManager WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowSchedulerStructure WinterFlowSyntax;

    public WinterFlowServerHelper(WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager, WinterFlowSchedulerStructure winterFlowSchedulerStructure, WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager2) {
        this.WinterFlowRouterRouter = winterFlowSyntaxTransactionManager;
        this.WinterFlowSyntax = winterFlowSchedulerStructure;
        this.WinterFlowResponseEngine = winterFlowSyntaxTransactionManager2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r4.intValue() == r8.getSemanticsOwner().WinterFlowRouterStructure().WinterFlowTransactionManagerStrategy) goto L19;
     */
    @Override // com.google.android.datatransport.WinterFlowSyntaxCloud
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WinterFlowHookDataSource(View view, WinterFlowFrameworkDataSource winterFlowFrameworkDataSource) {
        AccessibilityNodeInfo accessibilityNodeInfo = winterFlowFrameworkDataSource.WinterFlowRouterStructure;
        this.WinterFlowVariableVersionControl.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager = this.WinterFlowRouterRouter;
        WinterFlowBackendEventEmitter winterFlowBackendEventEmitter = winterFlowSyntaxTransactionManager.WinterFlowConfigurationSubsystem;
        if (winterFlowBackendEventEmitter.WinterFlowBandwidthObject()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        WinterFlowSchedulerStructure winterFlowSchedulerStructure = this.WinterFlowSyntax;
        WinterFlowSchedulerStructure WinterFlowVariableBandwidth = winterFlowSchedulerStructure.WinterFlowVariableBandwidth();
        while (true) {
            if (WinterFlowVariableBandwidth == null) {
                WinterFlowVariableBandwidth = null;
                break;
            } else if (WinterFlowVariableBandwidth.WinterFlowUserManagerUserManager.WinterFlowCacheManagerAgent(8)) {
                break;
            } else {
                WinterFlowVariableBandwidth = WinterFlowVariableBandwidth.WinterFlowVariableBandwidth();
            }
        }
        Integer valueOf = WinterFlowVariableBandwidth != null ? Integer.valueOf(WinterFlowVariableBandwidth.WinterFlowTransactionManagerStrategy) : null;
        if (valueOf != null) {
        }
        valueOf = -1;
        int intValue = valueOf.intValue();
        winterFlowFrameworkDataSource.WinterFlowHookDataSource = intValue;
        WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager2 = this.WinterFlowResponseEngine;
        accessibilityNodeInfo.setParent(winterFlowSyntaxTransactionManager2, intValue);
        int i = winterFlowSchedulerStructure.WinterFlowTransactionManagerStrategy;
        int WinterFlowArrayNetwork = winterFlowBackendEventEmitter.WinterFlowCacheManagerListener.WinterFlowArrayNetwork(i);
        if (WinterFlowArrayNetwork != -1) {
            WinterFlowRouterLayer WinterFlowResponseEngine = WinterFlowDecoratorRouter.WinterFlowResponseEngine(winterFlowSyntaxTransactionManager.getAndroidViewsHandler$ui(), WinterFlowArrayNetwork);
            if (WinterFlowResponseEngine != null) {
                accessibilityNodeInfo.setTraversalBefore(WinterFlowResponseEngine);
            } else {
                accessibilityNodeInfo.setTraversalBefore(winterFlowSyntaxTransactionManager2, WinterFlowArrayNetwork);
            }
            winterFlowSyntaxTransactionManager.WinterFlowUnitTestResponse(i, accessibilityNodeInfo, winterFlowBackendEventEmitter.WinterFlowSoftwareProtocol);
        }
        int WinterFlowArrayNetwork2 = winterFlowBackendEventEmitter.WinterFlowPackageIDE.WinterFlowArrayNetwork(i);
        if (WinterFlowArrayNetwork2 != -1) {
            WinterFlowRouterLayer WinterFlowResponseEngine2 = WinterFlowDecoratorRouter.WinterFlowResponseEngine(winterFlowSyntaxTransactionManager.getAndroidViewsHandler$ui(), WinterFlowArrayNetwork2);
            if (WinterFlowResponseEngine2 != null) {
                accessibilityNodeInfo.setTraversalAfter(WinterFlowResponseEngine2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(winterFlowSyntaxTransactionManager2, WinterFlowArrayNetwork2);
            }
            winterFlowSyntaxTransactionManager.WinterFlowUnitTestResponse(i, accessibilityNodeInfo, winterFlowBackendEventEmitter.WinterFlowUserManagerUserManager);
        }
    }
}
