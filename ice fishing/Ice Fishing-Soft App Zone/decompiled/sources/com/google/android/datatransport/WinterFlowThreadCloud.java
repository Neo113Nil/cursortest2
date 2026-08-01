package com.google.android.datatransport;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowThreadCloud implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int WinterFlowArrayNetwork;
    public final /* synthetic */ WinterFlowWebsocketInterface WinterFlowCacheManagerAgent;
    public final /* synthetic */ WinterFlowWebsocketInterface WinterFlowHookDataSource;
    public final /* synthetic */ WinterFlowValidatorEngine WinterFlowRouterStructure;
    public final /* synthetic */ View WinterFlowVariableVersionControl;

    public WinterFlowThreadCloud(WinterFlowValidatorEngine winterFlowValidatorEngine, WinterFlowWebsocketInterface winterFlowWebsocketInterface, WinterFlowWebsocketInterface winterFlowWebsocketInterface2, int i, View view) {
        this.WinterFlowRouterStructure = winterFlowValidatorEngine;
        this.WinterFlowHookDataSource = winterFlowWebsocketInterface;
        this.WinterFlowCacheManagerAgent = winterFlowWebsocketInterface2;
        this.WinterFlowArrayNetwork = i;
        this.WinterFlowVariableVersionControl = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        WinterFlowValidatorEngine winterFlowValidatorEngine = this.WinterFlowRouterStructure;
        WinterFlowUserManagerMapper winterFlowUserManagerMapper = winterFlowValidatorEngine.WinterFlowRouterStructure;
        winterFlowUserManagerMapper.WinterFlowVariableVersionControl(animatedFraction);
        float WinterFlowCacheManagerAgent = winterFlowUserManagerMapper.WinterFlowCacheManagerAgent();
        PathInterpolator pathInterpolator = WinterFlowControllerDataSource.WinterFlowVariableVersionControl;
        int i = Build.VERSION.SDK_INT;
        WinterFlowWebsocketInterface winterFlowWebsocketInterface = this.WinterFlowHookDataSource;
        WinterFlowProviderAdapter winterFlowParserServiceProvider = i >= 36 ? new WinterFlowParserServiceProvider(winterFlowWebsocketInterface) : i >= 35 ? new WinterFlowHookWorker(winterFlowWebsocketInterface) : i >= 34 ? new WinterFlowSerializerTool(winterFlowWebsocketInterface) : i >= 31 ? new WinterFlowClassTransaction(winterFlowWebsocketInterface) : i >= 30 ? new WinterFlowServerModule(winterFlowWebsocketInterface) : i >= 29 ? new WinterFlowRouterCache(winterFlowWebsocketInterface) : new WinterFlowPipelineConfiguration(winterFlowWebsocketInterface);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.WinterFlowArrayNetwork & i2;
            WinterFlowWidgetEntity winterFlowWidgetEntity = winterFlowWebsocketInterface.WinterFlowRouterStructure;
            if (i3 == 0) {
                winterFlowParserServiceProvider.WinterFlowArrayNetwork(i2, winterFlowWidgetEntity.WinterFlowSyntax(i2));
            } else {
                WinterFlowVariableDataSource WinterFlowSyntax = winterFlowWidgetEntity.WinterFlowSyntax(i2);
                WinterFlowVariableDataSource WinterFlowSyntax2 = this.WinterFlowCacheManagerAgent.WinterFlowRouterStructure.WinterFlowSyntax(i2);
                float f = 1.0f - WinterFlowCacheManagerAgent;
                winterFlowParserServiceProvider.WinterFlowArrayNetwork(i2, WinterFlowWebsocketInterface.WinterFlowRouterStructure(WinterFlowSyntax, (int) (((WinterFlowSyntax.WinterFlowRouterStructure - WinterFlowSyntax2.WinterFlowRouterStructure) * f) + 0.5d), (int) (((WinterFlowSyntax.WinterFlowHookDataSource - WinterFlowSyntax2.WinterFlowHookDataSource) * f) + 0.5d), (int) (((WinterFlowSyntax.WinterFlowCacheManagerAgent - WinterFlowSyntax2.WinterFlowCacheManagerAgent) * f) + 0.5d), (int) (((WinterFlowSyntax.WinterFlowArrayNetwork - WinterFlowSyntax2.WinterFlowArrayNetwork) * f) + 0.5d)));
            }
        }
        WinterFlowControllerDataSource.WinterFlowRouterRouter(this.WinterFlowVariableVersionControl, winterFlowParserServiceProvider.WinterFlowHookDataSource(), Collections.singletonList(winterFlowValidatorEngine));
    }
}
