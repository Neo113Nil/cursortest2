package android.content.Context;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterStrictModePhantomQuantumCelestial6608 {
    public static void FrostHunterAlphaAnimationNeoCosmos5761(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void FrostHunterConstraintSetCloneMasterUltraRogue2633(View view, FrostHunterFlowCollectorPhoenixUltra3104 frostHunterFlowCollectorPhoenixUltra3104) {
        FrostHunterApplicationInfoEclipseNovaX5930 frostHunterApplicationInfoEclipseNovaX5930 = frostHunterFlowCollectorPhoenixUltra3104 != null ? new FrostHunterApplicationInfoEclipseNovaX5930(view, frostHunterFlowCollectorPhoenixUltra3104) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, frostHunterApplicationInfoEclipseNovaX5930);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (frostHunterApplicationInfoEclipseNovaX5930 != null) {
            view.setOnApplyWindowInsetsListener(frostHunterApplicationInfoEclipseNovaX5930);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }
}
