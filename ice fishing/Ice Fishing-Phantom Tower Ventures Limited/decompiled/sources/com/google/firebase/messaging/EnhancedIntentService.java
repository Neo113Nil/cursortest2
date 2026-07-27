package com.google.firebase.messaging;

import android.app.Service;
import android.content.Context.FrostHunterAccelerometerNovaXEliteOmega1915;
import android.content.Context.FrostHunterBillingClientBetaStormPhoenix2303;
import android.content.Context.FrostHunterGradientDrawablePrimeSpectraUltra1716;
import android.content.Context.FrostHunterIntentBetaElite8730;
import android.content.Context.FrostHunterJobSchedulerPhoenixRogue9514;
import android.content.Context.FrostHunterMagnetometerStrikeSolar7622;
import android.content.Context.FrostHunterRemoteConfigDeltaTitanMaster1902;
import android.content.Context.FrostHunterSQLiteMasterUltra9956;
import android.content.Context.FrostHunterTransitionGammaTitanSpeed7178;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class EnhancedIntentService extends Service {
    public static final /* synthetic */ int FrostHunterServiceConnectionTurboPhoenixOmega6719 = 0;
    public final Object FrostHunterAlertDialogAuroraDelta3200;
    public final ExecutorService FrostHunterCameraXPixelTurboCosmos9814;
    public FrostHunterBillingClientBetaStormPhoenix2303 FrostHunterFlowMaxDragonHero5809;
    public int FrostHunterFragmentBetaMegaVortex6025;
    public int FrostHunterKeyframeGammaGamma1197;

    public EnhancedIntentService() {
        FrostHunterJobSchedulerPhoenixRogue9514 frostHunterJobSchedulerPhoenixRogue9514 = new FrostHunterJobSchedulerPhoenixRogue9514("Firebase-Messaging-Intent-Handle");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), frostHunterJobSchedulerPhoenixRogue9514);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.FrostHunterCameraXPixelTurboCosmos9814 = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.FrostHunterAlertDialogAuroraDelta3200 = new Object();
        this.FrostHunterFragmentBetaMegaVortex6025 = 0;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(Intent intent) {
        if (intent != null) {
            FrostHunterTransitionGammaTitanSpeed7178.FrostHunterCameraXTurboCelestialHero5430(intent);
        }
        synchronized (this.FrostHunterAlertDialogAuroraDelta3200) {
            try {
                int i = this.FrostHunterFragmentBetaMegaVortex6025 - 1;
                this.FrostHunterFragmentBetaMegaVortex6025 = i;
                if (i == 0) {
                    stopSelfResult(this.FrostHunterKeyframeGammaGamma1197);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void FrostHunterBundlePulseFusionHero2475(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (this.FrostHunterFlowMaxDragonHero5809 == null) {
                this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterBillingClientBetaStormPhoenix2303(new FrostHunterSQLiteMasterUltra9956(9, this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.FrostHunterCameraXPixelTurboCosmos9814.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.FrostHunterAlertDialogAuroraDelta3200) {
            this.FrostHunterKeyframeGammaGamma1197 = i2;
            this.FrostHunterFragmentBetaMegaVortex6025++;
        }
        Intent FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterConstraintSetCloneMasterUltraRogue2633(intent);
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633 == null) {
            FrostHunterAlphaAnimationNeoCosmos5761(intent);
            return 2;
        }
        FrostHunterIntentBetaElite8730 frostHunterIntentBetaElite8730 = new FrostHunterIntentBetaElite8730();
        int i3 = 3;
        this.FrostHunterCameraXPixelTurboCosmos9814.execute(new FrostHunterMagnetometerStrikeSolar7622(this, FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterIntentBetaElite8730, i3));
        FrostHunterGradientDrawablePrimeSpectraUltra1716 frostHunterGradientDrawablePrimeSpectraUltra1716 = frostHunterIntentBetaElite8730.FrostHunterAlphaAnimationNeoCosmos5761;
        if (frostHunterGradientDrawablePrimeSpectraUltra1716.FrostHunterRemoteConfigSpeedSpeed8566()) {
            FrostHunterAlphaAnimationNeoCosmos5761(intent);
            return 2;
        }
        frostHunterGradientDrawablePrimeSpectraUltra1716.FrostHunterAlphaAnimationNeoCosmos5761(new FrostHunterRemoteConfigDeltaTitanMaster1902(1), new FrostHunterAccelerometerNovaXEliteOmega1915(i3, this, intent));
        return 3;
    }

    public Intent FrostHunterConstraintSetCloneMasterUltraRogue2633(Intent intent) {
        return intent;
    }
}
