package android.content.Context;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Intent;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.LocaleList;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMeteringPointDeltaPrimeSolar9676 implements FrostHunterIntentSpeedCyber8582 {
    public Object FrostHunterAlertDialogAuroraDelta3200;
    public int FrostHunterCameraXPixelTurboCosmos9814;
    public boolean FrostHunterFlowMaxDragonHero5809;
    public Object FrostHunterFragmentBetaMegaVortex6025;
    public Object FrostHunterKeyframeGammaGamma1197;
    public Object FrostHunterServiceConnectionTurboPhoenixOmega6719;

    public FrostHunterMeteringPointDeltaPrimeSolar9676(FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.FrostHunterAlertDialogAuroraDelta3200 = intent;
        this.FrostHunterKeyframeGammaGamma1197 = new FrostHunterBottomSheetEclipseUltraShadow6009(1);
        this.FrostHunterCameraXPixelTurboCosmos9814 = 0;
        this.FrostHunterFlowMaxDragonHero5809 = true;
        if (frostHunterTraceHyperionAuroraNebula9947 != null) {
            intent.setPackage(((ComponentName) frostHunterTraceHyperionAuroraNebula9947.FrostHunterKeyframeGammaGamma1197).getPackageName());
            FrostHunterRoomDatabasePhantomSpark4438 frostHunterRoomDatabasePhantomSpark4438 = (FrostHunterRoomDatabasePhantomSpark4438) frostHunterTraceHyperionAuroraNebula9947.FrostHunterAlertDialogAuroraDelta3200;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", frostHunterRoomDatabasePhantomSpark4438);
            intent.putExtras(bundle);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r7 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterMeteringPointDeltaPrimeSolar9676 frostHunterMeteringPointDeltaPrimeSolar9676, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947;
        boolean addMediaCodec;
        FrostHunterAssetManagerCelestialShadowInferno9902 frostHunterAssetManagerCelestialShadowInferno9902 = (FrostHunterAssetManagerCelestialShadowInferno9902) frostHunterMeteringPointDeltaPrimeSolar9676.FrostHunterKeyframeGammaGamma1197;
        MediaCodec mediaCodec = (MediaCodec) frostHunterMeteringPointDeltaPrimeSolar9676.FrostHunterAlertDialogAuroraDelta3200;
        HandlerThread handlerThread = frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterBundlePulseFusionHero2475 == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(frostHunterAssetManagerCelestialShadowInferno9902, handler);
        frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterBundlePulseFusionHero2475 = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        ((FrostHunterMotionLayoutTransitionEliteSolarMax1226) frostHunterMeteringPointDeltaPrimeSolar9676.FrostHunterFragmentBetaMegaVortex6025).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (frostHunterTraceHyperionAuroraNebula9947 = (FrostHunterTraceHyperionAuroraNebula9947) frostHunterMeteringPointDeltaPrimeSolar9676.FrostHunterServiceConnectionTurboPhoenixOmega6719) != null) {
            LoudnessCodecController loudnessCodecController = (LoudnessCodecController) frostHunterTraceHyperionAuroraNebula9947.FrostHunterKeyframeGammaGamma1197;
            if (loudnessCodecController != null) {
                addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            }
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(((HashSet) frostHunterTraceHyperionAuroraNebula9947.FrostHunterAlertDialogAuroraDelta3200).add(mediaCodec));
        }
        frostHunterMeteringPointDeltaPrimeSolar9676.FrostHunterCameraXPixelTurboCosmos9814 = 1;
    }

    public static String FrostHunterFragmentBetaMegaVortex6025(String str, int i) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterAlertDialogAuroraDelta3200(FrostHunterDialogQuantumTurbo8340 frostHunterDialogQuantumTurbo8340) {
        FrostHunterAssetManagerCelestialShadowInferno9902 frostHunterAssetManagerCelestialShadowInferno9902 = (FrostHunterAssetManagerCelestialShadowInferno9902) this.FrostHunterKeyframeGammaGamma1197;
        FrostHunterDialogQuantumTurbo8340 frostHunterDialogQuantumTurbo83402 = new FrostHunterDialogQuantumTurbo8340(3, this, frostHunterDialogQuantumTurbo8340);
        synchronized (frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterAlphaAnimationNeoCosmos5761) {
            frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            frostHunterDialogQuantumTurbo83402.run();
        }
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterAlphaAnimationNeoCosmos5761() {
        FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947;
        FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula99472;
        try {
            if (this.FrostHunterCameraXPixelTurboCosmos9814 == 1) {
                ((FrostHunterMotionLayoutTransitionEliteSolarMax1226) this.FrostHunterFragmentBetaMegaVortex6025).shutdown();
                FrostHunterAssetManagerCelestialShadowInferno9902 frostHunterAssetManagerCelestialShadowInferno9902 = (FrostHunterAssetManagerCelestialShadowInferno9902) this.FrostHunterKeyframeGammaGamma1197;
                synchronized (frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterAlphaAnimationNeoCosmos5761) {
                    frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterServiceConnectionTurboPhoenixOmega6719 = true;
                    frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterConstraintSetCloneMasterUltraRogue2633.quit();
                    frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterAlphaAnimationNeoCosmos5761();
                }
            }
            this.FrostHunterCameraXPixelTurboCosmos9814 = 2;
            if (this.FrostHunterFlowMaxDragonHero5809) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    ((MediaCodec) this.FrostHunterAlertDialogAuroraDelta3200).stop();
                }
                if (i >= 35 && (frostHunterTraceHyperionAuroraNebula99472 = (FrostHunterTraceHyperionAuroraNebula9947) this.FrostHunterServiceConnectionTurboPhoenixOmega6719) != null) {
                    frostHunterTraceHyperionAuroraNebula99472.FrostHunterMotionSceneAuroraMega2271((MediaCodec) this.FrostHunterAlertDialogAuroraDelta3200);
                }
                ((MediaCodec) this.FrostHunterAlertDialogAuroraDelta3200).release();
                this.FrostHunterFlowMaxDragonHero5809 = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.FrostHunterFlowMaxDragonHero5809) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        ((MediaCodec) this.FrostHunterAlertDialogAuroraDelta3200).stop();
                    }
                    if (i2 >= 35 && (frostHunterTraceHyperionAuroraNebula9947 = (FrostHunterTraceHyperionAuroraNebula9947) this.FrostHunterServiceConnectionTurboPhoenixOmega6719) != null) {
                        frostHunterTraceHyperionAuroraNebula9947.FrostHunterMotionSceneAuroraMega2271((MediaCodec) this.FrostHunterAlertDialogAuroraDelta3200);
                    }
                    ((MediaCodec) this.FrostHunterAlertDialogAuroraDelta3200).release();
                    this.FrostHunterFlowMaxDragonHero5809 = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterBitmapTurboDeltaNebula8743(ArrayList arrayList) {
        ((MediaCodec) this.FrostHunterAlertDialogAuroraDelta3200).subscribeToVendorParameters(arrayList);
    }

    public boolean FrostHunterBundlePulseFusionHero2475(int i, int i2) {
        FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike7090 = (FrostHunterObjectAnimatorNeoStrike7090) this.FrostHunterKeyframeGammaGamma1197;
        int i3 = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterVibratorFusionEclipse6823 frostHunterVibratorFusionEclipse6823 = (FrostHunterVibratorFusionEclipse6823) frostHunterObjectAnimatorNeoStrike7090.FrostHunterCameraXPixelTurboCosmos9814[i + i3];
        FrostHunterVibratorFusionEclipse6823 frostHunterVibratorFusionEclipse68232 = (FrostHunterVibratorFusionEclipse6823) ((FrostHunterObjectAnimatorNeoStrike7090) this.FrostHunterFragmentBetaMegaVortex6025).FrostHunterCameraXPixelTurboCosmos9814[i3 + i2];
        return FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterVibratorFusionEclipse6823, frostHunterVibratorFusionEclipse68232) || frostHunterVibratorFusionEclipse6823.getClass() == frostHunterVibratorFusionEclipse68232.getClass();
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterCameraXPixelTurboCosmos9814(int i) {
        ((MediaCodec) this.FrostHunterAlertDialogAuroraDelta3200).releaseOutputBuffer(i, false);
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public ByteBuffer FrostHunterCameraXTurboCelestialHero5430(int i) {
        return ((MediaCodec) this.FrostHunterAlertDialogAuroraDelta3200).getOutputBuffer(i);
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterLocationManagerBlazeTitanium3991 frostHunterLocationManagerBlazeTitanium3991, Handler handler) {
        ((MediaCodec) this.FrostHunterAlertDialogAuroraDelta3200).setOnFrameRenderedListener(new FrostHunterOnItemLongClickListenerForcePhantom5597(this, frostHunterLocationManagerBlazeTitanium3991, 0), handler);
    }

    public FrostHunterIntentForceSpeed4935 FrostHunterFlowMaxDragonHero5809() {
        Intent intent = (Intent) this.FrostHunterAlertDialogAuroraDelta3200;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.FrostHunterFlowMaxDragonHero5809);
        ((FrostHunterBottomSheetEclipseUltraShadow6009) this.FrostHunterKeyframeGammaGamma1197).getClass();
        intent.putExtras(new Bundle());
        Bundle bundle2 = (Bundle) this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.FrostHunterCameraXPixelTurboCosmos9814);
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            if (((ActivityOptions) this.FrostHunterFragmentBetaMegaVortex6025) == null) {
                this.FrostHunterFragmentBetaMegaVortex6025 = ActivityOptions.makeBasic();
            }
            FrostHunterTextWatcherMasterHyperionHyperion1994.FrostHunterCameraXPixelTurboCosmos9814((ActivityOptions) this.FrostHunterFragmentBetaMegaVortex6025);
        }
        if (i >= 36) {
            if (((ActivityOptions) this.FrostHunterFragmentBetaMegaVortex6025) == null) {
                this.FrostHunterFragmentBetaMegaVortex6025 = ActivityOptions.makeBasic();
            }
            FrostHunterJavaSpeedShadowPrime9230.FrostHunterLifecycleBlazeGammaElite2889((ActivityOptions) this.FrostHunterFragmentBetaMegaVortex6025, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        ActivityOptions activityOptions = (ActivityOptions) this.FrostHunterFragmentBetaMegaVortex6025;
        return new FrostHunterIntentForceSpeed4935(13, intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterKeyframeGammaGamma1197(int i) {
        ((MediaCodec) this.FrostHunterAlertDialogAuroraDelta3200).setVideoScalingMode(i);
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterLevelListDrawableFusionDragonHero2232(int i, int i2, long j, int i3) {
        ((FrostHunterMotionLayoutTransitionEliteSolarMax1226) this.FrostHunterFragmentBetaMegaVortex6025).FrostHunterLevelListDrawableFusionDragonHero2232(i, i2, j, i3);
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterLifecycleBlazeGammaElite2889(int i, FrostHunterObjectDetectionDeltaQuantumHyperion3304 frostHunterObjectDetectionDeltaQuantumHyperion3304, long j, int i2) {
        ((FrostHunterMotionLayoutTransitionEliteSolarMax1226) this.FrostHunterFragmentBetaMegaVortex6025).FrostHunterLifecycleBlazeGammaElite2889(i, frostHunterObjectDetectionDeltaQuantumHyperion3304, j, i2);
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterLightSensorForceFusion4241() {
        ((MediaCodec) this.FrostHunterAlertDialogAuroraDelta3200).detachOutputSurface();
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterLintTitanVortexQuantum9911(Surface surface) {
        ((MediaCodec) this.FrostHunterAlertDialogAuroraDelta3200).setOutputSurface(surface);
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterLooperHyperionForce4133(ArrayList arrayList) {
        ((MediaCodec) this.FrostHunterAlertDialogAuroraDelta3200).unsubscribeFromVendorParameters(arrayList);
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterLooperThreadBetaHyperionMax1000(int i, long j) {
        ((MediaCodec) this.FrostHunterAlertDialogAuroraDelta3200).releaseOutputBuffer(i, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0028, DONT_GENERATE, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x000e, B:6:0x001b, B:12:0x0026, B:15:0x002a, B:20:0x0044, B:23:0x0038, B:24:0x0046, B:25:0x004b), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x000e, B:6:0x001b, B:12:0x0026, B:15:0x002a, B:20:0x0044, B:23:0x0038, B:24:0x0046, B:25:0x004b), top: B:3:0x000e }] */
    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int FrostHunterMotionSceneAuroraMega2271() {
        boolean z;
        ((FrostHunterMotionLayoutTransitionEliteSolarMax1226) this.FrostHunterFragmentBetaMegaVortex6025).FrostHunterFragmentBetaMegaVortex6025();
        FrostHunterAssetManagerCelestialShadowInferno9902 frostHunterAssetManagerCelestialShadowInferno9902 = (FrostHunterAssetManagerCelestialShadowInferno9902) this.FrostHunterKeyframeGammaGamma1197;
        synchronized (frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterAlphaAnimationNeoCosmos5761) {
            try {
                frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                if (frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterFragmentBetaMegaVortex6025 <= 0 && !frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                    z = false;
                    int i = -1;
                    if (!z) {
                        return -1;
                    }
                    FrostHunterChipPixelTurboBeta1817 frostHunterChipPixelTurboBeta1817 = frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterServiceEliteCelestialThunder1757;
                    int i2 = frostHunterChipPixelTurboBeta1817.FrostHunterAlphaAnimationNeoCosmos5761;
                    int i3 = frostHunterChipPixelTurboBeta1817.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    if (!(i2 == i3)) {
                        if (i2 == i3) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i = ((int[]) frostHunterChipPixelTurboBeta1817.FrostHunterServiceEliteCelestialThunder1757)[i2];
                        frostHunterChipPixelTurboBeta1817.FrostHunterAlphaAnimationNeoCosmos5761 = (i2 + 1) & frostHunterChipPixelTurboBeta1817.FrostHunterBundlePulseFusionHero2475;
                    }
                    return i;
                }
                z = true;
                int i4 = -1;
                if (!z) {
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0028, DONT_GENERATE, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x000e, B:6:0x001b, B:12:0x0026, B:15:0x002b, B:19:0x0036, B:22:0x003a, B:24:0x0048, B:25:0x006f, B:29:0x0065, B:30:0x0071, B:31:0x0076), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x000e, B:6:0x001b, B:12:0x0026, B:15:0x002b, B:19:0x0036, B:22:0x003a, B:24:0x0048, B:25:0x006f, B:29:0x0065, B:30:0x0071, B:31:0x0076), top: B:3:0x000e }] */
    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int FrostHunterRemoteConfigSpeedSpeed8566(MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        ((FrostHunterMotionLayoutTransitionEliteSolarMax1226) this.FrostHunterFragmentBetaMegaVortex6025).FrostHunterFragmentBetaMegaVortex6025();
        FrostHunterAssetManagerCelestialShadowInferno9902 frostHunterAssetManagerCelestialShadowInferno9902 = (FrostHunterAssetManagerCelestialShadowInferno9902) this.FrostHunterKeyframeGammaGamma1197;
        synchronized (frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterAlphaAnimationNeoCosmos5761) {
            try {
                frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                if (frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterFragmentBetaMegaVortex6025 <= 0 && !frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                    z = false;
                    if (!z) {
                        return -1;
                    }
                    FrostHunterChipPixelTurboBeta1817 frostHunterChipPixelTurboBeta1817 = frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterLifecycleBlazeGammaElite2889;
                    int i = frostHunterChipPixelTurboBeta1817.FrostHunterAlphaAnimationNeoCosmos5761;
                    int i2 = frostHunterChipPixelTurboBeta1817.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    if (i == i2) {
                        return -1;
                    }
                    if (i == i2) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    int i3 = ((int[]) frostHunterChipPixelTurboBeta1817.FrostHunterServiceEliteCelestialThunder1757)[i];
                    frostHunterChipPixelTurboBeta1817.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterChipPixelTurboBeta1817.FrostHunterBundlePulseFusionHero2475 & (i + 1);
                    if (i3 >= 0) {
                        frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterCameraXPixelTurboCosmos9814.getClass();
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterLevelListDrawableFusionDragonHero2232.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (i3 == -2) {
                        frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterCameraXPixelTurboCosmos9814 = (MediaFormat) frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterRemoteConfigSpeedSpeed8566.remove();
                    }
                    return i3;
                }
                z = true;
                if (!z) {
                }
            } finally {
            }
        }
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public boolean FrostHunterResourcesTitanHyperVision5823(FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956) {
        FrostHunterAssetManagerCelestialShadowInferno9902 frostHunterAssetManagerCelestialShadowInferno9902 = (FrostHunterAssetManagerCelestialShadowInferno9902) this.FrostHunterKeyframeGammaGamma1197;
        synchronized (frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterAlphaAnimationNeoCosmos5761) {
            frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterScaleAnimationStrikeSpark5059 = frostHunterSQLiteMasterUltra9956;
        }
        return true;
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public ByteBuffer FrostHunterScaleAnimationStrikeSpark5059(int i) {
        return ((MediaCodec) this.FrostHunterAlertDialogAuroraDelta3200).getInputBuffer(i);
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public MediaFormat FrostHunterServiceConnectionTurboPhoenixOmega6719() {
        MediaFormat mediaFormat;
        FrostHunterAssetManagerCelestialShadowInferno9902 frostHunterAssetManagerCelestialShadowInferno9902 = (FrostHunterAssetManagerCelestialShadowInferno9902) this.FrostHunterKeyframeGammaGamma1197;
        synchronized (frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterAlphaAnimationNeoCosmos5761) {
            try {
                mediaFormat = frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterCameraXPixelTurboCosmos9814;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterServiceEliteCelestialThunder1757(Bundle bundle) {
        ((FrostHunterMotionLayoutTransitionEliteSolarMax1226) this.FrostHunterFragmentBetaMegaVortex6025).FrostHunterServiceEliteCelestialThunder1757(bundle);
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void flush() {
        ((FrostHunterMotionLayoutTransitionEliteSolarMax1226) this.FrostHunterFragmentBetaMegaVortex6025).flush();
        ((MediaCodec) this.FrostHunterAlertDialogAuroraDelta3200).flush();
        FrostHunterAssetManagerCelestialShadowInferno9902 frostHunterAssetManagerCelestialShadowInferno9902 = (FrostHunterAssetManagerCelestialShadowInferno9902) this.FrostHunterKeyframeGammaGamma1197;
        synchronized (frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterAlphaAnimationNeoCosmos5761) {
            frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterFragmentBetaMegaVortex6025++;
            Handler handler = frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterBundlePulseFusionHero2475;
            String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
            handler.post(new FrostHunterFilterAlphaSparkSpeed9857(3, frostHunterAssetManagerCelestialShadowInferno9902));
        }
        ((MediaCodec) this.FrostHunterAlertDialogAuroraDelta3200).start();
    }
}
