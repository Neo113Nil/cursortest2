package android.content.Context;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterAnnotationProcessorUltraQuantumDragon3248 {
    public static FrostHunterColorStateListFusionNebulaPhantom2470 FrostHunterBundlePulseFusionHero2475;
    public static final int FrostHunterAlphaAnimationNeoCosmos5761 = Color.argb(230, 255, 255, 255);
    public static final int FrostHunterConstraintSetCloneMasterUltraRogue2633 = Color.argb(128, 27, 27, 27);

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        r2.run();
        r10 = r10.getWindow();
        r10.getClass();
        r3.FrostHunterAlphaAnimationNeoCosmos5761(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void FrostHunterAlphaAnimationNeoCosmos5761(ComponentActivity componentActivity) {
        int i = 24;
        int i2 = 0;
        FrostHunterAsyncTitaniumMaxNova3282 frostHunterAsyncTitaniumMaxNova3282 = new FrostHunterAsyncTitaniumMaxNova3282(0, 0, new FrostHunterLaunchStormOlympian3697(i));
        FrostHunterAsyncTitaniumMaxNova3282 frostHunterAsyncTitaniumMaxNova32822 = new FrostHunterAsyncTitaniumMaxNova3282(FrostHunterAlphaAnimationNeoCosmos5761, FrostHunterConstraintSetCloneMasterUltraRogue2633, new FrostHunterLaunchStormOlympian3697(i));
        View decorView = componentActivity.getWindow().getDecorView();
        decorView.getClass();
        FrostHunterColorStateListFusionNebulaPhantom2470 frostHunterColorStateListFusionNebulaPhantom2470 = FrostHunterBundlePulseFusionHero2475;
        if (frostHunterColorStateListFusionNebulaPhantom2470 == null) {
            int i3 = Build.VERSION.SDK_INT;
            frostHunterColorStateListFusionNebulaPhantom2470 = i3 >= 35 ? new FrostHunterFilterAlphaTitaniumSpeed2790() : i3 >= 30 ? new FrostHunterBannerAdTitaniumOmegaVortex9984() : i3 >= 29 ? new FrostHunterSQLiteAuroraEpicCyber8038() : i3 >= 28 ? new FrostHunterLayoutUltraNovaX5978() : i3 >= 26 ? new FrostHunterGradientDrawableVortexMaxDelta9797() : new FrostHunterManifestBetaSolarDragon7908();
            FrostHunterBundlePulseFusionHero2475 = frostHunterColorStateListFusionNebulaPhantom2470;
        }
        FrostHunterColorStateListFusionNebulaPhantom2470 frostHunterColorStateListFusionNebulaPhantom24702 = frostHunterColorStateListFusionNebulaPhantom2470;
        FrostHunterInputFilterFusionBetaSolar5786 frostHunterInputFilterFusionBetaSolar5786 = new FrostHunterInputFilterFusionBetaSolar5786(frostHunterColorStateListFusionNebulaPhantom24702, frostHunterAsyncTitaniumMaxNova3282, frostHunterAsyncTitaniumMaxNova32822, componentActivity, decorView, 1);
        ViewGroup viewGroup = (ViewGroup) decorView;
        while (true) {
            if (i2 >= viewGroup.getChildCount()) {
                FrostHunterLaunchPixelShadow9625 frostHunterLaunchPixelShadow9625 = new FrostHunterLaunchPixelShadow9625(frostHunterInputFilterFusionBetaSolar5786, viewGroup.getContext());
                frostHunterLaunchPixelShadow9625.setTag(frostHunterColorStateListFusionNebulaPhantom24702);
                frostHunterLaunchPixelShadow9625.setVisibility(8);
                frostHunterLaunchPixelShadow9625.setWillNotDraw(true);
                viewGroup.addView(frostHunterLaunchPixelShadow9625);
                break;
            }
            int i4 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof FrostHunterColorStateListFusionNebulaPhantom2470) {
                break;
            } else {
                i2 = i4;
            }
        }
    }
}
