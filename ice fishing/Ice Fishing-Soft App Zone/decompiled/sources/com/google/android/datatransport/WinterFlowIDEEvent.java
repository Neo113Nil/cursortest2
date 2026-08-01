package com.google.android.datatransport;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.icewinter.flow.winter.icecatch.R;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowIDEEvent {
    public static void WinterFlowHookDataSource(View view, WinterFlowServiceLoader winterFlowServiceLoader) {
        WinterFlowResolverLayer winterFlowResolverLayer = winterFlowServiceLoader != null ? new WinterFlowResolverLayer(view, winterFlowServiceLoader) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, winterFlowResolverLayer);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (winterFlowResolverLayer != null) {
            view.setOnApplyWindowInsetsListener(winterFlowResolverLayer);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void WinterFlowRouterStructure(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }
}
