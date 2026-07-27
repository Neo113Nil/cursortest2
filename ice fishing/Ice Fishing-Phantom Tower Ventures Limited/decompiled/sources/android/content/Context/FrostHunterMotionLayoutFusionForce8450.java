package android.content.Context;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMotionLayoutFusionForce8450 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ FrostHunterFaceDetectionOmegaBlazeInferno2129 FrostHunterCameraXPixelTurboCosmos9814;

    public FrostHunterMotionLayoutFusionForce8450(FrostHunterFaceDetectionOmegaBlazeInferno2129 frostHunterFaceDetectionOmegaBlazeInferno2129) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterFaceDetectionOmegaBlazeInferno2129;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterKeyframeGammaGamma1197.removeCallbacks(this);
        FrostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterStateCelestialNovaPixel8414(this.FrostHunterCameraXPixelTurboCosmos9814);
        FrostHunterFaceDetectionOmegaBlazeInferno2129 frostHunterFaceDetectionOmegaBlazeInferno2129 = this.FrostHunterCameraXPixelTurboCosmos9814;
        synchronized (frostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterFragmentBetaMegaVortex6025) {
            if (frostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterLintTitanVortexQuantum9911) {
                frostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterLintTitanVortexQuantum9911 = false;
                ArrayList arrayList = frostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterLightSensorForceFusion4241;
                frostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterLightSensorForceFusion4241 = frostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterScaleAnimationStrikeSpark5059;
                frostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterScaleAnimationStrikeSpark5059 = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterStateCelestialNovaPixel8414(this.FrostHunterCameraXPixelTurboCosmos9814);
        FrostHunterFaceDetectionOmegaBlazeInferno2129 frostHunterFaceDetectionOmegaBlazeInferno2129 = this.FrostHunterCameraXPixelTurboCosmos9814;
        synchronized (frostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterFragmentBetaMegaVortex6025) {
            if (frostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterLightSensorForceFusion4241.isEmpty()) {
                frostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterAlertDialogAuroraDelta3200.removeFrameCallback(this);
                frostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterLintTitanVortexQuantum9911 = false;
            }
        }
    }
}
