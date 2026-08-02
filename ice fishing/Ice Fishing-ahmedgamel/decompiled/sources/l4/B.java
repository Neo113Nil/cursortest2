package l4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class B implements ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    public final Context f38889n;

    /* renamed from: u, reason: collision with root package name */
    public final Intent f38890u;

    /* renamed from: v, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f38891v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayDeque f38892w;

    /* renamed from: x, reason: collision with root package name */
    public z f38893x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f38894y;

    public B(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new W2.a("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f38892w = new ArrayDeque();
        this.f38894y = false;
        Context applicationContext = context.getApplicationContext();
        this.f38889n = applicationContext;
        this.f38890u = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f38891v = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f38892w.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                z zVar = this.f38893x;
                if (zVar == null || !zVar.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f38893x.a((C4674A) this.f38892w.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized l3.m b(Intent intent) {
        C4674A c4674a;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            c4674a = new C4674A(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f38891v;
            c4674a.f38888b.f38870a.a(scheduledThreadPoolExecutor, new J3.l(13, scheduledThreadPoolExecutor.schedule(new A3.p(26, c4674a), 20L, TimeUnit.SECONDS)));
            this.f38892w.add(c4674a);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return c4674a.f38888b.f38870a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[LOOP:0: B:20:0x0053->B:22:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        B b9;
        ArrayDeque arrayDeque;
        U2.a a9;
        Context context;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f38894y);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f38894y) {
            return;
        }
        this.f38894y = true;
        try {
            a9 = U2.a.a();
            context = this.f38889n;
            b9 = this;
            try {
            } catch (SecurityException e9) {
                e = e9;
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
                b9.f38894y = false;
                while (true) {
                    arrayDeque = b9.f38892w;
                    if (!arrayDeque.isEmpty()) {
                    }
                    ((C4674A) arrayDeque.poll()).f38888b.d(null);
                }
            }
        } catch (SecurityException e10) {
            e = e10;
            b9 = this;
        }
        if (a9.c(context, context.getClass().getName(), this.f38890u, b9, 65, null)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        b9.f38894y = false;
        while (true) {
            arrayDeque = b9.f38892w;
            if (!arrayDeque.isEmpty()) {
                return;
            } else {
                ((C4674A) arrayDeque.poll()).f38888b.d(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f38894y = false;
            if (iBinder instanceof z) {
                this.f38893x = (z) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            while (true) {
                ArrayDeque arrayDeque = this.f38892w;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((C4674A) arrayDeque.poll()).f38888b.d(null);
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
