package android.content.Context;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context.FrostHunterTextInputLayoutLegendBeta2184;
import android.os.Build;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterVectorDrawableCompatDragonThunderDelta5772 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void FrostHunterAlphaAnimationNeoCosmos5761(Activity activity, FrostHunterMaterialCardViewLegendDragon2868 frostHunterMaterialCardViewLegendDragon2868) {
        frostHunterMaterialCardViewLegendDragon2868.getClass();
        if (activity instanceof FrostHunterNotificationSpectraTurbo8770) {
            FrostHunterDrawerLayoutEpicFusionShadow4742 FrostHunterRemoteConfigSpeedSpeed8566 = ((FrostHunterNotificationSpectraTurbo8770) activity).FrostHunterRemoteConfigSpeedSpeed8566();
            if (FrostHunterRemoteConfigSpeedSpeed8566 instanceof FrostHunterDrawerLayoutEpicFusionShadow4742) {
                FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterServiceEliteCelestialThunder1757(frostHunterMaterialCardViewLegendDragon2868);
            }
        }
    }

    public static void FrostHunterConstraintSetCloneMasterUltraRogue2633(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            FrostHunterTextInputLayoutLegendBeta2184.FrostHunterTransitionManagerOmegaNeoMaster3754.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new FrostHunterTextInputLayoutLegendBeta2184.FrostHunterTransitionManagerOmegaNeoMaster3754());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FrostHunterTextInputLayoutLegendBeta2184(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
