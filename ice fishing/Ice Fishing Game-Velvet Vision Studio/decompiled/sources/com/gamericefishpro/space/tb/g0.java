package com.gamericefishpro.space.tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements ServiceConnection {
    public final Context d;
    public final Intent e;
    public final ScheduledThreadPoolExecutor i;
    public final ArrayDeque v;
    public e0 w;
    public boolean y;

    public g0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new com.gamericefishpro.space.a9.a("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.v = new ArrayDeque();
        this.y = false;
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.e = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.i = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            Log.isLoggable("FirebaseMessaging", 3);
            while (!this.v.isEmpty()) {
                Log.isLoggable("FirebaseMessaging", 3);
                e0 e0Var = this.w;
                if (e0Var == null || !e0Var.isBinderAlive()) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    if (!this.y) {
                        this.y = true;
                        try {
                            if (!com.gamericefishpro.space.y8.a.b().a(this.d, this.e, this, 65)) {
                                Log.e("FirebaseMessaging", "binding to the service failed");
                                this.y = false;
                                ArrayDeque arrayDeque = this.v;
                                while (!arrayDeque.isEmpty()) {
                                    ((f0) arrayDeque.poll()).b.c(null);
                                }
                            }
                        } catch (SecurityException e) {
                            Log.e("FirebaseMessaging", "Exception while binding the service", e);
                        }
                    }
                    return;
                }
                Log.isLoggable("FirebaseMessaging", 3);
                this.w.a((f0) this.v.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized com.gamericefishpro.space.r9.o b(Intent intent) {
        f0 f0Var;
        Log.isLoggable("FirebaseMessaging", 3);
        f0Var = new f0(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.i;
        f0Var.b.a.b(scheduledThreadPoolExecutor, new com.gamericefishpro.space.a8.b(14, scheduledThreadPoolExecutor.schedule(new com.appsflyer.a(20, f0Var), 20L, TimeUnit.SECONDS)));
        this.v.add(f0Var);
        a();
        return f0Var.b.a;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.y = false;
            if (iBinder instanceof e0) {
                this.w = (e0) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.v;
            while (!arrayDeque.isEmpty()) {
                ((f0) arrayDeque.poll()).b.c(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        a();
    }
}
