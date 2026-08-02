package N2;

import R2.w;
import S0.s;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.LD;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l implements ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    public int f1937n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Messenger f1938u;

    /* renamed from: v, reason: collision with root package name */
    public s f1939v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayDeque f1940w;

    /* renamed from: x, reason: collision with root package name */
    public final SparseArray f1941x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f1942y;

    public l(o oVar) {
        this.f1942y = oVar;
        c3.e eVar = new c3.e(Looper.getMainLooper(), new H1.g(2, this), 2);
        Looper.getMainLooper();
        this.f1938u = new Messenger(eVar);
        this.f1940w = new ArrayDeque();
        this.f1941x = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.f1937n;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.f1937n = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f1937n = 4;
            U2.a.a().b((Context) this.f1942y.f1950b, this);
            n nVar = new n(str, securityException);
            Iterator it = this.f1940w.iterator();
            while (it.hasNext()) {
                ((m) it.next()).b(nVar);
            }
            this.f1940w.clear();
            for (int i4 = 0; i4 < this.f1941x.size(); i4++) {
                ((m) this.f1941x.valueAt(i4)).b(nVar);
            }
            this.f1941x.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f1937n == 2 && this.f1940w.isEmpty() && this.f1941x.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f1937n = 3;
                U2.a.a().b((Context) this.f1942y.f1950b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(m mVar) {
        Throwable th;
        int i;
        U2.a a9;
        Context context;
        try {
            try {
                i = this.f1937n;
            } catch (Throwable th2) {
                th = th2;
                th = th;
                throw th;
            }
            try {
                if (i != 0) {
                    if (i == 1) {
                        this.f1940w.add(mVar);
                        return true;
                    }
                    if (i != 2) {
                        return false;
                    }
                    this.f1940w.add(mVar);
                    ((ScheduledExecutorService) this.f1942y.f1951c).execute(new k(this, 0));
                    return true;
                }
                this.f1940w.add(mVar);
                w.k(this.f1937n == 0);
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.f1937n = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    a9 = U2.a.a();
                    context = (Context) this.f1942y.f1950b;
                } catch (SecurityException e9) {
                    e = e9;
                }
                try {
                    if (a9.c(context, context.getClass().getName(), intent, this, 1, null)) {
                        ((ScheduledExecutorService) this.f1942y.f1951c).schedule(new k(this, 1), 30L, TimeUnit.SECONDS);
                    } else {
                        a("Unable to bind to service");
                    }
                } catch (SecurityException e10) {
                    e = e10;
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
        ((ScheduledExecutorService) this.f1942y.f1951c).execute(new LD(13, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f1942y.f1951c).execute(new k(this, 2));
    }
}
