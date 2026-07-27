package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Context.FrostHunterBarcodeScannerEpicNeo6944;
import android.content.Context.FrostHunterDelaySolarEclipse1769;
import android.content.Context.FrostHunterInputMethodManagerQuantumTurboUltra3294;
import android.content.Context.FrostHunterMotionSceneInfernoBlaze1856;
import android.content.Context.FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350;
import android.content.Context.FrostHunterRotateAnimationOlympianBlaze7628;
import android.content.Context.FrostHunterTraceHyperionAuroraNebula9947;
import android.content.Intent;
import android.util.Base64;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761 = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        FrostHunterRotateAnimationOlympianBlaze7628.FrostHunterConstraintSetCloneMasterUltraRogue2633(context);
        FrostHunterTraceHyperionAuroraNebula9947 FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350.FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterLooperHyperionForce4133(queryParameter);
        FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterKeyframeGammaGamma1197 = FrostHunterMotionSceneInfernoBlaze1856.FrostHunterConstraintSetCloneMasterUltraRogue2633(intValue);
        if (queryParameter2 != null) {
            FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterAlertDialogAuroraDelta3200 = Base64.decode(queryParameter2, 0);
        }
        FrostHunterDelaySolarEclipse1769 frostHunterDelaySolarEclipse1769 = FrostHunterRotateAnimationOlympianBlaze7628.FrostHunterAlphaAnimationNeoCosmos5761().FrostHunterServiceEliteCelestialThunder1757;
        frostHunterDelaySolarEclipse1769.FrostHunterLifecycleBlazeGammaElite2889.execute(new FrostHunterBarcodeScannerEpicNeo6944(frostHunterDelaySolarEclipse1769, FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterLevelListDrawableFusionDragonHero2232(), i, new FrostHunterInputMethodManagerQuantumTurboUltra3294(0)));
    }
}
