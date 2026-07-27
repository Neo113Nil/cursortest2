package f4;

import D.RunnableC0281a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: f4.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ServiceConnectionC4510A implements ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    public final Context f37710n;

    /* renamed from: u, reason: collision with root package name */
    public final Intent f37711u;

    /* renamed from: v, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f37712v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayDeque f37713w;

    /* renamed from: x, reason: collision with root package name */
    public y f37714x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f37715y;

    public ServiceConnectionC4510A(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new T2.a("Firebase-FirebaseInstanceIdServiceConnection", 0));
        this.f37713w = new ArrayDeque();
        this.f37715y = false;
        Context applicationContext = context.getApplicationContext();
        this.f37710n = applicationContext;
        this.f37711u = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f37712v = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f37713w.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                y yVar = this.f37714x;
                if (yVar == null || !yVar.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f37714x.a((z) this.f37713w.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized h3.n b(Intent intent) {
        z zVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            zVar = new z(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f37712v;
            zVar.f37807b.f38206a.a(scheduledThreadPoolExecutor, new F3.l(13, scheduledThreadPoolExecutor.schedule(new RunnableC0281a(25, zVar), 20L, TimeUnit.SECONDS)));
            this.f37713w.add(zVar);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return zVar.f37807b.f38206a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[LOOP:0: B:20:0x0053->B:22:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        ServiceConnectionC4510A serviceConnectionC4510A;
        ArrayDeque arrayDeque;
        R2.b a9;
        Context context;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f37715y);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f37715y) {
            return;
        }
        this.f37715y = true;
        try {
            a9 = R2.b.a();
            context = this.f37710n;
            serviceConnectionC4510A = this;
            try {
            } catch (SecurityException e6) {
                e = e6;
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
                serviceConnectionC4510A.f37715y = false;
                while (true) {
                    arrayDeque = serviceConnectionC4510A.f37713w;
                    if (!arrayDeque.isEmpty()) {
                    }
                    ((z) arrayDeque.poll()).f37807b.d(null);
                }
            }
        } catch (SecurityException e9) {
            e = e9;
            serviceConnectionC4510A = this;
        }
        if (a9.c(context, context.getClass().getName(), this.f37711u, serviceConnectionC4510A, 65, null)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        serviceConnectionC4510A.f37715y = false;
        while (true) {
            arrayDeque = serviceConnectionC4510A.f37713w;
            if (!arrayDeque.isEmpty()) {
                return;
            } else {
                ((z) arrayDeque.poll()).f37807b.d(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f37715y = false;
            if (iBinder instanceof y) {
                this.f37714x = (y) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            while (true) {
                ArrayDeque arrayDeque = this.f37713w;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((z) arrayDeque.poll()).f37807b.d(null);
                }
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
        a();
    }
}
