package com.google.firebase.messaging;

import android.content.Context.FrostHunterJobSchedulerPhoenixRogue9514;
import android.content.Context.FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTransitionManagerOmegaNeoMaster3754 implements Runnable {
    public final FirebaseMessaging FrostHunterAlertDialogAuroraDelta3200;
    public final long FrostHunterCameraXPixelTurboCosmos9814;
    public final PowerManager.WakeLock FrostHunterFlowMaxDragonHero5809;

    public FrostHunterTransitionManagerOmegaNeoMaster3754(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new FrostHunterJobSchedulerPhoenixRogue9514("firebase-iid-executor"));
        this.FrostHunterAlertDialogAuroraDelta3200 = firebaseMessaging;
        this.FrostHunterCameraXPixelTurboCosmos9814 = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.FrostHunterConstraintSetCloneMasterUltraRogue2633.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.FrostHunterFlowMaxDragonHero5809 = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean FrostHunterAlphaAnimationNeoCosmos5761() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.FrostHunterAlertDialogAuroraDelta3200.FrostHunterConstraintSetCloneMasterUltraRogue2633.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        try {
            return this.FrostHunterAlertDialogAuroraDelta3200.FrostHunterAlphaAnimationNeoCosmos5761() != null;
        } catch (IOException e) {
            String message = e.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                e.getMessage();
                return false;
            }
            if (e.getMessage() == null) {
                return false;
            }
            throw e;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock = this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 FrostHunterLooperThreadBetaHyperionMax1000 = FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterLooperThreadBetaHyperionMax1000();
        FirebaseMessaging firebaseMessaging = this.FrostHunterAlertDialogAuroraDelta3200;
        if (FrostHunterLooperThreadBetaHyperionMax1000.FrostHunterLooperHyperionForce4133(firebaseMessaging.FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.FrostHunterFlowMaxDragonHero5809 = true;
                }
                if (!firebaseMessaging.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterServiceEliteCelestialThunder1757()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.FrostHunterFlowMaxDragonHero5809 = false;
                    }
                    if (FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterLooperThreadBetaHyperionMax1000().FrostHunterLooperHyperionForce4133(firebaseMessaging.FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterLooperThreadBetaHyperionMax1000().FrostHunterDialogFragmentTurboPhoenixDragon7627(firebaseMessaging.FrostHunterConstraintSetCloneMasterUltraRogue2633) && !FrostHunterAlphaAnimationNeoCosmos5761()) {
                    SyncTask$ConnectivityChangeReceiver syncTask$ConnectivityChangeReceiver = new SyncTask$ConnectivityChangeReceiver();
                    syncTask$ConnectivityChangeReceiver.FrostHunterAlphaAnimationNeoCosmos5761 = this;
                    syncTask$ConnectivityChangeReceiver.FrostHunterAlphaAnimationNeoCosmos5761();
                    if (FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterLooperThreadBetaHyperionMax1000().FrostHunterLooperHyperionForce4133(firebaseMessaging.FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.FrostHunterFlowMaxDragonHero5809 = false;
                    }
                } else {
                    firebaseMessaging.FrostHunterRemoteConfigSpeedSpeed8566(this.FrostHunterCameraXPixelTurboCosmos9814);
                }
                if (FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterLooperThreadBetaHyperionMax1000().FrostHunterLooperHyperionForce4133(firebaseMessaging.FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
                    wakeLock.release();
                }
            } catch (IOException e) {
                e.getMessage();
                synchronized (firebaseMessaging) {
                    firebaseMessaging.FrostHunterFlowMaxDragonHero5809 = false;
                    if (FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterLooperThreadBetaHyperionMax1000().FrostHunterLooperHyperionForce4133(firebaseMessaging.FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th) {
            if (FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterLooperThreadBetaHyperionMax1000().FrostHunterLooperHyperionForce4133(firebaseMessaging.FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
