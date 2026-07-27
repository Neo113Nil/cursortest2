package android.content.Context;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterBannerAdTitanVisionDragon3523 {
    public static Boolean FrostHunterAlertDialogAuroraDelta3200;
    public static Boolean FrostHunterCameraXPixelTurboCosmos9814;
    public static Boolean FrostHunterFlowMaxDragonHero5809;
    public static Boolean FrostHunterRemoteConfigSpeedSpeed8566;
    public static final FrostHunterRewardedAdHyperStrike1151 FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterRewardedAdHyperStrike1151(21);
    public static final FrostHunterCoroutineCelestialOmega6845 FrostHunterConstraintSetCloneMasterUltraRogue2633 = new FrostHunterCoroutineCelestialOmega6845(8);
    public static final FrostHunterInstrumentationStrikeBlazeThunder7469 FrostHunterBundlePulseFusionHero2475 = new FrostHunterInstrumentationStrikeBlazeThunder7469(Boolean.TRUE);
    public static final StackTraceElement[] FrostHunterServiceEliteCelestialThunder1757 = new StackTraceElement[0];
    public static final FrostHunterCoordinatorLayoutEliteBlaze9319 FrostHunterLifecycleBlazeGammaElite2889 = new FrostHunterCoordinatorLayoutEliteBlaze9319(0, new long[0], new Object[0]);
    public static final byte[] FrostHunterLevelListDrawableFusionDragonHero2232 = new byte[0];

    public static final boolean FrostHunterAlertDialogAuroraDelta3200(FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511, Resources resources) {
        Object FrostHunterRemoteConfigSpeedSpeed85662 = frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterAlphaAnimationNeoCosmos5761);
        if (FrostHunterRemoteConfigSpeedSpeed85662 == null) {
            FrostHunterRemoteConfigSpeedSpeed85662 = null;
        }
        List list = (List) FrostHunterRemoteConfigSpeedSpeed85662;
        return !FrostHunterRemoteConfigPhantomDelta1739.FrostHunterBillingClientFusionVortex9008(frostHunterSharedElementSpectraNeo2511) && (frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757.FrostHunterAlertDialogAuroraDelta3200 || (frostHunterSharedElementSpectraNeo2511.FrostHunterScaleAnimationStrikeSpark5059() && ((list != null ? (String) FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterSharedElementPixelTitan2806(list) : null) != null || FrostHunterMeteringPointMegaCyber7955(frostHunterSharedElementSpectraNeo2511) != null || FrostHunterViewPhantomNeo1634(frostHunterSharedElementSpectraNeo2511, resources) != null || FrostHunterCardViewSpectraCyber7714(frostHunterSharedElementSpectraNeo2511))));
    }

    public static FrostHunterAlarmManagerHyperCelestialDelta9185 FrostHunterAlphaAnimationNeoCosmos5761(float f, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new FrostHunterAlarmManagerHyperCelestialDelta9185(FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterKeyframeGammaGamma1197, Float.valueOf(0.0f), new FrostHunterIntentServiceHyperionQuantumInferno4126(f), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static SharedPreferences FrostHunterBillingClientFusionVortex9008(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final int FrostHunterBitmapTurboDeltaNebula8743(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            FrostHunterPaintFlagsDrawFilterSpectraCyber3909 frostHunterPaintFlagsDrawFilterSpectraCyber3909 = (FrostHunterPaintFlagsDrawFilterSpectraCyber3909) list.get(i3);
            char c = frostHunterPaintFlagsDrawFilterSpectraCyber3909.FrostHunterServiceEliteCelestialThunder1757 > i ? (char) 1 : frostHunterPaintFlagsDrawFilterSpectraCyber3909.FrostHunterLifecycleBlazeGammaElite2889 <= i ? (char) 65535 : (char) 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void FrostHunterBundlePulseFusionHero2475(String str, FrostHunterCombineBlazeLegendGamma9228 frostHunterCombineBlazeLegendGamma9228, FrostHunterFragmentManagerFusionNovaDragon6284 frostHunterFragmentManagerFusionNovaDragon6284, int i, boolean z, int i2, int i3, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, int i4) {
        int i5;
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(-1186827822);
        if ((i4 & 6) == 0) {
            i5 = (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(str) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterCombineBlazeLegendGamma9228) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterFragmentManagerFusionNovaDragon6284) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(null) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterServiceEliteCelestialThunder1757(i) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterRemoteConfigSpeedSpeed8566(z) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterServiceEliteCelestialThunder1757(i2) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterServiceEliteCelestialThunder1757(i3) ? 8388608 : 4194304;
        }
        int i6 = i5 | 100663296;
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i6 & 1, (38347923 & i6) != 38347922)) {
            FrostHunterConstraintSetCloneMasterUltraRogue2633(str, frostHunterCombineBlazeLegendGamma9228, frostHunterFragmentManagerFusionNovaDragon6284, i, z, i2, i3, frostHunterDialogFragmentPhantomEclipse8068, i6 & 268435454);
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterOnTouchListenerMasterForceNovaX7611(str, frostHunterCombineBlazeLegendGamma9228, frostHunterFragmentManagerFusionNovaDragon6284, i, z, i2, i3, i4, 0);
        }
    }

    public static final Rect FrostHunterCameraXPixelTurboCosmos9814(FrostHunterGroupRogueCosmos5144 frostHunterGroupRogueCosmos5144, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        FrostHunterServiceInfoTitaniumPrimeCyber9213 FrostHunterCardViewSpectraCyber7714 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterCardViewSpectraCyber7714(((FrostHunterLiveDataScopeBlazeStrike6673) frostHunterGroupRogueCosmos5144).FrostHunterBundlePulseFusionHero2475);
        FrostHunterBarrierThunderHyperion9659 FrostHunterViewPhantomNeo1634 = FrostHunterCardViewSpectraCyber7714 != null ? FrostHunterDrawerLayoutUltraStrike3303.FrostHunterViewPhantomNeo1634(FrostHunterCardViewSpectraCyber7714) : null;
        if (FrostHunterViewPhantomNeo1634 == null) {
            return null;
        }
        int i = (int) FrostHunterViewPhantomNeo1634.FrostHunterAlphaAnimationNeoCosmos5761;
        int i2 = iArr[0];
        int i3 = iArr2[0];
        int i4 = (int) FrostHunterViewPhantomNeo1634.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i5 = iArr[1];
        int i6 = iArr2[1];
        return new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475) + i2) - i3, (((int) FrostHunterViewPhantomNeo1634.FrostHunterServiceEliteCelestialThunder1757) + i5) - i6);
    }

    public static final FrostHunterRealtimeDatabaseBetaOlympianPhoenix2409 FrostHunterCameraXTurboCelestialHero5430(Throwable th) {
        th.getClass();
        return new FrostHunterRealtimeDatabaseBetaOlympianPhoenix2409(th);
    }

    public static final boolean FrostHunterCardViewSpectraCyber7714(FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511) {
        Object FrostHunterRemoteConfigSpeedSpeed85662 = frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterMeteringPointMegaCyber7955);
        if (FrostHunterRemoteConfigSpeedSpeed85662 == null) {
            FrostHunterRemoteConfigSpeedSpeed85662 = null;
        }
        FrostHunterActivityFusionDelta7273 frostHunterActivityFusionDelta7273 = (FrostHunterActivityFusionDelta7273) FrostHunterRemoteConfigSpeedSpeed85662;
        FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder2275 = frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757.FrostHunterCameraXPixelTurboCosmos9814;
        Object FrostHunterRemoteConfigSpeedSpeed85663 = frostHunterToastHyperTitanThunder2275.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterMotionSceneAuroraMega2271);
        if (FrostHunterRemoteConfigSpeedSpeed85663 == null) {
            FrostHunterRemoteConfigSpeedSpeed85663 = null;
        }
        FrostHunterPoseDetectionThunderCosmos3414 frostHunterPoseDetectionThunderCosmos3414 = (FrostHunterPoseDetectionThunderCosmos3414) FrostHunterRemoteConfigSpeedSpeed85663;
        boolean z = frostHunterActivityFusionDelta7273 != null;
        Object FrostHunterRemoteConfigSpeedSpeed85664 = frostHunterToastHyperTitanThunder2275.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterViewPhantomNeo1634);
        if (((Boolean) (FrostHunterRemoteConfigSpeedSpeed85664 != null ? FrostHunterRemoteConfigSpeedSpeed85664 : null)) == null || (frostHunterPoseDetectionThunderCosmos3414 != null && frostHunterPoseDetectionThunderCosmos3414.FrostHunterAlphaAnimationNeoCosmos5761 == 4)) {
            return z;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:91|(25:144|145|(1:147)|95|96|(1:142)(1:100)|101|(10:106|107|108|109|110|(1:112)(1:126)|113|(1:125)|117|118)|129|130|131|132|133|134|135|107|108|109|110|(0)(0)|113|(1:115)|125|117|118)|93|(24:143|96|(1:98)|140|142|101|(12:103|106|107|108|109|110|(0)(0)|113|(0)|125|117|118)|129|130|131|132|133|134|135|107|108|109|110|(0)(0)|113|(0)|125|117|118)|95|96|(0)|140|142|101|(0)|129|130|131|132|133|134|135|107|108|109|110|(0)(0)|113|(0)|125|117|118) */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01e6, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c2 A[Catch: RejectedExecutionException -> 0x0188, TryCatch #0 {RejectedExecutionException -> 0x0188, blocks: (B:145:0x0181, B:96:0x0192, B:98:0x01a4, B:101:0x01b1, B:103:0x01c2, B:129:0x01cb, B:140:0x01aa, B:93:0x018b), top: B:144:0x0181 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a4 A[Catch: RejectedExecutionException -> 0x0188, TryCatch #0 {RejectedExecutionException -> 0x0188, blocks: (B:145:0x0181, B:96:0x0192, B:98:0x01a4, B:101:0x01b1, B:103:0x01c2, B:129:0x01cb, B:140:0x01aa, B:93:0x018b), top: B:144:0x0181 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FrostHunterConstraintSetCloneMasterUltraRogue2633(String str, FrostHunterCombineBlazeLegendGamma9228 frostHunterCombineBlazeLegendGamma9228, FrostHunterFragmentManagerFusionNovaDragon6284 frostHunterFragmentManagerFusionNovaDragon6284, int i, boolean z, int i2, int i3, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, int i4) {
        int i5;
        FrostHunterNotificationManagerHeroNova8010 frostHunterNotificationManagerHeroNova8010;
        boolean z2;
        int hashCode;
        boolean z3;
        boolean FrostHunterServiceEliteCelestialThunder17572;
        Object FrostHunterMagnetometerFusionTitanium8202;
        Object frostHunterInputFilterFusionBetaSolar5786;
        Executor executor;
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(-1040751001);
        if ((i4 & 6) == 0) {
            i5 = (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(str) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterCombineBlazeLegendGamma9228) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterFragmentManagerFusionNovaDragon6284) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(null) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterServiceEliteCelestialThunder1757(i) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterRemoteConfigSpeedSpeed8566(z) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterServiceEliteCelestialThunder1757(i2) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterServiceEliteCelestialThunder1757(i3) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i5 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(null) ? 67108864 : 33554432;
        }
        int i6 = i5 | 805306368;
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i6 & 1, (306783379 & i6) != 306783378)) {
            if (i3 <= 0 || i2 <= 0) {
                FrostHunterGradlePluginHeroBetaThunder1341.FrostHunterAlphaAnimationNeoCosmos5761("both minLines " + i3 + " and maxLines " + i2 + " must be greater than zero");
            }
            if (i3 > i2) {
                FrostHunterGradlePluginHeroBetaThunder1341.FrostHunterAlphaAnimationNeoCosmos5761("minLines " + i3 + " must be less than or equal to maxLines " + i2);
            }
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterBarrierSpectraShadowOlympian1683.FrostHunterAlphaAnimationNeoCosmos5761) != null) {
                FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterAlphaAnimationNeoCosmos5761();
                return;
            }
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(356926143);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
            FrostHunterNotificationManagerHeroNova8010 frostHunterNotificationManagerHeroNova80102 = (FrostHunterNotificationManagerHeroNova8010) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterActionBarTitanBeta1231.FrostHunterKeyframeGammaGamma1197);
            int i7 = ((i6 >> 3) & 112) | (i6 & 14);
            Executor executor2 = (Executor) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterVideoCaptureNeoPulse8171.FrostHunterAlphaAnimationNeoCosmos5761);
            if (executor2 != null) {
                int length = str.length();
                if (Build.VERSION.SDK_INT >= 28 && length >= 8 && length < 1000) {
                    if (FrostHunterVideoCaptureNeoPulse8171.FrostHunterConstraintSetCloneMasterUltraRogue2633 == null) {
                        FrostHunterVideoCaptureNeoPulse8171.FrostHunterConstraintSetCloneMasterUltraRogue2633 = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                    }
                    Boolean bool = FrostHunterVideoCaptureNeoPulse8171.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    bool.getClass();
                    if (bool.booleanValue()) {
                        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(1254328095);
                        FrostHunterViewLegendStormDelta9630 frostHunterViewLegendStormDelta9630 = (FrostHunterViewLegendStormDelta9630) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterActionBarTitanBeta1231.FrostHunterLightSensorForceFusion4241);
                        FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed4562 = (FrostHunterDispatchersPrimeHeroSpeed4562) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterActionBarTitanBeta1231.FrostHunterCameraXPixelTurboCosmos9814);
                        if (((i7 & 112) ^ 48) > 32) {
                            try {
                                if (!frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterFragmentManagerFusionNovaDragon6284)) {
                                }
                                z3 = true;
                                FrostHunterServiceEliteCelestialThunder17572 = ((((i7 & 14) ^ 6) <= 4 && frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(str)) || (i7 & 6) == 4) | z3 | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterServiceEliteCelestialThunder1757(frostHunterViewLegendStormDelta9630.ordinal()) | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterDispatchersPrimeHeroSpeed4562) | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationManagerHeroNova80102);
                                FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
                            } catch (RejectedExecutionException unused) {
                                frostHunterNotificationManagerHeroNova8010 = frostHunterNotificationManagerHeroNova80102;
                            }
                            if (!FrostHunterServiceEliteCelestialThunder17572 && FrostHunterMagnetometerFusionTitanium8202 != FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761) {
                                frostHunterInputFilterFusionBetaSolar5786 = FrostHunterMagnetometerFusionTitanium8202;
                                frostHunterNotificationManagerHeroNova8010 = frostHunterNotificationManagerHeroNova80102;
                                executor = executor2;
                                executor.execute((Runnable) frostHunterInputFilterFusionBetaSolar5786);
                                z2 = false;
                                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
                                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(357887763);
                                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(z2);
                                FrostHunterCombineBlazeLegendGamma9228 FrostHunterServiceEliteCelestialThunder17573 = frostHunterCombineBlazeLegendGamma9228.FrostHunterServiceEliteCelestialThunder1757(new TextStringSimpleElement(str, frostHunterFragmentManagerFusionNovaDragon6284, frostHunterNotificationManagerHeroNova8010, i, z, i2, i3));
                                FrostHunterBillingClientForceThunder1002 frostHunterBillingClientForceThunder1002 = FrostHunterBillingClientForceThunder1002.FrostHunterServiceEliteCelestialThunder1757;
                                hashCode = Long.hashCode(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752);
                                FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike9463 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterServiceEliteCelestialThunder17573);
                                FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex6025 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
                                FrostHunterContextHyperDelta9193.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
                                FrostHunterBundleShadowStrike1123 frostHunterBundleShadowStrike1123 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAnnotationProcessorSparkEclipse8710();
                                if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                                    frostHunterDialogFragmentPhantomEclipse8068.FrostHunterImageAnalysisGammaOlympian2400();
                                } else {
                                    frostHunterDialogFragmentPhantomEclipse8068.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike1123);
                                }
                                FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterLifecycleBlazeGammaElite2889, frostHunterBillingClientForceThunder1002);
                                FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterServiceEliteCelestialThunder1757, FrostHunterFragmentBetaMegaVortex6025);
                                FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterBundlePulseFusionHero2475, FrostHunterRewardedAdMasterStrike9463);
                                FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega2451 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLevelListDrawableFusionDragonHero2232;
                                if (!frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode))) {
                                    FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode, frostHunterDialogFragmentPhantomEclipse8068, hashCode, frostHunterBindingAdapterUltraSpectraOmega2451);
                                }
                                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(true);
                            }
                            executor = executor2;
                            frostHunterInputFilterFusionBetaSolar5786 = new FrostHunterInputFilterFusionBetaSolar5786(frostHunterFragmentManagerFusionNovaDragon6284, frostHunterViewLegendStormDelta9630, str, frostHunterDispatchersPrimeHeroSpeed4562, frostHunterNotificationManagerHeroNova80102, 0);
                            frostHunterNotificationManagerHeroNova8010 = frostHunterNotificationManagerHeroNova80102;
                            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(frostHunterInputFilterFusionBetaSolar5786);
                            executor.execute((Runnable) frostHunterInputFilterFusionBetaSolar5786);
                            z2 = false;
                            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
                            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(357887763);
                            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(z2);
                            FrostHunterCombineBlazeLegendGamma9228 FrostHunterServiceEliteCelestialThunder175732 = frostHunterCombineBlazeLegendGamma9228.FrostHunterServiceEliteCelestialThunder1757(new TextStringSimpleElement(str, frostHunterFragmentManagerFusionNovaDragon6284, frostHunterNotificationManagerHeroNova8010, i, z, i2, i3));
                            FrostHunterBillingClientForceThunder1002 frostHunterBillingClientForceThunder10022 = FrostHunterBillingClientForceThunder1002.FrostHunterServiceEliteCelestialThunder1757;
                            hashCode = Long.hashCode(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752);
                            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike94632 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterServiceEliteCelestialThunder175732);
                            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex60252 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
                            FrostHunterContextHyperDelta9193.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
                            FrostHunterBundleShadowStrike1123 frostHunterBundleShadowStrike11232 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAnnotationProcessorSparkEclipse8710();
                            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                            }
                            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterLifecycleBlazeGammaElite2889, frostHunterBillingClientForceThunder10022);
                            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterServiceEliteCelestialThunder1757, FrostHunterFragmentBetaMegaVortex60252);
                            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterBundlePulseFusionHero2475, FrostHunterRewardedAdMasterStrike94632);
                            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24512 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLevelListDrawableFusionDragonHero2232;
                            if (!frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                            }
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode, frostHunterDialogFragmentPhantomEclipse8068, hashCode, frostHunterBindingAdapterUltraSpectraOmega24512);
                            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(true);
                        }
                        if ((i7 & 48) != 32) {
                            z3 = false;
                            FrostHunterServiceEliteCelestialThunder17572 = ((((i7 & 14) ^ 6) <= 4 && frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(str)) || (i7 & 6) == 4) | z3 | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterServiceEliteCelestialThunder1757(frostHunterViewLegendStormDelta9630.ordinal()) | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterDispatchersPrimeHeroSpeed4562) | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationManagerHeroNova80102);
                            FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
                            if (!FrostHunterServiceEliteCelestialThunder17572) {
                                frostHunterInputFilterFusionBetaSolar5786 = FrostHunterMagnetometerFusionTitanium8202;
                                frostHunterNotificationManagerHeroNova8010 = frostHunterNotificationManagerHeroNova80102;
                                executor = executor2;
                                executor.execute((Runnable) frostHunterInputFilterFusionBetaSolar5786);
                                z2 = false;
                                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
                                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(357887763);
                                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(z2);
                                FrostHunterCombineBlazeLegendGamma9228 FrostHunterServiceEliteCelestialThunder1757322 = frostHunterCombineBlazeLegendGamma9228.FrostHunterServiceEliteCelestialThunder1757(new TextStringSimpleElement(str, frostHunterFragmentManagerFusionNovaDragon6284, frostHunterNotificationManagerHeroNova8010, i, z, i2, i3));
                                FrostHunterBillingClientForceThunder1002 frostHunterBillingClientForceThunder100222 = FrostHunterBillingClientForceThunder1002.FrostHunterServiceEliteCelestialThunder1757;
                                hashCode = Long.hashCode(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752);
                                FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike946322 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterServiceEliteCelestialThunder1757322);
                                FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex602522 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
                                FrostHunterContextHyperDelta9193.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
                                FrostHunterBundleShadowStrike1123 frostHunterBundleShadowStrike112322 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAnnotationProcessorSparkEclipse8710();
                                if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                                }
                                FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterLifecycleBlazeGammaElite2889, frostHunterBillingClientForceThunder100222);
                                FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterServiceEliteCelestialThunder1757, FrostHunterFragmentBetaMegaVortex602522);
                                FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterBundlePulseFusionHero2475, FrostHunterRewardedAdMasterStrike946322);
                                FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega245122 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLevelListDrawableFusionDragonHero2232;
                                if (!frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                                }
                                FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode, frostHunterDialogFragmentPhantomEclipse8068, hashCode, frostHunterBindingAdapterUltraSpectraOmega245122);
                                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(true);
                            }
                            executor = executor2;
                            frostHunterInputFilterFusionBetaSolar5786 = new FrostHunterInputFilterFusionBetaSolar5786(frostHunterFragmentManagerFusionNovaDragon6284, frostHunterViewLegendStormDelta9630, str, frostHunterDispatchersPrimeHeroSpeed4562, frostHunterNotificationManagerHeroNova80102, 0);
                            frostHunterNotificationManagerHeroNova8010 = frostHunterNotificationManagerHeroNova80102;
                            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(frostHunterInputFilterFusionBetaSolar5786);
                            executor.execute((Runnable) frostHunterInputFilterFusionBetaSolar5786);
                            z2 = false;
                            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
                            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(357887763);
                            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(z2);
                            FrostHunterCombineBlazeLegendGamma9228 FrostHunterServiceEliteCelestialThunder17573222 = frostHunterCombineBlazeLegendGamma9228.FrostHunterServiceEliteCelestialThunder1757(new TextStringSimpleElement(str, frostHunterFragmentManagerFusionNovaDragon6284, frostHunterNotificationManagerHeroNova8010, i, z, i2, i3));
                            FrostHunterBillingClientForceThunder1002 frostHunterBillingClientForceThunder1002222 = FrostHunterBillingClientForceThunder1002.FrostHunterServiceEliteCelestialThunder1757;
                            hashCode = Long.hashCode(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752);
                            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike9463222 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterServiceEliteCelestialThunder17573222);
                            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex6025222 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
                            FrostHunterContextHyperDelta9193.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
                            FrostHunterBundleShadowStrike1123 frostHunterBundleShadowStrike1123222 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAnnotationProcessorSparkEclipse8710();
                            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                            }
                            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterLifecycleBlazeGammaElite2889, frostHunterBillingClientForceThunder1002222);
                            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterServiceEliteCelestialThunder1757, FrostHunterFragmentBetaMegaVortex6025222);
                            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterBundlePulseFusionHero2475, FrostHunterRewardedAdMasterStrike9463222);
                            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega2451222 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLevelListDrawableFusionDragonHero2232;
                            if (!frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                            }
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode, frostHunterDialogFragmentPhantomEclipse8068, hashCode, frostHunterBindingAdapterUltraSpectraOmega2451222);
                            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(true);
                        }
                        z3 = true;
                        FrostHunterServiceEliteCelestialThunder17572 = ((((i7 & 14) ^ 6) <= 4 && frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(str)) || (i7 & 6) == 4) | z3 | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterServiceEliteCelestialThunder1757(frostHunterViewLegendStormDelta9630.ordinal()) | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterDispatchersPrimeHeroSpeed4562) | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationManagerHeroNova80102);
                        FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
                        if (!FrostHunterServiceEliteCelestialThunder17572) {
                        }
                        executor = executor2;
                        frostHunterInputFilterFusionBetaSolar5786 = new FrostHunterInputFilterFusionBetaSolar5786(frostHunterFragmentManagerFusionNovaDragon6284, frostHunterViewLegendStormDelta9630, str, frostHunterDispatchersPrimeHeroSpeed4562, frostHunterNotificationManagerHeroNova80102, 0);
                        frostHunterNotificationManagerHeroNova8010 = frostHunterNotificationManagerHeroNova80102;
                        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(frostHunterInputFilterFusionBetaSolar5786);
                        executor.execute((Runnable) frostHunterInputFilterFusionBetaSolar5786);
                        z2 = false;
                        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
                        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(357887763);
                        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(z2);
                        FrostHunterCombineBlazeLegendGamma9228 FrostHunterServiceEliteCelestialThunder175732222 = frostHunterCombineBlazeLegendGamma9228.FrostHunterServiceEliteCelestialThunder1757(new TextStringSimpleElement(str, frostHunterFragmentManagerFusionNovaDragon6284, frostHunterNotificationManagerHeroNova8010, i, z, i2, i3));
                        FrostHunterBillingClientForceThunder1002 frostHunterBillingClientForceThunder10022222 = FrostHunterBillingClientForceThunder1002.FrostHunterServiceEliteCelestialThunder1757;
                        hashCode = Long.hashCode(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752);
                        FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike94632222 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterServiceEliteCelestialThunder175732222);
                        FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex60252222 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
                        FrostHunterContextHyperDelta9193.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
                        FrostHunterBundleShadowStrike1123 frostHunterBundleShadowStrike11232222 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAnnotationProcessorSparkEclipse8710();
                        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                        }
                        FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterLifecycleBlazeGammaElite2889, frostHunterBillingClientForceThunder10022222);
                        FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterServiceEliteCelestialThunder1757, FrostHunterFragmentBetaMegaVortex60252222);
                        FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterBundlePulseFusionHero2475, FrostHunterRewardedAdMasterStrike94632222);
                        FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24512222 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLevelListDrawableFusionDragonHero2232;
                        if (!frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                        }
                        FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode, frostHunterDialogFragmentPhantomEclipse8068, hashCode, frostHunterBindingAdapterUltraSpectraOmega24512222);
                        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(true);
                    }
                }
                frostHunterNotificationManagerHeroNova8010 = frostHunterNotificationManagerHeroNova80102;
                z2 = false;
            } else {
                frostHunterNotificationManagerHeroNova8010 = frostHunterNotificationManagerHeroNova80102;
                z2 = false;
            }
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(1255196839);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(z2);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(357887763);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(z2);
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterServiceEliteCelestialThunder1757322222 = frostHunterCombineBlazeLegendGamma9228.FrostHunterServiceEliteCelestialThunder1757(new TextStringSimpleElement(str, frostHunterFragmentManagerFusionNovaDragon6284, frostHunterNotificationManagerHeroNova8010, i, z, i2, i3));
            FrostHunterBillingClientForceThunder1002 frostHunterBillingClientForceThunder100222222 = FrostHunterBillingClientForceThunder1002.FrostHunterServiceEliteCelestialThunder1757;
            hashCode = Long.hashCode(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752);
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike946322222 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterServiceEliteCelestialThunder1757322222);
            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex602522222 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
            FrostHunterContextHyperDelta9193.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
            FrostHunterBundleShadowStrike1123 frostHunterBundleShadowStrike112322222 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAnnotationProcessorSparkEclipse8710();
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterLifecycleBlazeGammaElite2889, frostHunterBillingClientForceThunder100222222);
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterServiceEliteCelestialThunder1757, FrostHunterFragmentBetaMegaVortex602522222);
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterBundlePulseFusionHero2475, FrostHunterRewardedAdMasterStrike946322222);
            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega245122222 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLevelListDrawableFusionDragonHero2232;
            if (!frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
            }
            FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode, frostHunterDialogFragmentPhantomEclipse8068, hashCode, frostHunterBindingAdapterUltraSpectraOmega245122222);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(true);
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterOnTouchListenerMasterForceNovaX7611(str, frostHunterCombineBlazeLegendGamma9228, frostHunterFragmentManagerFusionNovaDragon6284, i, z, i2, i3, i4, 1);
        }
    }

    public static final String FrostHunterDatabaseEliteShadowUltra2452(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final boolean FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber9213, FrostHunterDiffUtilNeoThunder4910 frostHunterDiffUtilNeoThunder4910) {
        int ordinal = frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterBannerAdNebulaMasterBeta4389().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                FrostHunterServiceInfoTitaniumPrimeCyber9213 FrostHunterMeteringPointMegaCyber7955 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMeteringPointMegaCyber7955(frostHunterServiceInfoTitaniumPrimeCyber9213);
                if (FrostHunterMeteringPointMegaCyber7955 != null) {
                    return FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterMeteringPointMegaCyber7955, frostHunterDiffUtilNeoThunder4910) || FrostHunterLooperHyperionForce4133(frostHunterServiceInfoTitaniumPrimeCyber9213, FrostHunterMeteringPointMegaCyber7955, 1, frostHunterDiffUtilNeoThunder4910);
                }
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("ActiveParent must have a focusedChild");
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterObjectAnimatorPhoenixSpectraThunder6218().FrostHunterAlphaAnimationNeoCosmos5761 ? ((Boolean) frostHunterDiffUtilNeoThunder4910.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterServiceInfoTitaniumPrimeCyber9213)).booleanValue() : FrostHunterFCMDeltaQuantumHero8364(frostHunterServiceInfoTitaniumPrimeCyber9213, frostHunterDiffUtilNeoThunder4910);
                }
                FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                return false;
            }
        }
        return FrostHunterFCMDeltaQuantumHero8364(frostHunterServiceInfoTitaniumPrimeCyber9213, frostHunterDiffUtilNeoThunder4910);
    }

    public static final Object FrostHunterEditTextPulseHyperion1262(FrostHunterCameraViewTitaniumHyperionEclipse8189 frostHunterCameraViewTitaniumHyperionEclipse8189, FrostHunterInstrumentationStrikeBlazeThunder7469 frostHunterInstrumentationStrikeBlazeThunder7469) {
        Object obj = frostHunterCameraViewTitaniumHyperionEclipse8189.FrostHunterAlertDialogAuroraDelta3200.FrostHunterAlphaAnimationNeoCosmos5761.get(frostHunterInstrumentationStrikeBlazeThunder7469);
        return obj == null ? frostHunterInstrumentationStrikeBlazeThunder7469.FrostHunterCameraXPixelTurboCosmos9814 : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean FrostHunterFCMDeltaQuantumHero8364(FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber9213, FrostHunterDiffUtilNeoThunder4910 frostHunterDiffUtilNeoThunder4910) {
        FrostHunterServiceInfoTitaniumPrimeCyber9213[] frostHunterServiceInfoTitaniumPrimeCyber9213Arr = new FrostHunterServiceInfoTitaniumPrimeCyber9213[16];
        if (!frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLooperThreadBetaHyperionMax1000) {
            FrostHunterAudioManagerThunderTitan4297.FrostHunterConstraintSetCloneMasterUltraRogue2633("visitChildren called on an unattached node");
        }
        FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike7090 = new FrostHunterObjectAnimatorNeoStrike7090(new FrostHunterGradientDrawablePulseDragonInferno9637[16]);
        FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno9637 = frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96372 = frostHunterGradientDrawablePulseDragonInferno9637.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        if (frostHunterGradientDrawablePulseDragonInferno96372 == null) {
            FrostHunterRemoteConfigPhantomDelta1739.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterObjectAnimatorNeoStrike7090, frostHunterGradientDrawablePulseDragonInferno9637);
        } else {
            frostHunterObjectAnimatorNeoStrike7090.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno96372);
        }
        int i = 0;
        while (true) {
            int i2 = frostHunterObjectAnimatorNeoStrike7090.FrostHunterAlertDialogAuroraDelta3200;
            if (i2 == 0) {
                break;
            }
            FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96373 = (FrostHunterGradientDrawablePulseDragonInferno9637) frostHunterObjectAnimatorNeoStrike7090.FrostHunterAlertDialogAuroraDelta3200(i2 - 1);
            if ((frostHunterGradientDrawablePulseDragonInferno96373.FrostHunterKeyframeGammaGamma1197 & 1024) == 0) {
                FrostHunterRemoteConfigPhantomDelta1739.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterObjectAnimatorNeoStrike7090, frostHunterGradientDrawablePulseDragonInferno96373);
            } else {
                while (true) {
                    if (frostHunterGradientDrawablePulseDragonInferno96373 == null) {
                        break;
                    }
                    if ((frostHunterGradientDrawablePulseDragonInferno96373.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0) {
                        FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike70902 = null;
                        while (frostHunterGradientDrawablePulseDragonInferno96373 != null) {
                            if (frostHunterGradientDrawablePulseDragonInferno96373 instanceof FrostHunterServiceInfoTitaniumPrimeCyber9213) {
                                FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber92132 = (FrostHunterServiceInfoTitaniumPrimeCyber9213) frostHunterGradientDrawablePulseDragonInferno96373;
                                int i3 = i + 1;
                                if (frostHunterServiceInfoTitaniumPrimeCyber9213Arr.length < i3) {
                                    int length = frostHunterServiceInfoTitaniumPrimeCyber9213Arr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(frostHunterServiceInfoTitaniumPrimeCyber9213Arr, 0, r10, 0, length);
                                    frostHunterServiceInfoTitaniumPrimeCyber9213Arr = r10;
                                }
                                frostHunterServiceInfoTitaniumPrimeCyber9213Arr[i] = frostHunterServiceInfoTitaniumPrimeCyber92132;
                                i = i3;
                            } else if ((frostHunterGradientDrawablePulseDragonInferno96373.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0 && (frostHunterGradientDrawablePulseDragonInferno96373 instanceof FrostHunterToolbarVortexMaster1971)) {
                                int i4 = 0;
                                for (FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96374 = ((FrostHunterToolbarVortexMaster1971) frostHunterGradientDrawablePulseDragonInferno96373).FrostHunterBitmapTurboDeltaNebula8743; frostHunterGradientDrawablePulseDragonInferno96374 != null; frostHunterGradientDrawablePulseDragonInferno96374 = frostHunterGradientDrawablePulseDragonInferno96374.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                                    if ((frostHunterGradientDrawablePulseDragonInferno96374.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            frostHunterGradientDrawablePulseDragonInferno96373 = frostHunterGradientDrawablePulseDragonInferno96374;
                                        } else {
                                            if (frostHunterObjectAnimatorNeoStrike70902 == null) {
                                                frostHunterObjectAnimatorNeoStrike70902 = new FrostHunterObjectAnimatorNeoStrike7090(new FrostHunterGradientDrawablePulseDragonInferno9637[16]);
                                            }
                                            if (frostHunterGradientDrawablePulseDragonInferno96373 != null) {
                                                frostHunterObjectAnimatorNeoStrike70902.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno96373);
                                                frostHunterGradientDrawablePulseDragonInferno96373 = null;
                                            }
                                            frostHunterObjectAnimatorNeoStrike70902.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno96374);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            frostHunterGradientDrawablePulseDragonInferno96373 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterScaleAnimationStrikeSpark5059(frostHunterObjectAnimatorNeoStrike70902);
                        }
                    } else {
                        frostHunterGradientDrawablePulseDragonInferno96373 = frostHunterGradientDrawablePulseDragonInferno96373.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                    }
                }
            }
        }
        Arrays.sort(frostHunterServiceInfoTitaniumPrimeCyber9213Arr, 0, i, FrostHunterCoroutineCelestialOmega6845.FrostHunterFlowMaxDragonHero5809);
        for (int i5 = 0; i5 < i; i5++) {
            FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber92133 = frostHunterServiceInfoTitaniumPrimeCyber9213Arr[i5];
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterPagingDataTurboTitanium7332(frostHunterServiceInfoTitaniumPrimeCyber92133) && FrostHunterDialogFragmentTurboPhoenixDragon7627(frostHunterServiceInfoTitaniumPrimeCyber92133, frostHunterDiffUtilNeoThunder4910)) {
                return true;
            }
        }
        return false;
    }

    public static FrostHunterToastHyperTitanThunder2275 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() {
        long[] jArr = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761;
        return new FrostHunterToastHyperTitanThunder2275();
    }

    public static final View FrostHunterFlowMaxDragonHero5809(FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno9637) {
        FrostHunterGestureDetectorTitaniumSpeedCosmos2231 frostHunterGestureDetectorTitaniumSpeedCosmos2231 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterRewardedAdMasterStrike9463(frostHunterGradientDrawablePulseDragonInferno9637.FrostHunterCameraXPixelTurboCosmos9814).FrostHunterLooperThreadBetaHyperionMax1000;
        View interopView = frostHunterGestureDetectorTitaniumSpeedCosmos2231 != null ? frostHunterGestureDetectorTitaniumSpeedCosmos2231.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Could not fetch interop view");
        return null;
    }

    public static final void FrostHunterFragmentBetaMegaVortex6025(FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder2275, Object obj, Object obj2) {
        int FrostHunterLevelListDrawableFusionDragonHero22322 = frostHunterToastHyperTitanThunder2275.FrostHunterLevelListDrawableFusionDragonHero2232(obj);
        boolean z = FrostHunterLevelListDrawableFusionDragonHero22322 < 0;
        Object obj3 = z ? null : frostHunterToastHyperTitanThunder2275.FrostHunterBundlePulseFusionHero2475[FrostHunterLevelListDrawableFusionDragonHero22322];
        if (obj3 != null) {
            if (obj3 instanceof FrostHunterToolbarHeroNovaX1020) {
                ((FrostHunterToolbarHeroNovaX1020) obj3).FrostHunterAlphaAnimationNeoCosmos5761(obj2);
            } else if (obj3 != obj2) {
                FrostHunterToolbarHeroNovaX1020 frostHunterToolbarHeroNovaX1020 = new FrostHunterToolbarHeroNovaX1020();
                frostHunterToolbarHeroNovaX1020.FrostHunterAlphaAnimationNeoCosmos5761(obj3);
                frostHunterToolbarHeroNovaX1020.FrostHunterAlphaAnimationNeoCosmos5761(obj2);
                obj2 = frostHunterToolbarHeroNovaX1020;
            }
            obj2 = obj3;
        }
        if (!z) {
            frostHunterToastHyperTitanThunder2275.FrostHunterBundlePulseFusionHero2475[FrostHunterLevelListDrawableFusionDragonHero22322] = obj2;
            return;
        }
        int i = ~FrostHunterLevelListDrawableFusionDragonHero22322;
        frostHunterToastHyperTitanThunder2275.FrostHunterConstraintSetCloneMasterUltraRogue2633[i] = obj;
        frostHunterToastHyperTitanThunder2275.FrostHunterBundlePulseFusionHero2475[i] = obj2;
    }

    public static final void FrostHunterKeyframeGammaGamma1197(FrostHunterGestureDetectorTitaniumSpeedCosmos2231 frostHunterGestureDetectorTitaniumSpeedCosmos2231, FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439) {
        long FrostHunterViewPhantomNeo1634 = ((FrostHunterPagingSourceRogueStrike9373) frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterPagingDataTurboTitanium7332.FrostHunterRemoteConfigSpeedSpeed8566).FrostHunterViewPhantomNeo1634(0L);
        int round = Math.round(Float.intBitsToFloat((int) (FrostHunterViewPhantomNeo1634 >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (FrostHunterViewPhantomNeo1634 & 4294967295L)));
        frostHunterGestureDetectorTitaniumSpeedCosmos2231.layout(round, round2, frostHunterGestureDetectorTitaniumSpeedCosmos2231.getMeasuredWidth() + round, frostHunterGestureDetectorTitaniumSpeedCosmos2231.getMeasuredHeight() + round2);
    }

    public static final boolean FrostHunterLevelListDrawableFusionDragonHero2232(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static FrostHunterKeyEventMasterFusionNovaX5645 FrostHunterLifecycleBlazeGammaElite2889(FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark1417, FrostHunterRemoteModelManagerPrimeStrikePrime5960 frostHunterRemoteModelManagerPrimeStrikePrime5960, String str, FrostHunterConstraintSetCloneForceMaster6886 frostHunterConstraintSetCloneForceMaster6886, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            frostHunterConstraintSetCloneForceMaster6886 = null;
        }
        return new FrostHunterKeyEventMasterFusionNovaX5645(frostHunterCoroutineScopePrimeSpark1417, frostHunterRemoteModelManagerPrimeStrikePrime5960, str, frostHunterConstraintSetCloneForceMaster6886);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (r2 == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap FrostHunterLintTitanVortexQuantum9911(Drawable drawable, Bitmap.Config config, FrostHunterGestureDetectorForceTitan2560 frostHunterGestureDetectorForceTitan2560, FrostHunterLicensingAlphaTitanElite7131 frostHunterLicensingAlphaTitanElite7131, FrostHunterGestureDetectorForceTitan2560 frostHunterGestureDetectorForceTitan25602, boolean z) {
        FrostHunterLicensingAlphaTitanElite7131 frostHunterLicensingAlphaTitanElite71312 = frostHunterLicensingAlphaTitanElite7131;
        FrostHunterGestureDetectorForceTitan2560 frostHunterGestureDetectorForceTitan25603 = frostHunterGestureDetectorForceTitan25602;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap.getConfig() == ((config == null || FrostHunterCanvasInfernoVortex4700.FrostHunterPermissionInfoAlphaDelta6279(config)) ? Bitmap.Config.ARGB_8888 : config)) {
                if (!z) {
                    long FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterExecutorSolarPhoenix3849.FrostHunterServiceConnectionTurboPhoenixOmega6719(bitmap.getWidth(), bitmap.getHeight(), frostHunterGestureDetectorForceTitan2560, frostHunterLicensingAlphaTitanElite71312, frostHunterGestureDetectorForceTitan25603);
                    double FrostHunterLightSensorForceFusion4241 = FrostHunterExecutorSolarPhoenix3849.FrostHunterLightSensorForceFusion4241(bitmap.getWidth(), bitmap.getHeight(), (int) (FrostHunterServiceConnectionTurboPhoenixOmega6719 >> 32), (int) (FrostHunterServiceConnectionTurboPhoenixOmega6719 & 4294967295L), frostHunterLicensingAlphaTitanElite71312, frostHunterGestureDetectorForceTitan25602);
                    frostHunterLicensingAlphaTitanElite71312 = frostHunterLicensingAlphaTitanElite71312;
                    frostHunterGestureDetectorForceTitan25603 = frostHunterGestureDetectorForceTitan25602;
                }
                return bitmap;
            }
        }
        Drawable mutate = drawable.mutate();
        int FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterResourceFusionNebulaTurbo2767.FrostHunterConstraintSetCloneMasterUltraRogue2633(mutate);
        if (FrostHunterConstraintSetCloneMasterUltraRogue26332 <= 0) {
            FrostHunterConstraintSetCloneMasterUltraRogue26332 = 512;
        }
        int FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterResourceFusionNebulaTurbo2767.FrostHunterAlphaAnimationNeoCosmos5761(mutate);
        int i = FrostHunterAlphaAnimationNeoCosmos57612 > 0 ? FrostHunterAlphaAnimationNeoCosmos57612 : 512;
        long FrostHunterServiceConnectionTurboPhoenixOmega67192 = FrostHunterExecutorSolarPhoenix3849.FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterConstraintSetCloneMasterUltraRogue26332, i, frostHunterGestureDetectorForceTitan2560, frostHunterLicensingAlphaTitanElite71312, frostHunterGestureDetectorForceTitan25603);
        int i2 = i;
        double FrostHunterLightSensorForceFusion42412 = FrostHunterExecutorSolarPhoenix3849.FrostHunterLightSensorForceFusion4241(FrostHunterConstraintSetCloneMasterUltraRogue26332, i2, (int) (FrostHunterServiceConnectionTurboPhoenixOmega67192 >> 32), (int) (FrostHunterServiceConnectionTurboPhoenixOmega67192 & 4294967295L), frostHunterLicensingAlphaTitanElite71312, frostHunterGestureDetectorForceTitan25603);
        int FrostHunterRunnableCosmosCelestial4235 = FrostHunterCardViewHyperionAurora3829.FrostHunterRunnableCosmosCelestial4235(FrostHunterConstraintSetCloneMasterUltraRogue26332 * FrostHunterLightSensorForceFusion42412);
        int FrostHunterRunnableCosmosCelestial42352 = FrostHunterCardViewHyperionAurora3829.FrostHunterRunnableCosmosCelestial4235(FrostHunterLightSensorForceFusion42412 * i2);
        Bitmap createBitmap = Bitmap.createBitmap(FrostHunterRunnableCosmosCelestial4235, FrostHunterRunnableCosmosCelestial42352, (config == null || FrostHunterCanvasInfernoVortex4700.FrostHunterPermissionInfoAlphaDelta6279(config)) ? Bitmap.Config.ARGB_8888 : config);
        Rect bounds = mutate.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        mutate.setBounds(0, 0, FrostHunterRunnableCosmosCelestial4235, FrostHunterRunnableCosmosCelestial42352);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i3, i4, i5, i6);
        return createBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x019d A[EDGE_INSN: B:154:0x019d->B:136:0x019d BREAK  A[LOOP:5: B:95:0x012e->B:149:0x012e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0130  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean FrostHunterLooperHyperionForce4133(FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber9213, FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber92132, int i, FrostHunterDiffUtilNeoThunder4910 frostHunterDiffUtilNeoThunder4910) {
        boolean z;
        FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno9637;
        FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 FrostHunterRewardedAdMasterStrike9463;
        FrostHunterColorStateListOmegaHero9965 frostHunterColorStateListOmegaHero9965;
        if (frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterBannerAdNebulaMasterBeta4389() == FrostHunterRewardedAdAuroraDeltaFusion7394.FrostHunterFlowMaxDragonHero5809) {
            FrostHunterServiceInfoTitaniumPrimeCyber9213[] frostHunterServiceInfoTitaniumPrimeCyber9213Arr = new FrostHunterServiceInfoTitaniumPrimeCyber9213[16];
            if (!frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLooperThreadBetaHyperionMax1000) {
                FrostHunterAudioManagerThunderTitan4297.FrostHunterConstraintSetCloneMasterUltraRogue2633("visitChildren called on an unattached node");
            }
            FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike7090 = new FrostHunterObjectAnimatorNeoStrike7090(new FrostHunterGradientDrawablePulseDragonInferno9637[16]);
            FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96372 = frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterCameraXPixelTurboCosmos9814;
            FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96373 = frostHunterGradientDrawablePulseDragonInferno96372.FrostHunterServiceConnectionTurboPhoenixOmega6719;
            if (frostHunterGradientDrawablePulseDragonInferno96373 == null) {
                FrostHunterRemoteConfigPhantomDelta1739.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterObjectAnimatorNeoStrike7090, frostHunterGradientDrawablePulseDragonInferno96372);
            } else {
                frostHunterObjectAnimatorNeoStrike7090.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno96373);
            }
            int i2 = 0;
            while (true) {
                int i3 = frostHunterObjectAnimatorNeoStrike7090.FrostHunterAlertDialogAuroraDelta3200;
                frostHunterGradientDrawablePulseDragonInferno9637 = null;
                if (i3 == 0) {
                    break;
                }
                FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96374 = (FrostHunterGradientDrawablePulseDragonInferno9637) frostHunterObjectAnimatorNeoStrike7090.FrostHunterAlertDialogAuroraDelta3200(i3 - 1);
                if ((frostHunterGradientDrawablePulseDragonInferno96374.FrostHunterKeyframeGammaGamma1197 & 1024) == 0) {
                    FrostHunterRemoteConfigPhantomDelta1739.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterObjectAnimatorNeoStrike7090, frostHunterGradientDrawablePulseDragonInferno96374);
                } else {
                    while (true) {
                        if (frostHunterGradientDrawablePulseDragonInferno96374 == null) {
                            break;
                        }
                        if ((frostHunterGradientDrawablePulseDragonInferno96374.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0) {
                            FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike70902 = null;
                            while (frostHunterGradientDrawablePulseDragonInferno96374 != null) {
                                if (frostHunterGradientDrawablePulseDragonInferno96374 instanceof FrostHunterServiceInfoTitaniumPrimeCyber9213) {
                                    FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber92133 = (FrostHunterServiceInfoTitaniumPrimeCyber9213) frostHunterGradientDrawablePulseDragonInferno96374;
                                    int i4 = i2 + 1;
                                    if (frostHunterServiceInfoTitaniumPrimeCyber9213Arr.length < i4) {
                                        int length = frostHunterServiceInfoTitaniumPrimeCyber9213Arr.length;
                                        ?? r11 = new Object[Math.max(i4, length * 2)];
                                        System.arraycopy(frostHunterServiceInfoTitaniumPrimeCyber9213Arr, 0, r11, 0, length);
                                        frostHunterServiceInfoTitaniumPrimeCyber9213Arr = r11;
                                    }
                                    frostHunterServiceInfoTitaniumPrimeCyber9213Arr[i2] = frostHunterServiceInfoTitaniumPrimeCyber92133;
                                    i2 = i4;
                                } else if ((frostHunterGradientDrawablePulseDragonInferno96374.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0 && (frostHunterGradientDrawablePulseDragonInferno96374 instanceof FrostHunterToolbarVortexMaster1971)) {
                                    int i5 = 0;
                                    for (FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96375 = ((FrostHunterToolbarVortexMaster1971) frostHunterGradientDrawablePulseDragonInferno96374).FrostHunterBitmapTurboDeltaNebula8743; frostHunterGradientDrawablePulseDragonInferno96375 != null; frostHunterGradientDrawablePulseDragonInferno96375 = frostHunterGradientDrawablePulseDragonInferno96375.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                                        if ((frostHunterGradientDrawablePulseDragonInferno96375.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                frostHunterGradientDrawablePulseDragonInferno96374 = frostHunterGradientDrawablePulseDragonInferno96375;
                                            } else {
                                                if (frostHunterObjectAnimatorNeoStrike70902 == null) {
                                                    frostHunterObjectAnimatorNeoStrike70902 = new FrostHunterObjectAnimatorNeoStrike7090(new FrostHunterGradientDrawablePulseDragonInferno9637[16]);
                                                }
                                                if (frostHunterGradientDrawablePulseDragonInferno96374 != null) {
                                                    frostHunterObjectAnimatorNeoStrike70902.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno96374);
                                                    frostHunterGradientDrawablePulseDragonInferno96374 = null;
                                                }
                                                frostHunterObjectAnimatorNeoStrike70902.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno96375);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                frostHunterGradientDrawablePulseDragonInferno96374 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterScaleAnimationStrikeSpark5059(frostHunterObjectAnimatorNeoStrike70902);
                            }
                        } else {
                            frostHunterGradientDrawablePulseDragonInferno96374 = frostHunterGradientDrawablePulseDragonInferno96374.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                        }
                    }
                }
            }
            Arrays.sort(frostHunterServiceInfoTitaniumPrimeCyber9213Arr, 0, i2, FrostHunterCoroutineCelestialOmega6845.FrostHunterFlowMaxDragonHero5809);
            if (i == 1) {
                FrostHunterFirebaseModelInterpreterOlympianStorm9227 FrostHunterRunnableCosmosCelestial4235 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRunnableCosmosCelestial4235(0, i2);
                int i6 = FrostHunterRunnableCosmosCelestial4235.FrostHunterCameraXPixelTurboCosmos9814;
                int i7 = FrostHunterRunnableCosmosCelestial4235.FrostHunterFlowMaxDragonHero5809;
                if (i6 <= i7) {
                    boolean z2 = false;
                    while (true) {
                        if (z2) {
                            FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber92134 = frostHunterServiceInfoTitaniumPrimeCyber9213Arr[i6];
                            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterPagingDataTurboTitanium7332(frostHunterServiceInfoTitaniumPrimeCyber92134) && FrostHunterDialogFragmentTurboPhoenixDragon7627(frostHunterServiceInfoTitaniumPrimeCyber92134, frostHunterDiffUtilNeoThunder4910)) {
                                break;
                            }
                        }
                        if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterServiceInfoTitaniumPrimeCyber9213Arr[i6], frostHunterServiceInfoTitaniumPrimeCyber92132)) {
                            z2 = true;
                        }
                        if (i6 == i7) {
                            break;
                        }
                        i6++;
                    }
                    z = true;
                }
                if (i != 1 && frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterObjectAnimatorPhoenixSpectraThunder6218().FrostHunterAlphaAnimationNeoCosmos5761) {
                    if (!frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLooperThreadBetaHyperionMax1000) {
                        FrostHunterAudioManagerThunderTitan4297.FrostHunterConstraintSetCloneMasterUltraRogue2633("visitAncestors called on an unattached node");
                    }
                    FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96376 = frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterFragmentBetaMegaVortex6025;
                    FrostHunterRewardedAdMasterStrike9463 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterRewardedAdMasterStrike9463(frostHunterServiceInfoTitaniumPrimeCyber9213);
                    loop5: while (true) {
                        if (FrostHunterRewardedAdMasterStrike9463 == null) {
                            break;
                        }
                        if ((((FrostHunterGradientDrawablePulseDragonInferno9637) FrostHunterRewardedAdMasterStrike9463.FrostHunterPagingDataTurboTitanium7332.FrostHunterAlertDialogAuroraDelta3200).FrostHunterKeyframeGammaGamma1197 & 1024) != 0) {
                            while (frostHunterGradientDrawablePulseDragonInferno96376 != null) {
                                if ((frostHunterGradientDrawablePulseDragonInferno96376.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0) {
                                    FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96377 = frostHunterGradientDrawablePulseDragonInferno96376;
                                    FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike70903 = null;
                                    while (frostHunterGradientDrawablePulseDragonInferno96377 != null) {
                                        if (frostHunterGradientDrawablePulseDragonInferno96377 instanceof FrostHunterServiceInfoTitaniumPrimeCyber9213) {
                                            frostHunterGradientDrawablePulseDragonInferno9637 = frostHunterGradientDrawablePulseDragonInferno96377;
                                            break loop5;
                                        }
                                        if ((frostHunterGradientDrawablePulseDragonInferno96377.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0 && (frostHunterGradientDrawablePulseDragonInferno96377 instanceof FrostHunterToolbarVortexMaster1971)) {
                                            int i8 = 0;
                                            for (FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96378 = ((FrostHunterToolbarVortexMaster1971) frostHunterGradientDrawablePulseDragonInferno96377).FrostHunterBitmapTurboDeltaNebula8743; frostHunterGradientDrawablePulseDragonInferno96378 != null; frostHunterGradientDrawablePulseDragonInferno96378 = frostHunterGradientDrawablePulseDragonInferno96378.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                                                if ((frostHunterGradientDrawablePulseDragonInferno96378.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0) {
                                                    i8++;
                                                    if (i8 == 1) {
                                                        frostHunterGradientDrawablePulseDragonInferno96377 = frostHunterGradientDrawablePulseDragonInferno96378;
                                                    } else {
                                                        if (frostHunterObjectAnimatorNeoStrike70903 == null) {
                                                            frostHunterObjectAnimatorNeoStrike70903 = new FrostHunterObjectAnimatorNeoStrike7090(new FrostHunterGradientDrawablePulseDragonInferno9637[16]);
                                                        }
                                                        if (frostHunterGradientDrawablePulseDragonInferno96377 != null) {
                                                            frostHunterObjectAnimatorNeoStrike70903.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno96377);
                                                            frostHunterGradientDrawablePulseDragonInferno96377 = null;
                                                        }
                                                        frostHunterObjectAnimatorNeoStrike70903.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno96378);
                                                    }
                                                }
                                            }
                                            if (i8 == 1) {
                                            }
                                        }
                                        frostHunterGradientDrawablePulseDragonInferno96377 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterScaleAnimationStrikeSpark5059(frostHunterObjectAnimatorNeoStrike70903);
                                    }
                                }
                                frostHunterGradientDrawablePulseDragonInferno96376 = frostHunterGradientDrawablePulseDragonInferno96376.FrostHunterFragmentBetaMegaVortex6025;
                            }
                        }
                        FrostHunterRewardedAdMasterStrike9463 = FrostHunterRewardedAdMasterStrike9463.FrostHunterResourcesTitanHyperVision5823();
                        frostHunterGradientDrawablePulseDragonInferno96376 = (FrostHunterRewardedAdMasterStrike9463 == null || (frostHunterColorStateListOmegaHero9965 = FrostHunterRewardedAdMasterStrike9463.FrostHunterPagingDataTurboTitanium7332) == null) ? null : (FrostHunterOnItemClickListenerBetaPhantom9631) frostHunterColorStateListOmegaHero9965.FrostHunterFlowMaxDragonHero5809;
                    }
                    if (frostHunterGradientDrawablePulseDragonInferno9637 != null) {
                        z = ((Boolean) frostHunterDiffUtilNeoThunder4910.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterServiceInfoTitaniumPrimeCyber9213)).booleanValue();
                    }
                }
            } else if (i == 2) {
                FrostHunterFirebaseModelInterpreterOlympianStorm9227 FrostHunterRunnableCosmosCelestial42352 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRunnableCosmosCelestial4235(0, i2);
                int i9 = FrostHunterRunnableCosmosCelestial42352.FrostHunterCameraXPixelTurboCosmos9814;
                int i10 = FrostHunterRunnableCosmosCelestial42352.FrostHunterFlowMaxDragonHero5809;
                if (i9 <= i10) {
                    boolean z3 = false;
                    while (true) {
                        if (z3) {
                            FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber92135 = frostHunterServiceInfoTitaniumPrimeCyber9213Arr[i10];
                            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterPagingDataTurboTitanium7332(frostHunterServiceInfoTitaniumPrimeCyber92135) && FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterServiceInfoTitaniumPrimeCyber92135, frostHunterDiffUtilNeoThunder4910)) {
                                break;
                            }
                        }
                        if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterServiceInfoTitaniumPrimeCyber9213Arr[i10], frostHunterServiceInfoTitaniumPrimeCyber92132)) {
                            z3 = true;
                        }
                        if (i10 == i9) {
                            break;
                        }
                        i10--;
                    }
                    z = true;
                }
                if (i != 1) {
                    if (!frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLooperThreadBetaHyperionMax1000) {
                    }
                    FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno963762 = frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterFragmentBetaMegaVortex6025;
                    FrostHunterRewardedAdMasterStrike9463 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterRewardedAdMasterStrike9463(frostHunterServiceInfoTitaniumPrimeCyber9213);
                    loop5: while (true) {
                        if (FrostHunterRewardedAdMasterStrike9463 == null) {
                        }
                    }
                    if (frostHunterGradientDrawablePulseDragonInferno9637 != null) {
                    }
                }
            } else {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("This function should only be used for 1-D focus search");
            }
            if (!z) {
                return true;
            }
            FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber92136 = ((FrostHunterLiveDataScopeBlazeStrike6673) FrostHunterRemoteConfigPhantomDelta1739.FrostHunterPermissionInfoAlphaDelta6279(frostHunterServiceInfoTitaniumPrimeCyber9213).getFocusOwner()).FrostHunterCameraXPixelTurboCosmos9814;
            FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterTranslateAnimationCyberSolarUltra7101(frostHunterServiceInfoTitaniumPrimeCyber9213);
            return false;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("This function should only be used within a parent that has focus.");
        z = false;
        if (!z) {
        }
    }

    public static final long FrostHunterLooperThreadBetaHyperionMax1000(long j, boolean z, int i, float f) {
        int FrostHunterCameraXPixelTurboCosmos98142 = ((z || i == 2 || i == 4 || i == 5) && FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterServiceEliteCelestialThunder1757(j)) ? FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterCameraXPixelTurboCosmos9814(j) : Integer.MAX_VALUE;
        if (FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterAlertDialogAuroraDelta3200(j) != FrostHunterCameraXPixelTurboCosmos98142) {
            FrostHunterCameraXPixelTurboCosmos98142 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterCameraXTurboCelestialHero5430(FrostHunterDisplayMetricsTurboMax7649.FrostHunterServiceEliteCelestialThunder1757(f), FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterAlertDialogAuroraDelta3200(j), FrostHunterCameraXPixelTurboCosmos98142);
        }
        return FrostHunterExecutorSolarPhoenix3849.FrostHunterEditTextPulseHyperion1262(0, FrostHunterCameraXPixelTurboCosmos98142, 0, FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterRemoteConfigSpeedSpeed8566(j));
    }

    public static FrostHunterCountDownTimerRogueTitan5615 FrostHunterMagnetometerFusionTitanium8202(FrostHunterTransformSpectraLegend4789 frostHunterTransformSpectraLegend4789, FrostHunterStateMasterInfernoGamma9701 frostHunterStateMasterInfernoGamma9701) {
        frostHunterStateMasterInfernoGamma9701.getClass();
        return FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterTransformSpectraLegend4789.getKey(), frostHunterStateMasterInfernoGamma9701) ? FrostHunterFCMThunderTitanium1373.FrostHunterCameraXPixelTurboCosmos9814 : frostHunterTransformSpectraLegend4789;
    }

    public static String FrostHunterMediaPlayerCelestialBetaTitan3868(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static FrostHunterTransformSpectraLegend4789 FrostHunterMeteringPointBetaCyber9571(FrostHunterTransformSpectraLegend4789 frostHunterTransformSpectraLegend4789, FrostHunterStateMasterInfernoGamma9701 frostHunterStateMasterInfernoGamma9701) {
        frostHunterStateMasterInfernoGamma9701.getClass();
        if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterTransformSpectraLegend4789.getKey(), frostHunterStateMasterInfernoGamma9701)) {
            return frostHunterTransformSpectraLegend4789;
        }
        return null;
    }

    public static final FrostHunterSnackbarHyperionMaxElite4081 FrostHunterMeteringPointMegaCyber7955(FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511) {
        Object FrostHunterRemoteConfigSpeedSpeed85662 = frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterDatabaseEliteShadowUltra2452);
        if (FrostHunterRemoteConfigSpeedSpeed85662 == null) {
            FrostHunterRemoteConfigSpeedSpeed85662 = null;
        }
        FrostHunterSnackbarHyperionMaxElite4081 frostHunterSnackbarHyperionMaxElite4081 = (FrostHunterSnackbarHyperionMaxElite4081) FrostHunterRemoteConfigSpeedSpeed85662;
        Object FrostHunterRemoteConfigSpeedSpeed85663 = frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterLooperHyperionForce4133);
        if (FrostHunterRemoteConfigSpeedSpeed85663 == null) {
            FrostHunterRemoteConfigSpeedSpeed85663 = null;
        }
        List list = (List) FrostHunterRemoteConfigSpeedSpeed85663;
        return frostHunterSnackbarHyperionMaxElite4081 == null ? list != null ? (FrostHunterSnackbarHyperionMaxElite4081) FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterSharedElementPixelTitan2806(list) : null : frostHunterSnackbarHyperionMaxElite4081;
    }

    public static final int FrostHunterMotionSceneAuroraMega2271(int i, List list) {
        int i2;
        int i3 = ((FrostHunterPaintFlagsDrawFilterSpectraCyber3909) FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterViewModelScopeTitanRogue1970(list)).FrostHunterBundlePulseFusionHero2475;
        if (i > ((FrostHunterPaintFlagsDrawFilterSpectraCyber3909) FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterViewModelScopeTitanRogue1970(list)).FrostHunterBundlePulseFusionHero2475) {
            FrostHunterRippleDrawableNeoDelta6594.FrostHunterAlphaAnimationNeoCosmos5761("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            FrostHunterPaintFlagsDrawFilterSpectraCyber3909 frostHunterPaintFlagsDrawFilterSpectraCyber3909 = (FrostHunterPaintFlagsDrawFilterSpectraCyber3909) list.get(i2);
            char c = frostHunterPaintFlagsDrawFilterSpectraCyber3909.FrostHunterConstraintSetCloneMasterUltraRogue2633 > i ? (char) 1 : frostHunterPaintFlagsDrawFilterSpectraCyber3909.FrostHunterBundlePulseFusionHero2475 <= i ? (char) 65535 : (char) 0;
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterServiceConnectionTurboPhoenixOmega6719("Found paragraph index ", i2, " should be in range [0, ");
        FrostHunterServiceConnectionTurboPhoenixOmega6719.append(list.size());
        FrostHunterServiceConnectionTurboPhoenixOmega6719.append(").\nDebug info: index=");
        FrostHunterServiceConnectionTurboPhoenixOmega6719.append(i);
        FrostHunterServiceConnectionTurboPhoenixOmega6719.append(", paragraphs=[");
        FrostHunterServiceConnectionTurboPhoenixOmega6719.append(FrostHunterAnalyticsPixelSolarEpic8004.FrostHunterAlphaAnimationNeoCosmos5761(list, null, new FrostHunterResourceUltraUltraLegend1377(19), 31));
        FrostHunterServiceConnectionTurboPhoenixOmega6719.append(']');
        FrostHunterRippleDrawableNeoDelta6594.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterServiceConnectionTurboPhoenixOmega6719.toString());
        return i2;
    }

    public static final void FrostHunterNavigationMasterMegaMax2752(FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder2275, Object obj) {
        boolean z;
        long[] jArr = frostHunterToastHyperTitanThunder2275.FrostHunterAlphaAnimationNeoCosmos5761;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = frostHunterToastHyperTitanThunder2275.FrostHunterConstraintSetCloneMasterUltraRogue2633[i4];
                        Object obj3 = frostHunterToastHyperTitanThunder2275.FrostHunterBundlePulseFusionHero2475[i4];
                        if (obj3 instanceof FrostHunterToolbarHeroNovaX1020) {
                            FrostHunterToolbarHeroNovaX1020 frostHunterToolbarHeroNovaX1020 = (FrostHunterToolbarHeroNovaX1020) obj3;
                            frostHunterToolbarHeroNovaX1020.FrostHunterKeyframeGammaGamma1197(obj);
                            z = frostHunterToolbarHeroNovaX1020.FrostHunterRemoteConfigSpeedSpeed8566();
                        } else {
                            z = obj3 == obj;
                        }
                        if (z) {
                            frostHunterToastHyperTitanThunder2275.FrostHunterFragmentBetaMegaVortex6025(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static FrostHunterCoroutineScopeCelestialDeltaMax2495 FrostHunterPagingDataTurboTitanium7332(FrostHunterColorStateListInflaterHeroEclipseOlympian7298 frostHunterColorStateListInflaterHeroEclipseOlympian7298) {
        int i;
        int i2;
        int i3;
        String str;
        FrostHunterColorStateListInflaterHeroEclipseOlympian7298 frostHunterColorStateListInflaterHeroEclipseOlympian72982 = frostHunterColorStateListInflaterHeroEclipseOlympian7298;
        frostHunterColorStateListInflaterHeroEclipseOlympian72982.getClass();
        int size = frostHunterColorStateListInflaterHeroEclipseOlympian72982.size();
        int i4 = 0;
        boolean z = true;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i5 = -1;
        int i6 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i7 = -1;
        int i8 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i4 < size) {
            String FrostHunterBundlePulseFusionHero24752 = frostHunterColorStateListInflaterHeroEclipseOlympian72982.FrostHunterBundlePulseFusionHero2475(i4);
            String FrostHunterLifecycleBlazeGammaElite28892 = frostHunterColorStateListInflaterHeroEclipseOlympian72982.FrostHunterLifecycleBlazeGammaElite2889(i4);
            if (FrostHunterBundlePulseFusionHero24752.equalsIgnoreCase("Cache-Control")) {
                if (str2 == null) {
                    str2 = FrostHunterLifecycleBlazeGammaElite28892;
                    i = 0;
                    while (i < FrostHunterLifecycleBlazeGammaElite28892.length()) {
                        int length = FrostHunterLifecycleBlazeGammaElite28892.length();
                        int i9 = i;
                        while (true) {
                            if (i9 >= length) {
                                i2 = size;
                                i9 = FrostHunterLifecycleBlazeGammaElite28892.length();
                                break;
                            }
                            i2 = size;
                            if (FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterTextViewDragonStormMega4297("=,;", FrostHunterLifecycleBlazeGammaElite28892.charAt(i9))) {
                                break;
                            }
                            i9++;
                            size = i2;
                        }
                        String obj = FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterR8MasterNebulaSpark7247(FrostHunterLifecycleBlazeGammaElite28892.substring(i, i9)).toString();
                        if (i9 == FrostHunterLifecycleBlazeGammaElite28892.length() || FrostHunterLifecycleBlazeGammaElite28892.charAt(i9) == ',' || FrostHunterLifecycleBlazeGammaElite28892.charAt(i9) == ';') {
                            i3 = i9 + 1;
                            str = null;
                        } else {
                            int i10 = i9 + 1;
                            byte[] bArr = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterAlphaAnimationNeoCosmos5761;
                            int length2 = FrostHunterLifecycleBlazeGammaElite28892.length();
                            while (true) {
                                if (i10 < length2) {
                                    char charAt = FrostHunterLifecycleBlazeGammaElite28892.charAt(i10);
                                    if (charAt != ' ' && charAt != '\t') {
                                        break;
                                    }
                                    i10++;
                                } else {
                                    i10 = FrostHunterLifecycleBlazeGammaElite28892.length();
                                    break;
                                }
                            }
                            if (i10 >= FrostHunterLifecycleBlazeGammaElite28892.length() || FrostHunterLifecycleBlazeGammaElite28892.charAt(i10) != '\"') {
                                int length3 = FrostHunterLifecycleBlazeGammaElite28892.length();
                                int i11 = i10;
                                while (true) {
                                    if (i11 >= length3) {
                                        i11 = FrostHunterLifecycleBlazeGammaElite28892.length();
                                        break;
                                    }
                                    int i12 = length3;
                                    if (FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterTextViewDragonStormMega4297(",;", FrostHunterLifecycleBlazeGammaElite28892.charAt(i11))) {
                                        break;
                                    }
                                    i11++;
                                    length3 = i12;
                                }
                                int i13 = i11;
                                str = FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterR8MasterNebulaSpark7247(FrostHunterLifecycleBlazeGammaElite28892.substring(i10, i11)).toString();
                                i3 = i13;
                            } else {
                                int i14 = i10 + 1;
                                int FrostHunterDialogFragmentTurboPhoenixDragon7627 = FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterLifecycleBlazeGammaElite28892, '\"', i14, 4);
                                str = FrostHunterLifecycleBlazeGammaElite28892.substring(i14, FrostHunterDialogFragmentTurboPhoenixDragon7627);
                                i3 = FrostHunterDialogFragmentTurboPhoenixDragon7627 + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(obj)) {
                            i = i3;
                            z2 = true;
                        } else if ("no-store".equalsIgnoreCase(obj)) {
                            i = i3;
                            z3 = true;
                        } else {
                            if ("max-age".equalsIgnoreCase(obj)) {
                                i5 = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterServiceConnectionTurboPhoenixOmega6719(str, -1);
                            } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                i6 = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterServiceConnectionTurboPhoenixOmega6719(str, -1);
                            } else if ("private".equalsIgnoreCase(obj)) {
                                i = i3;
                                z4 = true;
                            } else if ("public".equalsIgnoreCase(obj)) {
                                i = i3;
                                z5 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                i = i3;
                                z6 = true;
                            } else if ("max-stale".equalsIgnoreCase(obj)) {
                                i7 = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterServiceConnectionTurboPhoenixOmega6719(str, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                i8 = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterServiceConnectionTurboPhoenixOmega6719(str, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                i = i3;
                                z7 = true;
                            } else if ("no-transform".equalsIgnoreCase(obj)) {
                                i = i3;
                                z8 = true;
                            } else if ("immutable".equalsIgnoreCase(obj)) {
                                i = i3;
                                z9 = true;
                            }
                            i = i3;
                        }
                        size = i2;
                    }
                    i4++;
                    frostHunterColorStateListInflaterHeroEclipseOlympian72982 = frostHunterColorStateListInflaterHeroEclipseOlympian7298;
                    size = size;
                }
            } else if (!FrostHunterBundlePulseFusionHero24752.equalsIgnoreCase("Pragma")) {
                i4++;
                frostHunterColorStateListInflaterHeroEclipseOlympian72982 = frostHunterColorStateListInflaterHeroEclipseOlympian7298;
                size = size;
            }
            z = false;
            i = 0;
            while (i < FrostHunterLifecycleBlazeGammaElite28892.length()) {
            }
            i4++;
            frostHunterColorStateListInflaterHeroEclipseOlympian72982 = frostHunterColorStateListInflaterHeroEclipseOlympian7298;
            size = size;
        }
        return new FrostHunterCoroutineScopeCelestialDeltaMax2495(z2, z3, i5, i6, z4, z5, z6, i7, i8, z7, z8, z9, !z ? null : str2);
    }

    public static final boolean FrostHunterPagingSourceEclipseDelta8255(FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder2275, Object obj, Object obj2) {
        Object FrostHunterRemoteConfigSpeedSpeed85662 = frostHunterToastHyperTitanThunder2275.FrostHunterRemoteConfigSpeedSpeed8566(obj);
        if (FrostHunterRemoteConfigSpeedSpeed85662 == null) {
            return false;
        }
        if (!(FrostHunterRemoteConfigSpeedSpeed85662 instanceof FrostHunterToolbarHeroNovaX1020)) {
            if (!FrostHunterRemoteConfigSpeedSpeed85662.equals(obj2)) {
                return false;
            }
            frostHunterToastHyperTitanThunder2275.FrostHunterKeyframeGammaGamma1197(obj);
            return true;
        }
        FrostHunterToolbarHeroNovaX1020 frostHunterToolbarHeroNovaX1020 = (FrostHunterToolbarHeroNovaX1020) FrostHunterRemoteConfigSpeedSpeed85662;
        boolean FrostHunterKeyframeGammaGamma1197 = frostHunterToolbarHeroNovaX1020.FrostHunterKeyframeGammaGamma1197(obj2);
        if (FrostHunterKeyframeGammaGamma1197 && frostHunterToolbarHeroNovaX1020.FrostHunterRemoteConfigSpeedSpeed8566()) {
            frostHunterToastHyperTitanThunder2275.FrostHunterKeyframeGammaGamma1197(obj);
        }
        return FrostHunterKeyframeGammaGamma1197;
    }

    public static final FrostHunterGradlePluginBetaLegend8324 FrostHunterPermissionInfoAlphaDelta6279(FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068) {
        FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse80682;
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterRewardedAdSpectraElite8288(206, FrostHunterSupervisorJobEliteSparkEclipse7300.FrostHunterLifecycleBlazeGammaElite2889);
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
            FrostHunterOnClickListenerNebulaStorm6760.FrostHunterDialogFragmentTurboPhoenixDragon7627(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMediaPlayerCelestialBetaTitan3868);
        }
        Object FrostHunterDatabaseEliteShadowUltra2452 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterDatabaseEliteShadowUltra2452();
        FrostHunterProcessCameraProviderNebulaOlympianNova6091 frostHunterProcessCameraProviderNebulaOlympianNova6091 = FrostHunterDatabaseEliteShadowUltra2452 instanceof FrostHunterProcessCameraProviderNebulaOlympianNova6091 ? (FrostHunterProcessCameraProviderNebulaOlympianNova6091) FrostHunterDatabaseEliteShadowUltra2452 : null;
        if (frostHunterProcessCameraProviderNebulaOlympianNova6091 == null) {
            frostHunterDialogFragmentPhantomEclipse80682 = frostHunterDialogFragmentPhantomEclipse8068;
            frostHunterProcessCameraProviderNebulaOlympianNova6091 = new FrostHunterProcessCameraProviderNebulaOlympianNova6091(new FrostHunterGradlePluginBetaLegend8324(frostHunterDialogFragmentPhantomEclipse80682, frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752, frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223, frostHunterDialogFragmentPhantomEclipse8068.FrostHunterEditTextPulseHyperion1262, frostHunterDialogFragmentPhantomEclipse8068.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterLooperHyperionForce4133));
            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterColorStateListMegaBetaFusion7423(frostHunterProcessCameraProviderNebulaOlympianNova6091);
        } else {
            frostHunterDialogFragmentPhantomEclipse80682 = frostHunterDialogFragmentPhantomEclipse8068;
        }
        FrostHunterGradlePluginBetaLegend8324 frostHunterGradlePluginBetaLegend8324 = frostHunterProcessCameraProviderNebulaOlympianNova6091.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterGradlePluginBetaLegend8324.FrostHunterLevelListDrawableFusionDragonHero2232.setValue(frostHunterDialogFragmentPhantomEclipse80682.FrostHunterFragmentBetaMegaVortex6025());
        frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLintTitanVortexQuantum9911(false);
        return frostHunterGradlePluginBetaLegend8324;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean FrostHunterR8MasterNebulaSpark7247(FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber9213, FrostHunterDiffUtilNeoThunder4910 frostHunterDiffUtilNeoThunder4910) {
        FrostHunterServiceInfoTitaniumPrimeCyber9213[] frostHunterServiceInfoTitaniumPrimeCyber9213Arr = new FrostHunterServiceInfoTitaniumPrimeCyber9213[16];
        if (!frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLooperThreadBetaHyperionMax1000) {
            FrostHunterAudioManagerThunderTitan4297.FrostHunterConstraintSetCloneMasterUltraRogue2633("visitChildren called on an unattached node");
        }
        FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike7090 = new FrostHunterObjectAnimatorNeoStrike7090(new FrostHunterGradientDrawablePulseDragonInferno9637[16]);
        FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno9637 = frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96372 = frostHunterGradientDrawablePulseDragonInferno9637.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        if (frostHunterGradientDrawablePulseDragonInferno96372 == null) {
            FrostHunterRemoteConfigPhantomDelta1739.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterObjectAnimatorNeoStrike7090, frostHunterGradientDrawablePulseDragonInferno9637);
        } else {
            frostHunterObjectAnimatorNeoStrike7090.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno96372);
        }
        int i = 0;
        while (true) {
            int i2 = frostHunterObjectAnimatorNeoStrike7090.FrostHunterAlertDialogAuroraDelta3200;
            if (i2 == 0) {
                break;
            }
            FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96373 = (FrostHunterGradientDrawablePulseDragonInferno9637) frostHunterObjectAnimatorNeoStrike7090.FrostHunterAlertDialogAuroraDelta3200(i2 - 1);
            if ((frostHunterGradientDrawablePulseDragonInferno96373.FrostHunterKeyframeGammaGamma1197 & 1024) == 0) {
                FrostHunterRemoteConfigPhantomDelta1739.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterObjectAnimatorNeoStrike7090, frostHunterGradientDrawablePulseDragonInferno96373);
            } else {
                while (true) {
                    if (frostHunterGradientDrawablePulseDragonInferno96373 == null) {
                        break;
                    }
                    if ((frostHunterGradientDrawablePulseDragonInferno96373.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0) {
                        FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike70902 = null;
                        while (frostHunterGradientDrawablePulseDragonInferno96373 != null) {
                            if (frostHunterGradientDrawablePulseDragonInferno96373 instanceof FrostHunterServiceInfoTitaniumPrimeCyber9213) {
                                FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber92132 = (FrostHunterServiceInfoTitaniumPrimeCyber9213) frostHunterGradientDrawablePulseDragonInferno96373;
                                int i3 = i + 1;
                                if (frostHunterServiceInfoTitaniumPrimeCyber9213Arr.length < i3) {
                                    int length = frostHunterServiceInfoTitaniumPrimeCyber9213Arr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(frostHunterServiceInfoTitaniumPrimeCyber9213Arr, 0, r10, 0, length);
                                    frostHunterServiceInfoTitaniumPrimeCyber9213Arr = r10;
                                }
                                frostHunterServiceInfoTitaniumPrimeCyber9213Arr[i] = frostHunterServiceInfoTitaniumPrimeCyber92132;
                                i = i3;
                            } else if ((frostHunterGradientDrawablePulseDragonInferno96373.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0 && (frostHunterGradientDrawablePulseDragonInferno96373 instanceof FrostHunterToolbarVortexMaster1971)) {
                                int i4 = 0;
                                for (FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96374 = ((FrostHunterToolbarVortexMaster1971) frostHunterGradientDrawablePulseDragonInferno96373).FrostHunterBitmapTurboDeltaNebula8743; frostHunterGradientDrawablePulseDragonInferno96374 != null; frostHunterGradientDrawablePulseDragonInferno96374 = frostHunterGradientDrawablePulseDragonInferno96374.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                                    if ((frostHunterGradientDrawablePulseDragonInferno96374.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            frostHunterGradientDrawablePulseDragonInferno96373 = frostHunterGradientDrawablePulseDragonInferno96374;
                                        } else {
                                            if (frostHunterObjectAnimatorNeoStrike70902 == null) {
                                                frostHunterObjectAnimatorNeoStrike70902 = new FrostHunterObjectAnimatorNeoStrike7090(new FrostHunterGradientDrawablePulseDragonInferno9637[16]);
                                            }
                                            if (frostHunterGradientDrawablePulseDragonInferno96373 != null) {
                                                frostHunterObjectAnimatorNeoStrike70902.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno96373);
                                                frostHunterGradientDrawablePulseDragonInferno96373 = null;
                                            }
                                            frostHunterObjectAnimatorNeoStrike70902.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno96374);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            frostHunterGradientDrawablePulseDragonInferno96373 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterScaleAnimationStrikeSpark5059(frostHunterObjectAnimatorNeoStrike70902);
                        }
                    } else {
                        frostHunterGradientDrawablePulseDragonInferno96373 = frostHunterGradientDrawablePulseDragonInferno96373.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                    }
                }
            }
        }
        Arrays.sort(frostHunterServiceInfoTitaniumPrimeCyber9213Arr, 0, i, FrostHunterCoroutineCelestialOmega6845.FrostHunterFlowMaxDragonHero5809);
        int i5 = i - 1;
        if (i5 < frostHunterServiceInfoTitaniumPrimeCyber9213Arr.length) {
            while (i5 >= 0) {
                FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber92133 = frostHunterServiceInfoTitaniumPrimeCyber9213Arr[i5];
                if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterPagingDataTurboTitanium7332(frostHunterServiceInfoTitaniumPrimeCyber92133) && FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterServiceInfoTitaniumPrimeCyber92133, frostHunterDiffUtilNeoThunder4910)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static final boolean FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511) {
        FrostHunterFirestoreEliteMasterThunder9916 FrostHunterKeyframeGammaGamma1197 = frostHunterSharedElementSpectraNeo2511.FrostHunterKeyframeGammaGamma1197();
        return !FrostHunterKeyframeGammaGamma1197.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475(FrostHunterBannerAdEliteStrike7333.FrostHunterFlowMaxDragonHero5809);
    }

    public static final String FrostHunterRemoteConfigThunderShadow4435(FrostHunterTraceCelestialVortexSpark6705 frostHunterTraceCelestialVortexSpark6705) {
        Object frostHunterRealtimeDatabaseBetaOlympianPhoenix2409;
        if (frostHunterTraceCelestialVortexSpark6705 instanceof FrostHunterFlowOnUltraInfernoThunder4489) {
            return ((FrostHunterFlowOnUltraInfernoThunder4489) frostHunterTraceCelestialVortexSpark6705).toString();
        }
        try {
            frostHunterRealtimeDatabaseBetaOlympianPhoenix2409 = frostHunterTraceCelestialVortexSpark6705 + '@' + FrostHunterDatabaseEliteShadowUltra2452(frostHunterTraceCelestialVortexSpark6705);
        } catch (Throwable th) {
            frostHunterRealtimeDatabaseBetaOlympianPhoenix2409 = new FrostHunterRealtimeDatabaseBetaOlympianPhoenix2409(th);
        }
        if (FrostHunterProximitySensorLegendAuroraPrime1541.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRealtimeDatabaseBetaOlympianPhoenix2409) != null) {
            frostHunterRealtimeDatabaseBetaOlympianPhoenix2409 = frostHunterTraceCelestialVortexSpark6705.getClass().getName() + '@' + FrostHunterDatabaseEliteShadowUltra2452(frostHunterTraceCelestialVortexSpark6705);
        }
        return (String) frostHunterRealtimeDatabaseBetaOlympianPhoenix2409;
    }

    public static void FrostHunterResourcesTitanHyperVision5823(String str, String str2, Object obj) {
        if (Log.isLoggable(FrostHunterMediaPlayerCelestialBetaTitan3868(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static FrostHunterCountDownTimerRogueTitan5615 FrostHunterRewardedAdMasterStrike9463(FrostHunterTransformSpectraLegend4789 frostHunterTransformSpectraLegend4789, FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615) {
        frostHunterCountDownTimerRogueTitan5615.getClass();
        return frostHunterCountDownTimerRogueTitan5615 == FrostHunterFCMThunderTitanium1373.FrostHunterCameraXPixelTurboCosmos9814 ? frostHunterTransformSpectraLegend4789 : (FrostHunterCountDownTimerRogueTitan5615) frostHunterCountDownTimerRogueTitan5615.FrostHunterAlertDialogAuroraDelta3200(new FrostHunterLaunchEclipseAurora4535(3), frostHunterTransformSpectraLegend4789);
    }

    public static final void FrostHunterRewardedAdSpectraElite8288(Object obj) {
        if (obj instanceof FrostHunterRealtimeDatabaseBetaOlympianPhoenix2409) {
            throw ((FrostHunterRealtimeDatabaseBetaOlympianPhoenix2409) obj).FrostHunterCameraXPixelTurboCosmos9814;
        }
    }

    public static final FrostHunterCombineBlazeLegendGamma9228 FrostHunterScaleAnimationStrikeSpark5059(FrostHunterCombineBlazeLegendGamma9228 frostHunterCombineBlazeLegendGamma9228) {
        return androidx.compose.ui.graphics.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterCombineBlazeLegendGamma9228, null, 520191);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber9213, FrostHunterDiffUtilNeoThunder4910 frostHunterDiffUtilNeoThunder4910) {
        int ordinal = frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterBannerAdNebulaMasterBeta4389().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                FrostHunterServiceInfoTitaniumPrimeCyber9213 FrostHunterMeteringPointMegaCyber7955 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMeteringPointMegaCyber7955(frostHunterServiceInfoTitaniumPrimeCyber9213);
                if (FrostHunterMeteringPointMegaCyber7955 == null) {
                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("ActiveParent must have a focusedChild");
                    return false;
                }
                int ordinal2 = FrostHunterMeteringPointMegaCyber7955.FrostHunterBannerAdNebulaMasterBeta4389().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                                return false;
                            }
                            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("ActiveParent must have a focusedChild");
                            return false;
                        }
                    } else if (FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterMeteringPointMegaCyber7955, frostHunterDiffUtilNeoThunder4910) || FrostHunterLooperHyperionForce4133(frostHunterServiceInfoTitaniumPrimeCyber9213, FrostHunterMeteringPointMegaCyber7955, 2, frostHunterDiffUtilNeoThunder4910) || (FrostHunterMeteringPointMegaCyber7955.FrostHunterObjectAnimatorPhoenixSpectraThunder6218().FrostHunterAlphaAnimationNeoCosmos5761 && ((Boolean) frostHunterDiffUtilNeoThunder4910.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterMeteringPointMegaCyber7955)).booleanValue())) {
                        return true;
                    }
                }
                return FrostHunterLooperHyperionForce4133(frostHunterServiceInfoTitaniumPrimeCyber9213, FrostHunterMeteringPointMegaCyber7955, 2, frostHunterDiffUtilNeoThunder4910);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                    return false;
                }
                if (!FrostHunterR8MasterNebulaSpark7247(frostHunterServiceInfoTitaniumPrimeCyber9213, frostHunterDiffUtilNeoThunder4910)) {
                    if (!(frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterObjectAnimatorPhoenixSpectraThunder6218().FrostHunterAlphaAnimationNeoCosmos5761 ? ((Boolean) frostHunterDiffUtilNeoThunder4910.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterServiceInfoTitaniumPrimeCyber9213)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return FrostHunterR8MasterNebulaSpark7247(frostHunterServiceInfoTitaniumPrimeCyber9213, frostHunterDiffUtilNeoThunder4910);
    }

    public static final void FrostHunterServiceEliteCelestialThunder1757(FrostHunterSurfaceViewPulseSpectraStorm4437 frostHunterSurfaceViewPulseSpectraStorm4437, FrostHunterItemDecorationNovaPulseHyperion9221 frostHunterItemDecorationNovaPulseHyperion9221, FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, int i) {
        FrostHunterRippleDrawableBlazeBetaStorm6320 frostHunterRippleDrawableBlazeBetaStorm6320;
        frostHunterItemDecorationNovaPulseHyperion9221.getClass();
        frostHunterNotificationGammaBlazePhoenix7595.getClass();
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(-1569385549);
        int i2 = i | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterSurfaceViewPulseSpectraStorm4437) ? 4 : 2) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterItemDecorationNovaPulseHyperion9221) ? 32 : 16) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix7595) ? 256 : 128);
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i2 & 1, (i2 & 147) != 146)) {
            FrostHunterChipSpectraInfernoVortex8090 FrostHunterScaleAnimationStrikeSpark5059 = FrostHunterTransitionGammaTitanSpeed7178.FrostHunterScaleAnimationStrikeSpark5059(frostHunterSurfaceViewPulseSpectraStorm4437.FrostHunterServiceEliteCelestialThunder1757, frostHunterDialogFragmentPhantomEclipse8068);
            FrostHunterChipSpectraInfernoVortex8090 FrostHunterAlertDialogAuroraDelta32002 = FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterAlertDialogAuroraDelta3200(frostHunterNotificationGammaBlazePhoenix7595, frostHunterDialogFragmentPhantomEclipse8068);
            boolean FrostHunterCameraXPixelTurboCosmos98142 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterSurfaceViewPulseSpectraStorm4437);
            Object FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            FrostHunterRippleDrawableBlazeBetaStorm6320 frostHunterRippleDrawableBlazeBetaStorm63202 = FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761;
            if (FrostHunterCameraXPixelTurboCosmos98142 || FrostHunterMagnetometerFusionTitanium8202 == frostHunterRippleDrawableBlazeBetaStorm63202) {
                frostHunterRippleDrawableBlazeBetaStorm6320 = frostHunterRippleDrawableBlazeBetaStorm63202;
                FrostHunterExecutorSolarGamma2515 frostHunterExecutorSolarGamma2515 = new FrostHunterExecutorSolarGamma2515(0, frostHunterSurfaceViewPulseSpectraStorm4437, FrostHunterSurfaceViewPulseSpectraStorm4437.class, "onBackPressed", "onBackPressed()V", 0, 0, 8);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(frostHunterExecutorSolarGamma2515);
                FrostHunterMagnetometerFusionTitanium8202 = frostHunterExecutorSolarGamma2515;
            } else {
                frostHunterRippleDrawableBlazeBetaStorm6320 = frostHunterRippleDrawableBlazeBetaStorm63202;
            }
            FrostHunterRemoteConfigPhantomDelta1739.FrostHunterAlphaAnimationNeoCosmos5761(false, (FrostHunterNotificationGammaBlazePhoenix7595) ((FrostHunterRippleDrawableNeoTitanium8154) FrostHunterMagnetometerFusionTitanium8202), frostHunterDialogFragmentPhantomEclipse8068, 0);
            boolean FrostHunterCameraXPixelTurboCosmos98143 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterSurfaceViewPulseSpectraStorm4437) | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterAlertDialogAuroraDelta32002);
            Object FrostHunterMagnetometerFusionTitanium82022 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            FrostHunterRippleDrawableBlazeBetaStorm6320 frostHunterRippleDrawableBlazeBetaStorm63203 = frostHunterRippleDrawableBlazeBetaStorm6320;
            if (FrostHunterCameraXPixelTurboCosmos98143 || FrostHunterMagnetometerFusionTitanium82022 == frostHunterRippleDrawableBlazeBetaStorm63203) {
                FrostHunterMagnetometerFusionTitanium82022 = new FrostHunterGuidelineCyberShadow5104(frostHunterSurfaceViewPulseSpectraStorm4437, FrostHunterAlertDialogAuroraDelta32002, null, 12);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium82022);
            }
            FrostHunterCanvasInfernoVortex4700.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterDialogFragmentPhantomEclipse8068, (FrostHunterFontFamilyNeoBetaEpic8574) FrostHunterMagnetometerFusionTitanium82022, frostHunterSurfaceViewPulseSpectraStorm4437);
            FrostHunterContentProviderTurboPhantomForce4573 frostHunterContentProviderTurboPhantomForce4573 = (FrostHunterContentProviderTurboPhantomForce4573) FrostHunterScaleAnimationStrikeSpark5059.getValue();
            boolean FrostHunterCameraXPixelTurboCosmos98144 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterSurfaceViewPulseSpectraStorm4437);
            Object FrostHunterMagnetometerFusionTitanium82023 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterCameraXPixelTurboCosmos98144 || FrostHunterMagnetometerFusionTitanium82023 == frostHunterRippleDrawableBlazeBetaStorm63203) {
                FrostHunterExecutorSolarGamma2515 frostHunterExecutorSolarGamma25152 = new FrostHunterExecutorSolarGamma2515(0, frostHunterSurfaceViewPulseSpectraStorm4437, FrostHunterSurfaceViewPulseSpectraStorm4437.class, "openModes", "openModes()V", 0, 0, 9);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(frostHunterExecutorSolarGamma25152);
                FrostHunterMagnetometerFusionTitanium82023 = frostHunterExecutorSolarGamma25152;
            }
            FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75952 = (FrostHunterNotificationGammaBlazePhoenix7595) ((FrostHunterRippleDrawableNeoTitanium8154) FrostHunterMagnetometerFusionTitanium82023);
            boolean FrostHunterCameraXPixelTurboCosmos98145 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterSurfaceViewPulseSpectraStorm4437);
            Object FrostHunterMagnetometerFusionTitanium82024 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterCameraXPixelTurboCosmos98145 || FrostHunterMagnetometerFusionTitanium82024 == frostHunterRippleDrawableBlazeBetaStorm63203) {
                FrostHunterExecutorSolarGamma2515 frostHunterExecutorSolarGamma25153 = new FrostHunterExecutorSolarGamma2515(0, frostHunterSurfaceViewPulseSpectraStorm4437, FrostHunterSurfaceViewPulseSpectraStorm4437.class, "openRules", "openRules()V", 0, 0, 10);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(frostHunterExecutorSolarGamma25153);
                FrostHunterMagnetometerFusionTitanium82024 = frostHunterExecutorSolarGamma25153;
            }
            FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75953 = (FrostHunterNotificationGammaBlazePhoenix7595) ((FrostHunterRippleDrawableNeoTitanium8154) FrostHunterMagnetometerFusionTitanium82024);
            boolean FrostHunterCameraXPixelTurboCosmos98146 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterSurfaceViewPulseSpectraStorm4437);
            Object FrostHunterMagnetometerFusionTitanium82025 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterCameraXPixelTurboCosmos98146 || FrostHunterMagnetometerFusionTitanium82025 == frostHunterRippleDrawableBlazeBetaStorm63203) {
                FrostHunterExecutorSolarGamma2515 frostHunterExecutorSolarGamma25154 = new FrostHunterExecutorSolarGamma2515(0, frostHunterSurfaceViewPulseSpectraStorm4437, FrostHunterSurfaceViewPulseSpectraStorm4437.class, "openSettings", "openSettings()V", 0, 0, 11);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(frostHunterExecutorSolarGamma25154);
                FrostHunterMagnetometerFusionTitanium82025 = frostHunterExecutorSolarGamma25154;
            }
            FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75954 = (FrostHunterNotificationGammaBlazePhoenix7595) ((FrostHunterRippleDrawableNeoTitanium8154) FrostHunterMagnetometerFusionTitanium82025);
            boolean FrostHunterCameraXPixelTurboCosmos98147 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterSurfaceViewPulseSpectraStorm4437);
            Object FrostHunterMagnetometerFusionTitanium82026 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterCameraXPixelTurboCosmos98147 || FrostHunterMagnetometerFusionTitanium82026 == frostHunterRippleDrawableBlazeBetaStorm63203) {
                FrostHunterRewardedAdNeoSpeed8147 frostHunterRewardedAdNeoSpeed8147 = new FrostHunterRewardedAdNeoSpeed8147(1, frostHunterSurfaceViewPulseSpectraStorm4437, FrostHunterSurfaceViewPulseSpectraStorm4437.class, "openGame", "openGame(Lcom/frosthunter/arcticwildlands/frozenexpedition/adventure/glass/model/ExpeditionMode;)V", 0, 0, 5);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(frostHunterRewardedAdNeoSpeed8147);
                FrostHunterMagnetometerFusionTitanium82026 = frostHunterRewardedAdNeoSpeed8147;
            }
            FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473 = (FrostHunterCombineLegendMegaPrime5473) ((FrostHunterRippleDrawableNeoTitanium8154) FrostHunterMagnetometerFusionTitanium82026);
            boolean FrostHunterCameraXPixelTurboCosmos98148 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterSurfaceViewPulseSpectraStorm4437);
            Object FrostHunterMagnetometerFusionTitanium82027 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterCameraXPixelTurboCosmos98148 || FrostHunterMagnetometerFusionTitanium82027 == frostHunterRippleDrawableBlazeBetaStorm63203) {
                FrostHunterExecutorSolarGamma2515 frostHunterExecutorSolarGamma25155 = new FrostHunterExecutorSolarGamma2515(0, frostHunterSurfaceViewPulseSpectraStorm4437, FrostHunterSurfaceViewPulseSpectraStorm4437.class, "onBackPressed", "onBackPressed()V", 0, 0, 12);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(frostHunterExecutorSolarGamma25155);
                FrostHunterMagnetometerFusionTitanium82027 = frostHunterExecutorSolarGamma25155;
            }
            FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75955 = (FrostHunterNotificationGammaBlazePhoenix7595) ((FrostHunterRippleDrawableNeoTitanium8154) FrostHunterMagnetometerFusionTitanium82027);
            boolean FrostHunterCameraXPixelTurboCosmos98149 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterSurfaceViewPulseSpectraStorm4437);
            Object FrostHunterMagnetometerFusionTitanium82028 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterCameraXPixelTurboCosmos98149 || FrostHunterMagnetometerFusionTitanium82028 == frostHunterRippleDrawableBlazeBetaStorm63203) {
                FrostHunterExecutorSolarGamma2515 frostHunterExecutorSolarGamma25156 = new FrostHunterExecutorSolarGamma2515(0, frostHunterSurfaceViewPulseSpectraStorm4437, FrostHunterSurfaceViewPulseSpectraStorm4437.class, "returnToMenu", "returnToMenu()V", 0, 0, 13);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(frostHunterExecutorSolarGamma25156);
                FrostHunterMagnetometerFusionTitanium82028 = frostHunterExecutorSolarGamma25156;
            }
            FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75956 = (FrostHunterNotificationGammaBlazePhoenix7595) ((FrostHunterRippleDrawableNeoTitanium8154) FrostHunterMagnetometerFusionTitanium82028);
            boolean FrostHunterCameraXPixelTurboCosmos981410 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterSurfaceViewPulseSpectraStorm4437);
            Object FrostHunterMagnetometerFusionTitanium82029 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterCameraXPixelTurboCosmos981410 || FrostHunterMagnetometerFusionTitanium82029 == frostHunterRippleDrawableBlazeBetaStorm63203) {
                FrostHunterExecutorSolarGamma2515 frostHunterExecutorSolarGamma25157 = new FrostHunterExecutorSolarGamma2515(0, frostHunterSurfaceViewPulseSpectraStorm4437, FrostHunterSurfaceViewPulseSpectraStorm4437.class, "exitGame", "exitGame()V", 0, 0, 14);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(frostHunterExecutorSolarGamma25157);
                FrostHunterMagnetometerFusionTitanium82029 = frostHunterExecutorSolarGamma25157;
            }
            FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75957 = (FrostHunterNotificationGammaBlazePhoenix7595) ((FrostHunterRippleDrawableNeoTitanium8154) FrostHunterMagnetometerFusionTitanium82029);
            boolean FrostHunterCameraXPixelTurboCosmos981411 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterSurfaceViewPulseSpectraStorm4437);
            Object FrostHunterMagnetometerFusionTitanium820210 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterCameraXPixelTurboCosmos981411 || FrostHunterMagnetometerFusionTitanium820210 == frostHunterRippleDrawableBlazeBetaStorm63203) {
                FrostHunterRewardedAdNeoSpeed8147 frostHunterRewardedAdNeoSpeed81472 = new FrostHunterRewardedAdNeoSpeed8147(1, frostHunterSurfaceViewPulseSpectraStorm4437, FrostHunterSurfaceViewPulseSpectraStorm4437.class, "setMusicEnabled", "setMusicEnabled(Z)V", 0, 0, 2);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(frostHunterRewardedAdNeoSpeed81472);
                FrostHunterMagnetometerFusionTitanium820210 = frostHunterRewardedAdNeoSpeed81472;
            }
            FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime54732 = (FrostHunterCombineLegendMegaPrime5473) ((FrostHunterRippleDrawableNeoTitanium8154) FrostHunterMagnetometerFusionTitanium820210);
            boolean FrostHunterCameraXPixelTurboCosmos981412 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterSurfaceViewPulseSpectraStorm4437);
            Object FrostHunterMagnetometerFusionTitanium820211 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterCameraXPixelTurboCosmos981412 || FrostHunterMagnetometerFusionTitanium820211 == frostHunterRippleDrawableBlazeBetaStorm63203) {
                FrostHunterRewardedAdNeoSpeed8147 frostHunterRewardedAdNeoSpeed81473 = new FrostHunterRewardedAdNeoSpeed8147(1, frostHunterSurfaceViewPulseSpectraStorm4437, FrostHunterSurfaceViewPulseSpectraStorm4437.class, "setSoundEnabled", "setSoundEnabled(Z)V", 0, 0, 3);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(frostHunterRewardedAdNeoSpeed81473);
                FrostHunterMagnetometerFusionTitanium820211 = frostHunterRewardedAdNeoSpeed81473;
            }
            FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime54733 = (FrostHunterCombineLegendMegaPrime5473) ((FrostHunterRippleDrawableNeoTitanium8154) FrostHunterMagnetometerFusionTitanium820211);
            boolean FrostHunterCameraXPixelTurboCosmos981413 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterSurfaceViewPulseSpectraStorm4437);
            Object FrostHunterMagnetometerFusionTitanium820212 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterCameraXPixelTurboCosmos981413 || FrostHunterMagnetometerFusionTitanium820212 == frostHunterRippleDrawableBlazeBetaStorm63203) {
                FrostHunterRewardedAdNeoSpeed8147 frostHunterRewardedAdNeoSpeed81474 = new FrostHunterRewardedAdNeoSpeed8147(1, frostHunterSurfaceViewPulseSpectraStorm4437, FrostHunterSurfaceViewPulseSpectraStorm4437.class, "setVibrationEnabled", "setVibrationEnabled(Z)V", 0, 0, 4);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(frostHunterRewardedAdNeoSpeed81474);
                FrostHunterMagnetometerFusionTitanium820212 = frostHunterRewardedAdNeoSpeed81474;
            }
            FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterBundlePulseFusionHero2475(frostHunterContentProviderTurboPhantomForce4573, frostHunterItemDecorationNovaPulseHyperion9221, frostHunterNotificationGammaBlazePhoenix75952, frostHunterNotificationGammaBlazePhoenix75953, frostHunterNotificationGammaBlazePhoenix75954, frostHunterCombineLegendMegaPrime5473, frostHunterNotificationGammaBlazePhoenix75955, frostHunterNotificationGammaBlazePhoenix75956, frostHunterNotificationGammaBlazePhoenix75957, frostHunterCombineLegendMegaPrime54732, frostHunterCombineLegendMegaPrime54733, (FrostHunterCombineLegendMegaPrime5473) ((FrostHunterRippleDrawableNeoTitanium8154) FrostHunterMagnetometerFusionTitanium820212), frostHunterDialogFragmentPhantomEclipse8068, i2 & 112);
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterFaceDetectionGammaBlaze1614(frostHunterSurfaceViewPulseSpectraStorm4437, frostHunterItemDecorationNovaPulseHyperion9221, frostHunterNotificationGammaBlazePhoenix7595, i, 1);
        }
    }

    public static final Object FrostHunterServiceInfoHyperionSparkMax9966(FrostHunterLocationListenerDragonVortex1658 frostHunterLocationListenerDragonVortex1658, FrostHunterInstrumentationStrikeBlazeThunder7469 frostHunterInstrumentationStrikeBlazeThunder7469) {
        Object obj = frostHunterLocationListenerDragonVortex1658.FrostHunterCameraXTurboCelestialHero5430.FrostHunterAlphaAnimationNeoCosmos5761.get(frostHunterInstrumentationStrikeBlazeThunder7469);
        if (obj != null) {
            return obj;
        }
        Object obj2 = frostHunterLocationListenerDragonVortex1658.FrostHunterTextViewDragonStormMega4297.FrostHunterLightSensorForceFusion4241.FrostHunterAlphaAnimationNeoCosmos5761.get(frostHunterInstrumentationStrikeBlazeThunder7469);
        return obj2 == null ? frostHunterInstrumentationStrikeBlazeThunder7469.FrostHunterCameraXPixelTurboCosmos9814 : obj2;
    }

    public static void FrostHunterStateCelestialNovaPixel8414(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static final boolean FrostHunterTextViewDragonStormMega4297(long j, long j2) {
        return j == j2;
    }

    public static void FrostHunterTransitionListenerPulseVortexCosmos7949(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("csd-", i), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static boolean FrostHunterTranslateAnimationCyberSolarUltra7101(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (FrostHunterRemoteConfigSpeedSpeed8566 == null) {
            FrostHunterRemoteConfigSpeedSpeed8566 = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        FrostHunterRemoteConfigSpeedSpeed8566.booleanValue();
        if (FrostHunterCameraXPixelTurboCosmos9814 == null) {
            FrostHunterCameraXPixelTurboCosmos9814 = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (FrostHunterCameraXPixelTurboCosmos9814.booleanValue()) {
            return !FrostHunterVectorDrawableForceMax1351.FrostHunterBitmapTurboDeltaNebula8743() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static final String FrostHunterViewPhantomNeo1634(FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511, Resources resources) {
        FrostHunterFirestoreEliteMasterThunder9916 frostHunterFirestoreEliteMasterThunder9916 = frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757;
        FrostHunterFirestoreEliteMasterThunder9916 frostHunterFirestoreEliteMasterThunder99162 = frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757;
        Object FrostHunterRemoteConfigSpeedSpeed85662 = frostHunterFirestoreEliteMasterThunder9916.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        String str = null;
        if (FrostHunterRemoteConfigSpeedSpeed85662 == null) {
            FrostHunterRemoteConfigSpeedSpeed85662 = null;
        }
        FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder2275 = frostHunterFirestoreEliteMasterThunder99162.FrostHunterCameraXPixelTurboCosmos9814;
        Object FrostHunterRemoteConfigSpeedSpeed85663 = frostHunterToastHyperTitanThunder2275.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterMeteringPointMegaCyber7955);
        if (FrostHunterRemoteConfigSpeedSpeed85663 == null) {
            FrostHunterRemoteConfigSpeedSpeed85663 = null;
        }
        FrostHunterActivityFusionDelta7273 frostHunterActivityFusionDelta7273 = (FrostHunterActivityFusionDelta7273) FrostHunterRemoteConfigSpeedSpeed85663;
        Object FrostHunterRemoteConfigSpeedSpeed85664 = frostHunterToastHyperTitanThunder2275.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterMotionSceneAuroraMega2271);
        if (FrostHunterRemoteConfigSpeedSpeed85664 == null) {
            FrostHunterRemoteConfigSpeedSpeed85664 = null;
        }
        FrostHunterPoseDetectionThunderCosmos3414 frostHunterPoseDetectionThunderCosmos3414 = (FrostHunterPoseDetectionThunderCosmos3414) FrostHunterRemoteConfigSpeedSpeed85664;
        if (frostHunterActivityFusionDelta7273 != null) {
            int ordinal = frostHunterActivityFusionDelta7273.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                        return null;
                    }
                    if (FrostHunterRemoteConfigSpeedSpeed85662 == null) {
                        FrostHunterRemoteConfigSpeedSpeed85662 = resources.getString(R.string.indeterminate);
                    }
                } else if (frostHunterPoseDetectionThunderCosmos3414 != null && frostHunterPoseDetectionThunderCosmos3414.FrostHunterAlphaAnimationNeoCosmos5761 == 2 && FrostHunterRemoteConfigSpeedSpeed85662 == null) {
                    FrostHunterRemoteConfigSpeedSpeed85662 = resources.getString(R.string.state_off);
                }
            } else if (frostHunterPoseDetectionThunderCosmos3414 != null && frostHunterPoseDetectionThunderCosmos3414.FrostHunterAlphaAnimationNeoCosmos5761 == 2 && FrostHunterRemoteConfigSpeedSpeed85662 == null) {
                FrostHunterRemoteConfigSpeedSpeed85662 = resources.getString(R.string.state_on);
            }
        }
        Object FrostHunterRemoteConfigSpeedSpeed85665 = frostHunterToastHyperTitanThunder2275.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterViewPhantomNeo1634);
        if (FrostHunterRemoteConfigSpeedSpeed85665 == null) {
            FrostHunterRemoteConfigSpeedSpeed85665 = null;
        }
        Boolean bool = (Boolean) FrostHunterRemoteConfigSpeedSpeed85665;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((frostHunterPoseDetectionThunderCosmos3414 == null || frostHunterPoseDetectionThunderCosmos3414.FrostHunterAlphaAnimationNeoCosmos5761 != 4) && FrostHunterRemoteConfigSpeedSpeed85662 == null) {
                FrostHunterRemoteConfigSpeedSpeed85662 = booleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object FrostHunterRemoteConfigSpeedSpeed85666 = frostHunterToastHyperTitanThunder2275.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterBundlePulseFusionHero2475);
        if (FrostHunterRemoteConfigSpeedSpeed85666 == null) {
            FrostHunterRemoteConfigSpeedSpeed85666 = null;
        }
        FrostHunterCameraViewStrikeMegaTitan3669 frostHunterCameraViewStrikeMegaTitan3669 = (FrostHunterCameraViewStrikeMegaTitan3669) FrostHunterRemoteConfigSpeedSpeed85666;
        if (frostHunterCameraViewStrikeMegaTitan3669 != null) {
            if (frostHunterCameraViewStrikeMegaTitan3669 != FrostHunterCameraViewStrikeMegaTitan3669.FrostHunterBundlePulseFusionHero2475) {
                if (FrostHunterRemoteConfigSpeedSpeed85662 == null) {
                    FrostHunterConstraintSetHyperionNova2613 frostHunterConstraintSetHyperionNova2613 = frostHunterCameraViewStrikeMegaTitan3669.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    float f = frostHunterConstraintSetHyperionNova2613.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    float f2 = frostHunterConstraintSetHyperionNova2613.FrostHunterAlphaAnimationNeoCosmos5761;
                    float f3 = f - f2 == 0.0f ? 0.0f : (frostHunterCameraViewStrikeMegaTitan3669.FrostHunterAlphaAnimationNeoCosmos5761 - f2) / (f - f2);
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    FrostHunterRemoteConfigSpeedSpeed85662 = resources.getString(R.string.template_percent, Integer.valueOf(f3 == 0.0f ? 0 : f3 == 1.0f ? 100 : FrostHunterDrawerLayoutUltraStrike3303.FrostHunterCameraXTurboCelestialHero5430(Math.round(f3 * 100.0f), 1, 99)));
                }
            } else if (FrostHunterRemoteConfigSpeedSpeed85662 == null) {
                FrostHunterRemoteConfigSpeedSpeed85662 = resources.getString(R.string.in_progress);
            }
        }
        FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark9882 = FrostHunterBannerAdEliteStrike7333.FrostHunterDatabaseEliteShadowUltra2452;
        if (frostHunterToastHyperTitanThunder2275.FrostHunterBundlePulseFusionHero2475(frostHunterLiveDataScopeMaxSpark9882)) {
            FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder22752 = new FrostHunterSharedElementSpectraNeo2511(frostHunterSharedElementSpectraNeo2511.FrostHunterAlphaAnimationNeoCosmos5761, true, frostHunterSharedElementSpectraNeo2511.FrostHunterBundlePulseFusionHero2475, frostHunterFirestoreEliteMasterThunder99162).FrostHunterKeyframeGammaGamma1197().FrostHunterCameraXPixelTurboCosmos9814;
            Object FrostHunterRemoteConfigSpeedSpeed85667 = frostHunterToastHyperTitanThunder22752.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterAlphaAnimationNeoCosmos5761);
            if (FrostHunterRemoteConfigSpeedSpeed85667 == null) {
                FrostHunterRemoteConfigSpeedSpeed85667 = null;
            }
            Collection collection = (Collection) FrostHunterRemoteConfigSpeedSpeed85667;
            if (collection == null || collection.isEmpty()) {
                Object FrostHunterRemoteConfigSpeedSpeed85668 = frostHunterToastHyperTitanThunder22752.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterLooperHyperionForce4133);
                if (FrostHunterRemoteConfigSpeedSpeed85668 == null) {
                    FrostHunterRemoteConfigSpeedSpeed85668 = null;
                }
                Collection collection2 = (Collection) FrostHunterRemoteConfigSpeedSpeed85668;
                if (collection2 == null || collection2.isEmpty()) {
                    Object FrostHunterRemoteConfigSpeedSpeed85669 = frostHunterToastHyperTitanThunder22752.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterLiveDataScopeMaxSpark9882);
                    if (FrostHunterRemoteConfigSpeedSpeed85669 == null) {
                        FrostHunterRemoteConfigSpeedSpeed85669 = null;
                    }
                    CharSequence charSequence = (CharSequence) FrostHunterRemoteConfigSpeedSpeed85669;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(R.string.state_empty);
                    }
                }
            }
            FrostHunterRemoteConfigSpeedSpeed85662 = str;
        }
        return (String) FrostHunterRemoteConfigSpeedSpeed85662;
    }
}
