package com.google.android.datatransport;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.icewinter.flow.winter.icecatch.R;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowValidatorEngine {
    public WinterFlowUserManagerMapper WinterFlowRouterStructure;

    public WinterFlowValidatorEngine(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.WinterFlowRouterStructure = new WinterFlowRepositorySerializer(WinterFlowWebsocketProcess.WinterFlowResponseEngine(i, interpolator, j));
        } else {
            this.WinterFlowRouterStructure = new WinterFlowControllerDataSource(i, interpolator, j);
        }
    }

    public static void WinterFlowRouterStructure(View view, WinterFlowWorkerCompiler winterFlowWorkerCompiler) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(winterFlowWorkerCompiler != null ? new WinterFlowBandwidthAdapter(winterFlowWorkerCompiler) : null);
            return;
        }
        PathInterpolator pathInterpolator = WinterFlowControllerDataSource.WinterFlowVariableVersionControl;
        View.OnApplyWindowInsetsListener winterFlowProtocolHelper = winterFlowWorkerCompiler != null ? new WinterFlowProtocolHelper(view, winterFlowWorkerCompiler) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, winterFlowProtocolHelper);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(winterFlowProtocolHelper);
        }
    }
}
