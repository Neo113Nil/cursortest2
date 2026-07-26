package android.content.Context;

import android.R;
import android.content.Context;
import android.graphics.Paint;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcelable;
import android.text.Layout;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterLiveDataNebulaVisionSpeed2164 {
    public static final FrostHunterWorkManagerMaxTurbo1858 FrostHunterBundlePulseFusionHero2475;
    public static final FrostHunterWorkManagerMaxTurbo1858 FrostHunterLevelListDrawableFusionDragonHero2232;
    public static final FrostHunterWorkManagerMaxTurbo1858 FrostHunterLifecycleBlazeGammaElite2889;
    public static boolean FrostHunterLightSensorForceFusion4241;
    public static final FrostHunterWorkManagerMaxTurbo1858 FrostHunterRemoteConfigSpeedSpeed8566;
    public static int FrostHunterScaleAnimationStrikeSpark5059;
    public static final FrostHunterWorkManagerMaxTurbo1858 FrostHunterServiceEliteCelestialThunder1757;
    public static final float[] FrostHunterAlphaAnimationNeoCosmos5761 = new float[91];
    public static final Class[] FrostHunterConstraintSetCloneMasterUltraRogue2633 = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final FrostHunterMeteringPointThunderAuroraPhantom9237 FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterMeteringPointThunderAuroraPhantom9237(false);
    public static final FrostHunterMeteringPointThunderAuroraPhantom9237 FrostHunterFlowMaxDragonHero5809 = new FrostHunterMeteringPointThunderAuroraPhantom9237(true);
    public static final byte[] FrostHunterAlertDialogAuroraDelta3200 = {112, 114, 111, 0};
    public static final byte[] FrostHunterKeyframeGammaGamma1197 = {112, 114, 109, 0};
    public static final Object FrostHunterFragmentBetaMegaVortex6025 = new Object();
    public static final Object FrostHunterServiceConnectionTurboPhoenixOmega6719 = new Object();

    static {
        int i = 3;
        FrostHunterBundlePulseFusionHero2475 = new FrostHunterWorkManagerMaxTurbo1858("COMPLETING_ALREADY", i);
        FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterWorkManagerMaxTurbo1858("COMPLETING_WAITING_CHILDREN", i);
        FrostHunterLifecycleBlazeGammaElite2889 = new FrostHunterWorkManagerMaxTurbo1858("COMPLETING_RETRY", i);
        FrostHunterLevelListDrawableFusionDragonHero2232 = new FrostHunterWorkManagerMaxTurbo1858("TOO_LATE_TO_CANCEL", i);
        FrostHunterRemoteConfigSpeedSpeed8566 = new FrostHunterWorkManagerMaxTurbo1858("SEALED", i);
    }

    public static void FrostHunterAlertDialogAuroraDelta3200(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static final FrostHunterInAppPurchaseStormTitanium3752 FrostHunterAlphaAnimationNeoCosmos5761(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        FrostHunterWithContextAlphaAuroraDelta1469 FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterLifecycleInfernoCyberMax2095.FrostHunterAlphaAnimationNeoCosmos5761(f);
        if (FrostHunterAlphaAnimationNeoCosmos57612 == null) {
            FrostHunterAlphaAnimationNeoCosmos57612 = new FrostHunterRoomDatabaseBetaAlpha4647(f);
        }
        return new FrostHunterInAppPurchaseStormTitanium3752(f2, f, FrostHunterAlphaAnimationNeoCosmos57612);
    }

    public static FrostHunterStorageHyperionRogue1554[] FrostHunterBillingClientFusionVortex9008(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, FrostHunterDrawerLayoutUltraStrike3303.FrostHunterCameraXPixelTurboCosmos9814)) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Unsupported version");
            return null;
        }
        int FrostHunterFCMDeltaQuantumHero8364 = (int) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(fileInputStream, 1);
        byte[] FrostHunterPagingDataTurboTitanium7332 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterPagingDataTurboTitanium7332(fileInputStream, (int) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(fileInputStream, 4), (int) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(FrostHunterPagingDataTurboTitanium7332);
        try {
            FrostHunterStorageHyperionRogue1554[] FrostHunterMediaPlayerCelestialBetaTitan3868 = FrostHunterMediaPlayerCelestialBetaTitan3868(byteArrayInputStream, str, FrostHunterFCMDeltaQuantumHero8364);
            byteArrayInputStream.close();
            return FrostHunterMediaPlayerCelestialBetaTitan3868;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int FrostHunterBitmapTurboDeltaNebula8743(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final void FrostHunterBundlePulseFusionHero2475(final FrostHunterContentProviderTurboPhantomForce4573 frostHunterContentProviderTurboPhantomForce4573, final FrostHunterItemDecorationNovaPulseHyperion9221 frostHunterItemDecorationNovaPulseHyperion9221, final FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595, final FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75952, final FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75953, final FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473, final FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75954, final FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75955, final FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75956, final FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime54732, final FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime54733, final FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime54734, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, final int i) {
        frostHunterContentProviderTurboPhantomForce4573.getClass();
        frostHunterItemDecorationNovaPulseHyperion9221.getClass();
        frostHunterNotificationGammaBlazePhoenix7595.getClass();
        frostHunterNotificationGammaBlazePhoenix75952.getClass();
        frostHunterNotificationGammaBlazePhoenix75953.getClass();
        frostHunterCombineLegendMegaPrime5473.getClass();
        frostHunterNotificationGammaBlazePhoenix75954.getClass();
        frostHunterNotificationGammaBlazePhoenix75955.getClass();
        frostHunterNotificationGammaBlazePhoenix75956.getClass();
        frostHunterCombineLegendMegaPrime54732.getClass();
        frostHunterCombineLegendMegaPrime54733.getClass();
        frostHunterCombineLegendMegaPrime54734.getClass();
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(1095110938);
        int i2 = i | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterContentProviderTurboPhantomForce4573) ? 4 : 2) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterItemDecorationNovaPulseHyperion9221) ? 32 : 16) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix7595) ? 256 : 128) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix75952) ? 2048 : 1024) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix75953) ? 16384 : 8192) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterCombineLegendMegaPrime5473) ? 131072 : 65536) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix75954) ? 1048576 : 524288) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix75955) ? 8388608 : 4194304) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix75956) ? 67108864 : 33554432) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterCombineLegendMegaPrime54732) ? 536870912 : 268435456);
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i2 & 1, ((306783379 & i2) == 306783378 && (((frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterCombineLegendMegaPrime54733) ? (char) 4 : (char) 2) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterCombineLegendMegaPrime54734) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            FrostHunterGraphCelestialRogueFusion9497 frostHunterGraphCelestialRogueFusion9497 = frostHunterContentProviderTurboPhantomForce4573.FrostHunterAlphaAnimationNeoCosmos5761;
            Object FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterMagnetometerFusionTitanium8202 == FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761) {
                FrostHunterMagnetometerFusionTitanium8202 = new FrostHunterResourceUltraUltraLegend1377(10);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium8202);
            }
            androidx.compose.animation.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGraphCelestialRogueFusion9497, null, (FrostHunterCombineLegendMegaPrime5473) FrostHunterMagnetometerFusionTitanium8202, null, "glass_scene_host", null, FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterPagingDataTurboTitanium7332(-1564084751, new FrostHunterRoomShadowOlympianCosmos4955() { // from class: android.content.Context.FrostHunterFragmentTransactionLegendNovaThunder2153
                @Override // android.content.Context.FrostHunterRoomShadowOlympianCosmos4955
                public final Object FrostHunterAlertDialogAuroraDelta3200(Object obj, Object obj2, Object obj3, Object obj4) {
                    FrostHunterGraphCelestialRogueFusion9497 frostHunterGraphCelestialRogueFusion94972 = (FrostHunterGraphCelestialRogueFusion9497) obj2;
                    FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse80682 = (FrostHunterDialogFragmentPhantomEclipse8068) obj3;
                    ((FrostHunterPermissionInfernoFusionStrike2319) obj).getClass();
                    frostHunterGraphCelestialRogueFusion94972.getClass();
                    boolean equals = frostHunterGraphCelestialRogueFusion94972.equals(FrostHunterServiceInfoVisionTitaniumTitanium2643.FrostHunterAlphaAnimationNeoCosmos5761);
                    FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75957 = frostHunterNotificationGammaBlazePhoenix75952;
                    FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75958 = frostHunterNotificationGammaBlazePhoenix75953;
                    final int i3 = 0;
                    if (equals) {
                        frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPushNotificationStormTitanGamma8999(451449247);
                        FrostHunterBarrierSpeedBetaInferno6331.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterNotificationGammaBlazePhoenix7595.this, frostHunterNotificationGammaBlazePhoenix75957, frostHunterNotificationGammaBlazePhoenix75958, frostHunterNotificationGammaBlazePhoenix75956, frostHunterDialogFragmentPhantomEclipse80682, 0);
                        frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLintTitanVortexQuantum9911(false);
                    } else {
                        boolean equals2 = frostHunterGraphCelestialRogueFusion94972.equals(FrostHunterOnLongClickListenerSpectraOlympian5077.FrostHunterAlphaAnimationNeoCosmos5761);
                        FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75959 = frostHunterNotificationGammaBlazePhoenix75954;
                        if (equals2) {
                            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPushNotificationStormTitanGamma8999(451718513);
                            FrostHunterAnimationAlphaOmegaEclipse1719.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterNotificationGammaBlazePhoenix75959, frostHunterDialogFragmentPhantomEclipse80682, 0);
                            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLintTitanVortexQuantum9911(false);
                        } else {
                            boolean equals3 = frostHunterGraphCelestialRogueFusion94972.equals(FrostHunterViewPhoenixTitanVortex5529.FrostHunterAlphaAnimationNeoCosmos5761);
                            FrostHunterContentProviderTurboPhantomForce4573 frostHunterContentProviderTurboPhantomForce45732 = frostHunterContentProviderTurboPhantomForce4573;
                            final FrostHunterItemDecorationNovaPulseHyperion9221 frostHunterItemDecorationNovaPulseHyperion92212 = frostHunterItemDecorationNovaPulseHyperion9221;
                            if (equals3) {
                                frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPushNotificationStormTitanGamma8999(451865050);
                                FrostHunterInputMethodManagerQuantumSpeedMaster8897 frostHunterInputMethodManagerQuantumSpeedMaster8897 = frostHunterContentProviderTurboPhantomForce45732.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                boolean FrostHunterCameraXPixelTurboCosmos98142 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterCameraXPixelTurboCosmos9814(frostHunterItemDecorationNovaPulseHyperion92212);
                                final FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime54735 = frostHunterCombineLegendMegaPrime54732;
                                boolean FrostHunterLevelListDrawableFusionDragonHero22322 = FrostHunterCameraXPixelTurboCosmos98142 | frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterCombineLegendMegaPrime54735);
                                Object FrostHunterMagnetometerFusionTitanium82022 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterMagnetometerFusionTitanium8202();
                                Object obj5 = FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761;
                                if (FrostHunterLevelListDrawableFusionDragonHero22322 || FrostHunterMagnetometerFusionTitanium82022 == obj5) {
                                    FrostHunterMagnetometerFusionTitanium82022 = new FrostHunterCombineLegendMegaPrime5473() { // from class: android.content.Context.FrostHunterMotionLayoutTransitionForceNova3071
                                        @Override // android.content.Context.FrostHunterCombineLegendMegaPrime5473
                                        public final Object FrostHunterAlphaAnimationNeoCosmos5761(Object obj6) {
                                            FrostHunterThreadSpectraShadowGamma2307 frostHunterThreadSpectraShadowGamma2307;
                                            int i4 = i3;
                                            FrostHunterLinearLayoutSolarHero7990 frostHunterLinearLayoutSolarHero7990 = FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                                            FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime54736 = frostHunterCombineLegendMegaPrime54735;
                                            FrostHunterItemDecorationNovaPulseHyperion9221 frostHunterItemDecorationNovaPulseHyperion92213 = frostHunterItemDecorationNovaPulseHyperion92212;
                                            Boolean bool = (Boolean) obj6;
                                            switch (i4) {
                                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                                    boolean booleanValue = bool.booleanValue();
                                                    frostHunterItemDecorationNovaPulseHyperion92213.FrostHunterAlphaAnimationNeoCosmos5761 = booleanValue;
                                                    if (!booleanValue) {
                                                        FrostHunterThreadSpectraShadowGamma2307 frostHunterThreadSpectraShadowGamma23072 = (FrostHunterThreadSpectraShadowGamma2307) frostHunterItemDecorationNovaPulseHyperion92213.FrostHunterServiceEliteCelestialThunder1757;
                                                        if (frostHunterThreadSpectraShadowGamma23072 != null) {
                                                            frostHunterThreadSpectraShadowGamma23072.FrostHunterDatabaseEliteShadowUltra2452();
                                                            frostHunterThreadSpectraShadowGamma23072.FrostHunterMeteringPointBetaCyber9571(1, false);
                                                        }
                                                    } else if (booleanValue && (frostHunterThreadSpectraShadowGamma2307 = (FrostHunterThreadSpectraShadowGamma2307) frostHunterItemDecorationNovaPulseHyperion92213.FrostHunterServiceEliteCelestialThunder1757) != null) {
                                                        frostHunterThreadSpectraShadowGamma2307.FrostHunterDatabaseEliteShadowUltra2452();
                                                        frostHunterThreadSpectraShadowGamma2307.FrostHunterMeteringPointBetaCyber9571(1, true);
                                                    }
                                                    frostHunterCombineLegendMegaPrime54736.FrostHunterAlphaAnimationNeoCosmos5761(bool);
                                                    break;
                                                default:
                                                    frostHunterItemDecorationNovaPulseHyperion92213.FrostHunterConstraintSetCloneMasterUltraRogue2633 = bool.booleanValue();
                                                    frostHunterCombineLegendMegaPrime54736.FrostHunterAlphaAnimationNeoCosmos5761(bool);
                                                    break;
                                            }
                                            return frostHunterLinearLayoutSolarHero7990;
                                        }
                                    };
                                    frostHunterDialogFragmentPhantomEclipse80682.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium82022);
                                }
                                FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime54736 = (FrostHunterCombineLegendMegaPrime5473) FrostHunterMagnetometerFusionTitanium82022;
                                boolean FrostHunterCameraXPixelTurboCosmos98143 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterCameraXPixelTurboCosmos9814(frostHunterItemDecorationNovaPulseHyperion92212);
                                final FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime54737 = frostHunterCombineLegendMegaPrime54733;
                                boolean FrostHunterLevelListDrawableFusionDragonHero22323 = FrostHunterCameraXPixelTurboCosmos98143 | frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterCombineLegendMegaPrime54737);
                                Object FrostHunterMagnetometerFusionTitanium82023 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterMagnetometerFusionTitanium8202();
                                if (FrostHunterLevelListDrawableFusionDragonHero22323 || FrostHunterMagnetometerFusionTitanium82023 == obj5) {
                                    final int i4 = 1;
                                    FrostHunterMagnetometerFusionTitanium82023 = new FrostHunterCombineLegendMegaPrime5473() { // from class: android.content.Context.FrostHunterMotionLayoutTransitionForceNova3071
                                        @Override // android.content.Context.FrostHunterCombineLegendMegaPrime5473
                                        public final Object FrostHunterAlphaAnimationNeoCosmos5761(Object obj6) {
                                            FrostHunterThreadSpectraShadowGamma2307 frostHunterThreadSpectraShadowGamma2307;
                                            int i42 = i4;
                                            FrostHunterLinearLayoutSolarHero7990 frostHunterLinearLayoutSolarHero7990 = FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                                            FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime547362 = frostHunterCombineLegendMegaPrime54737;
                                            FrostHunterItemDecorationNovaPulseHyperion9221 frostHunterItemDecorationNovaPulseHyperion92213 = frostHunterItemDecorationNovaPulseHyperion92212;
                                            Boolean bool = (Boolean) obj6;
                                            switch (i42) {
                                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                                    boolean booleanValue = bool.booleanValue();
                                                    frostHunterItemDecorationNovaPulseHyperion92213.FrostHunterAlphaAnimationNeoCosmos5761 = booleanValue;
                                                    if (!booleanValue) {
                                                        FrostHunterThreadSpectraShadowGamma2307 frostHunterThreadSpectraShadowGamma23072 = (FrostHunterThreadSpectraShadowGamma2307) frostHunterItemDecorationNovaPulseHyperion92213.FrostHunterServiceEliteCelestialThunder1757;
                                                        if (frostHunterThreadSpectraShadowGamma23072 != null) {
                                                            frostHunterThreadSpectraShadowGamma23072.FrostHunterDatabaseEliteShadowUltra2452();
                                                            frostHunterThreadSpectraShadowGamma23072.FrostHunterMeteringPointBetaCyber9571(1, false);
                                                        }
                                                    } else if (booleanValue && (frostHunterThreadSpectraShadowGamma2307 = (FrostHunterThreadSpectraShadowGamma2307) frostHunterItemDecorationNovaPulseHyperion92213.FrostHunterServiceEliteCelestialThunder1757) != null) {
                                                        frostHunterThreadSpectraShadowGamma2307.FrostHunterDatabaseEliteShadowUltra2452();
                                                        frostHunterThreadSpectraShadowGamma2307.FrostHunterMeteringPointBetaCyber9571(1, true);
                                                    }
                                                    frostHunterCombineLegendMegaPrime547362.FrostHunterAlphaAnimationNeoCosmos5761(bool);
                                                    break;
                                                default:
                                                    frostHunterItemDecorationNovaPulseHyperion92213.FrostHunterConstraintSetCloneMasterUltraRogue2633 = bool.booleanValue();
                                                    frostHunterCombineLegendMegaPrime547362.FrostHunterAlphaAnimationNeoCosmos5761(bool);
                                                    break;
                                            }
                                            return frostHunterLinearLayoutSolarHero7990;
                                        }
                                    };
                                    frostHunterDialogFragmentPhantomEclipse80682.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium82023);
                                }
                                FrostHunterGradlePluginEclipseCelestial3288.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterInputMethodManagerQuantumSpeedMaster8897, frostHunterCombineLegendMegaPrime54736, (FrostHunterCombineLegendMegaPrime5473) FrostHunterMagnetometerFusionTitanium82023, frostHunterCombineLegendMegaPrime54734, frostHunterNotificationGammaBlazePhoenix75959, frostHunterDialogFragmentPhantomEclipse80682, 0);
                                frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLintTitanVortexQuantum9911(false);
                            } else if (frostHunterGraphCelestialRogueFusion94972.equals(FrostHunterPlaceholderSpectraNova9780.FrostHunterAlphaAnimationNeoCosmos5761)) {
                                frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPushNotificationStormTitanGamma8999(452448160);
                                FrostHunterAdapterDelegateCelestialThunder4486.FrostHunterServiceEliteCelestialThunder1757(frostHunterNotificationGammaBlazePhoenix75959, frostHunterCombineLegendMegaPrime5473, frostHunterDialogFragmentPhantomEclipse80682, 0);
                                frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLintTitanVortexQuantum9911(false);
                            } else {
                                if (!(frostHunterGraphCelestialRogueFusion94972 instanceof FrostHunterInputMethodManagerCosmosInferno9935)) {
                                    frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPushNotificationStormTitanGamma8999(153110133);
                                    frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLintTitanVortexQuantum9911(false);
                                    FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                                    return null;
                                }
                                frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPushNotificationStormTitanGamma8999(452635276);
                                FrostHunterPaintCyberPulse5979.FrostHunterConstraintSetCloneMasterUltraRogue2633(((FrostHunterInputMethodManagerCosmosInferno9935) frostHunterGraphCelestialRogueFusion94972).FrostHunterAlphaAnimationNeoCosmos5761, frostHunterContentProviderTurboPhantomForce45732.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterItemDecorationNovaPulseHyperion92212, frostHunterNotificationGammaBlazePhoenix75957, frostHunterNotificationGammaBlazePhoenix75958, frostHunterNotificationGammaBlazePhoenix75959, frostHunterNotificationGammaBlazePhoenix75955, frostHunterDialogFragmentPhantomEclipse80682, 0);
                                frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLintTitanVortexQuantum9911(false);
                            }
                        }
                    }
                    return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                }
            }, frostHunterDialogFragmentPhantomEclipse8068), frostHunterDialogFragmentPhantomEclipse8068, 1597824);
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterFontFamilyNeoBetaEpic8574(frostHunterItemDecorationNovaPulseHyperion9221, frostHunterNotificationGammaBlazePhoenix7595, frostHunterNotificationGammaBlazePhoenix75952, frostHunterNotificationGammaBlazePhoenix75953, frostHunterCombineLegendMegaPrime5473, frostHunterNotificationGammaBlazePhoenix75954, frostHunterNotificationGammaBlazePhoenix75955, frostHunterNotificationGammaBlazePhoenix75956, frostHunterCombineLegendMegaPrime54732, frostHunterCombineLegendMegaPrime54733, frostHunterCombineLegendMegaPrime54734, i) { // from class: android.content.Context.FrostHunterActivityInfoAlphaElite5881
                public final /* synthetic */ FrostHunterNotificationGammaBlazePhoenix7595 FrostHunterAlertDialogAuroraDelta3200;
                public final /* synthetic */ FrostHunterCombineLegendMegaPrime5473 FrostHunterCameraXTurboCelestialHero5430;
                public final /* synthetic */ FrostHunterNotificationGammaBlazePhoenix7595 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                public final /* synthetic */ FrostHunterItemDecorationNovaPulseHyperion9221 FrostHunterFlowMaxDragonHero5809;
                public final /* synthetic */ FrostHunterNotificationGammaBlazePhoenix7595 FrostHunterFragmentBetaMegaVortex6025;
                public final /* synthetic */ FrostHunterNotificationGammaBlazePhoenix7595 FrostHunterKeyframeGammaGamma1197;
                public final /* synthetic */ FrostHunterNotificationGammaBlazePhoenix7595 FrostHunterLightSensorForceFusion4241;
                public final /* synthetic */ FrostHunterCombineLegendMegaPrime5473 FrostHunterLintTitanVortexQuantum9911;
                public final /* synthetic */ FrostHunterCombineLegendMegaPrime5473 FrostHunterResourcesTitanHyperVision5823;
                public final /* synthetic */ FrostHunterNotificationGammaBlazePhoenix7595 FrostHunterScaleAnimationStrikeSpark5059;
                public final /* synthetic */ FrostHunterCombineLegendMegaPrime5473 FrostHunterServiceConnectionTurboPhoenixOmega6719;

                @Override // android.content.Context.FrostHunterFontFamilyNeoBetaEpic8574
                public final Object FrostHunterCameraXPixelTurboCosmos9814(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int FrostHunterLiveDataBetaLegend3442 = FrostHunterCanvasInfernoVortex4700.FrostHunterLiveDataBetaLegend3442(1);
                    FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterBundlePulseFusionHero2475(FrostHunterContentProviderTurboPhantomForce4573.this, this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterAlertDialogAuroraDelta3200, this.FrostHunterKeyframeGammaGamma1197, this.FrostHunterFragmentBetaMegaVortex6025, this.FrostHunterServiceConnectionTurboPhoenixOmega6719, this.FrostHunterLightSensorForceFusion4241, this.FrostHunterScaleAnimationStrikeSpark5059, this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223, this.FrostHunterLintTitanVortexQuantum9911, this.FrostHunterCameraXTurboCelestialHero5430, this.FrostHunterResourcesTitanHyperVision5823, (FrostHunterDialogFragmentPhantomEclipse8068) obj, FrostHunterLiveDataBetaLegend3442);
                    return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                }
            };
        }
    }

    public static final float FrostHunterCameraXTurboCelestialHero5430(Layout layout, int i, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        FrostHunterAdapterHeroTitan7326 frostHunterAdapterHeroTitan7326 = FrostHunterAnimatedVectorDrawableUltraPulse9884.FrostHunterAlphaAnimationNeoCosmos5761;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : FrostHunterGradlePluginHeroForceNebula7284.FrostHunterAlphaAnimationNeoCosmos5761[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static FrostHunterStorageHyperionRogue1554[] FrostHunterCardViewSpectraCyber7714(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, FrostHunterStorageHyperionRogue1554[] frostHunterStorageHyperionRogue1554Arr) {
        byte[] bArr3 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterFragmentBetaMegaVortex6025;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, FrostHunterDrawerLayoutUltraStrike3303.FrostHunterServiceConnectionTurboPhoenixOmega6719)) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Unsupported meta version");
                return null;
            }
            int FrostHunterFCMDeltaQuantumHero8364 = (int) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(fileInputStream, 2);
            byte[] FrostHunterPagingDataTurboTitanium7332 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterPagingDataTurboTitanium7332(fileInputStream, (int) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(fileInputStream, 4), (int) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(FrostHunterPagingDataTurboTitanium7332);
            try {
                FrostHunterStorageHyperionRogue1554[] FrostHunterMeteringPointMegaCyber7955 = FrostHunterMeteringPointMegaCyber7955(byteArrayInputStream, bArr2, FrostHunterFCMDeltaQuantumHero8364, frostHunterStorageHyperionRogue1554Arr);
                byteArrayInputStream.close();
                return FrostHunterMeteringPointMegaCyber7955;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRemoteConfigSpeedSpeed8566, bArr2)) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Unsupported meta version");
            return null;
        }
        int FrostHunterFCMDeltaQuantumHero83642 = (int) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(fileInputStream, 1);
        byte[] FrostHunterPagingDataTurboTitanium73322 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterPagingDataTurboTitanium7332(fileInputStream, (int) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(fileInputStream, 4), (int) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(FrostHunterPagingDataTurboTitanium73322);
        try {
            FrostHunterStorageHyperionRogue1554[] FrostHunterViewPhantomNeo1634 = FrostHunterViewPhantomNeo1634(byteArrayInputStream2, FrostHunterFCMDeltaQuantumHero83642, frostHunterStorageHyperionRogue1554Arr);
            byteArrayInputStream2.close();
            return FrostHunterViewPhantomNeo1634;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static final void FrostHunterConstraintSetCloneMasterUltraRogue2633(int i) {
        if (i > 0) {
            return;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("px must be > 0.");
    }

    public static FrostHunterInsetDrawablePulseQuantum5539 FrostHunterDatabaseEliteShadowUltra2452(FrostHunterConstraintLayoutBetaAlphaNebula8582 frostHunterConstraintLayoutBetaAlphaNebula8582) {
        int parseInt = Integer.parseInt(frostHunterConstraintLayoutBetaAlphaNebula8582.FrostHunterLooperThreadBetaHyperionMax1000(Long.MAX_VALUE));
        long parseLong = Long.parseLong(frostHunterConstraintLayoutBetaAlphaNebula8582.FrostHunterLooperThreadBetaHyperionMax1000(Long.MAX_VALUE));
        long parseLong2 = Long.parseLong(frostHunterConstraintLayoutBetaAlphaNebula8582.FrostHunterLooperThreadBetaHyperionMax1000(Long.MAX_VALUE));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int parseInt2 = Integer.parseInt(frostHunterConstraintLayoutBetaAlphaNebula8582.FrostHunterLooperThreadBetaHyperionMax1000(Long.MAX_VALUE));
        for (int i = 0; i < parseInt2; i++) {
            String FrostHunterLooperThreadBetaHyperionMax1000 = frostHunterConstraintLayoutBetaAlphaNebula8582.FrostHunterLooperThreadBetaHyperionMax1000(Long.MAX_VALUE);
            int FrostHunterDialogFragmentTurboPhoenixDragon7627 = FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterLooperThreadBetaHyperionMax1000, ':', 0, 6);
            if (FrostHunterDialogFragmentTurboPhoenixDragon7627 == -1) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566("Unexpected header: ".concat(FrostHunterLooperThreadBetaHyperionMax1000));
                return null;
            }
            String obj = FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterR8MasterNebulaSpark7247(FrostHunterLooperThreadBetaHyperionMax1000.substring(0, FrostHunterDialogFragmentTurboPhoenixDragon7627)).toString();
            String substring = FrostHunterLooperThreadBetaHyperionMax1000.substring(FrostHunterDialogFragmentTurboPhoenixDragon7627 + 1);
            String lowerCase = obj.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object obj2 = linkedHashMap.get(lowerCase);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(lowerCase, obj2);
            }
            ((List) obj2).add(substring);
        }
        return new FrostHunterInsetDrawablePulseQuantum5539(parseInt, parseLong, parseLong2, new FrostHunterOnDeviceTranslatorUltraQuantum2312(FrostHunterBroadcastHeroSpectra7879.FrostHunterNestedScrollViewPixelPhantom8605(linkedHashMap)), null, null);
    }

    public static final FrostHunterKeyframeVisionBetaStrike2074 FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber9213, int i) {
        int ordinal = frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterBannerAdNebulaMasterBeta4389().ordinal();
        FrostHunterKeyframeVisionBetaStrike2074 frostHunterKeyframeVisionBetaStrike2074 = FrostHunterKeyframeVisionBetaStrike2074.FrostHunterCameraXPixelTurboCosmos9814;
        if (ordinal != 0) {
            FrostHunterKeyframeVisionBetaStrike2074 frostHunterKeyframeVisionBetaStrike20742 = FrostHunterKeyframeVisionBetaStrike2074.FrostHunterFlowMaxDragonHero5809;
            if (ordinal == 1) {
                FrostHunterServiceInfoTitaniumPrimeCyber9213 FrostHunterMeteringPointMegaCyber7955 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMeteringPointMegaCyber7955(frostHunterServiceInfoTitaniumPrimeCyber9213);
                if (FrostHunterMeteringPointMegaCyber7955 == null) {
                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("ActiveParent with no focused child");
                    return null;
                }
                FrostHunterKeyframeVisionBetaStrike2074 FrostHunterDialogFragmentTurboPhoenixDragon7627 = FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterMeteringPointMegaCyber7955, i);
                FrostHunterKeyframeVisionBetaStrike2074 frostHunterKeyframeVisionBetaStrike20743 = FrostHunterDialogFragmentTurboPhoenixDragon7627 != frostHunterKeyframeVisionBetaStrike2074 ? FrostHunterDialogFragmentTurboPhoenixDragon7627 : null;
                if (frostHunterKeyframeVisionBetaStrike20743 != null) {
                    return frostHunterKeyframeVisionBetaStrike20743;
                }
                if (frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterBitmapTurboDeltaNebula8743) {
                    return frostHunterKeyframeVisionBetaStrike2074;
                }
                frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterBitmapTurboDeltaNebula8743 = true;
                try {
                    FrostHunterSurfaceViewNovaHyperNova1698 FrostHunterObjectAnimatorPhoenixSpectraThunder6218 = frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterObjectAnimatorPhoenixSpectraThunder6218();
                    FrostHunterCoroutineScopeNebulaCelestial2839 frostHunterCoroutineScopeNebulaCelestial2839 = new FrostHunterCoroutineScopeNebulaCelestial2839(i);
                    FrostHunterGroupRogueCosmos5144 focusOwner = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterPermissionInfoAlphaDelta6279(frostHunterServiceInfoTitaniumPrimeCyber9213).getFocusOwner();
                    FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber92132 = ((FrostHunterLiveDataScopeBlazeStrike6673) focusOwner).FrostHunterCameraXPixelTurboCosmos9814;
                    FrostHunterObjectAnimatorPhoenixSpectraThunder6218.FrostHunterKeyframeGammaGamma1197.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterCoroutineScopeNebulaCelestial2839);
                    FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber92133 = ((FrostHunterLiveDataScopeBlazeStrike6673) focusOwner).FrostHunterCameraXPixelTurboCosmos9814;
                    if (!frostHunterCoroutineScopeNebulaCelestial2839.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                        return (frostHunterServiceInfoTitaniumPrimeCyber92132 == frostHunterServiceInfoTitaniumPrimeCyber92133 || frostHunterServiceInfoTitaniumPrimeCyber92133 == null) ? frostHunterKeyframeVisionBetaStrike2074 : FrostHunterAnimatorNeoDragon6655.FrostHunterServiceEliteCelestialThunder1757 == FrostHunterAnimatorNeoDragon6655.FrostHunterBundlePulseFusionHero2475 ? frostHunterKeyframeVisionBetaStrike20742 : FrostHunterKeyframeVisionBetaStrike2074.FrostHunterAlertDialogAuroraDelta3200;
                    }
                    FrostHunterAnimatorNeoDragon6655 frostHunterAnimatorNeoDragon6655 = FrostHunterAnimatorNeoDragon6655.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    return frostHunterKeyframeVisionBetaStrike20742;
                } finally {
                    frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterBitmapTurboDeltaNebula8743 = false;
                }
            }
            if (ordinal == 2) {
                return frostHunterKeyframeVisionBetaStrike20742;
            }
            if (ordinal != 3) {
                FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                return null;
            }
        }
        return frostHunterKeyframeVisionBetaStrike2074;
    }

    public static int[] FrostHunterEditTextPulseHyperion1262(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(byteArrayInputStream, 2);
            iArr[i3] = i2;
        }
        return iArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean FrostHunterFCMDeltaQuantumHero8364(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, FrostHunterStorageHyperionRogue1554[] frostHunterStorageHyperionRogue1554Arr) {
        int i;
        long j;
        int length;
        byte[] bArr2 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterKeyframeGammaGamma1197;
        byte[] bArr3 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAlertDialogAuroraDelta3200;
        byte[] bArr4 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRemoteConfigSpeedSpeed8566;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterCameraXPixelTurboCosmos9814;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] FrostHunterLightSensorForceFusion42412 = FrostHunterLightSensorForceFusion4241(frostHunterStorageHyperionRogue1554Arr, bArr5);
                FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream, frostHunterStorageHyperionRogue1554Arr.length, 1);
                FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream, FrostHunterLightSensorForceFusion42412.length, 4);
                byte[] FrostHunterLightSensorForceFusion42413 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterLightSensorForceFusion4241(FrostHunterLightSensorForceFusion42412);
                FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream, FrostHunterLightSensorForceFusion42413.length, 4);
                byteArrayOutputStream.write(FrostHunterLightSensorForceFusion42413);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream, frostHunterStorageHyperionRogue1554Arr.length, 1);
                for (FrostHunterStorageHyperionRogue1554 frostHunterStorageHyperionRogue1554 : frostHunterStorageHyperionRogue1554Arr) {
                    int size = frostHunterStorageHyperionRogue1554.FrostHunterFlowMaxDragonHero5809.size() * 4;
                    String FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterStorageHyperionRogue1554.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterStorageHyperionRogue1554.FrostHunterConstraintSetCloneMasterUltraRogue2633, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream, FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.getBytes(charset).length);
                    FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream, frostHunterStorageHyperionRogue1554.FrostHunterCameraXPixelTurboCosmos9814.length);
                    FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream, size, 4);
                    FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream, frostHunterStorageHyperionRogue1554.FrostHunterBundlePulseFusionHero2475, 4);
                    byteArrayOutputStream.write(FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.getBytes(charset));
                    Iterator it = frostHunterStorageHyperionRogue1554.FrostHunterFlowMaxDragonHero5809.keySet().iterator();
                    while (it.hasNext()) {
                        FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream, 0);
                    }
                    for (int i3 : frostHunterStorageHyperionRogue1554.FrostHunterCameraXPixelTurboCosmos9814) {
                        FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr6 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterFlowMaxDragonHero5809;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] FrostHunterLightSensorForceFusion42414 = FrostHunterLightSensorForceFusion4241(frostHunterStorageHyperionRogue1554Arr, bArr6);
                FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream, frostHunterStorageHyperionRogue1554Arr.length, 1);
                FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream, FrostHunterLightSensorForceFusion42414.length, 4);
                byte[] FrostHunterLightSensorForceFusion42415 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterLightSensorForceFusion4241(FrostHunterLightSensorForceFusion42414);
                FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream, FrostHunterLightSensorForceFusion42415.length, 4);
                byteArrayOutputStream.write(FrostHunterLightSensorForceFusion42415);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream, frostHunterStorageHyperionRogue1554Arr.length);
            for (FrostHunterStorageHyperionRogue1554 frostHunterStorageHyperionRogue15542 : frostHunterStorageHyperionRogue1554Arr) {
                String str = frostHunterStorageHyperionRogue15542.FrostHunterAlphaAnimationNeoCosmos5761;
                TreeMap treeMap = frostHunterStorageHyperionRogue15542.FrostHunterFlowMaxDragonHero5809;
                String FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232 = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(str, frostHunterStorageHyperionRogue15542.FrostHunterConstraintSetCloneMasterUltraRogue2633, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream, FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232.getBytes(charset2).length);
                FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream, treeMap.size());
                FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream, frostHunterStorageHyperionRogue15542.FrostHunterCameraXPixelTurboCosmos9814.length);
                FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream, frostHunterStorageHyperionRogue15542.FrostHunterBundlePulseFusionHero2475, 4);
                byteArrayOutputStream.write(FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : frostHunterStorageHyperionRogue15542.FrostHunterCameraXPixelTurboCosmos9814) {
                    FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream2, frostHunterStorageHyperionRogue1554Arr.length);
            int i5 = 2;
            int i6 = 2;
            for (FrostHunterStorageHyperionRogue1554 frostHunterStorageHyperionRogue15543 : frostHunterStorageHyperionRogue1554Arr) {
                FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream2, frostHunterStorageHyperionRogue15543.FrostHunterBundlePulseFusionHero2475, 4);
                FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream2, frostHunterStorageHyperionRogue15543.FrostHunterServiceEliteCelestialThunder1757, 4);
                FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream2, frostHunterStorageHyperionRogue15543.FrostHunterRemoteConfigSpeedSpeed8566, 4);
                String FrostHunterFirebaseModelDownloadConditionsSolarBlaze22233 = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterStorageHyperionRogue15543.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterStorageHyperionRogue15543.FrostHunterConstraintSetCloneMasterUltraRogue2633, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = FrostHunterFirebaseModelDownloadConditionsSolarBlaze22233.getBytes(charset3).length;
                FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(FrostHunterFirebaseModelDownloadConditionsSolarBlaze22233.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            FrostHunterInsetDrawableMegaMegaNebula3971 frostHunterInsetDrawableMegaMegaNebula3971 = new FrostHunterInsetDrawableMegaMegaNebula3971(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList.add(frostHunterInsetDrawableMegaMegaNebula3971);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < frostHunterStorageHyperionRogue1554Arr.length) {
                try {
                    FrostHunterStorageHyperionRogue1554 frostHunterStorageHyperionRogue15544 = frostHunterStorageHyperionRogue1554Arr[i7];
                    FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream3, i7);
                    FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream3, frostHunterStorageHyperionRogue15544.FrostHunterLifecycleBlazeGammaElite2889);
                    i8 = i8 + 4 + (frostHunterStorageHyperionRogue15544.FrostHunterLifecycleBlazeGammaElite2889 * i5);
                    int[] iArr = frostHunterStorageHyperionRogue15544.FrostHunterCameraXPixelTurboCosmos9814;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i5 = i5;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            int i11 = i5;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            FrostHunterInsetDrawableMegaMegaNebula3971 frostHunterInsetDrawableMegaMegaNebula39712 = new FrostHunterInsetDrawableMegaMegaNebula3971(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList.add(frostHunterInsetDrawableMegaMegaNebula39712);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            for (int i13 = 0; i13 < frostHunterStorageHyperionRogue1554Arr.length; i13++) {
                try {
                    FrostHunterStorageHyperionRogue1554 frostHunterStorageHyperionRogue15545 = frostHunterStorageHyperionRogue1554Arr[i13];
                    Iterator it3 = frostHunterStorageHyperionRogue15545.FrostHunterFlowMaxDragonHero5809.entrySet().iterator();
                    int i14 = 0;
                    while (it3.hasNext()) {
                        i14 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        FrostHunterTransitionListenerPulseVortexCosmos7949(byteArrayOutputStream4, i14, frostHunterStorageHyperionRogue15545);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            FrostHunterRewardedAdSpectraElite8288(byteArrayOutputStream4, frostHunterStorageHyperionRogue15545);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream3, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i12 + 6;
                            FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream3, length4, 4);
                            FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream3, i14);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i15 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            FrostHunterInsetDrawableMegaMegaNebula3971 frostHunterInsetDrawableMegaMegaNebula39713 = new FrostHunterInsetDrawableMegaMegaNebula3971(4, true, byteArray5);
            byteArrayOutputStream3.close();
            arrayList.add(frostHunterInsetDrawableMegaMegaNebula39713);
            long size2 = 12 + (arrayList.size() * 16);
            FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream, arrayList.size(), 4);
            int i16 = 0;
            while (i16 < arrayList.size()) {
                FrostHunterInsetDrawableMegaMegaNebula3971 frostHunterInsetDrawableMegaMegaNebula39714 = (FrostHunterInsetDrawableMegaMegaNebula3971) arrayList.get(i16);
                int i17 = frostHunterInsetDrawableMegaMegaNebula39714.FrostHunterAlphaAnimationNeoCosmos5761;
                byte[] bArr7 = frostHunterInsetDrawableMegaMegaNebula39714.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                if (i17 != 1) {
                    i = i11;
                    if (i17 == i) {
                        j = 1;
                    } else if (i17 == 3) {
                        j = 2;
                    } else if (i17 == 4) {
                        j = 3;
                    } else {
                        if (i17 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                } else {
                    i = i11;
                    j = 0;
                }
                FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream, j, 4);
                FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream, size2, 4);
                if (frostHunterInsetDrawableMegaMegaNebula39714.FrostHunterBundlePulseFusionHero2475) {
                    long length5 = bArr7.length;
                    byte[] FrostHunterLightSensorForceFusion42416 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterLightSensorForceFusion4241(bArr7);
                    arrayList2.add(FrostHunterLightSensorForceFusion42416);
                    FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream, FrostHunterLightSensorForceFusion42416.length, 4);
                    FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream, length5, 4);
                    length = FrostHunterLightSensorForceFusion42416.length;
                } else {
                    arrayList2.add(bArr7);
                    FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream, bArr7.length, 4);
                    FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i16++;
                i11 = i;
            }
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i18));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static String FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(String str, String str2, byte[] bArr) {
        byte[] bArr2 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAlertDialogAuroraDelta3200;
        byte[] bArr3 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterKeyframeGammaGamma1197;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return FrostHunterKeyEventNovaXAlpha1220.FrostHunterFragmentBetaMegaVortex6025(sb, (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static final boolean FrostHunterFlowMaxDragonHero5809(Object obj) {
        if (obj instanceof FrostHunterGradlePluginDeltaPhoenix1846) {
            FrostHunterGradlePluginDeltaPhoenix1846 frostHunterGradlePluginDeltaPhoenix1846 = (FrostHunterGradlePluginDeltaPhoenix1846) obj;
            if (frostHunterGradlePluginDeltaPhoenix1846.FrostHunterServiceEliteCelestialThunder1757() == FrostHunterRewardedAdHyperStrike1151.FrostHunterMeteringPointMegaCyber7955 || frostHunterGradlePluginDeltaPhoenix1846.FrostHunterServiceEliteCelestialThunder1757() == FrostHunterChipSpeedTitan5326.FrostHunterDialogFragmentTurboPhoenixDragon7627 || frostHunterGradlePluginDeltaPhoenix1846.FrostHunterServiceEliteCelestialThunder1757() == FrostHunterRewardedAdHyperStrike1151.FrostHunterMediaPlayerCelestialBetaTitan3868) {
                Object value = frostHunterGradlePluginDeltaPhoenix1846.getValue();
                if (value == null) {
                    return true;
                }
                return FrostHunterFlowMaxDragonHero5809(value);
            }
        } else if (!(obj instanceof FrostHunterFontFamilyTitanDragonThunder7606) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (FrostHunterConstraintSetCloneMasterUltraRogue2633[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean FrostHunterFragmentBetaMegaVortex6025(FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber9213, boolean z) {
        int ordinal = frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterBannerAdNebulaMasterBeta4389().ordinal();
        FrostHunterRewardedAdAuroraDeltaFusion7394 frostHunterRewardedAdAuroraDeltaFusion7394 = FrostHunterRewardedAdAuroraDeltaFusion7394.FrostHunterKeyframeGammaGamma1197;
        if (ordinal == 0) {
            ((FrostHunterLiveDataScopeBlazeStrike6673) FrostHunterRemoteConfigPhantomDelta1739.FrostHunterPermissionInfoAlphaDelta6279(frostHunterServiceInfoTitaniumPrimeCyber9213).getFocusOwner()).FrostHunterLevelListDrawableFusionDragonHero2232(null);
            frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402(FrostHunterRewardedAdAuroraDeltaFusion7394.FrostHunterCameraXPixelTurboCosmos9814, frostHunterRewardedAdAuroraDeltaFusion7394);
            return true;
        }
        if (ordinal == 1) {
            FrostHunterServiceInfoTitaniumPrimeCyber9213 FrostHunterMeteringPointMegaCyber7955 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMeteringPointMegaCyber7955(frostHunterServiceInfoTitaniumPrimeCyber9213);
            if (!(FrostHunterMeteringPointMegaCyber7955 != null ? FrostHunterFragmentBetaMegaVortex6025(FrostHunterMeteringPointMegaCyber7955, z) : true)) {
                return false;
            }
            frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402(FrostHunterRewardedAdAuroraDeltaFusion7394.FrostHunterFlowMaxDragonHero5809, frostHunterRewardedAdAuroraDeltaFusion7394);
            return true;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return true;
            }
            FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            return false;
        }
        if (z) {
            ((FrostHunterLiveDataScopeBlazeStrike6673) FrostHunterRemoteConfigPhantomDelta1739.FrostHunterPermissionInfoAlphaDelta6279(frostHunterServiceInfoTitaniumPrimeCyber9213).getFocusOwner()).FrostHunterLevelListDrawableFusionDragonHero2232(null);
            frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402(FrostHunterRewardedAdAuroraDeltaFusion7394.FrostHunterAlertDialogAuroraDelta3200, frostHunterRewardedAdAuroraDeltaFusion7394);
        }
        return z;
    }

    public static void FrostHunterKeyframeGammaGamma1197(String str, int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static final void FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterFragmentCosmosSolar3628 frostHunterFragmentCosmosSolar3628, FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue5892, FrostHunterDrawerLayoutEpicFusionShadow4742 frostHunterDrawerLayoutEpicFusionShadow4742) {
        frostHunterKotlinQuantumRogue5892.getClass();
        frostHunterDrawerLayoutEpicFusionShadow4742.getClass();
        FrostHunterScaleGestureDetectorInfernoFusion1697 frostHunterScaleGestureDetectorInfernoFusion1697 = (FrostHunterScaleGestureDetectorInfernoFusion1697) frostHunterFragmentCosmosSolar3628.FrostHunterBundlePulseFusionHero2475("androidx.lifecycle.savedstate.vm.tag");
        if (frostHunterScaleGestureDetectorInfernoFusion1697 == null || frostHunterScaleGestureDetectorInfernoFusion1697.FrostHunterAlertDialogAuroraDelta3200) {
            return;
        }
        frostHunterScaleGestureDetectorInfernoFusion1697.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterKotlinQuantumRogue5892, frostHunterDrawerLayoutEpicFusionShadow4742);
        FrostHunterLicensingBlazeNebula6214 frostHunterLicensingBlazeNebula6214 = frostHunterDrawerLayoutEpicFusionShadow4742.FrostHunterServiceEliteCelestialThunder1757;
        if (frostHunterLicensingBlazeNebula6214 == FrostHunterLicensingBlazeNebula6214.FrostHunterFlowMaxDragonHero5809 || frostHunterLicensingBlazeNebula6214.compareTo(FrostHunterLicensingBlazeNebula6214.FrostHunterKeyframeGammaGamma1197) >= 0) {
            frostHunterKotlinQuantumRogue5892.FrostHunterMotionSceneAuroraMega2271();
        } else {
            frostHunterDrawerLayoutEpicFusionShadow4742.FrostHunterAlphaAnimationNeoCosmos5761(new FrostHunterTimerAuroraNovaSolar9721(frostHunterKotlinQuantumRogue5892, frostHunterDrawerLayoutEpicFusionShadow4742));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object FrostHunterLifecycleBlazeGammaElite2889(File file, FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473, FrostHunterViewBindingCelestialVortex7351 frostHunterViewBindingCelestialVortex7351) {
        FrostHunterIntentUltraTitanSpeed3554 frostHunterIntentUltraTitanSpeed3554;
        int i;
        try {
            if (frostHunterViewBindingCelestialVortex7351 instanceof FrostHunterIntentUltraTitanSpeed3554) {
                frostHunterIntentUltraTitanSpeed3554 = (FrostHunterIntentUltraTitanSpeed3554) frostHunterViewBindingCelestialVortex7351;
                int i2 = frostHunterIntentUltraTitanSpeed3554.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    frostHunterIntentUltraTitanSpeed3554.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i2 - Integer.MIN_VALUE;
                    Object obj = frostHunterIntentUltraTitanSpeed3554.FrostHunterFragmentBetaMegaVortex6025;
                    i = frostHunterIntentUltraTitanSpeed3554.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                    if (i == 0) {
                        if (i != 1) {
                            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        File file2 = frostHunterIntentUltraTitanSpeed3554.FrostHunterKeyframeGammaGamma1197;
                        FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj);
                        return obj;
                    }
                    FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj);
                    frostHunterIntentUltraTitanSpeed3554.FrostHunterKeyframeGammaGamma1197 = file;
                    frostHunterIntentUltraTitanSpeed3554.FrostHunterServiceConnectionTurboPhoenixOmega6719 = 1;
                    Object FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterCombineLegendMegaPrime5473.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterIntentUltraTitanSpeed3554);
                    Object obj2 = FrostHunterAuthMasterNovaXMax8430.FrostHunterCameraXPixelTurboCosmos9814;
                    return FrostHunterAlphaAnimationNeoCosmos57612 == obj2 ? obj2 : FrostHunterAlphaAnimationNeoCosmos57612;
                }
            }
            if (i == 0) {
            }
        } catch (IOException e) {
            if (e instanceof FrostHunterOnPreDrawListenerSolarNeoSolar2957) {
                throw e;
            }
            file.getClass();
            if (!file.exists()) {
                throw FrostHunterBindingAdapterSpeedNeo6677.FrostHunterRemoteConfigSpeedSpeed8566(file, e);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    if (file.canWrite()) {
                        throw FrostHunterBindingAdapterSpeedNeo6677.FrostHunterRemoteConfigSpeedSpeed8566(file, e);
                    }
                    throw FrostHunterBindingAdapterSpeedNeo6677.FrostHunterRemoteConfigSpeedSpeed8566(file, e);
                }
                if (file.canWrite()) {
                    throw FrostHunterBindingAdapterSpeedNeo6677.FrostHunterRemoteConfigSpeedSpeed8566(file, e);
                }
                throw FrostHunterBindingAdapterSpeedNeo6677.FrostHunterRemoteConfigSpeedSpeed8566(file, e);
            }
            if (file.canRead()) {
                if (file.canWrite()) {
                    throw FrostHunterBindingAdapterSpeedNeo6677.FrostHunterRemoteConfigSpeedSpeed8566(file, e);
                }
                throw FrostHunterBindingAdapterSpeedNeo6677.FrostHunterRemoteConfigSpeedSpeed8566(file, e);
            }
            if (file.canWrite()) {
                throw FrostHunterBindingAdapterSpeedNeo6677.FrostHunterRemoteConfigSpeedSpeed8566(file, e);
            }
            throw FrostHunterBindingAdapterSpeedNeo6677.FrostHunterRemoteConfigSpeedSpeed8566(file, e);
        }
        frostHunterIntentUltraTitanSpeed3554 = new FrostHunterIntentUltraTitanSpeed3554(frostHunterViewBindingCelestialVortex7351);
        Object obj3 = frostHunterIntentUltraTitanSpeed3554.FrostHunterFragmentBetaMegaVortex6025;
        i = frostHunterIntentUltraTitanSpeed3554.FrostHunterServiceConnectionTurboPhoenixOmega6719;
    }

    public static byte[] FrostHunterLightSensorForceFusion4241(FrostHunterStorageHyperionRogue1554[] frostHunterStorageHyperionRogue1554Arr, byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (FrostHunterStorageHyperionRogue1554 frostHunterStorageHyperionRogue1554 : frostHunterStorageHyperionRogue1554Arr) {
            i2 += ((((frostHunterStorageHyperionRogue1554.FrostHunterRemoteConfigSpeedSpeed8566 * 2) + 7) & (-8)) / 8) + (frostHunterStorageHyperionRogue1554.FrostHunterLifecycleBlazeGammaElite2889 * 2) + FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterStorageHyperionRogue1554.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterStorageHyperionRogue1554.FrostHunterConstraintSetCloneMasterUltraRogue2633, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + frostHunterStorageHyperionRogue1554.FrostHunterLevelListDrawableFusionDragonHero2232;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, FrostHunterDrawerLayoutUltraStrike3303.FrostHunterFlowMaxDragonHero5809)) {
            int length = frostHunterStorageHyperionRogue1554Arr.length;
            while (i < length) {
                FrostHunterStorageHyperionRogue1554 frostHunterStorageHyperionRogue15542 = frostHunterStorageHyperionRogue1554Arr[i];
                FrostHunterNavigationMasterMegaMax2752(byteArrayOutputStream, frostHunterStorageHyperionRogue15542, FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterStorageHyperionRogue15542.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterStorageHyperionRogue15542.FrostHunterConstraintSetCloneMasterUltraRogue2633, bArr));
                FrostHunterPagingSourceEclipseDelta8255(byteArrayOutputStream, frostHunterStorageHyperionRogue15542);
                i++;
            }
        } else {
            for (FrostHunterStorageHyperionRogue1554 frostHunterStorageHyperionRogue15543 : frostHunterStorageHyperionRogue1554Arr) {
                FrostHunterNavigationMasterMegaMax2752(byteArrayOutputStream, frostHunterStorageHyperionRogue15543, FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterStorageHyperionRogue15543.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterStorageHyperionRogue15543.FrostHunterConstraintSetCloneMasterUltraRogue2633, bArr));
            }
            int length2 = frostHunterStorageHyperionRogue1554Arr.length;
            while (i < length2) {
                FrostHunterPagingSourceEclipseDelta8255(byteArrayOutputStream, frostHunterStorageHyperionRogue1554Arr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    public static FrostHunterBarcodeScannerBlazeMaxPhoenix7448 FrostHunterLintTitanVortexQuantum9911(String str) {
        str.getClass();
        FrostHunterTraceHyperionAuroraNebula9947 FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterBarcodeScannerBlazeMaxPhoenix7448.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761(str, 0);
        if (FrostHunterAlphaAnimationNeoCosmos57612 == null) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        String str2 = (String) ((FrostHunterFocusMeteringActionNebulaSpectra6776) FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterFragmentBetaMegaVortex6025()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = ((String) ((FrostHunterFocusMeteringActionNebulaSpectra6776) FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterFragmentBetaMegaVortex6025()).get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        Matcher matcher = (Matcher) FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterFlowMaxDragonHero5809;
        int i = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRunnableCosmosCelestial4235(matcher.start(), matcher.end()).FrostHunterFlowMaxDragonHero5809;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new FrostHunterBarcodeScannerBlazeMaxPhoenix7448(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            FrostHunterTraceHyperionAuroraNebula9947 FrostHunterAlphaAnimationNeoCosmos57613 = FrostHunterBarcodeScannerBlazeMaxPhoenix7448.FrostHunterBundlePulseFusionHero2475.FrostHunterAlphaAnimationNeoCosmos5761(str, i2);
            if (FrostHunterAlphaAnimationNeoCosmos57613 == null) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(i2) + "\" for: \"" + str + '\"').toString());
            }
            Matcher matcher2 = (Matcher) FrostHunterAlphaAnimationNeoCosmos57613.FrostHunterFlowMaxDragonHero5809;
            FrostHunterPushNotificationDragonVision6411 frostHunterPushNotificationDragonVision6411 = (FrostHunterPushNotificationDragonVision6411) FrostHunterAlphaAnimationNeoCosmos57613.FrostHunterAlertDialogAuroraDelta3200;
            FrostHunterCameraForceNovaXCosmos3808 FrostHunterBundlePulseFusionHero24752 = frostHunterPushNotificationDragonVision6411.FrostHunterBundlePulseFusionHero2475(1);
            String str3 = FrostHunterBundlePulseFusionHero24752 != null ? FrostHunterBundlePulseFusionHero24752.FrostHunterAlphaAnimationNeoCosmos5761 : null;
            if (str3 == null) {
                i = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRunnableCosmosCelestial4235(matcher2.start(), matcher2.end()).FrostHunterFlowMaxDragonHero5809;
            } else {
                FrostHunterCameraForceNovaXCosmos3808 FrostHunterBundlePulseFusionHero24753 = frostHunterPushNotificationDragonVision6411.FrostHunterBundlePulseFusionHero2475(2);
                String str4 = FrostHunterBundlePulseFusionHero24753 != null ? FrostHunterBundlePulseFusionHero24753.FrostHunterAlphaAnimationNeoCosmos5761 : null;
                if (str4 == null) {
                    FrostHunterCameraForceNovaXCosmos3808 FrostHunterBundlePulseFusionHero24754 = frostHunterPushNotificationDragonVision6411.FrostHunterBundlePulseFusionHero2475(3);
                    FrostHunterBundlePulseFusionHero24754.getClass();
                    str4 = FrostHunterBundlePulseFusionHero24754.FrostHunterAlphaAnimationNeoCosmos5761;
                } else if (str4.length() > 0 && FrostHunterVectorDrawableForceMax1351.FrostHunterLightSensorForceFusion4241(str4.charAt(0), '\'', false) && str4.length() > 0 && FrostHunterVectorDrawableForceMax1351.FrostHunterLightSensorForceFusion4241(str4.charAt(str4.length() - 1), '\'', false) && str4.length() > 2) {
                    str4 = str4.substring(1, str4.length() - 1);
                }
                arrayList.add(str3);
                arrayList.add(str4);
                i = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRunnableCosmosCelestial4235(matcher2.start(), matcher2.end()).FrostHunterFlowMaxDragonHero5809;
            }
        }
    }

    public static final FrostHunterKeyframeVisionBetaStrike2074 FrostHunterLooperHyperionForce4133(FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber9213, int i) {
        if (!frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterDialogFragmentTurboPhoenixDragon7627) {
            frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterDialogFragmentTurboPhoenixDragon7627 = true;
            try {
                FrostHunterSurfaceViewNovaHyperNova1698 FrostHunterObjectAnimatorPhoenixSpectraThunder6218 = frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterObjectAnimatorPhoenixSpectraThunder6218();
                FrostHunterCoroutineScopeNebulaCelestial2839 frostHunterCoroutineScopeNebulaCelestial2839 = new FrostHunterCoroutineScopeNebulaCelestial2839(i);
                FrostHunterGroupRogueCosmos5144 focusOwner = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterPermissionInfoAlphaDelta6279(frostHunterServiceInfoTitaniumPrimeCyber9213).getFocusOwner();
                FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber92132 = ((FrostHunterLiveDataScopeBlazeStrike6673) focusOwner).FrostHunterCameraXPixelTurboCosmos9814;
                FrostHunterObjectAnimatorPhoenixSpectraThunder6218.FrostHunterAlertDialogAuroraDelta3200.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterCoroutineScopeNebulaCelestial2839);
                FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber92133 = ((FrostHunterLiveDataScopeBlazeStrike6673) focusOwner).FrostHunterCameraXPixelTurboCosmos9814;
                boolean z = frostHunterCoroutineScopeNebulaCelestial2839.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                FrostHunterKeyframeVisionBetaStrike2074 frostHunterKeyframeVisionBetaStrike2074 = FrostHunterKeyframeVisionBetaStrike2074.FrostHunterFlowMaxDragonHero5809;
                if (z) {
                    FrostHunterAnimatorNeoDragon6655 frostHunterAnimatorNeoDragon6655 = FrostHunterAnimatorNeoDragon6655.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    return frostHunterKeyframeVisionBetaStrike2074;
                }
                if (frostHunterServiceInfoTitaniumPrimeCyber92132 != frostHunterServiceInfoTitaniumPrimeCyber92133 && frostHunterServiceInfoTitaniumPrimeCyber92133 != null) {
                    return FrostHunterAnimatorNeoDragon6655.FrostHunterServiceEliteCelestialThunder1757 == FrostHunterAnimatorNeoDragon6655.FrostHunterBundlePulseFusionHero2475 ? frostHunterKeyframeVisionBetaStrike2074 : FrostHunterKeyframeVisionBetaStrike2074.FrostHunterAlertDialogAuroraDelta3200;
                }
            } finally {
                frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterDialogFragmentTurboPhoenixDragon7627 = false;
            }
        }
        return FrostHunterKeyframeVisionBetaStrike2074.FrostHunterCameraXPixelTurboCosmos9814;
    }

    public static final float FrostHunterLooperThreadBetaHyperionMax1000(FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed4562, boolean z, long j) {
        float FrostHunterBundlePulseFusionHero24752 = FrostHunterFirebaseVortexDeltaBlaze8413.FrostHunterBundlePulseFusionHero2475(FrostHunterRemoteConfigPhantomDelta1739.FrostHunterAlertDialogAuroraDelta3200(FrostHunterMotionLayoutBlazePhoenix5062.FrostHunterServiceEliteCelestialThunder1757(j), FrostHunterMotionLayoutBlazePhoenix5062.FrostHunterConstraintSetCloneMasterUltraRogue2633(j))) / 2.0f;
        return z ? frostHunterDispatchersPrimeHeroSpeed4562.FrostHunterResourcesTitanHyperVision5823(10.0f) + FrostHunterBundlePulseFusionHero24752 : FrostHunterBundlePulseFusionHero24752;
    }

    public static final void FrostHunterMagnetometerFusionTitanium8202(FrostHunterTextureViewElitePixel5268 frostHunterTextureViewElitePixel5268, int i, Object obj) {
        frostHunterTextureViewElitePixel5268.FrostHunterTextViewDragonStormMega4297[(frostHunterTextureViewElitePixel5268.FrostHunterLooperThreadBetaHyperionMax1000 - frostHunterTextureViewElitePixel5268.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223[frostHunterTextureViewElitePixel5268.FrostHunterLintTitanVortexQuantum9911 - 1].FrostHunterConstraintSetCloneMasterUltraRogue2633) + i] = obj;
    }

    public static FrostHunterStorageHyperionRogue1554[] FrostHunterMediaPlayerCelestialBetaTitan3868(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new FrostHunterStorageHyperionRogue1554[0];
        }
        FrostHunterStorageHyperionRogue1554[] frostHunterStorageHyperionRogue1554Arr = new FrostHunterStorageHyperionRogue1554[i];
        for (int i3 = 0; i3 < i; i3++) {
            int FrostHunterFCMDeltaQuantumHero8364 = (int) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(byteArrayInputStream, 2);
            int FrostHunterFCMDeltaQuantumHero83642 = (int) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(byteArrayInputStream, 2);
            frostHunterStorageHyperionRogue1554Arr[i3] = new FrostHunterStorageHyperionRogue1554(str, new String(FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterMagnetometerFusionTitanium8202(byteArrayInputStream, FrostHunterFCMDeltaQuantumHero8364), StandardCharsets.UTF_8), FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(byteArrayInputStream, 4), FrostHunterFCMDeltaQuantumHero83642, (int) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(byteArrayInputStream, 4), (int) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(byteArrayInputStream, 4), new int[FrostHunterFCMDeltaQuantumHero83642], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            FrostHunterStorageHyperionRogue1554 frostHunterStorageHyperionRogue1554 = frostHunterStorageHyperionRogue1554Arr[i4];
            int available = byteArrayInputStream.available();
            int i5 = frostHunterStorageHyperionRogue1554.FrostHunterLevelListDrawableFusionDragonHero2232;
            int i6 = frostHunterStorageHyperionRogue1554.FrostHunterRemoteConfigSpeedSpeed8566;
            TreeMap treeMap = frostHunterStorageHyperionRogue1554.FrostHunterFlowMaxDragonHero5809;
            int i7 = available - i5;
            int i8 = i2;
            while (byteArrayInputStream.available() > i7) {
                i8 += (int) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i8), 1);
                int FrostHunterFCMDeltaQuantumHero83643 = (int) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(byteArrayInputStream, 2);
                while (FrostHunterFCMDeltaQuantumHero83643 > 0) {
                    FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(byteArrayInputStream, 2);
                    int FrostHunterFCMDeltaQuantumHero83644 = (int) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(byteArrayInputStream, 1);
                    if (FrostHunterFCMDeltaQuantumHero83644 != 6 && FrostHunterFCMDeltaQuantumHero83644 != 7) {
                        while (FrostHunterFCMDeltaQuantumHero83644 > 0) {
                            FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(byteArrayInputStream, 1);
                            int i9 = i2;
                            int i10 = i4;
                            for (int FrostHunterFCMDeltaQuantumHero83645 = (int) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(byteArrayInputStream, 1); FrostHunterFCMDeltaQuantumHero83645 > 0; FrostHunterFCMDeltaQuantumHero83645--) {
                                FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(byteArrayInputStream, 2);
                            }
                            FrostHunterFCMDeltaQuantumHero83644--;
                            i2 = i9;
                            i4 = i10;
                        }
                    }
                    FrostHunterFCMDeltaQuantumHero83643--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i11 = i2;
            int i12 = i4;
            if (byteArrayInputStream.available() != i7) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Read too much data during profile line parse");
                return null;
            }
            frostHunterStorageHyperionRogue1554.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterEditTextPulseHyperion1262(byteArrayInputStream, frostHunterStorageHyperionRogue1554.FrostHunterLifecycleBlazeGammaElite2889);
            BitSet valueOf = BitSet.valueOf(FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterMagnetometerFusionTitanium8202(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i6; i13++) {
                int i14 = valueOf.get(i13) ? 2 : i11;
                if (valueOf.get(i13 + i6)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | num.intValue()));
                }
            }
            i4 = i12 + 1;
            i2 = i11;
        }
        return frostHunterStorageHyperionRogue1554Arr;
    }

    public static final FrostHunterKeyframeVisionBetaStrike2074 FrostHunterMeteringPointBetaCyber9571(FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber9213, int i) {
        FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno9637;
        FrostHunterColorStateListOmegaHero9965 frostHunterColorStateListOmegaHero9965;
        int ordinal = frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterBannerAdNebulaMasterBeta4389().ordinal();
        FrostHunterKeyframeVisionBetaStrike2074 frostHunterKeyframeVisionBetaStrike2074 = FrostHunterKeyframeVisionBetaStrike2074.FrostHunterCameraXPixelTurboCosmos9814;
        if (ordinal != 0) {
            if (ordinal == 1) {
                FrostHunterServiceInfoTitaniumPrimeCyber9213 FrostHunterMeteringPointMegaCyber7955 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMeteringPointMegaCyber7955(frostHunterServiceInfoTitaniumPrimeCyber9213);
                if (FrostHunterMeteringPointMegaCyber7955 != null) {
                    return FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterMeteringPointMegaCyber7955, i);
                }
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("ActiveParent with no focused child");
                return null;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                    return null;
                }
                if (!frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLooperThreadBetaHyperionMax1000) {
                    FrostHunterAudioManagerThunderTitan4297.FrostHunterConstraintSetCloneMasterUltraRogue2633("visitAncestors called on an unattached node");
                }
                FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96372 = frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterFragmentBetaMegaVortex6025;
                FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 FrostHunterRewardedAdMasterStrike9463 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterRewardedAdMasterStrike9463(frostHunterServiceInfoTitaniumPrimeCyber9213);
                loop0: while (true) {
                    if (FrostHunterRewardedAdMasterStrike9463 == null) {
                        frostHunterGradientDrawablePulseDragonInferno9637 = null;
                        break;
                    }
                    if ((((FrostHunterGradientDrawablePulseDragonInferno9637) FrostHunterRewardedAdMasterStrike9463.FrostHunterPagingDataTurboTitanium7332.FrostHunterAlertDialogAuroraDelta3200).FrostHunterKeyframeGammaGamma1197 & 1024) != 0) {
                        while (frostHunterGradientDrawablePulseDragonInferno96372 != null) {
                            if ((frostHunterGradientDrawablePulseDragonInferno96372.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0) {
                                frostHunterGradientDrawablePulseDragonInferno9637 = frostHunterGradientDrawablePulseDragonInferno96372;
                                FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike7090 = null;
                                while (frostHunterGradientDrawablePulseDragonInferno9637 != null) {
                                    if (frostHunterGradientDrawablePulseDragonInferno9637 instanceof FrostHunterServiceInfoTitaniumPrimeCyber9213) {
                                        break loop0;
                                    }
                                    if ((frostHunterGradientDrawablePulseDragonInferno9637.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0 && (frostHunterGradientDrawablePulseDragonInferno9637 instanceof FrostHunterToolbarVortexMaster1971)) {
                                        int i2 = 0;
                                        for (FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96373 = ((FrostHunterToolbarVortexMaster1971) frostHunterGradientDrawablePulseDragonInferno9637).FrostHunterBitmapTurboDeltaNebula8743; frostHunterGradientDrawablePulseDragonInferno96373 != null; frostHunterGradientDrawablePulseDragonInferno96373 = frostHunterGradientDrawablePulseDragonInferno96373.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                                            if ((frostHunterGradientDrawablePulseDragonInferno96373.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    frostHunterGradientDrawablePulseDragonInferno9637 = frostHunterGradientDrawablePulseDragonInferno96373;
                                                } else {
                                                    if (frostHunterObjectAnimatorNeoStrike7090 == null) {
                                                        frostHunterObjectAnimatorNeoStrike7090 = new FrostHunterObjectAnimatorNeoStrike7090(new FrostHunterGradientDrawablePulseDragonInferno9637[16]);
                                                    }
                                                    if (frostHunterGradientDrawablePulseDragonInferno9637 != null) {
                                                        frostHunterObjectAnimatorNeoStrike7090.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno9637);
                                                        frostHunterGradientDrawablePulseDragonInferno9637 = null;
                                                    }
                                                    frostHunterObjectAnimatorNeoStrike7090.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno96373);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    frostHunterGradientDrawablePulseDragonInferno9637 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterScaleAnimationStrikeSpark5059(frostHunterObjectAnimatorNeoStrike7090);
                                }
                            }
                            frostHunterGradientDrawablePulseDragonInferno96372 = frostHunterGradientDrawablePulseDragonInferno96372.FrostHunterFragmentBetaMegaVortex6025;
                        }
                    }
                    FrostHunterRewardedAdMasterStrike9463 = FrostHunterRewardedAdMasterStrike9463.FrostHunterResourcesTitanHyperVision5823();
                    frostHunterGradientDrawablePulseDragonInferno96372 = (FrostHunterRewardedAdMasterStrike9463 == null || (frostHunterColorStateListOmegaHero9965 = FrostHunterRewardedAdMasterStrike9463.FrostHunterPagingDataTurboTitanium7332) == null) ? null : (FrostHunterOnItemClickListenerBetaPhantom9631) frostHunterColorStateListOmegaHero9965.FrostHunterFlowMaxDragonHero5809;
                }
                FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber92132 = (FrostHunterServiceInfoTitaniumPrimeCyber9213) frostHunterGradientDrawablePulseDragonInferno9637;
                if (frostHunterServiceInfoTitaniumPrimeCyber92132 == null) {
                    return frostHunterKeyframeVisionBetaStrike2074;
                }
                int ordinal2 = frostHunterServiceInfoTitaniumPrimeCyber92132.FrostHunterBannerAdNebulaMasterBeta4389().ordinal();
                if (ordinal2 == 0) {
                    return FrostHunterLooperHyperionForce4133(frostHunterServiceInfoTitaniumPrimeCyber92132, i);
                }
                if (ordinal2 == 1) {
                    return FrostHunterMeteringPointBetaCyber9571(frostHunterServiceInfoTitaniumPrimeCyber92132, i);
                }
                if (ordinal2 == 2) {
                    return FrostHunterKeyframeVisionBetaStrike2074.FrostHunterFlowMaxDragonHero5809;
                }
                if (ordinal2 != 3) {
                    FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                    return null;
                }
                FrostHunterKeyframeVisionBetaStrike2074 FrostHunterMeteringPointBetaCyber9571 = FrostHunterMeteringPointBetaCyber9571(frostHunterServiceInfoTitaniumPrimeCyber92132, i);
                FrostHunterKeyframeVisionBetaStrike2074 frostHunterKeyframeVisionBetaStrike20742 = FrostHunterMeteringPointBetaCyber9571 != frostHunterKeyframeVisionBetaStrike2074 ? FrostHunterMeteringPointBetaCyber9571 : null;
                return frostHunterKeyframeVisionBetaStrike20742 == null ? FrostHunterLooperHyperionForce4133(frostHunterServiceInfoTitaniumPrimeCyber92132, i) : frostHunterKeyframeVisionBetaStrike20742;
            }
        }
        return frostHunterKeyframeVisionBetaStrike2074;
    }

    public static FrostHunterStorageHyperionRogue1554[] FrostHunterMeteringPointMegaCyber7955(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, FrostHunterStorageHyperionRogue1554[] frostHunterStorageHyperionRogue1554Arr) {
        FrostHunterStorageHyperionRogue1554 frostHunterStorageHyperionRogue1554;
        if (byteArrayInputStream.available() == 0) {
            return new FrostHunterStorageHyperionRogue1554[0];
        }
        if (i != frostHunterStorageHyperionRogue1554Arr.length) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(byteArrayInputStream, 2);
            String str = new String(FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterMagnetometerFusionTitanium8202(byteArrayInputStream, (int) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long FrostHunterFCMDeltaQuantumHero8364 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(byteArrayInputStream, 4);
            int FrostHunterFCMDeltaQuantumHero83642 = (int) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(byteArrayInputStream, 2);
            if (frostHunterStorageHyperionRogue1554Arr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i3 = 0; i3 < frostHunterStorageHyperionRogue1554Arr.length; i3++) {
                    if (frostHunterStorageHyperionRogue1554Arr[i3].FrostHunterConstraintSetCloneMasterUltraRogue2633.equals(substring)) {
                        frostHunterStorageHyperionRogue1554 = frostHunterStorageHyperionRogue1554Arr[i3];
                        break;
                    }
                }
            }
            frostHunterStorageHyperionRogue1554 = null;
            if (frostHunterStorageHyperionRogue1554 == null) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Missing profile key: ".concat(str));
                return null;
            }
            frostHunterStorageHyperionRogue1554.FrostHunterServiceEliteCelestialThunder1757 = FrostHunterFCMDeltaQuantumHero8364;
            int[] FrostHunterEditTextPulseHyperion1262 = FrostHunterEditTextPulseHyperion1262(byteArrayInputStream, FrostHunterFCMDeltaQuantumHero83642);
            if (Arrays.equals(bArr, FrostHunterDrawerLayoutUltraStrike3303.FrostHunterKeyframeGammaGamma1197)) {
                frostHunterStorageHyperionRogue1554.FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterFCMDeltaQuantumHero83642;
                frostHunterStorageHyperionRogue1554.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterEditTextPulseHyperion1262;
            }
        }
        return frostHunterStorageHyperionRogue1554Arr;
    }

    public static final void FrostHunterMotionSceneAuroraMega2271(FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615, Throwable th) {
        Throwable runtimeException;
        Iterator it = FrostHunterAlphaAnimationStormPhoenix9023.FrostHunterAlphaAnimationNeoCosmos5761.iterator();
        while (it.hasNext()) {
            try {
                ((FrostHunterWithContextAlphaStorm5781) it.next()).FrostHunterMeteringPointBetaCyber9571(frostHunterCountDownTimerRogueTitan5615, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    FrostHunterTransitionGammaTitanSpeed7178.FrostHunterRemoteConfigSpeedSpeed8566(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            FrostHunterTransitionGammaTitanSpeed7178.FrostHunterRemoteConfigSpeedSpeed8566(th, new FrostHunterFlowStrikeMasterAlpha1270(frostHunterCountDownTimerRogueTitan5615));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static void FrostHunterNavigationMasterMegaMax2752(ByteArrayOutputStream byteArrayOutputStream, FrostHunterStorageHyperionRogue1554 frostHunterStorageHyperionRogue1554, String str) {
        Charset charset = StandardCharsets.UTF_8;
        FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream, str.getBytes(charset).length);
        FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream, frostHunterStorageHyperionRogue1554.FrostHunterLifecycleBlazeGammaElite2889);
        FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream, frostHunterStorageHyperionRogue1554.FrostHunterLevelListDrawableFusionDragonHero2232, 4);
        FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream, frostHunterStorageHyperionRogue1554.FrostHunterBundlePulseFusionHero2475, 4);
        FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorStateListInflaterNovaQuantum4229(byteArrayOutputStream, frostHunterStorageHyperionRogue1554.FrostHunterRemoteConfigSpeedSpeed8566, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static final void FrostHunterPagingDataTurboTitanium7332(FrostHunterTextureViewElitePixel5268 frostHunterTextureViewElitePixel5268, int i, Object obj, int i2, Object obj2) {
        int i3 = frostHunterTextureViewElitePixel5268.FrostHunterLooperThreadBetaHyperionMax1000 - frostHunterTextureViewElitePixel5268.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223[frostHunterTextureViewElitePixel5268.FrostHunterLintTitanVortexQuantum9911 - 1].FrostHunterConstraintSetCloneMasterUltraRogue2633;
        Object[] objArr = frostHunterTextureViewElitePixel5268.FrostHunterTextViewDragonStormMega4297;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static void FrostHunterPagingSourceEclipseDelta8255(ByteArrayOutputStream byteArrayOutputStream, FrostHunterStorageHyperionRogue1554 frostHunterStorageHyperionRogue1554) {
        FrostHunterRewardedAdSpectraElite8288(byteArrayOutputStream, frostHunterStorageHyperionRogue1554);
        int i = frostHunterStorageHyperionRogue1554.FrostHunterRemoteConfigSpeedSpeed8566;
        int[] iArr = frostHunterStorageHyperionRogue1554.FrostHunterCameraXPixelTurboCosmos9814;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : frostHunterStorageHyperionRogue1554.FrostHunterFlowMaxDragonHero5809.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i5 = intValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i6 = intValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final Object FrostHunterPermissionInfoAlphaDelta6279(Object obj) {
        FrostHunterObjectAnimatorOmegaVision3647 frostHunterObjectAnimatorOmegaVision3647;
        FrostHunterGroupCelestialCosmos7765 frostHunterGroupCelestialCosmos7765 = obj instanceof FrostHunterGroupCelestialCosmos7765 ? (FrostHunterGroupCelestialCosmos7765) obj : null;
        return (frostHunterGroupCelestialCosmos7765 == null || (frostHunterObjectAnimatorOmegaVision3647 = frostHunterGroupCelestialCosmos7765.FrostHunterAlphaAnimationNeoCosmos5761) == null) ? obj : frostHunterObjectAnimatorOmegaVision3647;
    }

    public static final String FrostHunterR8MasterNebulaSpark7247(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static void FrostHunterRemoteConfigThunderShadow4435(FrostHunterInsetDrawablePulseQuantum5539 frostHunterInsetDrawablePulseQuantum5539, FrostHunterConstraintSetBlazeSpectra9155 frostHunterConstraintSetBlazeSpectra9155) {
        frostHunterConstraintSetBlazeSpectra9155.FrostHunterServiceEliteCelestialThunder1757(frostHunterInsetDrawablePulseQuantum5539.FrostHunterAlphaAnimationNeoCosmos5761);
        frostHunterConstraintSetBlazeSpectra9155.writeByte(10);
        frostHunterConstraintSetBlazeSpectra9155.FrostHunterServiceEliteCelestialThunder1757(frostHunterInsetDrawablePulseQuantum5539.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        frostHunterConstraintSetBlazeSpectra9155.writeByte(10);
        frostHunterConstraintSetBlazeSpectra9155.FrostHunterServiceEliteCelestialThunder1757(frostHunterInsetDrawablePulseQuantum5539.FrostHunterBundlePulseFusionHero2475);
        frostHunterConstraintSetBlazeSpectra9155.writeByte(10);
        Set<Map.Entry> entrySet = frostHunterInsetDrawablePulseQuantum5539.FrostHunterServiceEliteCelestialThunder1757.FrostHunterAlphaAnimationNeoCosmos5761.entrySet();
        Iterator it = entrySet.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        frostHunterConstraintSetBlazeSpectra9155.FrostHunterServiceEliteCelestialThunder1757(i);
        frostHunterConstraintSetBlazeSpectra9155.writeByte(10);
        for (Map.Entry entry : entrySet) {
            for (String str : (List) entry.getValue()) {
                frostHunterConstraintSetBlazeSpectra9155.FrostHunterEditTextPulseHyperion1262((String) entry.getKey());
                frostHunterConstraintSetBlazeSpectra9155.FrostHunterEditTextPulseHyperion1262(":");
                frostHunterConstraintSetBlazeSpectra9155.FrostHunterEditTextPulseHyperion1262(str);
                frostHunterConstraintSetBlazeSpectra9155.writeByte(10);
            }
        }
    }

    public static final float FrostHunterResourcesTitanHyperVision5823(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        FrostHunterAdapterHeroTitan7326 frostHunterAdapterHeroTitan7326 = FrostHunterAnimatedVectorDrawableUltraPulse9884.FrostHunterAlphaAnimationNeoCosmos5761;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? FrostHunterGradlePluginHeroForceNebula7284.FrostHunterAlphaAnimationNeoCosmos5761[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static final boolean FrostHunterRewardedAdMasterStrike9463(Throwable th, FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595) {
        Collection asList;
        Object invoke;
        th.getClass();
        Integer num = FrostHunterButtonDeltaThunderOlympian7332.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterScaleAnimationPhantomAuroraGamma2331 frostHunterScaleAnimationPhantomAuroraGamma2331 = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            asList = Arrays.asList(suppressed);
            asList.getClass();
        } else {
            Method method = FrostHunterSurfaceViewOmegaCyberAurora4031.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (method == null || (invoke = method.invoke(th, null)) == null) {
                asList = FrostHunterAssetManagerForceNebulaNebula4990.FrostHunterCameraXPixelTurboCosmos9814;
            } else {
                asList = Arrays.asList((Throwable[]) invoke);
                asList.getClass();
            }
        }
        boolean z = false;
        if (!asList.isEmpty()) {
            Iterator it = asList.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof FrostHunterScaleAnimationPhantomAuroraGamma2331) {
                    return false;
                }
            }
        }
        try {
            List list = (List) frostHunterNotificationGammaBlazePhoenix7595.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            boolean isEmpty = list.isEmpty();
            z = !isEmpty;
            if (!isEmpty) {
                frostHunterScaleAnimationPhantomAuroraGamma2331 = new FrostHunterScaleAnimationPhantomAuroraGamma2331(list);
            }
        } catch (Throwable th2) {
            frostHunterScaleAnimationPhantomAuroraGamma2331 = th2;
        }
        if (frostHunterScaleAnimationPhantomAuroraGamma2331 != null) {
            FrostHunterTransitionGammaTitanSpeed7178.FrostHunterRemoteConfigSpeedSpeed8566(th, frostHunterScaleAnimationPhantomAuroraGamma2331);
        }
        return z;
    }

    public static void FrostHunterRewardedAdSpectraElite8288(ByteArrayOutputStream byteArrayOutputStream, FrostHunterStorageHyperionRogue1554 frostHunterStorageHyperionRogue1554) {
        int i = 0;
        for (Map.Entry entry : frostHunterStorageHyperionRogue1554.FrostHunterFlowMaxDragonHero5809.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream, intValue - i);
                FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterColorDrawableLegendPhoenixVision7927(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }

    public static final FrostHunterConstraintSetPixelSpectra5306 FrostHunterScaleAnimationStrikeSpark5059(Context context) {
        FrostHunterResourceHyperionCelestial5792 frostHunterResourceHyperionCelestial5792 = FrostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_0);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_10);
        FrostHunterStateCelestialNovaPixel8414(frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_600), 98.0f);
        FrostHunterStateCelestialNovaPixel8414(frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_600), 96.0f);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_50);
        FrostHunterStateCelestialNovaPixel8414(frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_600), 94.0f);
        FrostHunterStateCelestialNovaPixel8414(frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_600), 92.0f);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_100);
        FrostHunterStateCelestialNovaPixel8414(frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_600), 87.0f);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_200);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_300);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_400);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_500);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_600);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_700);
        FrostHunterStateCelestialNovaPixel8414(frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_600), 24.0f);
        FrostHunterStateCelestialNovaPixel8414(frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_600), 22.0f);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_800);
        FrostHunterStateCelestialNovaPixel8414(frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_600), 17.0f);
        FrostHunterStateCelestialNovaPixel8414(frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_600), 12.0f);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_900);
        FrostHunterStateCelestialNovaPixel8414(frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_600), 6.0f);
        FrostHunterStateCelestialNovaPixel8414(frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_600), 4.0f);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral1_1000);
        long FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_0);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_10);
        long FrostHunterStateCelestialNovaPixel8414 = FrostHunterStateCelestialNovaPixel8414(frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_600), 98.0f);
        long FrostHunterStateCelestialNovaPixel84142 = FrostHunterStateCelestialNovaPixel8414(frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_600), 96.0f);
        long FrostHunterAlphaAnimationNeoCosmos57613 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_50);
        long FrostHunterStateCelestialNovaPixel84143 = FrostHunterStateCelestialNovaPixel8414(frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_600), 94.0f);
        long FrostHunterStateCelestialNovaPixel84144 = FrostHunterStateCelestialNovaPixel8414(frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_600), 92.0f);
        long FrostHunterAlphaAnimationNeoCosmos57614 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_100);
        long FrostHunterStateCelestialNovaPixel84145 = FrostHunterStateCelestialNovaPixel8414(frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_600), 87.0f);
        long FrostHunterAlphaAnimationNeoCosmos57615 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_200);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_300);
        long FrostHunterAlphaAnimationNeoCosmos57616 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_400);
        long FrostHunterAlphaAnimationNeoCosmos57617 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_500);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_600);
        long FrostHunterAlphaAnimationNeoCosmos57618 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_700);
        long FrostHunterStateCelestialNovaPixel84146 = FrostHunterStateCelestialNovaPixel8414(frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_600), 24.0f);
        long FrostHunterStateCelestialNovaPixel84147 = FrostHunterStateCelestialNovaPixel8414(frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_600), 22.0f);
        long FrostHunterAlphaAnimationNeoCosmos57619 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_800);
        long FrostHunterStateCelestialNovaPixel84148 = FrostHunterStateCelestialNovaPixel8414(frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_600), 17.0f);
        long FrostHunterStateCelestialNovaPixel84149 = FrostHunterStateCelestialNovaPixel8414(frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_600), 12.0f);
        long FrostHunterAlphaAnimationNeoCosmos576110 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_900);
        long FrostHunterStateCelestialNovaPixel841410 = FrostHunterStateCelestialNovaPixel8414(frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_600), 6.0f);
        long FrostHunterStateCelestialNovaPixel841411 = FrostHunterStateCelestialNovaPixel8414(frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_600), 4.0f);
        long FrostHunterAlphaAnimationNeoCosmos576111 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_neutral2_1000);
        long FrostHunterAlphaAnimationNeoCosmos576112 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent1_0);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent1_10);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent1_50);
        long FrostHunterAlphaAnimationNeoCosmos576113 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent1_100);
        long FrostHunterAlphaAnimationNeoCosmos576114 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent1_200);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent1_300);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent1_400);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent1_500);
        long FrostHunterAlphaAnimationNeoCosmos576115 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent1_600);
        long FrostHunterAlphaAnimationNeoCosmos576116 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent1_700);
        long FrostHunterAlphaAnimationNeoCosmos576117 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent1_800);
        long FrostHunterAlphaAnimationNeoCosmos576118 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent1_900);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent1_1000);
        long FrostHunterAlphaAnimationNeoCosmos576119 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent2_0);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent2_10);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent2_50);
        long FrostHunterAlphaAnimationNeoCosmos576120 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent2_100);
        long FrostHunterAlphaAnimationNeoCosmos576121 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent2_200);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent2_300);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent2_400);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent2_500);
        long FrostHunterAlphaAnimationNeoCosmos576122 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent2_600);
        long FrostHunterAlphaAnimationNeoCosmos576123 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent2_700);
        long FrostHunterAlphaAnimationNeoCosmos576124 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent2_800);
        long FrostHunterAlphaAnimationNeoCosmos576125 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent2_900);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent2_1000);
        long FrostHunterAlphaAnimationNeoCosmos576126 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent3_0);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent3_10);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent3_50);
        long FrostHunterAlphaAnimationNeoCosmos576127 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent3_100);
        long FrostHunterAlphaAnimationNeoCosmos576128 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent3_200);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent3_300);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent3_400);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent3_500);
        long FrostHunterAlphaAnimationNeoCosmos576129 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent3_600);
        long FrostHunterAlphaAnimationNeoCosmos576130 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent3_700);
        long FrostHunterAlphaAnimationNeoCosmos576131 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent3_800);
        long FrostHunterAlphaAnimationNeoCosmos576132 = frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent3_900);
        frostHunterResourceHyperionCelestial5792.FrostHunterAlphaAnimationNeoCosmos5761(context, R.color.system_accent3_1000);
        return new FrostHunterConstraintSetPixelSpectra5306(FrostHunterAlphaAnimationNeoCosmos57612, FrostHunterStateCelestialNovaPixel8414, FrostHunterStateCelestialNovaPixel84142, FrostHunterAlphaAnimationNeoCosmos57613, FrostHunterStateCelestialNovaPixel84143, FrostHunterStateCelestialNovaPixel84144, FrostHunterAlphaAnimationNeoCosmos57614, FrostHunterStateCelestialNovaPixel84145, FrostHunterAlphaAnimationNeoCosmos57615, FrostHunterAlphaAnimationNeoCosmos57616, FrostHunterAlphaAnimationNeoCosmos57617, FrostHunterAlphaAnimationNeoCosmos57618, FrostHunterStateCelestialNovaPixel84146, FrostHunterStateCelestialNovaPixel84147, FrostHunterAlphaAnimationNeoCosmos57619, FrostHunterStateCelestialNovaPixel84148, FrostHunterStateCelestialNovaPixel84149, FrostHunterAlphaAnimationNeoCosmos576110, FrostHunterStateCelestialNovaPixel841410, FrostHunterStateCelestialNovaPixel841411, FrostHunterAlphaAnimationNeoCosmos576111, FrostHunterAlphaAnimationNeoCosmos576112, FrostHunterAlphaAnimationNeoCosmos576113, FrostHunterAlphaAnimationNeoCosmos576114, FrostHunterAlphaAnimationNeoCosmos576115, FrostHunterAlphaAnimationNeoCosmos576116, FrostHunterAlphaAnimationNeoCosmos576117, FrostHunterAlphaAnimationNeoCosmos576118, FrostHunterAlphaAnimationNeoCosmos576119, FrostHunterAlphaAnimationNeoCosmos576120, FrostHunterAlphaAnimationNeoCosmos576121, FrostHunterAlphaAnimationNeoCosmos576122, FrostHunterAlphaAnimationNeoCosmos576123, FrostHunterAlphaAnimationNeoCosmos576124, FrostHunterAlphaAnimationNeoCosmos576125, FrostHunterAlphaAnimationNeoCosmos576126, FrostHunterAlphaAnimationNeoCosmos576127, FrostHunterAlphaAnimationNeoCosmos576128, FrostHunterAlphaAnimationNeoCosmos576129, FrostHunterAlphaAnimationNeoCosmos576130, FrostHunterAlphaAnimationNeoCosmos576131, FrostHunterAlphaAnimationNeoCosmos576132);
    }

    public static long[] FrostHunterServiceConnectionTurboPhoenixOmega6719(long[]... jArr) {
        long j = 0;
        for (long[] jArr2 : jArr) {
            j += jArr2.length;
        }
        int i = (int) j;
        FrostHunterCanvasInfernoVortex4700.FrostHunterLooperThreadBetaHyperionMax1000(j == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j);
        long[] jArr3 = new long[i];
        int i2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i2, jArr4.length);
            i2 += jArr4.length;
        }
        return jArr3;
    }

    public static final void FrostHunterServiceEliteCelestialThunder1757(FrostHunterCombineBlazeLegendGamma9228 frostHunterCombineBlazeLegendGamma9228, final long j, final float f, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, final int i) {
        final FrostHunterCombineBlazeLegendGamma9228 frostHunterCombineBlazeLegendGamma92282;
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(727099880);
        int i2 = i | 6;
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i2 & 1, (i2 & 147) != 146)) {
            FrostHunterChipGroupThunderDragon5019 FrostHunterFragmentBetaMegaVortex60252 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterFragmentBetaMegaVortex6025(FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdSpectraElite8288("radial_glow", frostHunterDialogFragmentPhantomEclipse8068), 0.85f, 1.1f, new FrostHunterBindingAdapterCelestialSolar9832(FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterPushNotificationStormTitanGamma8999(3000, 6, null)), "pulse", frostHunterDialogFragmentPhantomEclipse8068, 29112);
            FrostHunterAnimatorRoguePulse2723 frostHunterAnimatorRoguePulse2723 = FrostHunterAnimatorRoguePulse2723.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterServiceEliteCelestialThunder17572 = androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterServiceEliteCelestialThunder1757(frostHunterAnimatorRoguePulse2723, f);
            boolean FrostHunterLevelListDrawableFusionDragonHero22322 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterFragmentBetaMegaVortex60252);
            Object FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            Object obj = FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761;
            if (FrostHunterLevelListDrawableFusionDragonHero22322 || FrostHunterMagnetometerFusionTitanium8202 == obj) {
                FrostHunterMagnetometerFusionTitanium8202 = new FrostHunterFirestoreMasterHero4694(FrostHunterFragmentBetaMegaVortex60252, 3);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium8202);
            }
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterAlphaAnimationNeoCosmos57612 = androidx.compose.ui.graphics.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterServiceEliteCelestialThunder17572, (FrostHunterCombineLegendMegaPrime5473) FrostHunterMagnetometerFusionTitanium8202);
            Object FrostHunterMagnetometerFusionTitanium82022 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterMagnetometerFusionTitanium82022 == obj) {
                FrostHunterMagnetometerFusionTitanium82022 = new FrostHunterCombineLegendMegaPrime5473() { // from class: android.content.Context.FrostHunterCardViewDeltaVortex1829
                    @Override // android.content.Context.FrostHunterCombineLegendMegaPrime5473
                    public final Object FrostHunterAlphaAnimationNeoCosmos5761(Object obj2) {
                        FrostHunterMotionLayoutThunderMasterOmega3195 frostHunterMotionLayoutThunderMasterOmega3195 = (FrostHunterMotionLayoutThunderMasterOmega3195) obj2;
                        frostHunterMotionLayoutThunderMasterOmega3195.getClass();
                        float FrostHunterBundlePulseFusionHero24752 = FrostHunterMotionLayoutBlazePhoenix5062.FrostHunterBundlePulseFusionHero2475(frostHunterMotionLayoutThunderMasterOmega3195.FrostHunterBundlePulseFusionHero2475()) / 2.0f;
                        long j2 = j;
                        frostHunterMotionLayoutThunderMasterOmega3195.FrostHunterCameraXTurboCelestialHero5430(new FrostHunterDatabaseUltraAuroraInferno7155(FrostHunterCardViewHyperionAurora3829.FrostHunterFCMDeltaQuantumHero8364(new FrostHunterViewModelScopeLegendAurora8732(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j2, 0.3f)), new FrostHunterViewModelScopeLegendAurora8732(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j2, 0.1f)), new FrostHunterViewModelScopeLegendAurora8732(FrostHunterViewModelScopeLegendAurora8732.FrostHunterLevelListDrawableFusionDragonHero2232)), frostHunterMotionLayoutThunderMasterOmega3195.FrostHunterR8MasterNebulaSpark7247(), FrostHunterBundlePulseFusionHero24752), FrostHunterBundlePulseFusionHero24752, frostHunterMotionLayoutThunderMasterOmega3195.FrostHunterR8MasterNebulaSpark7247(), FrostHunterProximitySensorVortexEclipseStrike8378.FrostHunterCameraXTurboCelestialHero5430);
                        return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                    }
                };
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium82022);
            }
            FrostHunterCanvasInfernoVortex4700.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterAlphaAnimationNeoCosmos57612, (FrostHunterCombineLegendMegaPrime5473) FrostHunterMagnetometerFusionTitanium82022, frostHunterDialogFragmentPhantomEclipse8068, 0);
            frostHunterCombineBlazeLegendGamma92282 = frostHunterAnimatorRoguePulse2723;
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
            frostHunterCombineBlazeLegendGamma92282 = frostHunterCombineBlazeLegendGamma9228;
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterFontFamilyNeoBetaEpic8574(j, f, i) { // from class: android.content.Context.FrostHunterLifecyclePulseUltraCelestial8431
                public final /* synthetic */ float FrostHunterAlertDialogAuroraDelta3200;
                public final /* synthetic */ long FrostHunterFlowMaxDragonHero5809;

                @Override // android.content.Context.FrostHunterFontFamilyNeoBetaEpic8574
                public final Object FrostHunterCameraXPixelTurboCosmos9814(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int FrostHunterLiveDataBetaLegend3442 = FrostHunterCanvasInfernoVortex4700.FrostHunterLiveDataBetaLegend3442(433);
                    FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterServiceEliteCelestialThunder1757(FrostHunterCombineBlazeLegendGamma9228.this, this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterAlertDialogAuroraDelta3200, (FrostHunterDialogFragmentPhantomEclipse8068) obj2, FrostHunterLiveDataBetaLegend3442);
                    return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean FrostHunterServiceInfoHyperionSparkMax9966(FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber9213) {
        FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike7090;
        FrostHunterColorStateListOmegaHero9965 frostHunterColorStateListOmegaHero9965;
        char c;
        FrostHunterColorStateListOmegaHero9965 frostHunterColorStateListOmegaHero99652;
        FrostHunterGroupRogueCosmos5144 focusOwner = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterPermissionInfoAlphaDelta6279(frostHunterServiceInfoTitaniumPrimeCyber9213).getFocusOwner();
        FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber92132 = ((FrostHunterLiveDataScopeBlazeStrike6673) focusOwner).FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterRewardedAdAuroraDeltaFusion7394 FrostHunterBannerAdNebulaMasterBeta4389 = frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterBannerAdNebulaMasterBeta4389();
        if (frostHunterServiceInfoTitaniumPrimeCyber92132 == frostHunterServiceInfoTitaniumPrimeCyber9213) {
            frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402(FrostHunterBannerAdNebulaMasterBeta4389, FrostHunterBannerAdNebulaMasterBeta4389);
            return true;
        }
        int i = 0;
        if (frostHunterServiceInfoTitaniumPrimeCyber92132 == null && !((FrostHunterLiveDataScopeBlazeStrike6673) FrostHunterRemoteConfigPhantomDelta1739.FrostHunterPermissionInfoAlphaDelta6279(frostHunterServiceInfoTitaniumPrimeCyber9213).getFocusOwner()).FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterViewPhantomNeo1634()) {
            return false;
        }
        char c2 = 16;
        if (frostHunterServiceInfoTitaniumPrimeCyber92132 != null) {
            frostHunterObjectAnimatorNeoStrike7090 = new FrostHunterObjectAnimatorNeoStrike7090(new FrostHunterServiceInfoTitaniumPrimeCyber9213[16]);
            if (!frostHunterServiceInfoTitaniumPrimeCyber92132.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLooperThreadBetaHyperionMax1000) {
                FrostHunterAudioManagerThunderTitan4297.FrostHunterConstraintSetCloneMasterUltraRogue2633("visitAncestors called on an unattached node");
            }
            FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno9637 = frostHunterServiceInfoTitaniumPrimeCyber92132.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterFragmentBetaMegaVortex6025;
            FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 FrostHunterRewardedAdMasterStrike9463 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterRewardedAdMasterStrike9463(frostHunterServiceInfoTitaniumPrimeCyber92132);
            while (FrostHunterRewardedAdMasterStrike9463 != null) {
                if ((((FrostHunterGradientDrawablePulseDragonInferno9637) FrostHunterRewardedAdMasterStrike9463.FrostHunterPagingDataTurboTitanium7332.FrostHunterAlertDialogAuroraDelta3200).FrostHunterKeyframeGammaGamma1197 & 1024) != 0) {
                    while (frostHunterGradientDrawablePulseDragonInferno9637 != null) {
                        if ((frostHunterGradientDrawablePulseDragonInferno9637.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0) {
                            FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96372 = frostHunterGradientDrawablePulseDragonInferno9637;
                            FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike70902 = null;
                            while (frostHunterGradientDrawablePulseDragonInferno96372 != null) {
                                if (frostHunterGradientDrawablePulseDragonInferno96372 instanceof FrostHunterServiceInfoTitaniumPrimeCyber9213) {
                                    frostHunterObjectAnimatorNeoStrike7090.FrostHunterConstraintSetCloneMasterUltraRogue2633((FrostHunterServiceInfoTitaniumPrimeCyber9213) frostHunterGradientDrawablePulseDragonInferno96372);
                                } else if ((frostHunterGradientDrawablePulseDragonInferno96372.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0 && (frostHunterGradientDrawablePulseDragonInferno96372 instanceof FrostHunterToolbarVortexMaster1971)) {
                                    int i2 = 0;
                                    for (FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96373 = ((FrostHunterToolbarVortexMaster1971) frostHunterGradientDrawablePulseDragonInferno96372).FrostHunterBitmapTurboDeltaNebula8743; frostHunterGradientDrawablePulseDragonInferno96373 != null; frostHunterGradientDrawablePulseDragonInferno96373 = frostHunterGradientDrawablePulseDragonInferno96373.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                                        if ((frostHunterGradientDrawablePulseDragonInferno96373.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                frostHunterGradientDrawablePulseDragonInferno96372 = frostHunterGradientDrawablePulseDragonInferno96373;
                                            } else {
                                                if (frostHunterObjectAnimatorNeoStrike70902 == null) {
                                                    frostHunterObjectAnimatorNeoStrike70902 = new FrostHunterObjectAnimatorNeoStrike7090(new FrostHunterGradientDrawablePulseDragonInferno9637[16]);
                                                }
                                                if (frostHunterGradientDrawablePulseDragonInferno96372 != null) {
                                                    frostHunterObjectAnimatorNeoStrike70902.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno96372);
                                                    frostHunterGradientDrawablePulseDragonInferno96372 = null;
                                                }
                                                frostHunterObjectAnimatorNeoStrike70902.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno96373);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                frostHunterGradientDrawablePulseDragonInferno96372 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterScaleAnimationStrikeSpark5059(frostHunterObjectAnimatorNeoStrike70902);
                            }
                        }
                        frostHunterGradientDrawablePulseDragonInferno9637 = frostHunterGradientDrawablePulseDragonInferno9637.FrostHunterFragmentBetaMegaVortex6025;
                    }
                }
                FrostHunterRewardedAdMasterStrike9463 = FrostHunterRewardedAdMasterStrike9463.FrostHunterResourcesTitanHyperVision5823();
                frostHunterGradientDrawablePulseDragonInferno9637 = (FrostHunterRewardedAdMasterStrike9463 == null || (frostHunterColorStateListOmegaHero99652 = FrostHunterRewardedAdMasterStrike9463.FrostHunterPagingDataTurboTitanium7332) == null) ? null : (FrostHunterOnItemClickListenerBetaPhantom9631) frostHunterColorStateListOmegaHero99652.FrostHunterFlowMaxDragonHero5809;
            }
        } else {
            frostHunterObjectAnimatorNeoStrike7090 = null;
        }
        FrostHunterServiceInfoTitaniumPrimeCyber9213[] frostHunterServiceInfoTitaniumPrimeCyber9213Arr = new FrostHunterServiceInfoTitaniumPrimeCyber9213[16];
        if (!frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLooperThreadBetaHyperionMax1000) {
            FrostHunterAudioManagerThunderTitan4297.FrostHunterConstraintSetCloneMasterUltraRogue2633("visitAncestors called on an unattached node");
        }
        FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96374 = frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterFragmentBetaMegaVortex6025;
        FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 FrostHunterRewardedAdMasterStrike94632 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterRewardedAdMasterStrike9463(frostHunterServiceInfoTitaniumPrimeCyber9213);
        int i3 = 1;
        int i4 = 0;
        while (FrostHunterRewardedAdMasterStrike94632 != null) {
            if ((((FrostHunterGradientDrawablePulseDragonInferno9637) FrostHunterRewardedAdMasterStrike94632.FrostHunterPagingDataTurboTitanium7332.FrostHunterAlertDialogAuroraDelta3200).FrostHunterKeyframeGammaGamma1197 & 1024) != 0) {
                while (frostHunterGradientDrawablePulseDragonInferno96374 != null) {
                    if ((frostHunterGradientDrawablePulseDragonInferno96374.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0) {
                        FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96375 = frostHunterGradientDrawablePulseDragonInferno96374;
                        FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike70903 = null;
                        while (frostHunterGradientDrawablePulseDragonInferno96375 != null) {
                            if (frostHunterGradientDrawablePulseDragonInferno96375 instanceof FrostHunterServiceInfoTitaniumPrimeCyber9213) {
                                FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber92133 = (FrostHunterServiceInfoTitaniumPrimeCyber9213) frostHunterGradientDrawablePulseDragonInferno96375;
                                Boolean valueOf = frostHunterObjectAnimatorNeoStrike7090 != null ? Boolean.valueOf(frostHunterObjectAnimatorNeoStrike7090.FrostHunterFlowMaxDragonHero5809(frostHunterServiceInfoTitaniumPrimeCyber92133)) : null;
                                if (valueOf == null || !valueOf.booleanValue()) {
                                    int i5 = i4 + 1;
                                    if (frostHunterServiceInfoTitaniumPrimeCyber9213Arr.length < i5) {
                                        int length = frostHunterServiceInfoTitaniumPrimeCyber9213Arr.length;
                                        ?? r4 = new Object[Math.max(i5, length * 2)];
                                        System.arraycopy(frostHunterServiceInfoTitaniumPrimeCyber9213Arr, i, r4, i, length);
                                        frostHunterServiceInfoTitaniumPrimeCyber9213Arr = r4;
                                    }
                                    frostHunterServiceInfoTitaniumPrimeCyber9213Arr[i4] = frostHunterServiceInfoTitaniumPrimeCyber92133;
                                    i4 = i5;
                                }
                                if (frostHunterServiceInfoTitaniumPrimeCyber92133 == frostHunterServiceInfoTitaniumPrimeCyber92132) {
                                    i3 = i;
                                }
                            } else if ((frostHunterGradientDrawablePulseDragonInferno96375.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0 && (frostHunterGradientDrawablePulseDragonInferno96375 instanceof FrostHunterToolbarVortexMaster1971)) {
                                int i6 = i;
                                for (FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96376 = ((FrostHunterToolbarVortexMaster1971) frostHunterGradientDrawablePulseDragonInferno96375).FrostHunterBitmapTurboDeltaNebula8743; frostHunterGradientDrawablePulseDragonInferno96376 != null; frostHunterGradientDrawablePulseDragonInferno96376 = frostHunterGradientDrawablePulseDragonInferno96376.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                                    if ((frostHunterGradientDrawablePulseDragonInferno96376.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            frostHunterGradientDrawablePulseDragonInferno96375 = frostHunterGradientDrawablePulseDragonInferno96376;
                                        } else {
                                            if (frostHunterObjectAnimatorNeoStrike70903 == null) {
                                                frostHunterObjectAnimatorNeoStrike70903 = new FrostHunterObjectAnimatorNeoStrike7090(new FrostHunterGradientDrawablePulseDragonInferno9637[16]);
                                            }
                                            if (frostHunterGradientDrawablePulseDragonInferno96375 != null) {
                                                frostHunterObjectAnimatorNeoStrike70903.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno96375);
                                                frostHunterGradientDrawablePulseDragonInferno96375 = null;
                                            }
                                            frostHunterObjectAnimatorNeoStrike70903.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno96376);
                                        }
                                    }
                                }
                                c = 16;
                                if (i6 == 1) {
                                    c2 = 16;
                                    i = 0;
                                }
                                frostHunterGradientDrawablePulseDragonInferno96375 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterScaleAnimationStrikeSpark5059(frostHunterObjectAnimatorNeoStrike70903);
                                c2 = c;
                                i = 0;
                            }
                            c = 16;
                            frostHunterGradientDrawablePulseDragonInferno96375 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterScaleAnimationStrikeSpark5059(frostHunterObjectAnimatorNeoStrike70903);
                            c2 = c;
                            i = 0;
                        }
                    }
                    frostHunterGradientDrawablePulseDragonInferno96374 = frostHunterGradientDrawablePulseDragonInferno96374.FrostHunterFragmentBetaMegaVortex6025;
                    c2 = c2;
                    i = 0;
                }
            }
            char c3 = c2;
            FrostHunterRewardedAdMasterStrike94632 = FrostHunterRewardedAdMasterStrike94632.FrostHunterResourcesTitanHyperVision5823();
            frostHunterGradientDrawablePulseDragonInferno96374 = (FrostHunterRewardedAdMasterStrike94632 == null || (frostHunterColorStateListOmegaHero9965 = FrostHunterRewardedAdMasterStrike94632.FrostHunterPagingDataTurboTitanium7332) == null) ? null : (FrostHunterOnItemClickListenerBetaPhantom9631) frostHunterColorStateListOmegaHero9965.FrostHunterFlowMaxDragonHero5809;
            c2 = c3;
            i = 0;
        }
        if (i3 == 0 || frostHunterServiceInfoTitaniumPrimeCyber92132 == null || FrostHunterFragmentBetaMegaVortex6025(frostHunterServiceInfoTitaniumPrimeCyber92132, false)) {
            FrostHunterTransitionGammaTitanSpeed7178.FrostHunterFCMDeltaQuantumHero8364(frostHunterServiceInfoTitaniumPrimeCyber9213, new FrostHunterWorkManagerShadowPhoenix8056(3, frostHunterServiceInfoTitaniumPrimeCyber9213));
            int ordinal = frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterBannerAdNebulaMasterBeta4389().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                            return false;
                        }
                    }
                }
                ((FrostHunterLiveDataScopeBlazeStrike6673) FrostHunterRemoteConfigPhantomDelta1739.FrostHunterPermissionInfoAlphaDelta6279(frostHunterServiceInfoTitaniumPrimeCyber9213).getFocusOwner()).FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterServiceInfoTitaniumPrimeCyber9213);
            }
            FrostHunterRewardedAdAuroraDeltaFusion7394 frostHunterRewardedAdAuroraDeltaFusion7394 = FrostHunterRewardedAdAuroraDeltaFusion7394.FrostHunterKeyframeGammaGamma1197;
            FrostHunterRewardedAdAuroraDeltaFusion7394 frostHunterRewardedAdAuroraDeltaFusion73942 = FrostHunterRewardedAdAuroraDeltaFusion7394.FrostHunterFlowMaxDragonHero5809;
            if (frostHunterObjectAnimatorNeoStrike7090 != null) {
                int i7 = frostHunterObjectAnimatorNeoStrike7090.FrostHunterAlertDialogAuroraDelta3200 - 1;
                Object[] objArr = frostHunterObjectAnimatorNeoStrike7090.FrostHunterCameraXPixelTurboCosmos9814;
                if (i7 < objArr.length) {
                    while (i7 >= 0) {
                        FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber92134 = (FrostHunterServiceInfoTitaniumPrimeCyber9213) objArr[i7];
                        if (((FrostHunterLiveDataScopeBlazeStrike6673) focusOwner).FrostHunterCameraXPixelTurboCosmos9814 != frostHunterServiceInfoTitaniumPrimeCyber9213) {
                            break;
                        }
                        frostHunterServiceInfoTitaniumPrimeCyber92134.FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402(frostHunterRewardedAdAuroraDeltaFusion73942, frostHunterRewardedAdAuroraDeltaFusion7394);
                        i7--;
                    }
                }
            }
            int i8 = i4 - 1;
            int length2 = frostHunterServiceInfoTitaniumPrimeCyber9213Arr.length;
            FrostHunterRewardedAdAuroraDeltaFusion7394 frostHunterRewardedAdAuroraDeltaFusion73943 = FrostHunterRewardedAdAuroraDeltaFusion7394.FrostHunterCameraXPixelTurboCosmos9814;
            if (i8 < length2) {
                while (i8 >= 0) {
                    FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber92135 = frostHunterServiceInfoTitaniumPrimeCyber9213Arr[i8];
                    if (((FrostHunterLiveDataScopeBlazeStrike6673) focusOwner).FrostHunterCameraXPixelTurboCosmos9814 != frostHunterServiceInfoTitaniumPrimeCyber9213) {
                        break;
                    }
                    frostHunterServiceInfoTitaniumPrimeCyber92135.FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402(frostHunterServiceInfoTitaniumPrimeCyber92135 == frostHunterServiceInfoTitaniumPrimeCyber92132 ? frostHunterRewardedAdAuroraDeltaFusion73943 : frostHunterRewardedAdAuroraDeltaFusion7394, frostHunterRewardedAdAuroraDeltaFusion73942);
                    i8--;
                }
            }
            FrostHunterLiveDataScopeBlazeStrike6673 frostHunterLiveDataScopeBlazeStrike6673 = (FrostHunterLiveDataScopeBlazeStrike6673) focusOwner;
            if (frostHunterLiveDataScopeBlazeStrike6673.FrostHunterCameraXPixelTurboCosmos9814 == frostHunterServiceInfoTitaniumPrimeCyber9213) {
                frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402(FrostHunterBannerAdNebulaMasterBeta4389, frostHunterRewardedAdAuroraDeltaFusion73943);
                if (frostHunterLiveDataScopeBlazeStrike6673.FrostHunterCameraXPixelTurboCosmos9814 != frostHunterServiceInfoTitaniumPrimeCyber9213) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public static final long FrostHunterStateCelestialNovaPixel8414(long j, float f) {
        double d = f;
        int i = 0;
        if (!(d < 1.0E-4d) && !(d > 99.9999d)) {
            FrostHunterFlowOnAuroraTurbo3876 frostHunterFlowOnAuroraTurbo3876 = FrostHunterFocusMeteringActionOlympianSpeedTitan3727.FrostHunterTextViewDragonStormMega4297;
            long FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterViewModelScopeLegendAurora8732.FrostHunterAlphaAnimationNeoCosmos5761(j, frostHunterFlowOnAuroraTurbo3876);
            return FrostHunterViewModelScopeLegendAurora8732.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterAlphaAnimationNeoCosmos5761(f, FrostHunterViewModelScopeLegendAurora8732.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterAlphaAnimationNeoCosmos57612), FrostHunterViewModelScopeLegendAurora8732.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterAlphaAnimationNeoCosmos57612), 1.0f, frostHunterFlowOnAuroraTurbo3876), FrostHunterFocusMeteringActionOlympianSpeedTitan3727.FrostHunterLifecycleBlazeGammaElite2889);
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f2 * f2 * f2;
        if (f3 <= 0.008856452f) {
            f3 = ((116.0f * f2) - 16.0f) / 903.2963f;
        }
        double d2 = (f3 * 100.0f) / 100.0f;
        int FrostHunterRunnableCosmosCelestial4235 = FrostHunterCardViewHyperionAurora3829.FrostHunterRunnableCosmosCelestial4235((d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (FrostHunterRunnableCosmosCelestial4235 >= 0) {
            i = 255;
            if (FrostHunterRunnableCosmosCelestial4235 <= 255) {
                i = FrostHunterRunnableCosmosCelestial4235;
            }
        }
        return FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterServiceEliteCelestialThunder1757(i, i, i);
    }

    public static final FrostHunterJobSchedulerSolarTitanium9154 FrostHunterTextViewDragonStormMega4297(View view) {
        FrostHunterJobSchedulerSolarTitanium9154 frostHunterJobSchedulerSolarTitanium9154 = (FrostHunterJobSchedulerSolarTitanium9154) view.getTag(com.frosthunter.arcticwildlands.frozenexpedition.adventure.R.id.pooling_container_listener_holder_tag);
        if (frostHunterJobSchedulerSolarTitanium9154 != null) {
            return frostHunterJobSchedulerSolarTitanium9154;
        }
        FrostHunterJobSchedulerSolarTitanium9154 frostHunterJobSchedulerSolarTitanium91542 = new FrostHunterJobSchedulerSolarTitanium9154();
        view.setTag(com.frosthunter.arcticwildlands.frozenexpedition.adventure.R.id.pooling_container_listener_holder_tag, frostHunterJobSchedulerSolarTitanium91542);
        return frostHunterJobSchedulerSolarTitanium91542;
    }

    public static void FrostHunterTransitionListenerPulseVortexCosmos7949(ByteArrayOutputStream byteArrayOutputStream, int i, FrostHunterStorageHyperionRogue1554 frostHunterStorageHyperionRogue1554) {
        int i2 = frostHunterStorageHyperionRogue1554.FrostHunterRemoteConfigSpeedSpeed8566;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : frostHunterStorageHyperionRogue1554.FrostHunterFlowMaxDragonHero5809.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & intValue2) == i4) {
                        int i5 = (i3 * i2) + intValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final void FrostHunterTranslateAnimationCyberSolarUltra7101(FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber9213) {
        FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno9637;
        FrostHunterColorStateListOmegaHero9965 frostHunterColorStateListOmegaHero9965;
        if (!frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLooperThreadBetaHyperionMax1000) {
            FrostHunterAudioManagerThunderTitan4297.FrostHunterConstraintSetCloneMasterUltraRogue2633("visitAncestors called on an unattached node");
        }
        FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96372 = frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterFragmentBetaMegaVortex6025;
        FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 FrostHunterRewardedAdMasterStrike9463 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterRewardedAdMasterStrike9463(frostHunterServiceInfoTitaniumPrimeCyber9213);
        loop0: while (true) {
            frostHunterGradientDrawablePulseDragonInferno9637 = null;
            if (FrostHunterRewardedAdMasterStrike9463 == null) {
                break;
            }
            if ((((FrostHunterGradientDrawablePulseDragonInferno9637) FrostHunterRewardedAdMasterStrike9463.FrostHunterPagingDataTurboTitanium7332.FrostHunterAlertDialogAuroraDelta3200).FrostHunterKeyframeGammaGamma1197 & 1024) != 0) {
                while (frostHunterGradientDrawablePulseDragonInferno96372 != null) {
                    if ((frostHunterGradientDrawablePulseDragonInferno96372.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0) {
                        FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96373 = frostHunterGradientDrawablePulseDragonInferno96372;
                        FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike7090 = null;
                        while (frostHunterGradientDrawablePulseDragonInferno96373 != null) {
                            if (frostHunterGradientDrawablePulseDragonInferno96373 instanceof FrostHunterServiceInfoTitaniumPrimeCyber9213) {
                                frostHunterGradientDrawablePulseDragonInferno9637 = frostHunterGradientDrawablePulseDragonInferno96373;
                                break loop0;
                            }
                            if ((frostHunterGradientDrawablePulseDragonInferno96373.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0 && (frostHunterGradientDrawablePulseDragonInferno96373 instanceof FrostHunterToolbarVortexMaster1971)) {
                                int i = 0;
                                for (FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96374 = ((FrostHunterToolbarVortexMaster1971) frostHunterGradientDrawablePulseDragonInferno96373).FrostHunterBitmapTurboDeltaNebula8743; frostHunterGradientDrawablePulseDragonInferno96374 != null; frostHunterGradientDrawablePulseDragonInferno96374 = frostHunterGradientDrawablePulseDragonInferno96374.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                                    if ((frostHunterGradientDrawablePulseDragonInferno96374.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0) {
                                        i++;
                                        if (i == 1) {
                                            frostHunterGradientDrawablePulseDragonInferno96373 = frostHunterGradientDrawablePulseDragonInferno96374;
                                        } else {
                                            if (frostHunterObjectAnimatorNeoStrike7090 == null) {
                                                frostHunterObjectAnimatorNeoStrike7090 = new FrostHunterObjectAnimatorNeoStrike7090(new FrostHunterGradientDrawablePulseDragonInferno9637[16]);
                                            }
                                            if (frostHunterGradientDrawablePulseDragonInferno96373 != null) {
                                                frostHunterObjectAnimatorNeoStrike7090.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno96373);
                                                frostHunterGradientDrawablePulseDragonInferno96373 = null;
                                            }
                                            frostHunterObjectAnimatorNeoStrike7090.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno96374);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            frostHunterGradientDrawablePulseDragonInferno96373 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterScaleAnimationStrikeSpark5059(frostHunterObjectAnimatorNeoStrike7090);
                        }
                    }
                    frostHunterGradientDrawablePulseDragonInferno96372 = frostHunterGradientDrawablePulseDragonInferno96372.FrostHunterFragmentBetaMegaVortex6025;
                }
            }
            FrostHunterRewardedAdMasterStrike9463 = FrostHunterRewardedAdMasterStrike9463.FrostHunterResourcesTitanHyperVision5823();
            frostHunterGradientDrawablePulseDragonInferno96372 = (FrostHunterRewardedAdMasterStrike9463 == null || (frostHunterColorStateListOmegaHero9965 = FrostHunterRewardedAdMasterStrike9463.FrostHunterPagingDataTurboTitanium7332) == null) ? null : (FrostHunterOnItemClickListenerBetaPhantom9631) frostHunterColorStateListOmegaHero9965.FrostHunterFlowMaxDragonHero5809;
        }
        FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber92132 = (FrostHunterServiceInfoTitaniumPrimeCyber9213) frostHunterGradientDrawablePulseDragonInferno9637;
        if (frostHunterServiceInfoTitaniumPrimeCyber92132 == null) {
            if (frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterServiceEliteCelestialThunder1757(FrostHunterMaterialButtonPhoenixShadowNebula7977.FrostHunterAlphaAnimationNeoCosmos5761) == null) {
                return;
            }
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterAlphaAnimationNeoCosmos5761();
            return;
        }
        FrostHunterShapeDrawableSpectraGammaEclipse4714 frostHunterShapeDrawableSpectraGammaEclipse4714 = FrostHunterMaterialButtonPhoenixShadowNebula7977.FrostHunterAlphaAnimationNeoCosmos5761;
        if (frostHunterServiceInfoTitaniumPrimeCyber92132.FrostHunterServiceEliteCelestialThunder1757(frostHunterShapeDrawableSpectraGammaEclipse4714) != null) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterAlphaAnimationNeoCosmos5761();
        } else {
            if (frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterServiceEliteCelestialThunder1757(frostHunterShapeDrawableSpectraGammaEclipse4714) == null) {
                return;
            }
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterAlphaAnimationNeoCosmos5761();
        }
    }

    public static FrostHunterStorageHyperionRogue1554[] FrostHunterViewPhantomNeo1634(ByteArrayInputStream byteArrayInputStream, int i, FrostHunterStorageHyperionRogue1554[] frostHunterStorageHyperionRogue1554Arr) {
        if (byteArrayInputStream.available() == 0) {
            return new FrostHunterStorageHyperionRogue1554[0];
        }
        if (i != frostHunterStorageHyperionRogue1554Arr.length) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int FrostHunterFCMDeltaQuantumHero8364 = (int) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(byteArrayInputStream, 2);
            iArr[i2] = (int) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFCMDeltaQuantumHero8364(byteArrayInputStream, 2);
            strArr[i2] = new String(FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterMagnetometerFusionTitanium8202(byteArrayInputStream, FrostHunterFCMDeltaQuantumHero8364), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            FrostHunterStorageHyperionRogue1554 frostHunterStorageHyperionRogue1554 = frostHunterStorageHyperionRogue1554Arr[i3];
            if (!frostHunterStorageHyperionRogue1554.FrostHunterConstraintSetCloneMasterUltraRogue2633.equals(strArr[i3])) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            frostHunterStorageHyperionRogue1554.FrostHunterLifecycleBlazeGammaElite2889 = i4;
            frostHunterStorageHyperionRogue1554.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterEditTextPulseHyperion1262(byteArrayInputStream, i4);
        }
        return frostHunterStorageHyperionRogue1554Arr;
    }

    public FrostHunterAdapterHeroEclipseHyper5814 FrostHunterCameraXPixelTurboCosmos9814(Context context, Looper looper, FrostHunterCoroutineScopeSpeedSparkAlpha3670 frostHunterCoroutineScopeSpeedSparkAlpha3670, Object obj, FrostHunterFlowEpicDragon7641 frostHunterFlowEpicDragon7641, FrostHunterFlowEpicDragon7641 frostHunterFlowEpicDragon76412) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public FrostHunterAdapterHeroEclipseHyper5814 FrostHunterRemoteConfigSpeedSpeed8566(Context context, Looper looper, FrostHunterCoroutineScopeSpeedSparkAlpha3670 frostHunterCoroutineScopeSpeedSparkAlpha3670, Object obj, FrostHunterAdapterSpeedNebula8626 frostHunterAdapterSpeedNebula8626, FrostHunterBitmapPixelMegaOlympian1139 frostHunterBitmapPixelMegaOlympian1139) {
        return FrostHunterCameraXPixelTurboCosmos9814(context, looper, frostHunterCoroutineScopeSpeedSparkAlpha3670, obj, (FrostHunterFlowEpicDragon7641) frostHunterAdapterSpeedNebula8626, (FrostHunterFlowEpicDragon7641) frostHunterBitmapPixelMegaOlympian1139);
    }
}
