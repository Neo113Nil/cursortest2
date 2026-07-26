package com.google.firebase.messaging;

import android.content.Context;
import android.content.Context.FrostHunterCamera2PixelSpectraAlpha7690;
import android.content.Context.FrostHunterFirestoreVisionForce1922;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import java.io.IOException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAdapterDelegateNebulaRogue3354 implements Runnable {
    public static Boolean FrostHunterLightSensorForceFusion4241;
    public static Boolean FrostHunterScaleAnimationStrikeSpark5059;
    public static final Object FrostHunterServiceConnectionTurboPhoenixOmega6719 = new Object();
    public final PowerManager.WakeLock FrostHunterAlertDialogAuroraDelta3200;
    public final Context FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterCamera2PixelSpectraAlpha7690 FrostHunterFlowMaxDragonHero5809;
    public final long FrostHunterFragmentBetaMegaVortex6025;
    public final FrostHunterFirestoreVisionForce1922 FrostHunterKeyframeGammaGamma1197;

    public FrostHunterAdapterDelegateNebulaRogue3354(FrostHunterFirestoreVisionForce1922 frostHunterFirestoreVisionForce1922, Context context, FrostHunterCamera2PixelSpectraAlpha7690 frostHunterCamera2PixelSpectraAlpha7690, long j) {
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterFirestoreVisionForce1922;
        this.FrostHunterCameraXPixelTurboCosmos9814 = context;
        this.FrostHunterFragmentBetaMegaVortex6025 = j;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterCamera2PixelSpectraAlpha7690;
        this.FrostHunterAlertDialogAuroraDelta3200 = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean FrostHunterAlphaAnimationNeoCosmos5761(Context context) {
        boolean booleanValue;
        synchronized (FrostHunterServiceConnectionTurboPhoenixOmega6719) {
            try {
                Boolean bool = FrostHunterScaleAnimationStrikeSpark5059;
                booleanValue = bool == null ? bool != null ? bool.booleanValue() : context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 : bool.booleanValue();
                FrostHunterScaleAnimationStrikeSpark5059 = Boolean.valueOf(booleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(Context context) {
        boolean booleanValue;
        synchronized (FrostHunterServiceConnectionTurboPhoenixOmega6719) {
            try {
                Boolean bool = FrostHunterLightSensorForceFusion4241;
                booleanValue = bool == null ? bool != null ? bool.booleanValue() : context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0 : bool.booleanValue();
                FrostHunterLightSensorForceFusion4241 = Boolean.valueOf(booleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean FrostHunterBundlePulseFusionHero2475() {
        boolean z;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.FrostHunterCameraXPixelTurboCosmos9814.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        FrostHunterFirestoreVisionForce1922 frostHunterFirestoreVisionForce1922 = this.FrostHunterKeyframeGammaGamma1197;
        Context context = this.FrostHunterCameraXPixelTurboCosmos9814;
        boolean FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterConstraintSetCloneMasterUltraRogue2633(context);
        PowerManager.WakeLock wakeLock = this.FrostHunterAlertDialogAuroraDelta3200;
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            wakeLock.acquire(180000L);
        }
        try {
            try {
                try {
                    frostHunterFirestoreVisionForce1922.FrostHunterServiceEliteCelestialThunder1757(true);
                    if (!this.FrostHunterFlowMaxDragonHero5809.FrostHunterServiceEliteCelestialThunder1757()) {
                        frostHunterFirestoreVisionForce1922.FrostHunterServiceEliteCelestialThunder1757(false);
                        if (!FrostHunterConstraintSetCloneMasterUltraRogue2633(context)) {
                            return;
                        }
                    } else {
                        if (!FrostHunterAlphaAnimationNeoCosmos5761(context) || FrostHunterBundlePulseFusionHero2475()) {
                            if (frostHunterFirestoreVisionForce1922.FrostHunterLifecycleBlazeGammaElite2889()) {
                                frostHunterFirestoreVisionForce1922.FrostHunterServiceEliteCelestialThunder1757(false);
                            } else {
                                frostHunterFirestoreVisionForce1922.FrostHunterLevelListDrawableFusionDragonHero2232(this.FrostHunterFragmentBetaMegaVortex6025);
                            }
                            if (FrostHunterConstraintSetCloneMasterUltraRogue2633(context)) {
                                wakeLock.release();
                                return;
                            }
                            return;
                        }
                        TopicsSyncTask$ConnectivityChangeReceiver topicsSyncTask$ConnectivityChangeReceiver = new TopicsSyncTask$ConnectivityChangeReceiver();
                        topicsSyncTask$ConnectivityChangeReceiver.FrostHunterAlphaAnimationNeoCosmos5761 = this;
                        context.registerReceiver(topicsSyncTask$ConnectivityChangeReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        if (!FrostHunterConstraintSetCloneMasterUltraRogue2633(context)) {
                            return;
                        }
                    }
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                    }
                } catch (Throwable th) {
                    if (FrostHunterConstraintSetCloneMasterUltraRogue2633(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                e.getMessage();
                frostHunterFirestoreVisionForce1922.FrostHunterServiceEliteCelestialThunder1757(false);
                if (FrostHunterConstraintSetCloneMasterUltraRogue2633(context)) {
                    wakeLock.release();
                }
            }
        } catch (RuntimeException unused3) {
        }
    }
}
