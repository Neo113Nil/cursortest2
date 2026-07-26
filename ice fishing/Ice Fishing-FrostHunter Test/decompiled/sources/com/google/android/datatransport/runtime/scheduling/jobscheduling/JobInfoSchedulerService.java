package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context.FrostHunterBarcodeScannerEpicNeo6944;
import android.content.Context.FrostHunterDelaySolarEclipse1769;
import android.content.Context.FrostHunterDialogQuantumTurbo8340;
import android.content.Context.FrostHunterMotionSceneInfernoBlaze1856;
import android.content.Context.FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350;
import android.content.Context.FrostHunterRotateAnimationOlympianBlaze7628;
import android.content.Context.FrostHunterTraceHyperionAuroraNebula9947;
import android.util.Base64;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814 = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        FrostHunterRotateAnimationOlympianBlaze7628.FrostHunterConstraintSetCloneMasterUltraRogue2633(getApplicationContext());
        FrostHunterTraceHyperionAuroraNebula9947 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350.FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLooperHyperionForce4133(string);
        FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterKeyframeGammaGamma1197 = FrostHunterMotionSceneInfernoBlaze1856.FrostHunterConstraintSetCloneMasterUltraRogue2633(i);
        if (string2 != null) {
            FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlertDialogAuroraDelta3200 = Base64.decode(string2, 0);
        }
        FrostHunterDelaySolarEclipse1769 frostHunterDelaySolarEclipse1769 = FrostHunterRotateAnimationOlympianBlaze7628.FrostHunterAlphaAnimationNeoCosmos5761().FrostHunterServiceEliteCelestialThunder1757;
        frostHunterDelaySolarEclipse1769.FrostHunterLifecycleBlazeGammaElite2889.execute(new FrostHunterBarcodeScannerEpicNeo6944(frostHunterDelaySolarEclipse1769, FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLevelListDrawableFusionDragonHero2232(), i2, new FrostHunterDialogQuantumTurbo8340(21, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
