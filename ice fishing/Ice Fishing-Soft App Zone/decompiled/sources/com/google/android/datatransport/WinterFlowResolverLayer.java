package com.google.android.datatransport;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResolverLayer implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ WinterFlowServiceLoader WinterFlowCacheManagerAgent;
    public final /* synthetic */ View WinterFlowHookDataSource;
    public WinterFlowWebsocketInterface WinterFlowRouterStructure = null;

    public WinterFlowResolverLayer(View view, WinterFlowServiceLoader winterFlowServiceLoader) {
        this.WinterFlowHookDataSource = view;
        this.WinterFlowCacheManagerAgent = winterFlowServiceLoader;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WinterFlowWebsocketInterface WinterFlowCacheManagerAgent = WinterFlowWebsocketInterface.WinterFlowCacheManagerAgent(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        WinterFlowServiceLoader winterFlowServiceLoader = this.WinterFlowCacheManagerAgent;
        if (i < 30) {
            WinterFlowIDEEvent.WinterFlowRouterStructure(windowInsets, this.WinterFlowHookDataSource);
            if (WinterFlowCacheManagerAgent.equals(this.WinterFlowRouterStructure)) {
                return winterFlowServiceLoader.WinterFlowRouterStructure(view, WinterFlowCacheManagerAgent).WinterFlowHookDataSource();
            }
        }
        this.WinterFlowRouterStructure = WinterFlowCacheManagerAgent;
        WinterFlowWebsocketInterface WinterFlowRouterStructure = winterFlowServiceLoader.WinterFlowRouterStructure(view, WinterFlowCacheManagerAgent);
        if (i >= 30) {
            return WinterFlowRouterStructure.WinterFlowHookDataSource();
        }
        int i2 = WinterFlowIDEComponent.WinterFlowRouterStructure;
        view.requestApplyInsets();
        return WinterFlowRouterStructure.WinterFlowHookDataSource();
    }
}
