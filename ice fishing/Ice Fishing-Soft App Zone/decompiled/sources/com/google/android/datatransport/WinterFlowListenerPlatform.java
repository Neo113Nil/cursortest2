package com.google.android.datatransport;

import android.net.Uri;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowListenerPlatform {
    public int WinterFlowRouterStructure;
    public Object WinterFlowTransactionManagerStrategy;
    public Object WinterFlowVariableVersionControl;
    public Object WinterFlowHookDataSource = new WinterFlowWorkerInvoker[32];
    public Object WinterFlowCacheManagerAgent = new float[32];
    public Object WinterFlowArrayNetwork = new byte[32];

    public WinterFlowListenerPlatform() {
        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = WinterFlowLoaderSessionManager.WinterFlowRouterStructure;
        this.WinterFlowVariableVersionControl = new WinterFlowCacheManagerTransactionManager();
        this.WinterFlowTransactionManagerStrategy = new WinterFlowCacheManagerTransactionManager();
    }

    public WinterFlowLoaderValidator WinterFlowRouterStructure(String str) {
        WinterFlowPackageStructure winterFlowPackageStructure;
        str.getClass();
        WinterFlowRendererNode winterFlowRendererNode = (WinterFlowRendererNode) this.WinterFlowTransactionManagerStrategy;
        if (winterFlowRendererNode == null || (winterFlowPackageStructure = (WinterFlowPackageStructure) winterFlowRendererNode.getValue()) == null) {
            return null;
        }
        int i = WinterFlowServerLayer.WinterFlowSyntax;
        Uri parse = Uri.parse("android-app://androidx.navigation/".concat(str));
        parse.getClass();
        Bundle WinterFlowArrayNetwork = winterFlowPackageStructure.WinterFlowArrayNetwork(parse, (LinkedHashMap) this.WinterFlowArrayNetwork);
        if (WinterFlowArrayNetwork == null) {
            return null;
        }
        return new WinterFlowLoaderValidator((WinterFlowServerLayer) this.WinterFlowHookDataSource, WinterFlowArrayNetwork, winterFlowPackageStructure.WinterFlowServerProtocol, winterFlowPackageStructure.WinterFlowHookDataSource(parse), false);
    }
}
