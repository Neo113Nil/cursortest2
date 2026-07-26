package android.content.Context;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterAnimationSetSparkPhantomCelestial7545 {
    public static final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761 = 0;

    static {
        new WeakHashMap();
    }

    public static void FrostHunterAlphaAnimationNeoCosmos5761(ViewGroup viewGroup, FrostHunterImageAnalysisThunderSolar6127 frostHunterImageAnalysisThunderSolar6127) {
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(frostHunterImageAnalysisThunderSolar6127.FrostHunterConstraintSetCloneMasterUltraRogue2633);
    }

    public static void FrostHunterConstraintSetCloneMasterUltraRogue2633(View view, FrostHunterToastMasterCelestialAurora2505 frostHunterToastMasterCelestialAurora2505) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(frostHunterToastMasterCelestialAurora2505 != null ? new FrostHunterInstrumentationShadowForce8558(frostHunterToastMasterCelestialAurora2505) : null);
            return;
        }
        PathInterpolator pathInterpolator = FrostHunterSharedElementHyperVisionEpic7121.FrostHunterLifecycleBlazeGammaElite2889;
        View.OnApplyWindowInsetsListener frostHunterNotificationManagerLegendNovaStrike2435 = frostHunterToastMasterCelestialAurora2505 != null ? new FrostHunterNotificationManagerLegendNovaStrike2435(view, frostHunterToastMasterCelestialAurora2505) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, frostHunterNotificationManagerLegendNovaStrike2435);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(frostHunterNotificationManagerLegendNovaStrike2435);
        }
    }
}
