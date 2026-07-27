package android.content.Context;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterColorStateListInflaterShadowSpeedMega1758 {
    public static final LinkedHashMap FrostHunterAlphaAnimationNeoCosmos5761 = new LinkedHashMap();

    public static final FrostHunterPaintFlagsDrawFilterStrikeGammaHero6122 FrostHunterAlphaAnimationNeoCosmos5761(Context context) {
        FrostHunterPaintFlagsDrawFilterStrikeGammaHero6122 frostHunterPaintFlagsDrawFilterStrikeGammaHero6122;
        LinkedHashMap linkedHashMap = FrostHunterAlphaAnimationNeoCosmos5761;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    FrostHunterShapeDrawableAuroraThunder2834 FrostHunterBundlePulseFusionHero2475 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterBundlePulseFusionHero2475(-1, null, 6);
                    FrostHunterAnimatorQuantumFusionMaster8565 frostHunterAnimatorQuantumFusionMaster8565 = new FrostHunterAnimatorQuantumFusionMaster8565(12, new FrostHunterMotionLayoutSpectraMaster9796(contentResolver, uriFor, new FrostHunterTextInputEditTextLegendHyperion2871(FrostHunterBundlePulseFusionHero2475, FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDialogFragmentTurboPhoenixDragon7627(Looper.getMainLooper())), FrostHunterBundlePulseFusionHero2475, context, null));
                    FrostHunterAnalyticsEliteTurbo5870 FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterAlphaAnimationNeoCosmos5761();
                    FrostHunterFragmentTransactionBetaUltra7746 frostHunterFragmentTransactionBetaUltra7746 = FrostHunterInsetDrawableOmegaForce2390.FrostHunterAlphaAnimationNeoCosmos5761;
                    obj = FrostHunterPaintCyberPulse5979.FrostHunterTransitionListenerPulseVortexCosmos7949(frostHunterAnimatorQuantumFusionMaster8565, new FrostHunterContentObserverShadowShadow6344(FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdMasterStrike9463(FrostHunterAlphaAnimationNeoCosmos57612, FrostHunterVideoCaptureSpeedOlympianDragon5178.FrostHunterAlphaAnimationNeoCosmos5761)), new FrostHunterPermissionQuantumElite1956(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                frostHunterPaintFlagsDrawFilterStrikeGammaHero6122 = (FrostHunterPaintFlagsDrawFilterStrikeGammaHero6122) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return frostHunterPaintFlagsDrawFilterStrikeGammaHero6122;
    }

    public static final FrostHunterActivityInfoTitaniumAlphaElite4329 FrostHunterConstraintSetCloneMasterUltraRogue2633(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof FrostHunterActivityInfoTitaniumAlphaElite4329) {
            return (FrostHunterActivityInfoTitaniumAlphaElite4329) tag;
        }
        return null;
    }
}
