package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class WithinAppServiceConnection implements ServiceConnection {
    public WithinAppServiceBinder binder;
    public boolean connectionInProgress;
    public final Intent connectionIntent;
    public final Context context;
    public final ArrayDeque intentQueue;
    public final ScheduledThreadPoolExecutor scheduledExecutorService;

    public final class BindRequest {
        public final Intent intent;
        public final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();

        public BindRequest(Intent intent) {
            this.intent = intent;
        }
    }

    public WithinAppServiceConnection(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.intentQueue = new ArrayDeque();
        this.connectionInProgress = false;
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.connectionIntent = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.scheduledExecutorService = scheduledThreadPoolExecutor;
    }

    public final synchronized void flushQueue() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.intentQueue.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                WithinAppServiceBinder withinAppServiceBinder = this.binder;
                if (withinAppServiceBinder == null || !withinAppServiceBinder.isBinderAlive()) {
                    startConnectionIfNeeded();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.binder.send((BindRequest) this.intentQueue.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.connectionInProgress = false;
            if (iBinder instanceof WithinAppServiceBinder) {
                this.binder = (WithinAppServiceBinder) iBinder;
                flushQueue();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.intentQueue;
            while (!arrayDeque.isEmpty()) {
                ((BindRequest) arrayDeque.poll()).taskCompletionSource.trySetResult(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        flushQueue();
    }

    public final synchronized zzw sendIntent(Intent intent) {
        BindRequest bindRequest;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            bindRequest = new BindRequest(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.scheduledExecutorService;
            bindRequest.taskCompletionSource.zza.addOnCompleteListener(scheduledThreadPoolExecutor, new MaterialButton$$ExternalSyntheticLambda3(scheduledThreadPoolExecutor.schedule(new KnotView$$ExternalSyntheticLambda1(bindRequest, 12), 20L, TimeUnit.SECONDS), 8));
            this.intentQueue.add(bindRequest);
            flushQueue();
        } catch (Throwable th) {
            throw th;
        }
        return bindRequest.taskCompletionSource.zza;
    }

    public final void startConnectionIfNeeded() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.connectionInProgress);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.connectionInProgress) {
            return;
        }
        this.connectionInProgress = true;
        try {
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e);
        }
        if (ConnectionTracker.getInstance().bindService(this.context, this.connectionIntent, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.connectionInProgress = false;
        while (true) {
            ArrayDeque arrayDeque = this.intentQueue;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((BindRequest) arrayDeque.poll()).taskCompletionSource.trySetResult(null);
            }
        }
    }
}
