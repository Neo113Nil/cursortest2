package android.content.Context;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.ViewParent;
import com.android.installreferrer.api.InstallReferrerClient;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.FrostReceiverActivity;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.GeneratorStateActivity;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.splash.assembly.fetcher.service.FrostFetcherAssembler;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterAnimatorAlphaVortexInferno7431 implements FrostHunterNotificationGammaBlazePhoenix7595 {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Object FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterAnimatorAlphaVortexInferno7431(int i, Object obj) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:246:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0592 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.Context.FrostHunterNotificationGammaBlazePhoenix7595
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        FrostHunterAnimatorSetStormFusionTitan3681 frostHunterAnimatorSetStormFusionTitan3681;
        double d;
        boolean z;
        boolean z2;
        Bitmap createBitmap;
        int i;
        int i2;
        int min;
        double max;
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        int FrostHunterLifecycleBlazeGammaElite2889;
        FrostHunterLevelListDrawableAuroraTurboDelta7963 FrostHunterBundlePulseFusionHero2475;
        int FrostHunterLifecycleBlazeGammaElite28892;
        int i3;
        int i4;
        FrostHunterViewPagerTitanSolar4986 FrostHunterMotionSceneAuroraMega2271;
        int lastIndexOf;
        FrostHunterLaunchHeroForce4010 frostHunterLaunchHeroForce4010;
        FrostHunterLaunchHeroForce4010 frostHunterLaunchHeroForce40102;
        boolean z3;
        int i5 = 2;
        int i6 = 4;
        boolean z4 = true;
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterTranslateAnimationVisionBetaPulse4522 frostHunterTranslateAnimationVisionBetaPulse4522 = (FrostHunterTranslateAnimationVisionBetaPulse4522) this.FrostHunterFlowMaxDragonHero5809;
                BitmapFactory.Options options = new BitmapFactory.Options();
                FrostHunterCameraViewTitaniumHyperionEclipse8189 frostHunterCameraViewTitaniumHyperionEclipse8189 = frostHunterTranslateAnimationVisionBetaPulse4522.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                FrostHunterRoomEntityDragonBlaze5814 frostHunterRoomEntityDragonBlaze5814 = new FrostHunterRoomEntityDragonBlaze5814(((FrostHunterNotificationManagerPulsePulseNeo9042) frostHunterTranslateAnimationVisionBetaPulse4522.FrostHunterServiceEliteCelestialThunder1757).FrostHunterLooperHyperionForce4133());
                FrostHunterConstraintLayoutBetaAlphaNebula8582 frostHunterConstraintLayoutBetaAlphaNebula8582 = new FrostHunterConstraintLayoutBetaAlphaNebula8582(frostHunterRoomEntityDragonBlaze5814);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new FrostHunterAnimatorSetEliteEpicOmega7574(new FrostHunterConstraintLayoutBetaAlphaNebula8582(new FrostHunterManifestTitanOmega4810(frostHunterConstraintLayoutBetaAlphaNebula8582))), null, options);
                Exception exc = frostHunterRoomEntityDragonBlaze5814.FrostHunterFlowMaxDragonHero5809;
                if (exc != null) {
                    throw exc;
                }
                options.inJustDecodeBounds = false;
                Paint paint = FrostHunterLayerVisionPhoenix3703.FrostHunterAlphaAnimationNeoCosmos5761;
                String str = options.outMimeType;
                ((FrostHunterSharedFlowShadowMega7966) frostHunterTranslateAnimationVisionBetaPulse4522.FrostHunterLifecycleBlazeGammaElite2889).getClass();
                if (str != null && (str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif"))) {
                    FrostHunterPaintThunderBetaLegend4180 frostHunterPaintThunderBetaLegend4180 = new FrostHunterPaintThunderBetaLegend4180(new FrostHunterMotionEventHeroInfernoBlaze3039(new FrostHunterAnimatorSetEliteEpicOmega7574(new FrostHunterConstraintLayoutBetaAlphaNebula8582(new FrostHunterManifestTitanOmega4810(frostHunterConstraintLayoutBetaAlphaNebula8582)))));
                    FrostHunterLevelListDrawableAuroraTurboDelta7963 FrostHunterBundlePulseFusionHero24752 = frostHunterPaintThunderBetaLegend4180.FrostHunterBundlePulseFusionHero2475("Orientation");
                    if (FrostHunterBundlePulseFusionHero24752 != null) {
                        try {
                            FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterBundlePulseFusionHero24752.FrostHunterLifecycleBlazeGammaElite2889(frostHunterPaintThunderBetaLegend4180.FrostHunterLevelListDrawableFusionDragonHero2232);
                        } catch (NumberFormatException unused) {
                        }
                        boolean z5 = FrostHunterLifecycleBlazeGammaElite2889 != 2 || FrostHunterLifecycleBlazeGammaElite2889 == 7 || FrostHunterLifecycleBlazeGammaElite2889 == 4 || FrostHunterLifecycleBlazeGammaElite2889 == 5;
                        FrostHunterBundlePulseFusionHero2475 = frostHunterPaintThunderBetaLegend4180.FrostHunterBundlePulseFusionHero2475("Orientation");
                        if (FrostHunterBundlePulseFusionHero2475 != null) {
                            try {
                                FrostHunterLifecycleBlazeGammaElite28892 = FrostHunterBundlePulseFusionHero2475.FrostHunterLifecycleBlazeGammaElite2889(frostHunterPaintThunderBetaLegend4180.FrostHunterLevelListDrawableFusionDragonHero2232);
                            } catch (NumberFormatException unused2) {
                            }
                            switch (FrostHunterLifecycleBlazeGammaElite28892) {
                                case 3:
                                case 4:
                                    i3 = 180;
                                    break;
                                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                                case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                                    i3 = 270;
                                    break;
                                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                                case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                                    i3 = 90;
                                    break;
                                default:
                                    i3 = 0;
                                    break;
                            }
                            frostHunterAnimatorSetStormFusionTitan3681 = new FrostHunterAnimatorSetStormFusionTitan3681(i3, z5);
                        }
                        FrostHunterLifecycleBlazeGammaElite28892 = 1;
                        switch (FrostHunterLifecycleBlazeGammaElite28892) {
                        }
                        frostHunterAnimatorSetStormFusionTitan3681 = new FrostHunterAnimatorSetStormFusionTitan3681(i3, z5);
                    }
                    FrostHunterLifecycleBlazeGammaElite2889 = 1;
                    if (FrostHunterLifecycleBlazeGammaElite2889 != 2) {
                    }
                    FrostHunterBundlePulseFusionHero2475 = frostHunterPaintThunderBetaLegend4180.FrostHunterBundlePulseFusionHero2475("Orientation");
                    if (FrostHunterBundlePulseFusionHero2475 != null) {
                    }
                    FrostHunterLifecycleBlazeGammaElite28892 = 1;
                    switch (FrostHunterLifecycleBlazeGammaElite28892) {
                    }
                    frostHunterAnimatorSetStormFusionTitan3681 = new FrostHunterAnimatorSetStormFusionTitan3681(i3, z5);
                } else {
                    frostHunterAnimatorSetStormFusionTitan3681 = FrostHunterAnimatorSetStormFusionTitan3681.FrostHunterBundlePulseFusionHero2475;
                }
                int i7 = frostHunterAnimatorSetStormFusionTitan3681.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                boolean z6 = frostHunterAnimatorSetStormFusionTitan3681.FrostHunterAlphaAnimationNeoCosmos5761;
                Exception exc2 = frostHunterRoomEntityDragonBlaze5814.FrostHunterFlowMaxDragonHero5809;
                if (exc2 != null) {
                    throw exc2;
                }
                options.inMutable = false;
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 26) {
                    FrostHunterInstrumentationStrikeBlazeThunder7469 frostHunterInstrumentationStrikeBlazeThunder7469 = FrostHunterEditTextTurboBetaElite4670.FrostHunterBundlePulseFusionHero2475;
                    if (FrostHunterOnGlobalLayoutListenerCyberShadowFusion9348.FrostHunterServiceEliteCelestialThunder1757(FrostHunterBannerAdTitanVisionDragon3523.FrostHunterEditTextPulseHyperion1262(frostHunterCameraViewTitaniumHyperionEclipse8189, frostHunterInstrumentationStrikeBlazeThunder7469)) != null) {
                        options.inPreferredColorSpace = FrostHunterOnGlobalLayoutListenerCyberShadowFusion9348.FrostHunterServiceEliteCelestialThunder1757(FrostHunterBannerAdTitanVisionDragon3523.FrostHunterEditTextPulseHyperion1262(frostHunterCameraViewTitaniumHyperionEclipse8189, frostHunterInstrumentationStrikeBlazeThunder7469));
                    }
                }
                boolean booleanValue = ((Boolean) FrostHunterBannerAdTitanVisionDragon3523.FrostHunterEditTextPulseHyperion1262(frostHunterCameraViewTitaniumHyperionEclipse8189, FrostHunterEditTextTurboBetaElite4670.FrostHunterServiceEliteCelestialThunder1757)).booleanValue();
                Context context = frostHunterCameraViewTitaniumHyperionEclipse8189.FrostHunterAlphaAnimationNeoCosmos5761;
                options.inPremultiplied = booleanValue;
                Bitmap.Config config4 = (Bitmap.Config) FrostHunterBannerAdTitanVisionDragon3523.FrostHunterEditTextPulseHyperion1262(frostHunterCameraViewTitaniumHyperionEclipse8189, FrostHunterEditTextTurboBetaElite4670.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                if ((z6 || i7 > 0) && (config4 == null || FrostHunterCanvasInfernoVortex4700.FrostHunterPermissionInfoAlphaDelta6279(config4))) {
                    config4 = Bitmap.Config.ARGB_8888;
                }
                if (((Boolean) FrostHunterBannerAdTitanVisionDragon3523.FrostHunterEditTextPulseHyperion1262(frostHunterCameraViewTitaniumHyperionEclipse8189, FrostHunterEditTextTurboBetaElite4670.FrostHunterRemoteConfigSpeedSpeed8566)).booleanValue() && config4 == Bitmap.Config.ARGB_8888) {
                    d = 1.0d;
                    if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(options.outMimeType, "image/jpeg")) {
                        config4 = Bitmap.Config.RGB_565;
                    }
                } else {
                    d = 1.0d;
                }
                if (i8 >= 26) {
                    config = options.outConfig;
                    config2 = Bitmap.Config.RGBA_F16;
                    if (config == config2) {
                        config3 = Bitmap.Config.HARDWARE;
                        if (config4 != config3) {
                            config4 = Bitmap.Config.RGBA_F16;
                        }
                    }
                }
                options.inPreferredConfig = config4;
                int i9 = options.outWidth;
                if (i9 <= 0 || (i = options.outHeight) <= 0) {
                    z = z6;
                    options.inSampleSize = 1;
                    z2 = false;
                    options.inScaled = false;
                } else {
                    int i10 = (i7 == 90 || i7 == 270) ? i : i9;
                    if (i7 != 90 && i7 != 270) {
                        i9 = i;
                    }
                    FrostHunterGestureDetectorForceTitan2560 frostHunterGestureDetectorForceTitan2560 = frostHunterCameraViewTitaniumHyperionEclipse8189.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    FrostHunterLicensingAlphaTitanElite7131 frostHunterLicensingAlphaTitanElite7131 = frostHunterCameraViewTitaniumHyperionEclipse8189.FrostHunterBundlePulseFusionHero2475;
                    FrostHunterInstrumentationStrikeBlazeThunder7469 frostHunterInstrumentationStrikeBlazeThunder74692 = FrostHunterBroadcastReceiverEliteEliteQuantum9225.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    long FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterExecutorSolarPhoenix3849.FrostHunterServiceConnectionTurboPhoenixOmega6719(i10, i9, frostHunterGestureDetectorForceTitan2560, frostHunterLicensingAlphaTitanElite7131, (FrostHunterGestureDetectorForceTitan2560) FrostHunterBannerAdTitanVisionDragon3523.FrostHunterEditTextPulseHyperion1262(frostHunterCameraViewTitaniumHyperionEclipse8189, frostHunterInstrumentationStrikeBlazeThunder74692));
                    int i11 = (int) (FrostHunterServiceConnectionTurboPhoenixOmega6719 >> 32);
                    int i12 = (int) (FrostHunterServiceConnectionTurboPhoenixOmega6719 & 4294967295L);
                    int highestOneBit = Integer.highestOneBit(i10 / i11);
                    int highestOneBit2 = Integer.highestOneBit(i9 / i12);
                    int ordinal = frostHunterLicensingAlphaTitanElite7131.ordinal();
                    if (ordinal != 0) {
                        z = z6;
                        i2 = 1;
                        if (ordinal != 1) {
                            FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                            return null;
                        }
                        min = Math.max(highestOneBit, highestOneBit2);
                    } else {
                        z = z6;
                        i2 = 1;
                        min = Math.min(highestOneBit, highestOneBit2);
                    }
                    if (min < i2) {
                        min = 1;
                    }
                    options.inSampleSize = min;
                    double d2 = min;
                    double d3 = i10 / d2;
                    double d4 = i9 / d2;
                    FrostHunterGestureDetectorForceTitan2560 frostHunterGestureDetectorForceTitan25602 = (FrostHunterGestureDetectorForceTitan2560) FrostHunterBannerAdTitanVisionDragon3523.FrostHunterEditTextPulseHyperion1262(frostHunterCameraViewTitaniumHyperionEclipse8189, frostHunterInstrumentationStrikeBlazeThunder74692);
                    double d5 = i11 / d3;
                    double d6 = i12 / d4;
                    int ordinal2 = frostHunterLicensingAlphaTitanElite7131.ordinal();
                    if (ordinal2 == 0) {
                        max = Math.max(d5, d6);
                    } else {
                        if (ordinal2 != 1) {
                            FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                            return null;
                        }
                        max = Math.min(d5, d6);
                    }
                    if (frostHunterGestureDetectorForceTitan25602.FrostHunterAlphaAnimationNeoCosmos5761 instanceof FrostHunterClipDrawableDeltaSparkCyber8446) {
                        double d7 = ((FrostHunterClipDrawableDeltaSparkCyber8446) r8).FrostHunterAlphaAnimationNeoCosmos5761 / d3;
                        if (max > d7) {
                            max = d7;
                        }
                    }
                    if (frostHunterGestureDetectorForceTitan25602.FrostHunterConstraintSetCloneMasterUltraRogue2633 instanceof FrostHunterClipDrawableDeltaSparkCyber8446) {
                        double d8 = ((FrostHunterClipDrawableDeltaSparkCyber8446) r1).FrostHunterAlphaAnimationNeoCosmos5761 / d4;
                        if (max > d8) {
                            max = d8;
                        }
                    }
                    if (frostHunterCameraViewTitaniumHyperionEclipse8189.FrostHunterServiceEliteCelestialThunder1757 == FrostHunterVectorDrawableCompatDeltaInferno6148.FrostHunterFlowMaxDragonHero5809 && max > d) {
                        max = d;
                    }
                    boolean z7 = max == d;
                    options.inScaled = !z7;
                    if (!z7) {
                        if (max > d) {
                            options.inDensity = FrostHunterCardViewHyperionAurora3829.FrostHunterRunnableCosmosCelestial4235(2.147483647E9d / max);
                            options.inTargetDensity = Integer.MAX_VALUE;
                        } else {
                            options.inDensity = Integer.MAX_VALUE;
                            options.inTargetDensity = FrostHunterCardViewHyperionAurora3829.FrostHunterRunnableCosmosCelestial4235(2.147483647E9d * max);
                        }
                    }
                    z2 = false;
                }
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(new FrostHunterAnimatorSetEliteEpicOmega7574(frostHunterConstraintLayoutBetaAlphaNebula8582), null, options);
                    frostHunterConstraintLayoutBetaAlphaNebula8582.close();
                    Exception exc3 = frostHunterRoomEntityDragonBlaze5814.FrostHunterFlowMaxDragonHero5809;
                    if (exc3 != null) {
                        throw exc3;
                    }
                    if (decodeStream == null) {
                        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        return null;
                    }
                    decodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                    if (z || i7 > 0) {
                        Matrix matrix = new Matrix();
                        float width = decodeStream.getWidth() / 2.0f;
                        float height = decodeStream.getHeight() / 2.0f;
                        if (z) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        if (i7 > 0) {
                            matrix.postRotate(i7, width, height);
                        }
                        RectF rectF = new RectF(0.0f, 0.0f, decodeStream.getWidth(), decodeStream.getHeight());
                        matrix.mapRect(rectF);
                        float f = rectF.left;
                        if (f != 0.0f || rectF.top != 0.0f) {
                            matrix.postTranslate(-f, -rectF.top);
                        }
                        if (i7 == 90 || i7 == 270) {
                            int height2 = decodeStream.getHeight();
                            int width2 = decodeStream.getWidth();
                            Bitmap.Config config5 = decodeStream.getConfig();
                            if (config5 == null) {
                                config5 = Bitmap.Config.ARGB_8888;
                            }
                            createBitmap = Bitmap.createBitmap(height2, width2, config5);
                        } else {
                            int width3 = decodeStream.getWidth();
                            int height3 = decodeStream.getHeight();
                            Bitmap.Config config6 = decodeStream.getConfig();
                            if (config6 == null) {
                                config6 = Bitmap.Config.ARGB_8888;
                            }
                            createBitmap = Bitmap.createBitmap(width3, height3, config6);
                        }
                        new Canvas(createBitmap).drawBitmap(decodeStream, matrix, FrostHunterLayerVisionPhoenix3703.FrostHunterAlphaAnimationNeoCosmos5761);
                        decodeStream.recycle();
                        decodeStream = createBitmap;
                    }
                    return new FrostHunterPagingQuantumVortexBlaze6618(FrostHunterBindingAdapterSpeedNeo6677.FrostHunterLifecycleBlazeGammaElite2889(new BitmapDrawable(context.getResources(), decodeStream)), (options.inSampleSize > 1 || options.inScaled) ? true : z2);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        FrostHunterBindingAdapterSpeedNeo6677.FrostHunterFragmentBetaMegaVortex6025(frostHunterConstraintLayoutBetaAlphaNebula8582, th);
                        throw th2;
                    }
                }
            case 1:
                FrostHunterIntentForceSpeed4935 frostHunterIntentForceSpeed4935 = (FrostHunterIntentForceSpeed4935) this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterGuidelineVisionPixel3324 frostHunterGuidelineVisionPixel3324 = new FrostHunterGuidelineVisionPixel3324();
                ((FrostHunterBarcodeScannerRogueMaxHero8766) frostHunterIntentForceSpeed4935.FrostHunterAlertDialogAuroraDelta3200).getClass();
                TimeUnit.SECONDS.getClass();
                TimeZone timeZone = FrostHunterTextureViewForceEpicQuantum6388.FrostHunterAlphaAnimationNeoCosmos5761;
                frostHunterGuidelineVisionPixel3324.FrostHunterBitmapTurboDeltaNebula8743 = 5000;
                return new FrostHunterPreviewThunderShadowBeta2697(frostHunterGuidelineVisionPixel3324);
            case 2:
                return FrostHunterCardViewHyperionAurora3829.FrostHunterR8MasterNebulaSpark7247((FrostHunterLaunchHeroForce4010) this.FrostHunterFlowMaxDragonHero5809);
            case 3:
                return new FrostHunterDrawableCompatUltraCyber1229((FrostHunterTransitionManagerEliteVortexPixel2771) this.FrostHunterFlowMaxDragonHero5809);
            case 4:
                File file = (File) this.FrostHunterFlowMaxDragonHero5809;
                synchronized (FrostHunterMagnetometerVisionAurora6204.FrostHunterServiceEliteCelestialThunder1757) {
                    FrostHunterMagnetometerVisionAurora6204.FrostHunterBundlePulseFusionHero2475.remove(file.getAbsolutePath());
                }
                return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                FrostReceiverActivity frostReceiverActivity = (FrostReceiverActivity) this.FrostHunterFlowMaxDragonHero5809;
                int i13 = FrostReceiverActivity.FrostHunterViewPhantomNeo1634;
                return new FrostHunterFlowOnVortexCelestial3214(frostReceiverActivity);
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                GeneratorStateActivity generatorStateActivity = (GeneratorStateActivity) this.FrostHunterFlowMaxDragonHero5809;
                int i14 = GeneratorStateActivity.FrostHunterBillingClientFusionVortex9008;
                Context applicationContext = generatorStateActivity.getApplicationContext();
                applicationContext.getClass();
                FrostHunterChipMasterUltra7163 frostHunterChipMasterUltra7163 = (FrostHunterChipMasterUltra7163) generatorStateActivity.FrostHunterViewPhantomNeo1634.getValue();
                frostHunterChipMasterUltra7163.getClass();
                Context applicationContext2 = applicationContext.getApplicationContext();
                FrostHunterServiceInfoEclipseAurora7011 frostHunterServiceInfoEclipseAurora7011 = new FrostHunterServiceInfoEclipseAurora7011(i6);
                FrostHunterMagnetometerInfernoDragon1607 frostHunterMagnetometerInfernoDragon1607 = new FrostHunterMagnetometerInfernoDragon1607();
                applicationContext2.getClass();
                FrostHunterConfigurationCosmosEclipseQuantum1114 frostHunterConfigurationCosmosEclipseQuantum1114 = new FrostHunterConfigurationCosmosEclipseQuantum1114(applicationContext2, (byte) 0);
                FrostHunterLayoutInflaterTurboHyperion3832 frostHunterLayoutInflaterTurboHyperion3832 = frostHunterChipMasterUltra7163.FrostHunterAlphaAnimationNeoCosmos5761;
                frostHunterLayoutInflaterTurboHyperion3832.getClass();
                ((FrostHunterMagnetometerInfernoDragon1607) frostHunterLayoutInflaterTurboHyperion3832.FrostHunterFlowMaxDragonHero5809).getClass();
                String str2 = (String) new FrostFetcherAssembler(null, null, null, 7, null).processNorth();
                System.currentTimeMillis();
                str2.getClass();
                int i15 = 18;
                FrostHunterChipSpeedTitan5326 frostHunterChipSpeedTitan5326 = new FrostHunterChipSpeedTitan5326(i15);
                FrostHunterBottomSheetEclipseUltraShadow6009 frostHunterBottomSheetEclipseUltraShadow6009 = new FrostHunterBottomSheetEclipseUltraShadow6009(8);
                int i16 = 19;
                new FrostHunterRippleDrawableBlazeBetaStorm6320(i16);
                FrostHunterRippleDrawableBlazeBetaStorm6320 frostHunterRippleDrawableBlazeBetaStorm6320 = new FrostHunterRippleDrawableBlazeBetaStorm6320(i15);
                FrostHunterRewardedAdHyperStrike1151 frostHunterRewardedAdHyperStrike1151 = new FrostHunterRewardedAdHyperStrike1151(i16);
                FrostHunterLayoutInflaterTurboHyperion3832 frostHunterLayoutInflaterTurboHyperion38322 = new FrostHunterLayoutInflaterTurboHyperion3832(11, new FrostHunterClipboardManagerCosmosThunder3115());
                FrostHunterBottomSheetEclipseUltraShadow6009 frostHunterBottomSheetEclipseUltraShadow60092 = new FrostHunterBottomSheetEclipseUltraShadow6009(6);
                FrostHunterBottomSheetEclipseUltraShadow6009 frostHunterBottomSheetEclipseUltraShadow60093 = new FrostHunterBottomSheetEclipseUltraShadow6009(14);
                FrostHunterChipSpeedTitan5326 frostHunterChipSpeedTitan53262 = new FrostHunterChipSpeedTitan5326(29);
                return new FrostHunterLayerQuantumGammaTitanium3937(frostHunterServiceInfoEclipseAurora7011, frostHunterMagnetometerInfernoDragon1607, frostHunterConfigurationCosmosEclipseQuantum1114, new FrostHunterSQLiteMasterUltra9956(14, new FrostHunterIntentForceSpeed4935(new FrostHunterPoseDetectionSparkSparkHyper8160(applicationContext2, str2), FrostHunterCardViewHyperionAurora3829.FrostHunterFCMDeltaQuantumHero8364(new FrostHunterMenuThunderPixelAlpha8873(frostHunterChipSpeedTitan5326, frostHunterChipSpeedTitan53262, frostHunterLayoutInflaterTurboHyperion38322), new FrostHunterTimerCelestialNovaX5342(frostHunterBottomSheetEclipseUltraShadow6009, frostHunterChipSpeedTitan53262, frostHunterBottomSheetEclipseUltraShadow60093), new FrostHunterLiveDataScopeForceBetaTitanium9619(), new FrostHunterObjectDetectionCosmosNebulaEpic8434(frostHunterRippleDrawableBlazeBetaStorm6320, frostHunterChipSpeedTitan53262, frostHunterBottomSheetEclipseUltraShadow60092), new FrostHunterObjectDetectionCosmosNebulaEpic8434(frostHunterRewardedAdHyperStrike1151, frostHunterChipSpeedTitan53262, frostHunterBottomSheetEclipseUltraShadow60092)))), frostHunterChipMasterUltra7163);
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                try {
                    return (List) ((FrostHunterNotificationGammaBlazePhoenix7595) this.FrostHunterFlowMaxDragonHero5809).FrostHunterConstraintSetCloneMasterUltraRogue2633();
                } catch (SSLPeerUnverifiedException unused3) {
                    return FrostHunterAssetManagerForceNebulaNebula4990.FrostHunterCameraXPixelTurboCosmos9814;
                }
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                return (List) this.FrostHunterFlowMaxDragonHero5809;
            case 9:
                FrostHunterServiceBetaOlympian9745 frostHunterServiceBetaOlympian9745 = (FrostHunterServiceBetaOlympian9745) this.FrostHunterFlowMaxDragonHero5809;
                frostHunterServiceBetaOlympian9745.getClass();
                try {
                    frostHunterServiceBetaOlympian9745.FrostHunterCardViewSpectraCyber7714.FrostHunterAlertDialogAuroraDelta3200(2, 0, false);
                } catch (IOException e) {
                    FrostHunterWithContextForceFusion3959 frostHunterWithContextForceFusion3959 = FrostHunterWithContextForceFusion3959.PROTOCOL_ERROR;
                    frostHunterServiceBetaOlympian9745.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterWithContextForceFusion3959, frostHunterWithContextForceFusion3959, e);
                }
                return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
            case 10:
                Context context2 = (Context) ((FrostHunterTraceHyperionAuroraNebula9947) this.FrostHunterFlowMaxDragonHero5809).FrostHunterKeyframeGammaGamma1197;
                double d9 = 0.2d;
                try {
                    Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d9 = 0.15d;
                    }
                } catch (Exception unused4) {
                }
                if (0.0d > d9 || d9 > 1.0d) {
                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("percent must be in the range [0.0, 1.0].");
                    return null;
                }
                FrostHunterNestedScrollViewMaxEpicEpic6844 frostHunterNestedScrollViewMaxEpicEpic6844 = new FrostHunterNestedScrollViewMaxEpicEpic6844(4);
                try {
                    Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                    systemService2.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService2;
                    i4 = (context2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                } catch (Exception unused5) {
                    i4 = 256;
                }
                return new FrostHunterTextInputLayoutTitaniumSolarVision1935(new FrostHunterRecyclerViewTitanCelestial8048((long) (d9 * i4 * 1048576), frostHunterNestedScrollViewMaxEpicEpic6844), frostHunterNestedScrollViewMaxEpicEpic6844);
            case 11:
                return Float.valueOf(FrostHunterLooperThreadStormCyberElite6638.FrostHunterLevelListDrawableFusionDragonHero2232(((FrostHunterViewModelScopeSparkBlaze1575) this.FrostHunterFlowMaxDragonHero5809).FrostHunterFlowMaxDragonHero5809()));
            case 12:
                Object FrostHunterScaleAnimationStrikeSpark5059 = ((FrostHunterBundleMaxNovaXVortex6982) this.FrostHunterFlowMaxDragonHero5809).FrostHunterScaleAnimationStrikeSpark5059();
                return (FrostHunterPaintFlagsDrawFilterPulseGamma8354) (FrostHunterScaleAnimationStrikeSpark5059 instanceof FrostHunterDialogFragmentStormBeta4545 ? null : FrostHunterScaleAnimationStrikeSpark5059);
            case 13:
                return (FrostHunterIntentServiceSpeedPixelRogue5663) ((FrostHunterConstraintSetVisionCelestial6602) this.FrostHunterFlowMaxDragonHero5809).FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLifecycleBlazeGammaElite2889.getValue();
            case 14:
                return new FrostHunterThreadForceFusion5910((FrostHunterNavigationSolarCosmos2919) this.FrostHunterFlowMaxDragonHero5809);
            case 15:
                File file2 = (File) ((FrostHunterBundleQuantumTurboRogue8500) this.FrostHunterFlowMaxDragonHero5809).FrostHunterConstraintSetCloneMasterUltraRogue2633();
                String name = file2.getName();
                name.getClass();
                if (!FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterStateCelestialNovaPixel8414(name, '.', "").equals("preferences_pb")) {
                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterFragmentBetaMegaVortex6025("File extension for file: ", file2, " does not match required extension for Preferences file: preferences_pb");
                    return null;
                }
                File absoluteFile = file2.getAbsoluteFile();
                absoluteFile.getClass();
                return absoluteFile;
            case 16:
                FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterAlphaAnimationNeoCosmos5761((FrostHunterHandlerOlympianNebulaVision5814) this.FrostHunterFlowMaxDragonHero5809);
                return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
            case 17:
                FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterAlphaAnimationNeoCosmos5761((Closeable) ((FrostHunterVibratorMegaNovaX1236) this.FrostHunterFlowMaxDragonHero5809).FrostHunterCameraXPixelTurboCosmos9814);
                return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
            case 18:
                FrostHunterSurfaceViewPrimeAlphaPulse4865 frostHunterSurfaceViewPrimeAlphaPulse4865 = ((FrostHunterMagnetometerTitaniumCyber5302) this.FrostHunterFlowMaxDragonHero5809).FrostHunterCameraXPixelTurboCosmos9814;
                frostHunterSurfaceViewPrimeAlphaPulse4865.getClass();
                frostHunterSurfaceViewPrimeAlphaPulse4865.FrostHunterServiceEliteCelestialThunder1757();
                return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
            case 19:
                FrostHunterCameraOlympianLegendUltra6831 frostHunterCameraOlympianLegendUltra6831 = (FrostHunterCameraOlympianLegendUltra6831) this.FrostHunterFlowMaxDragonHero5809;
                synchronized (frostHunterCameraOlympianLegendUltra6831.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                    FrostHunterMotionSceneAuroraMega2271 = frostHunterCameraOlympianLegendUltra6831.FrostHunterMotionSceneAuroraMega2271();
                    if (((FrostHunterInputFilterPulseEpicGamma6868) frostHunterCameraOlympianLegendUltra6831.FrostHunterTextViewDragonStormMega4297.getValue()).compareTo(FrostHunterInputFilterPulseEpicGamma6868.FrostHunterFlowMaxDragonHero5809) <= 0) {
                        Throwable th3 = frostHunterCameraOlympianLegendUltra6831.FrostHunterServiceEliteCelestialThunder1757;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th3);
                        throw cancellationException;
                    }
                }
                if (FrostHunterMotionSceneAuroraMega2271 != null) {
                    ((FrostHunterSQLiteUltraElite7894) FrostHunterMotionSceneAuroraMega2271).FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761);
                }
                return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
            case 20:
                FrostHunterInterpolatorTitanPulse9780 frostHunterInterpolatorTitanPulse9780 = (FrostHunterInterpolatorTitanPulse9780) this.FrostHunterFlowMaxDragonHero5809;
                ClassLoader classLoader = frostHunterInterpolatorTitanPulse9780.FrostHunterAlertDialogAuroraDelta3200;
                FrostHunterRemoteModelManagerPrimeStrikePrime5960 frostHunterRemoteModelManagerPrimeStrikePrime5960 = frostHunterInterpolatorTitanPulse9780.FrostHunterKeyframeGammaGamma1197;
                Enumeration<URL> resources = classLoader.getResources("");
                resources.getClass();
                ArrayList list = Collections.list(resources);
                list.getClass();
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                int i17 = 0;
                while (i17 < size) {
                    Object obj = list.get(i17);
                    i17++;
                    URL url = (URL) obj;
                    url.getClass();
                    if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(url.getProtocol(), "file")) {
                        String str3 = FrostHunterCoroutineScopePrimeSpark1417.FrostHunterFlowMaxDragonHero5809;
                        String file3 = new File(url.toURI()).toString();
                        file3.getClass();
                        frostHunterLaunchHeroForce40102 = new FrostHunterLaunchHeroForce4010(frostHunterRemoteModelManagerPrimeStrikePrime5960, FrostHunterServiceInfoEclipseAurora7011.FrostHunterScaleAnimationStrikeSpark5059(file3));
                    } else {
                        frostHunterLaunchHeroForce40102 = null;
                    }
                    if (frostHunterLaunchHeroForce40102 != null) {
                        arrayList.add(frostHunterLaunchHeroForce40102);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList list2 = Collections.list(resources2);
                list2.getClass();
                ArrayList arrayList2 = new ArrayList();
                int size2 = list2.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj2 = list2.get(i18);
                    i18++;
                    URL url2 = (URL) obj2;
                    url2.getClass();
                    String url3 = url2.toString();
                    url3.getClass();
                    if (FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterCameraXTurboCelestialHero5430(url3, "jar:file:", false) && (lastIndexOf = url3.lastIndexOf("!", url3.length() - 1)) != -1) {
                        String str4 = FrostHunterCoroutineScopePrimeSpark1417.FrostHunterFlowMaxDragonHero5809;
                        String file4 = new File(URI.create(url3.substring(4, lastIndexOf))).toString();
                        file4.getClass();
                        frostHunterLaunchHeroForce4010 = new FrostHunterLaunchHeroForce4010(FrostHunterGestureDetectorNovaPrimeHero2555.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterServiceInfoEclipseAurora7011.FrostHunterScaleAnimationStrikeSpark5059(file4), frostHunterRemoteModelManagerPrimeStrikePrime5960, new FrostHunterResourceUltraUltraLegend1377(24)), FrostHunterInterpolatorTitanPulse9780.FrostHunterServiceConnectionTurboPhoenixOmega6719);
                    } else {
                        frostHunterLaunchHeroForce4010 = null;
                    }
                    if (frostHunterLaunchHeroForce4010 != null) {
                        arrayList2.add(frostHunterLaunchHeroForce4010);
                    }
                }
                return FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterCoordinatorLayoutGammaTurboSpark2420(arrayList, arrayList2);
            case 21:
                FrostHunterVibratorOmegaSpeed8811 frostHunterVibratorOmegaSpeed8811 = (FrostHunterVibratorOmegaSpeed8811) this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterDisplayMetricsMasterPhantomVortex1539 frostHunterDisplayMetricsMasterPhantomVortex1539 = frostHunterVibratorOmegaSpeed8811.FrostHunterCameraXPixelTurboCosmos9814;
                Object obj3 = frostHunterVibratorOmegaSpeed8811.FrostHunterKeyframeGammaGamma1197;
                if (obj3 != null) {
                    return frostHunterDisplayMetricsMasterPhantomVortex1539.FrostHunterServiceEliteCelestialThunder1757(frostHunterVibratorOmegaSpeed8811, obj3);
                }
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Value should be initialized");
                return null;
            case 22:
                return FrostHunterExecutorSolarPhoenix3849.FrostHunterCardViewSpectraCyber7714((FrostHunterFragmentManagerOlympianNovaAlpha1516) this.FrostHunterFlowMaxDragonHero5809);
            case 23:
                FrostHunterTimerPixelAurora2235 frostHunterTimerPixelAurora2235 = (FrostHunterTimerPixelAurora2235) this.FrostHunterFlowMaxDragonHero5809;
                frostHunterTimerPixelAurora2235.FrostHunterRemoteConfigSpeedSpeed8566().FrostHunterAlphaAnimationNeoCosmos5761(new FrostHunterRewardedAdPixelPhoenix5665(0, frostHunterTimerPixelAurora2235));
                return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
            case 24:
                FrostHunterEventEclipseStrike9201 frostHunterEventEclipseStrike9201 = (FrostHunterEventEclipseStrike9201) this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterAdMobPixelNovaXSolar3557 frostHunterAdMobPixelNovaXSolar3557 = (FrostHunterAdMobPixelNovaXSolar3557) FrostHunterCardViewHyperionAurora3829.FrostHunterLooperThreadBetaHyperionMax1000(frostHunterEventEclipseStrike9201, FrostHunterCanvasQuantumFusion3558.FrostHunterAlphaAnimationNeoCosmos5761);
                frostHunterEventEclipseStrike9201.FrostHunterMeteringPointMegaCyber7955 = frostHunterAdMobPixelNovaXSolar3557;
                frostHunterEventEclipseStrike9201.FrostHunterBillingClientFusionVortex9008 = frostHunterAdMobPixelNovaXSolar3557 != null ? new FrostHunterShapeDrawableBetaCosmos9018(frostHunterAdMobPixelNovaXSolar3557.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterAdMobPixelNovaXSolar3557.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterAdMobPixelNovaXSolar3557.FrostHunterBundlePulseFusionHero2475, frostHunterAdMobPixelNovaXSolar3557.FrostHunterServiceEliteCelestialThunder1757) : null;
                return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
            case 25:
                return (ViewParent) this.FrostHunterFlowMaxDragonHero5809;
            case 26:
                FrostHunterLocationManagerMasterAlpha6950 frostHunterLocationManagerMasterAlpha6950 = (FrostHunterLocationManagerMasterAlpha6950) this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterCountDownTimerLegendOlympian4078 frostHunterCountDownTimerLegendOlympian4078 = frostHunterLocationManagerMasterAlpha6950.FrostHunterAlertDialogAuroraDelta3200;
                if (((FrostHunterMotionLayoutBlazePhoenix5062) frostHunterCountDownTimerLegendOlympian4078.getValue()).FrostHunterAlphaAnimationNeoCosmos5761 == 9205357640488583168L || FrostHunterMotionLayoutBlazePhoenix5062.FrostHunterLifecycleBlazeGammaElite2889(((FrostHunterMotionLayoutBlazePhoenix5062) frostHunterCountDownTimerLegendOlympian4078.getValue()).FrostHunterAlphaAnimationNeoCosmos5761)) {
                    return null;
                }
                return frostHunterLocationManagerMasterAlpha6950.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterNestedScrollViewPixelPhantom8605(((FrostHunterMotionLayoutBlazePhoenix5062) frostHunterCountDownTimerLegendOlympian4078.getValue()).FrostHunterAlphaAnimationNeoCosmos5761);
            case 27:
                FrostHunterDataBindingAlphaStorm9399 frostHunterDataBindingAlphaStorm9399 = (FrostHunterDataBindingAlphaStorm9399) this.FrostHunterFlowMaxDragonHero5809;
                while (true) {
                    synchronized (frostHunterDataBindingAlphaStorm9399.FrostHunterRemoteConfigSpeedSpeed8566) {
                        try {
                            if (frostHunterDataBindingAlphaStorm9399.FrostHunterBundlePulseFusionHero2475) {
                                z3 = z4;
                            } else {
                                frostHunterDataBindingAlphaStorm9399.FrostHunterBundlePulseFusionHero2475 = z4;
                                try {
                                    FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike7090 = frostHunterDataBindingAlphaStorm9399.FrostHunterLevelListDrawableFusionDragonHero2232;
                                    Object[] objArr = frostHunterObjectAnimatorNeoStrike7090.FrostHunterCameraXPixelTurboCosmos9814;
                                    int i19 = frostHunterObjectAnimatorNeoStrike7090.FrostHunterAlertDialogAuroraDelta3200;
                                    int i20 = 0;
                                    while (i20 < i19) {
                                        FrostHunterIntentServiceTitanMegaMax6473 frostHunterIntentServiceTitanMegaMax6473 = (FrostHunterIntentServiceTitanMegaMax6473) objArr[i20];
                                        FrostHunterToolbarHeroNovaX1020 frostHunterToolbarHeroNovaX1020 = frostHunterIntentServiceTitanMegaMax6473.FrostHunterRemoteConfigSpeedSpeed8566;
                                        FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473 = frostHunterIntentServiceTitanMegaMax6473.FrostHunterAlphaAnimationNeoCosmos5761;
                                        Object[] objArr2 = frostHunterToolbarHeroNovaX1020.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                        long[] jArr = frostHunterToolbarHeroNovaX1020.FrostHunterAlphaAnimationNeoCosmos5761;
                                        int length = jArr.length - i5;
                                        boolean z8 = z4;
                                        if (length >= 0) {
                                            int i21 = 0;
                                            while (true) {
                                                long j = jArr[i21];
                                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i22 = 8 - ((~(i21 - length)) >>> 31);
                                                    for (int i23 = 0; i23 < i22; i23++) {
                                                        if ((j & 255) < 128) {
                                                            frostHunterCombineLegendMegaPrime5473.FrostHunterAlphaAnimationNeoCosmos5761(objArr2[(i21 << 3) + i23]);
                                                        }
                                                        j >>= 8;
                                                    }
                                                    if (i22 != 8) {
                                                    }
                                                }
                                                if (i21 != length) {
                                                    i21++;
                                                }
                                            }
                                        }
                                        frostHunterToolbarHeroNovaX1020.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                                        i20++;
                                        z4 = z8;
                                        i5 = 2;
                                    }
                                    z3 = z4;
                                    frostHunterDataBindingAlphaStorm9399.FrostHunterBundlePulseFusionHero2475 = false;
                                } catch (Throwable th4) {
                                    frostHunterDataBindingAlphaStorm9399.FrostHunterBundlePulseFusionHero2475 = false;
                                    throw th4;
                                }
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    if (!frostHunterDataBindingAlphaStorm9399.FrostHunterAlphaAnimationNeoCosmos5761()) {
                        return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                    }
                    z4 = z3;
                    i5 = 2;
                }
            case 28:
                FrostHunterJobSchedulerNovaCyber3242 frostHunterJobSchedulerNovaCyber3242 = (FrostHunterJobSchedulerNovaCyber3242) this.FrostHunterFlowMaxDragonHero5809;
                frostHunterJobSchedulerNovaCyber3242.FrostHunterMeteringPointMegaCyber7955 = null;
                FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterJobSchedulerNovaCyber3242);
                FrostHunterVectorDrawableForceMax1351.FrostHunterTextViewDragonStormMega4297(frostHunterJobSchedulerNovaCyber3242);
                FrostHunterVectorDrawableForceMax1351.FrostHunterResourcesTitanHyperVision5823(frostHunterJobSchedulerNovaCyber3242);
                return Boolean.TRUE;
            default:
                ((FrostHunterLifecycleElitePixelForce3975) this.FrostHunterFlowMaxDragonHero5809).FrostHunterPagingSourceEclipseDelta8255.FrostHunterAlphaAnimationNeoCosmos5761(Boolean.valueOf(!r0.FrostHunterPermissionInfoAlphaDelta6279));
                return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
        }
    }
}
