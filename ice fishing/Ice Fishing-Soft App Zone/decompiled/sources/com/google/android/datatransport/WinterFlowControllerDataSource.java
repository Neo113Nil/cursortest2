package com.google.android.datatransport;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.icewinter.flow.winter.icecatch.R;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowControllerDataSource extends WinterFlowUserManagerMapper {
    public static final PathInterpolator WinterFlowVariableVersionControl = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final WinterFlowAlgorithmNetwork WinterFlowTransactionManagerStrategy = new WinterFlowAlgorithmNetwork();
    public static final DecelerateInterpolator WinterFlowUnitTestResponse = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator WinterFlowRouterRouter = new AccelerateInterpolator(1.5f);

    public static WinterFlowWorkerCompiler WinterFlowResponseEngine(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof WinterFlowProtocolHelper) {
            return ((WinterFlowProtocolHelper) tag).WinterFlowRouterStructure;
        }
        return null;
    }

    public static void WinterFlowRouterRouter(View view, WinterFlowWebsocketInterface winterFlowWebsocketInterface, List list) {
        WinterFlowWorkerCompiler WinterFlowResponseEngine = WinterFlowResponseEngine(view);
        if (WinterFlowResponseEngine != null) {
            winterFlowWebsocketInterface = WinterFlowResponseEngine.WinterFlowUnitTestResponse(winterFlowWebsocketInterface, list);
            if (WinterFlowResponseEngine.WinterFlowVariableVersionControl == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                WinterFlowRouterRouter(viewGroup.getChildAt(i), winterFlowWebsocketInterface, list);
            }
        }
    }

    public static void WinterFlowSyntax(View view, WinterFlowValidatorEngine winterFlowValidatorEngine, WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl) {
        WinterFlowWorkerCompiler WinterFlowResponseEngine = WinterFlowResponseEngine(view);
        if (WinterFlowResponseEngine != null) {
            WinterFlowResponseEngine.WinterFlowRouterRouter(winterFlowValidatorEngine, winterFlowCacheManagerVersionControl);
            if (WinterFlowResponseEngine.WinterFlowVariableVersionControl == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                WinterFlowSyntax(viewGroup.getChildAt(i), winterFlowValidatorEngine, winterFlowCacheManagerVersionControl);
            }
        }
    }

    public static void WinterFlowTransactionManagerStrategy(View view, WinterFlowValidatorEngine winterFlowValidatorEngine) {
        WinterFlowWorkerCompiler WinterFlowResponseEngine = WinterFlowResponseEngine(view);
        if (WinterFlowResponseEngine != null) {
            WinterFlowResponseEngine.WinterFlowVariableVersionControl(winterFlowValidatorEngine);
            if (WinterFlowResponseEngine.WinterFlowVariableVersionControl == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                WinterFlowTransactionManagerStrategy(viewGroup.getChildAt(i), winterFlowValidatorEngine);
            }
        }
    }

    public static void WinterFlowUnitTestResponse(View view, WinterFlowValidatorEngine winterFlowValidatorEngine, WinterFlowWebsocketInterface winterFlowWebsocketInterface, boolean z) {
        WinterFlowWorkerCompiler WinterFlowResponseEngine = WinterFlowResponseEngine(view);
        if (WinterFlowResponseEngine != null) {
            WinterFlowResponseEngine.WinterFlowTransactionManagerStrategy = winterFlowWebsocketInterface;
            if (!z) {
                WinterFlowResponseEngine.WinterFlowTransactionManagerStrategy(winterFlowValidatorEngine);
                z = WinterFlowResponseEngine.WinterFlowVariableVersionControl == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                WinterFlowUnitTestResponse(viewGroup.getChildAt(i), winterFlowValidatorEngine, winterFlowWebsocketInterface, z);
            }
        }
    }
}
