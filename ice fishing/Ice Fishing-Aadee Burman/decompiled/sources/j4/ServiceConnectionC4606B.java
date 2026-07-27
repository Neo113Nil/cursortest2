package j4;

import D.RunnableC0282a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: j4.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ServiceConnectionC4606B implements ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    public final Context f38377n;

    /* renamed from: u, reason: collision with root package name */
    public final Intent f38378u;

    /* renamed from: v, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f38379v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayDeque f38380w;

    /* renamed from: x, reason: collision with root package name */
    public z f38381x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f38382y;

    public ServiceConnectionC4606B(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new U2.a("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f38380w = new ArrayDeque();
        this.f38382y = false;
        Context applicationContext = context.getApplicationContext();
        this.f38377n = applicationContext;
        this.f38378u = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f38379v = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f38380w.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                z zVar = this.f38381x;
                if (zVar == null || !zVar.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f38381x.a((C4605A) this.f38380w.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized j3.m b(Intent intent) {
        C4605A c4605a;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            c4605a = new C4605A(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f38379v;
            c4605a.f38376b.f38358a.a(scheduledThreadPoolExecutor, new H3.l(13, scheduledThreadPoolExecutor.schedule(new RunnableC0282a(25, c4605a), 20L, TimeUnit.SECONDS)));
            this.f38380w.add(c4605a);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return c4605a.f38376b.f38358a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[LOOP:0: B:20:0x0053->B:22:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        ServiceConnectionC4606B serviceConnectionC4606B;
        ArrayDeque arrayDeque;
        S2.a a9;
        Context context;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f38382y);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f38382y) {
            return;
        }
        this.f38382y = true;
        try {
            a9 = S2.a.a();
            context = this.f38377n;
            serviceConnectionC4606B = this;
            try {
            } catch (SecurityException e9) {
                e = e9;
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
                serviceConnectionC4606B.f38382y = false;
                while (true) {
                    arrayDeque = serviceConnectionC4606B.f38380w;
                    if (!arrayDeque.isEmpty()) {
                    }
                    ((C4605A) arrayDeque.poll()).f38376b.d(null);
                }
            }
        } catch (SecurityException e10) {
            e = e10;
            serviceConnectionC4606B = this;
        }
        if (a9.c(context, context.getClass().getName(), this.f38378u, serviceConnectionC4606B, 65, null)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        serviceConnectionC4606B.f38382y = false;
        while (true) {
            arrayDeque = serviceConnectionC4606B.f38380w;
            if (!arrayDeque.isEmpty()) {
                return;
            } else {
                ((C4605A) arrayDeque.poll()).f38376b.d(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f38382y = false;
            if (iBinder instanceof z) {
                this.f38381x = (z) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            while (true) {
                ArrayDeque arrayDeque = this.f38380w;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((C4605A) arrayDeque.poll()).f38376b.d(null);
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
