package d8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1781a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f1782b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f1783c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f1784d;

    /* renamed from: e, reason: collision with root package name */
    public f0 f1785e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1786f;

    public h0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new u6.a("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f1784d = new ArrayDeque();
        this.f1786f = false;
        Context applicationContext = context.getApplicationContext();
        this.f1781a = applicationContext;
        this.f1782b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f1783c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f1784d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                f0 f0Var = this.f1785e;
                if (f0Var == null || !f0Var.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f1785e.a((g0) this.f1784d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized g7.o b(Intent intent) {
        g0 g0Var;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            g0Var = new g0(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f1783c;
            g0Var.f1778b.f2537a.a(scheduledThreadPoolExecutor, new c6.f(7, scheduledThreadPoolExecutor.schedule(new a1.a(8, g0Var), 20L, TimeUnit.SECONDS)));
            this.f1784d.add(g0Var);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return g0Var.f1778b.f2537a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[LOOP:0: B:20:0x0053->B:22:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        h0 h0Var;
        ArrayDeque arrayDeque;
        s6.a a6;
        Context context;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f1786f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f1786f) {
            return;
        }
        this.f1786f = true;
        try {
            a6 = s6.a.a();
            context = this.f1781a;
            h0Var = this;
            try {
            } catch (SecurityException e10) {
                e = e10;
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
                h0Var.f1786f = false;
                while (true) {
                    arrayDeque = h0Var.f1784d;
                    if (!arrayDeque.isEmpty()) {
                    }
                    ((g0) arrayDeque.poll()).f1778b.c(null);
                }
            }
        } catch (SecurityException e11) {
            e = e11;
            h0Var = this;
        }
        if (a6.c(context, context.getClass().getName(), this.f1782b, h0Var, 65, null)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        h0Var.f1786f = false;
        while (true) {
            arrayDeque = h0Var.f1784d;
            if (!arrayDeque.isEmpty()) {
                return;
            } else {
                ((g0) arrayDeque.poll()).f1778b.c(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f1786f = false;
            if (iBinder instanceof f0) {
                this.f1785e = (f0) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.f1784d;
            while (!arrayDeque.isEmpty()) {
                ((g0) arrayDeque.poll()).f1778b.c(null);
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
