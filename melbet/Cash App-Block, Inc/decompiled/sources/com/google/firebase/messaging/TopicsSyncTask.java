package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class TopicsSyncTask implements Runnable {
    public static final Object TOPIC_SYNC_TASK_LOCK = new Object();
    public static Boolean hasAccessNetworkStatePermission;
    public static Boolean hasWakeLockPermission;
    public final Context context;
    public final Metadata metadata;
    public final long nextDelaySeconds;
    public final PowerManager.WakeLock syncWakeLock;
    public final TopicsSubscriber topicsSubscriber;

    public final class ConnectivityChangeReceiver extends BroadcastReceiver {
        public TopicsSyncTask task;

        public ConnectivityChangeReceiver(TopicsSyncTask topicsSyncTask) {
            this.task = topicsSyncTask;
        }

        @Override // android.content.BroadcastReceiver
        public final synchronized void onReceive(Context context, Intent intent) {
            try {
                TopicsSyncTask topicsSyncTask = this.task;
                if (topicsSyncTask == null) {
                    return;
                }
                if (topicsSyncTask.isDeviceConnected()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    TopicsSyncTask topicsSyncTask2 = this.task;
                    topicsSyncTask2.topicsSubscriber.syncExecutor.schedule(topicsSyncTask2, 0L, TimeUnit.SECONDS);
                    context.unregisterReceiver(this);
                    this.task = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public final void registerReceiver() {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            TopicsSyncTask.this.context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    public TopicsSyncTask(TopicsSubscriber topicsSubscriber, Context context, Metadata metadata, long j) {
        this.topicsSubscriber = topicsSubscriber;
        this.context = context;
        this.nextDelaySeconds = j;
        this.metadata = metadata;
        this.syncWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean hasAccessNetworkStatePermission(Context context) {
        boolean booleanValue;
        synchronized (TOPIC_SYNC_TASK_LOCK) {
            try {
                Boolean bool = hasAccessNetworkStatePermission;
                Boolean valueOf = Boolean.valueOf(bool == null ? hasPermission(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                hasAccessNetworkStatePermission = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean hasPermission(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    public static boolean hasWakeLockPermission(Context context) {
        boolean booleanValue;
        synchronized (TOPIC_SYNC_TASK_LOCK) {
            try {
                Boolean bool = hasWakeLockPermission;
                Boolean valueOf = Boolean.valueOf(bool == null ? hasPermission(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                hasWakeLockPermission = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean isDeviceConnected() {
        boolean z;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService("connectivity");
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
        TopicsSubscriber topicsSubscriber = this.topicsSubscriber;
        Context context = this.context;
        boolean hasWakeLockPermission2 = hasWakeLockPermission(context);
        PowerManager.WakeLock wakeLock = this.syncWakeLock;
        if (hasWakeLockPermission2) {
            wakeLock.acquire(180000L);
        }
        try {
            try {
                try {
                    topicsSubscriber.setSyncScheduledOrRunning(true);
                    if (!this.metadata.isGmscorePresent()) {
                        topicsSubscriber.setSyncScheduledOrRunning(false);
                        if (hasWakeLockPermission(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (!hasAccessNetworkStatePermission(context) || isDeviceConnected()) {
                        if (topicsSubscriber.syncTopics()) {
                            topicsSubscriber.setSyncScheduledOrRunning(false);
                        } else {
                            topicsSubscriber.syncWithDelaySecondsInternal(this.nextDelaySeconds);
                        }
                        if (hasWakeLockPermission(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    new ConnectivityChangeReceiver(this).registerReceiver();
                    if (hasWakeLockPermission(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (RuntimeException unused3) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                topicsSubscriber.setSyncScheduledOrRunning(false);
                if (hasWakeLockPermission(context)) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th) {
            if (hasWakeLockPermission(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
