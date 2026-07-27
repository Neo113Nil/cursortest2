package android.content.Context;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAudioManagerNovaNovaXAurora2834 implements FrostHunterAnimatorAlphaBetaNeo3591 {
    public Object FrostHunterAlertDialogAuroraDelta3200;
    public boolean FrostHunterCameraXPixelTurboCosmos9814;
    public final Object FrostHunterFlowMaxDragonHero5809;
    public Object FrostHunterKeyframeGammaGamma1197;

    public FrostHunterAudioManagerNovaNovaXAurora2834(Context context, Runnable runnable, Boolean bool) {
        Spatializer spatializer;
        int immersiveAudioLevel;
        AudioManager FrostHunterMeteringPointBetaCyber9571 = context == null ? null : FrostHunterTransitionGammaTitanSpeed7178.FrostHunterMeteringPointBetaCyber9571(context);
        if (FrostHunterMeteringPointBetaCyber9571 == null || (bool != null && bool.booleanValue())) {
            this.FrostHunterFlowMaxDragonHero5809 = null;
            this.FrostHunterCameraXPixelTurboCosmos9814 = false;
            this.FrostHunterAlertDialogAuroraDelta3200 = null;
            this.FrostHunterKeyframeGammaGamma1197 = null;
            return;
        }
        spatializer = FrostHunterMeteringPointBetaCyber9571.getSpatializer();
        this.FrostHunterFlowMaxDragonHero5809 = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.FrostHunterCameraXPixelTurboCosmos9814 = immersiveAudioLevel != 0;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        Handler handler = new Handler(myLooper);
        this.FrostHunterAlertDialogAuroraDelta3200 = handler;
        FrostHunterBarcodeScannerLegendPhantomTurbo1194 frostHunterBarcodeScannerLegendPhantomTurbo1194 = new FrostHunterBarcodeScannerLegendPhantomTurbo1194(runnable);
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterBarcodeScannerLegendPhantomTurbo1194;
        spatializer.addOnSpatializerStateChangedListener(new FrostHunterOnItemLongClickListenerTitanMegaMaster3013(0, handler), frostHunterBarcodeScannerLegendPhantomTurbo1194);
    }

    public static IOException FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterAudioManagerNovaNovaXAurora2834 frostHunterAudioManagerNovaNovaXAurora2834, boolean z, IOException iOException, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        if (iOException != null) {
            frostHunterAudioManagerNovaNovaXAurora2834.FrostHunterAlertDialogAuroraDelta3200(iOException);
        }
        return ((FrostHunterSurfaceViewPrimeAlphaPulse4865) frostHunterAudioManagerNovaNovaXAurora2834.FrostHunterFlowMaxDragonHero5809).FrostHunterCameraXPixelTurboCosmos9814(frostHunterAudioManagerNovaNovaXAurora2834, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    public void FrostHunterAlertDialogAuroraDelta3200(IOException iOException) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = true;
        ((FrostHunterLayoutInflaterNovaXTitan5170) this.FrostHunterKeyframeGammaGamma1197).FrostHunterLifecycleBlazeGammaElite2889().FrostHunterRemoteConfigSpeedSpeed8566((FrostHunterSurfaceViewPrimeAlphaPulse4865) this.FrostHunterFlowMaxDragonHero5809, iOException);
    }

    @Override // android.content.Context.FrostHunterAnimatorAlphaBetaNeo3591
    public void FrostHunterBundlePulseFusionHero2475() {
        SparseArray sparseArray = (SparseArray) this.FrostHunterKeyframeGammaGamma1197;
        ((FrostHunterAnimatorAlphaBetaNeo3591) this.FrostHunterFlowMaxDragonHero5809).FrostHunterBundlePulseFusionHero2475();
        if (this.FrostHunterCameraXPixelTurboCosmos9814) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((FrostHunterNestedScrollViewInfernoMegaTitanium3874) sparseArray.valueAt(i)).FrostHunterFlowMaxDragonHero5809 = true;
            }
        }
    }

    public Boolean FrostHunterCameraXPixelTurboCosmos9814() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        com.google.firebase.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754 = ((FirebaseMessaging) this.FrostHunterKeyframeGammaGamma1197).FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761();
        Context context = frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public void FrostHunterConstraintSetCloneMasterUltraRogue2633(boolean z) {
        FrostHunterDialogVisionNova2391 frostHunterDialogVisionNova2391 = (FrostHunterDialogVisionNova2391) this.FrostHunterKeyframeGammaGamma1197;
        synchronized (frostHunterDialogVisionNova2391.FrostHunterScaleAnimationStrikeSpark5059) {
            try {
                if (this.FrostHunterCameraXPixelTurboCosmos9814) {
                    throw new IllegalStateException("editor is closed");
                }
                if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(((FrostHunterMediaPlayerFusionForce5806) this.FrostHunterFlowMaxDragonHero5809).FrostHunterRemoteConfigSpeedSpeed8566, this)) {
                    FrostHunterDialogVisionNova2391.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterDialogVisionNova2391, this, z);
                }
                this.FrostHunterCameraXPixelTurboCosmos9814 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public FrostHunterCountDownTimerSparkStorm4778 FrostHunterFlowMaxDragonHero5809(boolean z) {
        try {
            FrostHunterCountDownTimerSparkStorm4778 FrostHunterAlertDialogAuroraDelta3200 = ((FrostHunterLayoutInflaterNovaXTitan5170) this.FrostHunterKeyframeGammaGamma1197).FrostHunterAlertDialogAuroraDelta3200(z);
            if (FrostHunterAlertDialogAuroraDelta3200 == null) {
                return FrostHunterAlertDialogAuroraDelta3200;
            }
            FrostHunterAlertDialogAuroraDelta3200.FrostHunterLightSensorForceFusion4241 = this;
            return FrostHunterAlertDialogAuroraDelta3200;
        } catch (IOException e) {
            FrostHunterAlertDialogAuroraDelta3200(e);
            throw e;
        }
    }

    @Override // android.content.Context.FrostHunterAnimatorAlphaBetaNeo3591
    public FrostHunterIntentServiceBetaPhoenixSolar4672 FrostHunterFragmentBetaMegaVortex6025(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.FrostHunterKeyframeGammaGamma1197;
        FrostHunterAnimatorAlphaBetaNeo3591 frostHunterAnimatorAlphaBetaNeo3591 = (FrostHunterAnimatorAlphaBetaNeo3591) this.FrostHunterFlowMaxDragonHero5809;
        if (i2 != 3 && i2 != 5) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = true;
        }
        if (i2 != 3) {
            return frostHunterAnimatorAlphaBetaNeo3591.FrostHunterFragmentBetaMegaVortex6025(i, i2);
        }
        FrostHunterNestedScrollViewInfernoMegaTitanium3874 frostHunterNestedScrollViewInfernoMegaTitanium3874 = (FrostHunterNestedScrollViewInfernoMegaTitanium3874) sparseArray.get(i);
        if (frostHunterNestedScrollViewInfernoMegaTitanium3874 != null) {
            return frostHunterNestedScrollViewInfernoMegaTitanium3874;
        }
        FrostHunterNestedScrollViewInfernoMegaTitanium3874 frostHunterNestedScrollViewInfernoMegaTitanium38742 = new FrostHunterNestedScrollViewInfernoMegaTitanium3874(frostHunterAnimatorAlphaBetaNeo3591.FrostHunterFragmentBetaMegaVortex6025(i, i2), (FrostHunterViewOlympianCyberAlpha8933) this.FrostHunterAlertDialogAuroraDelta3200);
        sparseArray.put(i, frostHunterNestedScrollViewInfernoMegaTitanium38742);
        return frostHunterNestedScrollViewInfernoMegaTitanium38742;
    }

    public FrostHunterTraceHyperionAuroraNebula9947 FrostHunterKeyframeGammaGamma1197() {
        FrostHunterSurfaceViewPrimeAlphaPulse4865 frostHunterSurfaceViewPrimeAlphaPulse4865 = (FrostHunterSurfaceViewPrimeAlphaPulse4865) this.FrostHunterFlowMaxDragonHero5809;
        if (frostHunterSurfaceViewPrimeAlphaPulse4865.FrostHunterLintTitanVortexQuantum9911) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Check failed.");
            return null;
        }
        frostHunterSurfaceViewPrimeAlphaPulse4865.FrostHunterLintTitanVortexQuantum9911 = true;
        frostHunterSurfaceViewPrimeAlphaPulse4865.FrostHunterFragmentBetaMegaVortex6025.FrostHunterAlertDialogAuroraDelta3200();
        synchronized (frostHunterSurfaceViewPrimeAlphaPulse4865) {
            if (frostHunterSurfaceViewPrimeAlphaPulse4865.FrostHunterLooperHyperionForce4133 == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (frostHunterSurfaceViewPrimeAlphaPulse4865.FrostHunterLooperThreadBetaHyperionMax1000 || frostHunterSurfaceViewPrimeAlphaPulse4865.FrostHunterMotionSceneAuroraMega2271) {
                throw new IllegalStateException("Check failed.");
            }
            if (frostHunterSurfaceViewPrimeAlphaPulse4865.FrostHunterResourcesTitanHyperVision5823) {
                throw new IllegalStateException("Check failed.");
            }
            if (!frostHunterSurfaceViewPrimeAlphaPulse4865.FrostHunterTextViewDragonStormMega4297) {
                throw new IllegalStateException("Check failed.");
            }
            frostHunterSurfaceViewPrimeAlphaPulse4865.FrostHunterTextViewDragonStormMega4297 = false;
            frostHunterSurfaceViewPrimeAlphaPulse4865.FrostHunterLooperThreadBetaHyperionMax1000 = true;
            frostHunterSurfaceViewPrimeAlphaPulse4865.FrostHunterMotionSceneAuroraMega2271 = true;
        }
        FrostHunterContentResolverOmegaDragon8329 FrostHunterLifecycleBlazeGammaElite2889 = ((FrostHunterLayoutInflaterNovaXTitan5170) this.FrostHunterKeyframeGammaGamma1197).FrostHunterLifecycleBlazeGammaElite2889();
        FrostHunterLifecycleBlazeGammaElite2889.getClass();
        FrostHunterButtonBlazeOmegaVortex4430 frostHunterButtonBlazeOmegaVortex4430 = (FrostHunterButtonBlazeOmegaVortex4430) FrostHunterLifecycleBlazeGammaElite2889;
        frostHunterButtonBlazeOmegaVortex4430.FrostHunterLifecycleBlazeGammaElite2889.setSoTimeout(0);
        frostHunterButtonBlazeOmegaVortex4430.FrostHunterCameraXPixelTurboCosmos9814();
        return new FrostHunterTraceHyperionAuroraNebula9947(this);
    }

    public synchronized boolean FrostHunterLevelListDrawableFusionDragonHero2232() {
        boolean z;
        boolean z2;
        try {
            synchronized (this) {
                try {
                    if (!this.FrostHunterCameraXPixelTurboCosmos9814) {
                        Boolean FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814();
                        this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterCameraXPixelTurboCosmos9814;
                        if (FrostHunterCameraXPixelTurboCosmos9814 == null) {
                            ((FrostHunterColorStateListEpicQuantum4488) ((FrostHunterSurfaceViewStrikeAlphaStrike8734) this.FrostHunterFlowMaxDragonHero5809)).FrostHunterAlphaAnimationNeoCosmos5761(new FrostHunterVibratorSpectraBetaNovaX4683(12));
                        }
                        this.FrostHunterCameraXPixelTurboCosmos9814 = true;
                    }
                } finally {
                }
            }
            return z2;
        } catch (Throwable th) {
            throw th;
        }
        Boolean bool = (Boolean) this.FrostHunterAlertDialogAuroraDelta3200;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            com.google.firebase.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754 = ((FirebaseMessaging) this.FrostHunterKeyframeGammaGamma1197).FrostHunterAlphaAnimationNeoCosmos5761;
            frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761();
            FrostHunterMotionLayoutTransitionAuroraSparkPrime2204 frostHunterMotionLayoutTransitionAuroraSparkPrime2204 = (FrostHunterMotionLayoutTransitionAuroraSparkPrime2204) frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterRemoteConfigSpeedSpeed8566.get();
            synchronized (frostHunterMotionLayoutTransitionAuroraSparkPrime2204) {
                z = frostHunterMotionLayoutTransitionAuroraSparkPrime2204.FrostHunterAlphaAnimationNeoCosmos5761;
            }
            z2 = z;
        }
        return z2;
    }

    public FrostHunterButtonBlazeOmegaVortex4430 FrostHunterLifecycleBlazeGammaElite2889() {
        FrostHunterContentResolverOmegaDragon8329 FrostHunterLifecycleBlazeGammaElite2889 = ((FrostHunterLayoutInflaterNovaXTitan5170) this.FrostHunterKeyframeGammaGamma1197).FrostHunterLifecycleBlazeGammaElite2889();
        FrostHunterButtonBlazeOmegaVortex4430 frostHunterButtonBlazeOmegaVortex4430 = FrostHunterLifecycleBlazeGammaElite2889 instanceof FrostHunterButtonBlazeOmegaVortex4430 ? (FrostHunterButtonBlazeOmegaVortex4430) FrostHunterLifecycleBlazeGammaElite2889 : null;
        if (frostHunterButtonBlazeOmegaVortex4430 != null) {
            return frostHunterButtonBlazeOmegaVortex4430;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("no connection for CONNECT tunnels");
        return null;
    }

    @Override // android.content.Context.FrostHunterAnimatorAlphaBetaNeo3591
    public void FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterGeocoderHyperionTitan2118 frostHunterGeocoderHyperionTitan2118) {
        ((FrostHunterAnimatorAlphaBetaNeo3591) this.FrostHunterFlowMaxDragonHero5809).FrostHunterRemoteConfigSpeedSpeed8566(frostHunterGeocoderHyperionTitan2118);
    }

    public FrostHunterCoroutineScopePrimeSpark1417 FrostHunterServiceEliteCelestialThunder1757(int i) {
        FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark1417;
        FrostHunterDialogVisionNova2391 frostHunterDialogVisionNova2391 = (FrostHunterDialogVisionNova2391) this.FrostHunterKeyframeGammaGamma1197;
        synchronized (frostHunterDialogVisionNova2391.FrostHunterScaleAnimationStrikeSpark5059) {
            if (this.FrostHunterCameraXPixelTurboCosmos9814) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.FrostHunterAlertDialogAuroraDelta3200)[i] = true;
            Object obj = ((FrostHunterMediaPlayerFusionForce5806) this.FrostHunterFlowMaxDragonHero5809).FrostHunterServiceEliteCelestialThunder1757.get(i);
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLooperHyperionForce4133(frostHunterDialogVisionNova2391.FrostHunterDialogFragmentTurboPhoenixDragon7627, (FrostHunterCoroutineScopePrimeSpark1417) obj);
            frostHunterCoroutineScopePrimeSpark1417 = (FrostHunterCoroutineScopePrimeSpark1417) obj;
        }
        return frostHunterCoroutineScopePrimeSpark1417;
    }

    public FrostHunterAudioManagerNovaNovaXAurora2834(FrostHunterSurfaceViewPrimeAlphaPulse4865 frostHunterSurfaceViewPrimeAlphaPulse4865, FrostHunterOnAttachStateChangeListenerElitePrimeBeta7473 frostHunterOnAttachStateChangeListenerElitePrimeBeta7473, FrostHunterLayoutInflaterNovaXTitan5170 frostHunterLayoutInflaterNovaXTitan5170) {
        frostHunterOnAttachStateChangeListenerElitePrimeBeta7473.getClass();
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterSurfaceViewPrimeAlphaPulse4865;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterOnAttachStateChangeListenerElitePrimeBeta7473;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterLayoutInflaterNovaXTitan5170;
    }

    public FrostHunterAudioManagerNovaNovaXAurora2834(FrostHunterAnimatorAlphaBetaNeo3591 frostHunterAnimatorAlphaBetaNeo3591, FrostHunterViewOlympianCyberAlpha8933 frostHunterViewOlympianCyberAlpha8933) {
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterAnimatorAlphaBetaNeo3591;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterViewOlympianCyberAlpha8933;
        this.FrostHunterKeyframeGammaGamma1197 = new SparseArray();
    }

    public FrostHunterAudioManagerNovaNovaXAurora2834() {
        this.FrostHunterFlowMaxDragonHero5809 = new Object();
        this.FrostHunterAlertDialogAuroraDelta3200 = new ArrayList();
        this.FrostHunterKeyframeGammaGamma1197 = new ArrayList();
        this.FrostHunterCameraXPixelTurboCosmos9814 = true;
    }

    public FrostHunterAudioManagerNovaNovaXAurora2834(FrostHunterDialogVisionNova2391 frostHunterDialogVisionNova2391, FrostHunterMediaPlayerFusionForce5806 frostHunterMediaPlayerFusionForce5806) {
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterDialogVisionNova2391;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterMediaPlayerFusionForce5806;
        this.FrostHunterAlertDialogAuroraDelta3200 = new boolean[2];
    }

    public FrostHunterAudioManagerNovaNovaXAurora2834(FirebaseMessaging firebaseMessaging, FrostHunterSurfaceViewStrikeAlphaStrike8734 frostHunterSurfaceViewStrikeAlphaStrike8734) {
        this.FrostHunterKeyframeGammaGamma1197 = firebaseMessaging;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterSurfaceViewStrikeAlphaStrike8734;
    }
}
