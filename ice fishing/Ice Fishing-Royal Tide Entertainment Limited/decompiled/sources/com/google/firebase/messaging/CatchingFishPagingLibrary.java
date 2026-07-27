package com.google.firebase.messaging;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.text.CatchingFishFluxFluxBundle;
import kotlin.text.CatchingFishMoshiWidgetMVP;

/* loaded from: classes.dex */
public final class CatchingFishPagingLibrary implements Runnable {
    public final PowerManager.WakeLock CatchingFishDaggerWebsocket;
    public final long CatchingFishReduxKtor;
    public final FirebaseMessaging CatchingFishWorkManager;

    public CatchingFishPagingLibrary(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new CatchingFishMoshiWidgetMVP("firebase-iid-executor"));
        this.CatchingFishWorkManager = firebaseMessaging;
        this.CatchingFishReduxKtor = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.CatchingFishSnackbar.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.CatchingFishDaggerWebsocket = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean CatchingFishParcelableFAB() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.CatchingFishWorkManager.CatchingFishSnackbar.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean CatchingFishSnackbar() {
        try {
            return this.CatchingFishWorkManager.CatchingFishParcelableFAB() != null;
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
        PowerManager.WakeLock wakeLock = this.CatchingFishDaggerWebsocket;
        CatchingFishFluxFluxBundle CatchingFishRoomDatabase = CatchingFishFluxFluxBundle.CatchingFishRoomDatabase();
        FirebaseMessaging firebaseMessaging = this.CatchingFishWorkManager;
        if (CatchingFishRoomDatabase.CatchingFishJetpackCompose(firebaseMessaging.CatchingFishSnackbar)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.CatchingFishLayout = true;
                }
                if (!firebaseMessaging.CatchingFishViewModelFAB.CatchingFishReduxKtor()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.CatchingFishLayout = false;
                    }
                    if (CatchingFishFluxFluxBundle.CatchingFishRoomDatabase().CatchingFishJetpackCompose(firebaseMessaging.CatchingFishSnackbar)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (CatchingFishFluxFluxBundle.CatchingFishRoomDatabase().CatchingFish(firebaseMessaging.CatchingFishSnackbar) && !CatchingFishParcelableFAB()) {
                    SyncTask$ConnectivityChangeReceiver syncTask$ConnectivityChangeReceiver = new SyncTask$ConnectivityChangeReceiver();
                    syncTask$ConnectivityChangeReceiver.CatchingFishParcelableFAB = this;
                    syncTask$ConnectivityChangeReceiver.CatchingFishParcelableFAB();
                    if (CatchingFishFluxFluxBundle.CatchingFishRoomDatabase().CatchingFishJetpackCompose(firebaseMessaging.CatchingFishSnackbar)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (CatchingFishSnackbar()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.CatchingFishLayout = false;
                    }
                } else {
                    firebaseMessaging.CatchingFishViewModelScope(this.CatchingFishReduxKtor);
                }
                if (CatchingFishFluxFluxBundle.CatchingFishRoomDatabase().CatchingFishJetpackCompose(firebaseMessaging.CatchingFishSnackbar)) {
                    wakeLock.release();
                }
            } catch (IOException e) {
                e.getMessage();
                synchronized (firebaseMessaging) {
                    firebaseMessaging.CatchingFishLayout = false;
                    if (CatchingFishFluxFluxBundle.CatchingFishRoomDatabase().CatchingFishJetpackCompose(firebaseMessaging.CatchingFishSnackbar)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th) {
            if (CatchingFishFluxFluxBundle.CatchingFishRoomDatabase().CatchingFishJetpackCompose(firebaseMessaging.CatchingFishSnackbar)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
