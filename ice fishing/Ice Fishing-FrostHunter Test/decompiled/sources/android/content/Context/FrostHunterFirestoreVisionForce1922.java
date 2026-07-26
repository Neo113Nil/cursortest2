package android.content.Context;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFirestoreVisionForce1922 {
    public final Context FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterCoroutineScopeSpeedSparkAlpha3670 FrostHunterBundlePulseFusionHero2475;
    public final FrostHunterServiceConnectionCelestialSolarHyper3643 FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterCamera2PixelSpectraAlpha7690 FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final ScheduledThreadPoolExecutor FrostHunterLevelListDrawableFusionDragonHero2232;
    public final FrostHunterViewPager2SpectraForceVortex4544 FrostHunterLifecycleBlazeGammaElite2889 = new FrostHunterViewPager2SpectraForceVortex4544(0);
    public boolean FrostHunterRemoteConfigSpeedSpeed8566 = false;
    public final FirebaseMessaging FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterFirestoreVisionForce1922(FirebaseMessaging firebaseMessaging, FrostHunterCamera2PixelSpectraAlpha7690 frostHunterCamera2PixelSpectraAlpha7690, FrostHunterServiceConnectionCelestialSolarHyper3643 frostHunterServiceConnectionCelestialSolarHyper3643, FrostHunterCoroutineScopeSpeedSparkAlpha3670 frostHunterCoroutineScopeSpeedSparkAlpha3670, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.FrostHunterServiceEliteCelestialThunder1757 = firebaseMessaging;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterCamera2PixelSpectraAlpha7690;
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterServiceConnectionCelestialSolarHyper3643;
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterCoroutineScopeSpeedSparkAlpha3670;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = context;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = scheduledThreadPoolExecutor;
    }

    public static void FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterGradientDrawablePrimeSpectraUltra1716 frostHunterGradientDrawablePrimeSpectraUltra1716) {
        try {
            FrostHunterChipNovaPhantomElite7665.FrostHunterServiceEliteCelestialThunder1757(frostHunterGradientDrawablePrimeSpectraUltra1716, 30L);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void FrostHunterBundlePulseFusionHero2475(String str) {
        String FrostHunterAlphaAnimationNeoCosmos5761 = this.FrostHunterServiceEliteCelestialThunder1757.FrostHunterAlphaAnimationNeoCosmos5761();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        FrostHunterCoroutineScopeSpeedSparkAlpha3670 frostHunterCoroutineScopeSpeedSparkAlpha3670 = this.FrostHunterBundlePulseFusionHero2475;
        FrostHunterAlphaAnimationNeoCosmos5761(frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterFlowMaxDragonHero5809(frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterScaleAnimationStrikeSpark5059(FrostHunterAlphaAnimationNeoCosmos5761, "/topics/" + str, bundle)));
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(String str) {
        String FrostHunterAlphaAnimationNeoCosmos5761 = this.FrostHunterServiceEliteCelestialThunder1757.FrostHunterAlphaAnimationNeoCosmos5761();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        FrostHunterCoroutineScopeSpeedSparkAlpha3670 frostHunterCoroutineScopeSpeedSparkAlpha3670 = this.FrostHunterBundlePulseFusionHero2475;
        FrostHunterAlphaAnimationNeoCosmos5761(frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterFlowMaxDragonHero5809(frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterScaleAnimationStrikeSpark5059(FrostHunterAlphaAnimationNeoCosmos5761, "/topics/" + str, bundle)));
    }

    public final void FrostHunterLevelListDrawableFusionDragonHero2232(long j) {
        this.FrostHunterLevelListDrawableFusionDragonHero2232.schedule(new com.google.firebase.messaging.FrostHunterAdapterDelegateNebulaRogue3354(this, this.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        FrostHunterServiceEliteCelestialThunder1757(true);
    }

    public final boolean FrostHunterLifecycleBlazeGammaElite2889() {
        FrostHunterChipGroupDragonElite7468 FrostHunterAlphaAnimationNeoCosmos5761;
        while (true) {
            synchronized (this) {
                try {
                    FrostHunterAlphaAnimationNeoCosmos5761 = this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlphaAnimationNeoCosmos5761();
                    if (FrostHunterAlphaAnimationNeoCosmos5761 == null) {
                        return true;
                    }
                } finally {
                }
            }
            try {
                String str = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                String str2 = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        FrostHunterBundlePulseFusionHero2475(str2);
                    }
                } else if (str.equals("S")) {
                    FrostHunterConstraintSetCloneMasterUltraRogue2633(str2);
                }
                FrostHunterServiceConnectionCelestialSolarHyper3643 frostHunterServiceConnectionCelestialSolarHyper3643 = this.FrostHunterCameraXPixelTurboCosmos9814;
                synchronized (frostHunterServiceConnectionCelestialSolarHyper3643) {
                    FrostHunterOnItemLongClickListenerRogueDeltaStrike7658 frostHunterOnItemLongClickListenerRogueDeltaStrike7658 = frostHunterServiceConnectionCelestialSolarHyper3643.FrostHunterAlphaAnimationNeoCosmos5761;
                    String str3 = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterBundlePulseFusionHero2475;
                    synchronized (((ArrayDeque) frostHunterOnItemLongClickListenerRogueDeltaStrike7658.FrostHunterKeyframeGammaGamma1197)) {
                        if (((ArrayDeque) frostHunterOnItemLongClickListenerRogueDeltaStrike7658.FrostHunterKeyframeGammaGamma1197).remove(str3)) {
                            ((ScheduledThreadPoolExecutor) frostHunterOnItemLongClickListenerRogueDeltaStrike7658.FrostHunterFragmentBetaMegaVortex6025).execute(new FrostHunterFilterAlphaSparkSpeed9857(24, frostHunterOnItemLongClickListenerRogueDeltaStrike7658));
                        }
                    }
                }
                synchronized (this.FrostHunterLifecycleBlazeGammaElite2889) {
                    try {
                        String str4 = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterBundlePulseFusionHero2475;
                        if (this.FrostHunterLifecycleBlazeGammaElite2889.containsKey(str4)) {
                            ArrayDeque arrayDeque = (ArrayDeque) this.FrostHunterLifecycleBlazeGammaElite2889.get(str4);
                            FrostHunterIntentBetaElite8730 frostHunterIntentBetaElite8730 = (FrostHunterIntentBetaElite8730) arrayDeque.poll();
                            if (frostHunterIntentBetaElite8730 != null) {
                                frostHunterIntentBetaElite8730.FrostHunterAlphaAnimationNeoCosmos5761(null);
                            }
                            if (arrayDeque.isEmpty()) {
                                this.FrostHunterLifecycleBlazeGammaElite2889.remove(str4);
                            }
                        }
                    } finally {
                    }
                }
            } catch (IOException e) {
                if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage()) || "TOO_MANY_SUBSCRIBERS".equals(e.getMessage())) {
                    e.getMessage();
                    return false;
                }
                if (e.getMessage() == null) {
                    return false;
                }
                throw e;
            }
        }
    }

    public final synchronized void FrostHunterServiceEliteCelestialThunder1757(boolean z) {
        this.FrostHunterRemoteConfigSpeedSpeed8566 = z;
    }
}
