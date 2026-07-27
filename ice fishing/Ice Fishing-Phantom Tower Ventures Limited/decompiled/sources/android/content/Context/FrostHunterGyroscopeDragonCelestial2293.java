package android.content.Context;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterGyroscopeDragonCelestial2293 {
    public static final ViewGroup.LayoutParams FrostHunterAlphaAnimationNeoCosmos5761 = new ViewGroup.LayoutParams(-2, -2);

    public static void FrostHunterAlphaAnimationNeoCosmos5761(ComponentActivity componentActivity, FrostHunterFlatMapAuroraOlympianBeta5874 frostHunterFlatMapAuroraOlympianBeta5874) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        FrostHunterTextInputLayoutMasterNova2690 frostHunterTextInputLayoutMasterNova2690 = childAt instanceof FrostHunterTextInputLayoutMasterNova2690 ? (FrostHunterTextInputLayoutMasterNova2690) childAt : null;
        if (frostHunterTextInputLayoutMasterNova2690 != null) {
            frostHunterTextInputLayoutMasterNova2690.setParentCompositionContext(null);
            frostHunterTextInputLayoutMasterNova2690.setContent(frostHunterFlatMapAuroraOlympianBeta5874);
            return;
        }
        FrostHunterTextInputLayoutMasterNova2690 frostHunterTextInputLayoutMasterNova26902 = new FrostHunterTextInputLayoutMasterNova2690(componentActivity);
        frostHunterTextInputLayoutMasterNova26902.setParentCompositionContext(null);
        frostHunterTextInputLayoutMasterNova26902.setContent(frostHunterFlatMapAuroraOlympianBeta5874);
        View decorView = componentActivity.getWindow().getDecorView();
        if (FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterBundlePulseFusionHero2475(decorView) == null) {
            decorView.setTag(com.frosthunter.arcticwildlands.frozenexpedition.adventure.R.id.view_tree_lifecycle_owner, componentActivity);
        }
        if (FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterLifecycleBlazeGammaElite2889(decorView) == null) {
            decorView.setTag(com.frosthunter.arcticwildlands.frozenexpedition.adventure.R.id.view_tree_view_model_store_owner, componentActivity);
        }
        if (FrostHunterLooperThreadStormCyberElite6638.FrostHunterLifecycleBlazeGammaElite2889(decorView) == null) {
            decorView.setTag(com.frosthunter.arcticwildlands.frozenexpedition.adventure.R.id.view_tree_saved_state_registry_owner, componentActivity);
        }
        componentActivity.setContentView(frostHunterTextInputLayoutMasterNova26902, FrostHunterAlphaAnimationNeoCosmos5761);
    }
}
