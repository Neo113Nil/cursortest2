package l6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import d8.r;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public int f4186a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Messenger f4187b;

    /* renamed from: c, reason: collision with root package name */
    public x4.c f4188c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f4189d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f4190e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f4191f;

    public j(l lVar) {
        this.f4191f = lVar;
        a7.c cVar = new a7.c(Looper.getMainLooper(), new i(0, this));
        Looper.getMainLooper();
        this.f4187b = new Messenger(cVar);
        this.f4189d = new ArrayDeque();
        this.f4190e = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i10 = this.f4186a;
            if (i10 == 0) {
                throw new IllegalStateException();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f4186a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f4186a = 4;
            s6.a.a().b((Context) this.f4191f.f4199b, this);
            r rVar = new r(str, securityException);
            Iterator it = this.f4189d.iterator();
            while (it.hasNext()) {
                ((k) it.next()).b(rVar);
            }
            this.f4189d.clear();
            for (int i11 = 0; i11 < this.f4190e.size(); i11++) {
                ((k) this.f4190e.valueAt(i11)).b(rVar);
            }
            this.f4190e.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f4186a == 2 && this.f4189d.isEmpty() && this.f4190e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f4186a = 3;
                s6.a.a().b((Context) this.f4191f.f4199b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(k kVar) {
        Throwable th;
        int i10;
        s6.a a6;
        Context context;
        try {
            try {
                i10 = this.f4186a;
            } catch (Throwable th2) {
                th = th2;
                th = th;
                throw th;
            }
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        this.f4189d.add(kVar);
                        return true;
                    }
                    if (i10 != 2) {
                        return false;
                    }
                    this.f4189d.add(kVar);
                    ((ScheduledExecutorService) this.f4191f.f4200c).execute(new h(this, 0));
                    return true;
                }
                this.f4189d.add(kVar);
                if (this.f4186a != 0) {
                    throw new IllegalStateException();
                }
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.f4186a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    a6 = s6.a.a();
                    context = (Context) this.f4191f.f4199b;
                } catch (SecurityException e10) {
                    e = e10;
                }
                try {
                    if (a6.c(context, context.getClass().getName(), intent, this, 1, null)) {
                        ((ScheduledExecutorService) this.f4191f.f4200c).schedule(new h(this, 1), 30L, TimeUnit.SECONDS);
                    } else {
                        a("Unable to bind to service");
                    }
                } catch (SecurityException e11) {
                    e = e11;
                    b("Unable to bind to service", e);
                    return true;
                }
                return true;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f4191f.f4200c).execute(new dd.i(10, this, iBinder, false));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f4191f.f4200c).execute(new h(this, 2));
    }
}
