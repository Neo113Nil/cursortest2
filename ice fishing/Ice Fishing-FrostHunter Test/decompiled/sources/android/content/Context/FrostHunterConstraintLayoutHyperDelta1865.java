package android.content.Context;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterConstraintLayoutHyperDelta1865 {
    public static final FrostHunterTextInputLayoutBlazePhoenix5492 FrostHunterAlphaAnimationNeoCosmos5761;
    public static Paint FrostHunterBundlePulseFusionHero2475;
    public static final FrostHunterVectorDrawablePulseMaxStorm8774 FrostHunterConstraintSetCloneMasterUltraRogue2633;

    static {
        FrostHunterLooperThreadStormCyberElite6638.FrostHunterBundlePulseFusionHero2475("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterPlaceholderShadowOmegaVortex4518();
        } else if (i >= 29) {
            FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterDialogFragmentHyperionBeta7620();
        } else if (i >= 28) {
            FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterRewardedAdOlympianMasterEpic2377();
        } else if (i >= 26) {
            FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterMotionEventMegaShadowDelta8160();
        } else if (FrostHunterVectorDrawableBetaAuroraFusion3307.FrostHunterBundlePulseFusionHero2475 != null) {
            FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterVectorDrawableBetaAuroraFusion3307();
        } else {
            FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterTextRecognitionNebulaGamma2828();
        }
        FrostHunterConstraintSetCloneMasterUltraRogue2633 = new FrostHunterVectorDrawablePulseMaxStorm8774(16);
        FrostHunterBundlePulseFusionHero2475 = null;
        Trace.endSection();
    }

    public static Typeface FrostHunterAlphaAnimationNeoCosmos5761(Context context, FrostHunterInAppPurchaseAlphaCyberNeo4980 frostHunterInAppPurchaseAlphaCyberNeo4980, Resources resources, String str, int i, FrostHunterCardViewHyperionAurora3829 frostHunterCardViewHyperionAurora3829) {
        Typeface FrostHunterConstraintSetCloneMasterUltraRogue26332;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        boolean z = frostHunterInAppPurchaseAlphaCyberNeo4980 instanceof FrostHunterThreadEclipsePrime2743;
        FrostHunterVectorDrawablePulseMaxStorm8774 frostHunterVectorDrawablePulseMaxStorm8774 = FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (z) {
            FrostHunterThreadEclipsePrime2743 frostHunterThreadEclipsePrime2743 = (FrostHunterThreadEclipsePrime2743) frostHunterInAppPurchaseAlphaCyberNeo4980;
            String str2 = frostHunterThreadEclipsePrime2743.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            boolean z2 = false;
            if (TextUtils.isEmpty(str2) || (build = FrostHunterBundlePulseFusionHero2475(str2)) == null) {
                ArrayList arrayList = frostHunterThreadEclipsePrime2743.FrostHunterAlphaAnimationNeoCosmos5761;
                if (arrayList.size() == 1) {
                    build = FrostHunterBundlePulseFusionHero2475(((FrostHunterHandlerThreadFusionOmegaHero7374) arrayList.get(0)).FrostHunterLifecycleBlazeGammaElite2889);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= arrayList.size()) {
                                        break;
                                    }
                                    FrostHunterHandlerThreadFusionOmegaHero7374 frostHunterHandlerThreadFusionOmegaHero7374 = (FrostHunterHandlerThreadFusionOmegaHero7374) arrayList.get(i3);
                                    if (i3 == arrayList.size() - 1 && TextUtils.isEmpty(frostHunterHandlerThreadFusionOmegaHero7374.FrostHunterLevelListDrawableFusionDragonHero2232)) {
                                        customFallbackBuilder.setSystemFallback(frostHunterHandlerThreadFusionOmegaHero7374.FrostHunterLifecycleBlazeGammaElite2889);
                                        break;
                                    }
                                    String str3 = frostHunterHandlerThreadFusionOmegaHero7374.FrostHunterLifecycleBlazeGammaElite2889;
                                    String str4 = frostHunterHandlerThreadFusionOmegaHero7374.FrostHunterLevelListDrawableFusionDragonHero2232;
                                    Font FrostHunterServiceEliteCelestialThunder1757 = FrostHunterServiceEliteCelestialThunder1757(FrostHunterBundlePulseFusionHero2475(str3));
                                    if (FrostHunterServiceEliteCelestialThunder1757 == null) {
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build3 = FrostHunterLiveDataScopeStormThunder3672.FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterServiceEliteCelestialThunder1757).build();
                                    } else {
                                        try {
                                            FrostHunterLiveDataScopeStormThunder3672.FrostHunterScaleAnimationStrikeSpark5059();
                                            FrostHunterLiveDataScopeStormThunder3672.FrostHunterLooperHyperionForce4133();
                                            fontVariationSettings = FrostHunterKaptEclipsePhantomElite5915.FrostHunterServiceEliteCelestialThunder1757(FrostHunterServiceEliteCelestialThunder1757).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = FrostHunterLiveDataScopeStormThunder3672.FrostHunterFlowMaxDragonHero5809(build2).build();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = FrostHunterLiveDataScopeStormThunder3672.FrostHunterLifecycleBlazeGammaElite2889(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i3++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (FrostHunterBundlePulseFusionHero2475(((FrostHunterHandlerThreadFusionOmegaHero7374) arrayList.get(i2)).FrostHunterLifecycleBlazeGammaElite2889) == null) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                frostHunterVectorDrawablePulseMaxStorm8774.FrostHunterServiceEliteCelestialThunder1757(FrostHunterConstraintSetCloneMasterUltraRogue2633(resources, str, i), build);
                return build;
            }
            Handler handler = new Handler(Looper.getMainLooper());
            FrostHunterBundleMasterVision3644 frostHunterBundleMasterVision3644 = new FrostHunterBundleMasterVision3644();
            ArrayList arrayList2 = frostHunterThreadEclipsePrime2743.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterFirestoreMegaTitanCelestial9734 frostHunterFirestoreMegaTitanCelestial9734 = new FrostHunterFirestoreMegaTitanCelestial9734(0, handler);
            FrostHunterIntentForceSpeed4935 frostHunterIntentForceSpeed4935 = new FrostHunterIntentForceSpeed4935(7, frostHunterBundleMasterVision3644, frostHunterFirestoreMegaTitanCelestial9734);
            if (arrayList2.size() > 1) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Fallbacks with blocking fetches are not supported for performance reasons");
                return null;
            }
            FrostHunterHandlerThreadFusionOmegaHero7374 frostHunterHandlerThreadFusionOmegaHero73742 = (FrostHunterHandlerThreadFusionOmegaHero7374) arrayList2.get(0);
            FrostHunterVectorDrawablePulseMaxStorm8774 frostHunterVectorDrawablePulseMaxStorm87742 = FrostHunterAnimatorSolarDragonAlpha1060.FrostHunterAlphaAnimationNeoCosmos5761;
            ArrayList arrayList3 = new ArrayList(1);
            Object obj = new Object[]{frostHunterHandlerThreadFusionOmegaHero73742}[0];
            Objects.requireNonNull(obj);
            arrayList3.add(obj);
            List unmodifiableList = Collections.unmodifiableList(arrayList3);
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < unmodifiableList.size(); i4++) {
                sb.append(((FrostHunterHandlerThreadFusionOmegaHero7374) unmodifiableList.get(i4)).FrostHunterRemoteConfigSpeedSpeed8566);
                sb.append("-0");
                if (i4 < unmodifiableList.size() - 1) {
                    sb.append(";");
                }
            }
            String sb2 = sb.toString();
            FrostHunterConstraintSetCloneMasterUltraRogue26332 = (Typeface) FrostHunterAnimatorSolarDragonAlpha1060.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633(sb2);
            if (FrostHunterConstraintSetCloneMasterUltraRogue26332 != null) {
                frostHunterFirestoreMegaTitanCelestial9734.execute(new FrostHunterActivityRogueFusionRogue5543(16, frostHunterBundleMasterVision3644, FrostHunterConstraintSetCloneMasterUltraRogue26332, z2));
            } else {
                ArrayList arrayList4 = new ArrayList(1);
                Object obj2 = new Object[]{frostHunterHandlerThreadFusionOmegaHero73742}[0];
                Objects.requireNonNull(obj2);
                arrayList4.add(obj2);
                FrostHunterServiceInfoHeroNovaX4934 FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterAnimatorSolarDragonAlpha1060.FrostHunterAlphaAnimationNeoCosmos5761(sb2, context, Collections.unmodifiableList(arrayList4));
                frostHunterIntentForceSpeed4935.FrostHunterTextViewDragonStormMega4297(FrostHunterAlphaAnimationNeoCosmos57612);
                FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterAlphaAnimationNeoCosmos5761;
            }
        } else {
            FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633(context, (FrostHunterDataBindingHyperionEclipseNova9876) frostHunterInAppPurchaseAlphaCyberNeo4980, resources);
        }
        if (FrostHunterConstraintSetCloneMasterUltraRogue26332 != null) {
            frostHunterVectorDrawablePulseMaxStorm8774.FrostHunterServiceEliteCelestialThunder1757(FrostHunterConstraintSetCloneMasterUltraRogue2633(resources, str, i), FrostHunterConstraintSetCloneMasterUltraRogue26332);
        }
        return FrostHunterConstraintSetCloneMasterUltraRogue26332;
    }

    public static Typeface FrostHunterBundlePulseFusionHero2475(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static String FrostHunterConstraintSetCloneMasterUltraRogue2633(Resources resources, String str, int i) {
        return resources.getResourcePackageName(R.font.frost_font) + '-' + str + '-' + i + "-2131165184-0";
    }

    public static Font FrostHunterServiceEliteCelestialThunder1757(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (FrostHunterBundlePulseFusionHero2475 == null) {
            FrostHunterBundlePulseFusionHero2475 = new Paint();
        }
        FrostHunterBundlePulseFusionHero2475.setTextSize(10.0f);
        FrostHunterBundlePulseFusionHero2475.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, FrostHunterBundlePulseFusionHero2475);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
