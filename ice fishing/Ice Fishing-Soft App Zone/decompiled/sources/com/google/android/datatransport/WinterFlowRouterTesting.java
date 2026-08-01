package com.google.android.datatransport;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRouterTesting {
    public static final LinkedHashMap WinterFlowHookDataSource = new LinkedHashMap();
    public final LinkedHashMap WinterFlowRouterStructure = new LinkedHashMap();

    public final WinterFlowRendererRenderer WinterFlowHookDataSource(String str) {
        str.getClass();
        if (str.length() <= 0) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("navigator name cannot be an empty string");
            return null;
        }
        WinterFlowRendererRenderer winterFlowRendererRenderer = (WinterFlowRendererRenderer) this.WinterFlowRouterStructure.get(str);
        if (winterFlowRendererRenderer != null) {
            return winterFlowRendererRenderer;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter(WinterFlowResolverBackend.WinterFlowResponseEngine("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }

    public final void WinterFlowRouterStructure(WinterFlowRendererRenderer winterFlowRendererRenderer) {
        winterFlowRendererRenderer.getClass();
        String WinterFlowPackageIDE = WinterFlowSoftwareException.WinterFlowPackageIDE(winterFlowRendererRenderer.getClass());
        if (WinterFlowPackageIDE.length() <= 0) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.WinterFlowRouterStructure;
        WinterFlowRendererRenderer winterFlowRendererRenderer2 = (WinterFlowRendererRenderer) linkedHashMap.get(WinterFlowPackageIDE);
        if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererRenderer2, winterFlowRendererRenderer)) {
            return;
        }
        if (winterFlowRendererRenderer2 != null && winterFlowRendererRenderer2.WinterFlowHookDataSource) {
            WinterFlowEventEmitterOrchestration.WinterFlowConcurrencyThread("Navigator ", winterFlowRendererRenderer, " is replacing an already attached ", winterFlowRendererRenderer2);
        } else if (winterFlowRendererRenderer.WinterFlowHookDataSource) {
            WinterFlowEventEmitterOrchestration.WinterFlowSyntax("Navigator ", winterFlowRendererRenderer, " is already attached to another NavController");
        }
    }
}
