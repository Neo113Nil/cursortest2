package com.google.firebase.messaging;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import java.io.IOException;
import kotlin.text.CatchingFishAdMobToast;
import kotlin.text.CatchingFishBiometricGradle;
import kotlin.text.CatchingFishRoomView;

/* loaded from: classes.dex */
public final class CatchingFishViewPagerToast implements Runnable {
    public static Boolean CatchingFishCloudMessaging;
    public static Boolean CatchingFishFragmentHandler;
    public static final Object CatchingFishLayout = new Object();
    public final CatchingFishAdMobToast CatchingFishDaggerWebsocket;
    public final Context CatchingFishReduxKtor;
    public final long CatchingFishViewModelFAB;
    public final CatchingFishRoomView CatchingFishViewModelScope;
    public final PowerManager.WakeLock CatchingFishWorkManager;

    public CatchingFishViewPagerToast(CatchingFishRoomView catchingFishRoomView, Context context, CatchingFishAdMobToast catchingFishAdMobToast, long j) {
        this.CatchingFishViewModelScope = catchingFishRoomView;
        this.CatchingFishReduxKtor = context;
        this.CatchingFishViewModelFAB = j;
        this.CatchingFishDaggerWebsocket = catchingFishAdMobToast;
        this.CatchingFishWorkManager = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean CatchingFishParcelableFAB(Context context) {
        boolean booleanValue;
        synchronized (CatchingFishLayout) {
            try {
                Boolean bool = CatchingFishCloudMessaging;
                booleanValue = bool == null ? bool != null ? bool.booleanValue() : context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 : bool.booleanValue();
                CatchingFishCloudMessaging = Boolean.valueOf(booleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean CatchingFishSnackbar(Context context) {
        boolean booleanValue;
        synchronized (CatchingFishLayout) {
            try {
                Boolean bool = CatchingFishFragmentHandler;
                booleanValue = bool == null ? bool != null ? bool.booleanValue() : context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0 : bool.booleanValue();
                CatchingFishFragmentHandler = Boolean.valueOf(booleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean CatchingFishCoroutine() {
        boolean z;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.CatchingFishReduxKtor.getSystemService("connectivity");
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
        CatchingFishRoomView catchingFishRoomView = this.CatchingFishViewModelScope;
        Context context = this.CatchingFishReduxKtor;
        boolean CatchingFishSnackbar = CatchingFishSnackbar(context);
        PowerManager.WakeLock wakeLock = this.CatchingFishWorkManager;
        if (CatchingFishSnackbar) {
            wakeLock.acquire(CatchingFishBiometricGradle.CatchingFishParcelableFAB);
        }
        try {
            try {
                try {
                    catchingFishRoomView.CatchingFishReduxKtor(true);
                    if (!this.CatchingFishDaggerWebsocket.CatchingFishReduxKtor()) {
                        catchingFishRoomView.CatchingFishReduxKtor(false);
                        if (CatchingFishSnackbar(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused) {
                                return;
                            }
                        }
                        return;
                    }
                    if (!CatchingFishParcelableFAB(context) || CatchingFishCoroutine()) {
                        if (catchingFishRoomView.CatchingFishDaggerWebsocket()) {
                            catchingFishRoomView.CatchingFishReduxKtor(false);
                        } else {
                            catchingFishRoomView.CatchingFishWorkManager(this.CatchingFishViewModelFAB);
                        }
                        if (CatchingFishSnackbar(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    TopicsSyncTask$ConnectivityChangeReceiver topicsSyncTask$ConnectivityChangeReceiver = new TopicsSyncTask$ConnectivityChangeReceiver();
                    topicsSyncTask$ConnectivityChangeReceiver.CatchingFishParcelableFAB = this;
                    context.registerReceiver(topicsSyncTask$ConnectivityChangeReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    if (CatchingFishSnackbar(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                        }
                    }
                } catch (RuntimeException unused3) {
                }
            } catch (IOException e) {
                e.getMessage();
                catchingFishRoomView.CatchingFishReduxKtor(false);
                if (CatchingFishSnackbar(context)) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th) {
            if (CatchingFishSnackbar(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                }
            }
            throw th;
        }
    }
}
