package android.content.Context;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDigitalInkRecognitionSpectraSpectra5296 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public boolean FrostHunterAlertDialogAuroraDelta3200;
    public final long FrostHunterCameraXPixelTurboCosmos9814 = SystemClock.uptimeMillis() + 10000;
    public Runnable FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ ComponentActivity FrostHunterKeyframeGammaGamma1197;

    public FrostHunterDigitalInkRecognitionSpectraSpectra5296(ComponentActivity componentActivity) {
        this.FrostHunterKeyframeGammaGamma1197 = componentActivity;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(View view) {
        if (this.FrostHunterAlertDialogAuroraDelta3200) {
            return;
        }
        this.FrostHunterAlertDialogAuroraDelta3200 = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.FrostHunterFlowMaxDragonHero5809 = runnable;
        View decorView = this.FrostHunterKeyframeGammaGamma1197.getWindow().getDecorView();
        decorView.getClass();
        if (!this.FrostHunterAlertDialogAuroraDelta3200) {
            decorView.postOnAnimation(new FrostHunterFilterAlphaSparkSpeed9857(8, this));
        } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.FrostHunterFlowMaxDragonHero5809;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.FrostHunterCameraXPixelTurboCosmos9814) {
                this.FrostHunterAlertDialogAuroraDelta3200 = false;
                this.FrostHunterKeyframeGammaGamma1197.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.FrostHunterFlowMaxDragonHero5809 = null;
        FrostHunterProcessCameraProviderAlphaFusionSpectra5341 frostHunterProcessCameraProviderAlphaFusionSpectra5341 = (FrostHunterProcessCameraProviderAlphaFusionSpectra5341) this.FrostHunterKeyframeGammaGamma1197.FrostHunterLightSensorForceFusion4241.getValue();
        synchronized (frostHunterProcessCameraProviderAlphaFusionSpectra5341.FrostHunterAlphaAnimationNeoCosmos5761) {
            z = frostHunterProcessCameraProviderAlphaFusionSpectra5341.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        }
        if (z) {
            this.FrostHunterAlertDialogAuroraDelta3200 = false;
            this.FrostHunterKeyframeGammaGamma1197.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.FrostHunterKeyframeGammaGamma1197.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
