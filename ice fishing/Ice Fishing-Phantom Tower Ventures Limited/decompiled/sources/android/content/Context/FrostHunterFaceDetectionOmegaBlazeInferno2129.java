package android.content.Context;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFaceDetectionOmegaBlazeInferno2129 extends FrostHunterResourceThunderSolarForce1212 {
    public final Choreographer FrostHunterAlertDialogAuroraDelta3200;
    public boolean FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public final Handler FrostHunterKeyframeGammaGamma1197;
    public boolean FrostHunterLintTitanVortexQuantum9911;
    public final FrostHunterMapPhoenixEpicOmega9434 FrostHunterResourcesTitanHyperVision5823;
    public static final FrostHunterSharedFlowTitaniumBeta1713 FrostHunterTextViewDragonStormMega4297 = new FrostHunterSharedFlowTitaniumBeta1713(FrostHunterPreviewMaxRogue1811.FrostHunterLintTitanVortexQuantum9911);
    public static final FrostHunterChipGroupPhantomNovaPixel7139 FrostHunterLooperThreadBetaHyperionMax1000 = new FrostHunterChipGroupPhantomNovaPixel7139(0);
    public final Object FrostHunterFragmentBetaMegaVortex6025 = new Object();
    public final FrostHunterAccelerometerNeoAurora1913 FrostHunterServiceConnectionTurboPhoenixOmega6719 = new FrostHunterAccelerometerNeoAurora1913();
    public ArrayList FrostHunterLightSensorForceFusion4241 = new ArrayList();
    public ArrayList FrostHunterScaleAnimationStrikeSpark5059 = new ArrayList();
    public final FrostHunterMotionLayoutFusionForce8450 FrostHunterCameraXTurboCelestialHero5430 = new FrostHunterMotionLayoutFusionForce8450(this);

    public FrostHunterFaceDetectionOmegaBlazeInferno2129(Choreographer choreographer, Handler handler) {
        this.FrostHunterAlertDialogAuroraDelta3200 = choreographer;
        this.FrostHunterKeyframeGammaGamma1197 = handler;
        this.FrostHunterResourcesTitanHyperVision5823 = new FrostHunterMapPhoenixEpicOmega9434(choreographer, this);
    }

    public static final void FrostHunterStateCelestialNovaPixel8414(FrostHunterFaceDetectionOmegaBlazeInferno2129 frostHunterFaceDetectionOmegaBlazeInferno2129) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (frostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterFragmentBetaMegaVortex6025) {
                FrostHunterAccelerometerNeoAurora1913 frostHunterAccelerometerNeoAurora1913 = frostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                runnable = (Runnable) (frostHunterAccelerometerNeoAurora1913.isEmpty() ? null : frostHunterAccelerometerNeoAurora1913.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (frostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterFragmentBetaMegaVortex6025) {
                    FrostHunterAccelerometerNeoAurora1913 frostHunterAccelerometerNeoAurora19132 = frostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                    runnable = (Runnable) (frostHunterAccelerometerNeoAurora19132.isEmpty() ? null : frostHunterAccelerometerNeoAurora19132.removeFirst());
                }
            }
            synchronized (frostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterFragmentBetaMegaVortex6025) {
                if (frostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterServiceConnectionTurboPhoenixOmega6719.isEmpty()) {
                    z = false;
                    frostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // android.content.Context.FrostHunterResourceThunderSolarForce1212
    public final void FrostHunterMeteringPointMegaCyber7955(FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615, Runnable runnable) {
        synchronized (this.FrostHunterFragmentBetaMegaVortex6025) {
            this.FrostHunterServiceConnectionTurboPhoenixOmega6719.addLast(runnable);
            if (!this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) {
                this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = true;
                this.FrostHunterKeyframeGammaGamma1197.post(this.FrostHunterCameraXTurboCelestialHero5430);
                if (!this.FrostHunterLintTitanVortexQuantum9911) {
                    this.FrostHunterLintTitanVortexQuantum9911 = true;
                    this.FrostHunterAlertDialogAuroraDelta3200.postFrameCallback(this.FrostHunterCameraXTurboCelestialHero5430);
                }
            }
        }
    }
}
