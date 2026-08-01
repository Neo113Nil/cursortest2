package com.google.firebase.messaging;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.google.android.datatransport.WinterFlowCompilerScheduler;
import com.google.android.datatransport.WinterFlowStackProvider;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSyntaxEvent implements Runnable {
    public final PowerManager.WakeLock WinterFlowTransactionManagerStrategy;
    public final FirebaseMessaging WinterFlowUnitTestResponse;
    public final long WinterFlowVariableVersionControl;

    public WinterFlowSyntaxEvent(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new WinterFlowCompilerScheduler("firebase-iid-executor"));
        this.WinterFlowUnitTestResponse = firebaseMessaging;
        this.WinterFlowVariableVersionControl = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.WinterFlowHookDataSource.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.WinterFlowTransactionManagerStrategy = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean WinterFlowHookDataSource() {
        try {
        } catch (IOException e) {
            String message = e.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                e.getMessage();
                return false;
            }
            if (e.getMessage() != null) {
                throw e;
            }
        } catch (SecurityException unused) {
        }
        return this.WinterFlowUnitTestResponse.WinterFlowRouterStructure() != null;
    }

    public final boolean WinterFlowRouterStructure() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.WinterFlowUnitTestResponse.WinterFlowHookDataSource.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock = this.WinterFlowTransactionManagerStrategy;
        WinterFlowStackProvider WinterFlowServerProtocol = WinterFlowStackProvider.WinterFlowServerProtocol();
        FirebaseMessaging firebaseMessaging = this.WinterFlowUnitTestResponse;
        if (WinterFlowServerProtocol.WinterFlowVariableBandwidth(firebaseMessaging.WinterFlowHookDataSource)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.WinterFlowTransactionAgent = true;
                }
                if (!firebaseMessaging.WinterFlowSyntax.WinterFlowVariableVersionControl()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.WinterFlowTransactionAgent = false;
                    }
                    if (WinterFlowStackProvider.WinterFlowServerProtocol().WinterFlowVariableBandwidth(firebaseMessaging.WinterFlowHookDataSource)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (WinterFlowStackProvider.WinterFlowServerProtocol().WinterFlowSingletonPlatform(firebaseMessaging.WinterFlowHookDataSource) && !WinterFlowRouterStructure()) {
                    SyncTask$ConnectivityChangeReceiver syncTask$ConnectivityChangeReceiver = new SyncTask$ConnectivityChangeReceiver();
                    syncTask$ConnectivityChangeReceiver.WinterFlowRouterStructure = this;
                    syncTask$ConnectivityChangeReceiver.WinterFlowRouterStructure();
                    if (WinterFlowStackProvider.WinterFlowServerProtocol().WinterFlowVariableBandwidth(firebaseMessaging.WinterFlowHookDataSource)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (WinterFlowHookDataSource()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.WinterFlowTransactionAgent = false;
                    }
                } else {
                    firebaseMessaging.WinterFlowUnitTestResponse(this.WinterFlowVariableVersionControl);
                }
                if (WinterFlowStackProvider.WinterFlowServerProtocol().WinterFlowVariableBandwidth(firebaseMessaging.WinterFlowHookDataSource)) {
                    wakeLock.release();
                }
            } catch (IOException e) {
                e.getMessage();
                synchronized (firebaseMessaging) {
                    firebaseMessaging.WinterFlowTransactionAgent = false;
                    if (WinterFlowStackProvider.WinterFlowServerProtocol().WinterFlowVariableBandwidth(firebaseMessaging.WinterFlowHookDataSource)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th) {
            if (WinterFlowStackProvider.WinterFlowServerProtocol().WinterFlowVariableBandwidth(firebaseMessaging.WinterFlowHookDataSource)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
